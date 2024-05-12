package X;

import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("friends_intro_pop")
/* renamed from: X.LMp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54139LMp extends M71 {
    public final int LJLIL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLIL;
    }

    public C54139LMp(InterfaceC56322M8o interfaceC56322M8o) {
        super(interfaceC56322M8o);
        this.LJLIL = 1;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        C54029LIj.LIZIZ.LJJ(StateOwner.LJLIL.LIZLLL(), new AqS159S0100000_9(wrapper, 801));
    }
}
