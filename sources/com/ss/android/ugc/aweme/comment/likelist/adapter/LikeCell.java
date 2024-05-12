package com.ss.android.ugc.aweme.comment.likelist.adapter;

import X.AbstractC13940gg;
import X.ActivityC45651qj;
import X.AnonymousClass795;
import X.C12460eI;
import X.C181667Ba;
import X.C1DI;
import X.C220488l2;
import X.C221108m2;
import X.C222578oP;
import X.C45804HyK;
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
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
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
public final class LikeCell extends PowerCell<C181667Ba> {
    public User LJLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 130));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 122));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 128));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 121));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 123));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 126));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 125));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 129));
    public String LJLJLLL = "";
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 127));
    public final AObserverS71S0100000_3 LJLLILLLL = new AObserverS71S0100000_3(this, 9);

    public final C58049MqL M() {
        return (C58049MqL) this.LJLJJLL.getValue();
    }

    public final TuxTextView N() {
        return (TuxTextView) this.LJLJLJ.getValue();
    }

    public final LikeListVM P() {
        return (LikeListVM) this.LJLIL.getValue();
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
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell.L():void");
    }

    public final void U() {
        User user;
        C181667Ba item = getItem();
        if (item == null || (user = item.LJLIL) == null || ((Set) P().LJLJLLL.getValue()).contains(user.getUid()) || !T(EnumC57365MfJ.SHOW)) {
            return;
        }
        Set set = (Set) P().LJLJLLL.getValue();
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        set.add(uid);
    }

    public final void V() {
        User user;
        if (!C7ZI.LIZIZ()) {
            return;
        }
        C181667Ba item = getItem();
        ActivityStatus activityStatus = null;
        if (item != null) {
            user = item.LJLIL;
        } else {
            user = null;
        }
        C181667Ba item2 = getItem();
        if (item2 != null) {
            activityStatus = item2.LJLJJI;
        }
        C78946Uyc.LJJIJIL(this, user, activityStatus, EnumC112364b2.LIKE_LIST);
    }

    public final void X() {
        User user;
        ActivityStatus activityStatus;
        String str;
        AnonymousClass795 anonymousClass795;
        C181667Ba item = getItem();
        if (item == null || (user = item.LJLIL) == null || ((Set) P().LJLLI.getValue()).contains(user.getUid()) || !C7ZI.LIZJ() || user.getFollowStatus() != EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
            return;
        }
        ((Set) P().LJLLI.getValue()).add(user.getUid());
        InterfaceC112734bd imNudgeAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics();
        C181667Ba item2 = getItem();
        if (item2 != null) {
            activityStatus = item2.LJLJJI;
        } else {
            activityStatus = null;
        }
        String LIZIZ = imNudgeAnalytics.LIZIZ(activityStatus);
        InterfaceC112734bd imNudgeAnalytics2 = IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics();
        C181667Ba item3 = getItem();
        if (item3 == null || (anonymousClass795 = item3.LJLILLLLZI) == null || (str = anonymousClass795.LIZJ) == null) {
            str = "";
        }
        imNudgeAnalytics2.LIZJ(str, EnumC112374b3.LIKE_LIST.getValue(), EnumC112754bf.SHOW.getValue(), LIZIZ, user.getUid());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new AbstractC13940gg(this) { // from class: X.7Ch
            public InterfaceC65784Pro<String> LJ;
            public final C181987Cg LJFF;

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                return this.LJFF;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.7Cg] */
            {
                this.LJ = new AqS153S0100000_3(this, 124);
                this.LJFF = new InterfaceC19530ph() { // from class: X.7Cg
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        LikeCell likeCell;
                        C181667Ba item;
                        User user;
                        C181667Ba item2;
                        List<String> list;
                        int size;
                        o.LJIIIZ(itemID, "itemID");
                        if (!C7ZT.LIZIZ() || (item = (likeCell = LikeCell.this).getItem()) == null || (user = item.LJLIL) == null || (item2 = likeCell.getItem()) == null || (list = item2.LJLJJL) == null || (size = list.size()) < 1 || likeCell.N().getVisibility() != 0) {
                            return;
                        }
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", "like_list");
                        c188727au.LIZLLL(size, "unread_num");
                        c188727au.LJIIIZ("to_user_id", user.getUid());
                        c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(user));
                        FMX.LJIIL("unread_post_show", c188727au.LIZ);
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJ = interfaceC65784Pro;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        NextLiveData<Boolean> kv0 = P().kv0();
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJII(LJJIFFI, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        kv0.observe(LJJIFFI, this.LJLLILLLL);
        if (o.LJ(P().kv0().getValue(), Boolean.TRUE)) {
            U();
            X();
            V();
        }
        C181667Ba item = getItem();
        if (item != null && item.LJLJI) {
            this.itemView.postDelayed(new ARunnableS39S0100000_3(this, 152), 150L);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        P().kv0().removeObserver(this.LJLLILLLL);
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
        C181667Ba item = getItem();
        if (item == null || !Q(item.LJLIL)) {
            return false;
        }
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(item.LJLILLLLZI.LIZJ);
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        String str = item.LJLILLLLZI.LIZ;
        if (str == null) {
            str = "";
        }
        c57362MfG.LJJLIIIJJI = str;
        c57362MfG.LJJJJIZL(item.LJLIL);
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJJ("like_list");
        Object LJII = c220488l2.LJII(item.LJLILLLLZI.LIZIZ, c57362MfG);
        C222578oP.LIZJ(LJII, item.LJLILLLLZI.LIZIZ, null, null, 14);
        ((JHM) LJII).LJIILIIL();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L37;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C181667Ba r9) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.q_, viewGroup, false, "from(parent.context).inf…item_like, parent, false)");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onResume(boolean z) {
        super.onResume(z);
        if (o.LJ(P().kv0().getValue(), Boolean.TRUE)) {
            V();
        }
    }
}
