'use strict';

/**
 * @ngdoc function
 * @name springTemplateApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the springTemplateApp
 */
angular.module('springTemplateApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
