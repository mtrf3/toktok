package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C237559Tz;
import X.C39061g6;
import X.C6ZT;
import X.M89;
import Y.IDLCallbackS107S0200000_9;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreativeHubPanel extends ShootFeedPanel {
    public final int LLJLIL;
    public final String LLJLILLLLZIIL;
    public final String LLJLL;
    public final String LLJLLIL;
    public TuxTextView LLJLLL;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        int i = this.LLJLIL;
        if (i == 1 || i == 2) {
            return R.string.ed7;
        }
        if (i != 3) {
            if (i != 4) {
                return R.string.ed7;
            }
            return R.string.tie;
        }
        return R.string.ed6;
    }

    public CreativeHubPanel(M89 m89) {
        this.LLJLIL = m89.getCreativeHubType();
        this.LLJLILLLLZIIL = m89.getCreativeHubText();
        this.LLJLL = m89.getCreativeHubOpenRecordId();
        String eventType = m89.getEventType();
        this.LLJLLIL = eventType == null ? "cvh" : eventType;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
        if (view == null || C6ZT.LIZ(view)) {
            return;
        }
        int i = this.LLJLIL;
        if (i != 3) {
            if (i != 4) {
                RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.enterFrom(this.LLJLLIL);
                builder.shootWay(this.LLJLLIL);
                IExternalService LIZ = AVExternalServiceImpl.LIZ();
                Activity activity = this.activity;
                o.LJIIIIZZ(activity, "activity");
                LIZ.asyncService(activity, this.LLJLLIL, new IDLCallbackS107S0200000_9(this, builder, 1));
            } else {
                String str = this.LLJLL;
                if (str == null || str.length() == 0) {
                    return;
                }
                C39061g6 c39061g6 = new C39061g6("aweme://openShoot");
                c39061g6.LIZIZ("type", "use_music");
                c39061g6.LIZIZ("music_id", this.LLJLL);
                c39061g6.LIZIZ("enter_from", this.LLJLLIL);
                c39061g6.LIZIZ("shoot_way", "direct_shoot");
                SmartRouter.buildRoute(getContext(), c39061g6.LIZJ()).open();
            }
        } else {
            String str2 = this.LLJLL;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            C39061g6 c39061g62 = new C39061g6("aweme://openShoot");
            c39061g62.LIZIZ("type", "use_challenge");
            c39061g62.LIZIZ("challenge_id", this.LLJLL);
            c39061g62.LIZIZ("enter_from", this.LLJLLIL);
            c39061g62.LIZIZ("shoot_way", "direct_shoot");
            SmartRouter.buildRoute(getContext(), c39061g62.LIZJ()).open();
        }
        C237559Tz c237559Tz = new C237559Tz();
        c237559Tz.LIZIZ("enter_from", Integer.valueOf(this.LLJLIL));
        c237559Tz.LJII("cvh_shoot", new String[0]);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.al8, relativeLayout, false);
        TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.bz8);
        this.LLJLLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
        }
        TuxTextView tuxTextView2 = this.LLJLLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(this.LLJLILLLLZIIL);
        }
        String str = this.LLJLILLLLZIIL;
        if (str == null || str.length() == 0) {
            TuxTextView tuxTextView3 = this.LLJLLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(8);
            }
            ViewGroup.LayoutParams layoutParams = LLLLIILL.findViewById(R.id.ap4).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
        }
        return LLLLIILL;
    }
}
