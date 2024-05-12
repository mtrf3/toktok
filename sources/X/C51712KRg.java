package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity;

/* renamed from: X.KRg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51712KRg implements InterfaceC47667InH {
    public final /* synthetic */ ShoutoutsPlayActivity LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
        this.LJLIL.LJLJJLL = false;
    }

    public C51712KRg(ShoutoutsPlayActivity shoutoutsPlayActivity) {
        this.LJLIL = shoutoutsPlayActivity;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        ShoutoutsPlayActivity shoutoutsPlayActivity = this.LJLIL;
        shoutoutsPlayActivity.LJLJJLL = true;
        shoutoutsPlayActivity.LLIIIJ();
    }
}
