package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.W0z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81605W0z implements F4V {
    public final SafeHandler LJLIL;
    public Effect LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final TEZ LJLJJI;
    public final InterfaceC81604W0y LJLJJL;
    public final InterfaceC88472Yns<Effect, C76800UCe> LJLJJLL;

    @Override // X.F4V
    public final int getPriority() {
        return T4M.NOTICE_STICKER_PRIORITY.getPriority();
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        this.LJLJJI.LJJIFFI();
        boolean z = session instanceof T4Q;
        if (z) {
            T4Q t4q = (T4Q) session;
            if (t4q.LIZJ != EnumC44267HYx.RECOVER) {
                Effect effect = t4q.LIZ;
                if (effect == null || o.LJ(effect, this.LJLILLLLZI) || ID0.LJIIZILJ(effect)) {
                    return ern.LIZ(session);
                }
                this.LJLILLLLZI = effect;
                this.LJLIL.removeCallbacksAndMessages(null);
                this.LJLJJL.hideNotice();
                if (!TIP.LIZ(effect)) {
                    return ern.LIZ(session);
                }
                this.LJLJJLL.invoke(effect);
                this.LJLJJL.hide();
                this.LJLJJL.to(effect, new W10(this, ern, session), new C81603W0x(ern, session));
                return new ERS(-1);
            }
        }
        boolean z2 = session instanceof T4R;
        if (z2 || (z && ((T4Q) session).LIZJ == EnumC44267HYx.RECOVER)) {
            this.LJLIL.removeCallbacksAndMessages(null);
            this.LJLJJL.hideNotice();
            this.LJLJJL.hide();
            if (!z2 ? !(!z || ((T4Q) session).LIZJ != EnumC44267HYx.UI_CLICK) : ((T4R) session).LIZJ == EnumC44267HYx.UI_CLICK) {
                this.LJLJJL.fo();
            }
            this.LJLILLLLZI = null;
        }
        return ern.LIZ(session);
    }

    public C81605W0z(LifecycleOwner owner, TEZ stickerDataManager, InterfaceC81604W0y interfaceC81604W0y, AqS138S0200000_7 aqS138S0200000_7) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LJLJI = owner;
        this.LJLJJI = stickerDataManager;
        this.LJLJJL = interfaceC81604W0y;
        this.LJLJJLL = aqS138S0200000_7;
        this.LJLIL = new SafeHandler(owner);
    }
}
