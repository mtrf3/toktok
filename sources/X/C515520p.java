package X;

import com.bytedance.android.live.effect.api.IEffectService;
import kotlin.jvm.internal.o;

/* renamed from: X.20p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C515520p extends AbstractC65781Prl implements InterfaceC65784Pro<C0WF> {
    public static final C515520p LJLIL = new C515520p();

    public C515520p() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C0WF invoke() {
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        return ((IEffectService) LIZ).baseComposerManager();
    }
}
