package Y;

import X.AnonymousClass078;
import X.C145995oB;
import X.C40376Fsy;
import X.C43287Gyp;
import X.C44384HbQ;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.C76800UCe;
import X.GXR;
import X.InterfaceC65784Pro;
import android.app.Notification;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class ACallableS44S0201000_7 implements Callable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS44S0201000_7 aCallableS44S0201000_7) {
        switch (aCallableS44S0201000_7.i2) {
            case 0:
                C40376Fsy c40376Fsy = (C40376Fsy) aCallableS44S0201000_7.l0;
                Uri uri = (Uri) aCallableS44S0201000_7.l1;
                c40376Fsy.getClass();
                C43287Gyp c43287Gyp = C43287Gyp.LIZIZ;
                AwemeRawAd awemeRawAd = c43287Gyp.LIZ;
                c43287Gyp.LIZ = null;
                if (awemeRawAd != null) {
                    String queryParameter = UriProtector.getQueryParameter(uri, "tag");
                    if (TextUtils.isEmpty(queryParameter)) {
                        queryParameter = "draw_ad";
                    }
                    C59127NIl LIZ = C59128NIm.LIZ();
                    LIZ.LJFF(awemeRawAd);
                    LIZ.LIZ = queryParameter;
                    LIZ.LIZIZ = "open_url_appback";
                    LIZ.LJIIIZ(c40376Fsy.LIZ);
                    C58704N2e.LIZLLL(queryParameter, "open_url_appback", awemeRawAd).LJII();
                }
                return null;
            default:
                VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aCallableS44S0201000_7.l0;
                C145995oB c145995oB = (C145995oB) aCallableS44S0201000_7.l1;
                c145995oB.LIZLLL("original_resolution", C44384HbQ.LJJLIIIJLJLI(vEVideoPublishPreviewScene.LJLLJ));
                GXR.LIZ("tool_performance_publish_preview", c145995oB.LIZ);
                return null;
        }
    }

    public static final Object call$1(ACallableS44S0201000_7 aCallableS44S0201000_7) {
        new AnonymousClass078((PublishService) aCallableS44S0201000_7.l1).LIZLLL(aCallableS44S0201000_7.i2, (Notification) ((InterfaceC65784Pro) aCallableS44S0201000_7.l0).invoke());
        return C76800UCe.LIZ;
    }

    public ACallableS44S0201000_7(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
