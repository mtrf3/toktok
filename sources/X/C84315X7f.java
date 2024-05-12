package X;

import com.tencent.wcdb.CursorWindow;
import defpackage.i0;
import java.util.HashMap;

/* renamed from: X.X7f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84315X7f extends AbstractC84317X7h {
    public static final C84323X7n LJZI = new C84323X7n();
    public final String[] LJLLJ;
    public final C84312X7c LJLLL;
    public final InterfaceC84324X7o LJLLLL;
    public int LJLZ;
    public int LJLLLLLL = -1;
    public java.util.Map<String, Integer> LJZ = null;

    @Override // X.AbstractC84318X7i
    public final void finalize() {
        try {
            if (this.LJLLILLLL != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
    public final int getCount() {
        if (this.LJLLLLLL == -1) {
            LIZLLL(0);
        }
        return this.LJLLLLLL;
    }

    @Override // X.AbstractC84318X7i, android.database.Cursor
    public final boolean requery() {
        if (this.LJLJI) {
            return false;
        }
        synchronized (this) {
            if (!this.LJLLL.LJLIL.isOpen()) {
                return false;
            }
            CursorWindow cursorWindow = this.LJLLILLLL;
            if (cursorWindow != null) {
                cursorWindow.LJ();
            }
            this.LJLIL = -1;
            this.LJLLLLLL = -1;
            this.LJLLLL.getClass();
            try {
                super.requery();
                return true;
            } catch (IllegalStateException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("requery() failed ");
                LIZ.append(e.getMessage());
                com.tencent.wcdb.support.Log.LJFF(X1D.LIZIZ(LIZ), e);
                return false;
            }
        }
    }

    @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        synchronized (this) {
            this.LJLLL.LIZLLL();
            this.LJLLLL.getClass();
        }
    }

    @Override // X.AbstractC84318X7i, android.database.Cursor
    public final void deactivate() {
        LIZ();
        this.LJLLLL.getClass();
    }

    @Override // X.AbstractC84318X7i, android.database.Cursor
    public final String[] getColumnNames() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC84318X7i
    public final void LIZIZ(int i) {
        int i2;
        CursorWindow cursorWindow = this.LJLLILLLL;
        if (cursorWindow == null || i < (i2 = cursorWindow.mStartPos) || i >= cursorWindow.LJIILIIL() + i2) {
            LIZLLL(i);
        }
    }

    public final void LIZLLL(int i) {
        String LJIJI = this.LJLLL.LJLIL.LJIJI();
        CursorWindow cursorWindow = this.LJLLILLLL;
        if (cursorWindow == null) {
            this.LJLLILLLL = new CursorWindow(LJIJI);
        } else {
            cursorWindow.LJ();
        }
        try {
            if (this.LJLLLLLL == -1) {
                this.LJLLLLLL = this.LJLLL.LJIIJ(this.LJLLILLLL, Math.max(i, 0), i, true);
                this.LJLZ = this.LJLLILLLL.LJIILIIL();
            } else {
                this.LJLLL.LJIIJ(this.LJLLILLLL, Math.max(i - (this.LJLZ / 3), 0), i, false);
            }
        } catch (RuntimeException e) {
            CursorWindow cursorWindow2 = this.LJLLILLLL;
            if (cursorWindow2 != null) {
                cursorWindow2.close();
                this.LJLLILLLL = null;
            }
            throw e;
        }
    }

    @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
    public final int getColumnIndex(String str) {
        if (this.LJZ == null) {
            String[] strArr = this.LJLLJ;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.LJZ = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            com.tencent.wcdb.support.Log.LIZIZ("WCDB.SQLiteCursor", i0.LJFF("requesting column name with table name -- ", str), new Exception());
            str = str.substring(lastIndexOf + 1);
        }
        Integer num = this.LJZ.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public C84315X7f(C84316X7g c84316X7g, C84312X7c c84312X7c) {
        int i = -1;
        this.LJLLLL = c84316X7g;
        this.LJLLL = c84312X7c;
        String[] strArr = c84312X7c.LJLJJI;
        this.LJLLJ = strArr;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (strArr[i2].equals("_id")) {
                i = i2;
                break;
            }
            i2++;
        }
        this.LJLILLLLZI = i;
    }
}
