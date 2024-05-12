package com.ss.android.ugc.aweme.upvote.detail.bubble;

import X.AV1;
import X.AbstractC73547Stj;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C183487Ia;
import X.C183567Ii;
import X.C183577Ij;
import X.C183607Im;
import X.C183617In;
import X.C183637Ip;
import X.C183667Is;
import X.C183737Iz;
import X.C183827Ji;
import X.C183937Jt;
import X.C183997Jz;
import X.C199797sl;
import X.C1DH;
import X.C2058786d;
import X.C212428Vi;
import X.C214348b8;
import X.C221108m2;
import X.C224748ru;
import X.C2301991r;
import X.C241249dQ;
import X.C26045AKb;
import X.C46403IJb;
import X.C46406IJe;
import X.C47704Ins;
import X.C51029K0z;
import X.C52280KfU;
import X.C53326KwM;
import X.C55096Ljo;
import X.C55749LuL;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74221TAz;
import X.C78996UzQ;
import X.C7FN;
import X.C7FO;
import X.C7H1;
import X.C7H2;
import X.C7HH;
import X.C7HL;
import X.C7HO;
import X.C7HP;
import X.C7HX;
import X.C7IK;
import X.C7IP;
import X.C7IV;
import X.C7IW;
import X.C7IZ;
import X.C7J2;
import X.C7J4;
import X.C7J9;
import X.C7JF;
import X.C7JH;
import X.C7JJ;
import X.C7JT;
import X.C7K1;
import X.C7KA;
import X.C7KB;
import X.C7MY;
import X.C8T7;
import X.C8YN;
import X.C9BE;
import X.EF7;
import X.EnumC183687Iu;
import X.FMX;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC181487Ai;
import X.InterfaceC53896LDg;
import X.InterfaceC74236TBo;
import X.LDY;
import X.M89;
import X.ORZ;
import X.RBX;
import X.TBT;
import X.X1D;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS4S1100000_3;
import Y.ARunnableS9S0110000_3;
import Y.IDaS214S0100000_3;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.adapter.AvoidUpvoteViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.service.HideVideoTagAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS1S2310000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.IDqS459S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class UpvoteVideoAssem extends BaseCellSlotComponent<UpvoteVideoAssem> implements InterfaceC181487Ai, InterfaceC53896LDg, ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJI;
    public final C62822Ol8 LLFII;
    public final C55749LuL LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public final InterfaceC115514g7 LLII;
    public final C5H3 LLIIII;
    public final InterfaceC115514g7 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public C224748ru LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public Long LLILIL;
    public Boolean LLILL;
    public Boolean LLILLIZIL;
    public Boolean LLILLJJLI;
    public Boolean LLILLL;
    public Aweme LLILZ;
    public final C62822Ol8 LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    static {
        TBT tbt = new TBT(UpvoteVideoAssem.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(UpvoteVideoAssem.class, "avoidUpvoteVM", "getAvoidUpvoteVM()Lcom/ss/android/ugc/aweme/feed/adapter/AvoidUpvoteViewModel;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LLIILZL() {
        this.LLIZ = false;
        e5();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.dra;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_social_repost";
    }

    public UpvoteVideoAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1160));
        this.LLFZ = new C55749LuL(C47704Ins.LJ(this, C183617In.class, null), checkSupervisorPrepared());
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C7FN.INSTANCE);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C7FO.INSTANCE);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StatePassingVM.class);
        this.LLII = C214348b8.LIZ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1163), null, C7J2.INSTANCE, null, null);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(RepostEventVM.class), C183737Iz.INSTANCE);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(AvoidUpvoteViewModel.class);
        this.LLIIIILZ = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 1153), null, C183667Is.INSTANCE, null, null);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1155));
        this.LLIIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1157));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1161));
        this.LLIIJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1159));
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1158));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1162));
        this.LLIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1154));
        this.LLIILII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1156));
        this.LLILZIL = C221108m2.LIZIZ(C7J9.LJLIL);
    }

    public final RepostEventVM A4() {
        return (RepostEventVM) this.LLIIII.getValue();
    }

    public final C183617In B4() {
        return (C183617In) this.LLFZ.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        if (this.LLILLIZIL == null) {
            return;
        }
        G4();
        ((C73318Sq2) this.LLILZIL.getValue()).LIZLLL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void a4() {
        C1DH.LJJIJIIJI(new ARunnableS9S0110000_3(this, false, 2));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void b4() {
        C1DH.LJJIJIIJI(new ARunnableS9S0110000_3(this, true, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0029, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ad, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0027, code lost:
    
        if (r6.LLIZ != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e5() {
        /*
            r6 = this;
            boolean r4 = r6.LLIZLLLIL
            X.7In r0 = r6.B4()
            r3 = 0
            if (r0 == 0) goto Lb3
            java.lang.String r5 = r0.LJLILLLLZI
        Lb:
            r2 = 0
            if (r5 == 0) goto L21
            int r1 = r5.hashCode()
            r0 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r1 == r0) goto L8c
            r0 = -667094460(0xffffffffd83cf244, float:-8.3099484E14)
            if (r1 == r0) goto L66
            r0 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r1 == r0) goto L40
        L21:
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L2a
            boolean r0 = r6.LLIZ
            if (r0 == 0) goto L2a
        L29:
            r2 = 1
        L2a:
            if (r4 == 0) goto L3d
            if (r2 != 0) goto L3d
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.LLILZ
            if (r1 == 0) goto L3d
            X.7In r0 = r6.B4()
            if (r0 == 0) goto L3a
            java.lang.String r3 = r0.LJLILLLLZI
        L3a:
            X.C111934aL.LIZ(r1, r3)
        L3d:
            r6.LLIZLLLIL = r2
            return
        L40:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L49
            goto L21
        L49:
            X.Ol8 r0 = r6.LLIIJI
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
            if (r1 == 0) goto L64
            java.lang.String r0 = "For You"
            boolean r1 = r1.zW(r0)
        L59:
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L2a
            boolean r0 = r6.LLIZ
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            goto L29
        L64:
            r1 = 0
            goto L59
        L66:
            java.lang.String r0 = "homepage_friends"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L6f
            goto L21
        L6f:
            X.Ol8 r0 = r6.LLIIJI
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
            if (r1 == 0) goto L8a
            java.lang.String r0 = "FRIENDS_FEED"
            boolean r1 = r1.zW(r0)
        L7f:
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L2a
            boolean r0 = r6.LLIZ
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            goto L29
        L8a:
            r1 = 0
            goto L7f
        L8c:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L95
            goto L21
        L95:
            X.Ol8 r0 = r6.LLIIJI
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
            if (r1 == 0) goto Lb1
            java.lang.String r0 = "Following"
            boolean r1 = r1.zW(r0)
        La5:
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L2a
            boolean r0 = r6.LLIZ
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            goto L29
        Lb1:
            r1 = 0
            goto La5
        Lb3:
            r5 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem.e5():void");
    }

    public final C7IZ u4() {
        if (this.LJLLLL) {
            return (C7IZ) this.LLIIL.getValue();
        }
        return null;
    }

    public final UpvoteListViewModel z4() {
        return (UpvoteListViewModel) this.LLIIJLIL.getValue();
    }

    public final void C4() {
        if (C183997Jz.LIZ() && o.LJ(this.LLILLL, Boolean.TRUE)) {
            ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().setReplaceRecTagByRepost(true);
            q4(0);
            if (C2301991r.LIZ()) {
                InteractVideoTagAbility interactVideoTagAbility = (InteractVideoTagAbility) this.LLIIIZ.getValue();
                if (interactVideoTagAbility != null) {
                    interactVideoTagAbility.Gt0();
                    return;
                }
                return;
            }
            HideVideoTagAbility hideVideoTagAbility = (HideVideoTagAbility) this.LLIIIL.getValue();
            if (hideVideoTagAbility == null) {
                return;
            }
            hideVideoTagAbility.hide();
        }
    }

    public final boolean E4() {
        String str;
        Aweme selectedAweme;
        String str2 = null;
        IPanelUIAbility iPanelUIAbility = (IPanelUIAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IPanelUIAbility.class, null);
        if (iPanelUIAbility != null && (selectedAweme = iPanelUIAbility.getSelectedAweme()) != null) {
            str = selectedAweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        return o.LJ(str, str2);
    }

    public final void F4() {
        Long l;
        int i;
        List<UpvoteStruct> LIZIZ = z4().LIZIZ();
        if (!this.LJLLL || Y3().getVisibility() != 0 || LIZIZ == null || LIZIZ.isEmpty()) {
            return;
        }
        UpvoteListViewModel z4 = z4();
        if ((!C7IP.LIZ(z4.LIZIZ()) || z4.LIZIZ().size() != 1 || !A4().LJLJI.LIZIZ) && (l = this.LLILIL) != null) {
            long longValue = l.longValue();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time_interval", System.currentTimeMillis() - longValue);
                Boolean bool = this.LLILL;
                if (bool != null) {
                    if (o.LJ(bool, Boolean.TRUE)) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    jSONObject.put("has_cache", i);
                }
                FMX.LJIILJJIL("repost_bubble_show_cost", jSONObject);
            } catch (Throwable unused) {
            }
            this.LLILIL = null;
            this.LLILL = null;
        }
        if (getContainerView().getVisibility() == 0) {
            this.LLILLJJLI = Boolean.TRUE;
        }
        if (!A4().LJLJI.LJII) {
            String str = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType;
            o.LJIIIIZZ(str, "item.eventType");
            C7HL.LIZIZ("show", z4().LJLJJLL, str);
            A4().LJLJI.LJII = true;
        }
    }

    public final void G4() {
        String aid;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null && (aid = aweme.getAid()) != null) {
            int i = 1;
            if (o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mFrom, "REPOSTED_LIST_ENTRANCE")) {
                if (o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "personal_homepage") || o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "others_homepage")) {
                    if (getContainerView().getVisibility() == 8 || !o.LJ(this.LLILLJJLI, Boolean.TRUE)) {
                        JSONObject jSONObject = new JSONObject();
                        if (!o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "personal_homepage")) {
                            i = -1;
                        }
                        jSONObject.put("is_self", i);
                        jSONObject.put("group_id", aid);
                        FMX.LJIILJJIL("video_without_repost", jSONObject);
                    }
                }
            }
        }
    }

    public final boolean I4() {
        if (!C183997Jz.LIZ() || ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getReplaceRecTagByRepost()) {
            return false;
        }
        C8YN.LJIJI((AssemViewModel) this.LLIIIILZ.LIZ(this, LLJI[1]), new AqS169S0100000_3(this, 519));
        if (!o.LJ(this.LLILLL, Boolean.FALSE)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC181487Ai
    public final boolean LJLLLL() {
        return A4().LJLJI.LIZIZ;
    }

    public final void T4() {
        Aweme aweme;
        User author;
        if (o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "homepage_friends") && ((Boolean) C7JT.LIZ.getValue()).booleanValue() && !C7IK.LIZJ().getBoolean(C7IK.LIZ("has_upvote_tooltip_shown_"), false) && !z4().LIZLLL()) {
            UpvoteListViewModel z4 = z4();
            if ((!C7IP.LIZ(z4.LIZIZ()) || z4.LIZIZ().size() != 1) && (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) != null && (author = aweme.getAuthor()) != null && author.getMatchedFriendStruct() == null) {
                if (author.getFollowStatus() < 0 || author.getFollowStatus() == 0) {
                    getContainerView().postDelayed(new ARunnableS39S0100000_3(this, 107), 200L);
                }
            }
        }
    }

    public final void a5() {
        A4().LJLJI.getClass();
        if (C7IK.LIZIZ() >= ((Number) C46406IJe.LIZLLL.getValue()).intValue()) {
            return;
        }
        A4().LJLJI.getClass();
        if (C7IK.LIZLLL() >= C46403IJb.LIZIZ) {
            return;
        }
        c5("like", null, false);
    }

    public final void b5() {
        A4().LJLJI.getClass();
        if (C7IK.LIZLLL() >= C46403IJb.LIZIZ) {
            return;
        }
        A4().LJLJI.getClass();
        if (C7IK.LJ() >= C46403IJb.LIZJ) {
            return;
        }
        c5("loop", null, false);
    }

    @Override // X.InterfaceC181487Ai
    public final VideoItemParams f2() {
        return (VideoItemParams) C51029K0z.LJIILLIIL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        this.LLIIZ = false;
        this.LLIL = false;
        this.LLILII = false;
        this.LLJ = false;
    }

    @Override // X.InterfaceC181487Ai
    public final void z1() {
        String aid;
        SpannableString spannableString;
        Editable text;
        C7IZ u4 = u4();
        if (u4 != null) {
            u4.LJIIJJI();
        }
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null && (aid = aweme.getAid()) != null) {
            RepostEventVM A4 = A4();
            C224748ru c224748ru = this.LLIILZL;
            if (c224748ru != null && (text = c224748ru.getText()) != null) {
                spannableString = SpannableString.valueOf(text);
                o.LJIIIIZZ(spannableString, "SpannableString.valueOf(this)");
            } else {
                spannableString = null;
            }
            A4.getClass();
            A4.setStateImmediate(new AqS57S1100000_3(spannableString, aid, 40));
        }
    }

    public final boolean D4(String str) {
        if (!C7HX.LIZ() && !o.LJ(str, "homepage_hot")) {
            return false;
        }
        return true;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        User user;
        boolean z;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLILZ = item.getAweme();
        Aweme aweme = item.getAweme();
        String str = null;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        if (AV1.LJIJ(user)) {
            q4(8);
            return;
        }
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
        C183617In B4 = B4();
        if (B4 != null) {
            str = B4.LJLIL;
        }
        boolean z2 = false;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        InteractPermission interactPermission = item.getAweme().getInteractPermission();
        if (interactPermission != null && interactPermission.getUpvote() == 0) {
            z2 = true;
        }
        if (z) {
            J4(item, z2);
        } else {
            J4(item, true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJIII(int i) {
        this.LLILZLL = false;
        e5();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        this.LLILZLL = true;
        e5();
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        C1DH.LJJIJIIJI(new ARunnableS9S0110000_3(this, false, 2));
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        C1DH.LJJIJIIJI(new ARunnableS9S0110000_3(this, true, 2));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        o.LJIIIZ(view, "view");
        C7IZ u4 = u4();
        if (u4 != null) {
            AqS185S0100000_3 aqS185S0100000_3 = new AqS185S0100000_3(this, 106);
            C183487Ia LJ = u4.LJ();
            LJ.getClass();
            LJ.LJ = aqS185S0100000_3;
        }
    }

    public final void O4(boolean z) {
        UpvoteList value;
        C224748ru c224748ru;
        Editable text;
        C224748ru c224748ru2;
        if (!this.LLIIZ) {
            return;
        }
        if (z) {
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid();
            o.LJIIIIZZ(aid, "item.aweme.aid");
            this.LLILL = Boolean.valueOf(C7H2.LIZLLL(aid));
            C7IZ u4 = u4();
            if (u4 != null) {
                if (u4.LJ().LIZJ == Integer.MAX_VALUE) {
                    u4.LIZJ();
                    u4.LJIIJJI();
                } else {
                    C7IZ.LJIIIIZZ(u4, false, 3);
                }
            }
            if (this.LLILII && (c224748ru = this.LLIILZL) != null && (text = c224748ru.getText()) != null && text.length() != 0 && (c224748ru2 = this.LLIILZL) != null) {
                c224748ru2.setText("");
            }
            if (getContainerView().getVisibility() == 0) {
                T4();
            }
            if (!I4()) {
                F4();
                return;
            }
            return;
        }
        C7IZ u42 = u4();
        if (u42 != null) {
            u42.LIZJ();
            if (u42.LJ().LIZJ != Integer.MAX_VALUE && (value = u42.LIZIZ.LIZJ().getValue()) != null) {
                C7IW c7iw = C7IW.LIZ;
                C183937Jt c183937Jt = u42.LJ().LIZ;
                List<UpvoteStruct> upvotes = value.getUpvotes();
                long total = value.getTotal();
                InterfaceC181487Ai interfaceC181487Ai = u42.LIZJ;
                c7iw.getClass();
                C7IW.LIZLLL(c183937Jt, upvotes, total, interfaceC181487Ai);
            }
        }
        String str = z4().LJLJJL;
        if (str != null) {
            C7H1.LJIIJJI(str);
        }
        if (z4().LIZLLL()) {
            q4(8);
        }
        this.LLILIL = null;
        this.LLILL = null;
        G4();
        this.LLILLIZIL = null;
        this.LLILLJJLI = null;
        String LIZJ = C74221TAz.LIZJ((VideoItemParams) C51029K0z.LJIILLIIL(this), "item.aweme.aid");
        if (LIZJ.length() == 0) {
            return;
        }
        if (o.LJ(C183607Im.LIZ.getFirst(), LIZJ)) {
            C183607Im.LIZ.copy("", -1L);
        }
        if (!o.LJ(C183607Im.LIZIZ.getFirst(), LIZJ)) {
            return;
        }
        C183607Im.LIZIZ.copy("", -1L);
    }

    public final void P4(String str) {
        if (o.LJ(str, "like")) {
            a5();
        } else {
            if (!o.LJ(str, "loop")) {
                return;
            }
            b5();
        }
    }

    public final void R4(String str) {
        A4().LJLJI.LIZIZ = true;
        if (A4().LJLJI.LJIIJ) {
            A4().LJLJI.LJIIJ = false;
            return;
        }
        if (str == null || str.length() == 0) {
            C7IZ u4 = u4();
            if (u4 == null) {
                return;
            }
            C7IZ.LJIIIIZZ(u4, true, 2);
            return;
        }
        C7IZ u42 = u4();
        if (u42 == null) {
            return;
        }
        u42.LIZJ();
        UpvoteListViewModel upvoteListViewModel = u42.LIZIZ;
        u42.LJIIJ = upvoteListViewModel.LJLJJL;
        if (upvoteListViewModel.LIZLLL()) {
            u42.LJ().LIZ.setAlpha(0.0f);
            return;
        }
        C7IZ.LIZ(u42.LJ().LIZ);
        C7IW c7iw = C7IW.LIZ;
        C183937Jt c183937Jt = u42.LJ().LIZ;
        UpvoteStruct upvoteStruct = (UpvoteStruct) ListProtector.get(u42.LIZIZ.LJLJJI, 0);
        u42.LIZIZ.LJLJJI.size();
        InterfaceC181487Ai interfaceC181487Ai = u42.LIZJ;
        c7iw.getClass();
        C7IW.LIZJ(c183937Jt, upvoteStruct, interfaceC181487Ai);
        u42.LJIIIIZZ = 1;
        u42.LJ().LIZ.setAlpha(1.0f);
        u42.LJ().LIZIZ.setAlpha(0.0f);
        u42.LJ().LIZJ = 0;
        u42.LIZIZ();
        u42.LJI();
        u42.LIZLLL().start();
        u42.LJIIJ();
    }

    @Override // X.InterfaceC181487Ai
    public final void T(String str) {
        C7IZ u4 = u4();
        if (u4 != null && u4.LJ().LIZJ == 0) {
            A4().LJLJI.LJIIJ = true;
        }
        C7IZ u42 = u4();
        if (u42 != null) {
            if (u42.LJ().LIZJ != 0) {
                C7IZ.LJIIIIZZ(u42, false, 3);
                return;
            }
            UpvoteStruct upvoteStruct = (UpvoteStruct) ORZ.LJLLLLLL(0, u42.LIZIZ.LJLJJI);
            if (upvoteStruct == null || !AV1.LJIJ(upvoteStruct.getUser())) {
                return;
            }
            C7IZ.LIZ(u42.LJ().LIZ);
            upvoteStruct.setText(str);
            C7IW c7iw = C7IW.LIZ;
            C183937Jt c183937Jt = u42.LJ().LIZ;
            u42.LIZIZ.LJLJJI.size();
            InterfaceC181487Ai interfaceC181487Ai = u42.LIZJ;
            c7iw.getClass();
            C7IW.LIZJ(c183937Jt, upvoteStruct, interfaceC181487Ai);
            u42.LJI();
        }
    }

    public final void X4(String str) {
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            C26045AKb c26045AKb = new C26045AKb(getContainerView());
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
    }

    public final void f5(String str) {
        C7IZ u4;
        String str2;
        String str3;
        CLACaptionAbility cLACaptionAbility;
        Object obj;
        Integer valueOf;
        if (I4()) {
            q4(8);
            return;
        }
        if (o.LJ(str, "fake_publish") || o.LJ(str, "publish_success")) {
            A4().LJLJI.LIZIZ = true;
        }
        if (o.LJ(str, "fake_publish")) {
            A4().LJLJI.LJII = false;
            A4().LJLJI.LJIIIZ = false;
        }
        if (o.LJ(str, "delete_success")) {
            A4().LJLJI.LJII = false;
            A4().LJLJI.LJIIIZ = false;
            Iterator it = ORZ.LLJJI(A4().LJLJI.LJIILIIL).iterator();
            while (true) {
                C199797sl c199797sl = (C199797sl) it;
                if (c199797sl.hasNext()) {
                    obj = c199797sl.next();
                    if (o.LJ(((C2058786d) obj).LIZIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C2058786d c2058786d = (C2058786d) obj;
            if (c2058786d != null && (valueOf = Integer.valueOf(c2058786d.LIZ)) != null && valueOf.intValue() >= 0 && valueOf.intValue() < A4().LJLJI.LJIILIIL.size()) {
                ListProtector.remove(A4().LJLJI.LJIILIIL, valueOf.intValue());
            }
        }
        if ((C53326KwM.LIZIZ() && !C7IP.LIZ(z4().LIZIZ())) || C78996UzQ.LJJIIZI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            q4(8);
            C7IZ u42 = u4();
            if (u42 != null) {
                u42.LIZJ();
                return;
            }
            return;
        }
        if (z4().LIZLLL()) {
            q4(8);
            C7IZ u43 = u4();
            if (u43 != null) {
                u43.LIZJ();
                return;
            }
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && !this.LLIL && (u4 = u4()) != null && u4.LJIIL() && (str2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1271119582) {
                if (hashCode != -667094460) {
                    if (hashCode == 1691937916 && str2.equals("homepage_hot")) {
                        str3 = "For You";
                        Hox.LJLLI.LIZ(LIZ).hv0(str3, this);
                        this.LLIL = true;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(hashCode());
                        LIZ2.append(" Hox registered for ");
                        LIZ2.append(str3);
                        X1D.LIZIZ(LIZ2);
                    }
                } else if (str2.equals("homepage_friends")) {
                    str3 = "FRIENDS_FEED";
                    Hox.LJLLI.LIZ(LIZ).hv0(str3, this);
                    this.LLIL = true;
                    StringBuilder LIZ22 = X1D.LIZ();
                    LIZ22.append(hashCode());
                    LIZ22.append(" Hox registered for ");
                    LIZ22.append(str3);
                    X1D.LIZIZ(LIZ22);
                }
            } else if (str2.equals("homepage_follow")) {
                str3 = "Following";
                Hox.LJLLI.LIZ(LIZ).hv0(str3, this);
                this.LLIL = true;
                StringBuilder LIZ222 = X1D.LIZ();
                LIZ222.append(hashCode());
                LIZ222.append(" Hox registered for ");
                LIZ222.append(str3);
                X1D.LIZIZ(LIZ222);
            }
        }
        getContainerView().post(new ARunnableS4S1100000_3(this, str, 2));
        q4(0);
        if (C52280KfU.LIZ() && (cLACaptionAbility = (CLACaptionAbility) this.LLIIIJ.getValue()) != null) {
            cLACaptionAbility.t20();
        }
        if (E4()) {
            T4();
            F4();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        try {
            this.LLIILZL = (C224748ru) Y3().findViewById(R.id.gie);
            C8YN.LJII(this, (VideoViewModel) this.LLI.getValue(), new TBT() { // from class: X.7J6
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJI;
                }
            }, null, C183567Ii.LJLIL, 6);
            C8YN.LJII(this, (VideoViewModel) this.LLI.getValue(), new TBT() { // from class: X.7Dh
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, null, C183637Ip.LJLIL, 6);
            boolean z = true;
            String str = null;
            C8YN.LJII(this, (AvoidUpvoteViewModel) this.LLIIIILZ.LIZ(this, LLJI[1]), new TBT() { // from class: X.7Iv
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C183707Iw) obj).LJLIL;
                }
            }, null, C7IV.LJLIL, 6);
            if (((Number) C183827Ji.LIZ.getValue()).intValue() == 0) {
                z = false;
            }
            String str2 = null;
            if (!z) {
                if (C7HP.LIZ()) {
                    C183617In B4 = B4();
                    if (B4 != null) {
                        str = B4.LJLILLLLZI;
                    }
                    if (D4(str)) {
                        C8YN.LJII(this, (VideoEventDispatchViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.7Je
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C8UB) obj).LJLJI;
                            }
                        }, null, C7JJ.LJLIL, 6);
                    }
                }
            } else if (C7HP.LIZ()) {
                C183617In B42 = B4();
                if (B42 != null) {
                    str = B42.LJLILLLLZI;
                }
                if (D4(str)) {
                    C8YN.LJII(this, (VideoEventDispatchViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.7JL
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C8UB) obj).LJLJJI;
                        }
                    }, null, C7JH.LJLIL, 6);
                }
            }
            if (C7HP.LIZ()) {
                C183617In B43 = B4();
                if (B43 != null) {
                    str2 = B43.LJLILLLLZI;
                }
                if (D4(str2)) {
                    C8YN.LJII(this, (VideoEventDispatchViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.7Jd
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C8UB) obj).LJLJL;
                        }
                    }, null, C7JF.LJLIL, 6);
                }
            }
            view.post(new ARunnableS39S0100000_3(this, 105));
            HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLIIJI.getValue();
            if (homeTabAbility != null) {
                homeTabAbility.na(new LDY() { // from class: X.7Ik
                    @Override // X.LDY
                    public final void LIZ(String str3, String to) {
                        String str4;
                        o.LJIIIZ(to, "to");
                        if (o.LJ(str3, to) || (str4 = ((VideoItemParams) C51029K0z.LJIILLIIL(UpvoteVideoAssem.this)).mEventType) == null) {
                            return;
                        }
                        if (o.LJ(str4, "homepage_hot")) {
                            if (o.LJ(to, "For You")) {
                                UpvoteVideoAssem upvoteVideoAssem = UpvoteVideoAssem.this;
                                if (upvoteVideoAssem.LLIZ) {
                                    upvoteVideoAssem.LLILZLL = true;
                                    upvoteVideoAssem.e5();
                                }
                            }
                            if (o.LJ(str3, "For You")) {
                                UpvoteVideoAssem upvoteVideoAssem2 = UpvoteVideoAssem.this;
                                if (upvoteVideoAssem2.LLIZ) {
                                    upvoteVideoAssem2.LLILZLL = false;
                                    upvoteVideoAssem2.e5();
                                }
                            }
                        }
                        if (o.LJ(str4, "homepage_follow")) {
                            if (o.LJ(to, "Following")) {
                                UpvoteVideoAssem upvoteVideoAssem3 = UpvoteVideoAssem.this;
                                if (upvoteVideoAssem3.LLIZ) {
                                    upvoteVideoAssem3.LLILZLL = true;
                                    upvoteVideoAssem3.e5();
                                }
                            }
                            if (o.LJ(str3, "Following")) {
                                UpvoteVideoAssem upvoteVideoAssem4 = UpvoteVideoAssem.this;
                                if (upvoteVideoAssem4.LLIZ) {
                                    upvoteVideoAssem4.LLILZLL = false;
                                    upvoteVideoAssem4.e5();
                                }
                            }
                        }
                        if (o.LJ(str4, "homepage_friends")) {
                            if (o.LJ(to, "FRIENDS_FEED")) {
                                UpvoteVideoAssem upvoteVideoAssem5 = UpvoteVideoAssem.this;
                                if (upvoteVideoAssem5.LLIZ) {
                                    upvoteVideoAssem5.LLILZLL = true;
                                    upvoteVideoAssem5.e5();
                                    return;
                                }
                            }
                            if (!o.LJ(str3, "FRIENDS_FEED")) {
                                return;
                            }
                            UpvoteVideoAssem upvoteVideoAssem6 = UpvoteVideoAssem.this;
                            if (!upvoteVideoAssem6.LLIZ) {
                                return;
                            }
                            upvoteVideoAssem6.LLILZLL = false;
                            upvoteVideoAssem6.e5();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS39S0100000_3(th, 106));
        }
    }

    public final void q4(int i) {
        getContainerView().setVisibility(i);
        if (i == 0) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LLII.LIZ(this, LLJI[0]);
            C7J4 c7j4 = new C7J4(EnumC183687Iu.UPVOTE_VIDEO_ASSEM, C74221TAz.LIZJ((VideoItemParams) C51029K0z.LJIILLIIL(this), "item.aweme.aid"), true);
            assemViewModel.getClass();
            assemViewModel.setState(new AqS169S0100000_3(c7j4, 746));
            return;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LLII.LIZ(this, LLJI[0]);
        C7J4 c7j42 = new C7J4(EnumC183687Iu.UPVOTE_VIDEO_ASSEM, C74221TAz.LIZJ((VideoItemParams) C51029K0z.LJIILLIIL(this), "item.aweme.aid"), false);
        assemViewModel2.getClass();
        assemViewModel2.setState(new AqS169S0100000_3(c7j42, 746));
    }

    public final boolean r4(boolean z) {
        CLACaptionAbility cLACaptionAbility;
        if (!E4() || !((RBX) HG3.LJIILL()).isLogin() || C7HH.LIZ(z4().LJLJJL)) {
            return false;
        }
        C183577Ij c183577Ij = A4().LJLJI;
        if (c183577Ij.LIZJ || c183577Ij.LIZLLL || !z4().LIZLLL() || !C7HO.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) || ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAuthor().getFollowStatus() == 2) {
            return false;
        }
        if (z && C52280KfU.LIZ() && (cLACaptionAbility = (CLACaptionAbility) this.LLIIIJ.getValue()) != null) {
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            if (cLACaptionAbility.Md0(aid)) {
                return false;
            }
        }
        if (C53326KwM.LIZIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        this.LLILZ = aweme;
        this.LLIZ = true;
        this.LLILZLL = true;
        e5();
    }

    public final void J4(VideoItemParams videoItemParams, boolean z) {
        String str;
        Boolean bool;
        String str2;
        M89 m89;
        Aweme aweme = videoItemParams.getAweme();
        UpvoteList upvoteList = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(z4().LJLJJL, str)) {
            return;
        }
        q4(8);
        if (!z) {
            C26045AKb c26045AKb = new C26045AKb(getContainerView());
            c26045AKb.LJIIIIZZ(R.string.q3e);
            c26045AKb.LJIIJ();
            return;
        }
        if (!this.LLIIZ) {
            if (getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                C7IZ u4 = u4();
                if (u4 != null) {
                    u4.LJIIJJI = new IDqS459S0100000_3(this, 0);
                }
                View containerView = getContainerView();
                ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C7MY.LIZIZ(32);
                    containerView.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            this.LLIIZ = true;
        }
        if (str != null) {
            bool = Boolean.valueOf(C7H2.LIZLLL(str));
        } else {
            bool = null;
        }
        this.LLILL = bool;
        A4().getClass();
        UpvoteListViewModel z4 = z4();
        Aweme aweme2 = videoItemParams.getAweme();
        z4.getClass();
        String str3 = z4.LJLJJL;
        if (str3 != null) {
            C7H1.LJIIL(str3, z4);
        }
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        z4.LJLJJL = str2;
        z4.LJLJJLL = aweme2;
        z4.LJLJI = false;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null) {
            m89 = baseFeedPageParams.param;
        } else {
            m89 = null;
        }
        C7KB LIZ = C7KA.LIZ(m89);
        z4.LJLJL = LIZ;
        if (aweme2 != null) {
            upvoteList = C7H1.LJIIJ(aweme2, z4, LIZ);
        }
        z4.LJ(upvoteList, "cache");
        Aweme aweme3 = videoItemParams.getAweme();
        o.LJIIIIZZ(aweme3, "item.aweme");
        if (I4()) {
            q4(8);
        } else if (A4().LJLJI.LJ) {
            if (!C53326KwM.LIZIZ()) {
                Y4("like", aweme3.getAid(), A4().LJLJI.LJIILL, A4().LJLJI.LJIILJJIL);
            }
        } else if (A4().LJLJI.LJI) {
            if (!C53326KwM.LIZIZ()) {
                Y4("loop", aweme3.getAid(), A4().LJLJI.LJIILL, A4().LJLJI.LJIILJJIL);
            }
        } else if (A4().LJLJI.LJFF && !C53326KwM.LIZIZ()) {
            Y4("oneLoop", aweme3.getAid(), A4().LJLJI.LJIILL, A4().LJLJI.LJIILJJIL);
        }
        this.LLILII = false;
    }

    public final void S4(final String str, final String str2) {
        if (str == null) {
            return;
        }
        C7K1.LIZ().runTask("repost_guides", C7K1.LIZIZ(str2, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType), new PTYTaskConfig(false, null, 1000.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem$runPitayaTask$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                UpvoteVideoAssem upvoteVideoAssem = UpvoteVideoAssem.this;
                AqS1S2310000_3 aqS1S2310000_3 = new AqS1S2310000_3(z, pTYError, str, upvoteVideoAssem, pTYTaskData, str2, 0);
                upvoteVideoAssem.getClass();
                ((C73318Sq2) upvoteVideoAssem.LLILZIL.getValue()).LIZ(AbstractC73547Stj.LJFF(new IDaS214S0100000_3(aqS1S2310000_3, 3)).LJIILIIL(C73969T1h.LIZIZ()).LJIIJJI());
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        this.LLILLL = null;
    }

    public final void c5(String str, String str2, boolean z) {
        String str3;
        int hashCode = str.hashCode();
        if (hashCode != -1321449942) {
            if (hashCode != 3321751) {
                if (hashCode == 3327652 && str.equals("loop")) {
                    A4().LJLJI.LJI = true;
                }
            } else if (str.equals("like")) {
                A4().LJLJI.LJ = true;
            }
        } else if (str.equals("oneLoop")) {
            A4().LJLJI.LJFF = true;
        }
        if (I4()) {
            q4(8);
            return;
        }
        String str4 = z4().LJLJJL;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        if (o.LJ(str4, str3)) {
            Y4(str, z4().LJLJJL, str2, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r20.equals("loop") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f0, code lost:
    
        if (r23 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f2, code lost:
    
        A4().LJLJI.getClass();
        X.C7IK.LJII(X.C7IK.LJ() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0104, code lost:
    
        A4().LJLJI.LIZJ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ee, code lost:
    
        if (r20.equals("oneLoop") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y4(java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem.Y4(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
