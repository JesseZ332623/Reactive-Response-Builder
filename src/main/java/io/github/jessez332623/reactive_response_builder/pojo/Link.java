package io.github.jessez332623.reactive_response_builder.pojo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpMethod;

/** 表示 HATEOAS 元数据中的某一条链接的 POJO。*/
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Link
{
    private String      rel;
    private String      href;
    private HttpMethod  method;
}
