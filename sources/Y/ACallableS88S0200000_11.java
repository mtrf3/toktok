package Y;

import X.C03880Dg;
import X.C39519Ff9;
import X.C45804HyK;
import X.C63860P4m;
import X.C65300Pk0;
import X.C65960Pue;
import X.C65963Puh;
import X.C66513Q8n;
import X.C66516Q8q;
import X.C66533Q9h;
import X.C66543Q9r;
import X.C66545Q9t;
import X.C67714Qhq;
import X.C76800UCe;
import X.C82544WaS;
import X.P5Y;
import X.QA4;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.hox.Hox;
import com.google.android.gms.auth.api.credentials.Credential;
import com.ss.android.ugc.aweme.profile.edit.YoutubePresenter;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public class ACallableS88S0200000_11 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.ss.android.ugc.aweme.profile.edit.YoutubePresenter] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Throwable, X.Q9r] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Exception] */
    public static final Object call$0(ACallableS88S0200000_11 aCallableS88S0200000_11) {
        String str;
        Integer num;
        String message;
        String charSequence;
        C66545Q9t LIZIZ = C66545Q9t.LIZIZ((Intent) aCallableS88S0200000_11.l0);
        if (LIZIZ == null) {
            ?? fromIntent = C66543Q9r.fromIntent((Intent) aCallableS88S0200000_11.l0);
            String str2 = null;
            if (fromIntent != 0 && (message = fromIntent.getMessage()) != null && (charSequence = s.LJZI(message).toString()) != null) {
                str = charSequence.toLowerCase();
                o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
            } else {
                str = null;
            }
            boolean z = false;
            if (str != null) {
                z = s.LJJJLZIJ(str, "cancelled", false);
            }
            ?? r1 = (YoutubePresenter) aCallableS88S0200000_11.l1;
            if (fromIntent != 0) {
                num = Integer.valueOf(fromIntent.code);
                str2 = fromIntent.getMessage();
            } else {
                num = null;
            }
            if (fromIntent == 0) {
                fromIntent = new Exception("AuthorizationResponse is null");
            }
            r1.onError(z, num, str2, fromIntent, null, "redirect_and_get_token");
            return Boolean.TRUE;
        }
        new C66533Q9h(((YoutubePresenter) aCallableS88S0200000_11.l1).getActivity()).LIZIZ(LIZIZ.LIZ(), new QA4((YoutubePresenter) aCallableS88S0200000_11.l1));
        return Boolean.TRUE;
    }

    public static final Object call$1(ACallableS88S0200000_11 aCallableS88S0200000_11) {
        return Integer.valueOf(((P5Y) aCallableS88S0200000_11.l1).LJLILLLLZI.init((VEAudioCaptureSettings) aCallableS88S0200000_11.l0));
    }

    public static final Object call$2(ACallableS88S0200000_11 aCallableS88S0200000_11) {
        int start;
        VEAudioCapture vEAudioCapture = ((P5Y) aCallableS88S0200000_11.l1).LJLILLLLZI;
        Cert cert = (Cert) aCallableS88S0200000_11.l0;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100850, "com/ss/android/vesdk/VEAudioCapture", "start", vEAudioCapture, new Object[]{cert}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "7023483754023459446"));
        if (LIZJ.LIZ) {
            start = ((Integer) LIZJ.LIZIZ).intValue();
        } else {
            start = vEAudioCapture.start(cert);
        }
        return Integer.valueOf(start);
    }

    public static final Object call$3(ACallableS88S0200000_11 aCallableS88S0200000_11) {
        return Integer.valueOf(((P5Y) aCallableS88S0200000_11.l1).LJLILLLLZI.stop((Cert) aCallableS88S0200000_11.l0));
    }

    public static final Object call$4(ACallableS88S0200000_11 aCallableS88S0200000_11) {
        Hox hox;
        AtomicBoolean atomicBoolean = C65960Pue.LIZ;
        if (!atomicBoolean.get() && o.LJ(((Activity) aCallableS88S0200000_11.l0).getClass().getName(), "com.ss.android.ugc.aweme.main.MainActivity")) {
            atomicBoolean.set(true);
            if (C45804HyK.LJJIFFI((Activity) aCallableS88S0200000_11.l0) != null && (hox = (Hox) aCallableS88S0200000_11.l1) != null) {
                hox.gv0(new C65963Puh(hox));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS88S0200000_11 aCallableS88S0200000_11) {
        String str;
        C66516Q8q c66516Q8q;
        C67714Qhq c67714Qhq = (C67714Qhq) aCallableS88S0200000_11.l0;
        Intent intent = (Intent) aCallableS88S0200000_11.l1;
        c67714Qhq.getClass();
        Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
        boolean z = false;
        if (credential == null) {
            str = "No \"Credential\" retrieved from Credential.EXTRA_KEY";
        } else {
            String str2 = credential.zba;
            str = null;
            try {
                c66516Q8q = C66513Q8n.LIZJ().LJIIL(str2, null);
            } catch (C63860P4m e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("NumberParseException: ");
                LIZ.append(e.getMessage());
                String LIZIZ = X1D.LIZIZ(LIZ);
                c66516Q8q = null;
                str = LIZIZ;
            }
            if (c66516Q8q != null) {
                z = true;
            }
            if (c66516Q8q != null) {
                str2 = String.valueOf(c66516Q8q.getNationalNumber());
            }
            C82544WaS.LIZJ(new ARunnableS12S1100000_11(c67714Qhq, str2, 9));
        }
        c67714Qhq.LIZ(c67714Qhq.LJLJJI, str, TextUtils.isEmpty(str), c67714Qhq.LJLJJL);
        return Boolean.valueOf(z);
    }

    public ACallableS88S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
