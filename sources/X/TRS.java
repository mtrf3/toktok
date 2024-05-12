package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.AqS163S0100000_13;

/* loaded from: classes14.dex */
public interface TRS {
    String LIZIZ(long j);

    void LIZJ(AqS163S0100000_13 aqS163S0100000_13);

    void LIZLLL(TUI tui);

    void LJ(TUI tui);

    void LJFF(String str, int i, InterfaceC88472Yns<? super TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super TZX<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> interfaceC88472Yns2);

    void LJI(MultiGuestDataHolder multiGuestDataHolder);

    void LJII(int i);

    void LJIIIIZZ(int i);

    void LJIIIZ(long j, String str);

    void init();

    void release();
}
