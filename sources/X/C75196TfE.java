package X;

import com.bytedance.android.live.effect.api.IEffectService;
import kotlin.jvm.internal.o;

/* renamed from: X.TfE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75196TfE extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC08130Tp> {
    public static final C75196TfE LJLIL = new C75196TfE();

    public C75196TfE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC08130Tp invoke() {
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        return ((IEffectService) LIZ).stickerPresenter();
    }
}
