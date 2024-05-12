package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreateOrderData {

    @InterfaceC65349Pkn("cashier")
    public final m cashier;

    @InterfaceC65349Pkn("combo_id")
    public final String comboId;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("delay_time")
    public final Long delayTime;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("jump_schema_url")
    public final String jumpSchema_url;

    @InterfaceC65349Pkn("miss_cashback")
    public final Boolean missCashback;

    @InterfaceC65349Pkn("new_pay_info")
    public final NewPayInfo newPayInfo;

    @InterfaceC65349Pkn("order_ids")
    public final List<String> orderIds;

    @InterfaceC65349Pkn("tips_text")
    public final String tipsText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderData)) {
            return false;
        }
        CreateOrderData createOrderData = (CreateOrderData) obj;
        return o.LJ(this.orderIds, createOrderData.orderIds) && o.LJ(this.jumpSchema_url, createOrderData.jumpSchema_url) && o.LJ(this.cashier, createOrderData.cashier) && o.LJ(this.exceptionUX, createOrderData.exceptionUX) && o.LJ(this.newPayInfo, createOrderData.newPayInfo) && o.LJ(this.comboId, createOrderData.comboId) && o.LJ(this.missCashback, createOrderData.missCashback) && o.LJ(this.delayTime, createOrderData.delayTime) && o.LJ(this.tipsText, createOrderData.tipsText) && o.LJ(this.daInfo, createOrderData.daInfo);
    }

    public final int hashCode() {
        List<String> list = this.orderIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.jumpSchema_url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        m mVar = this.cashier;
        int hashCode3 = (hashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int hashCode4 = (hashCode3 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        NewPayInfo newPayInfo = this.newPayInfo;
        int hashCode5 = (hashCode4 + (newPayInfo == null ? 0 : newPayInfo.hashCode())) * 31;
        String str2 = this.comboId;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.missCashback;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.delayTime;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.tipsText;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.daInfo;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateOrderData(orderIds=");
        LIZ.append(this.orderIds);
        LIZ.append(", jumpSchema_url=");
        LIZ.append(this.jumpSchema_url);
        LIZ.append(", cashier=");
        LIZ.append(this.cashier);
        LIZ.append(", exceptionUX=");
        LIZ.append(this.exceptionUX);
        LIZ.append(", newPayInfo=");
        LIZ.append(this.newPayInfo);
        LIZ.append(", comboId=");
        LIZ.append(this.comboId);
        LIZ.append(", missCashback=");
        LIZ.append(this.missCashback);
        LIZ.append(", delayTime=");
        LIZ.append(this.delayTime);
        LIZ.append(", tipsText=");
        LIZ.append(this.tipsText);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public CreateOrderData(List<String> list, String str, m mVar, ExceptionUX exceptionUX, NewPayInfo newPayInfo, String str2, Boolean bool, Long l, String str3, String str4) {
        this.orderIds = list;
        this.jumpSchema_url = str;
        this.cashier = mVar;
        this.exceptionUX = exceptionUX;
        this.newPayInfo = newPayInfo;
        this.comboId = str2;
        this.missCashback = bool;
        this.delayTime = l;
        this.tipsText = str3;
        this.daInfo = str4;
    }
}
