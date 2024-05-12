package X;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.data.FeedProduct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.S3e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71470S3e implements InterfaceC86379XvD, InterfaceC70422pa {
    public ViewGroup LJLILLLLZI;
    public InterfaceC71472S3g LJLJI;
    public S21 LJLJJI;
    public Animator LJLJJL;
    public InterfaceC71474S3i LJLJL;
    public View.OnClickListener LJLJLJ;
    public C84673XKz LJLJLLL;
    public volatile boolean LJLL;
    public C71469S3d LJLLI;
    public final /* synthetic */ C64962gm LJLIL = C48841JEv.LIZ(EXV.LIZ);
    public int LJLJJLL = 1;

    @Override // X.InterfaceC86379XvD
    public final String LIZIZ() {
        FeedProduct currentProduct;
        S21 s21 = this.LJLJJI;
        if (s21 != null && (currentProduct = s21.getCurrentProduct()) != null) {
            return currentProduct.title;
        }
        return null;
    }

    public final void LIZJ() {
        S21 s21 = this.LJLJJI;
        if (s21 != null) {
            s21.setClickListener(null);
        }
        this.LJLJJI = null;
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        } else {
            o.LJIJI("slot");
            throw null;
        }
    }

    @Override // X.InterfaceC86379XvD
    public final void destroy() {
        C36746EbW.LIZ(4, "EcLiveProductCard destroy");
        if (this.LJLL) {
            C36746EbW.LIZ(4, "has destroyed, repeat useless operation");
            return;
        }
        C71469S3d c71469S3d = this.LJLLI;
        if (c71469S3d != null) {
            c71469S3d.LIZIZ("quit");
        }
        this.LJLL = true;
        this.LJLJL = null;
        C84673XKz c84673XKz = this.LJLJLLL;
        if (c84673XKz != null) {
            c84673XKz.LIZIZ(null);
        }
        this.LJLJLLL = null;
        Animator animator = this.LJLJJL;
        if (animator != null) {
            C16880lQ.LJLJJI(animator);
            animator.cancel();
        }
        this.LJLJJL = null;
        this.LJLJJLL = 1;
        LIZJ();
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL.LJLIL;
    }

    @Override // X.InterfaceC86379XvD
    public final boolean isDestroyed() {
        return this.LJLL;
    }

    @Override // X.InterfaceC86379XvD
    public final void LIZ(LiveRoomStruct liveRoomStruct, Context context, boolean z, java.util.Map map, String str, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showCardIfNeeded roomid = ");
        V1I.LIZJ(LIZ, liveRoomStruct.id, ", showAsBig = ", z);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        C84673XKz c84673XKz = this.LJLJLLL;
        if (c84673XKz == null || c84673XKz.isCancelled()) {
            c84673XKz = C79146V4k.LJIILIIL();
            this.LJLJLLL = c84673XKz;
        }
        XKX.LIZLLL(this, c84673XKz, null, new C71468S3c(this, j, liveRoomStruct, str, map, context, z, null), 2);
    }
}
