package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.TTu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74710TTu extends AbstractC74705TTp implements TT0 {
    public final TTR LJLLJ;
    public int LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;

    public final TU4<LinkPlayerInfo, MultiLiveGuestInfoList> LJII() {
        return (TU4) this.LJLLLLLL.getValue();
    }

    public final TRO LJIIIIZZ() {
        return (TRO) this.LJLZ.getValue();
    }

    public final TU4<LinkListUser, LinkMessage> LJIIIZ() {
        return (TU4) this.LJLLLL.getValue();
    }

    @Override // X.TT0
    public final TU4 LIZ() {
        return LJIIIZ();
    }

    @Override // X.AbstractC74705TTp
    public final void release() {
        super.release();
        LJIIIIZZ().dispose();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(boolean r8) {
        /*
            r7 = this;
            X.TU4 r0 = r7.LJIIIZ()
            int r6 = X.C60903NvH.LJIILLIIL(r0)
            X.TU4 r0 = r7.LJIIIZ()
            java.util.List r1 = r0.LJ()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lbb
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lbb
        L1a:
            int r0 = r7.LJLLL
            r4 = 0
            if (r0 <= 0) goto L77
            if (r6 != 0) goto L58
        L22:
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L65
        L2a:
            java.lang.String r0 = "connection_over"
            X.C74746TVe.LJIIIIZZ(r0)
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting.INSTANCE
            boolean r0 = r0.getValue()
            r3 = 5
            if (r0 == 0) goto L5b
            androidx.lifecycle.LifecycleOwner r0 = r7.LJLJJL
            if (r0 == 0) goto L4f
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
            if (r2 == 0) goto L4f
            kotlin.jvm.internal.AqS160S0200000_13 r1 = new kotlin.jvm.internal.AqS160S0200000_13
            r0 = 1
            r1.<init>(r2, r7, r0)
            X.C29306Beo.LJJJ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L58
        L4f:
            int r0 = r7.LJLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C74746TVe.LIZJ(r0, r4, r3)
        L58:
            r7.LJLLL = r6
            return
        L5b:
            int r0 = r7.LJLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C74746TVe.LIZJ(r0, r4, r3)
            goto L58
        L65:
            X.C88207Yjb.LJIILLIIL()
            boolean r0 = X.C88207Yjb.LJII
            if (r0 == 0) goto L74
            java.lang.String r0 = "broadcast_period"
        L6e:
            X.C88207Yjb.LJI = r0
            X.C88207Yjb.LJIIJ()
            goto L2a
        L74:
            java.lang.String r0 = "watch_period"
            goto L6e
        L77:
            if (r0 != 0) goto L58
            if (r6 <= 0) goto L58
        L7c:
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestFluencyRefactorTechSwitchSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto Lac
        L84:
            if (r8 != 0) goto L58
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting.INSTANCE
            boolean r0 = r0.getValue()
            java.lang.String r3 = "connection_start"
            if (r0 == 0) goto Lb7
            androidx.lifecycle.LifecycleOwner r0 = r7.LJLJJL
            if (r0 == 0) goto La8
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
            if (r2 == 0) goto La8
            kotlin.jvm.internal.AqS163S0100000_13 r1 = new kotlin.jvm.internal.AqS163S0100000_13
            r0 = 12
            r1.<init>(r2, r0)
            X.C29306Beo.LJJJ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L58
        La8:
            X.C74746TVe.LIZLLL(r3)
            goto L58
        Lac:
            X.C88207Yjb.LJIILLIIL()
            java.lang.String r0 = "audience_link_period"
            X.C88207Yjb.LJI = r0
            X.C88207Yjb.LJIIJ()
            goto L84
        Lb7:
            X.C74746TVe.LIZLLL(r3)
            goto L58
        Lbb:
            java.util.Iterator r5 = r1.iterator()
        Lbf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r5.next()
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = (com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.user
            if (r0 == 0) goto Lbf
            long r3 = r0.getId()
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r1 = r0.getCurrentUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbf
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74710TTu.LJIIJ(boolean):void");
    }

    public final void LJIIJJI(int i) {
        LJIIIIZZ().LIZIZ();
        Iterator<InterfaceC74708TTs> it = LJFF().iterator();
        while (it.hasNext()) {
            it.next().LJJIJLIJ(LJIIIZ());
        }
        LJIIIIZZ().dispose();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74710TTu(Room room, long j, TTR linkManager, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        super(room, j, linkManager, iMessageManager, lifecycleOwner);
        o.LJIIIZ(linkManager, "linkManager");
        this.LJLLJ = linkManager;
        this.LJLLLL = C221108m2.LIZIZ(C74712TTw.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C74711TTv.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(TRQ.LJLIL);
    }
}
