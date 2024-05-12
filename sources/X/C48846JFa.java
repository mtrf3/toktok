package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.JFa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48846JFa extends AbstractC48851JFf {
    public final /* synthetic */ AbstractC48849JFd LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48846JFa(AbstractC48849JFd abstractC48849JFd) {
        super(4);
        this.LIZJ = abstractC48849JFd;
    }

    public final Object LJI(String str, Object[] objArr) {
        AbstractC48849JFd abstractC48849JFd = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C48847JFb.LIZIZ(abstractC48849JFd, "ug_install_settings_pref"));
        LIZ.append("_");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ug_install_settings_pref_");
        LIZ2.append(str);
        if (TextUtils.equals(LIZIZ, X1D.LIZIZ(LIZ2))) {
            Context context = (Context) objArr[0];
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ug_install_settings_pref_");
            LIZ3.append(str);
            return F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ3));
        }
        return F9J.LIZIZ((Context) objArr[0], 0, LIZIZ);
    }
}
