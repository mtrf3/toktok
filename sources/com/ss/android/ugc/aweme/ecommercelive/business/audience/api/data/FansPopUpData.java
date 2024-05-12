package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FansPopUpData {

    @InterfaceC65349Pkn("buttons")
    public List<Button> buttons;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("from_price")
    public String fromPrice;

    @InterfaceC65349Pkn("image")
    public final GImage image;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("to_price")
    public String toPrice;

    @InterfaceC65349Pkn("type")
    public Integer type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FansPopUpData)) {
            return false;
        }
        FansPopUpData fansPopUpData = (FansPopUpData) obj;
        return o.LJ(this.type, fansPopUpData.type) && o.LJ(this.title, fansPopUpData.title) && o.LJ(this.content, fansPopUpData.content) && o.LJ(this.fromPrice, fansPopUpData.fromPrice) && o.LJ(this.toPrice, fansPopUpData.toPrice) && o.LJ(this.buttons, fansPopUpData.buttons) && o.LJ(this.schema, fansPopUpData.schema) && o.LJ(this.image, fansPopUpData.image);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromPrice;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toPrice;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Button> list = this.buttons;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.schema;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        GImage gImage = this.image;
        return hashCode7 + (gImage != null ? gImage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FansPopUpData(type=");
        LIZ.append(this.type);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", fromPrice=");
        LIZ.append(this.fromPrice);
        LIZ.append(", toPrice=");
        LIZ.append(this.toPrice);
        LIZ.append(", buttons=");
        LIZ.append(this.buttons);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FansPopUpData(Integer num, String str, String str2, String str3, String str4, List<Button> list, String str5, GImage gImage) {
        this.type = num;
        this.title = str;
        this.content = str2;
        this.fromPrice = str3;
        this.toPrice = str4;
        this.buttons = list;
        this.schema = str5;
        this.image = gImage;
    }

    public /* synthetic */ FansPopUpData(Integer num, String str, String str2, String str3, String str4, List list, String str5, GImage gImage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) == 0 ? str5 : null, gImage);
    }
}
