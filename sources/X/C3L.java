package X;

import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastReleaseVideoGift;

/* loaded from: classes6.dex */
public final class C3L implements InterfaceC78493UrJ {
    public final /* synthetic */ GameBroadcastFragment LJLIL;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (r0.getVisibility() == 4) goto L48;
     */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC78493UrJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3L.LJJIL():void");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        C37661dq c37661dq = this.LJLIL.LJZ;
        if (c37661dq != null) {
            C0NB.LJIIIZ("GameUiStrategy", "onEnterForeground");
            AnonymousClass143 anonymousClass143 = c37661dq.LJJIII;
            if (anonymousClass143 != null) {
                anonymousClass143.LJIIJ = false;
                anonymousClass143.LIZIZ(anonymousClass143.LJII);
            }
            C38921fs c38921fs = c37661dq.LJJJJIZL;
            if (c38921fs != null) {
                c38921fs.LJIILIIL = false;
            }
            c37661dq.LJIJ(C12F.CMD_TRANSITION_TO_HIDDEN);
            C73943T0h.LIZ().LIZIZ(new C28268B7o(47));
            if (GameLiveBroadcastReleaseVideoGift.INSTANCE.getValue()) {
                ((C32537Cpp) c37661dq.LIZJ.gv0(C3S.class)).LIZ = Boolean.FALSE;
            }
        }
        C22940vC c22940vC = this.LJLIL.LJLLLLLL;
        if (c22940vC != null && c22940vC.LIZJ && c22940vC.LIZLLL > 0) {
            c22940vC.LIZ(System.currentTimeMillis());
            c22940vC.LIZLLL = -1L;
        }
    }

    public C3L(GameBroadcastFragment gameBroadcastFragment) {
        this.LJLIL = gameBroadcastFragment;
    }
}
