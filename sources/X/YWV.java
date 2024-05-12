package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YWV implements InterfaceC43179Gx5 {
    public final AbstractC03300Ba LIZ;
    public final YWL LIZIZ;
    public final IDd0S18S0000000_15 LIZJ;

    public YWV(RuntimeBehaviorDataBase runtimeBehaviorDataBase) {
        this.LIZ = runtimeBehaviorDataBase;
        this.LIZIZ = new YWL(runtimeBehaviorDataBase);
        this.LIZJ = new IDd0S18S0000000_15(runtimeBehaviorDataBase, 9);
        new IDd0S18S0000000_15(runtimeBehaviorDataBase, 10);
    }

    @Override // X.InterfaceC43179Gx5
    public final void LIZ(C43189GxF c43189GxF) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJFF(c43189GxF);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC43179Gx5
    public final void LIZIZ(long j, String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        LIZ.LJJII(1, str);
        LIZ.LJIIIZ(2, j);
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC43179Gx5
    public final List LIZJ(long j, String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM runtimeBehaviorEntity where type = ?  and time > ?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        LIZJ.LJIIIZ(2, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "id");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "type");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "time");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "msg");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                C43189GxF c43189GxF = new C43189GxF();
                c43189GxF.LIZ = LIZIZ.getInt(LIZIZ2);
                String str2 = null;
                if (LIZIZ.isNull(LIZIZ3)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ3);
                }
                o.LJIIIZ(string, "<set-?>");
                c43189GxF.LIZIZ = string;
                c43189GxF.LIZJ = LIZIZ.getLong(LIZIZ4);
                if (!LIZIZ.isNull(LIZIZ5)) {
                    str2 = LIZIZ.getString(LIZIZ5);
                }
                o.LJIIIZ(str2, "<set-?>");
                c43189GxF.LIZLLL = str2;
                arrayList.add(c43189GxF);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }
}
