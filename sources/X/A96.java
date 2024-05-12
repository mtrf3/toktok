package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A96 extends HSS {
    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
    }

    @Override // X.S1E
    public final S1E clone() {
        return new A96();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.SHOUTOUT.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        FMX.LJIIL("shoutouts_entrance_show", C113554cx.LJJL(new OSZ("enter_from", LJJIIZI()), new OSZ("channel", "anchor"), new OSZ("to_user_id", LJJII().getAuthorUid())));
    }
}
