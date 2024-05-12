package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.UPJ;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.HotTag;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PopProductResp {
    public final long LIZ;

    @InterfaceC65349Pkn("assistant_switch")
    public final Boolean assistantSwitch;

    @InterfaceC65349Pkn("atmosphere_tags")
    public final List<AtmosphereTag> atmosphereTags;

    @InterfaceC65349Pkn("bag_index")
    public final int bagIndex;

    @InterfaceC65349Pkn("hot_tag")
    public final HotTag hotTag;

    @InterfaceC65349Pkn("live_bag_and_pin_card_type")
    public final int liveBagAndPinCardType;

    @InterfaceC65349Pkn("pin_atmosphere_tags")
    public final List<AtmosphereTag> pinAtmosphereTags;

    @InterfaceC65349Pkn("product")
    public final Product product;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("server_time")
    public final long serverTime;

    @InterfaceC65349Pkn("time_tag")
    public final Map<String, Long> timeTag;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PopProductResp() {
        /*
            r16 = this;
            r1 = 0
            r5 = 0
            r8 = 0
            r14 = 2047(0x7ff, float:2.868E-42)
            r0 = r16
            r2 = r1
            r3 = r1
            r4 = r1
            r7 = r1
            r9 = r1
            r10 = r1
            r11 = r5
            r13 = r8
            r15 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopProductResp)) {
            return false;
        }
        PopProductResp popProductResp = (PopProductResp) obj;
        return o.LJ(this.product, popProductResp.product) && o.LJ(this.hotTag, popProductResp.hotTag) && o.LJ(this.atmosphereTags, popProductResp.atmosphereTags) && o.LJ(this.pinAtmosphereTags, popProductResp.pinAtmosphereTags) && this.serverTime == popProductResp.serverTime && o.LJ(this.schema, popProductResp.schema) && this.bagIndex == popProductResp.bagIndex && o.LJ(this.assistantSwitch, popProductResp.assistantSwitch) && o.LJ(this.timeTag, popProductResp.timeTag) && this.LIZ == popProductResp.LIZ && this.liveBagAndPinCardType == popProductResp.liveBagAndPinCardType;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        Product product = this.product;
        int i = 0;
        if (product == null) {
            hashCode = 0;
        } else {
            hashCode = product.hashCode();
        }
        int i2 = hashCode * 31;
        HotTag hotTag = this.hotTag;
        if (hotTag == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hotTag.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<AtmosphereTag> list = this.atmosphereTags;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<AtmosphereTag> list2 = this.pinAtmosphereTags;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.serverTime, (i4 + hashCode4) * 31, 31);
        String str = this.schema;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i5 = (((LIZJ + hashCode5) * 31) + this.bagIndex) * 31;
        Boolean bool = this.assistantSwitch;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Map<String, Long> map = this.timeTag;
        if (map != null) {
            i = map.hashCode();
        }
        return JBR.LIZJ(this.LIZ, (i6 + i) * 31, 31) + this.liveBagAndPinCardType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopProductResp(product=");
        sb.append(this.product);
        sb.append(", hotTag=");
        sb.append(this.hotTag);
        sb.append(", atmosphereTags=");
        sb.append(this.atmosphereTags);
        sb.append(", pinAtmosphereTags=");
        sb.append(this.pinAtmosphereTags);
        sb.append(", serverTime=");
        sb.append(this.serverTime);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", bagIndex=");
        sb.append(this.bagIndex);
        sb.append(", assistantSwitch=");
        sb.append(this.assistantSwitch);
        sb.append(", timeTag=");
        sb.append(this.timeTag);
        sb.append(", createTimeLocal=");
        sb.append(this.LIZ);
        sb.append(", liveBagAndPinCardType=");
        return UPJ.LIZLLL(sb, this.liveBagAndPinCardType, ')');
    }

    public PopProductResp(Product product, HotTag hotTag, List<AtmosphereTag> list, List<AtmosphereTag> list2, long j, String str, int i, Boolean bool, Map<String, Long> map, long j2, int i2) {
        this.product = product;
        this.hotTag = hotTag;
        this.atmosphereTags = list;
        this.pinAtmosphereTags = list2;
        this.serverTime = j;
        this.schema = str;
        this.bagIndex = i;
        this.assistantSwitch = bool;
        this.timeTag = map;
        this.LIZ = j2;
        this.liveBagAndPinCardType = i2;
    }

    public /* synthetic */ PopProductResp(Product product, HotTag hotTag, List list, List list2, long j, String str, int i, Boolean bool, Map map, long j2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : product, (i3 & 2) != 0 ? null : hotTag, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? null : list2, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? Boolean.FALSE : bool, (i3 & 256) == 0 ? map : null, (i3 & 512) != 0 ? SystemClock.elapsedRealtime() : j2, (i3 & 1024) != 0 ? 1 : i2);
    }
}
