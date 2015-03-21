'use strict';

/**
 * @ngdoc function
 * @name springTemplateApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the springTemplateApp
 */
angular.module('springTemplateApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
