package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: X.JFc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48848JFc extends JFP<SharedPreferences> {
    public final /* synthetic */ AbstractC48849JFd LIZJ;

    public C48848JFc(AbstractC48849JFd abstractC48849JFd) {
        this.LIZJ = abstractC48849JFd;
    }

    @Override // X.JFP
    public final SharedPreferences LIZ(Object[] objArr) {
        String LIZIZ = C48847JFb.LIZIZ(this.LIZJ, "ug_install_settings_pref");
        if (TextUtils.equals(LIZIZ, "ug_install_settings_pref")) {
            return C48847JFb.LIZ.LIZIZ(objArr[0]);
        }
        return F9J.LIZIZ((Context) objArr[0], 0, LIZIZ);
    }
}
