package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KIa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51472KIa extends AbstractC65781Prl implements InterfaceC88472Yns<KJU, Object> {
    public static final C51472KIa LJLIL = new C51472KIa();

    public C51472KIa() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final Object invoke(KJU kju) {
        long j;
        KJU it = kju;
        o.LJIIIZ(it, "it");
        Object obj = it.LIZJ;
        if (obj instanceof C49589JdB) {
            j = ((C49589JdB) obj).LJLIL;
        } else {
            j = ((C49589JdB) C51488KIq.LJFF.LIZIZ(it, EnumC51518KJu.ACTIVITY).LIZJ()).LJLIL;
        }
        return Long.valueOf(j);
    }
}
