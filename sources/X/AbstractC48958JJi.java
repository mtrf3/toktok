package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JJi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48958JJi extends RecyclerView.ViewHolder implements InterfaceC48945JIv, JW1 {
    public final JIB LJLIL;
    public final C49153JQv LJLILLLLZI;
    public final JGU LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;

    @Override // X.InterfaceC48908JHk
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    public abstract ImageView N();

    public abstract C48887JGp Q();

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    public InterfaceC48945JIv P() {
        return (InterfaceC48945JIv) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC48945JIv
    public final C48912JHo LLLIIII() {
        return P().LLLIIII();
    }

    @Override // X.InterfaceC48908JHk
    public void LLLLLJLJLL() {
        P().LLLLLJLJLL();
    }

    @Override // X.InterfaceC49148JQq
    public View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48908JHk
    public final void contextPause() {
        P().contextPause();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return P().isPlaying();
    }

    @Override // X.InterfaceC48908JHk
    public final void onDestroy() {
        P().onDestroy();
    }

    @Override // X.InterfaceC48945JIv
    public final C48881JGj v() {
        return P().v();
    }

    @Override // X.InterfaceC49148JQq
    public void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.JW1
    public final void LJZ(String str) {
        this.LJLJL = str;
    }

    @Override // X.InterfaceC48908JHk
    public void LLLLII(long j) {
        P().LLLLII(j);
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public final void L(View view, JYG jyg, View.OnTouchListener onTouchListener) {
        o.LJIIIZ(view, "view");
        C48959JJj c48959JJj = new C48959JJj(this, view.getContext());
        if (this.LJLJJL) {
            c48959JJj.LJLJLJ = new C48960JJk(this, jyg);
        }
        c48959JJj.LJLJLLL = onTouchListener;
        view.setOnTouchListener(c48959JJj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC48958JJi(View itemView, JIB jib, C49153JQv c49153JQv, JGU mPlayVideoObserver) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(mPlayVideoObserver, "mPlayVideoObserver");
        this.LJLIL = jib;
        this.LJLILLLLZI = c49153JQv;
        this.LJLJI = mPlayVideoObserver;
        this.LJLJJI = C221108m2.LIZIZ(new AqS155S0200000_8(this, itemView, 33));
        itemView.setOutlineProvider(new C43251GyF(itemView.getResources().getDimensionPixelOffset(R.dimen.a6o)));
        itemView.setClipToOutline(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r2 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(com.ss.android.ugc.aweme.feed.model.Aweme r5, X.C164086cG r6, com.ss.android.ugc.aweme.feed.model.Video r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "coverView"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r2 = 0
            if (r7 == 0) goto L5f
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r7.getOriginCover()
            if (r4 == 0) goto L57
            com.ss.android.ugc.aweme.feed.model.Video r0 = r5.getVideo()
            int r0 = r0.getHeight()
            float r1 = (float) r0
            com.ss.android.ugc.aweme.feed.model.Video r0 = r5.getVideo()
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L49
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            int r2 = r3.width
            float r0 = (float) r2
            float r0 = r0 * r1
            int r1 = (int) r0
            r3.width = r2
            r3.height = r1
            r6.setLayoutParams(r3)
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r4)
            X.W5F r0 = X.W5U.LJII(r0)
            r0.LJIIIZ = r2
            r0.LJIIJ = r1
            r0.LJJIIJ = r6
            X.C16880lQ.LLJJJ(r0)
        L48:
            return
        L49:
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r4)
            X.W5F r0 = X.W5U.LJII(r0)
            r0.LJJIIJ = r6
            X.C16880lQ.LLJJJ(r0)
            goto L48
        L57:
            if (r7 == 0) goto L5f
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r7.getCover()
            if (r2 != 0) goto L7f
        L5f:
            java.util.List r0 = r5.getImageInfos()
            if (r0 == 0) goto L7f
            java.util.List r0 = r5.getImageInfos()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L7f
            java.util.List r1 = r5.getImageInfos()
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.feed.model.ImageInfo r0 = (com.ss.android.ugc.aweme.feed.model.ImageInfo) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getLabelThumb()
        L7f:
            X.W5F r0 = X.C40084FoG.LIZLLL(r2, r8)
            r0.LJJIIJ = r6
            r0.LJ()
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48958JJi.M(com.ss.android.ugc.aweme.feed.model.Aweme, X.6cG, com.ss.android.ugc.aweme.feed.model.Video, java.lang.String):void");
    }
}
