package X;

import com.ss.android.videoshop.controller.VideoController;

/* renamed from: X.YSm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C87416YSm implements InterfaceC47896Iqy {
    public final /* synthetic */ VideoController LJLIL;

    public C87416YSm(VideoController videoController) {
        this.LJLIL = videoController;
    }

    @Override // X.InterfaceC47896Iqy
    public final void LJJIIJZLJL(boolean z) {
        this.LJLIL.onSeekComplete(z);
    }
}
