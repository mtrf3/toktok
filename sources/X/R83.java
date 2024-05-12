package X;

import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R83 extends R4O {
    public final /* synthetic */ C45R<R40<R7Z>> LIZ;
    public final /* synthetic */ EnumC69116RAq LIZIZ;
    public final /* synthetic */ EnumC69113RAn LIZJ;
    public final /* synthetic */ Fragment LIZLLL;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<R7Z> response) {
        o.LJIIIZ(response, "response");
        R7Z r7z = response.LJIIIZ;
        if (r7z != null && r7z.LJFF != null) {
            ((C73516StE) this.LIZ).onSuccess(response);
            return;
        }
        C45R<R40<R7Z>> c45r = this.LIZ;
        C69049R8b c69049R8b = C69084R9k.Companion;
        EnumC69116RAq enumC69116RAq = this.LIZIZ;
        EnumC69113RAn enumC69113RAn = this.LIZJ;
        c69049R8b.getClass();
        ((C73516StE) c45r).onError(C69049R8b.LIZ(enumC69116RAq, enumC69113RAn));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        C45R<R40<R7Z>> c45r = this.LIZ;
        int i = response.LIZLLL;
        String str = response.LJFF;
        EnumC69116RAq enumC69116RAq = this.LIZIZ;
        EnumC69113RAn enumC69113RAn = this.LIZJ;
        o.LJIIIIZZ(str, "response.errorMsg");
        ((C73516StE) c45r).onError(new C69084R9k(i, str, enumC69116RAq, enumC69113RAn, null, str));
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<R7Z> r40, int i) {
        String string;
        String str;
        String str2 = null;
        if (r40 == null || (string = r40.LJFF) == null || string.length() == 0) {
            string = this.LIZLLL.getString(R.string.g5w);
        }
        C45R<R40<R7Z>> c45r = this.LIZ;
        EnumC69116RAq enumC69116RAq = this.LIZIZ;
        EnumC69113RAn enumC69113RAn = this.LIZJ;
        JSONObject LJII = C69093R9t.LJII(r40);
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
        ((C73516StE) c45r).onError(new C69084R9k(i, string, enumC69116RAq, enumC69113RAn, LJII, X1D.LIZIZ(LIZ)));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        C45R<R40<R7Z>> c45r = this.LIZ;
        int i = response.LIZLLL;
        String str2 = response.LJFF;
        EnumC69116RAq enumC69116RAq = this.LIZIZ;
        EnumC69113RAn enumC69113RAn = this.LIZJ;
        o.LJIIIIZZ(str2, "response.errorMsg");
        ((C73516StE) c45r).onError(new C69084R9k(i, str2, enumC69116RAq, enumC69113RAn, null, str2));
    }

    public R83(C73516StE c73516StE, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, Fragment fragment) {
        this.LIZ = c73516StE;
        this.LIZIZ = enumC69116RAq;
        this.LIZJ = enumC69113RAn;
        this.LIZLLL = fragment;
    }
}
