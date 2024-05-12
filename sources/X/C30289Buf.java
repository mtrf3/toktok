package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Buf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30289Buf extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends LiveEffect>, C76800UCe> {
    public static final C30289Buf LJLIL = new C30289Buf();

    public C30289Buf() {
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
