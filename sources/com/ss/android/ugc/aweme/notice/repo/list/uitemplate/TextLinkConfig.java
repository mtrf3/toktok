package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TextLinkConfig {

    @InterfaceC65349Pkn("need_track")
    public final boolean needTrack;

    @InterfaceC65349Pkn("schema_type")
    public final int schemaType;

    @InterfaceC65349Pkn("schema_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final int type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLinkConfig)) {
            return false;
        }
        TextLinkConfig textLinkConfig = (TextLinkConfig) obj;
        return this.type == textLinkConfig.type && o.LJ(this.text, textLinkConfig.text) && o.LJ(this.schemaUrl, textLinkConfig.schemaUrl) && this.schemaType == textLinkConfig.schemaType && this.needTrack == textLinkConfig.needTrack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.type * 31;
        String str = this.text;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schemaUrl;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.schemaType) * 31;
        boolean z = this.needTrack;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextLinkConfig(type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", schemaUrl=");
        LIZ.append(this.schemaUrl);
        LIZ.append(", schemaType=");
        LIZ.append(this.schemaType);
        LIZ.append(", needTrack=");
        return C48339Iy7.LIZJ(LIZ, this.needTrack, ')', LIZ);
    }

    public TextLinkConfig(int i, String str, String str2, int i2, boolean z) {
        this.type = i;
        this.text = str;
        this.schemaUrl = str2;
        this.schemaType = i2;
        this.needTrack = z;
    }

    public /* synthetic */ TextLinkConfig(int i, String str, String str2, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, str, str2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z);
    }
}
