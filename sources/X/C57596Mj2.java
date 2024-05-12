package X;

import Y.ALAdapterS7S0100000_9;
import Y.ALAdapterS7S0200000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS45S0100000_9;
import Y.AfS61S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mj2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57596Mj2 extends FrameLayout {
    public static final int LJZI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
    public static final int LJZL = C7MY.LIZIZ(56);
    public final C62822Ol8 LJLIL;
    public TTRecUserBigCardViewModel LJLILLLLZI;
    public String LJLJI;
    public RecUser LJLJJI;
    public Aweme LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final Handler LJLJLJ;
    public final ARunnableS37S0100000_1 LJLJLLL;
    public final ARunnableS37S0100000_1 LJLL;
    public ScrollSwitchStateManager LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final int LJLLLL;
    public float LJLLLLLL;
    public final ArrayList<EnumC57597Mj3> LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJZ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final AT9 getLongPressHelper() {
        return (AT9) this.LJLIL.getValue();
    }

    public final void LIZLLL() {
        if (this.LJLJL) {
            C221018lt.LJFF("TTRecUserBigCardView", "swapping cant long press");
            return;
        }
        requestDisallowInterceptTouchEvent(true);
        LJIIJ();
        LIZIZ(EnumC57597Mj3.CLICK_LONG_PRESS);
        LJIIIZ();
        C221018lt.LIZ("TTRecUserBigCardView", "[onLongPress]");
        getLongPressHelper().LIZIZ();
    }

    public final void LJII() {
        RecUser iv0;
        Aweme aweme;
        ActivityC45651qj activityC45651qj;
        LNI lni;
        TTRecUserBigCardViewModel tTRecUserBigCardViewModel = this.LJLILLLLZI;
        if (tTRecUserBigCardViewModel != null && (iv0 = tTRecUserBigCardViewModel.iv0(true)) != null) {
            Aweme aweme2 = this.LJLJJL;
            if (aweme2 != null) {
                aweme2.setAuthor(iv0);
            }
            if (this.LJLJJLL && (aweme = this.LJLJJL) != null) {
                Context context = getContext();
                if ((context instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) context) != null) {
                    ScrollSwitchStateManager LIZ = C84193Sd.LIZ(activityC45651qj);
                    InterfaceC36571c5 jv0 = LIZ.jv0(LIZ.nv0("page_profile"));
                    if ((jv0 instanceof LNI) && (lni = (LNI) jv0) != null) {
                        lni.LJJLIIIJ(aweme);
                    }
                }
            }
            this.LJLJJI = iv0;
            if (!this.LJLJL) {
                this.LJLJL = true;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZ(R.id.akm), "alpha", 0.0f, 1.0f);
            ofFloat.setInterpolator(new SJK());
            ofFloat.setDuration(300L);
            ofFloat.addListener(new ALAdapterS7S0100000_9(this, 16));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LIZ(R.id.akm), "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.setInterpolator(new SJK());
            ofFloat2.addListener(new ALAdapterS7S0200000_9(this, iv0, 3));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat2).before(ofFloat);
            animatorSet.start();
            return;
        }
        C2U8.LIZ(new C55206Lla());
    }

    public static void LJIIIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[updateNegativeActionTimes] isNegative = ");
        LIZ.append(false);
        C221018lt.LIZ("TTRecUserBigCardView", X1D.LIZIZ(LIZ));
        C57600Mj6.LIZLLL(false);
    }

    public final void LJFF() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onViewHolderSelected] holderIsSelected = ");
        U26.LIZLLL(LIZ, this.LJLJJLL, LIZ, "TTRecUserBigCardView");
        this.LJLJJLL = true;
        if (C57626MjW.LIZIZ()) {
            if (this.LJLLL) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[initSwipeUp] hasSwipeUpShowOnce = ");
                U26.LIZLLL(LIZ2, this.LJLLL, LIZ2, "TTRecUserBigCardView");
                return;
            }
            this.LJLLL = true;
            int i = C57600Mj6.LIZIZ().getInt("key_swipe_up_show_times", 0);
            if (C57626MjW.LIZJ()) {
                String str = this.LJLJI;
                if (o.LJ(str, "homepage_hot")) {
                    C60952aJ.LIZIZ();
                } else if (o.LJ(str, "homepage_friends")) {
                    C60942aI.LIZIZ();
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[initSwipeUp] swipeUpTipsShowTimes = ");
            LIZ3.append(i);
            C221018lt.LIZ("TTRecUserBigCardView", X1D.LIZIZ(LIZ3));
            C53029KrZ.LIZ.getClass();
            if (i < ((Number) C53029KrZ.LIZIZ.getValue()).intValue()) {
                C57600Mj6.LIZIZ().storeInt("key_swipe_up_show_times", C57600Mj6.LIZIZ().getInt("key_swipe_up_show_times", 0) + 1);
                LIZ(R.id.mm_).setVisibility(0);
                return;
            }
            LIZ(R.id.mm_).setVisibility(8);
        }
    }

    public final void LJIIJ() {
        try {
            Object LLILL = C16880lQ.LLILL(getContext(), "vibrator");
            o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) LLILL).vibrate(25L);
        } catch (Exception e) {
            C221018lt.LIZLLL("TTRecUserBigCardView", e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57596Mj2(Context context) {
        super(context, null, 0);
        this.LJZ = C62850Ola.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS156S0200000_9(this, context, 102));
        this.LJLJI = "";
        this.LJLJLJ = new Handler(C16880lQ.LLJJJJ());
        this.LJLJLLL = new ARunnableS37S0100000_1(this, 129);
        this.LJLL = new ARunnableS37S0100000_1(this, 128);
        C16880lQ.LLLZIIL(R.layout.ca0, C16880lQ.LLZIL(context), this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        o.LJIIIIZZ(viewConfiguration, "get(context)");
        this.LJLLLL = viewConfiguration.getScaledTouchSlop();
        this.LJLZ = new ArrayList<>();
    }

    public final void LIZIZ(EnumC57597Mj3 actionType) {
        o.LJIIIZ(actionType, "actionType");
        ArrayList<EnumC57597Mj3> arrayList = this.LJLZ;
        if (!arrayList.contains(actionType)) {
            arrayList.add(actionType);
        }
    }

    public final void LIZJ(RecUser recUser) {
        UrlModel urlModel;
        boolean z;
        C197267og c197267og;
        List<Aweme> awemeList;
        C54960Lhc.LIZ.LIZ(15, recUser.getUid());
        this.LJLJL = false;
        RecUser recUser2 = this.LJLJJI;
        if (recUser2 != null) {
            urlModel = recUser2.getAvatarMedium();
        } else {
            urlModel = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        C57743MlP c57743MlP = InterfaceC57744MlQ.LJJII;
        LJII.LJJIIJ = (SmartImageView) LIZ(R.id.aki);
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        C57743MlP.LIZJ(c57743MlP, LJII, this.LJLJI, EnumC57383Mfb.AVATAR);
        post(new ARunnableS28S0200000_9(recUser, this, 69));
        ((TextView) LIZ(R.id.al3)).setText(recUser.getNickname());
        boolean LIZIZ = C57626MjW.LIZIZ();
        int i = R.attr.dk;
        if (LIZIZ) {
            ((TuxTextView) LIZ(R.id.al3)).setTextColorRes(R.attr.dk);
        } else {
            ((TuxTextView) LIZ(R.id.al3)).setTextColorRes(R.attr.go);
        }
        if (C57626MjW.LJ()) {
            MatchedFriendStruct matchedFriendStruct = recUser.getMatchedFriendStruct();
            if (matchedFriendStruct != null && (awemeList = matchedFriendStruct.getAwemeList()) != null && awemeList.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!C57626MjW.LIZIZ()) {
                i = R.attr.gv;
            }
            ((TuxTextView) LIZ(R.id.mq2)).setTextColorRes(i);
            ((TuxTextView) LIZ(R.id.m8c)).setTextColorRes(i);
            MatchedFriendStruct matchedFriendStruct2 = recUser.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                c197267og = C1DF.LJJIJIL(matchedFriendStruct2);
            } else {
                c197267og = null;
            }
            if (z) {
                LIZ(R.id.lm5).setVisibility(0);
                LIZ(R.id.lma).setVisibility(8);
                if (c197267og != null) {
                    ((ImageView) LIZ(R.id.f4a)).setVisibility(0);
                    MCQ mcq = (MCQ) C57610MjG.LIZ.getValue();
                    Context context = getContext();
                    o.LJIIIIZZ(context, "bigCardView.context");
                    MCR mcr = new MCR(context, c197267og, mcq);
                    ((AppCompatImageView) LIZ(R.id.f4a)).setImageBitmap(mcr.LIZ());
                    mcr.LIZJ().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0100000_9(this, 77));
                } else {
                    ((ImageView) LIZ(R.id.f4a)).setVisibility(8);
                }
                C58049MqL c58049MqL = (C58049MqL) LIZ(R.id.m8c);
                MatchedFriendStruct matchedFriendStruct3 = recUser.getMatchedFriendStruct();
                o.LJIIIIZZ(matchedFriendStruct3, "user.matchedFriendStruct");
                c58049MqL.LJJJJ(matchedFriendStruct3, C58050MqM.LJIJ);
            } else {
                LIZ(R.id.lm5).setVisibility(8);
                LIZ(R.id.lma).setVisibility(0);
                if (c197267og != null) {
                    MCQ mcq2 = (MCQ) C57610MjG.LIZIZ.getValue();
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "bigCardView.context");
                    MCR mcr2 = new MCR(context2, c197267og, mcq2);
                    ((ImageView) LIZ(R.id.fcg)).setVisibility(0);
                    ((AppCompatImageView) LIZ(R.id.fcg)).setImageBitmap(mcr2.LIZ());
                    mcr2.LIZJ().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0100000_9(this, 78));
                } else {
                    ((ImageView) LIZ(R.id.fcg)).setVisibility(8);
                }
                C58049MqL c58049MqL2 = (C58049MqL) LIZ(R.id.mq2);
                MatchedFriendStruct matchedFriendStruct4 = recUser.getMatchedFriendStruct();
                o.LJIIIIZZ(matchedFriendStruct4, "user.matchedFriendStruct");
                c58049MqL2.LJJJJ(matchedFriendStruct4, C58050MqM.LJIJ);
            }
        }
        C57381MfZ c57381MfZ = (C57381MfZ) LIZ(R.id.akn);
        String enterFrom = this.LJLJI;
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 976);
        c57381MfZ.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        c57381MfZ.LJLJLJ = enterFrom;
        c57381MfZ.LJLJLLL = recUser;
        c57381MfZ.LJLL = aqS159S0100000_9;
        c57381MfZ.post(new ARunnableS45S0100000_9((Object) c57381MfZ, 211));
        if (C99W.LIZ) {
            LIZ(R.id.akj).getClass();
        }
        RelationButton relationButton = (RelationButton) LIZ(R.id.akj);
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZ = recUser;
        c226668v0.LIZJ(EnumC57853MnB.FEED_BIG_CARD);
        c226668v0.LIZIZ = false;
        c226668v0.LJIIIIZZ = true;
        c226668v0.LIZIZ(EnumC112694bZ.FRIENDS);
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        relationButton.setTracker(new AqS159S0100000_9(this, 977));
        relationButton.setFollowClickListener(new AqS191S0100000_9(this, 96));
        relationButton.setFollowClickInterceptor(new C39B(recUser, this, null));
        if (C57626MjW.LIZIZ()) {
            C57686MkU c57686MkU = C57686MkU.LIZ;
            OSZ LJI = OQN.LJI(recUser);
            c57686MkU.getClass();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, C57686MkU.LIZIZ);
            gradientDrawable.setCornerRadius(0.0f);
            if (LJI == null) {
                C221018lt.LIZ("TTRecImageUrlToBackgroundManager", "getBgDrawable by default");
            } else {
                String str = (String) LJI.getFirst();
                Object second = LJI.getSecond();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getBgDrawable: url=");
                LIZ.append(str);
                LIZ.append(", tag=");
                LIZ.append(second);
                C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ));
                int[] iArr = C57686MkU.LIZJ.get(str);
                if (iArr == null) {
                    C221018lt.LIZ("TTRecImageUrlToBackgroundManager", "getBgDrawable: colors is null..");
                } else {
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                    gradientDrawable.setCornerRadius(0.0f);
                }
            }
            LIZ(R.id.j76).setBackground(gradientDrawable);
            return;
        }
        LIZ(R.id.j76).setBackgroundResource(R.drawable.a17);
    }

    public final void LJ(boolean z) {
        StringBuilder LJI = JBR.LJI("[onPagerViewResume] resumed = ", z, " ， pageResumed = ");
        U26.LIZLLL(LJI, this.LJLLJ, LJI, "TTRecUserBigCardView");
        if (z) {
            if (!this.LJLLJ) {
                this.LJLLJ = true;
                if (this.LJLJJI != null) {
                    this.LJLJLJ.postDelayed(this.LJLJLLL, 600L);
                    return;
                }
                return;
            }
            return;
        }
        this.LJLLJ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.EnumC57597Mj3 r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel r5 = r6.LJLILLLLZI
            r4 = 0
            if (r5 == 0) goto L1f
            java.lang.String r1 = "TTRecUserBigCardViewModel"
            java.lang.String r0 = "[dislikeThisFeature] dislike this feature"
            X.C221018lt.LIZ(r1, r0)
            X.2pa r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r5)
            X.XIA r2 = X.C78613UtF.LIZJ
            X.Mke r1 = new X.Mke
            r1.<init>(r5, r4)
            r0 = 2
            X.XKX.LIZLLL(r3, r2, r4, r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L26
        L1f:
            java.lang.String r1 = "TTRecUserBigCardView"
            java.lang.String r0 = "[reduceRecUserBigCard] click close but vm is null"
            X.C221018lt.LJFF(r1, r0)
        L26:
            r6.LIZIZ(r7)
            X.AKb r1 = new X.AKb
            r1.<init>(r6)
            r0 = 2131830630(0x7f112766, float:1.9294263E38)
            r1.LJIIIIZZ(r0)
            r1.LJIIJ()
            X.Lla r0 = new X.Lla
            r0.<init>()
            X.C2U8.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57596Mj2.LJI(X.Mj3):void");
    }

    public final void LJIIIIZZ(EnumC57365MfJ actionType) {
        User user;
        o.LJIIIZ(actionType, "actionType");
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(this.LJLJI);
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = actionType;
        c57362MfG.LJJIIZ(this.LJLJJL);
        Aweme aweme = this.LJLJJL;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        c57362MfG.LJJJJIZL(user);
        c57362MfG.LJLI = true;
        c57362MfG.LJIILIIL();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked != 2) {
                return false;
            }
            float rawX = ev.getRawX() - this.LJLLLLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("xDiff = ");
            LIZ.append(rawX);
            C221018lt.LIZ("TTRecUserBigCardView", X1D.LIZIZ(LIZ));
            if (C26338AVi.LIZLLL(this)) {
                if (Math.abs(rawX) <= this.LJLLLL) {
                    return false;
                }
            } else if (rawX <= this.LJLLLL) {
                return false;
            }
            return true;
        }
        this.LJLLLLLL = ev.getRawX();
        return false;
    }

    public final void setBigCardAweme(Aweme aweme) {
        this.LJLJJL = aweme;
        RecUser recUser = this.LJLJJI;
        if (recUser == null || aweme == null) {
            return;
        }
        aweme.setAuthor(recUser);
    }
}
