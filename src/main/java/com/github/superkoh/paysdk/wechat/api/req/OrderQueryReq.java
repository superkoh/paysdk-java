package com.github.superkoh.paysdk.wechat.api.req;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.github.superkoh.paysdk.wechat.common.BasePayReq;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
public class OrderQueryReq extends BasePayReq {

  @JacksonXmlCData
  private String transactionId;
  @JacksonXmlCData
  private String outTradeNo;
}