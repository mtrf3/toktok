package com.ss.android.ugc.aweme.sticker.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EffectAttribution implements Serializable {

    @InterfaceC65349Pkn("author")
    public final String author;

    @InterfaceC65349Pkn("creator")
    public final String creator;

    @InterfaceC65349Pkn("license")
    public final String license;

    @InterfaceC65349Pkn("title")
    public final String name;

    public static /* synthetic */ EffectAttribution copy$default(EffectAttribution effectAttribution, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = effectAttribution.name;
        }
        if ((i & 2) != 0) {
            str2 = effectAttribution.creator;
        }
        if ((i & 4) != 0) {
            str3 = effectAttribution.author;
        }
        if ((i & 8) != 0) {
            str4 = effectAttribution.license;
        }
        return effectAttribution.copy(str, str2, str3, str4);
    }

    public final EffectAttribution copy(String str, String str2, String str3, String str4) {
        return new EffectAttribution(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectAttribution)) {
            return false;
        }
        EffectAttribution effectAttribution = (EffectAttribution) obj;
        return o.LJ(this.name, effectAttribution.name) && o.LJ(this.creator, effectAttribution.creator) && o.LJ(this.author, effectAttribution.author) && o.LJ(this.license, effectAttribution.license);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.creator;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.author;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.license;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectAttribution(name=");
        LIZ.append(this.name);
        LIZ.append(", creator=");
        LIZ.append(this.creator);
        LIZ.append(", author=");
        LIZ.append(this.author);
        LIZ.append(", license=");
        return q.LIZIZ(LIZ, this.license, ')', LIZ);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getCreator() {
        return this.creator;
    }

    public final String getLicense() {
        return this.license;
    }

    public final String getName() {
        return this.name;
    }

    public EffectAttribution(String str, String str2, String str3, String str4) {
        this.name = str;
        this.creator = str2;
        this.author = str3;
        this.license = str4;
    }
}
