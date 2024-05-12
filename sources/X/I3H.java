package X;

import android.app.Activity;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3H implements I3O {
    public final /* synthetic */ I3F LIZ;

    public I3H(I3F i3f) {
        this.LIZ = i3f;
    }

    @Override // X.I3O
    public final void LIZ(Activity activity, Aweme aweme, String str) {
        C45987I3b c45987I3b = new C45987I3b(this.LIZ, aweme, activity, str);
        C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
        Activity topActivity = ActivityStack.getTopActivity();
        o.LJII(topActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c61098NyQ.LIZIZ(topActivity, TokenCert.Companion.with("bpea-tools_request_camera_mic_permission_duet_tab_first")).LIZ("android.permission.CAMERA", "android.permission.RECORD_AUDIO").LIZJ(c45987I3b);
    }
}
