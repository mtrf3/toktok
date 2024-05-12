package X;

import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bxi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30478Bxi extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final C30478Bxi LJLIL = new C30478Bxi();

    public C30478Bxi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        Boolean isShow = bool;
        o.LJIIIIZZ(isShow, "isShow");
        if (isShow.booleanValue()) {
            C0NA.LIZIZ(C65352Pkq.LIZ(EffectDialogShowChannel.class));
        } else {
            C0NA.LIZJ(C65352Pkq.LIZ(EffectDialogShowChannel.class));
        }
        return C76800UCe.LIZ;
    }
}
