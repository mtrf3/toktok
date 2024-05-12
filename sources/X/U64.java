package X;

import Y.ARunnableS24S0300000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDo0S413S0100000_13;
import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkFinishReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ResumeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUpdatePushParamStoreIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGCOptimizeSettingV2;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;
import webcast.data.multilive_biz.BizResumeParams;

/* loaded from: classes14.dex */
public final class U64 implements InterfaceC75441TjB, InterfaceC75922Tqw, InterfaceC76622U5i, U9F, U87, U6Y {
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final Room LJLJJI;
    public final String LJLJJL;
    public final ILinkCoreService LJLJJLL;
    public final InterfaceC74805TXl LJLJL;
    public final List<U62> LJLJLJ;
    public final List<U6Y> LJLJLLL;
    public volatile C75745To5 LJLL;
    public volatile U66 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    @Override // X.InterfaceC75441TjB
    public final void LIZJ(C75952TrQ c75952TrQ, InterfaceC75414Tik<ReplyInviteGroupResult> interfaceC75414Tik) {
    }

    @Override // X.U9F
    public final void LJ(long j, int i) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJI(String str) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJIIJ(C75951TrP c75951TrP, InterfaceC75414Tik<PermitApplyGroupResult> interfaceC75414Tik) {
    }

    @Override // X.U9F
    public final void LJIILL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.InterfaceC75441TjB, X.U9F
    public final HashSet<String> LJIILLIIL(String str) {
        return null;
    }

