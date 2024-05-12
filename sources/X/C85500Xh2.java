package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;

/* renamed from: X.Xh2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85500Xh2 implements InterfaceC47667InH {
    public final /* synthetic */ CreatorCaptionEditActivity LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
        this.LJLIL.LJLLLLLL = false;
    }

    public C85500Xh2(CreatorCaptionEditActivity creatorCaptionEditActivity) {
        this.LJLIL = creatorCaptionEditActivity;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        CreatorCaptionEditActivity creatorCaptionEditActivity = this.LJLIL;
        creatorCaptionEditActivity.LJLLLLLL = true;
        creatorCaptionEditActivity.LLILLJJLI();
    }
}
