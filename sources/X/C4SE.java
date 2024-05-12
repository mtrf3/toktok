package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4SE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SE {
    public static final DmNoticeProxy LIZ;

    static {
        DmNoticeProxy LJI = DmNoticeProxyImpl.LJI();
        o.LJIIIIZZ(LJI, "get().getService(DmNoticeProxy::class.java)");
        LIZ = LJI;
    }

    public static C46173IAf LIZ(Context context, String str) {
        int LIZIZ = C7MY.LIZIZ(44);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LIZIZ, LIZIZ);
        layoutParams.gravity = 8388613;
        C26338AVi.LJII(layoutParams, context, null, AnonymousClass391.LIZJ(2), AnonymousClass391.LIZJ(6), null, 50);
        C46173IAf c46173IAf = new C46173IAf(context, layoutParams);
        ((View) c46173IAf.LIZ).setVisibility(0);
        C107234It.LJI("inbox_page", "show");
        C7FA.LIZIZ((View) c46173IAf.LIZ);
        DmNoticeProxy dmNoticeProxy = LIZ;
        TuxAlertBadgeLayout tuxAlertBadgeLayout = (TuxAlertBadgeLayout) ((View) c46173IAf.LIZ).findViewById(R.id.cxm);
        o.LJIIIIZZ(tuxAlertBadgeLayout, "entrance.rootView.entrance_box");
        dmNoticeProxy.LJFF(tuxAlertBadgeLayout, str);
        return c46173IAf;
    }

    public static C46173IAf LIZIZ(Context context, String str) {
        int LIZIZ = C7MY.LIZIZ(44);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LIZIZ, LIZIZ);
        layoutParams.addRule(21);
        C26338AVi.LJII(layoutParams, context, null, AnonymousClass391.LIZJ(2), AnonymousClass391.LIZJ(6), null, 50);
        C46173IAf c46173IAf = new C46173IAf(context, layoutParams);
        ((View) c46173IAf.LIZ).setVisibility(0);
        C107234It.LJI("inbox_page", "show");
        C7FA.LIZIZ((View) c46173IAf.LIZ);
        TuxIconView tuxIconView = (TuxIconView) ((View) c46173IAf.LIZ).findViewById(R.id.mb8);
        tuxIconView.LIZIZ(false);
        tuxIconView.setTintColorRes(R.attr.go);
        DmNoticeProxy dmNoticeProxy = LIZ;
        TuxAlertBadgeLayout tuxAlertBadgeLayout = (TuxAlertBadgeLayout) ((View) c46173IAf.LIZ).findViewById(R.id.cxm);
        o.LJIIIIZZ(tuxAlertBadgeLayout, "entrance.rootView.entrance_box");
        dmNoticeProxy.LJFF(tuxAlertBadgeLayout, str);
        return c46173IAf;
    }
}
