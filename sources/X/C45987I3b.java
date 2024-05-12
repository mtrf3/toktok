package X;

import Y.AObjectS24S0000000_7;
import android.app.Activity;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.I3b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45987I3b implements InterfaceC61107NyZ {
    public final /* synthetic */ I3F LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ Activity LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        C164906da c164906da = null;
        C164906da c164906da2 = null;
        for (C164906da c164906da3 : results) {
            if (o.LJ(c164906da3.LIZ, "android.permission.CAMERA")) {
                c164906da = c164906da3;
            }
            if (o.LJ(c164906da3.LIZ, "android.permission.RECORD_AUDIO")) {
                c164906da2 = c164906da3;
            }
        }
        if (c164906da != null && c164906da.LIZ() && c164906da2 != null && c164906da2.LIZ()) {
            this.LIZ.LIZIZ(this.LIZJ, this.LIZIZ, this.LIZLLL);
        } else {
            HVR hvr = HVR.LIZ;
            Activity activity = this.LIZJ;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            hvr.LIZJ((ActivityC45651qj) activity, new C45986I3a(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL), new AObjectS24S0000000_7(3), new AObjectS24S0000000_7(4), TokenCert.Companion.with("bpea-tools_request_camera_audio_permission_duet_tab"));
        }
    }

    public C45987I3b(I3F i3f, Aweme aweme, Activity activity, String str) {
        this.LIZ = i3f;
        this.LIZIZ = aweme;
        this.LIZJ = activity;
        this.LIZLLL = str;
    }
}
