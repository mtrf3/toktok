package X;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NHc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59092NHc<T> implements ValueCallback {
    public final /* synthetic */ NU6 LIZ;
    public final /* synthetic */ String LIZIZ;

    public C59092NHc(NU6 nu6, String str) {
        this.LIZ = nu6;
        this.LIZIZ = str;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        NU6 nu6 = this.LIZ;
        String str2 = this.LIZIZ;
        nu6.getClass();
        String encode = URLEncoder.encode(str2, "UTF-8");
        o.LJIIIIZZ(encode, "encode(str, \"UTF-8\")");
        if (str == null || TextUtils.equals("about:blank", encode)) {
            return;
        }
        nu6.LIZIZ().put(encode, s.LJLI(str));
    }
}
