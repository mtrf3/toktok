package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import defpackage.i;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Num, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60872Num extends i {
    public final String LJLJJL = "ReuseKitViewMethodIDL";

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        i.b bVar = (i.b) xBaseParamModel;
        o.LJIIJ(type, "type");
        C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
        C25570A1u c25570A1u = new C25570A1u();
        String biz = bVar.getBiz();
        o.LJIIJ(biz, "<set-?>");
        c25570A1u.LIZLLL = biz;
        Number volumn = bVar.getVolumn();
        if (volumn != null) {
            c25570A1u.LIZJ = ((Integer) volumn).intValue();
        }
        Number expiredTimeInSeconds = bVar.getExpiredTimeInSeconds();
        if (expiredTimeInSeconds != null) {
            c25570A1u.LJ = ((Integer) expiredTimeInSeconds).intValue();
        }
        c25570A1u.LJII = bVar.getAllowSchemaList();
        c25570A1u.LJIIIIZZ = bVar.getDenySchemaList();
        String matchCacheRegex = bVar.getMatchCacheRegex();
        if (matchCacheRegex != null) {
            if (matchCacheRegex.length() < 5) {
                C37682Eqc.LIZ(null, this.LJLJJL, "Invalid param, matchCacheRegex too short...");
            } else {
                c25570A1u.LJIIIZ = matchCacheRegex;
            }
        }
        c25570A1u.LJFF = new AqS192S0100000_10(c25570A1u, 53);
        Boolean bool = Boolean.TRUE;
        c60828Nu4.getClass();
        C60828Nu4.LJ(c25570A1u, bool);
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(i.c.class, null), "");
    }
}
