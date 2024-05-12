package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public enum XKY {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static XKY valueOf(String str) {
        return (XKY) V0N.LJJJ(XKY.class, str);
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public final <T> void invoke(InterfaceC88472Yns<? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88472Yns, InterfaceC67352kd<? super T> completion) {
        int i = C84669XKv.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return;
                    } else {
                        throw new C162476Zf();
                    }
                }
                o.LJIIIZ(completion, "completion");
                try {
                    MBA context = completion.getContext();
                    Object LIZJ = XLG.LIZJ(null, context);
                    try {
                        if (interfaceC88472Yns != null) {
                            C65777Prh.LJ(1, interfaceC88472Yns);
                            Object invoke = interfaceC88472Yns.invoke(completion);
                            if (invoke == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return;
                            }
                            C3C5.m7constructorimpl(invoke);
                            completion.resumeWith(invoke);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    } finally {
                        XLG.LIZ(LIZJ, context);
                    }
                } catch (Throwable th) {
                    OUR.LJ(th, completion);
                    return;
                }
            }
            o.LJIIIZ(interfaceC88472Yns, "<this>");
            o.LJIIIZ(completion, "completion");
            InterfaceC67352kd LJJII = C78555UsJ.LJJII(C78555UsJ.LJIIL(interfaceC88472Yns, completion));
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            LJJII.resumeWith(c76800UCe);
            return;
        }
        try {
            InterfaceC67352kd LJJII2 = C78555UsJ.LJJII(C78555UsJ.LJIIL(interfaceC88472Yns, completion));
            C76800UCe c76800UCe2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe2);
            XKV.LIZ(c76800UCe2, LJJII2, null);
        } catch (Throwable th2) {
            C79000UzU.LIZJ(th2, completion);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(InterfaceC88471Ynr<? super R, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, R r, InterfaceC67352kd<? super T> completion) {
        int i = C84669XKv.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return;
                    } else {
                        throw new C162476Zf();
                    }
                }
                o.LJIIIZ(completion, "completion");
                try {
                    MBA context = completion.getContext();
                    Object LIZJ = XLG.LIZJ(null, context);
                    try {
                        if (interfaceC88471Ynr != null) {
                            C65777Prh.LJ(2, interfaceC88471Ynr);
                            Object invoke = interfaceC88471Ynr.invoke(r, completion);
                            if (invoke == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return;
                            }
                            C3C5.m7constructorimpl(invoke);
                            completion.resumeWith(invoke);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    } finally {
                        XLG.LIZ(LIZJ, context);
                    }
                } catch (Throwable th) {
                    OUR.LJ(th, completion);
                    return;
                }
            }
            o.LJIIIZ(interfaceC88471Ynr, "<this>");
            o.LJIIIZ(completion, "completion");
            InterfaceC67352kd LJJII = C78555UsJ.LJJII(C78555UsJ.LJIILIIL(interfaceC88471Ynr, r, completion));
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            LJJII.resumeWith(c76800UCe);
            return;
        }
        try {
            InterfaceC67352kd LJJII2 = C78555UsJ.LJJII(C78555UsJ.LJIILIIL(interfaceC88471Ynr, r, completion));
            C76800UCe c76800UCe2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe2);
            XKV.LIZ(c76800UCe2, LJJII2, null);
        } catch (Throwable th2) {
            C79000UzU.LIZJ(th2, completion);
            throw null;
        }
    }
}
