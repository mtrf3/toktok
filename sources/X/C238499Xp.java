package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.TimeoutException;

/* renamed from: X.9Xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238499Xp extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, String>> {
    public final /* synthetic */ C9XY LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ Throwable LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238499Xp(C9XY c9xy, boolean z, boolean z2, Throwable th, String str) {
        super(0);
        this.LJLIL = c9xy;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = th;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, String> invoke() {
        Integer num;
        C188727au c188727au = new C188727au();
        C9XY c9xy = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        c9xy.getClass();
        c188727au.LJIIIZ("is_succeed", AbstractC238349Xa.LIZJ(z));
        C9XY c9xy2 = this.LJLIL;
        boolean z2 = this.LJLJI;
        c9xy2.getClass();
        c188727au.LJIIIZ("is_login", AbstractC238349Xa.LIZJ(z2));
        C9XY c9xy3 = this.LJLIL;
        boolean z3 = this.LJLJJI instanceof TimeoutException;
        c9xy3.getClass();
        c188727au.LJIIIZ("is_timeout", AbstractC238349Xa.LIZJ(z3));
        android.net.Uri parse = UriProtector.parse(this.LJLJJL);
        String queryParameter = UriProtector.getQueryParameter(parse, "social_share_type");
        if (queryParameter != null) {
            num = C38350F3i.LJJIL(queryParameter);
        } else {
            num = null;
        }
        c188727au.LJFF(num, "share_type");
        c188727au.LJI("share_source", UriProtector.getQueryParameter(parse, "utm_source"));
        c188727au.LJI("share_link_id", UriProtector.getQueryParameter(parse, "share_link_id"));
        return c188727au.LIZ;
    }
}
