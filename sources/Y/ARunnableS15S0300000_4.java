package Y;

import X.AbstractC253779xd;
import X.ActivityC45651qj;
import X.AnonymousClass922;
import X.C04270Et;
import X.C0JU;
import X.C107794Kx;
import X.C136815Yn;
import X.C139825eE;
import X.C141335gf;
import X.C243869he;
import X.C247289nA;
import X.C247419nN;
import X.C247649nk;
import X.C247659nl;
import X.C253039wR;
import X.C26043AJz;
import X.C26045AKb;
import X.C31081Jw;
import X.C32151Nz;
import X.C3C5;
import X.C56K;
import X.C58655N0h;
import X.C58704N2e;
import X.C68322mC;
import X.C76800UCe;
import X.C76930UHe;
import X.C7MY;
import X.C86783as;
import X.C95D;
import X.DialogC25756A8y;
import X.InterfaceC65784Pro;
import X.O6R;
import X.WHL;
import X.X1D;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.touchpoint.core.model.Carousels;
import com.bytedance.touchpoint.core.model.HighLightText;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarSuggestBAAssem;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ARunnableS15S0300000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        BottomBarAssem bottomBarAssem = (BottomBarAssem) this.l0;
        final View bottomNextGroup = (View) this.l1;
        o.LJIIIIZZ(bottomNextGroup, "bottomNextGroup");
        final TuxTextView bottomNextText = (TuxTextView) this.l2;
        o.LJIIIIZZ(bottomNextText, "bottomNextText");
        if (bottomBarAssem._isViewValid) {
            final float width = bottomNextGroup.getWidth();
            final float height = bottomNextGroup.getHeight();
            if (width > height) {
                final float width2 = bottomNextText.getWidth();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5mJ
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        Float f;
                        o.LJIIIZ(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                            float floatValue = f.floatValue();
                            float f2 = width2 * floatValue;
                            bottomNextText.setAlpha(floatValue);
                            TextView textView = bottomNextText;
                            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                            layoutParams.width = (int) f2;
                            textView.setLayoutParams(layoutParams);
                            float f3 = width;
                            float f4 = height;
                            float LIZIZ = C06420Na.LIZIZ(f3, f4, floatValue, f4);
                            View view = bottomNextGroup;
                            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                            float f5 = height;
                            layoutParams2.width = (int) LIZIZ;
                            layoutParams2.height = (int) f5;
                            view.setLayoutParams(layoutParams2);
                        }
                    }
                });
                ofFloat.addListener(new ALAdapterS3S0100000_4(bottomNextText, 11));
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
        }
        Keva repo = Keva.getRepo("trending_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO)");
        repo.storeInt("ever_next", 1);
    }

    public final void LIZ$1() {
        Context context = ((MineNavBarSuggestBAAssem) this.l0).getContext();
        if (context != null) {
            View view = (View) this.l1;
            User user = (User) this.l2;
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZIZ(view);
            c139825eE.LJI(WHL.BOTTOM);
            c139825eE.LJIIJJI(R.string.sl5);
            c139825eE.LIZ.LJII = 5000L;
            c139825eE.LJII(new AqS154S0100000_4(user, 1064));
            c139825eE.LIZJ().show();
        }
    }

    public final void LIZ$2() {
        float f;
        View view = (View) this.l0;
        if (view != null) {
            f = view.getAlpha();
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((View) this.l0, "alpha", f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(view, \"alpha\", startAlpha, 0f)");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener((ValueAnimator.AnimatorUpdateListener) this.l1);
        ofFloat.addListener(new IDAListenerS73S0100000_4((Animator.AnimatorListener) this.l2, 9));
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public final void LIZ$3() {
        float f;
        View view = (View) this.l0;
        if (view != null) {
            f = view.getAlpha();
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((View) this.l0, "alpha", f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(view, \"alpha\", startAlpha, 1f)");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener((ValueAnimator.AnimatorUpdateListener) this.l1);
        ofFloat.addListener(new IDAListenerS73S0100000_4((Animator.AnimatorListener) this.l2, 10));
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public final void LIZ$4() {
        C86783as c86783as = ((C247419nN) this.l0).LIZLLL;
        if (c86783as != null) {
            int size = ((List) this.l1).size();
            Carousels carousels = (Carousels) this.l2;
            if (carousels != null) {
                HighLightText highLightText = carousels.highlightColor;
            }
            c86783as.LJLIL = size;
            if (c86783as.getChildCount() <= 0 && size > 1) {
                int i = 1;
                while (true) {
                    int width = ((c86783as.getWidth() - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) * (size - 1))) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(64))) / size;
                    ImageView imageView = new ImageView(c86783as.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, C7MY.LIZIZ(4));
                    layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                    imageView.setLayoutParams(layoutParams);
                    Context context = imageView.getContext();
                    o.LJIIIIZZ(context, "context");
                    Drawable LIZIZ = C04270Et.LIZIZ(context, R.drawable.c9w);
                    if (LIZIZ != null) {
                        imageView.setImageDrawable(LIZIZ);
                    }
                    c86783as.addView(imageView);
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        C247289nA LJFF = C247419nN.LJFF();
        if (LJFF != null && LJFF.LJIIIIZZ()) {
            ((C247419nN) this.l0).LJ();
        }
        C86783as c86783as2 = ((C247419nN) this.l0).LIZLLL;
        if (c86783as2 != null) {
            c86783as2.LIZ(0);
        }
    }

    public final void LIZ$5() {
        String extra = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), (HashMap) this.l0);
        C247649nk c247649nk = C247659nl.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ies_ad_info_key_");
        LIZ.append(AppLog.getServerDeviceId());
        c247649nk.LIZ(extra, X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("commerce_report_uri_key_");
        LIZ2.append(AppLog.getServerDeviceId());
        c247649nk.LIZ(((Uri.Builder) this.l1).toString(), X1D.LIZIZ(LIZ2));
        C26043AJz c26043AJz = (C26043AJz) this.l2;
        String LIZIZ = c26043AJz.LJLIL.LIZIZ();
        String str = "";
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        o.LJIIIIZZ(extra, "extra");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ies_ad_info_key_");
        LIZ3.append(AppLog.getServerDeviceId());
        String string = c247649nk.LIZ.getString(X1D.LIZIZ(LIZ3), "");
        String cid = c26043AJz.LJLIL.getCid();
        if (cid == null) {
            cid = "";
        }
        String logExtra = c26043AJz.LJLIL.getLogExtra();
        if (logExtra != null) {
            str = logExtra;
        }
        if (!TextUtils.equals(string, extra) || TextUtils.isEmpty(extra)) {
            C58655N0h LJ = C58704N2e.LJ(LIZIZ, "client_report_write_failed", cid, str, null);
            LJ.LIZIZ(extra, "ies_ad_info");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("ies_ad_info_key_");
            LIZ4.append(AppLog.getServerDeviceId());
            LJ.LIZIZ(X1D.LIZIZ(LIZ4), "ies_key");
            LJ.LJI();
        }
        if (TextUtils.isEmpty(AppLog.getServerDeviceId())) {
            C0JU.LIZJ(1, C58704N2e.LJ(LIZIZ, "client_report_required_param_lost", cid, str, null), "device_id_null");
        }
        if (TextUtils.isEmpty(extra)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(extra);
            if (TextUtils.isEmpty(jSONObject.get("log_extra").toString())) {
                C58655N0h LJ2 = C58704N2e.LJ(LIZIZ, "client_report_required_param_lost", cid, str, null);
                LJ2.LIZIZ(1, "log_extra_null");
                LJ2.LJI();
            }
            if (TextUtils.isEmpty(jSONObject.get("cid").toString())) {
                C58655N0h LJ3 = C58704N2e.LJ(LIZIZ, "client_report_required_param_lost", cid, str, null);
                LJ3.LIZIZ(1, "cid_value_invalid");
                LJ3.LJI();
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void run$0(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            C253039wR.LIZLLL((ViewGroup) aRunnableS15S0300000_4.l0, (ViewGroup) aRunnableS15S0300000_4.l1, (View) aRunnableS15S0300000_4.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            ((Assembler) aRunnableS15S0300000_4.l0).wv0((I18nUserProfileFragmentV2) aRunnableS15S0300000_4.l1, new AqS170S0100000_4((View) aRunnableS15S0300000_4.l2, 601));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            aRunnableS15S0300000_4.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            ((AbstractC253779xd) aRunnableS15S0300000_4.l0).LIZIZ((Bundle) aRunnableS15S0300000_4.l2, (ActivityC45651qj) aRunnableS15S0300000_4.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        float f;
        View view = (View) aRunnableS15S0300000_4.l0;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) aRunnableS15S0300000_4.l1;
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aRunnableS15S0300000_4.l2;
        if (view != null) {
            f = view.getAlpha();
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(view, \"alpha\", startAlpha, 0f)");
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat.addListener(new IDAListenerS73S0100000_4(animatorListener, 11));
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public static final void run$13(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            C56K c56k = (C56K) aRunnableS15S0300000_4.l0;
            c56k.element = Math.max(c56k.element, ((TuxTextView) ((LinearLayout) ((View) aRunnableS15S0300000_4.l1).findViewById(R.id.k1u)).findViewById(R.id.hli)).getPaint().measureText(((ReviewAspectPercentageItem) aRunnableS15S0300000_4.l2).percentage));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            DialogC25756A8y dialogC25756A8y = ((C243869he) aRunnableS15S0300000_4.l0).LJLIL;
            if (dialogC25756A8y != null) {
                dialogC25756A8y.dismiss();
            }
            PasskeyPopUpHelper passkeyPopUpHelper = (PasskeyPopUpHelper) aRunnableS15S0300000_4.l1;
            Activity activity = (Activity) aRunnableS15S0300000_4.l2;
            passkeyPopUpHelper.getClass();
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIZ(activity.getString(R.string.jf3));
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LIZ(true);
            c26045AKb.LJIIJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            AnonymousClass922.LJ((C107794Kx) aRunnableS15S0300000_4.l0, (C31081Jw) aRunnableS15S0300000_4.l1, (Aweme) aRunnableS15S0300000_4.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            AnonymousClass922.LIZ = null;
            AnonymousClass922.LJ((C107794Kx) aRunnableS15S0300000_4.l0, (C31081Jw) aRunnableS15S0300000_4.l1, (Aweme) aRunnableS15S0300000_4.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            ((KeyboardStateViewModel) aRunnableS15S0300000_4.l0).LJLILLLLZI.observe((LifecycleOwner) aRunnableS15S0300000_4.l1, (Observer) aRunnableS15S0300000_4.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            ((ArrayList) ((C76930UHe) aRunnableS15S0300000_4.l0).LJLJJLL).remove((ViewPropertyAnimator) aRunnableS15S0300000_4.l1);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) ((C68322mC) aRunnableS15S0300000_4.l2).element;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            ((C68322mC) aRunnableS15S0300000_4.l2).element = null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            ((ArrayList) ((C76930UHe) aRunnableS15S0300000_4.l0).LJLJJLL).remove((ViewPropertyAnimator) aRunnableS15S0300000_4.l1);
            ((InterfaceC65784Pro) aRunnableS15S0300000_4.l2).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            ((Assembler) aRunnableS15S0300000_4.l0).wv0((I18nUserProfileFragmentV2) aRunnableS15S0300000_4.l1, new AqS170S0100000_4((View) aRunnableS15S0300000_4.l2, 603));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            aRunnableS15S0300000_4.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            C95D.LJFF((Context) aRunnableS15S0300000_4.l1, (C136815Yn) aRunnableS15S0300000_4.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            aRunnableS15S0300000_4.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            ((Assembler) aRunnableS15S0300000_4.l0).wv0((I18nUserProfileFragmentV2) aRunnableS15S0300000_4.l1, new AqS170S0100000_4((View) aRunnableS15S0300000_4.l2, 604));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            ((Assembler) aRunnableS15S0300000_4.l0).wv0((I18nUserProfileFragmentV2) aRunnableS15S0300000_4.l1, new AqS170S0100000_4((View) aRunnableS15S0300000_4.l2, 608));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            aRunnableS15S0300000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            aRunnableS15S0300000_4.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            C56K c56k = (C56K) aRunnableS15S0300000_4.l0;
            c56k.element = Math.max(c56k.element, ((TuxTextView) ((LinearLayout) ((View) aRunnableS15S0300000_4.l1).findViewById(R.id.k1u)).findViewById(R.id.hli)).getPaint().measureText(((ReviewAspectPercentageItem) aRunnableS15S0300000_4.l2).percentage));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            C56K c56k = (C56K) aRunnableS15S0300000_4.l0;
            c56k.element = Math.max(c56k.element, ((TuxTextView) ((LinearLayout) ((View) aRunnableS15S0300000_4.l1).findViewById(R.id.k1u)).findViewById(R.id.hli)).getPaint().measureText(((ReviewAspectPercentageItem) aRunnableS15S0300000_4.l2).percentage));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS15S0300000_4 aRunnableS15S0300000_4) {
        boolean LIZ;
        try {
            aRunnableS15S0300000_4.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS15S0300000_4(ConstraintLayout constraintLayout, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener, int i) {
        this.$t = i;
        switch (i) {
            case 10:
                this.l0 = constraintLayout;
                this.l1 = animatorUpdateListener;
                this.l2 = animatorListener;
                return;
            default:
                this.l0 = constraintLayout;
                this.l1 = animatorUpdateListener;
                this.l2 = animatorListener;
                return;
        }
    }

    public ARunnableS15S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
