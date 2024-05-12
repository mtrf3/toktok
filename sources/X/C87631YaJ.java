package X;

import Y.ARunnableS46S0100000_10;
import kotlin.jvm.internal.AqS1S0302000_16;
import kotlin.jvm.internal.AqS76S0400000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YaJ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87631YaJ extends AbstractC41873Gc1 {
    public final AbstractC41873Gc1 LJ;
    public final InterfaceC43522H6g LJFF;
    public boolean LJI;

    public final AbstractC41873Gc1 LJI() {
        if (this.LJI) {
            return this.LJ;
        }
        return null;
    }

    public final void LJII(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJFF.execute(new ARunnableS46S0100000_10((InterfaceC65784Pro) interfaceC65784Pro, 160));
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        LJII(new C87632YaK(this, sourceTag, args));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87631YaJ(Object obj, AbstractC41873Gc1 abstractC41873Gc1, InterfaceC43522H6g mainThreadExecutor) {
        super(obj, 2);
        o.LJIIIZ(mainThreadExecutor, "mainThreadExecutor");
        this.LJ = abstractC41873Gc1;
        this.LJFF = mainThreadExecutor;
        this.LJI = true;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
        LJII(new AqS76S0400000_16(this, sourceTag, happenTime, info, 1));
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZLLL(Object sourceTag, C41875Gc3 happenTime, AbstractC41872Gc0 event) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(event, "event");
        LJII(new AqS76S0400000_16(this, sourceTag, happenTime, event, 0));
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        LJII(new AqS1S0302000_16(this, sourceTag, cause, i, i2, 0));
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        LJII(new AqS1S0302000_16(this, sourceTag, error, i, i2, 1));
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        LJII(new C87633YaL(this, sourceTag, obj, z, i, i2));
    }
}
