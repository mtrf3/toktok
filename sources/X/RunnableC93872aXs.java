package X;

import android.util.Base64;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.aXs, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93872aXs implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ Fragment LJLJJI;
    public final /* synthetic */ C9A8 LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public RunnableC93872aXs(String str, String str2, ActivityC45651qj activityC45651qj, Fragment fragment, C9A8 c9a8, String str3, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = fragment;
        this.LJLJJL = c9a8;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
    }

    public final void LIZ() {
        try {
            C66549Q9x c66549Q9x = new C66549Q9x(new C66540Q9o(UriProtector.parse("https://www.amazon.com/ap/oa"), UriProtector.parse("https://api.amazon.com/auth/o2/token"), null), this.LJLILLLLZI, "code", UriProtector.parse(this.LJLIL));
            byte[] bArr = new byte[256];
            new SecureRandom().nextBytes(bArr);
            String encodeToString = Base64.encodeToString(bArr, 0);
            o.LJIIIIZZ(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
            C94302aeo.LJLJLJ = encodeToString;
            String str = C94302aeo.LJLJLJ;
            if (str != null) {
                T2R.LJIILL("state cannot be empty if defined", str);
            }
            c66549Q9x.LJIIIIZZ = str;
            String[] strArr = C93903aYN.LIZ;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (strArr2 == null) {
                strArr2 = new String[0];
            }
            c66549Q9x.LJII = C78999UzT.LJIILJJIL(Arrays.asList(strArr2));
            C66544Q9s LIZ = c66549Q9x.LIZ();
            C66533Q9h c66533Q9h = new C66533Q9h(this.LJLJI);
            android.net.Uri[] uriArr = {UriProtector.parse("https://www.amazon.com/ap/oa")};
            if (!c66533Q9h.LJ) {
                C16880lQ.LJII(this.LJLJJI, c66533Q9h.LIZ(LIZ, c66533Q9h.LIZJ.LIZ(uriArr).LIZ()), 3457);
                return;
            }
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        } catch (Exception unused) {
            C82544WaS.LIZJ(new RunnableC93871aXr(this.LJLJI, this.LJLJJL, this.LJLJJLL, this.LJLJL));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
