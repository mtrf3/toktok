package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.TjD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75443TjD extends AnimatorListenerAdapter {
    public final /* synthetic */ C2A4 LJLIL;
    public final /* synthetic */ C47061t0 LJLILLLLZI;
    public final /* synthetic */ C75525TkX LJLJI;
    public final /* synthetic */ C75526TkY LJLJJI;
    public final /* synthetic */ EnumC75445TjF LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C87277YNd.LJJIJ(this.LJLIL);
        C87277YNd.LJJIJ(this.LJLILLLLZI);
        C2A4 c2a4 = this.LJLJI.LJLJL;
        if (c2a4 != null) {
            C87277YNd.LJJIIZ(c2a4);
        }
        C75525TkX c75525TkX = this.LJLJI;
        C2A4 draweeView = this.LJLIL;
        C75526TkY webpListener = this.LJLJJI;
        EnumC75445TjF enumC75445TjF = this.LJLJJL;
        c75525TkX.getClass();
        if (enumC75445TjF == EnumC75445TjF.FRIEND_LIVING) {
            i = 4;
        } else {
            i = 1;
        }
        C15540jG c15540jG = c75525TkX.LL;
        if (c15540jG != null) {
            o.LJIIIZ(draweeView, "draweeView");
            c15540jG.LIZ = draweeView;
            c15540jG.LIZIZ = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1");
            c15540jG.LIZJ = "interact_request_enhanced.webp";
            c15540jG.LJFF = true;
            c15540jG.LJI = i;
            c15540jG.LJIIJ = true;
            o.LJIIIZ(webpListener, "webpListener");
            c15540jG.LJ = webpListener;
            c15540jG.LIZIZ();
            return;
        }
        o.LJIJI("geckoWebpController");
        throw null;
    }

    public C75443TjD(C2A4 c2a4, C47061t0 c47061t0, C75525TkX c75525TkX, C75526TkY c75526TkY, EnumC75445TjF enumC75445TjF) {
        this.LJLIL = c2a4;
        this.LJLILLLLZI = c47061t0;
        this.LJLJI = c75525TkX;
        this.LJLJJI = c75526TkY;
        this.LJLJJL = enumC75445TjF;
    }
}
