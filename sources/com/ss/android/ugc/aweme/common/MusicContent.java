package com.ss.android.ugc.aweme.common;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicContent implements Serializable {

    @InterfaceC65349Pkn("music_id")
    public final String musicId;

    @InterfaceC65349Pkn("music_start_time")
    public final int musicStartTime;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicContent() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicContent copy$default(MusicContent musicContent, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = musicContent.musicId;
        }
        if ((i2 & 2) != 0) {
            i = musicContent.musicStartTime;
        }
        return musicContent.copy(str, i);
    }

    public final MusicContent copy(String str, int i) {
        return new MusicContent(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicContent)) {
            return false;
        }
        MusicContent musicContent = (MusicContent) obj;
        return o.LJ(this.musicId, musicContent.musicId) && this.musicStartTime == musicContent.musicStartTime;
    }

    public int hashCode() {
        String str = this.musicId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.musicStartTime;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicContent(musicId=");
        LIZ.append(this.musicId);
        LIZ.append(", musicStartTime=");
        return b0.LIZJ(LIZ, this.musicStartTime, ')', LIZ);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getMusicStartTime() {
        return this.musicStartTime;
    }

    public MusicContent(String str, int i) {
        this.musicId = str;
        this.musicStartTime = i;
    }

    public /* synthetic */ MusicContent(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
