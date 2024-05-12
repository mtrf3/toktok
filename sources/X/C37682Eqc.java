package X;

import com.bytedance.hybrid.spark.SparkContext;
import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.Eqc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37682Eqc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SparkContext sparkContext, String tag, String message) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(message, "message");
        LIZJ(EnumC39866Fkk.E, tag, message, sparkContext);
    }

    public static void LIZIZ(SparkContext sparkContext, String str, String message) {
        o.LJIIJ(message, "message");
        LIZJ(EnumC39866Fkk.I, str, message, sparkContext);
    }

    public static void LIZJ(EnumC39866Fkk enumC39866Fkk, String str, String str2, SparkContext sparkContext) {
        String str3;
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZJ = b1.LIZJ(str2, " containerId:");
        if (sparkContext != null) {
            str3 = sparkContext.containerId;
        } else {
            str3 = null;
        }
        LIZJ.append(str3);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("HybridKit-");
        LIZ2.append(str);
        c39048FUe.LIZ(LIZIZ, enumC39866Fkk, X1D.LIZIZ(LIZ2));
    }
}
