function Hello($scope, $http) {
    $http.get('https://localhost:8443/').
        success(function(data) {
            $scope.greeting = data;
        });
}
