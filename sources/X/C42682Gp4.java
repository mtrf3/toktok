package X;

import Y.AObjectS86S0100000_7;
import android.app.Activity;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Gp4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42682Gp4 implements InterfaceC42382GkE {
    public final /* synthetic */ C42684Gp6 LIZ;
    public final /* synthetic */ C42683Gp5 LIZIZ;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C42682Gp4(C42684Gp6 c42684Gp6, C42683Gp5 c42683Gp5, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LIZ = c42684Gp6;
        this.LIZIZ = c42683Gp5;
        this.LIZJ = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC42382GkE
    public final void LIZ(C42381GkD c42381GkD) {
        String str;
        NavigationScene navigationScene;
        if (!this.LIZ.LIZ.containsKey(c42381GkD.LIZ.getLocalClassName())) {
            str = "unknown";
        } else {
            str = this.LIZ.LIZ.get(c42381GkD.LIZ.getLocalClassName());
        }
        if (o.LJ(str, "unknown")) {
            Activity activity = c42381GkD.LIZ;
            if (activity instanceof SAAActivity) {
                o.LJII(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.adaptation.saa.SAAActivity");
                SAAActivity sAAActivity = (SAAActivity) activity;
                byte b = c42381GkD.LIZIZ;
                if (b == 1) {
                    sAAActivity.LJLJL.LIZIZ(sAAActivity, new AObjectS86S0100000_7(this.LIZIZ, 241));
                    return;
                } else {
                    if (b != 2 || (navigationScene = sAAActivity.LJLJJLL) == null) {
                        return;
                    }
                    navigationScene.unregisterChildSceneLifecycleCallbacks(this.LIZIZ);
                    return;
                }
            }
            byte b2 = c42381GkD.LIZIZ;
            if (b2 != 1 && b2 != 3 && b2 != 5) {
                return;
            }
            this.LIZJ.invoke(Boolean.FALSE, null);
            return;
        }
        byte b3 = c42381GkD.LIZIZ;
        if (b3 != 1 && b3 != 3 && b3 != 5) {
            return;
        }
        this.LIZJ.invoke(Boolean.TRUE, str);
    }
}
