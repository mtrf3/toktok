package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.AbstractC75942TrG;
import X.ActivityC45651qj;
import X.B5G;
import X.BML;
import X.C05170If;
import X.C107084Ie;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C1DH;
import X.C221108m2;
import X.C29306Beo;
import X.C29S;
import X.C2A7;
import X.C31413CUn;
import X.C32I;
import X.C3C5;
import X.C41051jJ;
import X.C61878OQg;
import X.C62822Ol8;
import X.C75017TcL;
import X.C75633TmH;
import X.C75642TmQ;
import X.C75678Tn0;
import X.C75852Tpo;
import X.C75878TqE;
import X.C75943TrH;
import X.C75944TrI;
import X.C76005TsH;
import X.C76006TsI;
import X.C76029Tsf;
import X.C76097Ttl;
import X.C76800UCe;
import X.C86881Y7x;
import X.C90903hW;
import X.CR6;
import X.CXJ;
import X.RunnableC31065CHd;
import X.U26;
import Y.IDCListenerS209S0100000_13;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.CoHostBeInvitedShowEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.abtest.MultiHostTimeoutAbTestHelper;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostFullLinkMonitorPopupGetUIDSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostFullLinkMonitorSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS40S0100100_13;
import kotlin.jvm.internal.o;
import webcast.im.JoinGroupMessageExtra;

