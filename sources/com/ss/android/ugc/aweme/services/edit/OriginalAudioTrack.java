package com.ss.android.ugc.aweme.services.edit;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class OriginalAudioTrack extends F9E {

    @InterfaceC65349Pkn("volume")
    public final int volume;

    public static /* synthetic */ OriginalAudioTrack copy$default(OriginalAudioTrack originalAudioTrack, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = originalAudioTrack.volume;
        }
        return originalAudioTrack.copy(i);
    }

    public final OriginalAudioTrack copy(int i) {
        return new OriginalAudioTrack(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.volume)};
    }

    public final int getVolume() {
        return this.volume;
    }

    public OriginalAudioTrack(int i) {
        this.volume = i;
    }
}
