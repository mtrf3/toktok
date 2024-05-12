package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model;

import X.C49169JRl;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.q;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class LynxSearchHorizontalCardData implements Serializable {
    public static final int $stable = 8;
    public transient CardDate LJLIL;

    @InterfaceC65349Pkn("horizontal_card_name")
    public String cardName;

    @InterfaceC65349Pkn("height")
    public Integer height;

    @InterfaceC65349Pkn("card_data")
    public JavaOnlyMap rawData;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("width")
    public Integer width;

    public final CardDate getCardData() {
        if (this.LJLIL == null) {
            this.LJLIL = (CardDate) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), this.rawData), new C49169JRl().getType());
        }
        return this.LJLIL;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxSearchHorizontalCardData(rawData=");
        LIZ.append(this.rawData);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", cardName=");
        return q.LIZIZ(LIZ, this.cardName, ')', LIZ);
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final JavaOnlyMap getRawData() {
        return this.rawData;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final void setCardData(CardDate cardDate) {
        this.LJLIL = cardDate;
    }

    public final void setCardName(String str) {
        this.cardName = str;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setRawData(JavaOnlyMap javaOnlyMap) {
        this.rawData = javaOnlyMap;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }
}
