package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bug, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30290Bug extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends LiveEffect>, C76800UCe> {
    public static final C30290Bug LJLIL = new C30290Bug();

    public C30290Bug() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends LiveEffect> list) {
        List<? extends LiveEffect> it = list;
        o.LJIIIZ(it, "it");
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
        C31691Mf.LJIJI(it);
        return C76800UCe.LIZ;
    }
}
