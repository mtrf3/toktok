package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PHe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64190PHe implements InterfaceC64036PBg {
    public final double LIZ;
    public final double LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final List<C64191PHf> LJ;

    @Override // X.InterfaceC64036PBg
    public final String LIZIZ() {
        return "cpu_exception_trace";
    }

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:3:0x0007, B:6:0x003b, B:7:0x0046, B:10:0x0060, B:12:0x0068, B:13:0x0073, B:14:0x009f, B:16:0x00a5, B:19:0x00ad, B:22:0x00b6, B:30:0x00f8, B:34:0x006c, B:35:0x0041), top: B:2:0x0007 }] */
    @Override // X.InterfaceC64036PBg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZ() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64190PHe.LIZ():org.json.JSONObject");
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        List<C64191PHf> list = this.LJ;
        if (list != null && !((ArrayList) list).isEmpty() && this.LIZ > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && this.LIZIZ > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return true;
        }
        return false;
    }

    public C64190PHe(double d, double d2, List<C64191PHf> list, String str, boolean z) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = new ArrayList(list);
    }
}
