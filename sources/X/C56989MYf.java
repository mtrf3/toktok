package X;

import com.ss.android.ugc.aweme.IAppWidgetService;
import kotlin.jvm.internal.o;

/* renamed from: X.MYf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56989MYf extends AbstractC116364hU<InterfaceC57784Mm4> {
    public final C62822Ol8 LIZJ;

    @Override // X.AbstractC116364hU
    public final Object LIZJ() {
        return this;
    }

    @Override // X.AbstractC116364hU
    public final Object LIZLLL() {
        return this;
    }

    @Override // X.AbstractC116364hU
    public final C76800UCe LIZ() {
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56989MYf(InterfaceC116134h7 ft) {
        super(ft);
        o.LJIIIZ(ft, "ft");
        this.LIZJ = C221108m2.LIZIZ(C57004MYu.LJLIL);
    }

    @Override // X.AbstractC116364hU
    public final Object LIZIZ(InterfaceC67352kd<? super AbstractC116364hU<InterfaceC57784Mm4>> interfaceC67352kd) {
        int i;
        this.LIZIZ.clear();
        OSZ<InterfaceC57784Mm4, Boolean> LIZJ = ((IAppWidgetService) this.LIZJ.getValue()).LIZJ();
        if (LIZJ.getFirst() != null) {
            InterfaceC57784Mm4 first = LIZJ.getFirst();
            o.LJII(first, "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.StoryWidgetGuideItem");
            C56358M9y c56358M9y = (C56358M9y) first;
            if (LIZJ.getSecond().booleanValue()) {
                i = 10000;
            } else {
                i = 1000;
            }
            this.LIZIZ.add(C56358M9y.L(c56358M9y, i));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("process data size ");
        LIZ.append(this.LIZIZ.size());
        LIZ.append(", priority low ");
        LIZ.append(LIZJ.getFirst());
        C34B.LJI("SkylightWidgetModule", X1D.LIZIZ(LIZ));
        return this;
    }
}
