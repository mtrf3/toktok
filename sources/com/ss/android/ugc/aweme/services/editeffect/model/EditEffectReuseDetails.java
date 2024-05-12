package com.ss.android.ugc.aweme.services.editeffect.model;

import X.F9E;

/* loaded from: classes3.dex */
public final class EditEffectReuseDetails extends F9E {
    public final long endTime;
    public final long startTime;

    public static /* synthetic */ EditEffectReuseDetails copy$default(EditEffectReuseDetails editEffectReuseDetails, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = editEffectReuseDetails.startTime;
        }
        if ((i & 2) != 0) {
            j2 = editEffectReuseDetails.endTime;
        }
        return editEffectReuseDetails.copy(j, j2);
    }

    public final EditEffectReuseDetails copy(long j, long j2) {
        return new EditEffectReuseDetails(j, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.startTime), Long.valueOf(this.endTime)};
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public EditEffectReuseDetails(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }
}