    @Override // X.U9F
    public final void LJIJI(String str, String str2) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIL(ApplyGroupMessage applyGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJ(U7T u7t, JoinChannelMessage joinChannelMessage) {
    }

    @Override // X.U9F
    public final void LJJIFFI() {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJIIJZLJL(C76606U4s c76606U4s, InterfaceC75414Tik<ChangeMaxPositionResult> interfaceC75414Tik) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJIJ(C62819Ol5 c62819Ol5, IDo0S413S0100000_13 iDo0S413S0100000_13) {
    }

    @Override // X.U6Y
    public final void LJJIJIIJI(long j) {
    }

    @Override // X.U87
    public final void LJJIZ(List<LinkUser> list) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJ(ReplyInviteGroupMessage replyInviteGroupMessage) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJJL(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJZ(CancelInviteGroupMessage cancelInviteGroupMessage) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJJZI(C76689U7x c76689U7x, C75891TqR c75891TqR) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJZ(GroupChangeMessage groupChangeMessage) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIJ(C75918Tqs c75918Tqs, C75900Tqa c75900Tqa) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIL(C76690U7y c76690U7y, C75890TqQ c75890TqQ) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJL(int i) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLI(C76180Tv6 c76180Tv6, C74847TZb c74847TZb) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLIIIL(C75993Ts5 c75993Ts5, TZZ tzz) {
    }

    @Override // X.U9F
    public final void LJLIIL(RtcStartResultMessage rtcStartResultMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLIL(LeaveGroupMessage leaveGroupMessage) {
    }

    @Override // X.U6Y
    public final void LJLJI(long j) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLJJI(C76684U7s c76684U7s, InterfaceC75414Tik<LeaveGroupResult> interfaceC75414Tik) {
    }

    @Override // X.U9F
    public final void LJLJJL() {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLL(TTS tts) {
    }

    @Override // X.U9F
    public final void LJLLI(boolean z, LinkCoreError linkCoreError) {
    }

    @Override // X.U9F
    public final void LJLLLLLL(LinkCoreError linkCoreError) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLZ(String str) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LJZ(C75186Tf4 c75186Tf4, C74848TZc c74848TZc) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LL(PermitApplyGroupMessage permitApplyGroupMessage) {
    }

    @Override // X.U9F
    public final void LLFF() {
    }

    @Override // X.U9F
    public final void LLIFFJFJJ() {
    }

    @Override // X.InterfaceC76622U5i
    public final void LLII(CancelApplyGroupMessage cancelApplyGroupMessage) {
    }

    @Override // X.U9F
    public final void LLIIIL(Object... objArr) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LLIILZL(InviteGroupMessage inviteGroupMessage) {
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILLJJLI(P2PGroupChangeMessage p2PGroupChangeMessage, boolean z) {
    }

    @Override // X.U9F
    public final void LLILLL(String str) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LLILZ(C35749E1h c35749E1h, InterfaceC75414Tik<DirectJoinResult> interfaceC75414Tik) {
    }

    @Override // X.U6Y
    public final void LLILZIL(long j) {
    }

    @Override // X.U6Y
    public final void LLILZLL(long j) {
    }

    @Override // X.U6Y
    public final void LLIZ(long j, long j2) {
    }

    @Override // X.U6Y
    public final void LLJ(long j, long j2) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LLJI(C75919Tqt c75919Tqt, C75901Tqb c75901Tqb) {
    }

    @Override // X.InterfaceC75441TjB
    public final boolean LLLLJI() {
        return false;
    }

    @Override // X.InterfaceC75441TjB
    public final boolean LLLLLILLIL() {
        return false;
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLLLJ(long j) {
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLLLL(InterfaceC65784Pro<Boolean> autoJoin) {
        o.LJIIIZ(autoJoin, "autoJoin");
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLLLLLLL(AqS163S0100000_13 aqS163S0100000_13) {
    }

    @Override // X.InterfaceC75441TjB
    public final boolean LLLLZLLIL() {
        return false;
    }

    @Override // X.InterfaceC75441TjB
    public final int LIZIZ() {
        U66 u66 = this.LJLLI;
        if (u66 != null) {
            return u66.LIZIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC75441TjB
    public final TQU LIZLLL() {
        return (U7E) this.LJLLLLLL.getValue();
    }

    @Override // X.U9F
    public final void LJJIJIIJIL() {
        Iterator<U62> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJJIJIIJIL();
        }
    }

    @Override // X.U9F
    public final RTCClientData LJJIJL() {
        UB9 ub9;
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            ((U62) it.next()).LJJLIIIJLJLI(this, this.LJLL);
        }
        C75745To5 c75745To5 = this.LJLL;
        RTCClientData rTCClientData = null;
        String str = null;
        if (c75745To5 != null) {
            RTCClientData.Builder builder = new RTCClientData.Builder();
            InterfaceC76645U6f interfaceC76645U6f = c75745To5.LIZJ;
            if (interfaceC76645U6f != null) {
                ub9 = interfaceC76645U6f.create();
            } else {
                ub9 = null;
            }
            builder.setClient(ub9);
            builder.setShouldMixStream(c75745To5.LIZ);
            MixInfo.Builder builder2 = new MixInfo.Builder();
            MixInfo mixInfo = c75745To5.LIZIZ;
            if (mixInfo != null) {
                str = mixInfo.getStreamUrl();
            }
            builder2.setStreamUrl(str);
            builder2.setStreamMixer(LLJILJIL().LJJIIZI());
            builder.setMixerInfo(builder2.build());
            builder.setPushAdvance(c75745To5.LIZLLL);
            builder.setInitInBackground(c75745To5.LJ);
            builder.setGenerateRTCParamByRole(c75745To5.LJI);
            builder.setBusinessSideEnableIndependentMixStreamParams(c75745To5.LJII);
            rTCClientData = builder.build();
        }
        o.LJI(rTCClientData);
        return rTCClientData;
    }

    @Override // X.InterfaceC76622U5i
    public final boolean LJJLIIIJILLIZJL() {
        return this.LJLJL.isActive();
    }

    @Override // X.InterfaceC75441TjB
    public final InterfaceC75011TcF LJZI() {
        return (InterfaceC75011TcF) this.LJLLJ.getValue();
    }

    @Override // X.InterfaceC75441TjB
    public final InterfaceC76652U6m LJZL() {
        U66 u66 = this.LJLLI;
        if (u66 != null) {
            return u66.c();
        }
        return null;
    }

    @Override // X.InterfaceC76622U5i
    public final boolean LLFFF() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        C75745To5 c75745To5 = ((U6S) this.LJLLILLLL.getValue()).LIZ.LJLL;
        if (c75745To5 != null && (interfaceC65784Pro = c75745To5.LJIIIIZZ) != null) {
            return interfaceC65784Pro.invoke().booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC75441TjB
    public final InterfaceC75973Trl LLIIJI() {
        return (C76130TuI) this.LJLLL.getValue();
    }

    @Override // X.InterfaceC75441TjB
    public final InterfaceC74695TTf LLIIJLIL() {
        return (U6S) this.LJLLILLLL.getValue();
    }

    public final U8H LLJILJIL() {
        return (U8H) this.LJLLLL.getValue();
    }

    @Override // X.InterfaceC75441TjB
    public final RtcUserInfo LLLLLJIL() {
        RtcUserInfo LLZL;
        U66 u66 = this.LJLLI;
        if (u66 == null || (LLZL = u66.LLZL()) == null) {
            return new RtcUserInfo(this.LJLJJI.getId(), -1L, "", false, -1L);
        }
        return LLZL;
    }

    @Override // X.InterfaceC75441TjB
    public final String LLLLLLIL() {
        String l;
        U66 u66 = this.LJLLI;
        if (u66 == null || (l = Long.valueOf(u66.LJJLI()).toString()) == null) {
            return "";
        }
        return l;
    }

    @Override // X.InterfaceC75441TjB
    public final U8H LJJZZI() {
        return LLJILJIL();
    }

    @Override // X.InterfaceC75441TjB
    public final java.util.Map<String, String> LLFZ() {
        java.util.Map<String, String> sceneMap;
        DslLayout dslLayout = LLJILJIL().LJIILIIL;
        if (dslLayout == null || (sceneMap = dslLayout.getSceneMap()) == null) {
            return C113554cx.LJJJLIIL();
        }
        return sceneMap;
    }

    public final U66 LLJILJILJ() {
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            U66 u66 = this.LJLLI;
            if (u66 == null) {
                U7F iE = this.LJLJJLL.iE();
                o.LJI(iE);
                iE.g(this.LJLJJL);
                LLJIJIL(iE);
                return iE;
            }
            return u66;
        }
        U66 u662 = this.LJLLI;
        if (u662 != null) {
            return u662;
        }
        U6D ZH = this.LJLJJLL.ZH(this.LJLILLLLZI);
        o.LJI(ZH);
        ZH.g(this.LJLJJL);
        LLJIJIL(ZH);
        return ZH;
    }

    @Override // X.InterfaceC75441TjB
    public final boolean isNeedPublishFrame() {
        return LLJILJILJ().LLLLZLL().LJJIII();
    }

    @Override // X.InterfaceC75441TjB
    public final EnumC31946CgI LJJJJ() {
        return EnumC31946CgI.MULTI_ARCH;
    }

    @Override // X.InterfaceC75441TjB
    public final int LJLJJLL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC75441TjB
    public final EnumC75780Toe LJLJLLL() {
        return EnumC75780Toe.CoLinkMicSession;
    }

    @Override // X.InterfaceC76622U5i
    public final List<U62> LLFII() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC75441TjB
    public final java.util.Set<Long> LLLLLJLJLL() {
        return OQY.INSTANCE;
    }

    @Override // X.InterfaceC75441TjB
    public final java.util.Set<Long> LLLLLL() {
        return OQY.INSTANCE;
    }

    @Override // X.InterfaceC75441TjB
    public final int scene() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC76622U5i
    public final void LJII(InterfaceC75941TrF interfaceC75941TrF) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            ((U62) it.next()).LJII(interfaceC75941TrF);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.U9F
    public final void LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.U9F
    public final void LJJI(LinkCoreError error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJI(InterfaceC75414Tik<RechargeResult> interfaceC75414Tik) {
        C76766UAw.LIZJ.LIZJ(new ARunnableS49S0100000_13(this, 188));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJIL(U62 listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJLJLJ).add(listener);
    }

    @Override // X.U6Y
    public final void LJJJJI(long j) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            ((U6Y) it.next()).LJJJJI(j);
        }
    }

    @Override // X.U6Y
    public final void LJJJJJL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<U6Y> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LJJJJJL(linkMicId);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJLI(LinkUser user) {
        o.LJIIIZ(user, "user");
        LLJILJIL().LJJZZI(EnumC75419Tip.StatePreparing, user);
    }

    @Override // X.U87
    public final void LJJJJLL(LinkUser linkUser) {
        o.LJIIIZ(linkUser, "linkUser");
    }

    @Override // X.U6Y
    public final void LJJJLIIL(long j) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            ((U6Y) it.next()).LJJJLIIL(j);
        }
    }

    @Override // X.U6Y
    public final void LJJJLZIJ(long j) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            ((U6Y) it.next()).LJJJLZIJ(j);
        }
    }

    @Override // X.U87
    public final void LJJL(java.util.Map<Long, ? extends List<GroupChannelUser>> groupChannelMap) {
        o.LJIIIZ(groupChannelMap, "groupChannelMap");
    }

    @Override // X.InterfaceC75441TjB
    public final synchronized void LJJLI(String source) {
        o.LJIIIZ(source, "source");
        U4R.LIZLLL("CoLinkMicSession", "dispose ");
        LLJILJIL().destroy();
        U66 u66 = this.LJLLI;
        if (u66 != null) {
            u66.LJIIJJI(source, true);
        }
        U66 u662 = this.LJLLI;
        if (u662 != null) {
            u662.LLLLL(this);
        }
        this.LJLLI = null;
    }

    @Override // X.InterfaceC76622U5i
    public final List LJJLIIIJLJLI(U7F linker) {
        o.LJIIIZ(linker, "linker");
        List<U62> list = this.LJLJLJ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((CopyOnWriteArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((U62) it.next()).LLIL(this));
        }
        return arrayList;
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJZ(U6Y listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJLJLLL).add(listener);
    }

    @Override // X.U87
    public final void LJLLJ(List<LinkUser> willJoinLinkedList) {
        o.LJIIIZ(willJoinLinkedList, "willJoinLinkedList");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLLL(long j) {
        String str;
        Long l;
        String str2;
        RtcUserInfo LLZL;
        LLJILJIL().LJJLIIIJLJLI(j);
        String idStr = this.LJLJJI.getIdStr();
        o.LJIIIIZZ(idStr, "room.idStr");
        U66 u66 = this.LJLLI;
        if (u66 == null || (LLZL = u66.LLZL()) == null || (str = LLZL.getLinkMicId()) == null) {
            str = "";
        }
        U66 u662 = this.LJLLI;
        if (u662 != null) {
            l = Long.valueOf(u662.LJJLI());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        if (LLJILJIL().LJJIJL()) {
            str2 = "audience";
        } else if (this.LJLJJI.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            str2 = "anchor";
        } else {
            str2 = "guest";
        }
        C32014ChO.LJIIIIZZ(new C32016ChQ(idStr, str, valueOf, str2, "MULTI_HOST"));
    }

    @Override // X.U6Y
    public final void LLIIII(long j) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            ((U6Y) it.next()).LLIIII(j);
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LLIILII(U62 listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJLJLJ).remove(listener);
    }

    @Override // X.InterfaceC76622U5i
    public final List LLIIZ(U7T linker) {
        o.LJIIIZ(linker, "linker");
        return null;
    }

    @Override // X.U9F
    public final void LLIZLLLIL(LinkCoreError error) {
        o.LJIIIZ(error, "error");
    }

    public final void LLJIJIL(U66 linker) {
        o.LJIIIZ(linker, "linker");
        U66 u66 = this.LJLLI;
        if (u66 != null) {
            u66.LJIIJJI("destroy_last_linker_when_bind_new_link", true);
        }
        this.LJLLI = linker;
        U4R.LIZLLL("CoLinkMicSession", "initLinker ");
        linker.LLLLLZ(this);
        linker.LLLLZLL().LJFF = this;
        linker.LLZZ().LJJIJL(this);
        linker.LLLZZIL(this);
        linker.b(new AqS163S0100000_13(this, 443));
        linker.n(new AqS163S0100000_13(this, 452));
        LLJILJIL().LJJLIIIJLJLI(linker.LJJLI());
    }

    public final boolean LLJILLL(U66 u66) {
        U66 u662;
        if (this.LJLLI == null) {
            return false;
        }
        if (!o.LJ(this.LJLLI, u66) && ((u662 = this.LJLLI) == null || u662.LJJLI() != u66.LJJLI())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLL(U6Y listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJLJLLL).remove(listener);
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLLIL(N39 sessionBusinessConfig) {
        o.LJIIIZ(sessionBusinessConfig, "sessionBusinessConfig");
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            LLJILJILJ().LLLLLIL(sessionBusinessConfig);
        }
    }

    @Override // X.U9F
    public final void onUserJoined(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        LLJILJIL().LJJJJIZL.LIZJ(linkMicId);
    }

    @Override // X.U9F
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(surfaceView, "surfaceView");
        LLJILJIL().LJJJJIZL.LIZ(linkMicId, surfaceView, null);
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            ((U62) it.next()).LL(this, linkMicId);
        }
    }

    @Override // X.InterfaceC75922Tqw
    public final void LJFF(C76113Tu1 c76113Tu1, InterfaceC75414Tik<ResumeResult> interfaceC75414Tik) {
        U4R.LIZLLL("CoLinkMicSession", "resume multi co-host");
        C76766UAw.LIZJ.LIZJ(new ARunnableS24S0300000_13(this, c76113Tu1, (IDo0S413S0100000_13) interfaceC75414Tik, 27));
    }

    @Override // X.U87
    public final void LJIIIIZZ(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        U4R.LIZLLL("CoLinkMicSession", "onLocalLinkedListWillChange");
        ArrayList arrayList = new ArrayList();
        Iterator<LinkUser> it = newLinkedList.iterator();
        while (it.hasNext()) {
            String linkMicId = it.next().getLinkMicId();
            if (linkMicId != null) {
                arrayList.add(linkMicId);
            } else {
                U4R.LIZIZ("CoLinkMicSession", "user.linkMicId is null ");
            }
        }
        LLJILJIL().LJJJJLI(arrayList);
        LLJILJILJ().LLLLZLL().LJIJJ("CoLinkMicSession onLocalLinkedListWillChange");
        C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, oldLinkedList, newLinkedList, 25));
    }

    @Override // X.U87
    public final void LJIIIZ(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        U4R.LIZLLL("CoLinkMicSession", "onLocalLinkedListDidChange ");
        LLJILJIL().LJJJJLI(null);
        LLJILJILJ().LLLLZLL().LJIJJ("CoLinkMicSession onLocalLinkedListDidChange");
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            ((U62) it.next()).LJIIIZ(oldLinkedList, newLinkedList);
        }
    }

    @Override // X.U9F
    public final void LJIIJJI(String linkMicId, String message) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(message, "message");
    }

