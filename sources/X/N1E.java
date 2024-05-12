package X;

import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import kotlin.jvm.internal.AqS17S2100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1E implements NO4 {
    public final String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
    public final long LIZIZ = System.currentTimeMillis();

    @Override // X.NO4
    public final void LIZ(String cid, String str, String str2, String str3) {
        o.LJIIIZ(cid, "cid");
        IAdWebEventLogger LJJIJ = AdACTEventLoger.LJJIJ();
        C58685N1l.LIZ.getClass();
        LJJIJ.LIZJ(C58685N1l.LJIIL, cid, str, null, new AqS17S2100000_10(this, str2, str3, 2));
    }

    public final void LIZIZ(String cid, String str, String refer, String str2) {
        o.LJIIIZ(cid, "cid");
        o.LJIIIZ(refer, "refer");
        AdACTEventLoger.LJJIJ().LIZJ(C58685N1l.LJ, cid, str, null, new AqS17S2100000_10(this, refer, str2, 1));
    }
}
