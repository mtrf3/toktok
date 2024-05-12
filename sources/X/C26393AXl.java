package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.AXl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26393AXl extends C249689r2 {
    @Override // X.C249689r2
    public final boolean LIZIZ() {
        C247679nn.LIZ().getClass();
        if (!C249479qh.LJJIIJ()) {
            C247679nn.LIZ().getClass();
            if (!C249479qh.LJJIIJZLJL()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C250209rs
    public final boolean LIZ() {
        Aweme LIZIZ;
        if (IWF.LJJLIIIIJ().isPlaying()) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            String str = null;
            if ((LJIIIIZZ instanceof ActivityC45651qj) && (LIZIZ = LNH.LIZIZ((ActivityC45651qj) LJIIIIZZ)) != null) {
                String aid = LIZIZ.getAid();
                Aweme aweme = C250279rz.LIZ;
                if (aweme != null) {
                    str = aweme.getAid();
                }
                if (!TextUtils.equals(aid, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (((X.InterfaceC54054LJi) r0).uk() != false) goto L45;
     */
    @Override // X.C249689r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = X.AU1.LIZ()
            r3 = 0
            if (r1 != 0) goto L8
            return r3
        L8:
            boolean r0 = r1.isReferralFakeAweme()
            if (r0 == 0) goto Lf
            return r3
        Lf:
            boolean r0 = r1.isAd()
            if (r0 == 0) goto L16
            return r3
        L16:
            int r1 = r1.getAwemeType()
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L1f
            return r3
        L1f:
            com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService r0 = yq4.a.LJIILL()
            boolean r0 = r0.LJIJ()
            r2 = 1
            if (r0 != r2) goto L2b
            return r3
        L2b:
            X.RBW r0 = X.RBW.LJLLI
            boolean r0 = r0.LJI()
            if (r0 != 0) goto L36
            if (r5 == 0) goto L36
            return r3
        L36:
            boolean r0 = X.C26396AXo.LIZIZ()
            if (r0 != 0) goto L92
            boolean r0 = X.C26396AXo.LIZ()
            if (r0 != 0) goto L92
            X.1qj r1 = X.C26397AXp.LIZ()
            boolean r0 = r1 instanceof X.InterfaceC55058LjC
            if (r0 == 0) goto L62
            X.LjC r1 = (X.InterfaceC55058LjC) r1
            androidx.fragment.app.Fragment r0 = r1.getCurFragment()
            boolean r0 = r0 instanceof X.InterfaceC54054LJi
            if (r0 == 0) goto L62
            androidx.fragment.app.Fragment r0 = r1.getCurFragment()
            if (r0 == 0) goto L62
            X.LJi r0 = (X.InterfaceC54054LJi) r0
            boolean r0 = r0.uk()
            if (r0 != 0) goto L92
        L62:
            X.1qj r1 = X.C26397AXp.LIZ()
            boolean r0 = r1 instanceof X.InterfaceC55058LjC
            if (r0 == 0) goto L82
            X.LjC r1 = (X.InterfaceC55058LjC) r1
            androidx.fragment.app.Fragment r0 = r1.getCurFragment()
            boolean r0 = r0 instanceof X.InterfaceC54054LJi
            if (r0 == 0) goto L83
            androidx.fragment.app.Fragment r0 = r1.getCurFragment()
            if (r0 == 0) goto L82
            X.LJi r0 = (X.InterfaceC54054LJi) r0
            boolean r0 = r0.oc()
        L80:
            if (r0 != 0) goto L92
        L82:
            return r3
        L83:
            androidx.fragment.app.Fragment r1 = r1.getCurFragment()
            if (r1 == 0) goto L82
            com.ss.android.ugc.aweme.service.INearbyFeedService r0 = com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl.LJJI()
            boolean r0 = r0.LJ(r1)
            goto L80
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26393AXl.LIZJ(boolean):boolean");
    }
}
