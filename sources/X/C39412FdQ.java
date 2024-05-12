package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FdQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39412FdQ implements InterfaceC73592SuS, InterfaceC39413FdR, InterfaceC39410FdO {
    public static boolean LJLIL;
    public static final C39412FdQ LJLILLLLZI = new C39412FdQ();

    @Override // X.InterfaceC39410FdO
    public void LIZIZ(String channel) {
        o.LJIIIZ(channel, "channel");
    }

    @Override // X.InterfaceC39413FdR
    public boolean LIZLLL(float f) {
        return FMX.LIZJ("gift_view_holder_create_time");
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        List<String> tags;
        LiveEffect effect = (LiveEffect) obj;
        o.LJIIIZ(effect, "effect");
        Effect effect2 = effect.getEffect();
        if (effect2 != null && (tags = effect2.getTags()) != null) {
            return tags.contains("new");
        }
        return false;
    }

    @Override // X.InterfaceC39410FdO
    public void LIZ(String channel, Throwable th) {
        o.LJIIIZ(channel, "channel");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StringPatchLoader gecko update Failed: ");
        LIZ.append(th.getMessage());
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC39413FdR
    public boolean LIZJ(float f, String str) {
        return FMX.LIZJ(str);
    }
}
