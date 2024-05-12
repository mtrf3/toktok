package com.ss.android.ugc.aweme.music.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class MusicCollectUiStyleConfig extends F9E {

    @InterfaceC65349Pkn("music_new_collect_dialog")
    public final boolean newMusicCollectDialog;

    @InterfaceC65349Pkn("music_remove_guide_tips")
    public final boolean removeGuideTips;

    @InterfaceC65349Pkn("music_sync_collect_to_ttm")
    public final boolean syncCollectMusicToTtm;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicCollectUiStyleConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ab.MusicCollectUiStyleConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.removeGuideTips), Boolean.valueOf(this.newMusicCollectDialog), Boolean.valueOf(this.syncCollectMusicToTtm)};
    }

    public MusicCollectUiStyleConfig(boolean z, boolean z2, boolean z3) {
        this.removeGuideTips = z;
        this.newMusicCollectDialog = z2;
        this.syncCollectMusicToTtm = z3;
    }

    public /* synthetic */ MusicCollectUiStyleConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
