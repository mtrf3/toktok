package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.HbN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44381HbN {
    public static final void LIZ(Activity activity) {
        if (activity == null) {
            return;
        }
        OHI.LIZ.getClass();
        if (OHI.LJI(activity, "android.permission.RECORD_AUDIO")) {
            C26227ARb c26227ARb = new C26227ARb(activity);
            c26227ARb.LJ(R.string.cny);
            c26227ARb.LIZ(R.string.cnv);
            UC0.LIZJ(c26227ARb, new AqS167S0100000_1((Context) activity, 253));
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
            return;
        }
        C61099NyR.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-dm_record_audio-tako_voice_input")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new C44382HbO());
    }
}
