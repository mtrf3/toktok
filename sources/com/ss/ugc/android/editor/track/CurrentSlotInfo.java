package com.ss.ugc.android.editor.track;

import X.C16880lQ;
import X.C47135Ieh;
import X.X1D;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CurrentSlotInfo {
    public final int index;
    public final long playTime;
    public final NLETrackSlot slot;

    public static /* synthetic */ CurrentSlotInfo copy$default(CurrentSlotInfo currentSlotInfo, int i, NLETrackSlot nLETrackSlot, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = currentSlotInfo.index;
        }
        if ((i2 & 2) != 0) {
            nLETrackSlot = currentSlotInfo.slot;
        }
        if ((i2 & 4) != 0) {
            j = currentSlotInfo.playTime;
        }
        return currentSlotInfo.copy(i, nLETrackSlot, j);
    }

    public final CurrentSlotInfo copy(int i, NLETrackSlot nLETrackSlot, long j) {
        return new CurrentSlotInfo(i, nLETrackSlot, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentSlotInfo)) {
            return false;
        }
        CurrentSlotInfo currentSlotInfo = (CurrentSlotInfo) obj;
        return this.index == currentSlotInfo.index && o.LJ(this.slot, currentSlotInfo.slot) && this.playTime == currentSlotInfo.playTime;
    }

    public int hashCode() {
        int i = this.index * 31;
        NLETrackSlot nLETrackSlot = this.slot;
        return C16880lQ.LLJIJIL(this.playTime) + ((i + (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CurrentSlotInfo(index=");
        LIZ.append(this.index);
        LIZ.append(", slot=");
        LIZ.append(this.slot);
        LIZ.append(", playTime=");
        return C47135Ieh.LIZIZ(LIZ, this.playTime, ')', LIZ);
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getPlayTime() {
        return this.playTime;
    }

    public final NLETrackSlot getSlot() {
        return this.slot;
    }

    public CurrentSlotInfo(int i, NLETrackSlot nLETrackSlot, long j) {
        this.index = i;
        this.slot = nLETrackSlot;
        this.playTime = j;
    }
}
