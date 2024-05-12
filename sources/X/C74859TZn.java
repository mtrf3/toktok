package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.TZn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74859TZn extends AbstractC65781Prl implements InterfaceC88472Yns<TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> {
    public static final C74859TZn LJLIL = new C74859TZn();

    public C74859TZn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> tzx) {
        TZX<LinkPlayerInfo, MultiLiveGuestInfoList> it = tzx;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch onChanged ");
        LIZ.append(it.LJIIIIZZ().size());
        LIZ.append(' ');
        LIZ.append(it.LJ().size());
        C0NB.LJIIIZ("MultiGuestModeratorsManageDialog", X1D.LIZIZ(LIZ));
        C75040Tci.LJIIIIZZ(it.LJIIIIZZ().size(), it.LJ().size());
        return C76800UCe.LIZ;
    }
}
