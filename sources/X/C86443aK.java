package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.base.IMDatabase;
import java.util.Arrays;

/* renamed from: X.3aK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86443aK {
    public static IMDatabase LIZ(Context context) {
        boolean booleanValue = ((Boolean) IMDatabase.LJIIL.invoke()).booleanValue();
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        LIZ2.put("has_user_id", String.valueOf(booleanValue));
        LIZ.LIZIZ("im_db_check_user_id_creation", LIZ2);
        C0BW LIZ3 = C0BV.LIZ(C16880lQ.LLLLL(context), IMDatabase.class, "db_im_xx");
        LIZ3.LJII = true;
        LIZ3.LIZJ();
        AbstractC23740wU[] abstractC23740wUArr = (AbstractC23740wU[]) IMDatabase.LJIILLIIL.toArray(new AbstractC23740wU[0]);
        LIZ3.LIZ((AbstractC23740wU[]) Arrays.copyOf(abstractC23740wUArr, abstractC23740wUArr.length));
        return (IMDatabase) LIZ3.LIZIZ();
    }

    public static IMDatabase LIZIZ(Context context) {
        IMDatabase iMDatabase = IMDatabase.LJIILIIL;
        if (iMDatabase == null) {
            synchronized (IMDatabase.LJIILJJIL) {
                iMDatabase = IMDatabase.LJIILIIL;
                if (iMDatabase == null) {
                    iMDatabase = LIZ(context);
                    IMDatabase.LJIILIIL = iMDatabase;
                }
            }
        }
        return iMDatabase;
    }
}
