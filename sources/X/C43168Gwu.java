package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gwu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43168Gwu extends AbstractC41873Gc1 {
    public final String LJ;

    public C43168Gwu() {
        super((Object) null, 3);
        this.LJ = "DefaultWavePublisher";
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        if (o.LJ(sourceTag, this.LJ)) {
            C41658GWo.LIZLLL().LJII(2);
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        if (o.LJ(sourceTag, this.LJ)) {
            C41658GWo.LIZLLL().LJII(9);
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        if (!o.LJ(sourceTag, this.LJ) && sourceTag == H1U.CREATE_AWEME) {
            C44172HVg.LJIIZILJ.getClass();
            IAX.LIZJ("mus_af_post_video", null);
            C41658GWo.LIZLLL().LJII(10);
        }
    }
}
