package X;

import com.bytedance.crash.vmMonitor.NativeVMMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PKx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64287PKx {
    public final int LIZ;
    public final long LIZIZ = System.currentTimeMillis();
    public final long LIZJ;
    public final int LIZLLL;
    public final ArrayList<Integer> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C64287PKx(int i, int i2) {
        this.LIZ = i;
        this.LIZLLL = i2;
        NativeVMMonitor.LJI().getClass();
        this.LIZJ = Math.max(0, NativeVMMonitor.LJ(7));
        this.LJ = new ArrayList<>();
        Iterator it = ((HashMap) C64272PKi.LIZJ).entrySet().iterator();
        while (it.hasNext()) {
            this.LJ.add(((Map.Entry) it.next()).getValue());
        }
    }
}
