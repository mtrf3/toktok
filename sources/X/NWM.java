package X;

import android.app.Activity;

/* loaded from: classes11.dex */
public final class NWM extends AbstractC59496NWq {
    public final /* synthetic */ NWF LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NWM(Activity activity, NWF nwf) {
        super(activity);
        this.LJLILLLLZI = nwf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (((X.C59501NWv) r6.LJLILLLLZI.LIZ(com.zhiliaoapp.musically.R.id.hx7)).getBehavior().LJIIIIZZ == 4) goto L26;
     */
    @Override // X.GHC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            r2 = 0
            r4 = 4
            if (r7 != r4) goto L6b
            X.NWF r0 = r6.LJLILLLLZI
            boolean r0 = r0.LJIIJJI()
            if (r0 != 0) goto L12
            X.NWF r0 = r6.LJLILLLLZI
            boolean r0 = r0.LJLJL
            if (r0 == 0) goto L6b
        L12:
            X.NWF r0 = r6.LJLILLLLZI
            boolean r0 = r0.LJIIL()
            if (r0 == 0) goto L4d
            X.NWF r0 = r6.LJLILLLLZI
            r5 = 2131373261(0x7f0a2ccd, float:1.8366608E38)
            android.view.View r0 = r0.LIZ(r5)
            X.NWv r0 = (X.C59501NWv) r0
            com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior r1 = r0.getBehavior()
            boolean r0 = r1.LIZJ
            if (r0 == 0) goto L57
            r3 = -1
        L2e:
            X.NWF r0 = r6.LJLILLLLZI
            android.content.Context r1 = r0.getContext()
            r0 = 1115684864(0x42800000, float:64.0)
            float r0 = X.KL2.LIZJ(r1, r0)
            int r0 = (int) r0
            if (r3 != r0) goto L4d
            X.NWF r0 = r6.LJLILLLLZI
            android.view.View r0 = r0.LIZ(r5)
            X.NWv r0 = (X.C59501NWv) r0
            com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior r0 = r0.getBehavior()
            int r0 = r0.LJIIIIZZ
            if (r0 == r4) goto L6b
        L4d:
            X.NWF r0 = r6.LJLILLLLZI
            boolean r0 = r0.LIZIZ(r2)
            r1 = 1
            if (r0 == 0) goto L5a
            return r1
        L57:
            int r3 = r1.LIZIZ
            goto L2e
        L5a:
            X.NWF r0 = r6.LJLILLLLZI
            X.NX0 r0 = r0.getKeyDownCallBack()
            if (r0 == 0) goto L65
            r0.LJIIJ()
        L65:
            X.NWF r0 = r6.LJLILLLLZI
            r0.LIZLLL(r2)
            return r1
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NWM.onKeyDown(int, android.view.KeyEvent):boolean");
    }
}
