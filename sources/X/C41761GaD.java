package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GaD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41761GaD extends AbstractC41873Gc1 {
    public final C41755Ga7 LJ;

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
    }

    public C41761GaD(C41755Ga7 c41755Ga7) {
        super((Object) null, 2);
        this.LJ = c41755Ga7;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
        super.LIZIZ(happenTime, sourceTag, info);
        if (info instanceof C41762GaE) {
            this.LJ.J6(((C41762GaE) info).LIZ);
            return;
        }
        if (o.LJ(info, C41764GaG.LIZ)) {
            C41755Ga7 c41755Ga7 = this.LJ;
            c41755Ga7.LJLILLLLZI.onStageUpdate("STAGE_SYNTHETIC_PAUSE", new C41757Ga9(new GV8("")), c41755Ga7.LJLIL.LIZ);
        } else {
            if (!o.LJ(info, C41763GaF.LIZ)) {
                return;
            }
            C41755Ga7 c41755Ga72 = this.LJ;
            c41755Ga72.LJLILLLLZI.onStageUpdate("STAGE_SYNTHETIC_RESUME", new C41757Ga9(new GV8("")), c41755Ga72.LJLIL.LIZ);
        }
    }
}
