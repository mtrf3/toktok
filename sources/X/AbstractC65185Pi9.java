package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import defpackage.b1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Pi9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65185Pi9<T> {
    public final Context LIZ;
    public final InterfaceC58211Msx<T> LIZIZ;
    public final C54845Lfl LIZJ;
    public final InterfaceC65195PiJ LIZLLL;
    public final int LJ;
    public final List<InterfaceC65194PiI> LJFF = new CopyOnWriteArrayList();

    public final List<File> LIZ() {
        C65188PiC c65188PiC = (C65188PiC) this.LIZLLL;
        c65188PiC.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : c65188PiC.LIZLLL.listFiles()) {
            arrayList.add(file);
            if (arrayList.size() >= 1) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZIZ() {
        FileInputStream fileInputStream;
        boolean z = false;
        if (!((C65188PiC) this.LIZLLL).LIZJ.LIZJ()) {
            UUID randomUUID = UUID.randomUUID();
            StringBuilder LIZJ = b1.LIZJ("se", "_");
            LIZJ.append(randomUUID.toString());
            LIZJ.append("_");
            this.LIZJ.getClass();
            LIZJ.append(System.currentTimeMillis());
            LIZJ.append(".tap");
            String LIZIZ = X1D.LIZIZ(LIZJ);
            C65188PiC c65188PiC = (C65188PiC) this.LIZLLL;
            c65188PiC.LIZJ.close();
            File file = c65188PiC.LIZIZ;
            File file2 = new File(c65188PiC.LIZLLL, LIZIZ);
            FileInputStream fileInputStream2 = null;
            try {
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream3.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        C78841Uwv.LJIIIIZZ(fileInputStream3);
                        C78841Uwv.LJIIIIZZ(fileOutputStream);
                        C16880lQ.LLLZZIL(file);
                        c65188PiC.LIZJ = new C65182Pi6(c65188PiC.LIZIZ);
                        Context context = this.LIZ;
                        C16880lQ.LLLZI(Locale.US, "generated new file %s", new Object[]{LIZIZ});
                        if (C78841Uwv.LJIJJLI(context)) {
                            C65265PjR.LIZIZ().getClass();
                        }
                        this.LIZJ.getClass();
                        System.currentTimeMillis();
                        z = true;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileOutputStream;
                        fileInputStream = fileInputStream2;
                        fileInputStream2 = fileInputStream3;
                        C78841Uwv.LJIIIIZZ(fileInputStream2);
                        C78841Uwv.LJIIIIZZ(fileInputStream);
                        C16880lQ.LLLZZIL(file);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJFF).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65194PiI) it.next()).LIZ();
            } catch (Exception unused) {
                C78841Uwv.LJJI(this.LIZ);
            }
        }
        return z;
    }

    public final void LIZJ(T t) {
        boolean z;
        int LJIIJ;
        int i;
        C65192PiG c65192PiG = (C65192PiG) this.LIZIZ;
        c65192PiG.getClass();
        byte[] bytes = GsonProtectorUtils.toJson(c65192PiG.LIZ, t).getBytes("UTF-8");
        int length = bytes.length;
        if (((C65188PiC) this.LIZLLL).LIZJ.LJI() + 4 + length <= 8000) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C16880lQ.LLLZI(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(((C65188PiC) this.LIZLLL).LIZJ.LJI()), Integer.valueOf(length), Integer.valueOf(LiveCenterDelayLoadSetting.DEFAULT)});
            if (C78841Uwv.LJIJJLI(this.LIZ)) {
                C65265PjR.LIZIZ().getClass();
            }
            LIZIZ();
        }
        C65182Pi6 c65182Pi6 = ((C65188PiC) this.LIZLLL).LIZJ;
        c65182Pi6.getClass();
        int length2 = bytes.length;
        synchronized (c65182Pi6) {
            if (length2 >= 0) {
                if (length2 <= bytes.length) {
                    c65182Pi6.LIZ(length2);
                    boolean LIZJ = c65182Pi6.LIZJ();
                    if (LIZJ) {
                        LJIIJ = 16;
                    } else {
                        C65184Pi8 c65184Pi8 = c65182Pi6.LJLJJL;
                        LJIIJ = c65182Pi6.LJIIJ(c65184Pi8.LIZ + 4 + c65184Pi8.LIZIZ);
                    }
                    C65184Pi8 c65184Pi82 = new C65184Pi8(LJIIJ, length2);
                    byte[] bArr = c65182Pi6.LJLJJLL;
                    bArr[0] = (byte) (length2 >> 24);
                    bArr[1] = (byte) (length2 >> 16);
                    bArr[2] = (byte) (length2 >> 8);
                    bArr[3] = (byte) length2;
                    c65182Pi6.LJFF(LJIIJ, bArr, 4);
                    c65182Pi6.LJFF(LJIIJ + 4, bytes, length2);
                    if (LIZJ) {
                        i = LJIIJ;
                    } else {
                        i = c65182Pi6.LJLJJI.LIZ;
                    }
                    c65182Pi6.LJIIJJI(c65182Pi6.LJLILLLLZI, c65182Pi6.LJLJI + 1, i, LJIIJ);
                    c65182Pi6.LJLJJL = c65184Pi82;
                    c65182Pi6.LJLJI++;
                    if (LIZJ) {
                        c65182Pi6.LJLJJI = c65184Pi82;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public AbstractC65185Pi9(Context context, C65192PiG c65192PiG, C54845Lfl c54845Lfl, InterfaceC65195PiJ interfaceC65195PiJ) {
        this.LIZ = C16880lQ.LLLLL(context);
        this.LIZIZ = c65192PiG;
        this.LIZLLL = interfaceC65195PiJ;
        this.LIZJ = c54845Lfl;
        System.currentTimeMillis();
        this.LJ = 100;
    }
}
