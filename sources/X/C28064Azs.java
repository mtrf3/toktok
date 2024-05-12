package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Azs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28064Azs {
    public static final /* synthetic */ int LJIIL = 0;
    public final Context LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final HashMap<String, Object> LJII;
    public PayResponseData LJIIIIZZ;
    public PaymentListResponseData LJIIIZ;
    public String LJIIJ;
    public final C62822Ol8 LJIIJJI;

    public final void LIZIZ(String str) {
        Resources resources;
        if (str != null || ((resources = this.LIZ.getResources()) != null && (str = resources.getString(R.string.r_z)) != null)) {
            C5S1 c5s1 = new C5S1(this.LIZ);
            c5s1.LIZLLL(str);
            c5s1.LJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r5 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r32, java.lang.String r33, java.lang.Boolean r34, X.InterfaceC65784Pro<X.C76800UCe> r35) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28064Azs.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.lang.String, java.lang.Boolean, X.Pro):void");
    }

    public C28064Azs(Context context, String str, List<String> list, String str2, String str3, String str4, String str5, HashMap<String, Object> hashMap) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = hashMap;
        this.LJIIJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 10));
    }
}
