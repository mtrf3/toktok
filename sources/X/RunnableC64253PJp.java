package X;

import com.bytedance.crash.CrashType;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* renamed from: X.PJp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64253PJp implements Runnable {
    public final /* synthetic */ JSONObject LJLIL;
    public final /* synthetic */ File LJLILLLLZI;
    public final /* synthetic */ File LJLJI;
    public final /* synthetic */ CountDownLatch LJLJJI;
    public final /* synthetic */ PK3 LJLJJL;

    public final void LIZ() {
        CrashType crashType;
        String LJI;
        if (this.LJLJJL.LIZIZ) {
            crashType = CrashType.LAUNCH;
        } else {
            crashType = CrashType.JAVA;
        }
        String name = crashType.getName();
        if (this.LJLJJL.LIZIZ) {
            LJI = PK0.LJIIIIZZ.getLaunchCrashUploadUrl();
        } else {
            LJI = C63986P9i.LJI();
        }
        if (C63986P9i.LJIIJ(name, C63986P9i.LJFF(LJI, this.LJLIL.optJSONObject("header")), this.LJLIL.toString(), null, new PK7(new File[]{this.LJLILLLLZI}, true)).LIZ()) {
            PK8.LIZJ(this.LJLJI);
        }
        this.LJLJJI.countDown();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC64253PJp(PK3 pk3, JSONObject jSONObject, File file, File file2, CountDownLatch countDownLatch) {
        this.LJLJJL = pk3;
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = file;
        this.LJLJI = file2;
        this.LJLJJI = countDownLatch;
    }
}
