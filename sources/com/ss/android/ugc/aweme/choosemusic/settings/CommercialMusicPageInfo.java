package com.ss.android.ugc.aweme.choosemusic.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommercialMusicPageInfo {

    @InterfaceC65349Pkn("commercial_music_schema")
    public final String commercialMusicSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public CommercialMusicPageInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommercialMusicPageInfo) && o.LJ(this.commercialMusicSchema, ((CommercialMusicPageInfo) obj).commercialMusicSchema);
    }

    public final int hashCode() {
        String str = this.commercialMusicSchema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommercialMusicPageInfo(commercialMusicSchema=");
        return q.LIZIZ(LIZ, this.commercialMusicSchema, ')', LIZ);
    }

    public CommercialMusicPageInfo(String str) {
        this.commercialMusicSchema = str;
    }

    public /* synthetic */ CommercialMusicPageInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
