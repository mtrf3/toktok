package X;

import com.ss.android.ugc.aweme.feed.model.AnchorSubtypeExtra;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HSg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44094HSg extends HSS {
    public final C5H3 LJLJLJ = C221108m2.LIZ(EnumC221088m0.NONE, C44093HSf.LJLIL);
    public AnchorSubtypeExtra LJLJLLL;

    @Override // X.S1E
    public final S1E clone() {
        return new C44094HSg();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.UG_PICK.getTYPE();
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJIZL(new AqS173S0100000_7(this, 248));
        HSS.LJJIZ(this, eventMapBuilder, 6);
    }
}
