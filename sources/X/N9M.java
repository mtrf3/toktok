package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N9M extends N9I {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity activity;
        o.LJIIIZ(type, "type");
        String opeartion = ((N9K) xBaseParamModel).getOpeartion();
        int i = 1;
        Activity activity2 = null;
        if (o.LJ(opeartion, "auth")) {
            if (Build.VERSION.SDK_INT >= 33) {
                N9H n9h = (N9H) ED5.LIZJ(N9H.class, null);
                n9h.setStatus(1);
                c37356ElM.onSuccess(n9h, "");
                return;
            } else {
                InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
                if (interfaceC38263Ezz != null) {
                    activity2 = interfaceC38263Ezz.LIZLLL();
                }
                new C77276UUm(activity2, TokenCert.Companion.with("bpea-get_photo_album_auth_method_for_live_replay_list")).LIZ(new N9L(this, c37356ElM), "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        if (o.LJ(opeartion, "get")) {
            if (Build.VERSION.SDK_INT >= 33) {
                N9H n9h2 = (N9H) ED5.LIZJ(N9H.class, null);
                n9h2.setStatus(1);
                c37356ElM.onSuccess(n9h2, "");
                return;
            }
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            if (interfaceC38263Ezz2 != null) {
                activity = interfaceC38263Ezz2.LIZLLL();
            } else {
                activity = null;
            }
            boolean LIZIZ = C76944UHs.LIZIZ(activity, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
            N9H n9h3 = (N9H) ED5.LIZJ(N9H.class, null);
            if (!LIZIZ) {
                i = 2;
            }
            n9h3.setStatus(i);
            c37356ElM.onSuccess(n9h3, "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "", 4);
    }
}
