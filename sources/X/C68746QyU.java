package X;

import Y.IDd0S17S0000000_11;
import android.database.Cursor;
import com.ss.android.ugc.localnotify.database.WorkManagerTaskDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QyU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68746QyU implements InterfaceC68487QuJ {
    public final AbstractC03300Ba LIZ;
    public final C68488QuK LIZIZ;
    public final IDd0S17S0000000_11 LIZJ;
    public final IDd0S17S0000000_11 LIZLLL;

    public C68746QyU(WorkManagerTaskDatabase workManagerTaskDatabase) {
        this.LIZ = workManagerTaskDatabase;
        this.LIZIZ = new C68488QuK(workManagerTaskDatabase);
        new IDd0S17S0000000_11(workManagerTaskDatabase, 18);
        this.LIZJ = new IDd0S17S0000000_11(workManagerTaskDatabase, 19);
        this.LIZLLL = new IDd0S17S0000000_11(workManagerTaskDatabase, 20);
        new IDd0S17S0000000_11(workManagerTaskDatabase, 21);
        new IDd0S17S0000000_11(workManagerTaskDatabase, 22);
    }

    @Override // X.InterfaceC68487QuJ
    public final void LIZIZ(List<C68476Qu8> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC68487QuJ
    public final void LIZJ(long j) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        LIZ.LJIIIZ(1, 3);
        LIZ.LJIIIZ(2, j);
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC68487QuJ
    public final List<C68476Qu8> LIZLLL(int i) {
        String string;
        boolean z;
        boolean z2;
        C1CD LIZJ = C1CD.LIZJ(1, "\n        SELECT * \n        FROM workmanager_task\n        WHERE type = ?\n        ");
        LIZJ.LJIIIZ(1, i);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "id");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "rule_id");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "type");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "scheduled_date_timestamp");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "interval_index");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "time_offset");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "scheduled_timestamp");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "actual_timestamp");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "is_executed");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "is_published");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "extra");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j = LIZIZ.getLong(LIZIZ3);
                int i2 = LIZIZ.getInt(LIZIZ4);
                long j2 = LIZIZ.getLong(LIZIZ5);
                int i3 = LIZIZ.getInt(LIZIZ6);
                long j3 = LIZIZ.getLong(LIZIZ7);
                long j4 = LIZIZ.getLong(LIZIZ8);
                long j5 = LIZIZ.getLong(LIZIZ9);
                if (LIZIZ.getInt(LIZIZ10) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (LIZIZ.getInt(LIZIZ11) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!LIZIZ.isNull(LIZIZ12)) {
                    str = LIZIZ.getString(LIZIZ12);
                }
                arrayList.add(new C68476Qu8(string, j, i2, j2, i3, j3, j4, j5, z, z2, str));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC68487QuJ
    public final void LJ(C68476Qu8 c68476Qu8) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJFF(c68476Qu8);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC68487QuJ
    public final int LJFF(int i) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        LIZ.LJIIIZ(1, i);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC68487QuJ
    public final int LJI(List<Integer> list) {
        this.LIZ.LIZIZ();
        StringBuilder sb = new StringBuilder();
        sb.append("\n        DELETE\n        FROM workmanager_task\n        WHERE type IN (");
        C217818gj.LIZ(list.size(), sb);
        sb.append(")\n        ");
        InterfaceC37591dj LJ = this.LIZ.LJ(sb.toString());
        Iterator<Integer> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            LJ.LJIIIZ(i, it.next().intValue());
            i++;
        }
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LJ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC68487QuJ
    public final void LIZ(long j, List<Integer> list) {
        this.LIZ.LIZIZ();
        StringBuilder sb = new StringBuilder();
        sb.append("\n        DELETE \n        FROM workmanager_task\n        WHERE scheduled_timestamp < ?\n        AND type IN (");
        C217818gj.LIZ(list.size(), sb);
        sb.append(")\n        ");
        InterfaceC37591dj LJ = this.LIZ.LJ(sb.toString());
        LJ.LJIIIZ(1, j);
        Iterator<Integer> it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            LJ.LJIIIZ(i, it.next().intValue());
            i++;
        }
        this.LIZ.LIZJ();
        try {
            LJ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }
}
