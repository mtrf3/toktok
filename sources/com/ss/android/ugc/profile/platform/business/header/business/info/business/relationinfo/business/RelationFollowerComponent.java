package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business;

import X.AV1;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C018905p;
import X.C07290Qj;
import X.C110614Vt;
import X.C2068389v;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C234999Kd;
import X.C235229La;
import X.C235239Lb;
import X.C26338AVi;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C72972SkS;
import X.C77123UOp;
import X.C78926UyI;
import X.C79045V0n;
import X.C7MY;
import X.C8VC;
import X.C8YN;
import X.C9LZ;
import X.C9NP;
import X.C9NR;
import X.HG3;
import X.InterfaceC235069Kk;
import X.J9P;
import X.KNV;
import X.O6R;
import X.RBX;
import X.TBT;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.experiment.NewFollowerNotificationSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationVM;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.addfriends.ICTAAddFriendsAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS6S1210000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RelationFollowerComponent extends RelationInfoBaseUIComponent<RelationData> implements INotifyAbility {
    public final C214298b3 LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        if (L7()) {
            if (((Boolean) C9NR.LIZJ.getValue()).booleanValue() || C9NP.LIZJ()) {
                C235239Lb.LIZ().LIZ.storeInt("unclick_times_threshold", 50);
            } else {
                C235229La LIZ = C235239Lb.LIZ();
                LIZ.LIZ.storeInt("unclick_times_threshold", NewFollowerNotificationSetting.LIZ().unclickTimesThreshold);
            }
            C235229La LIZ2 = C235239Lb.LIZ();
            LIZ2.LIZ.storeInt("without_notice_days_threshold", NewFollowerNotificationSetting.LIZ().withoutNoticeDaysThreshold);
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, INotifyAbility.class, null);
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            C8YN.LJII(this, profilePlatformVM, new TBT() { // from class: X.9JY
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PM) obj).LJLILLLLZI;
                }
            }, null, new AqS186S0100000_4(this, 228), 6);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        boolean z;
        String str;
        if (C6ZT.LIZ(this.componentView)) {
            return;
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            z = profilePlatformVM.LJLJJL;
        } else {
            z = false;
        }
        if (z) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(LIZ, "personal_homepage", "follower_list", null, null);
        } else {
            withState((AssemViewModel) this.LJLJJI.getValue(), new AqS6S1210000_4(LIZ, this, z, str, 0));
        }
    }

    public RelationFollowerComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileRelationVM.class);
        this.LJLJJI = new C214298b3(new AqS154S0100000_4(LIZ, 950), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C9LZ.INSTANCE, LIZ);
        this.LJLJL = -1;
    }

    public final String E3() {
        Integer newFollowerCount;
        Integer num;
        T t = this.LJLILLLLZI;
        if (t != 0 && ((newFollowerCount = t.getNewFollowerCount()) == null || newFollowerCount.intValue() != 0)) {
            T t2 = this.LJLILLLLZI;
            if (t2 != 0) {
                num = t2.getNewFollowerCount();
            } else {
                num = null;
            }
            return String.valueOf(num);
        }
        return "";
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsBeforeUpdateUI() {
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        v3((TuxTextView) view.findViewById(R.id.i76));
        Se();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x018c, code lost:
    
        if (r5.intValue() != r1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
    
        if (r1 != r0.intValue()) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
    
        if (r1 != r0.intValue()) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateComponentUIAndData() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.RelationFollowerComponent.updateComponentUIAndData():void");
    }

    public final boolean F3() {
        boolean z;
        boolean z2;
        boolean LIZIZ;
        UserAccountInfo userAccountInfo;
        Integer followerCount;
        boolean z3;
        boolean z4;
        Integer friendCount;
        UserAccountInfo userAccountInfo2;
        Integer followerCount2;
        boolean z5 = false;
        if (!L7()) {
            return false;
        }
        if (C9NP.LIZIZ() || C9NP.LIZJ()) {
            T t = this.LJLILLLLZI;
            if (t == 0 || (followerCount = t.getFollowerCount()) == null || followerCount.intValue() < 1000) {
                z = true;
            } else {
                z = false;
            }
            ProfileCommonInfo commonInfo = getCommonInfo();
            if (commonInfo != null && (userAccountInfo = commonInfo.getUserAccountInfo()) != null) {
                z5 = o.LJ(userAccountInfo.isSecret(), Boolean.TRUE);
            }
            z2 = z & (!z5);
            LIZIZ = C235239Lb.LIZ().LIZIZ();
        } else {
            T t2 = this.LJLILLLLZI;
            if (t2 == 0 || (followerCount2 = t2.getFollowerCount()) == null || followerCount2.intValue() < 1000) {
                z3 = true;
            } else {
                z3 = false;
            }
            ProfileCommonInfo commonInfo2 = getCommonInfo();
            if (commonInfo2 != null && (userAccountInfo2 = commonInfo2.getUserAccountInfo()) != null) {
                z4 = o.LJ(userAccountInfo2.isSecret(), Boolean.TRUE);
            } else {
                z4 = false;
            }
            boolean z6 = z3 & (!z4);
            T t3 = this.LJLILLLLZI;
            if (t3 == 0 || (friendCount = t3.getFriendCount()) == null || friendCount.intValue() <= 60) {
                z5 = true;
            }
            z2 = z6 & z5;
            LIZIZ = C235239Lb.LIZ().LIZIZ();
        }
        return z2 & LIZIZ;
    }

    public final boolean L7() {
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            return profilePlatformVM.LJLJJL;
        }
        return false;
    }

    public final void Se() {
        if (!UserProfilePreloadHelper.LJIIIIZZ().LIZIZ()) {
            return;
        }
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        TextView textView = (TextView) view.findViewById(R.id.i76);
        if (textView == null) {
            return;
        }
        textView.setText("-");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        int i;
        TuxIconView tuxIconView;
        int i2;
        Context context = getContext();
        TuxTextView tuxTextView3 = null;
        if (context == null) {
            return null;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(C7MY.LIZIZ(92), -2));
        Context context2 = getContext();
        int i3 = 0;
        if (context2 != null) {
            tuxTextView = new TuxTextView(context2, null, 6, 0);
        } else {
            tuxTextView = null;
        }
        C018905p c018905p = new C018905p(-2, -2);
        c018905p.endToEnd = 0;
        c018905p.startToStart = 0;
        c018905p.topToTop = 0;
        if (tuxTextView != null) {
            tuxTextView.setGravity(17);
            tuxTextView.setMaxLines(1);
            Context context3 = tuxTextView.getContext();
            o.LJIIIIZZ(context3, "context");
            Integer LJI = C79045V0n.LJI(R.attr.go, context3);
            if (LJI != null) {
                i2 = LJI.intValue();
            } else {
                i2 = 0;
            }
            tuxTextView.setTextColor(i2);
            tuxTextView.setTuxFont(33);
            tuxTextView.setId(R.id.i76);
            tuxTextView.setLayoutParams(c018905p);
        }
        Context context4 = getContext();
        if (context4 != null) {
            tuxTextView2 = new TuxTextView(context4, null, 6, 0);
        } else {
            tuxTextView2 = null;
        }
        C018905p c018905p2 = new C018905p(-1, -2);
        c018905p2.leftToLeft = 0;
        c018905p2.topToBottom = R.id.i76;
        if (tuxTextView2 != null) {
            tuxTextView2.setLayoutParams(c018905p2);
            Integer LIZJ = C72972SkS.LIZJ(tuxTextView2, "context", R.attr.gv);
            if (LIZJ != null) {
                i = LIZJ.intValue();
            } else {
                i = 0;
            }
            tuxTextView2.setTextColor(i);
            C26338AVi.LJI(tuxTextView2, 0, KNV.LIZIZ(2.5d), 0, 0, false, 16);
            tuxTextView2.setGravity(17);
            tuxTextView2.setTuxFont(61);
            tuxTextView2.setId(R.id.i77);
        }
        if (L7()) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            C018905p c018905p3 = new C018905p(-2, -2);
            c018905p3.bottomToBottom = R.id.i76;
            c018905p3.startToEnd = R.id.i76;
            linearLayout.setLayoutParams(c018905p3);
            linearLayout.setGravity(1);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)), 0);
            C26338AVi.LJI(linearLayout, 0, 0, 0, AnonymousClass391.LIZJ(16), false, 16);
            linearLayout.setId(R.id.i9g);
            Context context5 = getContext();
            if (context5 != null) {
                tuxIconView = new TuxIconView(context5, null, 0, 6, null);
            } else {
                tuxIconView = null;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            if (tuxIconView != null) {
                tuxIconView.setLayoutParams(layoutParams);
            }
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_plus_small;
            c2068389v.LJ = Integer.valueOf(R.attr.eb);
            if (tuxIconView != null) {
                tuxIconView.setTuxIcon(c2068389v);
                tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
                tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
            }
            Context context6 = getContext();
            if (context6 != null) {
                tuxTextView3 = new TuxTextView(context6, null, 6, 0);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            if (tuxTextView3 != null) {
                tuxTextView3.setLayoutParams(layoutParams2);
                Integer LIZJ2 = C72972SkS.LIZJ(tuxTextView3, "context", R.attr.eb);
                if (LIZJ2 != null) {
                    i3 = LIZJ2.intValue();
                }
                tuxTextView3.setTextColor(i3);
                tuxTextView3.setTuxFont(62);
                tuxTextView3.setId(R.id.i9f);
            }
            linearLayout.addView(tuxIconView);
            linearLayout.addView(tuxTextView3);
            constraintLayout.addView(linearLayout);
        }
        constraintLayout.addView(tuxTextView);
        constraintLayout.addView(tuxTextView2);
        return constraintLayout;
    }

    public final void C3(boolean z) {
        boolean z2;
        int i;
        Integer followerCount;
        Integer newFollowerCount;
        T t;
        T t2;
        int i2;
        int i3;
        long j;
        Integer newFollowerCount2;
        Integer newFollowerCount3;
        Integer followerCount2;
        Integer newFollowerCount4;
        UserAccountInfo userAccountInfo;
        if (this.LJLILLLLZI == 0) {
            H3(0);
            return;
        }
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo != null && (userAccountInfo = commonInfo.getUserAccountInfo()) != null) {
            z2 = o.LJ(userAccountInfo.isSecret(), Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (z2 && L7()) {
            C235239Lb.LIZ().LIZ.storeInt("unclick_times", 0);
        }
        Drawable drawable = null;
        if (F3() && !this.LJLJJL && (t = this.LJLILLLLZI) != 0 && t.getNewFollowerCount() != null && ((t2 = this.LJLILLLLZI) == 0 || (newFollowerCount4 = t2.getNewFollowerCount()) == null || newFollowerCount4.intValue() != 0)) {
            T t3 = this.LJLILLLLZI;
            if (t3 != 0 && (followerCount2 = t3.getFollowerCount()) != null) {
                i2 = followerCount2.intValue();
            } else {
                i2 = 0;
            }
            T t4 = this.LJLILLLLZI;
            if (t4 != 0 && (newFollowerCount3 = t4.getNewFollowerCount()) != null) {
                i3 = newFollowerCount3.intValue();
            } else {
                i3 = 0;
            }
            H3(i2 - i3);
            if (!L7()) {
                return;
            }
            T t5 = this.LJLILLLLZI;
            long j2 = 0;
            if (t5 != 0 && (newFollowerCount2 = t5.getNewFollowerCount()) != null) {
                j = newFollowerCount2.intValue();
            } else {
                j = 0;
            }
            long I3 = I3(j);
            if (I3 >= 0) {
                j2 = 99;
                if (I3 <= 99) {
                    j2 = I3;
                }
            }
            View view = this.componentView;
            o.LJII(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            View findViewById = view.findViewById(R.id.i9g);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                Context context = getContext();
                if (context != null) {
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZ = Integer.valueOf(C07290Qj.LJIIL(AnonymousClass636.LJIIIIZZ(R.attr.e2, context), 30));
                    c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(Double.valueOf(7.5d)));
                    c110614Vt.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(Double.valueOf(7.5d)));
                    c110614Vt.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(Double.valueOf(7.5d)));
                    c110614Vt.LJIIJ = Float.valueOf(C32151Nz.LJIIZILJ(Double.valueOf(1.5d)));
                    drawable = c110614Vt.LIZ(context);
                }
                findViewById.setBackground(drawable);
            }
            View view2 = this.componentView;
            o.LJII(view2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            TextView textView = (TextView) view2.findViewById(R.id.i9f);
            if (textView == null) {
                return;
            }
            textView.setText(C77123UOp.LJJIIJ(j2));
            return;
        }
        if (L7()) {
            View view3 = this.componentView;
            o.LJII(view3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            View findViewById2 = view3.findViewById(R.id.i9g);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        if (z) {
            H3(this.LJLJLJ);
        } else {
            T t6 = this.LJLILLLLZI;
            if (t6 != 0 && (followerCount = t6.getFollowerCount()) != null) {
                i = followerCount.intValue();
            } else {
                i = -1;
            }
            H3(i);
        }
        T t7 = this.LJLILLLLZI;
        if (t7 != 0 && (newFollowerCount = t7.getNewFollowerCount()) != null && newFollowerCount.intValue() == 0) {
            C235239Lb.LIZ().LIZ.storeInt("unclick_times", 0);
        }
        this.LJLJJL = false;
        if (this.LJLJJLL) {
            return;
        }
        ICTAAddFriendsAbility iCTAAddFriendsAbility = (ICTAAddFriendsAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ICTAAddFriendsAbility.class, null);
        if (iCTAAddFriendsAbility != null) {
            iCTAAddFriendsAbility.nK();
        }
        this.LJLJJLL = true;
    }

    public final void H3(int i) {
        long I3 = I3(i);
        if (I3 == -1) {
            Se();
            return;
        }
        if (I3 < 0) {
            I3 = 0;
        }
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        TextView textView = (TextView) view.findViewById(R.id.i76);
        if (textView == null) {
            return;
        }
        textView.setText(C77123UOp.LJJIIJ(I3));
    }

    public final long I3(long j) {
        User user;
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
        } else {
            user = null;
        }
        if (AV1.LJIJ(user) && AV1.LJIIJJI()) {
            return 0L;
        }
        return j;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.INotifyAbility
    public final void Si(boolean z) {
        this.LJLJJL = z;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        m mVar = profileComponents.bizData;
        if (mVar == null) {
            Se();
        } else {
            parseComponentBizData(mVar);
            updateComponentUIAndData();
        }
    }
}
