package com.ss.android.ugc.aweme.friendstab.ability;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C175046tw;
import X.C35906E7i;
import X.C42625Go9;
import X.C45804HyK;
import X.C47261Igj;
import X.C52236Kem;
import X.C53976LGi;
import X.EnumC57435MgR;
import X.LLE;
import X.LLQ;
import X.LNZ;
import X.MS5;
import X.ORZ;
import X.QD3;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public abstract class BaseBottomTabAvatarAbility implements GenericLifecycleObserver, IBottomFriendsTabAvatarAbility, LLE, Observer<RelationStatus> {
    public final Context LJLIL;
    public boolean LJLILLLLZI;
    public SocialFeedRedDotResponse LJLJI;
    public boolean LJLJJI;

    public abstract String LIZIZ();

    public abstract void LJ(ArrayList<String> arrayList);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onAppBackground();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        ArrayList<UserNewContent> avatarList;
        UserNewContent userNewContent;
        IBottomTabLayoutAbility LJIIIIZZ;
        LLQ Pp;
        UrlModel avatarThumb;
        SocialFeedRedDotResponse socialFeedRedDotResponse = this.LJLJI;
        if (socialFeedRedDotResponse == null || (avatarList = socialFeedRedDotResponse.getAvatarList()) == null || (userNewContent = (UserNewContent) ORZ.LJLLLL(avatarList)) == null) {
            remove();
            this.LJLJI = null;
            this.LJLJJI = false;
            return;
        }
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL == null || (LJIIIIZZ = C53976LGi.LJIIIIZZ(LIZLLL)) == null || (Pp = LJIIIIZZ.Pp()) == null || (avatarThumb = userNewContent.getUser().getAvatarThumb()) == null) {
            return;
        }
        Pp.LIZIZ(LIZIZ(), avatarThumb);
    }

    public final boolean LIZJ() {
        ActivityC45651qj activityC45651qj;
        Context context = this.LJLIL;
        if (context != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        return o.LJ(C116694i1.LIZ(activityC45651qj).nv0(), LIZIZ());
    }

    public final LLQ Pp() {
        ActivityC45651qj LJJIFFI;
        LNZ lnz = LNZ.LIZIZ;
        Context context = this.LJLIL;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            return lnz.getHomeTabViewModel(LJJIFFI).Xm0();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void dh() {
        LLQ Pp;
        if (isShowing() && (Pp = Pp()) != null) {
            Pp.LJJIFFI(LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final boolean isShowing() {
        LLQ Pp;
        View LJIIJ;
        View findViewById;
        View LJIIJ2;
        LLQ Pp2 = Pp();
        View view = null;
        if (Pp2 != null && (LJIIJ2 = Pp2.LJIIJ(LIZIZ())) != null) {
            view = LJIIJ2.findViewById(R.id.f80);
        }
        if (view == null || (Pp = Pp()) == null || (LJIIJ = Pp.LJIIJ(LIZIZ())) == null || (findViewById = LJIIJ.findViewById(R.id.f80)) == null || findViewById.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onAppBackground() {
        if (C35906E7i.LIZ() && isShowing()) {
            remove();
            this.LJLJI = null;
            this.LJLJJI = true;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (C52236Kem.LIZ()) {
            C42625Go9.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void remove() {
        LLQ Pp = Pp();
        if (Pp != null) {
            Pp.LJJIJL(LIZIZ());
        }
        LLQ Pp2 = Pp();
        if (Pp2 != null) {
            Pp2.LJJIFFI(LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void sA() {
        String str;
        ArrayList<UserNewContent> avatarList;
        UserNewContent userNewContent;
        if (isShowing() && C35906E7i.LIZ()) {
            SocialFeedRedDotResponse socialFeedRedDotResponse = this.LJLJI;
            if (socialFeedRedDotResponse == null || (avatarList = socialFeedRedDotResponse.getAvatarList()) == null || (userNewContent = (UserNewContent) ORZ.LJLLLLLL(0, avatarList)) == null || (str = userNewContent.getItemId()) == null) {
                str = "";
            }
            LJ(C47261Igj.LJII(str));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void unRegister() {
        C42625Go9.LIZJ(this);
    }

    public BaseBottomTabAvatarAbility(Context context) {
        ActivityC45651qj activityC45651qj;
        this.LJLIL = context;
        C42625Go9.LIZIZ(this);
        if (context != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        C116694i1.LIZ(activityC45651qj).hv0(this);
    }

    public final void LIZLLL(String str) {
        ArrayList<UserNewContent> avatarList;
        Iterator<UserNewContent> it;
        if (!isShowing()) {
            return;
        }
        SocialFeedRedDotResponse socialFeedRedDotResponse = this.LJLJI;
        if (socialFeedRedDotResponse != null && (avatarList = socialFeedRedDotResponse.getAvatarList()) != null && (it = avatarList.iterator()) != null) {
            while (it.hasNext()) {
                UserNewContent next = it.next();
                o.LJIIIIZZ(next, "iterator.next()");
                if (o.LJ(next.getUser().getUid(), str)) {
                    it.remove();
                }
            }
        }
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void Px(Aweme aweme) {
        SocialFeedRedDotResponse socialFeedRedDotResponse;
        ArrayList<UserNewContent> avatarList;
        ArrayList<UserNewContent> avatarList2;
        o.LJIIIZ(aweme, "aweme");
        if (isShowing() && (socialFeedRedDotResponse = this.LJLJI) != null && (avatarList = socialFeedRedDotResponse.getAvatarList()) != null) {
            Iterator<UserNewContent> it = avatarList.iterator();
            int i = 0;
            while (it.hasNext()) {
                UserNewContent next = it.next();
                if (o.LJ(aweme.getAid(), next.getItemId()) && o.LJ(aweme.getAuthorUid(), next.getUser().getUid())) {
                    if (i == -1) {
                        return;
                    }
                    SocialFeedRedDotResponse socialFeedRedDotResponse2 = this.LJLJI;
                    if (socialFeedRedDotResponse2 != null && (avatarList2 = socialFeedRedDotResponse2.getAvatarList()) != null) {
                        ListProtector.remove(avatarList2, i);
                    }
                    LIZ();
                    return;
                }
                i++;
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockUser(C175046tw c175046tw) {
        User user;
        String uid;
        if (!LIZJ() && C35906E7i.LIZ() && c175046tw != null && (user = c175046tw.LJLIL) != null && (uid = user.getUid()) != null) {
            LIZLLL(uid);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(RelationStatus relationStatus) {
        RelationStatus relationStatus2 = relationStatus;
        if (LIZJ() || !C35906E7i.LIZ() || relationStatus2 == null || relationStatus2.getFollowStatus() != EnumC57435MgR.UNFOLLOW.getValue()) {
            return;
        }
        LIZLLL(relationStatus2.getUid());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility
    public final void hf0(SocialFeedRedDotResponse response, UrlModel urlModel) {
        o.LJIIIZ(response, "response");
        if (!C35906E7i.LIZ() || this.LJLJJI) {
            return;
        }
        LLQ Pp = Pp();
        if (Pp != null) {
            Pp.LIZIZ(LIZIZ(), urlModel);
        }
        this.LJLJI = response;
        if (this.LJLILLLLZI) {
            return;
        }
        MS5.LJ(new AqS159S0100000_9(this, 246));
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        if (o.LJ(str, LIZIZ())) {
            this.LJLJI = null;
            this.LJLJJI = false;
        }
    }
}
