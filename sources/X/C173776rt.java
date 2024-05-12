package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.6rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173776rt extends AbstractC29891Fh<InterfaceC170076lv> implements InterfaceC170076lv, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final C29901Fi<OSZ<Effect, Integer>> LJLILLLLZI;

    public InterfaceC170076lv LJJLI() {
        return this;
    }

    @Override // X.InterfaceC170076lv
    public /* bridge */ /* synthetic */ LiveEvent fj0() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC170076lv getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
    }

    public C173776rt(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = new C29901Fi<>();
    }

    @Override // X.InterfaceC170076lv
    public void KP(Effect effect, int i) {
        this.LJLILLLLZI.LJII(new OSZ<>(effect, Integer.valueOf(i)));
    }
}
