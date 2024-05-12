package X;

import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.1ZD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZD extends C21470sp<EnumC21450sn> {
    public static final /* synthetic */ int LJIJI = 0;
    public final boolean LJIIZILJ;
    public final C1ZP LJIJ;

    public final Object LJIIIZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZIZ = C21470sp.LIZIZ(this, EnumC21450sn.Hidden, interfaceC67352kd);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C76800UCe.LIZ;
    }

    public final Object LJIIJ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Collection<EnumC21450sn> values = LIZJ().values();
        EnumC21450sn enumC21450sn = EnumC21450sn.HalfExpanded;
        if (!values.contains(enumC21450sn)) {
            enumC21450sn = EnumC21450sn.Expanded;
        }
        Object LIZIZ = C21470sp.LIZIZ(this, enumC21450sn, interfaceC67352kd);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1ZD(EnumC21450sn initialValue, C48361v6 c48361v6, InterfaceC88472Yns confirmStateChange) {
        this(initialValue, c48361v6, false, confirmStateChange);
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(confirmStateChange, "confirmStateChange");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ZD(EnumC21450sn initialValue, C0Q2<Float> animationSpec, boolean z, InterfaceC88472Yns<? super EnumC21450sn, Boolean> confirmStateChange) {
        super(initialValue, animationSpec, confirmStateChange);
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(confirmStateChange, "confirmStateChange");
        this.LJIIZILJ = z;
        if (!z || initialValue != EnumC21450sn.HalfExpanded) {
            this.LJIJ = new C1ZP(this);
        } else {
            "The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString();
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }
}
