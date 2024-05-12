package com.ss.android.ugc.aweme.commercialize.business;

import X.C16880lQ;
import X.C59472NVs;
import X.C78983UzD;
import X.N5S;
import X.NP1;
import X.NP2;
import X.NP3;
import X.NP4;
import X.OM1;
import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class DownloadBusiness extends BulletBusinessService.Business {
    public final NP2 LIZIZ;
    public int LIZJ;

    public final void LIZIZ() {
        Activity activity = this.LIZ.getActivity();
        if (activity != null) {
            int i = this.LIZJ;
            if (i == 0) {
                i = R.id.r2;
            }
            activity.findViewById(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LIZIZ = new NP2();
    }

    public final void LIZ(OM1 om1) {
        FrameLayout frameLayout;
        Activity activity = this.LIZ.getActivity();
        NP1 np1 = null;
        if (activity != null) {
            int i = this.LIZJ;
            if (i == 0) {
                i = R.id.r2;
            }
            frameLayout = (FrameLayout) activity.findViewById(i);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            frameLayout = null;
        }
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if (c59472NVs instanceof NP1) {
            np1 = (NP1) c59472NVs;
        }
        NP2 np2 = this.LIZIZ;
        np2.getClass();
        if (np1 != null) {
            np2.LIZ = (String) np1.LJLLJ.getValue();
            np1.LJJJLL.getValue();
            np1.LJII();
            np1.LJLJL.getValue();
            np1.LJLJJL.getValue();
            np1.LJLJJLL.getValue();
            if (np1.LJLLLLLL.getValue() != null) {
                np1.LJLLLLLL.getValue().intValue();
            }
            np1.LJLJLJ.getValue();
            if (np1.LJLZ.getValue() != null) {
                np1.LJLZ.getValue().intValue();
            }
            np1.LJZI.getValue();
            try {
                new JSONObject((String) np1.LJZL.getValue());
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
            np1.LJLLLL.getValue();
            try {
                CastLongProtector.parseLong(np2.LIZ);
            } catch (Exception e2) {
                C78983UzD.LJIIZILJ(e2);
            }
        }
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, NP3.LJLIL);
        }
        if (om1 != null) {
            om1.setDownloadListener(new NP4(om1, activity, np1, this));
        }
    }
}
