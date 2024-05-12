package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C74987Tbr;
import X.C75235Tfr;
import X.C75277TgX;
import X.C75283Tgd;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes14.dex */
public class AqS9S1210000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS9S1210000_13 aqS9S1210000_13, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        boolean z = true;
        if (aqS9S1210000_13.z3) {
            ((MultiGuestSharedBgGuestViewModel) aqS9S1210000_13.l1).getClass();
            if (!C75283Tgd.LJ()) {
                z = false;
            }
        }
        String str = aqS9S1210000_13.s0;
        LiveEffect liveEffect = (LiveEffect) aqS9S1210000_13.l2;
        return new C75235Tfr(z, str, liveEffect.shareImageUrl, liveEffect.shareImagePath);
    }

    public static final Object invoke$1(AqS9S1210000_13 aqS9S1210000_13, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        if (o.LJ(((MultiGuestSharedBgGuestViewModel) aqS9S1210000_13.l1).LJLILLLLZI, ((LiveEffect) aqS9S1210000_13.l2).getResourceId())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("apply shared bg, download image success, sharedBgUrl = ");
            LIZ.append(((LiveEffect) aqS9S1210000_13.l2).shareImageUrl);
            C74987Tbr.LIZJ("guest_shared_bg", X1D.LIZIZ(LIZ));
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) aqS9S1210000_13.l1;
            multiGuestSharedBgGuestViewModel.setState(new C75277TgX(aqS9S1210000_13.z3, multiGuestSharedBgGuestViewModel, aqS9S1210000_13.s0, (LiveEffect) aqS9S1210000_13.l2, downloadInfo));
            ((MultiGuestSharedBgGuestViewModel) aqS9S1210000_13.l1).LJLILLLLZI = null;
        } else {
            C74987Tbr.LIZJ("guest_shared_bg", "apply shared bg, abort because effect changed");
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS9S1210000_13(com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel r3, com.bytedance.android.livesdkapi.depend.model.LiveEffect r4, java.lang.String r5, boolean r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.z3 = r6
            r1.s0 = r5
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.z3 = r6
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS9S1210000_13.<init>(com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, boolean, int):void");
    }
}
