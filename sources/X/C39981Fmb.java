package X;

import Y.ARunnableS1S1400000_6;
import android.text.TextUtils;
import android.util.LruCache;
import com.lynx.tasm.base.LLog;

/* renamed from: X.Fmb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39981Fmb {
    public static C39981Fmb LIZIZ;
    public final LruCache<String, Integer> LIZ = new LruCache<>(100);

    public final void LIZ(C39984Fme c39984Fme, InterfaceC39983Fmd interfaceC39983Fmd) {
        C39982Fmc c39982Fmc = new C39982Fmc();
        String str = c39984Fme.LIZ;
        if (TextUtils.isEmpty(str)) {
            c39982Fmc.LIZIZ = "url is empty!";
            interfaceC39983Fmd.LIZIZ(c39982Fmc);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("url:");
            LIZ.append(str);
            LIZ.append(" is empty!");
            LLog.LIZLLL(3, "lynx_ResManager", X1D.LIZIZ(LIZ));
            return;
        }
        C64493PSv.LIZ().execute(new ARunnableS1S1400000_6(this, str, c39984Fme, interfaceC39983Fmd, c39982Fmc, 0));
    }
}
