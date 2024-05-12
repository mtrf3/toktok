package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.FhR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39661FhR implements InterfaceC39662FhS {
    public static final EnumC39661FhR a = new EnumC39661FhR();
    public static final AtomicReference<InterfaceC39665FhV> LJLIL = new AtomicReference<>(null);

    @Override // X.InterfaceC39662FhS
    public final InterfaceC39665FhV a() {
        return LJLIL.get();
    }

    public final void b(InterfaceC39665FhV interfaceC39665FhV) {
        LJLIL.set(interfaceC39665FhV);
    }
}
