package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter;
import kotlin.jvm.internal.o;

/* renamed from: X.W0k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81590W0k implements W0Y {
    public final /* synthetic */ ShortVideoContext LIZ;
    public final /* synthetic */ C82622Wbi LIZIZ;

    @Override // X.W0Y
    public final InterfaceC81604W0y LIZ(FrameLayout root) {
        o.LJIIIZ(root, "root");
        W0U LJIIIIZZ = C77876UhM.LJIIIIZZ(this.LIZ);
        C82622Wbi diContainer = this.LIZIZ;
        o.LJIIIZ(diContainer, "diContainer");
        return new DefaultStickerGuidePresenter(LJIIIIZZ, new C81600W0u(diContainer), root);
    }

    public C81590W0k(C82622Wbi c82622Wbi, ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = c82622Wbi;
    }
}
