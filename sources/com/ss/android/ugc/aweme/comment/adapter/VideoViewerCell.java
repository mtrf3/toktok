package com.ss.android.ugc.aweme.comment.adapter;

import X.AbstractC13940gg;
import X.ActivityC45651qj;
import X.C12460eI;
import X.C1806377b;
import X.C181677Bb;
import X.C1DI;
import X.C220488l2;
import X.C221108m2;
import X.C222578oP;
import X.C45804HyK;
import X.C54838Lfe;
import X.C57362MfG;
import X.C58049MqL;
import X.C62822Ol8;
import X.C78946Uyc;
import X.C7ZI;
import X.EnumC112364b2;
import X.EnumC112374b3;
import X.EnumC112754bf;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC57435MgR;
import X.InterfaceC112734bd;
import X.JHM;
import Y.AObserverS71S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.adapter.VideoViewerCell;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoViewerCell extends PowerCell<C181677Bb> {
    public User LJLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 83));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 75));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 74));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 76));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 79));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 78));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 82));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 81));
    public String LJLJLLL = "";
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 80));
    public final AObserverS71S0100000_3 LJLLILLLL = new AObserverS71S0100000_3(this, 4);

    public final C58049MqL M() {
        return (C58049MqL) this.LJLJJL.getValue();
    }

    public final TuxTextView N() {
        return (TuxTextView) this.LJLJL.getValue();
    }

    public final VideoViewerListVM P() {
        return (VideoViewerListVM) this.LJLIL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r1 == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.adapter.VideoViewerCell.L():void");
    }

    public final void U() {
        User user;
        C181677Bb item = getItem();
        if (item == null || (user = item.LJLIL) == null || ((Set) P().LJLJJL.getValue()).contains(user.getUid()) || !T(EnumC57365MfJ.SHOW)) {
            return;
        }
        Set set = (Set) P().LJLJJL.getValue();
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        set.add(uid);
    }

    public final void V() {
        User user;
        if (!C7ZI.LIZIZ()) {
            return;
        }
        C181677Bb item = getItem();
        ActivityStatus activityStatus = null;
        if (item != null) {
            user = item.LJLIL;
        } else {
            user = null;
        }
        C181677Bb item2 = getItem();
        if (item2 != null) {
            activityStatus = item2.LJLJI;
        }
        C78946Uyc.LJJIJIL(this, user, activityStatus, EnumC112364b2.VIEW_LIST);
    }

    public final void X() {
        User user;
        C181677Bb item;
        User user2;
        String str;
        String str2;
        C1806377b c1806377b;
        User user3;
        C181677Bb item2 = getItem();
        if (item2 == null || (user = item2.LJLIL) == null || ((Set) P().LJLJJLL.getValue()).contains(user.getUid()) || !C7ZI.LIZJ() || (item = getItem()) == null || (user2 = item.LJLIL) == null || user2.getFollowStatus() != EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
            return;
        }
        Set set = (Set) P().LJLJJLL.getValue();
        C181677Bb item3 = getItem();
        ActivityStatus activityStatus = null;
        if (item3 != null && (user3 = item3.LJLIL) != null) {
            str = user3.getUid();
        } else {
            str = null;
        }
        set.add(str);
        InterfaceC112734bd imNudgeAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics();
        C181677Bb item4 = getItem();
        if (item4 != null) {
            activityStatus = item4.LJLJI;
        }
        String LIZIZ = imNudgeAnalytics.LIZIZ(activityStatus);
        InterfaceC112734bd imNudgeAnalytics2 = IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics();
        C181677Bb item5 = getItem();
        if (item5 == null || (c1806377b = item5.LJLILLLLZI) == null || (str2 = c1806377b.LIZJ) == null) {
            str2 = "";
        }
        imNudgeAnalytics2.LIZJ(str2, EnumC112374b3.VIEW_LIST.getValue(), EnumC112754bf.SHOW.getValue(), LIZIZ, user.getUid());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new AbstractC13940gg(this) { // from class: X.7Ce
            public final C181977Cf LJ = C181977Cf.LJLIL;
            public InterfaceC65784Pro<String> LJFF;
            public final C181957Cd LJI;

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ java.util.Map LJFF() {
                return null;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                return this.LJI;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.7Cd] */
            {
                this.LJFF = new AqS153S0100000_3(this, 77);
                this.LJI = new InterfaceC19530ph() { // from class: X.7Cd
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        VideoViewerCell videoViewerCell;
                        C181677Bb item;
                        User user;
                        C181677Bb item2;
                        List<String> list;
                        int size;
                        o.LJIIIZ(itemID, "itemID");
                        if (!C7ZT.LIZIZ() || (item = (videoViewerCell = VideoViewerCell.this).getItem()) == null || (user = item.LJLIL) == null || (item2 = videoViewerCell.getItem()) == null || (list = item2.LJLJJI) == null || (size = list.size()) < 1 || videoViewerCell.N().getVisibility() != 0) {
                            return;
                        }
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", "views_list");
                        c188727au.LIZLLL(size, "unread_num");
                        c188727au.LJIIIZ("to_user_id", user.getUid());
                        c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(user));
                        FMX.LJIIL("unread_post_show", c188727au.LIZ);
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJFF = interfaceC65784Pro;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        NextLiveData<Boolean> hv0 = P().hv0();
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJII(LJJIFFI, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        hv0.observe(LJJIFFI, this.LJLLILLLL);
        if (o.LJ(P().hv0().getValue(), Boolean.TRUE)) {
            U();
            X();
            V();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        P().hv0().removeObserver(this.LJLLILLLL);
    }

    public final boolean Q(User user) {
        List<MutualUser> list;
        String recommendReason;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
            if (mMutualStruct != null) {
                list = mMutualStruct.getUserList();
            } else {
                list = null;
            }
            if ((list != null && !list.isEmpty()) || ((recommendReason = matchedFriendStruct.getRecommendReason()) != null && recommendReason.length() != 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean T(EnumC57365MfJ enumC57365MfJ) {
        String str;
        C181677Bb item = getItem();
        int i = 0;
        if (item == null || !Q(item.LJLIL)) {
            return false;
        }
        item.LJLIL.getMatchedFriendStruct();
        if (C54838Lfe.LJIIZILJ(item.LJLILLLLZI.LIZIZ)) {
            str = "story";
        } else {
            str = "post";
        }
        int LJI = C222578oP.LJI(item.LJLILLLLZI.LIZIZ);
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(item.LJLILLLLZI.LIZJ);
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        C1806377b c1806377b = item.LJLILLLLZI;
        String str2 = c1806377b.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        c57362MfG.LJJLIIIJJI = str2;
        c57362MfG.LJJJJZI = str;
        c57362MfG.LJJJLL = LJI;
        Aweme aweme = c1806377b.LIZIZ;
        if (aweme != null && aweme.getIsStoryToNormal()) {
            i = 1;
        }
        c57362MfG.LJJJLZIJ = i;
        c57362MfG.LJJJJIZL(item.LJLIL);
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJJ("video_views");
        Object LJII = c220488l2.LJII(item.LJLILLLLZI.LIZIZ, c57362MfG);
        C222578oP.LIZJ(LJII, item.LJLILLLLZI.LIZIZ, null, null, 14);
        ((JHM) LJII).LJIILIIL();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0234  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C181677Bb r10) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.adapter.VideoViewerCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.q_, viewGroup, false, "from(parent.context).inf…item_like, parent, false)");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onResume(boolean z) {
        super.onResume(z);
        if (o.LJ(P().hv0().getValue(), Boolean.TRUE)) {
            V();
        }
    }
}
