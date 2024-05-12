package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;

/* renamed from: X.5Jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132855Jh extends AbstractC65781Prl implements InterfaceC88472Yns<Effect, Boolean> {
    public static final C132855Jh LJLIL = new C132855Jh();

    public C132855Jh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Effect effect) {
        Effect effect2 = effect;
        boolean z = false;
        if (effect2 != null && effect2.getUnzipPath().length() > 0 && new File(effect2.getUnzipPath()).exists()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
