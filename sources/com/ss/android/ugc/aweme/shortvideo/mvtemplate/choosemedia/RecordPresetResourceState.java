package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordPresetResourceState implements InterfaceC61312at {
    public final AVMusic avMusic;
    public final String musicFile;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordPresetResourceState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecordPresetResourceState copy$default(RecordPresetResourceState recordPresetResourceState, AVMusic aVMusic, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            aVMusic = recordPresetResourceState.avMusic;
        }
        if ((i & 2) != 0) {
            str = recordPresetResourceState.musicFile;
        }
        return recordPresetResourceState.copy(aVMusic, str);
    }

    public final RecordPresetResourceState copy(AVMusic aVMusic, String str) {
        return new RecordPresetResourceState(aVMusic, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordPresetResourceState)) {
            return false;
        }
        RecordPresetResourceState recordPresetResourceState = (RecordPresetResourceState) obj;
        return o.LJ(this.avMusic, recordPresetResourceState.avMusic) && o.LJ(this.musicFile, recordPresetResourceState.musicFile);
    }

    public int hashCode() {
        AVMusic aVMusic = this.avMusic;
        int hashCode = (aVMusic == null ? 0 : aVMusic.hashCode()) * 31;
        String str = this.musicFile;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordPresetResourceState(avMusic=");
        LIZ.append(this.avMusic);
        LIZ.append(", musicFile=");
        return q.LIZIZ(LIZ, this.musicFile, ')', LIZ);
    }

    public final AVMusic getAvMusic() {
        return this.avMusic;
    }

    public final String getMusicFile() {
        return this.musicFile;
    }

    public RecordPresetResourceState(AVMusic aVMusic, String str) {
        this.avMusic = aVMusic;
        this.musicFile = str;
    }

    public /* synthetic */ RecordPresetResourceState(AVMusic aVMusic, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVMusic, (i & 2) != 0 ? null : str);
    }
}
