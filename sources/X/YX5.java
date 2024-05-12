package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YX5 implements InterfaceC51573KLx {
    public final AbstractC03300Ba LIZ;

    @Override // X.InterfaceC51573KLx
    public final List<YXH> LIZ() {
        String string;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM localHashTag order by time desc");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "name");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "time");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                YXH yxh = new YXH();
                Long l = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                yxh.LIZ = string;
                if (!LIZIZ.isNull(LIZIZ3)) {
                    l = Long.valueOf(LIZIZ.getLong(LIZIZ3));
                }
                yxh.LIZIZ = l;
                arrayList.add(yxh);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public YX5(AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        new YX8(abstractC03300Ba);
        new YX9(abstractC03300Ba);
        new IDd0S18S0000000_15(abstractC03300Ba, 8);
    }
}
