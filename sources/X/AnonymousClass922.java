package X;

import Y.ACListenerS36S0200000_1;
import Y.ARunnableS15S0300000_4;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.922, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass922 {
    public static Runnable LIZ;
    public static final Resources LIZIZ = EF7.LIZIZ().getResources();
    public static final RunnableC55733Lu5 LIZJ = RunnableC55733Lu5.LJLIL;

    public static final boolean LIZ(Aweme aweme) {
        boolean z;
        boolean z2;
        AwemeStatus status;
        o.LJIIIZ(aweme, "aweme");
        ((RBX) HG3.LJIILL()).isMe(aweme.getAuthorUid());
        boolean LJFF = C80S.LJFF(aweme);
        if (aweme.isProhibited() || aweme.isDelete() || (aweme.isSelfSee() && aweme.isReviewed())) {
            z = true;
        } else {
            z = false;
        }
        boolean LJLJLLL = C63081OpJ.LJLJLLL(aweme);
        boolean z3 = !aweme.getAwemeControl().canShare();
        boolean LJJLIIIJLJLI = C63081OpJ.LJJLIIIJLJLI(aweme);
        if (aweme.isAd() && (status = aweme.getStatus()) != null && !status.isAllowShare()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!LJFF && !z && !LJLJLLL && !z3 && !LJJLIIIJLJLI && !z2) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(IMContact iMContact) {
        if (iMContact == null) {
            return "";
        }
        if (!(iMContact instanceof IMUser)) {
            String displayName = iMContact.getDisplayName();
            if (displayName == null) {
                return "";
            }
            return displayName;
        }
        String displayName2 = iMContact.getDisplayName();
        if (displayName2 == null) {
            return "";
        }
        return displayName2;
    }

    public static void LIZJ(long j) {
        Handler LIZ2 = C37179EiV.LIZ();
        C2TG c2tg = new Runnable() { // from class: X.2TG
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ3;
                try {
                    C2U8.LIZ(new C2MC());
                } finally {
                    if (LIZ3) {
                    }
                }
            }
        };
        LIZ2.removeCallbacks(c2tg);
        C37179EiV.LIZ().postDelayed(c2tg, j);
    }

    public static boolean LJFF(String str) {
        if (str == null) {
            return false;
        }
        if ((!TextUtils.equals(str, "long_press") && !TextUtils.equals(str, "share_panel")) || C4P2.LIZIZ(str) != 2) {
            return false;
        }
        return true;
    }

    public static final void LJ(C107794Kx shareCompleteEvent, C31081Jw c31081Jw, Aweme aweme) {
        AKT hv0;
        IMContact iMContact;
        String string;
        long j;
        o.LJIIIZ(shareCompleteEvent, "shareCompleteEvent");
        if (c31081Jw == null || LJFF(shareCompleteEvent.LJLJJLL) || (hv0 = ((BottomToastVM) c31081Jw.LJLILLLLZI).hv0()) == null) {
            return;
        }
        hv0.LIZ.LJLJLJ = new ACListenerS36S0200000_1(aweme, shareCompleteEvent, 62);
        List<IMContact> list = shareCompleteEvent.LJLILLLLZI;
        if (list == null || (iMContact = (IMContact) ORZ.LJLLLL(list)) == null) {
            iMContact = shareCompleteEvent.LJLIL;
        }
        if (shareCompleteEvent.LJLL > 2) {
            string = LIZIZ.getString(R.string.bfy, LIZIZ(iMContact), Integer.valueOf(shareCompleteEvent.LJLL - 1));
        } else if (shareCompleteEvent.LJLJI) {
            string = LIZIZ.getString(R.string.bfx, LIZIZ(iMContact));
        } else if ((shareCompleteEvent.LJLIL instanceof IMConversation) && shareCompleteEvent.LJLJLJ) {
            string = LIZIZ.getString(R.string.gvm);
        } else {
            string = LIZIZ.getString(R.string.h0n, LIZIZ(iMContact));
        }
        o.LJIIIIZZ(string, "when {\n            share…yName(contact))\n        }");
        hv0.LJI(string);
        hv0.LJ(R.style.ux);
        C208158Ex c208158Ex = hv0.LIZ;
        c208158Ex.LJLJJI = 0;
        c208158Ex.LJLILLLLZI = 0;
        if (!shareCompleteEvent.LJLLILLLL) {
            if (TextUtils.isEmpty(shareCompleteEvent.LJLJLLL)) {
                j = 5000;
            } else {
                j = 2000;
            }
        } else {
            j = 2147483647L;
        }
        hv0.LIZJ(j);
        LIZJ(j);
        hv0.LJII();
        if (C2307993z.LIZ()) {
            if (o.LJ(shareCompleteEvent.LJLJJLL, "share_panel") || o.LJ(shareCompleteEvent.LJLJJLL, "share_button")) {
                C37179EiV.LIZ().postDelayed(LIZJ, j + 200);
            }
        }
    }

    public static final void LIZLLL(C107794Kx shareCompleteEvent, C31081Jw c31081Jw, long j, Aweme aweme) {
        o.LJIIIZ(shareCompleteEvent, "shareCompleteEvent");
        if (j != 0) {
            Runnable runnable = LIZ;
            if (runnable != null) {
                LIZ = null;
                C37179EiV.LIZ().removeCallbacks(runnable);
            }
            ARunnableS15S0300000_4 aRunnableS15S0300000_4 = new ARunnableS15S0300000_4(shareCompleteEvent, c31081Jw, aweme, 16);
            LIZ = aRunnableS15S0300000_4;
            C37179EiV.LIZ().postDelayed(aRunnableS15S0300000_4, j);
            return;
        }
        C1DH.LJJIJIIJI(new ARunnableS15S0300000_4(shareCompleteEvent, c31081Jw, aweme, 15));
    }
}
