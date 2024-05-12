package X;

import android.content.Context;
import com.ss.android.ugc.aweme.contact.data.base.IMContactDatabase;

/* renamed from: X.3aI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86423aI {
    public static IMContactDatabase LIZ(Context context) {
        IMContactDatabase iMContactDatabase = IMContactDatabase.LJIIL;
        if (iMContactDatabase == null) {
            synchronized (IMContactDatabase.LJIILIIL) {
                iMContactDatabase = IMContactDatabase.LJIIL;
                if (iMContactDatabase == null) {
                    C0BW LIZ = C0BV.LIZ(C16880lQ.LLLLL(context), IMContactDatabase.class, "db_im_contact");
                    LIZ.LJII = true;
                    LIZ.LIZJ();
                    iMContactDatabase = (IMContactDatabase) LIZ.LIZIZ();
                    IMContactDatabase.LJIIL = iMContactDatabase;
                }
            }
        }
        return iMContactDatabase;
    }
}
