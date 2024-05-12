package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.ZdT, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90375ZdT {
    public static final C90375ZdT LIZJ = new C90375ZdT();
    public final ConcurrentMap<Class<?>, InterfaceC90399Zdr<?>> LIZIZ = new ConcurrentHashMap();
    public final C90265Zbh LIZ = new C90265Zbh();

    public final <T> InterfaceC90399Zdr<T> LIZ(Class<T> cls) {
        Class<?> cls2;
        if (cls != null) {
            InterfaceC90399Zdr<T> interfaceC90399Zdr = (InterfaceC90399Zdr) ((ConcurrentHashMap) this.LIZIZ).get(cls);
            if (interfaceC90399Zdr == null) {
                C90265Zbh c90265Zbh = this.LIZ;
                c90265Zbh.getClass();
                if (AbstractC90950Zmk.class.isAssignableFrom(cls) || (cls2 = C90406Zdy.LIZ) == null || cls2.isAssignableFrom(cls)) {
                    InterfaceC90305ZcL LIZIZ = c90265Zbh.LIZ.LIZIZ(cls);
                    if (LIZIZ.LIZ()) {
                        if (AbstractC90950Zmk.class.isAssignableFrom(cls)) {
                            interfaceC90399Zdr = new C90733ZjF<>(C90406Zdy.LIZLLL, C90248ZbQ.LIZ, LIZIZ.zza());
                        } else {
                            AbstractC90306ZcM<?, ?> abstractC90306ZcM = C90406Zdy.LIZIZ;
                            AbstractC90234ZbC<?> abstractC90234ZbC = C90248ZbQ.LIZIZ;
                            if (abstractC90234ZbC != null) {
                                interfaceC90399Zdr = new C90733ZjF<>(abstractC90306ZcM, abstractC90234ZbC, LIZIZ.zza());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                    } else if (AbstractC90950Zmk.class.isAssignableFrom(cls)) {
                        if (LIZIZ.LIZIZ() == 1) {
                            interfaceC90399Zdr = C90726Zj8.LJIIJJI(LIZIZ, AbstractC90235ZbD.LIZIZ, C90406Zdy.LIZLLL, C90248ZbQ.LIZ, C90299ZcF.LIZIZ);
                        } else {
                            interfaceC90399Zdr = C90726Zj8.LJIIJJI(LIZIZ, AbstractC90235ZbD.LIZIZ, C90406Zdy.LIZLLL, null, C90299ZcF.LIZIZ);
                        }
                    } else if (LIZIZ.LIZIZ() == 1) {
                        C90767Zjn c90767Zjn = AbstractC90235ZbD.LIZ;
                        AbstractC90306ZcM<?, ?> abstractC90306ZcM2 = C90406Zdy.LIZIZ;
                        AbstractC90234ZbC<?> abstractC90234ZbC2 = C90248ZbQ.LIZIZ;
                        if (abstractC90234ZbC2 != null) {
                            interfaceC90399Zdr = C90726Zj8.LJIIJJI(LIZIZ, c90767Zjn, abstractC90306ZcM2, abstractC90234ZbC2, C90299ZcF.LIZ);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        interfaceC90399Zdr = C90726Zj8.LJIIJJI(LIZIZ, AbstractC90235ZbD.LIZ, C90406Zdy.LIZJ, null, C90299ZcF.LIZ);
                    }
                    InterfaceC90399Zdr<T> interfaceC90399Zdr2 = (InterfaceC90399Zdr) ((ConcurrentHashMap) this.LIZIZ).putIfAbsent(cls, interfaceC90399Zdr);
                    if (interfaceC90399Zdr2 != null) {
                        return interfaceC90399Zdr2;
                    }
                } else {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            return interfaceC90399Zdr;
        }
        throw new NullPointerException("messageType");
    }
}
