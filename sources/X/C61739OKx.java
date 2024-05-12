package X;

import Y.ARunnableS11S1100000_10;
import Y.ARunnableS1S1210000_10;
import Y.ARunnableS7S1300000_10;
import Y.ARunnableS9S1200000_10;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.OKx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61739OKx implements IFG {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.IFG
    public final void LIZJ() {
    }

    @Override // X.IFG
    public final boolean LIZ(Aweme aweme) {
        try {
            return OL1.LJIIIIZZ(aweme);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.IFG
    public final int LJIIIIZZ(Aweme aweme) {
        VSAProductCardsResponse.ProductCard productCard;
        Integer delayShowTime;
        int i = 2;
        try {
            OL5 LIZIZ = OL1.LIZIZ(aweme);
            if (LIZIZ != null && (productCard = LIZIZ.LJFF) != null && (delayShowTime = productCard.getDelayShowTime()) != null && delayShowTime.intValue() >= 0) {
                i = delayShowTime.intValue();
            }
            return i * 1000;
        } catch (Throwable unused) {
            return 2;
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onInboxPopupVisibilityChange(LRX event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 0 && OL1.LIZIZ != null) {
            OLH.LJ(EnumC61741OKz.INBOX_POPUP.getValue(), false, 0, "inbox to show", null, null, null, 116);
        }
    }

    @Override // X.IFG
    public final void LJIIL(Context context, String str) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS11S1100000_10(context, str, 8));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LIZIZ(Context context, Aweme aweme, String str) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS7S1300000_10(context, this, aweme, str, 3));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LIZLLL(Context context, Aweme aweme, String str) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS7S1300000_10(context, this, aweme, str, 5));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LJ(Context context, Aweme aweme, String str) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS7S1300000_10(context, this, aweme, str, 4));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LJFF(Context context, Aweme aweme, String str) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS9S1200000_10(context, aweme, str, 5));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LJI(Fragment fragment, String str, Aweme aweme) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS9S1200000_10(aweme, fragment, str, 3));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LJIIJ(Context context, Aweme aweme, String str) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS9S1200000_10(context, aweme, str, 4));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LJII(Context context, String str, Aweme aweme, boolean z) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS1S1210000_10(context, aweme, str, z, 0));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LJIIIZ(Context context, String str, Aweme aweme, boolean z) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS1S1210000_10(context, aweme, str, z, 1));
        } catch (Throwable unused) {
        }
    }

    @Override // X.IFG
    public final void LJIIJJI(Context context, String str, Aweme aweme, DataCenter dataCenter) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS7S1300000_10(context, dataCenter, aweme, str, 2));
        } catch (Throwable unused) {
        }
    }
}
