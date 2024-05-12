package X;

import android.content.Context;

/* renamed from: X.QIg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66766QIg extends JFP<C66799QJn> {
    @Override // X.JFP
    public final C66799QJn LIZ(Object[] objArr) {
        C66799QJn c66799QJn = null;
        try {
            c66799QJn = C66799QJn.LIZIZ(F9J.LIZIZ((Context) objArr[0], 0, "ug_install_op_pref").getString("install_info", null));
            return c66799QJn;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return c66799QJn;
        }
    }
}
