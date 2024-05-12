package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* renamed from: X.FMv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38857FMv extends PthreadThread {
    public final FA1 LJLIL;
    public final ArrayList<InterfaceC38856FMu> LJLILLLLZI;
    public String LJLJI;

    public final void LIZLLL() {
        boolean z;
        String readLine;
        super.run();
        for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
            InterfaceC38856FMu interfaceC38856FMu = (InterfaceC38856FMu) ListProtector.get(this.LJLILLLLZI, i);
            if (interfaceC38856FMu.LIZLLL() && interfaceC38856FMu.LIZJ()) {
                this.LJLJI = null;
                int i2 = 0;
                do {
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    int i3 = 0;
                    do {
                        try {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("/sys/devices/system/cpu/cpu");
                            LIZ.append(i3);
                            LIZ.append("/cpufreq/scaling_cur_freq");
                            RandomAccessFile randomAccessFile = new RandomAccessFile(X1D.LIZIZ(LIZ), "r");
                            readLine = randomAccessFile.readLine();
                            randomAccessFile.close();
                        } catch (Throwable unused) {
                        }
                        if (i3 == 0 && this.LJLJI == null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("/sys/devices/system/cpu/cpu");
                            LIZ2.append(i3);
                            LIZ2.append("/cpufreq/cpuinfo_max_freq");
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(X1D.LIZIZ(LIZ2), "r");
                            String readLine2 = randomAccessFile2.readLine();
                            randomAccessFile2.close();
                            if (!readLine2.equals(readLine)) {
                                if (CastFloatProtector.parseFloat(readLine) / CastFloatProtector.parseFloat(readLine2) < 0.75d) {
                                    z = false;
                                    break;
                                }
                            }
                            this.LJLJI = readLine;
                        } else if (!readLine.equals(this.LJLJI)) {
                            z = false;
                            break;
                        }
                        i3++;
                    } while (i3 < 3);
                    i2++;
                } while (i2 < 5);
                z = true;
                interfaceC38856FMu.LIZIZ(z);
                if (z) {
                    int type = interfaceC38856FMu.getType();
                    C92J.LIZ.LIZJ = type;
                    C47704Ins.LJI(type + 768);
                    return;
                }
            }
        }
        C92J.LIZ.LIZJ = 255;
        C47704Ins.LJI(1023);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C38857FMv(ArrayList<InterfaceC38856FMu> arrayList, FA1 fa1) {
        super("DeviceChecker$CheckThread");
        this.LJLILLLLZI = arrayList;
        this.LJLIL = fa1;
    }
}
