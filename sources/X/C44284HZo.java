package X;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HZo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44284HZo {
    public static final C44284HZo LIZJ = new C44284HZo();
    public InterfaceC84498XEg LIZ;
    public Effect LIZIZ;

    public static InterfaceC84498XEg LIZJ(C44284HZo c44284HZo) {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        if (c44284HZo.LIZ == null) {
            c44284HZo.LIZ = C84488XDw.LIZ(application, null);
        }
        InterfaceC84498XEg interfaceC84498XEg = c44284HZo.LIZ;
        o.LJII(interfaceC84498XEg, "null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.IEffectPlatform");
        return interfaceC84498XEg;
    }

    public final MutableLiveData LIZ(String str) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (str == null || str.length() == 0) {
            return mutableLiveData;
        }
        LIZJ(this).LJ(C47261Igj.LJJIJIL(str), false, null, new C44285HZp(mutableLiveData, this));
        return mutableLiveData;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.lifecycle.MutableLiveData LIZIZ(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r2 = 0
            if (r0 != 0) goto L16
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = "live_sticker_id"
            if (r0 == 0) goto L2a
        Lf:
            r0 = r2
        L10:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L39
        L16:
            androidx.lifecycle.MutableLiveData r1 = new androidx.lifecycle.MutableLiveData
            r1.<init>()
            X.TEx r0 = X.EnumC74323TEx.ERROR
            X.TIj r0 = X.C74413TIj.LIZLLL(r0, r2)
            r1.setValue(r0)
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            return r0
        L2a:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L34
            r0.<init>(r4)     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.Exception -> L34
            goto L10
        L34:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto Lf
        L39:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L44
        L3f:
            androidx.lifecycle.MutableLiveData r0 = r3.LIZ(r2)
            return r0
        L44:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4e
            r0.<init>(r4)     // Catch: java.lang.Exception -> L4e
            java.lang.String r2 = r0.optString(r1)     // Catch: java.lang.Exception -> L4e
            goto L3f
        L4e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44284HZo.LIZIZ(java.lang.String):androidx.lifecycle.MutableLiveData");
    }
}