/* loaded from: classes14.dex */
public final class MultiCoHostBeInvitedFragment extends MultiCoHostBeInvitedContract$AbsView {
    public static final /* synthetic */ int LJZI = 0;
    public View LJLJJL;
    public LinkerInviteContent LJLLI;
    public C75678Tn0 LJLLILLLL;
    public DataChannel LJLLJ;
    public boolean LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 132));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 134));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 133));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 131));
    public final C31413CUn LJLL = new C31413CUn();
    public int LJLLL = 1;
    public final long LJLLLL = SystemClock.uptimeMillis();
    public String LJLLLLLL = "show";

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final RunnableC31065CHd Gl() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-mCoHostUsersRecyclerView>(...)");
        return (RunnableC31065CHd) value;
    }

    public final C41051jJ Hl() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-mSettingsCheckBox>(...)");
        return (C41051jJ) value;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final void dismiss() {
        if (!this.mStatusViewValid) {
            return;
        }
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 130));
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        String string;
        String str;
        String LIZIZ;
        InviterRivalExtra inviterRivalExtra;
        String str2;
        JoinGroupMessageExtra joinGroupMessageExtra;
        JoinGroupMessageExtra.RivalExtra rivalExtra;
        C76029Tsf c76029Tsf = new C76029Tsf();
        C75678Tn0 c75678Tn0 = this.LJLLILLLL;
        if (c75678Tn0 != null && c75678Tn0.LJIIIZ) {
            string = getString(R.string.lzg);
        } else if (this.LJLLL == 2) {
            Object[] objArr = new Object[1];
            String str3 = null;
            if (c75678Tn0 != null) {
                MHJoinBizContent mHJoinBizContent = c75678Tn0.LJI;
                if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null && (rivalExtra = joinGroupMessageExtra.extra) != null) {
                    str2 = rivalExtra.displayId;
                    str3 = rivalExtra.nickname;
                } else {
                    str2 = null;
                }
                LIZIZ = C05170If.LIZIZ(str2, str3);
                o.LJIIIIZZ(LIZIZ, "getDisplayName(userInfo?…ayId, userInfo?.nickname)");
            } else {
                LinkerInviteContent linkerInviteContent = this.LJLLI;
                if (linkerInviteContent != null) {
                    LinkerInviteMessageExtra linkerInviteMessageExtra = linkerInviteContent.linkerInviteMsgExtra;
                    if (linkerInviteMessageExtra != null && (inviterRivalExtra = linkerInviteMessageExtra.inviterRivalExtra) != null) {
                        str = inviterRivalExtra.displayId;
                        str3 = inviterRivalExtra.nickname;
                    } else {
                        str = null;
                    }
                    LIZIZ = C05170If.LIZIZ(str, str3);
                    o.LJIIIIZZ(LIZIZ, "getDisplayName(userInfo?…ayId, userInfo?.nickname)");
                } else {
                    o.LJIJI("inviteContent");
                    throw null;
                }
            }
            objArr[0] = LIZIZ;
            string = C15380j0.LJIILL(R.string.kjf, objArr);
        } else {
            string = getString(R.string.kjg);
        }
        o.LJIIIIZZ(string, "if (joinMessage?.isCross…tojoin)\n                }");
        c76029Tsf.LIZ = string;
        c76029Tsf.LJFF = false;
        return c76029Tsf;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final long wl() {
        InviterRivalExtra inviterRivalExtra;
        C75678Tn0 c75678Tn0 = this.LJLLILLLL;
        if (c75678Tn0 != null) {
            return c75678Tn0.LIZJ;
        }
        if (MtCoHostFullLinkMonitorPopupGetUIDSetting.INSTANCE.isEnable()) {
            LinkerInviteContent linkerInviteContent = this.LJLLI;
            if (linkerInviteContent != null) {
                return linkerInviteContent.fromUserId;
            }
            o.LJIJI("inviteContent");
            throw null;
        }
        LinkerInviteContent linkerInviteContent2 = this.LJLLI;
        if (linkerInviteContent2 != null) {
            LinkerInviteMessageExtra linkerInviteMessageExtra = linkerInviteContent2.linkerInviteMsgExtra;
            if (linkerInviteMessageExtra == null || (inviterRivalExtra = linkerInviteMessageExtra.inviterRivalExtra) == null) {
                return 0L;
            }
            return inviterRivalExtra.userId;
        }
        o.LJIJI("inviteContent");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLILLLLZI = null;
    }

    public final void Al(int i) {
        if (!this.mStatusViewValid) {
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        Il(z2);
        HashMap hashMap = new HashMap();
        hashMap.put("show_timestamp", Long.valueOf(this.LJLLLL));
        if (this.mStatusViewValid) {
            z = Hl().isChecked();
        }
        hashMap.put("is_turn_off", Boolean.valueOf(z));
        C75678Tn0 c75678Tn0 = this.LJLLILLLL;
        if (c75678Tn0 != null) {
            AbstractC75942TrG abstractC75942TrG = (AbstractC75942TrG) this.LJLILLLLZI;
            if (abstractC75942TrG != null) {
                abstractC75942TrG.LJFF(c75678Tn0, i, hashMap);
            }
        } else {
            AbstractC75942TrG abstractC75942TrG2 = (AbstractC75942TrG) this.LJLILLLLZI;
            if (abstractC75942TrG2 != null) {
                LinkerInviteContent linkerInviteContent = this.LJLLI;
                if (linkerInviteContent != null) {
                    abstractC75942TrG2.LJ(linkerInviteContent, i, hashMap);
                } else {
                    o.LJIJI("inviteContent");
                    throw null;
                }
            }
        }
        C75852Tpo.LIZ("MultiCoHostPrivateAccountDialog");
        this.LJLIL.dismiss();
    }

    public final void Dl(int i) {
        if (!this.mStatusViewValid) {
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        Il(z2);
        HashMap hashMap = new HashMap();
        hashMap.put("show_timestamp", Long.valueOf(this.LJLLLL));
        if (this.mStatusViewValid) {
            z = Hl().isChecked();
        }
        hashMap.put("is_turn_off", Boolean.valueOf(z));
        C75678Tn0 c75678Tn0 = this.LJLLILLLL;
        if (c75678Tn0 != null) {
            AbstractC75942TrG abstractC75942TrG = (AbstractC75942TrG) this.LJLILLLLZI;
            if (abstractC75942TrG != null) {
                abstractC75942TrG.LJII(c75678Tn0, i, hashMap);
            }
        } else {
            AbstractC75942TrG abstractC75942TrG2 = (AbstractC75942TrG) this.LJLILLLLZI;
            if (abstractC75942TrG2 != null) {
                LinkerInviteContent linkerInviteContent = this.LJLLI;
                if (linkerInviteContent != null) {
                    abstractC75942TrG2.LJI(linkerInviteContent, i, hashMap);
                } else {
                    o.LJIJI("inviteContent");
                    throw null;
                }
            }
        }
        C75852Tpo.LIZ("MultiCoHostPrivateAccountDialog");
        this.LJLIL.dismiss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if (r5 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Il(boolean r19) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment.Il(boolean):void");
    }

    public final void Jl(int i) {
        MHMessageInfo mHMessageInfo;
        MHMessageInfo mHMessageInfo2;
        int i2 = this.LJLLL;
        long j = 0;
        CR6 cr6 = null;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            if (this.LJLLILLLL != null) {
                C75878TqE c75878TqE = new C75878TqE();
                C75678Tn0 c75678Tn0 = this.LJLLILLLL;
                if (c75678Tn0 != null) {
                    j = c75678Tn0.LIZJ;
                    MHMessageInfo mHMessageInfo3 = c75678Tn0.LJII;
                    if (mHMessageInfo3 != null) {
                        cr6 = mHMessageInfo3.baseLiveMessage;
                    }
                }
                c75878TqE.LJJLIIIIJ(j, i, cr6);
                return;
            }
            C75878TqE c75878TqE2 = new C75878TqE();
            LinkerInviteContent linkerInviteContent = this.LJLLI;
            if (linkerInviteContent != null) {
                long j2 = linkerInviteContent.fromUserId;
                C75678Tn0 c75678Tn02 = this.LJLLILLLL;
                if (c75678Tn02 != null && (mHMessageInfo2 = c75678Tn02.LJII) != null) {
                    cr6 = mHMessageInfo2.baseLiveMessage;
                }
                c75878TqE2.LJJLIIIIJ(j2, i, cr6);
                return;
            }
            o.LJIJI("inviteContent");
            throw null;
        }
        if (this.LJLLILLLL != null) {
            C75878TqE c75878TqE3 = new C75878TqE();
            C75678Tn0 c75678Tn03 = this.LJLLILLLL;
            if (c75678Tn03 != null) {
                j = c75678Tn03.LIZJ;
                MHMessageInfo mHMessageInfo4 = c75678Tn03.LJII;
                if (mHMessageInfo4 != null) {
                    cr6 = mHMessageInfo4.baseLiveMessage;
                }
            }
            c75878TqE3.LJJLIIIJ(j, i, cr6);
            return;
        }
        C75878TqE c75878TqE4 = new C75878TqE();
        LinkerInviteContent linkerInviteContent2 = this.LJLLI;
        if (linkerInviteContent2 != null) {
            long j3 = linkerInviteContent2.fromUserId;
            C75678Tn0 c75678Tn04 = this.LJLLILLLL;
            if (c75678Tn04 != null && (mHMessageInfo = c75678Tn04.LJII) != null) {
                cr6 = mHMessageInfo.baseLiveMessage;
            }
            c75878TqE4.LJJLIIIJ(j3, i, cr6);
            return;
        }
        o.LJIJI("inviteContent");
        throw null;
    }

    public final void Kl(long j) {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-mRefuseButton>(...)");
        ((C2A7) value).setText(BML.LIZ(getString(R.string.khz), Integer.valueOf((int) j)));
        if (j == 0) {
            int i = this.LJLLL;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                Al(5);
                return;
            }
            Dl(5);
            if (!this.LJLZ) {
                return;
            }
            this.LJLLLLLL = "timeout";
            C75678Tn0 c75678Tn0 = this.LJLLILLLL;
            PunishEventInfo punishEventInfo = null;
            if (c75678Tn0 != null) {
                MHJoinBizContent mHJoinBizContent = c75678Tn0.LJI;
                if (mHJoinBizContent != null) {
                    punishEventInfo = mHJoinBizContent.punishInfo;
                }
                C75017TcL.LIZLLL("timeout", punishEventInfo);
                return;
            }
            LinkerInviteContent linkerInviteContent = this.LJLLI;
            if (linkerInviteContent != null) {
                C75017TcL.LIZLLL("timeout", linkerInviteContent.punishEventInfo);
            } else {
                o.LJIJI("inviteContent");
                throw null;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final void xl(long j) {
        if (!this.mStatusViewValid) {
            return;
        }
        C29306Beo.LJJJ(new AqS40S0100100_13(this, j, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v22, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v39, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        CohostTopic cohostTopic;
        User owner;
        InviterRivalExtra inviterRivalExtra;
        List<InviterRivalExtra> list;
        Text text;
        List list2;
        List<InviterRivalExtra> list3;
        Long l;
        boolean z;
        CohostTopic cohostTopic2;
        List<CohostABTestSetting> list4;
        MHJoinBizContent mHJoinBizContent;
        List<CohostABTestSetting> list5;
        CR6 cr6;
        MHMessageInfo mHMessageInfo;
        CR6 cr62;
        MHMessageInfo mHMessageInfo2;
        MHJoinBizContent mHJoinBizContent2;
        List<CohostABTestSetting> list6;
        CR6 cr63;
        MHMessageInfo mHMessageInfo3;
        CR6 cr64;
        MHMessageInfo mHMessageInfo4;
        MHJoinBizContent mHJoinBizContent3;
        List<CohostABTestSetting> list7;
        MHJoinBizContent mHJoinBizContent4;
        long j;
        boolean z2;
        int i;
        RivalExtraInfo.Tag tag;
        Integer num;
        CohostTopic cohostTopic3;
        MHJoinBizContent mHJoinBizContent5;
        MHJoinBizContent mHJoinBizContent6;
        JoinGroupMessageExtra joinGroupMessageExtra;
        MHJoinBizContent mHJoinBizContent7;
        MHJoinBizContent mHJoinBizContent8;
        MHJoinBizContent mHJoinBizContent9;
        RivalExtraInfo.Tag tag2;
        JoinGroupMessageExtra joinGroupMessageExtra2;
        List<JoinGroupMessageExtra.RivalExtra> list8;
        Text text2;
        boolean z3;
        boolean z4;
        PerceptionDialogInfo perceptionDialogInfo;
        Text text3;
        PunishEventInfo punishEventInfo;
        MHJoinBizContent mHJoinBizContent10;
        PerceptionDialogInfo perceptionDialogInfo2;
        JoinGroupMessageExtra.RivalExtra rivalExtra;
        RivalExtraInfo.Tag tag3;
        JoinGroupMessageExtra joinGroupMessageExtra3;
        List<JoinGroupMessageExtra.RivalExtra> list9;
        JoinGroupMessageExtra joinGroupMessageExtra4;
        CohostTopic cohostTopic4;
        CohostTopic cohostTopic5;
        boolean z5;
        Long l2;
        CohostTopic cohostTopic6;
        boolean z6;
        Long l3;
        Long l4;
        CohostTopic cohostTopic7;
        o.LJIIIZ(inflater, "inflater");
        int i2 = 0;
        int i3 = 0;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d4v, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …          false\n        )");
        this.LJLJJL = LLLLIILL;
        C29S c29s = null;
        if (!C75633TmH.LIZ.isEmpty()) {
            C75678Tn0 c75678Tn0 = this.LJLLILLLL;
            if (c75678Tn0 != null) {
                MHJoinBizContent mHJoinBizContent11 = c75678Tn0.LJI;
                if (mHJoinBizContent11 != null) {
                    cohostTopic6 = mHJoinBizContent11.LIZ;
                } else {
                    cohostTopic6 = null;
                }
                if (cohostTopic6 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (mHJoinBizContent11 != null && (cohostTopic7 = mHJoinBizContent11.LIZ) != null) {
                        l3 = Long.valueOf(cohostTopic7.id);
                    } else {
                        l3 = null;
                    }
                    CohostTopic cohostTopic8 = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
                    if (cohostTopic8 != null) {
                        l4 = Long.valueOf(cohostTopic8.id);
                    } else {
                        l4 = null;
                    }
                    if (!o.LJ(l3, l4)) {
                        View view = this.LJLJJL;
                        if (view != null) {
                            view.findViewById(R.id.fn7).setVisibility(0);
                        } else {
                            o.LJIJI("mRootView");
                            throw null;
                        }
                    }
                }
            } else {
                LinkerInviteContent linkerInviteContent = this.LJLLI;
                if (linkerInviteContent != null) {
                    LinkerInviteMessageExtra linkerInviteMessageExtra = linkerInviteContent.linkerInviteMsgExtra;
                    if (linkerInviteMessageExtra != null) {
                        cohostTopic5 = linkerInviteMessageExtra.topicInfo;
                    } else {
                        cohostTopic5 = null;
                    }
                    if (cohostTopic5 != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        CohostTopic cohostTopic9 = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
                        if (cohostTopic9 != null) {
                            l2 = Long.valueOf(cohostTopic9.id);
                        } else {
                            l2 = null;
                        }
                        if (!o.LJ(null, l2)) {
                            View view2 = this.LJLJJL;
                            if (view2 != null) {
                                view2.findViewById(R.id.fn7).setVisibility(0);
                            } else {
                                o.LJIJI("mRootView");
                                throw null;
                            }
                        }
                    }
                } else {
                    o.LJIJI("inviteContent");
                    throw null;
                }
            }
        }
        View view3 = this.LJLJJL;
        if (view3 != null) {
            View findViewById = view3.findViewById(R.id.fnb);
            View view4 = this.LJLJJL;
            if (view4 != null) {
                View findViewById2 = view4.findViewById(R.id.fna);
                C75678Tn0 c75678Tn02 = this.LJLLILLLL;
                if (c75678Tn02 != null) {
                    MHJoinBizContent mHJoinBizContent12 = c75678Tn02.LJI;
                    if (mHJoinBizContent12 != null && (cohostTopic4 = mHJoinBizContent12.LIZ) != null) {
                        if (cohostTopic4.liked) {
                            findViewById.setVisibility(0);
                            findViewById2.setVisibility(8);
                            View view5 = this.LJLJJL;
                            if (view5 != null) {
                                ((TextView) view5.findViewById(R.id.mom)).setText(C86881Y7x.LIZIZ().LIZ(cohostTopic4.titleKey));
                                View view6 = this.LJLJJL;
                                if (view6 != null) {
                                    ((TextView) view6.findViewById(R.id.mos)).setText(b.LJIIL(cohostTopic4.totalHeat));
                                } else {
                                    o.LJIJI("mRootView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mRootView");
                                throw null;
                            }
                        } else {
                            findViewById.setVisibility(8);
                            findViewById2.setVisibility(0);
                            View view7 = this.LJLJJL;
                            if (view7 != null) {
                                ((TextView) view7.findViewById(R.id.moq)).setText(C86881Y7x.LIZIZ().LIZ(cohostTopic4.titleKey));
                                View view8 = this.LJLJJL;
                                if (view8 != null) {
                                    ((TextView) view8.findViewById(R.id.mor)).setText(b.LJIIL(cohostTopic4.totalHeat));
                                } else {
                                    o.LJIJI("mRootView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mRootView");
                                throw null;
                            }
                        }
                    }
                } else {
                    LinkerInviteContent linkerInviteContent2 = this.LJLLI;
                    if (linkerInviteContent2 != null) {
                        LinkerInviteMessageExtra linkerInviteMessageExtra2 = linkerInviteContent2.linkerInviteMsgExtra;
                        if (linkerInviteMessageExtra2 != null && (cohostTopic = linkerInviteMessageExtra2.topicInfo) != null) {
                            if (cohostTopic.liked) {
                                findViewById.setVisibility(0);
                                findViewById2.setVisibility(8);
                                View view9 = this.LJLJJL;
                                if (view9 != null) {
                                    ((TextView) view9.findViewById(R.id.mom)).setText(C86881Y7x.LIZIZ().LIZ(cohostTopic.titleKey));
                                    View view10 = this.LJLJJL;
                                    if (view10 != null) {
                                        ((TextView) view10.findViewById(R.id.mos)).setText(b.LJIIL(cohostTopic.totalHeat));
                                    } else {
                                        o.LJIJI("mRootView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mRootView");
                                    throw null;
                                }
                            } else {
                                findViewById.setVisibility(8);
                                findViewById2.setVisibility(0);
                                View view11 = this.LJLJJL;
                                if (view11 != null) {
                                    ((TextView) view11.findViewById(R.id.moq)).setText(C86881Y7x.LIZIZ().LIZ(cohostTopic.titleKey));
                                    View view12 = this.LJLJJL;
                                    if (view12 != null) {
                                        ((TextView) view12.findViewById(R.id.mor)).setText(b.LJIIL(cohostTopic.totalHeat));
                                    } else {
                                        o.LJIJI("mRootView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mRootView");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        o.LJIJI("inviteContent");
                        throw null;
                    }
                }
                RunnableC31065CHd Gl = Gl();
                getContext();
                Gl.setLayoutManager(new LinearLayoutManager());
                if (Gl().getItemAnimator() instanceof AbstractC28931Bp) {
                    AbstractC030109x itemAnimator = Gl().getItemAnimator();
                    o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                    ((AbstractC28931Bp) itemAnimator).LJI = false;
                }
                Gl().setAdapter(this.LJLL);
                AbstractC030109x itemAnimator2 = Gl().getItemAnimator();
                if (itemAnimator2 instanceof AbstractC28931Bp) {
                    ((AbstractC28931Bp) itemAnimator2).LJI = false;
                }
                Gl().LJII(new C107084Ie(C15380j0.LIZ(8.0f), i2), -1);
                if (this.LJLLL == 2) {
                    Hl().setText(C15380j0.LJIILJJIL(R.string.kje));
                    AbstractC75942TrG abstractC75942TrG = (AbstractC75942TrG) this.LJLILLLLZI;
                    if (abstractC75942TrG != null) {
                        abstractC75942TrG.LJIIIIZZ(wl());
                    }
                } else {
                    Room LJIILL = C1DH.LJIILL(this.LJLLJ);
                    if (LJIILL != null && (owner = LJIILL.getOwner()) != null) {
                        long id = owner.getId();
                        AbstractC75942TrG abstractC75942TrG2 = (AbstractC75942TrG) this.LJLILLLLZI;
                        if (abstractC75942TrG2 != null) {
                            abstractC75942TrG2.LJIIIIZZ(id);
                        }
                    }
                }
                this.LJLL.LJLZ(C76006TsI.class, new C76097Ttl());
                ArrayList arrayList = new ArrayList();
                C75678Tn0 c75678Tn03 = this.LJLLILLLL;
                if (c75678Tn03 != null) {
                    MHJoinBizContent mHJoinBizContent13 = c75678Tn03.LJI;
                    if (mHJoinBizContent13 != null && (joinGroupMessageExtra4 = mHJoinBizContent13.bizExtra) != null) {
                        rivalExtra = joinGroupMessageExtra4.extra;
                    } else {
                        rivalExtra = null;
                    }
                    InviterRivalExtra LIZJ = C76005TsH.LIZJ(rivalExtra);
                    if (mHJoinBizContent13 != null) {
                        tag3 = mHJoinBizContent13.fromTag;
                    } else {
                        tag3 = null;
                    }
                    arrayList.add(new C76006TsI(LIZJ, tag3, new User(), true));
                    if (mHJoinBizContent13 != null && (joinGroupMessageExtra3 = mHJoinBizContent13.bizExtra) != null && (list9 = joinGroupMessageExtra3.otherUsers) != null) {
                        Iterator<JoinGroupMessageExtra.RivalExtra> it = list9.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new C76006TsI(C76005TsH.LIZJ(it.next()), new RivalExtraInfo.Tag(), new User(), false));
                        }
                    }
                } else {
                    LinkerInviteContent linkerInviteContent3 = this.LJLLI;
                    if (linkerInviteContent3 != null) {
                        LinkerInviteMessageExtra linkerInviteMessageExtra3 = linkerInviteContent3.linkerInviteMsgExtra;
                        if (linkerInviteMessageExtra3 != null) {
                            inviterRivalExtra = linkerInviteMessageExtra3.inviterRivalExtra;
                        } else {
                            inviterRivalExtra = null;
                        }
                        if (inviterRivalExtra == null) {
                            inviterRivalExtra = new InviterRivalExtra();
                        }
                        LinkerInviteContent linkerInviteContent4 = this.LJLLI;
                        if (linkerInviteContent4 != null) {
                            arrayList.add(new C76006TsI(inviterRivalExtra, linkerInviteContent4.tag, linkerInviteContent4.user, true));
                            if (this.LJLLL == 1) {
                                LinkerInviteContent linkerInviteContent5 = this.LJLLI;
                                if (linkerInviteContent5 != null) {
                                    LinkerInviteMessageExtra linkerInviteMessageExtra4 = linkerInviteContent5.linkerInviteMsgExtra;
                                    if (linkerInviteMessageExtra4 != null && (list = linkerInviteMessageExtra4.otherRivalExtra) != null) {
                                        for (InviterRivalExtra it2 : list) {
                                            o.LJIIIIZZ(it2, "it");
                                            arrayList.add(new C76006TsI(it2, new RivalExtraInfo.Tag(), new User(), false));
                                        }
                                    }
                                } else {
                                    o.LJIJI("inviteContent");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("inviteContent");
                            throw null;
                        }
                    } else {
                        o.LJIJI("inviteContent");
                        throw null;
                    }
                }
                C31413CUn c31413CUn = this.LJLL;
                c31413CUn.LJLIL = arrayList;
                c31413CUn.notifyDataSetChanged();
                View view13 = this.LJLJJL;
                if (view13 != null) {
                    View findViewById3 = view13.findViewById(R.id.lql);
                    View view14 = this.LJLJJL;
                    if (view14 != null) {
                        TextView textView = (TextView) view14.findViewById(R.id.lqm);
                        View view15 = this.LJLJJL;
                        if (view15 != null) {
                            LiveIconView liveIconView = (LiveIconView) view15.findViewById(R.id.lqk);
                            C75678Tn0 c75678Tn04 = this.LJLLILLLL;
                            if (c75678Tn04 != null) {
                                MHJoinBizContent mHJoinBizContent14 = c75678Tn04.LJI;
                                if (mHJoinBizContent14 != null && (perceptionDialogInfo2 = mHJoinBizContent14.dialog) != null) {
                                    text2 = perceptionDialogInfo2.subTitle;
                                } else {
                                    text2 = null;
                                }
                                if (text2 != null) {
                                    if (mHJoinBizContent14 != null && (perceptionDialogInfo = mHJoinBizContent14.dialog) != null && (text3 = perceptionDialogInfo.subTitle) != null) {
                                        Spannable LJFF = CXJ.LJFF(text3, text3.defaultPattern);
                                        C29306Beo.LJJLJLI(findViewById3);
                                        textView.setText(LJFF);
                                        this.LJLZ = true;
                                        C75678Tn0 c75678Tn05 = this.LJLLILLLL;
                                        if (c75678Tn05 != null && (mHJoinBizContent10 = c75678Tn05.LJI) != null) {
                                            punishEventInfo = mHJoinBizContent10.punishInfo;
                                        } else {
                                            punishEventInfo = null;
                                        }
                                        C75017TcL.LIZLLL(this.LJLLLLLL, punishEventInfo);
                                    }
                                } else {
                                    if (c75678Tn04.LJIIIZ) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        AbstractC75942TrG abstractC75942TrG3 = (AbstractC75942TrG) this.LJLILLLLZI;
                                        if (abstractC75942TrG3 != null && abstractC75942TrG3.LIZJ(this.LJLL.getItemCount())) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            C29306Beo.LJJLJLI(findViewById3);
                                            textView.setText(C15380j0.LJII(R.plurals.mc, this.LJLL.getItemCount()));
                                        }
                                    }
                                    liveIconView.setIconAttr(R.attr.atw);
                                }
                            } else {
                                LinkerInviteContent linkerInviteContent6 = this.LJLLI;
                                if (linkerInviteContent6 != null) {
                                    PerceptionDialogInfo perceptionDialogInfo3 = linkerInviteContent6.dialogInfo;
                                    if (perceptionDialogInfo3 != null && (text = perceptionDialogInfo3.subTitle) != null) {
                                        Spannable LJFF2 = CXJ.LJFF(text, text.defaultPattern);
                                        C29306Beo.LJJLJLI(findViewById3);
                                        textView.setText(LJFF2);
                                        this.LJLZ = true;
                                        LinkerInviteContent linkerInviteContent7 = this.LJLLI;
                                        if (linkerInviteContent7 != null) {
                                            C75017TcL.LIZLLL(this.LJLLLLLL, linkerInviteContent7.punishEventInfo);
                                        } else {
                                            o.LJIJI("inviteContent");
                                            throw null;
                                        }
                                    }
                                } else {
                                    o.LJIJI("inviteContent");
                                    throw null;
                                }
                            }
                            Object value = this.LJLJLJ.getValue();
                            o.LJIIIIZZ(value, "<get-mRefuseButton>(...)");
                            C16880lQ.LJJIII((C2A7) value, new C75944TrI(this));
                            Object value2 = this.LJLJLLL.getValue();
                            o.LJIIIIZZ(value2, "<get-mAcceptButton>(...)");
                            C16880lQ.LJJIII((C2A7) value2, new C75943TrH(this));
                            Hl().setOnCheckedChangeListener(new IDCListenerS209S0100000_13(this, 3));
                            C75678Tn0 c75678Tn06 = this.LJLLILLLL;
                            if (c75678Tn06 != null) {
                                MHJoinBizContent mHJoinBizContent15 = c75678Tn06.LJI;
                                if (mHJoinBizContent15 != null && (joinGroupMessageExtra2 = mHJoinBizContent15.bizExtra) != null && (list8 = joinGroupMessageExtra2.otherUsers) != null) {
                                    list2 = new ArrayList(C32I.LJJL(list8, 10));
                                    Iterator<JoinGroupMessageExtra.RivalExtra> it3 = list8.iterator();
                                    while (it3.hasNext()) {
                                        list2.add(Long.valueOf(it3.next().userId));
                                    }
                                } else {
                                    list2 = C61878OQg.INSTANCE;
                                }
                            } else {
                                LinkerInviteContent linkerInviteContent8 = this.LJLLI;
                                if (linkerInviteContent8 != null) {
                                    LinkerInviteMessageExtra linkerInviteMessageExtra5 = linkerInviteContent8.linkerInviteMsgExtra;
                                    if (linkerInviteMessageExtra5 != null && (list3 = linkerInviteMessageExtra5.otherRivalExtra) != null) {
                                        list2 = new ArrayList(C32I.LJJL(list3, 10));
                                        Iterator<InviterRivalExtra> it4 = list3.iterator();
                                        while (it4.hasNext()) {
                                            list2.add(Long.valueOf(it4.next().userId));
                                        }
                                    } else {
                                        list2 = C61878OQg.INSTANCE;
                                    }
                                } else {
                                    o.LJIJI("inviteContent");
                                    throw null;
                                }
                            }
                            if (this.LJLLILLLL != null) {
                                LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                                C75678Tn0 c75678Tn07 = this.LJLLILLLL;
                                if (c75678Tn07 != null && (mHJoinBizContent9 = c75678Tn07.LJI) != null && (tag2 = mHJoinBizContent9.fromTag) != null) {
                                    i3 = Integer.valueOf(tag2.tagType);
                                }
                                LIZIZ.LJJLIIIJJI = i3;
                                LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
                                C75678Tn0 c75678Tn08 = this.LJLLILLLL;
                                long j2 = 0;
                                if (c75678Tn08 != null) {
                                    j = c75678Tn08.LIZJ;
                                } else {
                                    j = 0;
                                }
                                LIZIZ2.LJJLIIIJJIZ = String.valueOf(j);
                                if (this.LJLLL == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C75678Tn0 c75678Tn09 = this.LJLLILLLL;
                                if (c75678Tn09 != null) {
                                    j2 = c75678Tn09.LIZJ;
                                }
                                if (c75678Tn09 != null && (mHJoinBizContent8 = c75678Tn09.LJI) != null) {
                                    i = mHJoinBizContent8.fromRoomAgeRestricted;
                                } else {
                                    i = 0;
                                }
                                if (c75678Tn09 != null && (mHJoinBizContent7 = c75678Tn09.LJI) != null) {
                                    tag = mHJoinBizContent7.fromTag;
                                } else {
                                    tag = null;
                                }
                                if (c75678Tn09 != null && (mHJoinBizContent6 = c75678Tn09.LJI) != null && (joinGroupMessageExtra = mHJoinBizContent6.bizExtra) != null) {
                                    num = Integer.valueOf((int) joinGroupMessageExtra.sourceType);
                                } else {
                                    num = null;
                                }
                                C75678Tn0 c75678Tn010 = this.LJLLILLLL;
                                if (c75678Tn010 != null && (mHJoinBizContent5 = c75678Tn010.LJI) != null) {
                                    cohostTopic3 = mHJoinBizContent5.LIZ;
                                } else {
                                    cohostTopic3 = null;
                                }
                                C75642TmQ.LJJJJZI(z2, j2, list2, i, tag, num, cohostTopic3);
                            } else {
                                LinkCrossRoomDataHolder LIZIZ3 = B5G.LIZIZ();
                                LinkerInviteContent linkerInviteContent9 = this.LJLLI;
                                if (linkerInviteContent9 != null) {
                                    RivalExtraInfo.Tag tag4 = linkerInviteContent9.tag;
                                    if (tag4 != null) {
                                        i3 = Integer.valueOf(tag4.tagType);
                                    }
                                    LIZIZ3.LJJLIIIJJI = i3;
                                    LinkCrossRoomDataHolder LIZIZ4 = B5G.LIZIZ();
                                    LinkerInviteContent linkerInviteContent10 = this.LJLLI;
                                    if (linkerInviteContent10 != null) {
                                        User user = linkerInviteContent10.user;
                                        if (user != null) {
                                            l = Long.valueOf(user.getId());
                                        } else {
                                            l = null;
                                        }
                                        LIZIZ4.LJJLIIIJJIZ = String.valueOf(l);
                                        if (this.LJLLL == 2) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        LinkerInviteContent linkerInviteContent11 = this.LJLLI;
                                        if (linkerInviteContent11 != null) {
                                            long j3 = linkerInviteContent11.fromUserId;
                                            int i4 = linkerInviteContent11.fromRoomAgeRestricted;
                                            RivalExtraInfo.Tag tag5 = linkerInviteContent11.tag;
                                            Integer valueOf = Integer.valueOf(linkerInviteContent11.linkerInviteMsgExtra.inviteType);
                                            LinkerInviteContent linkerInviteContent12 = this.LJLLI;
                                            if (linkerInviteContent12 != null) {
                                                LinkerInviteMessageExtra linkerInviteMessageExtra6 = linkerInviteContent12.linkerInviteMsgExtra;
                                                if (linkerInviteMessageExtra6 != null) {
                                                    cohostTopic2 = linkerInviteMessageExtra6.topicInfo;
                                                } else {
                                                    cohostTopic2 = null;
                                                }
                                                C75642TmQ.LJJJJZI(z, j3, list2, i4, tag5, valueOf, cohostTopic2);
                                            } else {
                                                o.LJIJI("inviteContent");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("inviteContent");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("inviteContent");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("inviteContent");
                                    throw null;
                                }
                            }
                            int i5 = this.LJLLL;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    long wl = wl();
                                    C75678Tn0 c75678Tn011 = this.LJLLILLLL;
                                    if (c75678Tn011 != null && (mHJoinBizContent4 = c75678Tn011.LJI) != null) {
                                        list7 = mHJoinBizContent4.abTestSetting;
                                    } else {
                                        list7 = null;
                                    }
                                    Kl(MultiHostTimeoutAbTestHelper.LIZ(wl, list7));
                                }
                            } else {
                                long wl2 = wl();
                                C75678Tn0 c75678Tn012 = this.LJLLILLLL;
                                if (c75678Tn012 != null && (mHJoinBizContent = c75678Tn012.LJI) != null) {
                                    list4 = mHJoinBizContent.abTestSetting;
                                } else {
                                    list4 = null;
                                }
                                Kl(MultiHostTimeoutAbTestHelper.LIZIZ(wl2, list4));
                            }
                            DataChannel dataChannel = this.LJLLJ;
                            if (dataChannel != null) {
                                dataChannel.pv0(CoHostBeInvitedShowEvent.class);
                            }
                            if (MtCoHostFullLinkMonitorSetting.INSTANCE.isEnable()) {
                                int i6 = this.LJLLL;
                                if (i6 != 1) {
                                    if (i6 == 2) {
                                        long wl3 = wl();
                                        C75678Tn0 c75678Tn013 = this.LJLLILLLL;
                                        if (c75678Tn013 != null && (mHJoinBizContent3 = c75678Tn013.LJI) != null) {
                                            list6 = mHJoinBizContent3.abTestSetting;
                                        } else {
                                            list6 = null;
                                        }
                                        long LIZ = MultiHostTimeoutAbTestHelper.LIZ(wl3, list6);
                                        if (this.LJLLILLLL != null) {
                                            C75878TqE c75878TqE = new C75878TqE();
                                            long wl4 = wl();
                                            C75678Tn0 c75678Tn014 = this.LJLLILLLL;
                                            if (c75678Tn014 != null && (mHMessageInfo4 = c75678Tn014.LJII) != null) {
                                                cr64 = mHMessageInfo4.baseLiveMessage;
                                            } else {
                                                cr64 = null;
                                            }
                                            c75878TqE.LJJIFFI(wl4, LIZ, cr64);
                                        } else {
                                            C75878TqE c75878TqE2 = new C75878TqE();
                                            long wl5 = wl();
                                            C75678Tn0 c75678Tn015 = this.LJLLILLLL;
                                            if (c75678Tn015 != null && (mHMessageInfo3 = c75678Tn015.LJII) != null) {
                                                cr63 = mHMessageInfo3.baseLiveMessage;
                                            } else {
                                                cr63 = null;
                                            }
                                            c75878TqE2.LJJIFFI(wl5, LIZ, cr63);
                                        }
                                    }
                                } else {
                                    long wl6 = wl();
                                    C75678Tn0 c75678Tn016 = this.LJLLILLLL;
                                    if (c75678Tn016 != null && (mHJoinBizContent2 = c75678Tn016.LJI) != null) {
                                        list5 = mHJoinBizContent2.abTestSetting;
                                    } else {
                                        list5 = null;
                                    }
                                    long LIZIZ5 = MultiHostTimeoutAbTestHelper.LIZIZ(wl6, list5);
                                    if (this.LJLLILLLL != null) {
                                        C75878TqE c75878TqE3 = new C75878TqE();
                                        long wl7 = wl();
                                        C75678Tn0 c75678Tn017 = this.LJLLILLLL;
                                        if (c75678Tn017 != null && (mHMessageInfo2 = c75678Tn017.LJII) != null) {
                                            cr62 = mHMessageInfo2.baseLiveMessage;
                                        } else {
                                            cr62 = null;
                                        }
                                        c75878TqE3.LJJJJLI(wl7, LIZIZ5, cr62);
                                    } else {
                                        C75878TqE c75878TqE4 = new C75878TqE();
                                        long wl8 = wl();
                                        C75678Tn0 c75678Tn018 = this.LJLLILLLL;
                                        if (c75678Tn018 != null && (mHMessageInfo = c75678Tn018.LJII) != null) {
                                            cr6 = mHMessageInfo.baseLiveMessage;
                                        } else {
                                            cr6 = null;
                                        }
                                        c75878TqE4.LJJJJLI(wl8, LIZIZ5, cr6);
                                    }
                                }
                            }
                            View view16 = this.LJLJJL;
                            if (view16 != null) {
                                try {
                                    ViewTreeLifecycleOwner.set(view16, getViewLifecycleOwner());
                                    ViewTreeViewModelStoreOwner.set(view16, this);
                                    C10A.LIZIZ(view16, this);
                                    ActivityC45651qj mo49getActivity = mo49getActivity();
                                    if (mo49getActivity instanceof C29S) {
                                        c29s = (C29S) mo49getActivity;
                                    }
                                    C90903hW.LIZ(c29s);
                                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                                } catch (Throwable th) {
                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                }
                                return view16;
                            }
                            o.LJIJI("mRootView");
                            throw null;
                        }
                        o.LJIJI("mRootView");
                        throw null;
                    }
                    o.LJIJI("mRootView");
                    throw null;
                }
                o.LJIJI("mRootView");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }
}