    @Override // X.U9F
    public final void LJIIL(long j, long j2) {
        Iterator<U62> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIIL(j, j2);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIILJJIL(U7T linker, KickOutMessage kickOutMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJJJIL(this, kickOutMessage);
            }
        }
    }

    @Override // X.U9F
    public final void LJIJ(String linkMicId, ILayerControl.ILayer layer) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(layer, "layer");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJIJJ(U66 linker, LeaveMessage leaveMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJIIJJI(this, leaveMessage);
            }
        }
    }

    @Override // X.U9F
    public final void LJJIII(String linkMicId, String message) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(message, "message");
        Iterator<U62> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJLLI(this, linkMicId, message);
        }
    }

    @Override // X.U9F
    public final void LJJIIZI(String linkMicId, long j) {
        o.LJIIIZ(linkMicId, "linkMicId");
        int i = LLJILJILJ().k().LIZ;
        StringBuilder LIZJ = C06490Nh.LIZJ("onUserLeft:linkMicId:", linkMicId, ", leaveReason:", j);
        LIZJ.append(", current state:");
        LIZJ.append(i);
        LIZJ.append(' ');
        U4R.LIZLLL("CoLinkMicSession", X1D.LIZIZ(LIZJ));
        LLJILJILJ().i(linkMicId, j, EnumC76739U9v.KICKOUT_RTC_STREAM_TIMEOUT);
        if (i == 5 && LLJILJILJ().LLZZ().LJJIIZI().size() <= 1) {
            U4R.LIZLLL("CoLinkMicSession", "only self, do leave ");
            U66 LLJILJILJ = LLJILJILJ();
            LeaveChannelData.Builder builder = new LeaveChannelData.Builder();
            builder.setLeaveSource(LinkFinishReason.Companion.stateToString(5));
            builder.setLeaveReason(5);
            LLJILJILJ.LLLZZ(builder.build(), new U6Q());
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            ((U62) it.next()).LJJIIZI(linkMicId, j);
        }
        LLJILJIL().LJJJJIZL.LIZLLL(linkMicId, j);
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJIJLIJ(C28272B7s c28272B7s, InterfaceC75804Tp2 interfaceC75804Tp2) {
        if (interfaceC75804Tp2 != null && (interfaceC75804Tp2 instanceof SeiAppData) && c28272B7s != null && c28272B7s.LIZIZ != null) {
            if (!LiveGCOptimizeSettingV2.disableSEILog()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onSei:");
                LIZ.append(c28272B7s);
                LIZ.append(", seiAppData:");
                LIZ.append(interfaceC75804Tp2);
                LIZ.append(' ');
                U4R.LIZ("CoLinkMicSession", X1D.LIZIZ(LIZ));
            }
            LLJILJILJ().c().LJ(interfaceC75804Tp2);
            LLJILJIL().LJJJJIZL.LIZIZ(c28272B7s, interfaceC75804Tp2, false);
        }
    }

    @Override // X.U9F
    public final void LJJIL(String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<U62> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIILLIIL(linkMicId, z);
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJJIZL(C76002TsE c76002TsE, InterfaceC75414Tik<CancelApplyResult> interfaceC75414Tik) {
        C76766UAw.LIZJ.LIZJ(new ARunnableS24S0300000_13(this, c76002TsE, interfaceC75414Tik, 21));
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJJJJ(U6D linker, InviteMessage inviteMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJJLL(this, inviteMessage);
            }
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJLL(C75186Tf4 c75186Tf4, InterfaceC75414Tik<KickOutResult> interfaceC75414Tik) {
        interfaceC75414Tik.LJ(LinkCoreError.Companion.getCOMMON_UNKNOWN(), null);
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLIIIIJ(U7T linker, InviteMessage inviteMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIIJ(C76012TsO c76012TsO, InterfaceC75414Tik<LeaveChannelResult> interfaceC75414Tik) {
        C76766UAw.LIZJ.LIZJ(new ARunnableS24S0300000_13(this, c76012TsO, interfaceC75414Tik, 24));
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLIIIJJI(U6D linker, CancelInviteMessage cancelInviteMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJJII(this, cancelInviteMessage);
            }
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIIJJIZ(C76180Tv6 c76180Tv6, InterfaceC75414Tik<InviteResult> interfaceC75414Tik) {
        C76766UAw.LIZJ.LIZJ(new ARunnableS24S0300000_13(this, c76180Tv6, interfaceC75414Tik, 23));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIIJL(C75911Tql c75911Tql, InterfaceC75414Tik<ReplyResult> interfaceC75414Tik) {
        if (c75911Tql.LIZJ == 1) {
            U8H LLJILJIL = LLJILJIL();
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setLinkMicId(LLJILJILJ().LLZL().getLinkMicId());
            builder.setRoomId(Long.valueOf(LLJILJILJ().LLZL().getRoomId()));
            builder.setUserId(Long.valueOf(LLJILJILJ().LLZL().getUserId()));
            LinkUser owner = builder.build();
            LLJILJIL.getClass();
            o.LJIIIZ(owner, "owner");
            LLJILJIL.LJIILLIIL = owner;
        }
        U66 LLJILJILJ = LLJILJILJ();
        LiveRoomUser.Builder builder2 = new LiveRoomUser.Builder();
        builder2.setRoomId(c75911Tql.LIZ);
        builder2.setUserId(c75911Tql.LIZIZ);
        ReplyInviteData.Builder builder3 = new ReplyInviteData.Builder(builder2.build());
        builder3.setReplyStatus(c75911Tql.LIZJ);
        LLJILJILJ.LLLLZI(builder3.build(), new U5J(interfaceC75414Tik));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIIJLLLLLLLZ(TZS tzs, InterfaceC75414Tik<DestroyChannelResult> interfaceC75414Tik) {
        interfaceC75414Tik.LJ(LinkCoreError.Companion.getCOMMON_UNKNOWN(), null);
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLJ(U6D linker, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            if (replyInviteMessage.getReplyStatus() == 1) {
                U8H LLJILJIL = LLJILJIL();
                LinkUser.Builder builder = new LinkUser.Builder();
                builder.setLinkMicId(linker.LLZL().getLinkMicId());
                builder.setRoomId(Long.valueOf(linker.LLZL().getRoomId()));
                builder.setUserId(Long.valueOf(linker.LLZL().getUserId()));
                LinkUser owner = builder.build();
                LLJILJIL.getClass();
                o.LJIIIZ(owner, "owner");
                LLJILJIL.LJIILLIIL = owner;
                LLJILJIL().LJJZZI(EnumC75419Tip.StatePreparing, replyInviteMessage.getInvitee());
            }
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LLILII(this, replyInviteMessage);
            }
        }
    }

    @Override // X.U87
    public final void LJJLJLI(List linkedUsers, String str) {
        o.LJIIIZ(linkedUsers, "linkedUsers");
        List<LinkUser> K9 = LLJILJILJ().LLZZ().K9();
        List<LinkUser> LJJJ = LLJILJILJ().LLZZ().LJJJ();
        LLJILJIL().LJJJJ();
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            U62 u62 = (U62) it.next();
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            TRA.LJJIJIIJI(u62, this, linkedUsers, LJJJ, K9, c61878OQg, c61878OQg, c61878OQg, c61878OQg, str, 512);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJLL(U7T linker, PermitApplyMessage permitApplyMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJZZIII(U7T linker, DirectJoinMessage directJoinMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLILLLLZI(U6D linker, DestroyChannelMessage destroyChannelMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJJJI(this, destroyChannelMessage);
            }
        }
    }

    @Override // X.U6Y
    public final void LJLJL(long j, long j2) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            ((U6Y) it.next()).LJLJL(j, j2);
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLJLJ(C76179Tv5 c76179Tv5, InterfaceC75414Tik<ApplyResult> interfaceC75414Tik) {
        C76766UAw.LIZJ.LIZJ(new ARunnableS24S0300000_13(this, c76179Tv5, interfaceC75414Tik, 20));
    }

    @Override // X.InterfaceC76622U5i
    public final void LJLLILLLL(U6D linker, ApplyMessage applyMessage) {
        o.LJIIIZ(linker, "linker");
        U4R.LIZLLL("CoLinkMicSession", "onApplyMessageReceived ");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LLILLJJLI(this, applyMessage);
            }
        }
    }

    @Override // X.U87
    public final void LJLLLL(List applicants, String str) {
        o.LJIIIZ(applicants, "applicants");
        List<LinkUser> K9 = LLJILJILJ().LLZZ().K9();
        List<LinkUser> LJJIIZI = LLJILJILJ().LLZZ().LJJIIZI();
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            U62 u62 = (U62) it.next();
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            TRA.LJJIJIIJI(u62, this, LJJIIZI, applicants, K9, c61878OQg, c61878OQg, c61878OQg, c61878OQg, str, 512);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLD(U6D linker, PermitApplyMessage permitApplyMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            if (permitApplyMessage.getPermitStatus() == 1) {
                U8H LLJILJIL = LLJILJIL();
                LinkUser.Builder builder = new LinkUser.Builder();
                builder.setLinkMicId(linker.LLZL().getLinkMicId());
                builder.setRoomId(Long.valueOf(linker.LLZL().getRoomId()));
                builder.setUserId(Long.valueOf(linker.LLZL().getUserId()));
                LinkUser owner = builder.build();
                LLJILJIL.getClass();
                o.LJIIIZ(owner, "owner");
                LLJILJIL.LJIILLIIL = owner;
            }
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJLLILLLL(this, permitApplyMessage);
            }
        }
    }

    @Override // X.U9F
    public final void LLF(String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.InterfaceC76622U5i
    public final void LLI(int i, U6D linker) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJLILLLLZI(this, i);
            }
            if (LinkMicUpdatePushParamStoreIdSetting.INSTANCE.getValue()) {
                RtcUserInfo LLZL = linker.LLZL();
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LinkCoreModelKt.isAnchor(LLZL)))) {
                    if (i != 0) {
                        if (i != 4 && i != 5) {
                            if (i != 6) {
                                return;
                            }
                        } else {
                            C31014CFe.LJIILL();
                            C31014CFe.LIZLLL(String.valueOf(LLZL.getChannelId()));
                            C31014CFe.LJIIJJI(LLZL.getLinkMicId());
                            return;
                        }
                    }
                    C31014CFe.LIZLLL("");
                    C31014CFe.LJIIJJI("");
                }
            }
        }
    }

    @Override // X.U6Y
    public final void LLIIIILZ(long j, long j2) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            ((U6Y) it.next()).LLIIIILZ(j, j2);
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LLIIIJ(C76001TsD c76001TsD, InterfaceC75414Tik<CancelInviteResult> interfaceC75414Tik) {
        C76766UAw.LIZJ.LIZJ(new ARunnableS24S0300000_13(this, c76001TsD, interfaceC75414Tik, 22));
    }

    @Override // X.InterfaceC75441TjB
    public final void LLIIIZ(C75993Ts5 c75993Ts5, InterfaceC75414Tik<PermitResult> interfaceC75414Tik) {
        C76766UAw.LIZJ.LIZJ(new ARunnableS24S0300000_13(this, c75993Ts5, interfaceC75414Tik, 26));
    }

    @Override // X.U87
    public final void LLIIL(List<LinkUser> list, List<LinkUser> list2) {
        U4P.LIZ(list, list2);
    }

    @Override // X.InterfaceC76622U5i
    public final void LLIL(U6D linker, CreateChannelMessage createChannelMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJLZ(this, createChannelMessage);
            }
        }
    }

    @Override // X.U87
    public final void LLILII(List invitees, String str) {
        o.LJIIIZ(invitees, "invitees");
        List<LinkUser> LJJJ = LLJILJILJ().LLZZ().LJJJ();
        List<LinkUser> LJJIIZI = LLJILJILJ().LLZZ().LJJIIZI();
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            U62 u62 = (U62) it.next();
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            TRA.LJJIJIIJI(u62, this, LJJIIZI, LJJJ, invitees, c61878OQg, c61878OQg, c61878OQg, c61878OQg, str, 512);
        }
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILIL(U7T linker, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(linker, "linker");
    }

    @Override // X.InterfaceC76622U5i
    public final void LLILLIZIL(U6D linker, CancelApplyMessage cancelApplyMessage) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJZ(this, cancelApplyMessage);
            }
        }
    }

    @Override // X.U9F
    public final void LJIIZILJ(String linkMicId, float f, float f2) {
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<U62> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIIZILJ(linkMicId, f, f2);
        }
    }

    @Override // X.U9F
    public final void LJJII(int i, int i2, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<U62> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJJJJIZL(this, i, i2);
        }
    }

    @Override // X.U9F
    public final void LJJIIJ(String[] linkIds, boolean[] talkStates, int[] talkVolumes) {
        o.LJIIIZ(linkIds, "linkIds");
        o.LJIIIZ(talkStates, "talkStates");
        o.LJIIIZ(talkVolumes, "talkVolumes");
    }

    @Override // X.InterfaceC75441TjB
    public final void LLILL(C76611U4x c76611U4x, InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik, BizResumeParams bizResumeParams) {
        interfaceC75414Tik.onSuccess(new CreateChannelResult(null, false, null, null, 14, null));
    }

    @Override // X.InterfaceC76622U5i
    public final void LJJIIZ(U6D linker, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason) {
        o.LJIIIZ(linker, "linker");
        if (LLJILLL(linker)) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJJLIIIJL(this, i, linkCoreError, abnormalDisconnectReason);
            }
        }
    }

    @Override // X.U9F
    public final void LJJIJIL(String linkMicId, SurfaceView surfaceView, int i, int i2) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(surfaceView, "surfaceView");
    }

    public U64(Context context, int i, int i2, Room room, String str, ILinkCoreService linkCoreService, InterfaceC74805TXl linkMicManager) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(room, "room");
        o.LJIIIZ(linkCoreService, "linkCoreService");
        o.LJIIIZ(linkMicManager, "linkMicManager");
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = room;
        this.LJLJJL = str;
        this.LJLJJLL = linkCoreService;
        this.LJLJL = linkMicManager;
        this.LJLJLJ = new CopyOnWriteArrayList();
        this.LJLJLLL = new CopyOnWriteArrayList();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 441));
        this.LJLLJ = C221108m2.LIZIZ(U6V.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 442));
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 439));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 440));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init channelId:");
        LIZ.append(str);
        LIZ.append(", this:");
        LIZ.append(this);
        LIZ.append(' ');
        U4R.LIZLLL("CoLinkMicSession", X1D.LIZIZ(LIZ));
        U8K.LJ = room.getIdStr();
        U8K.LJI = 2;
        LiveMode streamType = room.getStreamType();
        o.LJIIIIZZ(streamType, "room.streamType");
        U8K.LJFF = C28509BGv.LIZ(streamType);
    }
}
