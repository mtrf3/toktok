package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter;
import kotlin.jvm.internal.o;

/* renamed from: X.W0l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81591W0l implements W0Y {
    public final /* synthetic */ ShortVideoContext LIZ;

    public C81591W0l(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.W0Y
    public final InterfaceC81604W0y LIZ(FrameLayout root) {
        o.LJIIIZ(root, "root");
        return new DefaultStickerGuidePresenter(C77876UhM.LJIIIIZZ(this.LIZ), new C81595W0p(), root);
    }
}
