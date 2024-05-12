package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Pb2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64744Pb2 extends RunnableC39007FSp {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ List LJLJJLL;

    public final void LIZJ() {
        C64771PbT c64771PbT;
        synchronized (C64771PbT.class) {
            if (C64771PbT.LIZIZ == null) {
                C64771PbT.LIZIZ = new C64771PbT();
            }
            c64771PbT = C64771PbT.LIZIZ;
        }
        String str = this.LJLJJL;
        List list = this.LJLJJLL;
        C64766PbO c64766PbO = (C64766PbO) ((ConcurrentHashMap) c64771PbT.LIZ).get(str);
        if (c64766PbO != null) {
            c64766PbO.LIZJ = new C64781Pbd(list);
            c64766PbO.LIZIZ.countDown();
            ((ConcurrentHashMap) c64771PbT.LIZ).remove(str);
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64744Pb2(String str, String str2, int i, int i2, int i3, List list, String str3) {
        super((Object) null);
        this.LJLJJL = str;
        this.LJLJJLL = list;
    }
}
