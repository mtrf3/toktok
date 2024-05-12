package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicTabInfo implements Serializable {

    @InterfaceC65349Pkn("claim_info")
    public MusicTabClaimInfo musicTabClaimInfo;

    @InterfaceC65349Pkn("show_ghost_music_tab")
    public boolean showGhostMusicTab;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicTabInfo() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicTabInfo copy$default(MusicTabInfo musicTabInfo, boolean z, MusicTabClaimInfo musicTabClaimInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = musicTabInfo.showGhostMusicTab;
        }
        if ((i & 2) != 0) {
            musicTabClaimInfo = musicTabInfo.musicTabClaimInfo;
        }
        return musicTabInfo.copy(z, musicTabClaimInfo);
    }

    public final MusicTabInfo copy(boolean z, MusicTabClaimInfo musicTabClaimInfo) {
        return new MusicTabInfo(z, musicTabClaimInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicTabInfo)) {
            return false;
        }
        MusicTabInfo musicTabInfo = (MusicTabInfo) obj;
        return this.showGhostMusicTab == musicTabInfo.showGhostMusicTab && o.LJ(this.musicTabClaimInfo, musicTabInfo.musicTabClaimInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.showGhostMusicTab;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        MusicTabClaimInfo musicTabClaimInfo = this.musicTabClaimInfo;
        return i + (musicTabClaimInfo == null ? 0 : musicTabClaimInfo.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicTabInfo(showGhostMusicTab=");
        LIZ.append(this.showGhostMusicTab);
        LIZ.append(", musicTabClaimInfo=");
        LIZ.append(this.musicTabClaimInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final MusicTabClaimInfo getMusicTabClaimInfo() {
        return this.musicTabClaimInfo;
    }

    public final boolean getShowGhostMusicTab() {
        return this.showGhostMusicTab;
    }

    public final void setMusicTabClaimInfo(MusicTabClaimInfo musicTabClaimInfo) {
        this.musicTabClaimInfo = musicTabClaimInfo;
    }

    public final void setShowGhostMusicTab(boolean z) {
        this.showGhostMusicTab = z;
    }

    public MusicTabInfo(boolean z, MusicTabClaimInfo musicTabClaimInfo) {
        this.showGhostMusicTab = z;
        this.musicTabClaimInfo = musicTabClaimInfo;
    }

    public /* synthetic */ MusicTabInfo(boolean z, MusicTabClaimInfo musicTabClaimInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : musicTabClaimInfo);
    }
}
