package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module;

import X.C141335gf;
import X.C3C5;
import X.C58788N5k;
import X.C77412UZs;
import X.InterfaceC49504Jbo;
import X.JMD;
import X.N7D;
import X.N8M;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GlobalSearchAdModuleImpl implements IGlobalSearchAdModule {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Stack<InterfaceC49504Jbo> LIZ = new Stack<>();

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final void LIZ() {
        Object LIZ;
        try {
            LIZ = (InterfaceC49504Jbo) C77412UZs.LJJIJIIJIL(this.LIZ);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final InterfaceC49504Jbo LIZIZ() {
        InterfaceC49504Jbo LIZ;
        try {
            Stack<InterfaceC49504Jbo> stack = this.LIZ;
            o.LJIIIZ(stack, "<this>");
            LIZ = stack.peek();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (InterfaceC49504Jbo) LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final void LIZLLL() {
        Stack<InterfaceC49504Jbo> stack = this.LIZ;
        C58788N5k c58788N5k = new C58788N5k();
        o.LJIIIZ(stack, "<this>");
        stack.push(c58788N5k);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stack push : element hashcode = ");
        LIZ.append(c58788N5k.hashCode());
        LIZ.append(", size = ");
        LIZ.append(stack.size());
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final N7D LIZJ(Aweme aweme) {
        InterfaceC49504Jbo LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            return LIZIZ2.LIZJ(aweme);
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final JMD LJ(Aweme aweme) {
        InterfaceC49504Jbo LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            return LIZIZ2.LIZLLL(aweme);
        }
        return null;
    }
}
