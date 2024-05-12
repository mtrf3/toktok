package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.AqS163S0100000_13;
import tikcast.linkmic.controller.MGetABInfosReq;
import webcast.data.multilive_biz.BizResumeParams;

/* loaded from: classes14.dex */
public interface U66 extends InterfaceC76681U7p {
    int LIZIZ();

    Room LIZJ();

    long LJJLI();

    boolean LLLLJI();

    void LLLLL(U6Y u6y);

    void LLLLLIL(N39 n39);

    boolean LLLLLILLIL();

    java.util.Set<Long> LLLLLJLJLL();

    java.util.Set<Long> LLLLLL();

    void LLLLLLJ(long j);

    void LLLLLLL(InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    void LLLLLLLLL(InterfaceC76768UAy<JoinRtcChannelResult> interfaceC76768UAy);

    void LLLLLLLLLL(AqS163S0100000_13 aqS163S0100000_13);

    void LLLLLLLZIL(InviteData inviteData, InterfaceC76768UAy<InviteResult> interfaceC76768UAy, InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    void LLLLLLZ(C76113Tu1 c76113Tu1, U6A u6a);

    void LLLLLLZZ(DestroyChannelData destroyChannelData, InterfaceC76768UAy<DestroyChannelResult> interfaceC76768UAy);

    void LLLLLZ(InterfaceC76622U5i interfaceC76622U5i);

    void LLLLLZIL(PermitApplyData permitApplyData, C76600U4m c76600U4m);

    void LLLLLZL(DirectJoinData directJoinData, C76637U5x c76637U5x);

    void LLLLZ(CancelInviteData cancelInviteData, InterfaceC76768UAy<CancelInviteResult> interfaceC76768UAy);

    void LLLLZI(ReplyInviteData replyInviteData, InterfaceC76768UAy<ReplyResult> interfaceC76768UAy);

    void LLLLZIL(KickOutData kickOutData, C76602U4o c76602U4o);

    U7U LLLLZLL();

    boolean LLLLZLLIL();

    void LLLLZLLLI(InviteData inviteData, C76595U4h c76595U4h, InterfaceC65784Pro interfaceC65784Pro);

    void LLLZ(DSLConfig dSLConfig);

    LayoutInfo LLLZI();

    U7W LLLZIIL();

    void LLLZIL(PermitApplyData permitApplyData, InterfaceC76768UAy<PermitResult> interfaceC76768UAy);

    void LLLZL(C75952TrQ c75952TrQ, U4V u4v);

    void LLLZLL(String str, InterfaceC76768UAy<RechargeResult> interfaceC76768UAy);

    void LLLZLZ(ApplyData applyData, InterfaceC76768UAy<ApplyResult> interfaceC76768UAy, InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    void LLLZZ(LeaveChannelData leaveChannelData, InterfaceC76768UAy<LeaveChannelResult> interfaceC76768UAy);

    void LLLZZIL(U6Y u6y);

    void LLZ(KickOutAllData kickOutAllData, C76596U4i c76596U4i);

    void LLZIL(C75951TrP c75951TrP, U4U u4u);

    boolean LLZILL();

    RtcUserInfo LLZL();

    void LLZLI(C76690U7y c76690U7y, C76588U4a c76588U4a);

    String LLZLL();

    boolean LLZLLIL();

    void LLZLLLL(Boolean bool);

    InterfaceC75973Trl LLZZ();

    void LLZZJLIL(C76684U7s c76684U7s, Long l, long j, boolean z, InterfaceC76768UAy<LeaveGroupResult> interfaceC76768UAy);

    void LLZZLLIL(ChangeMaxPositionData changeMaxPositionData, C76601U4n c76601U4n);

    DSLConfig LLZZZIL();

    N39 LLZZZZ();

    void a(JoinChannelData joinChannelData, U6B u6b);

    void b(AqS163S0100000_13 aqS163S0100000_13);

    InterfaceC76652U6m c();

    boolean d();

    void e(C75919Tqt c75919Tqt, InterfaceC76768UAy<CancelInviteJoinGroupResult> interfaceC76768UAy);

    void f(C76689U7x c76689U7x, U4Z u4z);

    void g(String str);

    C73643SvH getRtcAbInfo(MGetABInfosReq mGetABInfosReq);

    int getScene();

    void h(CancelApplyData cancelApplyData, InterfaceC76768UAy<CancelApplyResult> interfaceC76768UAy);

    void i(String str, long j, EnumC76739U9v enumC76739U9v);

    void j(CreateChannelData createChannelData, InterfaceC76768UAy<CreateChannelResult> interfaceC76768UAy, BizResumeParams bizResumeParams);

    C76683U7r k();

    void l(KickOutData kickOutData, C76599U4l c76599U4l);

    void m(C75918Tqs c75918Tqs, InterfaceC76768UAy<CancelApplyJoinGroupResult> interfaceC76768UAy);

    void n(InterfaceC65784Pro<LayoutInfo> interfaceC65784Pro);

    boolean n8();

    void reset();
}
