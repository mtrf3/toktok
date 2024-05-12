package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5O extends NNK {
    public final /* synthetic */ NNR LIZLLL;
    public final /* synthetic */ Context LJ;

    @Override // X.NNK, X.NNJ
    public final boolean LIZ() {
        String str;
        String str2 = this.LIZLLL.LIZJ.LIZ;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String scheme = UriProtector.parse(str2).getScheme();
        if (scheme != null) {
            str = AnonymousClass028.LIZJ("getDefault()", scheme, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && o.LJ("market", str)) {
            return false;
        }
        return super.LIZ();
    }

    public N5O(Context context, NNR nnr) {
        this.LIZLLL = nnr;
        this.LJ = context;
    }

    @Override // X.NNJ
    public final void LJ(boolean z, NNR params) {
        o.LJIIIZ(params, "params");
        if (z) {
            String str = params.LJ.LIZ;
            String valueOf = String.valueOf(params.LIZ.LIZJ);
            C59270NNy c59270NNy = params.LIZ;
            C58655N0h LJ = C58704N2e.LJ(str, "open_url_app", valueOf, c59270NNy.LIZLLL, String.valueOf(c59270NNy.LJ));
            LJ.LIZJ(params.LJ.LIZIZ, "refer");
            LJ.LIZIZ(params.LIZJ.LIZ, "app_url");
            LJ.LIZIZ(params.LJ.LIZIZ, "enter_from");
            LJ.LJII();
            NNG nng = NNG.LIZIZ;
            nng.LIZ.pendingDeepLinkLog(new AqS141S0200000_10(this.LJ, params, 59));
            nng.LIZ.LJII(new AqS176S0100000_10(params, 236));
        }
    }
}
