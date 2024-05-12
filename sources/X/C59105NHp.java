package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.NHp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59105NHp extends AbstractC59106NHq implements Observer<C207668Da> {
    public static final String LJLLLL = C16880lQ.LJLLJ(C59105NHp.class);
    public final ViewStub LJLLILLLL;
    public FrameLayout LJLLJ;
    public C39289FbR LJLLL;

    @Override // X.AbstractC59106NHq
    public final void LJII() {
    }

    @Override // X.AbstractC59106NHq
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC59106NHq
    public final int LIZLLL() {
        if (this.LJLLL != null) {
            return C39289FbR.LIZ("feed_fyp_super_like");
        }
        return C39289FbR.LIZIZ;
    }

    @Override // X.AbstractC59106NHq
    public final boolean LJ() {
        if (this.LJLLL != null && C39289FbR.LIZ("feed_fyp_super_like") == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC59106NHq
    public final void LJI() {
        if (this.LJLLL == null) {
            this.LJLLL = new C39289FbR();
        }
        C39289FbR c39289FbR = this.LJLLL;
        if (c39289FbR != null) {
            c39289FbR.LIZIZ();
        }
    }

    @Override // X.AbstractC59106NHq
    public final boolean LJIIIIZZ() {
        View view = this.LJLJLLL;
        if (view == null) {
            return false;
        }
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        }
        if (this.LJLLILLLL.getParent() != null) {
            this.LJLLILLLL.setLayoutResource(R.layout.fz);
            View inflate = this.LJLLILLLL.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.LJLLJ = (FrameLayout) inflate;
        }
        FrameLayout frameLayout = this.LJLLJ;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.LJLLJ;
        if (frameLayout2 != null) {
            frameLayout2.addView(view);
        }
        FrameLayout frameLayout3 = this.LJLLJ;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        AbstractC59064NGa abstractC59064NGa = this.LJLJJLL;
        if (abstractC59064NGa != null) {
            abstractC59064NGa.LJIIIIZZ("event_superlike_show", null);
            return true;
        }
        return true;
    }

    public final void LJIILJJIL() {
        FrameLayout frameLayout = this.LJLLJ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // X.AbstractC59106NHq
    public final boolean LJFF() {
        return C58562Ro.LIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C59105NHp(android.view.ViewStub r3) {
        /*
            r2 = this;
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "viewStub.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r2.LJLLILLLL = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59105NHp.<init>(android.view.ViewStub):void");
    }

    @Override // X.AbstractC59106NHq
    public final void LJIIL(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
        }
    }

    @Override // X.AbstractC59106NHq
    public final boolean LJIILIIL(Aweme aweme) {
        if (aweme != null && (C63081OpJ.LJLLL(aweme) || C63081OpJ.LJLLL(aweme))) {
            return true;
        }
        this.LJLJI = null;
        return false;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        C207668Da c207668Da2 = c207668Da;
        if (!LJIILIIL(this.LJLJI) || c207668Da2 == null || (str = c207668Da2.LIZ) == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1540531799) {
            if (hashCode != -1132409520 || !str.equals("ad_feed_on_page_selected")) {
                return;
            }
            EventBus.LIZJ().LJIILJJIL(this);
            return;
        }
        if (!str.equals("ad_feed_on_page_unselected")) {
            return;
        }
        EventBus.LIZJ().LJIJ(this);
        C39289FbR c39289FbR = this.LJLLL;
        if (c39289FbR != null) {
            EventBus.LIZJ().LJIJ(c39289FbR);
        }
        AbstractC59064NGa abstractC59064NGa = this.LJLJJLL;
        if (abstractC59064NGa != null) {
            abstractC59064NGa.LJIIIZ();
        }
        LJIILJJIL();
        this.LJLILLLLZI = false;
        this.LJLJL.removeCallbacksAndMessages(null);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPopupWindowCloseEvent(C38319F2d event) {
        o.LJIIIZ(event, "event");
        C58582Rq.LIZ("close event jsb notif", LJLLLL);
        AbstractC59064NGa abstractC59064NGa = this.LJLJJLL;
        if (abstractC59064NGa != null) {
            abstractC59064NGa.LJIIIZ();
        }
        LJIILJJIL();
        this.LJLILLLLZI = false;
        this.LJLJL.removeCallbacksAndMessages(null);
    }

    @Override // X.AbstractC59106NHq
    public final C59066NGc LIZIZ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        return C59052NFo.LIZ(context, aweme);
    }

    @Override // X.AbstractC59106NHq
    public final C59421NTt LIZJ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        return C59052NFo.LIZIZ(context, aweme);
    }

    @Override // X.AbstractC59106NHq
    public final void LJIIJJI(String str, boolean z) {
        AwemeRawAd awemeRawAd;
        Integer num = null;
        AwemeRawAd awemeRawAd2 = null;
        if (z) {
            Aweme aweme = this.LJLJI;
            if (aweme != null) {
                awemeRawAd2 = aweme.getAwemeRawAd();
            }
            C025908h.LIZLLL("draw_ad", "othershow", awemeRawAd2, "superlike", "refer");
            return;
        }
        Aweme aweme2 = this.LJLJI;
        if (aweme2 != null) {
            awemeRawAd = aweme2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
        LIZLLL.LIZJ("superlike", "refer");
        LIZLLL.LIZIZ(str, "fail_reason");
        if (o.LJ(str, "load_timeout")) {
            if (this.LJLLL != null) {
                num = Integer.valueOf(C39289FbR.LIZ("feed_fyp_super_like"));
            }
            LIZLLL.LIZIZ(num, "failed_reason_status");
        }
        LIZLLL.LJI();
    }
}
