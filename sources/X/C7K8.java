package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.7K8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7K8 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C7K8 LJLIL = new C7K8();

    public C7K8() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("danmaku_input_max_num", int.class);
            o.LJIIIIZZ(LJII, "{\n            SettingsMa…gs::class.java)\n        }");
            i = ((Number) LJII).intValue();
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setting error: ");
            LIZ.append(th);
            C36922EeM.LIZLLL(6, "EditPostAction", X1D.LIZIZ(LIZ));
            i = 30;
        }
        return Integer.valueOf(i);
    }
}
