package X;

import Y.IDComparatorS39S0000000_11;
import android.os.Process;
import android.util.Pair;
import defpackage.g0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.PHx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64209PHx extends PMI {
    public final List<Double> LIZIZ;
    public final List<C64191PHf> LIZJ;
    public final List<C64191PHf> LIZLLL;
    public final C64210PHy LJ;
    public C64198PHm LJFF;
    public long LJI;
    public boolean LJII;

    public final void LJIILL() {
        BufferedReader bufferedReader;
        String[] split;
        long parseLong;
        int i = 1000;
        int i2 = 41;
        BufferedReader bufferedReader2 = null;
        if (((CopyOnWriteArrayList) this.LIZJ).isEmpty()) {
            int myPid = Process.myPid();
            List<C64191PHf> list = this.LIZJ;
            File[] listFiles = new File(C0NY.LIZIZ("/proc/", myPid, "/task/")).listFiles();
            long LIZ = C36844Ed6.LIZ();
            int length = listFiles.length;
            int i3 = 0;
            while (i3 < length) {
                try {
                    String path = listFiles[i3].getPath();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(path);
                    LIZ2.append("/stat");
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ2))), i);
                    try {
                        String readLine = bufferedReader3.readLine();
                        int lastIndexOf = readLine.lastIndexOf(i2);
                        String substring = readLine.substring(0, lastIndexOf);
                        String substring2 = readLine.substring(lastIndexOf + 4);
                        int indexOf = substring.indexOf(40);
                        int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                        String substring3 = substring.substring(indexOf + 1);
                        String[] split2 = substring2.split(" ");
                        long parseLong2 = Long.parseLong(split2[10]) + Long.parseLong(split2[11]);
                        if (intValue != 0 && !substring3.isEmpty() && parseLong2 != 0 && !C16880lQ.LLLLIIIILLL().getName().contains(substring3)) {
                            C64191PHf c64191PHf = new C64191PHf();
                            c64191PHf.LIZIZ = substring3;
                            c64191PHf.LIZ = intValue;
                            c64191PHf.LIZJ = parseLong2;
                            c64191PHf.LJI = LIZ;
                            c64191PHf.LJII = Integer.parseInt(split2[14]);
                            ((CopyOnWriteArrayList) list).add(c64191PHf);
                        }
                        g0.LJJIJL(bufferedReader3);
                        bufferedReader2 = bufferedReader3;
                    } catch (Throwable unused) {
                        bufferedReader2 = bufferedReader3;
                        g0.LJJIJL(bufferedReader2);
                        i3++;
                        i = 1000;
                        i2 = 41;
                    }
                } catch (Throwable unused2) {
                }
                i3++;
                i = 1000;
                i2 = 41;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("over process threshold, first collect thread info, list size: ");
            LIZ3.append(((CopyOnWriteArrayList) this.LIZJ).size());
            LIZ(X1D.LIZIZ(LIZ3));
            return;
        }
        int myPid2 = Process.myPid();
        List<C64191PHf> list2 = this.LIZJ;
        double d = this.LJFF.LJ;
        LinkedList linkedList = new LinkedList();
        String LIZIZ = C0NY.LIZIZ("/proc/", myPid2, "/task/");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("size: ");
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
        LIZ4.append(copyOnWriteArrayList.size());
        C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ4));
        long LIZ5 = C36844Ed6.LIZ();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C64191PHf c64191PHf2 = (C64191PHf) it.next();
            if (c64191PHf2 != null) {
                try {
                    try {
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append(LIZIZ);
                        LIZ6.append(c64191PHf2.LIZ);
                        LIZ6.append("/stat");
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ6))), 1000);
                        try {
                            String readLine2 = bufferedReader.readLine();
                            split = readLine2.substring(readLine2.lastIndexOf(41) + 4).split(" ");
                            parseLong = Long.parseLong(split[10]) + Long.parseLong(split[11]);
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        float f = ((float) (parseLong - c64191PHf2.LIZJ)) / ((float) (LIZ5 - c64191PHf2.LJI));
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append(c64191PHf2.LIZIZ);
                        LIZ7.append(" judge: ");
                        LIZ7.append(parseLong);
                        LIZ7.append(" ");
                        LIZ7.append(c64191PHf2.LIZJ);
                        LIZ7.append(" ");
                        LIZ7.append(f);
                        LIZ7.append(" ");
                        LIZ7.append(d);
                        C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ7));
                        double d2 = f;
                        if (d2 < d) {
                            linkedList.add(c64191PHf2);
                        } else {
                            c64191PHf2.LIZLLL = d2;
                            c64191PHf2.LJII = Integer.parseInt(split[18]);
                        }
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append("after item: ");
                        LIZ8.append(c64191PHf2);
                        C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ8));
                        C38891fp.LJIIJJI(bufferedReader);
                        bufferedReader2 = bufferedReader;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader2 = bufferedReader;
                        try {
                            StringBuilder LIZ9 = X1D.LIZ();
                            LIZ9.append("error: ");
                            LIZ9.append(th.getLocalizedMessage());
                            C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ9));
                        } finally {
                            C38891fp.LJIIJJI(bufferedReader2);
                        }
                    }
                } catch (Throwable unused3) {
                    linkedList.add(c64191PHf2);
                }
            }
        }
        copyOnWriteArrayList.removeAll(linkedList);
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append("after size: ");
        LIZ10.append(copyOnWriteArrayList.size());
        C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ10));
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append("over process threshold, second collect thread info, list size after filter is: ");
        LIZ11.append(((CopyOnWriteArrayList) this.LIZJ).size());
        LIZ(X1D.LIZIZ(LIZ11));
        if (((CopyOnWriteArrayList) this.LIZJ).isEmpty()) {
            return;
        }
        if (((CopyOnWriteArrayList) this.LIZJ).size() > 10) {
            ((CopyOnWriteArrayList) this.LIZJ).clear();
            return;
        }
        if (C64207PHv.LIZ.LIZ()) {
            ThreadGroup threadGroup = C16880lQ.LLJJJJ().getThread().getThreadGroup();
            int activeCount = threadGroup.activeCount();
            int i4 = (activeCount / 2) + activeCount;
            Thread[] threadArr = new Thread[i4];
            threadGroup.enumerate(threadArr);
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < i4; i5++) {
                Thread thread = threadArr[i5];
                if (thread == null) {
                    break;
                }
                if (thread != C16880lQ.LLLLIIIILLL()) {
                    ListIterator listIterator = ((CopyOnWriteArrayList) this.LIZJ).listIterator();
                    while (listIterator.hasNext()) {
                        C64191PHf c64191PHf3 = (C64191PHf) listIterator.next();
                        if (c64191PHf3 != null && (c64191PHf3.LIZIZ.equals(thread.getName()) || (thread.getName().length() > 15 && c64191PHf3.LIZIZ.equals(thread.getName().substring(0, 15))))) {
                            if (c64191PHf3.LIZ != Process.myPid() || this.LJFF.LIZIZ) {
                                int i6 = 0;
                                for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                                    i6++;
                                    sb.append("\tat ");
                                    sb.append(stackTraceElement.getClassName());
                                    sb.append(".");
                                    sb.append(stackTraceElement.getMethodName());
                                    sb.append("(");
                                    sb.append(stackTraceElement.getFileName());
                                    sb.append(":");
                                    sb.append(stackTraceElement.getLineNumber());
                                    sb.append(")\n");
                                    if (i6 > 40) {
                                        break;
                                    }
                                }
                                c64191PHf3.LJFF = sb.toString();
                                c64191PHf3.LJ = c64191PHf3.LIZLLL / this.LJFF.LJ;
                                ((CopyOnWriteArrayList) this.LIZLLL).add(c64191PHf3);
                                sb.setLength(0);
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(this.LIZJ, new IDComparatorS39S0000000_11(34));
        LinkedList linkedList2 = new LinkedList();
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            linkedList2.add(new C64206PHu(((C64191PHf) it2.next()).LIZLLL));
        }
        C64184PGy c64184PGy = C64157PFx.LIZ;
        synchronized (c64184PGy) {
            c64184PGy.LIZLLL = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList2);
        }
        ((CopyOnWriteArrayList) this.LIZJ).clear();
    }

    public final void LJIILLIIL() {
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        ((CopyOnWriteArrayList) this.LIZLLL).clear();
        ((CopyOnWriteArrayList) this.LIZJ).clear();
        this.LJI = 0L;
        C64071PCp.LIZ(PD6.CPU).LIZIZ(this.LJ);
    }

    @Override // X.PMI
    public final void LJII() {
        super.LJII();
        LJIILLIIL();
    }

    @Override // X.PMI
    public final PI8 LJIIIIZZ() {
        return PI8.THREAD_DETECT;
    }

    public C64209PHx(PI1 pi1) {
        super(pi1);
        this.LIZIZ = new CopyOnWriteArrayList();
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LIZJ = new CopyOnWriteArrayList();
        this.LJ = new C64210PHy(this);
    }

    @Override // X.PMI
    public final void LJI(boolean z) {
        super.LJI(z);
        LJIILLIIL();
        PI1 pi1 = (PI1) this.LIZ;
        synchronized (pi1) {
            pi1.LIZ(pi1.LJIIJJI);
        }
    }

    @Override // X.PMI
    public final void LJFF(C64198PHm c64198PHm, boolean z) {
        super.LJFF(c64198PHm, z);
        this.LJFF = c64198PHm;
        this.LJI = System.currentTimeMillis();
        this.LJII = z;
        C64071PCp.LIZ(PD6.CPU).LIZJ(this.LJ);
    }
}
