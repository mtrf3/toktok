package com.ss.android.ugc.aweme.profile.widgets.relations;

import X.AV1;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C212428Vi;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234999Kd;
import X.C235079Kl;
import X.C235239Lb;
import X.C235279Lf;
import X.C235299Lh;
import X.C235309Li;
import X.C235439Lv;
import X.C235469Ly;
import X.C47704Ins;
import X.C55749LuL;
import X.C58084Mqu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C77123UOp;
import X.C77266UUc;
import X.C78926UyI;
import X.C78983UzD;
import X.C79045V0n;
import X.C8VC;
import X.C9AC;
import X.C9AE;
import X.C9ID;
import X.C9JQ;
import X.C9KV;
import X.C9NP;
import X.C9NR;
import X.EnumC57435MgR;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC57508Mhc;
import X.InterfaceC65784Pro;
import X.J9P;
import X.T5S;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.AObserverS72S0100000_4;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.experiment.NewFollowerNotificationSetting;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.ProfileMafRedPointsVM;
import com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationsAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileRelationsAssem extends UIContentAssem implements InterfaceC57508Mhc {
    public static final C235309Li LLF = new Object() { // from class: X.9Li
    };
    public final C214298b3 LJLILLLLZI;
    public View LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public ViewGroup LJLJL;
    public TextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public ViewGroup LJLL;
    public ViewGroup LJLLI;
    public LinearLayout LJLLILLLL;
    public TuxIconView LJLLJ;
    public TuxTextView LJLLL;
    public LinearLayout LJLLLL;
    public TuxIconView LJLLLLLL;
    public TuxTextView LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public int LJZL;
    public int LL;
    public Map<Integer, View> LLD = new LinkedHashMap();
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());

    public static /* synthetic */ void N3() {
    }

    public void _$_clearFindViewByIdCache() {
        this.LLD.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLD;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC57508Mhc, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public ProfileRelationsAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileRelationVM.class);
        this.LJLILLLLZI = new C214298b3(new AqS154S0100000_4(LIZ, 752), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C9JQ.INSTANCE, LIZ);
        this.LJZI = true;
        this.LJZL = EnumC57435MgR.NONE.getValue();
    }

    private final void C3() {
        T5S t5s = new T5S();
        t5s.LIZ(23);
        Typeface typeface = t5s.getTypeface();
        if (typeface == null) {
            return;
        }
        A3(this.LJLJJI, typeface);
        A3(this.LJLJJL, typeface);
        A3(this.LJLJLLL, typeface);
    }

    private final C9ID P3() {
        return (C9ID) this.LJLIL.getValue();
    }

    private final void Y3() {
        LinearLayout linearLayout = this.LJLLILLLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.LJLLLL;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    private final void l4() {
        final float f;
        Float LJIIIZ;
        ViewGroup viewGroup = this.LJLLI;
        C9AC c9ac = C9AC.ALPHA;
        C9AE.LIZ(viewGroup, c9ac, 0.0f);
        Context context = getContext();
        if (context != null && (LJIIIZ = C79045V0n.LJIIIZ(context)) != null) {
            f = LJIIIZ.floatValue();
        } else {
            f = 0.2f;
        }
        ViewGroup viewGroup2 = this.LJLL;
        if (viewGroup2 != null) {
            viewGroup2.setOnTouchListener(new View.OnTouchListener() { // from class: X.9Ld
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator duration;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator duration2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator duration3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator duration4;
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1 && action != 3) {
                            return false;
                        }
                        TuxTextView tuxTextView = ProfileRelationsAssem.this.LJLJJL;
                        if (tuxTextView != null && (animate4 = tuxTextView.animate()) != null && (alpha4 = animate4.alpha(1.0f)) != null && (duration4 = alpha4.setDuration(0L)) != null) {
                            duration4.start();
                        }
                        TuxTextView tuxTextView2 = ProfileRelationsAssem.this.LJLJJLL;
                        if (tuxTextView2 == null || (animate3 = tuxTextView2.animate()) == null || (alpha3 = animate3.alpha(1.0f)) == null || (duration3 = alpha3.setDuration(0L)) == null) {
                            return false;
                        }
                        duration3.start();
                        return false;
                    }
                    TuxTextView tuxTextView3 = ProfileRelationsAssem.this.LJLJJL;
                    if (tuxTextView3 != null && (animate2 = tuxTextView3.animate()) != null && (alpha2 = animate2.alpha(f)) != null && (duration2 = alpha2.setDuration(0L)) != null) {
                        duration2.start();
                    }
                    TuxTextView tuxTextView4 = ProfileRelationsAssem.this.LJLJJLL;
                    if (tuxTextView4 == null || (animate = tuxTextView4.animate()) == null || (alpha = animate.alpha(f)) == null || (duration = alpha.setDuration(0L)) == null) {
                        return false;
                    }
                    duration.start();
                    return false;
                }
            });
        }
        C9AE.LIZ(this.LJLJL, c9ac, 0.0f);
    }

    public final ProfileRelationVM Q3() {
        return (ProfileRelationVM) this.LJLILLLLZI.getValue();
    }

    public final boolean L7() {
        C9ID P3 = P3();
        if (P3 != null) {
            return P3.LJLJI;
        }
        return false;
    }

    @Override // X.InterfaceC57508Mhc
    public void Se() {
        if (!UserProfilePreloadHelper.LJIIIIZZ().LIZIZ()) {
            return;
        }
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setText("-");
        }
        TuxTextView tuxTextView2 = this.LJLJJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("-");
        }
        TuxTextView tuxTextView3 = this.LJLJLLL;
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setText("-");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        C77266UUc.LIZIZ.getRelationService().LJFF().observe(this, new AObserverS72S0100000_4(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r7 > 99) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L3(com.ss.android.ugc.aweme.profile.model.User r10) {
        /*
            r9 = this;
            int r0 = r10.getNewFollowerCount()
            long r0 = (long) r0
            long r7 = r9.k4(r0)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L87
        Lf:
            r7 = r1
        L10:
            android.widget.LinearLayout r1 = r9.LJLLLL
            if (r1 != 0) goto L82
        L14:
            android.widget.LinearLayout r3 = r9.LJLLLL
            if (r3 != 0) goto L25
        L18:
            com.bytedance.tux.input.TuxTextView r1 = r9.LJLZ
            if (r1 != 0) goto L1d
        L1c:
            return
        L1d:
            java.lang.String r0 = X.C77123UOp.LJJIIJ(r7)
            r1.setText(r0)
            goto L1c
        L25:
            android.content.Context r4 = r9.getContext()
            if (r4 == 0) goto L80
            X.4Vt r2 = new X.4Vt
            r2.<init>()
            java.lang.String r0 = "#FFEAEE"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LIZ = r0
            r5 = 4620130267728707584(0x401e000000000000, double:7.5)
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.LJIIIIZZ = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.LJIIIZ = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.LJIIJJI = r0
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.LJIIJ = r0
            android.graphics.drawable.Drawable r0 = r2.LIZ(r4)
        L7c:
            r3.setBackground(r0)
            goto L18
        L80:
            r0 = 0
            goto L7c
        L82:
            r0 = 0
            r1.setVisibility(r0)
            goto L14
        L87:
            r1 = 99
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L10
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationsAssem.L3(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    private final void Z3(View view) {
        LinearLayout linearLayout;
        TuxIconView tuxIconView;
        if (((Boolean) C9NR.LIZJ.getValue()).booleanValue() || C9NP.LIZJ()) {
            C235239Lb.LIZ().LIZ.storeInt("unclick_times_threshold", 50);
        } else {
            C235239Lb.LIZ().LIZ.storeInt("unclick_times_threshold", NewFollowerNotificationSetting.LIZ().unclickTimesThreshold);
        }
        C235239Lb.LIZ().LIZ.storeInt("without_notice_days_threshold", NewFollowerNotificationSetting.LIZ().withoutNoticeDaysThreshold);
        TuxTextView tuxTextView = null;
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(R.id.n1k);
        } else {
            linearLayout = null;
        }
        this.LJLLLL = linearLayout;
        if (view != null) {
            tuxIconView = (TuxIconView) view.findViewById(R.id.n1j);
        } else {
            tuxIconView = null;
        }
        this.LJLLLLLL = tuxIconView;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.n1i);
        }
        this.LJLZ = tuxTextView;
    }

    private final void g4(int i) {
        long k4 = k4(i);
        if (k4 == -1) {
            Se();
            return;
        }
        if (k4 < 0) {
            k4 = 0;
        }
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(C77123UOp.LJJIIJ(k4));
    }

    private final long k4(long j) {
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

    private final void v3(User user) {
        InterfaceC65784Pro LJIILJJIL;
        if (this.LJZI) {
            return;
        }
        if (user != null && C78983UzD.LJJJJJ(user)) {
            C235299Lh c235299Lh = C235299Lh.LJLIL;
            C65776Prg LIZ = C65352Pkq.LIZ(ProfileMafRedPointsVM.class);
            C235279Lf c235279Lf = C235279Lf.INSTANCE;
            if (C214368bA.LJIIIIZZ) {
                LJIILJJIL = new AqS154S0100000_4(this, 751);
            } else {
                LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
            }
            C214378bB c214378bB = new C214378bB(LIZ, c235299Lh, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c235279Lf, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
            o.LJIIIZ(user, "user");
            x3(c214378bB).gv0(C235469Ly.LIZIZ(user.mafRedCount));
        }
        this.LJZI = true;
    }

    public static final ProfileMafRedPointsVM x3(C214378bB<C235439Lv, ProfileMafRedPointsVM> c214378bB) {
        return (ProfileMafRedPointsVM) c214378bB.getValue();
    }

    public final void E3(User user) {
        I3(this, user, false, 2, null);
        this.LL = user.getFollowerCount();
    }

    public final void F3(User user) {
        int i;
        String str;
        Resources resources;
        if (user != null) {
            i = user.getFollowerCount() - user.getNewFollowerCount();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = 1;
        }
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            str = resources.getQuantityString(R.plurals.qv, i);
        } else {
            str = null;
        }
        TuxTextView tuxTextView = this.LJLJJLL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void K3(int i) {
        long k4 = k4(i);
        if (k4 == -1) {
            Se();
            return;
        }
        if (k4 < 0) {
            k4 = 0;
        }
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(C77123UOp.LJJIIJ(k4));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M3(long r6) {
        /*
            r5 = this;
            long r3 = r5.k4(r6)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            r5.Se()
            return
        Le:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r3 = 0
        L16:
            android.widget.TextView r1 = r5.LJLJLJ
            if (r1 == 0) goto L20
            r0 = 2131832989(0x7f11309d, float:1.9299047E38)
            r1.setText(r0)
        L20:
            java.lang.String r1 = X.C77123UOp.LJJIIJ(r3)
            com.bytedance.tux.input.TuxTextView r0 = r5.LJLJLLL
            if (r0 != 0) goto L29
        L28:
            return
        L29:
            r0.setText(r1)
            goto L28
        L2d:
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            goto L16
        L34:
            android.widget.TextView r1 = r5.LJLJLJ
            if (r1 == 0) goto L20
            r0 = 2131832988(0x7f11309c, float:1.9299045E38)
            r1.setText(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationsAssem.M3(long):void");
    }

    public final String O3(User user) {
        if (user == null || user.getNewFollowerCount() == 0) {
            return "";
        }
        return String.valueOf(user.getNewFollowerCount());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r0 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R3(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r5 = r8.getContext()
            if (r5 != 0) goto L7
            return
        L7:
            java.lang.Class<X.9Kk> r0 = X.InterfaceC235069Kk.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.7ql r1 = X.C8VC.LJIIIIZZ(r8, r0)
            X.9Kd r1 = (X.C234999Kd) r1
            if (r1 == 0) goto L8d
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.LIZ
        L17:
            java.lang.String r7 = X.AV1.LIZLLL(r0)
            X.4i4 r6 = new X.4i4
            r6.<init>()
            android.content.res.Resources r3 = r5.getResources()
            r4 = 0
            if (r3 == 0) goto L43
            if (r1 == 0) goto L8b
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.LIZ
            if (r0 == 0) goto L8b
            long r0 = r0.getTotalFavorited()
            int r2 = (int) r0
        L32:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r4] = r7
            r0 = 1
            r1[r0] = r9
            r0 = 2131690124(0x7f0f028c, float:1.9009283E38)
            java.lang.String r0 = r3.getQuantityString(r0, r2, r1)
            if (r0 != 0) goto L45
        L43:
            java.lang.String r0 = ""
        L45:
            r6.LIZIZ(r0)
            X.4i3 r3 = r6.LIZ
            X.1Ss r1 = new X.1Ss
            r1.<init>()
            r0 = 2131233955(0x7f080ca3, float:1.8084062E38)
            r1.LJLIL = r0
            X.V8E r2 = r1.LIZ(r5)
            X.ARb r1 = new X.ARb
            r1.<init>(r5)
            r1.LIZIZ(r3)
            r0 = 2131848951(0x7f116ef7, float:1.9331422E38)
            r1.LJ(r0)
            X.9Lg r0 = X.C235289Lg.LJLIL
            X.UC0.LIZJ(r1, r0)
            X.Spu r0 = new X.Spu
            r0.<init>(r4, r5, r2)
            r1.LJIIIZ = r0
            X.ARf r0 = r1.LJI()
            r0.LIZLLL()
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r0 = "click_like_count"
            r1.setEventName(r0)
            java.lang.String r0 = "others_homepage"
            r1.setLabelName(r0)
            X.FMX.onEvent(r1)
            return
        L8b:
            r2 = 0
            goto L32
        L8d:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationsAssem.R3(java.lang.String):void");
    }

    public final void U3(User user) {
        int followStatus = user.getFollowStatus();
        if (followStatus == EnumC57435MgR.UNFOLLOW.getValue()) {
            if (this.LJZL != EnumC57435MgR.FOLLOW_REQUESTED.getValue()) {
                this.LL--;
            }
        } else if (followStatus == EnumC57435MgR.FOLLOWED.getValue() || followStatus == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
            this.LL++;
        }
        H3(user, true);
    }

    public final void W3(View view) {
        String str;
        if (C6ZT.LIZ(view)) {
            return;
        }
        if (L7()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (!HG3.LJIILL().isLogin()) {
            J9P.LIZIZ(LIZ, "personal_homepage", "follower_list", null, null);
        } else {
            withState(Q3(), new AqS47S1200000_4(LIZ, this, str, 10));
        }
    }

    public final void X3(View view) {
        String str;
        if (C6ZT.LIZ(view)) {
            return;
        }
        if (L7()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (!HG3.LJIILL().isLogin()) {
            J9P.LIZIZ(LIZ, "personal_homepage", "following_list", null, null);
        } else {
            withState(Q3(), new AqS47S1200000_4(LIZ, this, str, 11));
        }
    }

    @Override // X.InterfaceC57508Mhc
    public void Z7(FollowStatus followStatus) {
        User user;
        o.LJIIIZ(followStatus, "followStatus");
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd == null || (user = c234999Kd.LIZ) == null || !TextUtils.equals(followStatus.userId, user.getUid()) || followStatus.followStatus == user.getFollowStatus()) {
            return;
        }
        user.setFollowStatus(followStatus.followStatus);
        int i = followStatus.followStatus;
        if (i == 0) {
            if (!AV1.LJIIZILJ(user, false)) {
                user.setFollowerCount(user.getFollowerCount() - 1);
                I3(this, user, false, 2, null);
                F3(user);
            }
        } else if (i == 1 && !AV1.LJIIZILJ(user, false)) {
            user.setFollowerCount(user.getFollowerCount() + 1);
            I3(this, user, false, 2, null);
            F3(user);
        }
        C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), user, null, false, 6);
    }

    public final boolean a4(User user) {
        o.LJIIIZ(user, "user");
        if (this.LJZL != user.getFollowStatus()) {
            return true;
        }
        return false;
    }

    public final boolean b4(User user) {
        o.LJIIIZ(user, "user");
        if (this.LJZL == EnumC57435MgR.NONE.getValue() || this.LJZL == user.getFollowStatus()) {
            return true;
        }
        return false;
    }

    public final boolean c4(User user) {
        o.LJIIIZ(user, "user");
        if (user.getFollowStatus() == EnumC57435MgR.SAME_USER.getValue()) {
            return true;
        }
        return false;
    }

    public final boolean e4(User user) {
        boolean z;
        boolean LIZIZ;
        boolean z2;
        boolean z3 = false;
        if (C9NP.LIZIZ() || C9NP.LIZJ()) {
            if (user.getFollowerCount() < 1000) {
                z3 = true;
            }
            z = (!user.isAccuratePrivateAccount()) & z3;
            LIZIZ = C235239Lb.LIZ().LIZIZ();
        } else {
            if (user.getFollowerCount() < 1000) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 & (!user.isAccuratePrivateAccount());
            if (user.getFriendCount() <= 60) {
                z3 = true;
            }
            z = z4 & z3;
            LIZIZ = C235239Lb.LIZ().LIZIZ();
        }
        return z & LIZIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        View view2;
        o.LJIIIZ(view, "view");
        this.LJLJJI = (TuxTextView) view.findViewById(R.id.dle);
        this.LJLJJL = (TuxTextView) view.findViewById(R.id.dl4);
        this.LJLJJLL = (TuxTextView) view.findViewById(R.id.dl5);
        Z3(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cgx);
        this.LJLJL = viewGroup;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS24S0100000_4(this, 152));
        }
        this.LJLJLJ = (TextView) view.findViewById(R.id.c9y);
        this.LJLJLLL = (TuxTextView) view.findViewById(R.id.c9x);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.dl6);
        this.LJLL = viewGroup2;
        if (viewGroup2 != null) {
            C16880lQ.LJIIL(viewGroup2, new ACListenerS24S0100000_4(this, 153));
        }
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.dlh);
        this.LJLLI = viewGroup3;
        if (viewGroup3 != null) {
            C16880lQ.LJIIL(viewGroup3, new ACListenerS24S0100000_4(this, 154));
        }
        C3();
        Se();
        l4();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Le
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 742));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Lc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LIZJ;
            }
        }, new AqS170S0100000_4(this, 743));
        View findViewById = view.findViewById(R.id.iuq);
        this.LJLJI = findViewById;
        if (findViewById != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (findViewById instanceof LinearLayout)) {
            o.LJII(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            ((ViewGroup) findViewById).setClipChildren(false);
        }
        if (AV1.LJIIJJI() && (view2 = this.LJLJI) != null) {
            view2.setVisibility(8);
        }
        C58084Mqu.LIZIZ = L7();
    }

    private final void A3(TuxTextView tuxTextView, Typeface typeface) {
        if (tuxTextView != null) {
            tuxTextView.LJJIZ(17.0f, 22, typeface, 0.02f);
        }
    }

    private final void H3(User user, boolean z) {
        if (user == null) {
            g4(0);
            return;
        }
        if (user.isAccuratePrivateAccount()) {
            C235239Lb.LIZ().LIZ.storeInt("unclick_times", 0);
        }
        if (!e4(user) || this.LJZ || user.getNewFollowerCount() == 0) {
            Y3();
            if (z) {
                g4(this.LL);
            } else {
                g4(user.getFollowerCount());
            }
            if (user.getNewFollowerCount() == 0) {
                C235239Lb.LIZ().LIZ.storeInt("unclick_times", 0);
            }
            this.LJZ = false;
            v3(user);
            return;
        }
        g4(user.getFollowerCount() - user.getNewFollowerCount());
        L3(user);
    }

    public static /* synthetic */ void I3(ProfileRelationsAssem profileRelationsAssem, User user, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        profileRelationsAssem.H3(user, z);
    }
}
