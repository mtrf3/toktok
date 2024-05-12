package X;

import com.bytedance.ies.smartmovie.jni.IMusicNetworkDelegate;
import com.google.gson.m;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS157S0100000_7;

/* renamed from: X.Hnb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45139Hnb extends IMusicNetworkDelegate {
    public final java.util.Map<String, C10H> LIZ = new LinkedHashMap();
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C45144Hng.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 539));
    public InterfaceC45141Hnd LIZLLL;

    public static m LIZ(Throwable th) {
        String str;
        m mVar = new m();
        mVar.LJJIIZ("exception_msg", th.getMessage());
        Throwable cause = th.getCause();
        if (cause == null || (str = cause.getLocalizedMessage()) == null) {
            str = "";
        }
        mVar.LJJIIZ("exception_cause_msg", str);
        return mVar;
    }

    @Override // com.bytedance.ies.smartmovie.jni.IMusicNetworkDelegate
    public final void cancel(String str) {
        C76800UCe c76800UCe;
        if (str == null) {
            return;
        }
        try {
            C10H c10h = (C10H) ((LinkedHashMap) this.LIZ).get(str);
            if (c10h != null) {
                c10h.LIZ();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        this.LIZ.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Type inference failed for: r1v43, types: [T, java.lang.Long] */
    @Override // com.bytedance.ies.smartmovie.jni.IMusicNetworkDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void request(com.bytedance.ies.smartmovie.jni.MusicRequestParams r31, com.bytedance.ies.smartmovie.jni.CommonRequestCallback r32) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45139Hnb.request(com.bytedance.ies.smartmovie.jni.MusicRequestParams, com.bytedance.ies.smartmovie.jni.CommonRequestCallback):void");
    }
}
