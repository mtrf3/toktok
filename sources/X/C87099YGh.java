package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.YGh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87099YGh extends AbstractC72439Sbr {
    public final /* synthetic */ ViewOnTouchListenerC87097YGf LJLIL;

    public C87099YGh(ViewOnTouchListenerC87097YGf viewOnTouchListenerC87097YGf) {
        this.LJLIL = viewOnTouchListenerC87097YGf;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        if (view == null) {
            return;
        }
        this.LJLIL.setVisibility(8);
        Aweme aweme = this.LJLIL.LJLJL;
        if (aweme == null) {
            return;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
        LIZLLL.LIZJ("popupbadge", "refer");
        LIZLLL.LJI();
        N5U.LIZJ(this.LJLIL.LJLJL, false, "display", null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    @Override // X.InterfaceC70769Rq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(android.net.Uri r6, android.view.View r7, X.C2047581v r8, android.graphics.drawable.Animatable r9) {
        /*
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            X.YGf r0 = r5.LJLIL
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.LJLJL
            r2 = 1
            if (r1 != 0) goto L67
        La:
            r0 = 0
        Lb:
            r3 = 0
            if (r0 == 0) goto L5d
            X.YGf r1 = r5.LJLIL
            boolean r0 = r1.LJLJJLL
            if (r0 == 0) goto L5d
            X.YGg r1 = r1.getStateContext()
            X.YGf r0 = r5.LJLIL
            X.YGv r0 = r0.LJII()
            r1.getClass()
            r1.LIZIZ = r0
            X.YGf r0 = r5.LJLIL
            com.bytedance.lighten.loader.SmartImageView r0 = r0.LJLIL
            java.lang.String r4 = "eggImageView"
            if (r0 == 0) goto L81
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.YGf r0 = r5.LJLIL
            X.YGg r0 = r0.getStateContext()
            X.YGv r0 = r0.LIZIZ
            int r0 = r0.LIZ
            r1.width = r0
            r1.height = r0
            X.YGf r0 = r5.LJLIL
            com.bytedance.lighten.loader.SmartImageView r0 = r0.LJLIL
            if (r0 == 0) goto L7d
            r0.setLayoutParams(r1)
            X.YGf r0 = r5.LJLIL
            X.YGg r0 = r0.getStateContext()
            java.lang.String r1 = "IdleState"
            r0.LIZJ = r1
            java.util.HashMap<java.lang.String, X.YGn> r0 = r0.LJIILJJIL
            java.lang.Object r0 = r0.get(r1)
            X.YGn r0 = (X.AbstractC87105YGn) r0
            if (r0 == 0) goto L5d
            r0.LIZIZ()
        L5d:
            X.YGf r0 = r5.LJLIL
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.LJLJL
            java.lang.String r0 = "display"
            X.N5U.LIZJ(r1, r2, r0, r3, r3)
            return
        L67:
            boolean r0 = r1.isAd()
            if (r0 != 0) goto L6e
            goto La
        L6e:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel r0 = r0.getPlayFunModel()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        L7d:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        L81:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87099YGh.U0(android.net.Uri, android.view.View, X.81v, android.graphics.drawable.Animatable):void");
    }
}
