package com.ss.android.ugc.aweme.multi.maker;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SoundSyncSchema {

    @InterfaceC65349Pkn("sound_sync_clip_durations")
    public final ArrayList<Float> clipDurations;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoundSyncSchema)) {
            return false;
        }
        SoundSyncSchema soundSyncSchema = (SoundSyncSchema) obj;
        return o.LJ(this.clipDurations, soundSyncSchema.clipDurations) && o.LJ(this.iconUrl, soundSyncSchema.iconUrl);
    }

    public final int hashCode() {
        ArrayList<Float> arrayList = this.clipDurations;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.iconUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SoundSyncSchema(clipDurations=");
        LIZ.append(this.clipDurations);
        LIZ.append(", iconUrl=");
        return q.LIZIZ(LIZ, this.iconUrl, ')', LIZ);
    }

    public SoundSyncSchema(ArrayList<Float> arrayList, String str) {
        this.clipDurations = arrayList;
        this.iconUrl = str;
    }
}
