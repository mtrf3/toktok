package X;

import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R82 extends R4O {
    public final /* synthetic */ C45R<R40<R7V>> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ Fragment LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<R7V> response) {
        o.LJIIIZ(response, "response");
        R7V r7v = response.LJIIIZ;
        if (r7v == null || r7v.LJIIIZ == null) {
            ((C73516StE) this.LIZ).onError(new C69084R9k(-1, "no data", EnumC69116RAq.SIGN_UP, EnumC69113RAn.CREATE_PASSWORD_FOR_EMAIL, null, null, 32, null));
            return;
        }
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        C45R<R40<R7V>> c45r = this.LIZ;
        int i = response.LIZLLL;
        String str = response.LJFF;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SIGN_UP;
        EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
        String str2 = response.LJFF;
        o.LJIIIIZZ(str2, "response.errorMsg");
        ((C73516StE) c45r).onError(new C69084R9k(i, str, enumC69116RAq, LJLLLL, null, str2));
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<R7V> r40, int i) {
        String string;
        int i2;
        String str;
        String str2 = null;
        if (r40 == null || (string = r40.LJFF) == null || string.length() == 0) {
            string = this.LIZJ.getString(R.string.g5w);
        }
        C45R<R40<R7V>> c45r = this.LIZ;
        if (r40 != null) {
            i2 = r40.LIZLLL;
        } else {
            i2 = -10000;
        }
        if (string == null) {
            string = "";
        }
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SIGN_UP;
        EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
        JSONObject LJII = C69093R9t.LJII(r40);
        if (LJII == null) {
            LJII = new JSONObject();
        }
        JSONObject put = LJII.put("password", this.LIZLLL).put("email", this.LJ);
        StringBuilder LIZ = X1D.LIZ();
        if (r40 != null) {
            str = r40.LJFF;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('|');
        if (r40 != null) {
            str2 = r40.LJI;
        }
        LIZ.append(str2);
        ((C73516StE) c45r).onError(new C69084R9k(i2, string, enumC69116RAq, LJLLLL, put, X1D.LIZIZ(LIZ)));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        C45R<R40<R7V>> c45r = this.LIZ;
        int i = response.LIZLLL;
        String str2 = response.LJFF;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SIGN_UP;
        EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
        String str3 = response.LJFF;
        o.LJIIIIZZ(str3, "response.errorMsg");
        ((C73516StE) c45r).onError(new C69084R9k(i, str2, enumC69116RAq, LJLLLL, null, str3));
    }

    public R82(C73516StE c73516StE, InterfaceC69056R8i interfaceC69056R8i, Fragment fragment, String str, String str2) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = fragment;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
