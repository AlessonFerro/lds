dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
    //dialect = "org.hibernate.dialect.MySQLMyISAMDialect"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost/ldsprod?useUnicode=yes&characterEncoding=UTF-8"
            username = "lds"
            password = "123456"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/ldsprod?useUnicode=yes&characterEncoding=UTF-8"
            username = "lds"
            password = "123456"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/ldsprod?useUnicode=yes&characterEncoding=UTF-8"
            username = "lds"
            password = "123456"
        }
    }
}
