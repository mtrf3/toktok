package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import java.util.HashSet;
import kotlin.jvm.internal.AqS163S0100000_13;
import webcast.data.multilive_biz.BizResumeParams;

/* renamed from: X.TjB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC75441TjB {
    int LIZIZ();

    void LIZJ(C75952TrQ c75952TrQ, InterfaceC75414Tik<ReplyInviteGroupResult> interfaceC75414Tik);

    TQU LIZLLL();

    void LJI(String str);

    void LJIIJ(C75951TrP c75951TrP, InterfaceC75414Tik<PermitApplyGroupResult> interfaceC75414Tik);

    HashSet<String> LJIILLIIL(String str);

    void LJJIIJZLJL(C76606U4s c76606U4s, InterfaceC75414Tik<ChangeMaxPositionResult> interfaceC75414Tik);

    void LJJIJ(C62819Ol5 c62819Ol5, IDo0S413S0100000_13 iDo0S413S0100000_13);

    void LJJIJLIJ(C28272B7s c28272B7s, InterfaceC75804Tp2 interfaceC75804Tp2);

    void LJJJI(InterfaceC75414Tik<RechargeResult> interfaceC75414Tik);

    void LJJJIL(U62 u62);

    EnumC31946CgI LJJJJ();

    void LJJJJIZL(C76002TsE c76002TsE, InterfaceC75414Tik<CancelApplyResult> interfaceC75414Tik);

    void LJJJJL(String str);

    void LJJJJZI(C76689U7x c76689U7x, C75891TqR c75891TqR);

    void LJJJLL(C75186Tf4 c75186Tf4, InterfaceC75414Tik<KickOutResult> interfaceC75414Tik);

    void LJJLI(String str);

    void LJJLIIIJ(C76012TsO c76012TsO, InterfaceC75414Tik<LeaveChannelResult> interfaceC75414Tik);

    void LJJLIIIJJIZ(C76180Tv6 c76180Tv6, InterfaceC75414Tik<InviteResult> interfaceC75414Tik);

    void LJJLIIIJL(C75911Tql c75911Tql, InterfaceC75414Tik<ReplyResult> interfaceC75414Tik);

    void LJJLIIIJLLLLLLLZ(TZS tzs, InterfaceC75414Tik<DestroyChannelResult> interfaceC75414Tik);

    void LJJLIIJ(C75918Tqs c75918Tqs, C75900Tqa c75900Tqa);

    void LJJLIL(C76690U7y c76690U7y, C75890TqQ c75890TqQ);

    void LJJZ(U6Y u6y);

    U8H LJJZZI();

    void LJL(int i);

    void LJLI(C76180Tv6 c76180Tv6, C74847TZb c74847TZb);

    void LJLIIIL(C75993Ts5 c75993Ts5, TZZ tzz);

    void LJLJJI(C76684U7s c76684U7s, InterfaceC75414Tik<LeaveGroupResult> interfaceC75414Tik);

    int LJLJJLL();

    void LJLJLJ(C76179Tv5 c76179Tv5, InterfaceC75414Tik<ApplyResult> interfaceC75414Tik);

    EnumC75780Toe LJLJLLL();

    void LJLL(TTS tts);

    void LJLZ(String str);

    void LJZ(C75186Tf4 c75186Tf4, C74848TZc c74848TZc);

    InterfaceC75011TcF LJZI();

    InterfaceC76652U6m LJZL();

    java.util.Map<String, String> LLFZ();

    void LLIIIJ(C76001TsD c76001TsD, InterfaceC75414Tik<CancelInviteResult> interfaceC75414Tik);

    void LLIIIZ(C75993Ts5 c75993Ts5, InterfaceC75414Tik<PermitResult> interfaceC75414Tik);

    InterfaceC75973Trl LLIIJI();

    InterfaceC74695TTf LLIIJLIL();

    void LLIILII(U62 u62);

    void LLILL(C76611U4x c76611U4x, InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik, BizResumeParams bizResumeParams);

    void LLILZ(C35749E1h c35749E1h, InterfaceC75414Tik<DirectJoinResult> interfaceC75414Tik);

    void LLJI(C75919Tqt c75919Tqt, C75901Tqb c75901Tqb);

    boolean LLLLJI();

    void LLLLL(U6Y u6y);

    void LLLLLIL(N39 n39);

    boolean LLLLLILLIL();

    RtcUserInfo LLLLLJIL();

    java.util.Set<Long> LLLLLJLJLL();

    java.util.Set<Long> LLLLLL();

    String LLLLLLIL();

    void LLLLLLJ(long j);

    void LLLLLLL(InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    void LLLLLLLLLL(AqS163S0100000_13 aqS163S0100000_13);

    boolean LLLLZLLIL();

    boolean isNeedPublishFrame();

    int scene();
}
