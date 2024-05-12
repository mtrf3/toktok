package X;

import Y.IDRunnableS85S0100000;
import android.database.sqlite.SQLiteException;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0BR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BR {
    public static final String[] LJIIJJI = {"UPDATE", "DELETE", "INSERT"};
    public final String[] LIZIZ;
    public final java.util.Map<String, java.util.Set<String>> LIZJ;
    public final AbstractC03300Ba LIZLLL;
    public volatile InterfaceC37591dj LJI;
    public final C0BO LJII;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public volatile boolean LJFF = false;
    public final SafeIterableMap<C0BP, C0BQ> LJIIIIZZ = new SafeIterableMap<>();
    public final Object LJIIIZ = new Object();
    public final IDRunnableS85S0100000 LJIIJ = new IDRunnableS85S0100000(this, 31);
    public final HashMap<String, Integer> LIZ = new HashMap<>();

    public final boolean LIZIZ() {
        InterfaceC262211e interfaceC262211e = this.LIZLLL.LIZ;
        if (interfaceC262211e == null || !interfaceC262211e.isOpen()) {
            return false;
        }
        if (!this.LJFF) {
            this.LIZLLL.LIZLLL.LJLJLLL();
        }
        if (this.LJFF) {
            return true;
        }
        return false;
    }

    public final void LIZ(C0BP c0bp) {
        C0BQ putIfAbsent;
        InterfaceC262211e interfaceC262211e;
        String[] strArr = c0bp.LIZ;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.LIZJ.containsKey(lowerCase)) {
                hashSet.addAll(this.LIZJ.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int[] iArr = new int[strArr2.length];
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.LIZ.get(strArr2[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("There is no table with name ");
                LIZ.append(strArr2[i]);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        C0BQ c0bq = new C0BQ(c0bp, iArr, strArr2);
        synchronized (this.LJIIIIZZ) {
            putIfAbsent = this.LJIIIIZZ.putIfAbsent(c0bp, c0bq);
        }
        if (putIfAbsent == null && this.LJII.LIZIZ(iArr) && (interfaceC262211e = this.LIZLLL.LIZ) != null && interfaceC262211e.isOpen()) {
            LJ(this.LIZLLL.LIZLLL.LJLJLLL());
        }
    }

    public final void LIZJ(C0BP c0bp) {
        C0BQ remove;
        InterfaceC262211e interfaceC262211e;
        synchronized (this.LJIIIIZZ) {
            remove = this.LJIIIIZZ.remove(c0bp);
        }
        if (remove != null && this.LJII.LIZJ(remove.LIZ) && (interfaceC262211e = this.LIZLLL.LIZ) != null && interfaceC262211e.isOpen()) {
            LJ(this.LIZLLL.LIZLLL.LJLJLLL());
        }
    }

    public final void LJ(InterfaceC262211e interfaceC262211e) {
        if (interfaceC262211e.LJJJ()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.LIZLLL.LJIIIIZZ.readLock();
            readLock.lock();
            try {
                synchronized (this.LJIIIZ) {
                    int[] LIZ = this.LJII.LIZ();
                    if (LIZ == null) {
                        return;
                    }
                    int length = LIZ.length;
                    if (interfaceC262211e.D()) {
                        interfaceC262211e.LJIL();
                    } else {
                        interfaceC262211e.LJII();
                    }
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = LIZ[i];
                            if (i2 == 1) {
                                LIZLLL(i, interfaceC262211e);
                            } else if (i2 == 2) {
                                String str = this.LIZIZ[i];
                                StringBuilder sb = new StringBuilder();
                                for (String str2 : LJIIJJI) {
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    interfaceC262211e.LJJIJIIJI(sb.toString());
                                }
                            }
                        } finally {
                            interfaceC262211e.LJJIJLIJ();
                        }
                    }
                    interfaceC262211e.LJJIJL();
                    readLock.unlock();
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }

    public final void LIZLLL(int i, InterfaceC262211e interfaceC262211e) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        LIZ.append(i);
        LIZ.append(", 0)");
        interfaceC262211e.LJJIJIIJI(X1D.LIZIZ(LIZ));
        String str = this.LIZIZ[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : LJIIJJI) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            YE1.LIZLLL(sb, str, "_", str2, "`");
            YE1.LIZLLL(sb, " AFTER ", str2, " ON `", str);
            YE1.LIZLLL(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            YE1.LIZLLL(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            interfaceC262211e.LJJIJIIJI(sb.toString());
        }
    }

    public C0BR(AbstractC03300Ba abstractC03300Ba, java.util.Map<String, String> map, java.util.Map<String, java.util.Set<String>> map2, String... strArr) {
        this.LIZLLL = abstractC03300Ba;
        this.LJII = new C0BO(strArr.length);
        this.LIZJ = map2;
        new C0BN();
        int length = strArr.length;
        this.LIZIZ = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.LIZ.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) ((HashMap) map).get(strArr[i]);
            if (str2 != null) {
                this.LIZIZ[i] = str2.toLowerCase(locale);
            } else {
                this.LIZIZ[i] = lowerCase;
            }
        }
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.LIZ.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.LIZ;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }
}
