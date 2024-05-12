package X;

import android.app.Activity;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HSk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44098HSk extends HSS {
    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C44098HSk();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.INDIA_MOVIE.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LIZLLL(SmartImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        LJJJJI(imageView, new AqS154S0200000_7(this, imageView, 70));
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        HSS.LJJIZ(this, eventMapBuilder, 6);
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            IMiniAppService LIZIZ = C38499F9b.LIZ.LIZIZ();
            Activity LIZ = LJIIIZ().LIZ();
            String url = anchorCommonStruct.getUrl();
            LJIIIZ().LJJLJLI();
            LIZIZ.openMiniApp(LIZ, url, new C227898wz());
        }
    }

    @Override // X.HSS
    public final void LJJIJL(AnchorCommonStruct anchor) {
        o.LJIIIZ(anchor, "anchor");
        LJJJJIZL(C44099HSl.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    @Override // X.HSS, X.S1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewGroup r6, android.app.Dialog r7, X.C188727au r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4 = r5.LJLJJL
            if (r4 == 0) goto L5d
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.view.LayoutInflater r3 = X.C16880lQ.LLZIL(r1)
            r2 = 0
            r1 = 2131561133(0x7f0d0aad, float:1.8747658E38)
            r0 = 0
            android.view.View r2 = X.C16880lQ.LLLLIILL(r3, r1, r0, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem"
            kotlin.jvm.internal.o.LJII(r2, r0)
            X.SVp r2 = (X.C72209SVp) r2
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getThumbnail()
            if (r0 == 0) goto L33
            r2.setIcon(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L39
        L33:
            r0 = 2131232518(0x7f080706, float:1.8081148E38)
            r2.setIconRes(r0)
        L39:
            java.lang.String r0 = r4.getKeyword()
            if (r0 != 0) goto L41
            java.lang.String r0 = ""
        L41:
            r2.setTitle(r0)
            java.lang.String r0 = r4.getDescription()
            r2.setSubTitle(r0)
            Y.ACListenerS42S0200000_7 r1 = new Y.ACListenerS42S0200000_7
            r0 = 16
            r1.<init>(r5, r8, r0)
            X.0ga r0 = new X.0ga
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            r6.addView(r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44098HSk.LJIIJ(android.view.ViewGroup, android.app.Dialog, X.7au, int):void");
    }
}
