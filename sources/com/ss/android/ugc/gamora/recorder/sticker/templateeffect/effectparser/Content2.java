package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Content2 {

    @InterfaceC65349Pkn("config")
    public final String config;

    @InterfaceC65349Pkn("path")
    public final String path;

    @InterfaceC65349Pkn("version")
    public final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public Content2() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content2)) {
            return false;
        }
        Content2 content2 = (Content2) obj;
        return o.LJ(this.config, content2.config) && o.LJ(this.path, content2.path) && o.LJ(this.version, content2.version);
    }

    public final int hashCode() {
        String str = this.config;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.path;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.version;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Content2(config=");
        LIZ.append(this.config);
        LIZ.append(", path=");
        LIZ.append(this.path);
        LIZ.append(", version=");
        return q.LIZIZ(LIZ, this.version, ')', LIZ);
    }

    public Content2(String str, String str2, String str3) {
        this.config = str;
        this.path = str2;
        this.version = str3;
    }

    public /* synthetic */ Content2(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
