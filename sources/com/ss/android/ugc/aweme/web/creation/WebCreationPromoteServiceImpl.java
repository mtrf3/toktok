package com.ss.android.ugc.aweme.web.creation;

import X.C235769Nc;
import X.C26060AKq;
import X.C26062AKs;
import X.C26065AKv;
import X.C26067AKx;
import X.C38281F0r;
import X.C38995FSd;
import X.C40342FsQ;
import X.C40343FsR;
import X.C42193GhB;
import X.C774532f;
import X.NV8;
import X.OKG;
import X.Q7K;
import Y.ARunnableS10S1000000_4;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IWebCreationPromoteService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class WebCreationPromoteServiceImpl implements IWebCreationPromoteService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final boolean LIZIZ() {
        boolean z = true;
        if (((Number) C26067AKx.LIZ.getValue()).intValue() != 1 || C26062AKs.LIZ().getBoolean("key_has_open_h5_page", false)) {
            return false;
        }
        int i = C26062AKs.LIZ().getInt("key_cancel_profile_gudie_time", 0);
        int LIZIZ = Q7K.LIZIZ("web_promote_notice_max_cancel_cnt", 2);
        if (LIZIZ <= 0) {
            LIZIZ = C26065AKv.LIZ;
        }
        if (i >= LIZIZ) {
            z = false;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZ() {
        if (LIZIZ()) {
            C38995FSd.LIZLLL().submit(new ARunnableS10S1000000_4(2));
        }
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        C38281F0r c38281F0r = new C38281F0r(C774532f.LIZ());
        c38281F0r.LIZLLL("enter_from", "personal_homepage");
        String uri = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", c38281F0r.LJ()).appendQueryParameter("enter_from", "personal_homepage").appendQueryParameter("target_handler", "target_handler").build().toString();
        o.LJIIIIZZ(uri, "parse(\"aweme://webview\")…      .build().toString()");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext LIZIZ = C42193GhB.LIZIZ(uri);
        LIZIZ.LJJIJIIJI(new NV8());
        OKG.LIZLLL(c40342FsQ, context, LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZJ(ViewGroup parentView, C235769Nc c235769Nc) {
        o.LJIIIZ(parentView, "parentView");
        PopupManager.LJIIL(new C26060AKq(parentView, c235769Nc));
    }
}
