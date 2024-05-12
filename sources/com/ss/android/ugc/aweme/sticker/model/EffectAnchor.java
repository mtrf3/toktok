package com.ss.android.ugc.aweme.sticker.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EffectAnchor implements Serializable {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("icon")
    public final EffectAnchorIcon icon;

    @InterfaceC65349Pkn("subtitle")
    public final String subtitle;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("url")
    public final String url;

    public static /* synthetic */ EffectAnchor copy$default(EffectAnchor effectAnchor, int i, EffectAnchorIcon effectAnchorIcon, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = effectAnchor.type;
        }
        if ((i2 & 2) != 0) {
            effectAnchorIcon = effectAnchor.icon;
        }
        if ((i2 & 4) != 0) {
            str = effectAnchor.title;
        }
        if ((i2 & 8) != 0) {
            str2 = effectAnchor.subtitle;
        }
        if ((i2 & 16) != 0) {
            str3 = effectAnchor.desc;
        }
        if ((i2 & 32) != 0) {
            str4 = effectAnchor.url;
        }
        if ((i2 & 64) != 0) {
            str5 = effectAnchor.extra;
        }
        return effectAnchor.copy(i, effectAnchorIcon, str, str2, str3, str4, str5);
    }

    public final EffectAnchor copy(int i, EffectAnchorIcon effectAnchorIcon, String str, String str2, String str3, String str4, String str5) {
        return new EffectAnchor(i, effectAnchorIcon, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectAnchor)) {
            return false;
        }
        EffectAnchor effectAnchor = (EffectAnchor) obj;
        return this.type == effectAnchor.type && o.LJ(this.icon, effectAnchor.icon) && o.LJ(this.title, effectAnchor.title) && o.LJ(this.subtitle, effectAnchor.subtitle) && o.LJ(this.desc, effectAnchor.desc) && o.LJ(this.url, effectAnchor.url) && o.LJ(this.extra, effectAnchor.extra);
    }

    public int hashCode() {
        int i = this.type * 31;
        EffectAnchorIcon effectAnchorIcon = this.icon;
        int hashCode = (i + (effectAnchorIcon == null ? 0 : effectAnchorIcon.hashCode())) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extra;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectAnchor(type=");
        LIZ.append(this.type);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final EffectAnchorIcon getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public EffectAnchor(int i, EffectAnchorIcon effectAnchorIcon, String str, String str2, String str3, String str4, String str5) {
        this.type = i;
        this.icon = effectAnchorIcon;
        this.title = str;
        this.subtitle = str2;
        this.desc = str3;
        this.url = str4;
        this.extra = str5;
    }
}
