package com.ss.ugc.android.editor.core.publicUtils;

import X.F9E;
import java.math.BigInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class KeyframeInfo extends F9E {
    public final String filterType;
    public final BigInteger slotId;
    public final BigInteger trackId;

    public static /* synthetic */ KeyframeInfo copy$default(KeyframeInfo keyframeInfo, BigInteger bigInteger, BigInteger bigInteger2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigInteger = keyframeInfo.slotId;
        }
        if ((i & 2) != 0) {
            bigInteger2 = keyframeInfo.trackId;
        }
        if ((i & 4) != 0) {
            str = keyframeInfo.filterType;
        }
        return keyframeInfo.copy(bigInteger, bigInteger2, str);
    }

    public final KeyframeInfo copy(BigInteger slotId, BigInteger trackId, String filterType) {
        o.LJIIIZ(slotId, "slotId");
        o.LJIIIZ(trackId, "trackId");
        o.LJIIIZ(filterType, "filterType");
        return new KeyframeInfo(slotId, trackId, filterType);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.slotId, this.trackId, this.filterType};
    }

    public final String getFilterType() {
        return this.filterType;
    }

    public final BigInteger getSlotId() {
        return this.slotId;
    }

    public final BigInteger getTrackId() {
        return this.trackId;
    }

    public KeyframeInfo(BigInteger slotId, BigInteger trackId, String filterType) {
        o.LJIIIZ(slotId, "slotId");
        o.LJIIIZ(trackId, "trackId");
        o.LJIIIZ(filterType, "filterType");
        this.slotId = slotId;
        this.trackId = trackId;
        this.filterType = filterType;
    }
}
