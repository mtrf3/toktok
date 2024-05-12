package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Syj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC73857Syj implements InterfaceC92693kP {
    public static final EnumC73857Syj LJLIL;
    public static final /* synthetic */ EnumC73857Syj[] LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return true;
    }

    static {
        EnumC73857Syj enumC73857Syj = new EnumC73857Syj();
        LJLIL = enumC73857Syj;
        LJLILLLLZI = new EnumC73857Syj[]{enumC73857Syj};
    }

    public static EnumC73857Syj[] values() {
        return (EnumC73857Syj[]) LJLILLLLZI.clone();
    }

    public static void LIZJ(AtomicReference atomicReference) {
        InterfaceC92693kP interfaceC92693kP;
        Object obj = atomicReference.get();
        EnumC73857Syj enumC73857Syj = LJLIL;
        if (obj != enumC73857Syj && (interfaceC92693kP = (InterfaceC92693kP) atomicReference.getAndSet(enumC73857Syj)) != enumC73857Syj && interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static EnumC73857Syj valueOf(String str) {
        return (EnumC73857Syj) V0N.LJJJ(EnumC73857Syj.class, str);
    }
}
