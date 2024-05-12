package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R6N extends R6Q {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ SKL LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.R6Q
    public final void LIZ(R6R r6r) {
        SKL skl = this.LIZIZ;
        String string = this.LIZ.getString(R.string.jc_);
        o.LJIIIIZZ(string, "context.getString(R.string.operate_failed)");
        skl.LIZIZ(string);
    }

    @Override // X.R6Q
    public final void LIZJ(R6R r6r) {
        this.LIZJ.invoke();
        if (r6r != null) {
            QTX qtx = r6r.LJIIIZ;
            o.LJII(qtx, "null cannot be cast to non-null type com.ss.android.account.BDAccountUserEntity");
            C71945SLl.LJ().LJFF().updateUserInfo(qtx);
        }
    }

    public R6N(Context context, SKL skl, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = context;
        this.LIZIZ = skl;
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.R6Q
    public final void LIZIZ(R6R r6r, String str, String str2) {
        if (str == null || str.length() == 0) {
            str = this.LIZ.getString(R.string.jc_);
        }
        o.LJIIIIZZ(str, "if (errorTip.isNullOrEmp…ate_failed) else errorTip");
        this.LIZIZ.LIZIZ(str);
    }
}
