package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GaM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41770GaM extends AbstractC41873Gc1 {
    public final GUX LJ;

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

    public C41770GaM(GUX gux) {
        super((Object) null, 2);
        this.LJ = gux;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
        super.LIZIZ(happenTime, sourceTag, info);
        if (info instanceof C41772GaO) {
            C41772GaO c41772GaO = (C41772GaO) info;
            this.LJ.onStageUpdate("STAGE_SYNTHETIC", new C41757Ga9(new GV8(new C117914jz(c41772GaO.LIZ, c41772GaO.LIZIZ, c41772GaO.LIZJ))), null);
        } else {
            if (!(info instanceof C41773GaP)) {
                return;
            }
            this.LJ.onStageUpdate("STAGE_COVER_SYNTHETIC", new C41757Ga9(new GV8(((C41773GaP) info).LIZ)), null);
        }
    }
}
