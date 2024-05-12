package com.ss.android.ugc.aweme.upvote.detail.whitebar;

import X.AV1;
import X.AbstractC73547Stj;
import X.C16880lQ;
import X.C183557Ih;
import X.C183617In;
import X.C183677It;
import X.C183827Ji;
import X.C183907Jq;
import X.C183967Jw;
import X.C183997Jz;
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
import X.C7FP;
import X.C7FQ;
import X.C7H1;
import X.C7H2;
import X.C7HH;
import X.C7HO;
import X.C7HP;
import X.C7HX;
import X.C7IK;
import X.C7IQ;
import X.C7IR;
import X.C7IS;
import X.C7IU;
import X.C7J1;
import X.C7J3;
import X.C7J4;
import X.C7JA;
import X.C7JG;
import X.C7JI;
import X.C7JK;
import X.C7JP;
import X.C7JQ;
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
import X.InterfaceC74236TBo;
import X.LDY;
import X.M89;
import X.RBX;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS4S1100000_3;
import Y.IDAListenerS37S0200000_3;
import Y.IDAListenerS72S0100000_3;
import Y.IDaS214S0100000_3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
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
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.service.HideVideoTagAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
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
public final class UpvoteVideoAssemNew extends BaseCellSlotComponent<UpvoteVideoAssemNew> implements InterfaceC181487Ai, ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJ;
    public final C55749LuL LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C5H3 LLII;
    public final InterfaceC115514g7 LLIIII;
    public final C62822Ol8 LLIIIILZ;
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

    static {
        TBT tbt = new TBT(UpvoteVideoAssemNew.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(UpvoteVideoAssemNew.class, "avoidUpvoteVM", "getAvoidUpvoteVM()Lcom/ss/android/ugc/aweme/feed/adapter/AvoidUpvoteViewModel;", 0, c65351Pkp)};
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LLIILZL() {
        this.LLIZ = false;
        e5();
    }

    @Override // X.InterfaceC181487Ai
    public final void T(String str) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.drb;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_social_repost";
    }

    public UpvoteVideoAssemNew() {
        new LinkedHashMap();
        this.LLFII = new C55749LuL(C47704Ins.LJ(this, C183617In.class, null), checkSupervisorPrepared());
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C7FP.INSTANCE);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C7FQ.INSTANCE);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StatePassingVM.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1188), null, C7J3.INSTANCE, null, null);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(RepostEventVMNew.class), C7J1.INSTANCE);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(AvoidUpvoteViewModel.class);
        this.LLIIII = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 1189), null, C183677It.INSTANCE, null, null);
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1185));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1181));
        this.LLIIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1183));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1186));
        this.LLIIJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1184));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1187));
        this.LLIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1190));
        this.LLIILII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1182));
        this.LLILZIL = C221108m2.LIZIZ(C7JA.LJLIL);
    }

    public final C183617In A4() {
        return (C183617In) this.LLFII.getValue();
    }

    public final C183557Ih B4() {
        if (this.LJLLLL) {
            return (C183557Ih) this.LLIIL.getValue();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        if (this.LLILLIZIL == null) {
            return;
        }
        G4();
        ((C73318Sq2) this.LLILZIL.getValue()).LIZLLL();
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
            X.7In r0 = r6.A4()
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
            X.7In r0 = r6.A4()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.e5():void");
    }

    public final UpvoteListViewModelNew u4() {
        return (UpvoteListViewModelNew) this.LLIIJLIL.getValue();
    }

    public final RepostEventVMNew z4() {
        return (RepostEventVMNew) this.LLII.getValue();
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
        List<UpvoteStruct> LIZIZ = u4().LIZIZ();
        int i = 1;
        if (!this.LJLLL || Y3().getVisibility() != 0 || LIZIZ == null || LIZIZ.isEmpty()) {
            return;
        }
        UpvoteListViewModelNew u4 = u4();
        if ((!u4.LIZLLL() || u4.LIZIZ().size() != 1 || !z4().LJLJI.LIZIZ) && (l = this.LLILIL) != null) {
            long longValue = l.longValue();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time_interval", System.currentTimeMillis() - longValue);
                Boolean bool = this.LLILL;
                if (bool != null) {
                    if (!o.LJ(bool, Boolean.TRUE)) {
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
        C8YN.LJIJI((AssemViewModel) this.LLIIII.LIZ(this, LLJ[1]), new AqS169S0100000_3(this, 529));
        if (!o.LJ(this.LLILLL, Boolean.FALSE)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC181487Ai
    public final boolean LJLLLL() {
        return z4().LJLJI.LIZIZ;
    }

    public final void T4() {
        Aweme aweme;
        User author;
        if (o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "homepage_friends") && ((Boolean) C7JT.LIZ.getValue()).booleanValue() && !C7IK.LIZJ().getBoolean(C7IK.LIZ("has_upvote_tooltip_shown_"), false) && !u4().LJ()) {
            UpvoteListViewModelNew u4 = u4();
            if ((!u4.LIZLLL() || u4.LIZIZ().size() != 1) && (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) != null && (author = aweme.getAuthor()) != null && author.getMatchedFriendStruct() == null) {
                if (author.getFollowStatus() < 0 || author.getFollowStatus() == 0) {
                    getContainerView().postDelayed(new ARunnableS39S0100000_3(this, 110), 200L);
                }
            }
        }
    }

    public final void a5() {
        z4().LJLJI.getClass();
        if (C7IK.LIZIZ() >= ((Number) C46406IJe.LIZLLL.getValue()).intValue()) {
            return;
        }
        z4().LJLJI.getClass();
        if (C7IK.LIZLLL() >= C46403IJb.LIZIZ) {
            return;
        }
        c5("like", null, false);
    }

    public final void b5() {
        z4().LJLJI.getClass();
        if (C7IK.LIZLLL() >= C46403IJb.LIZIZ) {
            return;
        }
        z4().LJLJI.getClass();
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
    }

    @Override // X.InterfaceC181487Ai
    public final void z1() {
        String aid;
        SpannableString spannableString;
        Editable text;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null && (aid = aweme.getAid()) != null) {
            RepostEventVMNew z4 = z4();
            C224748ru c224748ru = this.LLIILZL;
            if (c224748ru != null && (text = c224748ru.getText()) != null) {
                spannableString = SpannableString.valueOf(text);
                o.LJIIIIZZ(spannableString, "SpannableString.valueOf(this)");
            } else {
                spannableString = null;
            }
            z4.getClass();
            z4.setStateImmediate(new AqS57S1100000_3(spannableString, aid, 41));
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
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLIIIILZ.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
        C183617In A4 = A4();
        if (A4 != null) {
            str = A4.LJLIL;
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        o.LJIIIZ(view, "view");
        C183557Ih B4 = B4();
        if (B4 != null) {
            B4.LJIIJJI = new AqS185S0100000_3(this, 113);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a0, code lost:
    
        if (r0 != 4) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O4(boolean r13) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.O4(boolean):void");
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

    public final void R4(UpvoteStruct upvoteStruct) {
        String text;
        List<CommentImageStruct> imageList;
        z4().LJLJI.LIZIZ = true;
        if (upvoteStruct == null || (((text = upvoteStruct.getText()) == null || text.length() == 0) && (upvoteStruct == null || (imageList = upvoteStruct.getImageList()) == null || imageList.isEmpty()))) {
            C183557Ih B4 = B4();
            if (B4 != null) {
                B4.LIZIZ();
                C183907Jq c183907Jq = B4.LIZLLL;
                if (c183907Jq != null) {
                    c183907Jq.setVisibility(8);
                }
                C7JP c7jp = B4.LJ;
                if (c7jp != null) {
                    c7jp.setVisibility(8);
                }
                UpvoteListViewModelNew upvoteListViewModelNew = B4.LIZIZ;
                B4.LJII = upvoteListViewModelNew.LJLJI;
                UpvoteList value = upvoteListViewModelNew.LIZJ().getValue();
                if (value == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (B4.LJFF == 1) {
                    arrayList.add(C183967Jw.LIZIZ(B4.LIZJ));
                }
                arrayList.add(C183967Jw.LIZ(B4.LIZLLL, null, B4.LJIIJJI));
                if (C7HO.LIZIZ(B4.LIZIZ.LJLJJI) && C7HO.LIZ(B4.LIZIZ.LJLJJI)) {
                    Animator LIZIZ = C183967Jw.LIZIZ(B4.LIZLLL);
                    LIZIZ.setStartDelay(2000L);
                    arrayList.add(LIZIZ);
                    arrayList.add(C183967Jw.LIZ(B4.LJ, new ARunnableS39S0100000_3(B4, 111), B4.LJIIJJI));
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(arrayList);
                animatorSet.addListener(new IDAListenerS37S0200000_3(B4, value, 2));
                animatorSet.addListener(new IDAListenerS72S0100000_3(B4, 28));
                B4.LJIIJ = animatorSet;
                animatorSet.start();
                return;
            }
            return;
        }
        C183557Ih B42 = B4();
        if (B42 == null) {
            return;
        }
        B42.LJ();
    }

    public final void X4(String str) {
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            C26045AKb c26045AKb = new C26045AKb(getContainerView());
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
    }

    public final void f5(String str) {
        CLACaptionAbility cLACaptionAbility;
        if (I4()) {
            q4(8);
            return;
        }
        if (o.LJ(str, "fake_publish") || o.LJ(str, "publish_success")) {
            z4().LJLJI.LIZIZ = true;
        }
        if (C53326KwM.LIZIZ() && !u4().LIZLLL()) {
            q4(8);
            C183557Ih B4 = B4();
            if (B4 != null) {
                B4.LIZIZ();
                return;
            }
            return;
        }
        if (u4().LJ()) {
            q4(8);
            C183557Ih B42 = B4();
            if (B42 != null) {
                B42.LIZIZ();
                return;
            }
            return;
        }
        getContainerView().post(new ARunnableS4S1100000_3(this, str, 3));
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
            C8YN.LJII(this, (VideoViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.7J7
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJI;
                }
            }, null, C7IR.LJLIL, 6);
            C8YN.LJII(this, (VideoViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.7Iy
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, null, C7IS.LJLIL, 6);
            boolean z = true;
            String str = null;
            C8YN.LJII(this, (AvoidUpvoteViewModel) this.LLIIII.LIZ(this, LLJ[1]), new TBT() { // from class: X.7Ix
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C183707Iw) obj).LJLIL;
                }
            }, null, C7IU.LJLIL, 6);
            if (((Number) C183827Ji.LIZ.getValue()).intValue() == 0) {
                z = false;
            }
            String str2 = null;
            if (!z) {
                if (C7HP.LIZ()) {
                    C183617In A4 = A4();
                    if (A4 != null) {
                        str = A4.LJLILLLLZI;
                    }
                    if (D4(str)) {
                        C8YN.LJII(this, (VideoEventDispatchViewModel) this.LLI.getValue(), new TBT() { // from class: X.7Jg
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C8UB) obj).LJLJI;
                            }
                        }, null, C7JK.LJLIL, 6);
                    }
                }
            } else if (C7HP.LIZ()) {
                C183617In A42 = A4();
                if (A42 != null) {
                    str = A42.LJLILLLLZI;
                }
                if (D4(str)) {
                    C8YN.LJII(this, (VideoEventDispatchViewModel) this.LLI.getValue(), new TBT() { // from class: X.7JN
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C8UB) obj).LJLJJI;
                        }
                    }, null, C7JI.LJLIL, 6);
                }
            }
            if (C7HP.LIZ()) {
                C183617In A43 = A4();
                if (A43 != null) {
                    str2 = A43.LJLILLLLZI;
                }
                if (D4(str2)) {
                    C8YN.LJII(this, (VideoEventDispatchViewModel) this.LLI.getValue(), new TBT() { // from class: X.7Jf
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C8UB) obj).LJLJL;
                        }
                    }, null, C7JG.LJLIL, 6);
                }
            }
            view.post(new ARunnableS39S0100000_3(this, 108));
            HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLIIJI.getValue();
            if (homeTabAbility != null) {
                homeTabAbility.na(new LDY() { // from class: X.7Il
                    @Override // X.LDY
                    public final void LIZ(String str3, String to) {
                        String str4;
                        o.LJIIIZ(to, "to");
                        if (o.LJ(str3, to) || (str4 = ((VideoItemParams) C51029K0z.LJIILLIIL(UpvoteVideoAssemNew.this)).mEventType) == null) {
                            return;
                        }
                        if (o.LJ(str4, "homepage_hot")) {
                            if (o.LJ(to, "For You")) {
                                UpvoteVideoAssemNew upvoteVideoAssemNew = UpvoteVideoAssemNew.this;
                                if (upvoteVideoAssemNew.LLIZ) {
                                    upvoteVideoAssemNew.LLILZLL = true;
                                    upvoteVideoAssemNew.e5();
                                }
                            }
                            if (o.LJ(str3, "For You")) {
                                UpvoteVideoAssemNew upvoteVideoAssemNew2 = UpvoteVideoAssemNew.this;
                                if (upvoteVideoAssemNew2.LLIZ) {
                                    upvoteVideoAssemNew2.LLILZLL = false;
                                    upvoteVideoAssemNew2.e5();
                                }
                            }
                        }
                        if (o.LJ(str4, "homepage_follow")) {
                            if (o.LJ(to, "Following")) {
                                UpvoteVideoAssemNew upvoteVideoAssemNew3 = UpvoteVideoAssemNew.this;
                                if (upvoteVideoAssemNew3.LLIZ) {
                                    upvoteVideoAssemNew3.LLILZLL = true;
                                    upvoteVideoAssemNew3.e5();
                                }
                            }
                            if (o.LJ(str3, "Following")) {
                                UpvoteVideoAssemNew upvoteVideoAssemNew4 = UpvoteVideoAssemNew.this;
                                if (upvoteVideoAssemNew4.LLIZ) {
                                    upvoteVideoAssemNew4.LLILZLL = false;
                                    upvoteVideoAssemNew4.e5();
                                }
                            }
                        }
                        if (o.LJ(str4, "homepage_friends")) {
                            if (o.LJ(to, "FRIENDS_FEED")) {
                                UpvoteVideoAssemNew upvoteVideoAssemNew5 = UpvoteVideoAssemNew.this;
                                if (upvoteVideoAssemNew5.LLIZ) {
                                    upvoteVideoAssemNew5.LLILZLL = true;
                                    upvoteVideoAssemNew5.e5();
                                    return;
                                }
                            }
                            if (!o.LJ(str3, "FRIENDS_FEED")) {
                                return;
                            }
                            UpvoteVideoAssemNew upvoteVideoAssemNew6 = UpvoteVideoAssemNew.this;
                            if (!upvoteVideoAssemNew6.LLIZ) {
                                return;
                            }
                            upvoteVideoAssemNew6.LLILZLL = false;
                            upvoteVideoAssemNew6.e5();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS39S0100000_3(th, 109));
        }
    }

    public final void q4(int i) {
        getContainerView().setVisibility(i);
        if (i == 0) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LLIFFJFJJ.LIZ(this, LLJ[0]);
            C7J4 c7j4 = new C7J4(EnumC183687Iu.UPVOTE_VIDEO_ASSEM, C74221TAz.LIZJ((VideoItemParams) C51029K0z.LJIILLIIL(this), "item.aweme.aid"), true);
            assemViewModel.getClass();
            assemViewModel.setState(new AqS169S0100000_3(c7j4, 746));
            return;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LLIFFJFJJ.LIZ(this, LLJ[0]);
        C7J4 c7j42 = new C7J4(EnumC183687Iu.UPVOTE_VIDEO_ASSEM, C74221TAz.LIZJ((VideoItemParams) C51029K0z.LJIILLIIL(this), "item.aweme.aid"), false);
        assemViewModel2.getClass();
        assemViewModel2.setState(new AqS169S0100000_3(c7j42, 746));
    }

    public final boolean r4(boolean z) {
        CLACaptionAbility cLACaptionAbility;
        if (!E4() || !((RBX) HG3.LJIILL()).isLogin() || C7HH.LIZ(u4().LJLJI)) {
            return false;
        }
        C7IQ c7iq = z4().LJLJI;
        if (c7iq.LIZJ || c7iq.LIZLLL || !u4().LJ() || !C7HO.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) || ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAuthor().getFollowStatus() == 2) {
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
        if (o.LJ(u4().LJLJI, str)) {
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
                C183557Ih B4 = B4();
                if (B4 != null) {
                    B4.LJIIIIZZ = new IDqS459S0100000_3(this, 1);
                }
                View containerView = getContainerView();
                ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C7MY.LIZIZ(28);
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
        z4().getClass();
        UpvoteListViewModelNew u4 = u4();
        Aweme aweme2 = videoItemParams.getAweme();
        u4.getClass();
        String str3 = u4.LJLJI;
        if (str3 != null) {
            C7H1.LJIIL(str3, u4);
        }
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        u4.LJLJI = str2;
        u4.LJLJJI = aweme2;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null) {
            m89 = baseFeedPageParams.param;
        } else {
            m89 = null;
        }
        C7KB LIZ = C7KA.LIZ(m89);
        if (aweme2 != null) {
            upvoteList = C7H1.LJIIJ(aweme2, u4, LIZ);
        }
        u4.LJFF(upvoteList, "cache");
        if (I4()) {
            q4(8);
        } else if (!C53326KwM.LIZIZ()) {
            if (z4().LJLJI.LJ) {
                z4();
                Y4("like", z4().LJLJI.LJIIIZ);
            } else if (z4().LJLJI.LJI) {
                z4();
                Y4("loop", z4().LJLJI.LJIIIZ);
            } else if (z4().LJLJI.LJFF) {
                z4();
                Y4("oneLoop", z4().LJLJI.LJIIIZ);
            }
        }
        this.LLIL = false;
    }

    public final void S4(final String str, final String str2) {
        if (str == null) {
            return;
        }
        C7K1.LIZ().runTask("repost_guides", C7K1.LIZIZ(str2, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType), new PTYTaskConfig(false, null, 1000.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew$runPitayaTask$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                UpvoteVideoAssemNew upvoteVideoAssemNew = UpvoteVideoAssemNew.this;
                AqS1S2310000_3 aqS1S2310000_3 = new AqS1S2310000_3(z, pTYError, str, upvoteVideoAssemNew, pTYTaskData, str2, 1);
                upvoteVideoAssemNew.getClass();
                ((C73318Sq2) upvoteVideoAssemNew.LLILZIL.getValue()).LIZ(AbstractC73547Stj.LJFF(new IDaS214S0100000_3(aqS1S2310000_3, 4)).LJIILIIL(C73969T1h.LIZIZ()).LJIIJJI());
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x013e, code lost:
    
        if (r20.equals("loop") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0172, code lost:
    
        if (r21 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0174, code lost:
    
        z4().LJLJI.getClass();
        X.C7IK.LJII(X.C7IK.LJ() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0186, code lost:
    
        z4().LJLJI.LIZJ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
    
        if (r20.equals("oneLoop") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y4(java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.Y4(java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        String str;
        C183557Ih B4;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(u4().LJLJI, str) && (B4 = B4()) != null) {
            B4.LJII = null;
            B4.LJFF = 0;
            B4.LJI = false;
            C183907Jq c183907Jq = B4.LIZLLL;
            if (c183907Jq != null) {
                c183907Jq.setVisibility(8);
            }
            C7JQ c7jq = B4.LIZJ;
            if (c7jq != null) {
                c7jq.setVisibility(8);
            }
            C7JP c7jp = B4.LJ;
            if (c7jp != null) {
                c7jp.setVisibility(8);
            }
        }
        this.LLILLL = null;
    }

    public final void c5(String str, String str2, boolean z) {
        String str3;
        int hashCode = str.hashCode();
        if (hashCode != -1321449942) {
            if (hashCode != 3321751) {
                if (hashCode == 3327652 && str.equals("loop")) {
                    z4().LJLJI.LJI = true;
                }
            } else if (str.equals("like")) {
                z4().LJLJI.LJ = true;
            }
        } else if (str.equals("oneLoop")) {
            z4().LJLJI.LJFF = true;
        }
        if (I4()) {
            q4(8);
            return;
        }
        String str4 = u4().LJLJI;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        if (o.LJ(str4, str3)) {
            Y4(str, z);
        }
    }
}
