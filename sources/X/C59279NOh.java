package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.NOh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59279NOh extends AbstractC59249NNd {
    public final String LIZJ;

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        String str;
        if (TextUtils.isEmpty(this.LIZJ)) {
            return false;
        }
        String scheme = UriProtector.parse(this.LIZJ).getScheme();
        if (scheme != null) {
            str = scheme.toLowerCase();
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
        } else {
            str = null;
        }
        if ((TextUtils.isEmpty(str) || (!TextUtils.equals("sslocal", str) && !TextUtils.equals("localsdk", str))) && !o.LJ(str, "aweme")) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        String str;
        boolean z;
        String scheme = UriProtector.parse(this.LIZJ).getScheme();
        if (scheme != null) {
            str = scheme.toLowerCase();
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || (!TextUtils.equals("sslocal", str) && !TextUtils.equals("localsdk", str))) {
            z = false;
        } else {
            z = true;
        }
        String str2 = "";
        if (z) {
            C59280NOi c59280NOi = C59280NOi.LIZIZ;
            c59280NOi.LIZIZ(this.LIZJ);
            boolean LIZ = c59280NOi.LIZ(this.LIZIZ, this.LIZJ);
            if (!LIZ) {
                str2 = "handle sslocal scheme failed";
            }
            return new C59289NOr(LIZ, str2);
        }
        if (o.LJ(str, "aweme")) {
            boolean open = C59280NOi.LIZIZ.open(this.LIZJ);
            if (!open) {
                str2 = "handle aweme scheme failed";
            }
            return new C59289NOr(open, str2);
        }
        return new C59289NOr(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59279NOh(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        o.LJIIIZ(taskContext, "taskContext");
        String string = bundle.getString("open_url", "");
        o.LJIIIIZZ(string, "params.getString(RichTaskParams.KEY_OPEN_URL, \"\")");
        this.LIZJ = string;
    }
}
