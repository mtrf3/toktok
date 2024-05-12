package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.guide.TikTokDefaultStickerGuidePresenter;
import java.util.ArrayList;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W0W implements W0Y {
    public final /* synthetic */ ShortVideoContext LIZ;
    public final /* synthetic */ C82622Wbi LIZIZ;

    @Override // X.W0Y
    public final InterfaceC81604W0y LIZ(FrameLayout root) {
        o.LJIIIZ(root, "root");
        ShortVideoContext shortVideoContext = this.LIZ;
        C82622Wbi diContainer = this.LIZIZ;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(diContainer, "diContainer");
        W0X gsonSupplier = W0X.LJLIL;
        o.LJIIIZ(gsonSupplier, "gsonSupplier");
        W0V w0v = new W0V(gsonSupplier, diContainer);
        ((ArrayList) w0v.LIZJ).add(new IDqS432S0100000_7(w0v, shortVideoContext, 9));
        w0v.LJ = new W0O(shortVideoContext);
        C82622Wbi diContainer2 = this.LIZIZ;
        o.LJIIIZ(diContainer2, "diContainer");
        return new TikTokDefaultStickerGuidePresenter(w0v, new C81600W0u(diContainer2), root);
    }

    public W0W(C82622Wbi c82622Wbi, ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = c82622Wbi;
    }
}
