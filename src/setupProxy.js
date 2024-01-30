const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function (app) {
  app.use(
    '/api',
    createProxyMiddleware({
      target: 'https://ed71-2409-408d-4e91-b427-8467-6c15-c723-2acf.ngrok-free.app/api/v1/movies',  // Replace with your Ngrok URL
      changeOrigin: true,
    })
  );
};