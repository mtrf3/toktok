package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Vvp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81321Vvp implements InterfaceC81285VvF {
    public final /* synthetic */ C81320Vvo LIZ;

    public C81321Vvp(C81320Vvo c81320Vvo) {
        this.LIZ = c81320Vvo;
    }

    @Override // X.InterfaceC81285VvF
    public final void LIZJ(EffectCategoryModel effectCategoryModel, C81287VvH filter) {
        o.LJIIIZ(filter, "filter");
        C81320Vvo c81320Vvo = this.LIZ;
        InterfaceC81323Vvr interfaceC81323Vvr = c81320Vvo.LJII;
        if (interfaceC81323Vvr != null) {
            interfaceC81323Vvr.p10(filter);
        }
        c81320Vvo.LIZLLL.onNext(new C81322Vvq(EnumC81325Vvt.BUILTIN_CLICK, filter));
    }

    @Override // X.InterfaceC81285VvF
    public final void LIZ(EffectCategoryModel effectCategoryModel, C81287VvH filter, boolean z) {
        o.LJIIIZ(filter, "filter");
        C81320Vvo c81320Vvo = this.LIZ;
        InterfaceC81323Vvr interfaceC81323Vvr = c81320Vvo.LJII;
        if (interfaceC81323Vvr != null) {
            interfaceC81323Vvr.w60(filter);
        }
        if (z) {
            c81320Vvo.LIZLLL.onNext(new C81322Vvq(EnumC81325Vvt.REMOVE, filter));
        }
    }

    @Override // X.InterfaceC81285VvF
    public final void LIZIZ(EffectCategoryModel effectCategoryModel, C81287VvH filter, boolean z) {
        o.LJIIIZ(filter, "filter");
        C81320Vvo c81320Vvo = this.LIZ;
        InterfaceC81323Vvr interfaceC81323Vvr = c81320Vvo.LJII;
        if (interfaceC81323Vvr != null) {
            interfaceC81323Vvr.p10(filter);
        }
        if (z) {
            c81320Vvo.LIZLLL.onNext(new C81322Vvq(EnumC81325Vvt.INSERT, filter));
        }
    }
}
