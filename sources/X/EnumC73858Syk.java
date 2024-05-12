package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Syk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC73858Syk implements InterfaceC73651SvP {
    public static final EnumC73858Syk LJLIL;
    public static final /* synthetic */ EnumC73858Syk[] LJLILLLLZI;

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
    }

    static {
        EnumC73858Syk enumC73858Syk = new EnumC73858Syk();
        LJLIL = enumC73858Syk;
        LJLILLLLZI = new EnumC73858Syk[]{enumC73858Syk};
    }

    public static EnumC73858Syk[] values() {
        return (EnumC73858Syk[]) LJLILLLLZI.clone();
    }

    public static void LIZJ(AtomicReference atomicReference) {
        InterfaceC73651SvP interfaceC73651SvP;
        Object obj = atomicReference.get();
        EnumC73858Syk enumC73858Syk = LJLIL;
        if (obj != enumC73858Syk && (interfaceC73651SvP = (InterfaceC73651SvP) atomicReference.getAndSet(enumC73858Syk)) != enumC73858Syk && interfaceC73651SvP != null) {
            interfaceC73651SvP.cancel();
        }
    }

    public static EnumC73858Syk valueOf(String str) {
        return (EnumC73858Syk) V0N.LJJJ(EnumC73858Syk.class, str);
    }
}
