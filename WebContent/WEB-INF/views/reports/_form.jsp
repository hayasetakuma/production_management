<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<label for="product_name">製品名</label><br />
<input type="text" name="product_name" id="product_name" value="${report.product_name}" />
<br /><br />

<label for="product_number">良品生産数</label><br />
<input type="text" name="product_number" id="product_number" value="${report.product_number}" />
<br /><br />

<label for="defective_product">不良品生産数</label><br />
<input type="text" name="defective_product" id="defective_product" value="${report.defective_product}" />
<br /><br />

<input type="hidden" name="_token" value="${_token}" />
<button type="submit">入力</button>