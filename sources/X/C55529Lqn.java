package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS172S0200000_9;

/* renamed from: X.Lqn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55529Lqn implements InterfaceC59043NFf {
    public final /* synthetic */ InterfaceC65784Pro LIZ;
    public final /* synthetic */ InterfaceC88471Ynr LIZIZ;
    public final /* synthetic */ C55530Lqo LIZJ;

    @Override // X.InterfaceC59043NFf
    public final boolean LIZ() {
        return this.LIZJ.LJLIL;
    }

    @Override // X.InterfaceC59043NFf
    public final AbstractC51036K1g<Aweme, ?> LIZJ() {
        return this.LIZJ.mModel;
    }

    @Override // X.InterfaceC59043NFf
    public final User getAuthor() {
        return this.LIZJ.mModel.LJLJJLL;
    }

    @Override // X.InterfaceC59043NFf
    public final Aweme getCurrentAweme() {
        return (Aweme) this.LIZ.invoke();
    }

    @Override // X.InterfaceC59043NFf
    public final void LIZIZ(int i, Aweme aweme) {
        this.LIZIZ.invoke(aweme, Integer.valueOf(i));
        AwemeService.LIZ().R1(aweme);
    }

    public C55529Lqn(C55530Lqo c55530Lqo, KRE kre, AqS172S0200000_9 aqS172S0200000_9) {
        this.LIZJ = c55530Lqo;
        this.LIZ = kre;
        this.LIZIZ = aqS172S0200000_9;
    }
}
