package X;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1CD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CD implements InterfaceC262911l, InterfaceC262811k {
    public static final TreeMap<Integer, C1CD> LJLJLLL = new TreeMap<>();
    public volatile String LJLIL;
    public final long[] LJLILLLLZI;
    public final double[] LJLJI;
    public final String[] LJLJJI;
    public final byte[][] LJLJJL;
    public final int[] LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void LIZLLL() {
        TreeMap<Integer, C1CD> treeMap = LJLJLLL;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.LJLJL), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // X.InterfaceC262911l
    public final String LIZIZ() {
        return this.LJLIL;
    }

    public C1CD(int i) {
        this.LJLJL = i;
        int i2 = i + 1;
        this.LJLJJLL = new int[i2];
        this.LJLILLLLZI = new long[i2];
        this.LJLJI = new double[i2];
        this.LJLJJI = new String[i2];
        this.LJLJJL = new byte[i2];
    }

    @Override // X.InterfaceC262911l
    public final void LIZ(InterfaceC262811k interfaceC262811k) {
        for (int i = 1; i <= this.LJLJLJ; i++) {
            int i2 = this.LJLJJLL[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                interfaceC262811k.LJJIIZ(i, this.LJLJJL[i]);
                            }
                        } else {
                            interfaceC262811k.LJJII(i, this.LJLJJI[i]);
                        }
                    } else {
                        interfaceC262811k.LLJJIJI(this.LJLJI[i], i);
                    }
                } else {
                    interfaceC262811k.LJIIIZ(i, this.LJLILLLLZI[i]);
                }
            } else {
                interfaceC262811k.LLLLLLJ(i);
            }
        }
    }

    @Override // X.InterfaceC262811k
    public final void LLLLLLJ(int i) {
        this.LJLJJLL[i] = 1;
    }

    public static C1CD LIZJ(int i, String str) {
        TreeMap<Integer, C1CD> treeMap = LJLJLLL;
        synchronized (treeMap) {
            Map.Entry<Integer, C1CD> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C1CD value = ceilingEntry.getValue();
                value.LJLIL = str;
                value.LJLJLJ = i;
                return value;
            }
            C1CD c1cd = new C1CD(i);
            c1cd.LJLIL = str;
            c1cd.LJLJLJ = i;
            return c1cd;
        }
    }

    @Override // X.InterfaceC262811k
    public final void LJIIIZ(int i, long j) {
        this.LJLJJLL[i] = 2;
        this.LJLILLLLZI[i] = j;
    }

    @Override // X.InterfaceC262811k
    public final void LJJII(int i, String str) {
        this.LJLJJLL[i] = 4;
        this.LJLJJI[i] = str;
    }

    @Override // X.InterfaceC262811k
    public final void LJJIIZ(int i, byte[] bArr) {
        this.LJLJJLL[i] = 5;
        this.LJLJJL[i] = bArr;
    }

    @Override // X.InterfaceC262811k
    public final void LLJJIJI(double d, int i) {
        this.LJLJJLL[i] = 3;
        this.LJLJI[i] = d;
    }
}
