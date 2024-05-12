package X;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NHt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59109NHt<T> implements ValueCallback {
    public final /* synthetic */ PassBackWebInfoBusiness LIZ;
    public final /* synthetic */ String LIZIZ;

    public C59109NHt(PassBackWebInfoBusiness passBackWebInfoBusiness, String str) {
        this.LIZ = passBackWebInfoBusiness;
        this.LIZIZ = str;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        PassBackWebInfoBusiness passBackWebInfoBusiness = this.LIZ;
        String str2 = this.LIZIZ;
        o.LJI(str2);
        passBackWebInfoBusiness.getClass();
        String encode = URLEncoder.encode(str2, "UTF-8");
        o.LJIIIIZZ(encode, "encode(str, \"UTF-8\")");
        if (str == null || TextUtils.equals("about:blank", encode)) {
            return;
        }
        passBackWebInfoBusiness.LIZIZ().put(encode, s.LJLI(str));
    }
}
