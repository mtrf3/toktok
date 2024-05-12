package X;

import com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.ui.DynamicSearchMusicFragment;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;

/* renamed from: X.Jjy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50010Jjy implements InterfaceC50046JkY {
    public final /* synthetic */ DynamicSearchMusicFragment LIZ;

    public C50010Jjy(DynamicSearchMusicFragment dynamicSearchMusicFragment) {
        this.LIZ = dynamicSearchMusicFragment;
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC50046JkY
    public final void LIZIZ(boolean z) {
        MusicPlayHelper musicPlayHelper;
        if (!z && (musicPlayHelper = this.LIZ.LLILLJJLI) != null) {
            musicPlayHelper.hv0();
        }
    }
}
