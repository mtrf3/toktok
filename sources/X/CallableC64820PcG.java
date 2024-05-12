package X;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.PcG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC64820PcG implements Callable<Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C64672PZs LJLJJI;
    public final /* synthetic */ Throwable LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL = null;
    public final /* synthetic */ C64819PcF LJLJL;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C64819PcF c64819PcF = this.LJLJL;
        long j = this.LJLIL;
        long j2 = this.LJLILLLLZI;
        String str = this.LJLJI;
        C64672PZs c64672PZs = this.LJLJJI;
        Throwable th = this.LJLJJL;
        c64819PcF.getClass();
        FUA.LIZIZ("aweme_image_api", "", C64819PcF.LIZIZ(false, j, j2, str, c64672PZs, th));
        try {
            String[] strArr = new String[1];
            C64920Pds.LIZIZ(this.LJLJJL, strArr);
            if (C38354F3m.LJ(strArr[0])) {
                C64672PZs c64672PZs2 = this.LJLJJI;
            }
            JSONObject jSONObject = this.LJLJJLL;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C64819PcF.LIZJ(this.LJLJJI, jSONObject);
            if (C09970aH.LJII()) {
                throw new RuntimeException("ImageMonitor has not worked, please use ByteFresco or ByteGlide");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public CallableC64820PcG(C64819PcF c64819PcF, long j, long j2, String str, C64672PZs c64672PZs, Throwable th) {
        this.LJLJL = c64819PcF;
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = str;
        this.LJLJJI = c64672PZs;
        this.LJLJJL = th;
    }
}
