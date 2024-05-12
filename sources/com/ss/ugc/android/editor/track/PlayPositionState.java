package com.ss.ugc.android.editor.track;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class PlayPositionState extends F9E {
    public final boolean isSeek;
    public final long position;
    public final boolean seekSyncTrackScroll;

    public static /* synthetic */ PlayPositionState copy$default(PlayPositionState playPositionState, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = playPositionState.position;
        }
        if ((i & 2) != 0) {
            z = playPositionState.isSeek;
        }
        if ((i & 4) != 0) {
            z2 = playPositionState.seekSyncTrackScroll;
        }
        return playPositionState.copy(j, z, z2);
    }

    public final PlayPositionState copy(long j, boolean z, boolean z2) {
        return new PlayPositionState(j, z, z2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.position), Boolean.valueOf(this.isSeek), Boolean.valueOf(this.seekSyncTrackScroll)};
    }

    public final long getPosition() {
        return this.position;
    }

    public final boolean getSeekSyncTrackScroll() {
        return this.seekSyncTrackScroll;
    }

    public final boolean isSeek() {
        return this.isSeek;
    }

    public PlayPositionState(long j, boolean z, boolean z2) {
        this.position = j;
        this.isSeek = z;
        this.seekSyncTrackScroll = z2;
    }

    public /* synthetic */ PlayPositionState(long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
