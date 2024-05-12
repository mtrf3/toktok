package X;

import kotlin.jvm.internal.o;

/* renamed from: X.M0o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56114M0o extends AbstractC65781Prl implements InterfaceC88473Ynt<O26, O1M, Throwable, C76800UCe> {
    public static final C56114M0o LJLIL = new C56114M0o();

    public C56114M0o() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(O26 resourceInfo, O1M taskConfig, Throwable th) {
        Throwable throwable = th;
        o.LJIIIZ(resourceInfo, "resourceInfo");
        o.LJIIIZ(taskConfig, "taskConfig");
        o.LJIIIZ(throwable, "throwable");
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        String stage = EnumC56116M0q.STAGE_SPARK_LOAD_TEMPLATE_FINISH.getStage();
        long currentTimeMillis = System.currentTimeMillis() - C56090Lzq.LIZ;
        boolean z = C56090Lzq.LIZJ;
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", message));
        c56045Lz7.getClass();
        C56045Lz7.LJFF(stage, currentTimeMillis, false, z, LJJIIZI);
        return C76800UCe.LIZ;
    }
}
