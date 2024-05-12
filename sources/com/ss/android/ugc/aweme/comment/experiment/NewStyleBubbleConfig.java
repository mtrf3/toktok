package com.ss.android.ugc.aweme.comment.experiment;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NewStyleBubbleConfig {

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("subtype")
    public String subtype;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Multi-variable type inference failed */
    public NewStyleBubbleConfig() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewStyleBubbleConfig)) {
            return false;
        }
        NewStyleBubbleConfig newStyleBubbleConfig = (NewStyleBubbleConfig) obj;
        return this.type == newStyleBubbleConfig.type && o.LJ(this.subtype, newStyleBubbleConfig.subtype) && o.LJ(this.icon, newStyleBubbleConfig.icon);
    }

    public final int hashCode() {
        int i = this.type * 31;
        String str = this.subtype;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.icon;
        return hashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewStyleBubbleConfig(type=");
        LIZ.append(this.type);
        LIZ.append(", subtype=");
        LIZ.append(this.subtype);
        LIZ.append(", icon=");
        return C31461Li.LIZLLL(LIZ, this.icon, ')', LIZ);
    }

    public NewStyleBubbleConfig(int i, String str, UrlModel urlModel) {
        this.type = i;
        this.subtype = str;
        this.icon = urlModel;
    }

    public /* synthetic */ NewStyleBubbleConfig(int i, String str, UrlModel urlModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : urlModel);
    }
}
