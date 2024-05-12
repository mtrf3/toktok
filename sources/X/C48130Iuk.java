package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Iuk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48130Iuk {
    public final List<String> LIZ;
    public final C48128Iui LIZIZ;
    public int LIZJ;
    public String LIZLLL;

    public final synchronized String LIZ() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (((ArrayList) this.LIZ).size() > i) {
            String str = (String) ListProtector.get(this.LIZ, i);
            this.LIZLLL = str;
            return str;
        }
        return "";
    }

    public final synchronized String LIZJ() {
        if (C38354F3m.LJ(this.LIZLLL)) {
            int size = ((ArrayList) this.LIZ).size();
            int i = this.LIZJ;
            if (size > i) {
                this.LIZLLL = (String) ListProtector.get(this.LIZ, i);
            }
        }
        return this.LIZLLL;
    }

    public final synchronized void LIZLLL() {
        C48129Iuj c48129Iuj = (C48129Iuj) this.LIZIZ;
        c48129Iuj.LIZIZ = 0;
        c48129Iuj.LIZJ = 0;
        this.LIZLLL = null;
        this.LIZJ = 0;
    }

    public final synchronized Pair<String, Long> LIZIZ(C64598PWw c64598PWw) {
        String LIZJ;
        long LIZ;
        LIZJ = LIZJ();
        LIZ = this.LIZIZ.LIZ(c64598PWw);
        if (LIZ == -1) {
            C48129Iuj c48129Iuj = (C48129Iuj) this.LIZIZ;
            c48129Iuj.LIZIZ = 0;
            c48129Iuj.LIZJ = 0;
            LIZJ = LIZ();
            if (!TextUtils.isEmpty(LIZJ)) {
                this.LIZIZ.getClass();
                LIZ = (long) ((Math.random() * 4500.0d) + 500.0d);
            }
        }
        return new Pair<>(LIZJ, Long.valueOf(LIZ));
    }

    public C48130Iuk(List<String> list, C48128Iui c48128Iui) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.LIZIZ = c48128Iui;
        LIZLLL();
    }
}
