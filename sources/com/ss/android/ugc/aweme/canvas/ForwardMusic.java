package com.ss.android.ugc.aweme.canvas;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ForwardMusic implements Serializable {

    @InterfaceC65349Pkn("musicId")
    public final String musicId;

    /* JADX WARN: Multi-variable type inference failed */
    public ForwardMusic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ForwardMusic copy$default(ForwardMusic forwardMusic, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forwardMusic.musicId;
        }
        return forwardMusic.copy(str);
    }

    public final ForwardMusic copy(String str) {
        return new ForwardMusic(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForwardMusic) && o.LJ(this.musicId, ((ForwardMusic) obj).musicId);
    }

    public int hashCode() {
        String str = this.musicId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForwardMusic(musicId=");
        return q.LIZIZ(LIZ, this.musicId, ')', LIZ);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public ForwardMusic(String str) {
        this.musicId = str;
    }

    public /* synthetic */ ForwardMusic(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
