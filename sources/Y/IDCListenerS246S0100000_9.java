package Y;

import X.ActivityC45651qj;
import X.C188727au;
import X.C212428Vi;
import X.C42625Go9;
import X.C45804HyK;
import X.C53095Ksd;
import X.C53883LCt;
import X.C53888LCy;
import X.C54041LIv;
import X.C54113LLp;
import X.C54114LLq;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56155M2d;
import X.C8W0;
import X.FFH;
import X.FMX;
import X.KUR;
import X.M2Q;
import X.MFV;
import X.MFY;
import X.MFZ;
import X.MW5;
import X.ViewOnClickListenerC57546MiE;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyEncouragePublishCardLayoutManger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.notification.followrequest.vh.FollowRequestViewHolderInFollower;
import com.ss.android.ugc.aweme.notification.followrequest.vh.NewFollowRequestViewHolder;
import com.ss.android.ugc.aweme.poi.videopublish.v2.IPoiPublishUpdateUiStatusAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public class IDCListenerS246S0100000_9 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewDetachedFromWindow$10(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            case 2:
                onViewAttachedToWindow$2(this, view);
                return;
            case 3:
                onViewAttachedToWindow$3(this, view);
                return;
            case 4:
                onViewAttachedToWindow$4(this, view);
                return;
            case 5:
                onViewAttachedToWindow$5(this, view);
                return;
            case 6:
                onViewAttachedToWindow$6(this, view);
                return;
            case 7:
                onViewAttachedToWindow$7(this, view);
                return;
            case 8:
                onViewAttachedToWindow$8(this, view);
                return;
            case 9:
                o.LJIIIZ(view, "v");
                return;
            case 10:
                onViewAttachedToWindow$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onViewAttachedToWindow$11(this, view);
                return;
            case 12:
                onViewAttachedToWindow$12(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            case 2:
                o.LJIIIZ(view, "p0");
                return;
            case 3:
                o.LJIIIZ(view, "p0");
                return;
            case 4:
                o.LJIIIZ(view, "v");
                return;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                return;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                return;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                return;
            case 8:
                onViewDetachedFromWindow$8(this, view);
                return;
            case 9:
                onViewDetachedFromWindow$9(this, view);
                return;
            case 10:
                onViewDetachedFromWindow$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onViewDetachedFromWindow$11(this, view);
                return;
            case 12:
                o.LJIIIZ(view, "v");
                return;
            default:
                return;
        }
    }

    public IDCListenerS246S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View p0) {
        o.LJIIIZ(p0, "p0");
        ((SmartImageView) ((C56155M2d) iDCListenerS246S0100000_9.l0).LJLJJLL.findViewById(R.id.f12)).setAttached(true);
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View view) {
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(view, "view");
        EventBus.LIZJ().LJIILJJIL((MainTabStrip) iDCListenerS246S0100000_9.l0);
        Context context = view.getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            C55096Ljo.LJIILIIL(LJJIFFI, MainActivityScope.class, (MainTabStrip) iDCListenerS246S0100000_9.l0, ITabStrip.class);
        }
    }

    public static final void onViewAttachedToWindow$10(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View view) {
        MFZ mfz;
        Aweme aweme = ((MFV) iDCListenerS246S0100000_9.l0).LJLIL;
        if (aweme != null) {
            if (TextUtils.equals(aweme.getAid(), ((MFV) iDCListenerS246S0100000_9.l0).LLII)) {
                MFV mfv = (MFV) iDCListenerS246S0100000_9.l0;
                if (!mfv.LLIIII && mfv.LLIIIJ == 0) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "others_homepage");
                    c188727au.LJIIIZ("request_id", ((MFV) iDCListenerS246S0100000_9.l0).LJLIL.getRequestId());
                    c188727au.LJIIIZ("group_id", ((MFV) iDCListenerS246S0100000_9.l0).LJLIL.getAid());
                    c188727au.LJIIIZ("author_id", ((MFV) iDCListenerS246S0100000_9.l0).LJLIL.getAuthorUid());
                    c188727au.LIZLLL(((MFV) iDCListenerS246S0100000_9.l0).LLIIIILZ + 1, "order");
                    FMX.LJIIL("just_watched_video_show", c188727au.LIZ);
                }
            }
            if (((MFV) iDCListenerS246S0100000_9.l0).LLIIIJ == 1 && (mfz = MFY.LIZ) != null) {
                MFY.LIZ = MFZ.LIZ(mfz, 0L, 0L, System.currentTimeMillis(), false, null, 55);
                MFY.LIZIZ();
            }
        }
    }

    public static final void onViewAttachedToWindow$11(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View view) {
        C53888LCy c53888LCy = (C53888LCy) iDCListenerS246S0100000_9.l0;
        if (c53888LCy.LJFF) {
            c53888LCy.LIZJ(0);
            c53888LCy.LJ();
        }
    }

    public static final void onViewAttachedToWindow$12(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        o.LJIIIZ(v, "v");
        if (((KUR) iDCListenerS246S0100000_9.l0).LJLILLLLZI == 0) {
            v.setVisibility(0);
        }
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View p0) {
        o.LJIIIZ(p0, "p0");
        FollowRequestViewHolderInFollower followRequestViewHolderInFollower = (FollowRequestViewHolderInFollower) iDCListenerS246S0100000_9.l0;
        User user = followRequestViewHolderInFollower.curUser;
        if (user != null) {
            MW5 mw5 = followRequestViewHolderInFollower.mobHelper;
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "it.uid");
            mw5.LIZIZ(user, uid, followRequestViewHolderInFollower.enterFrom);
        }
    }

    public static final void onViewAttachedToWindow$3(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View p0) {
        o.LJIIIZ(p0, "p0");
        NewFollowRequestViewHolder newFollowRequestViewHolder = (NewFollowRequestViewHolder) iDCListenerS246S0100000_9.l0;
        User user = newFollowRequestViewHolder.mUser;
        if (user != null) {
            MW5 mw5 = newFollowRequestViewHolder.mobHelper;
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "it.uid");
            mw5.LIZIZ(user, uid, newFollowRequestViewHolder.mEnterFrom);
        }
    }

    public static final void onViewAttachedToWindow$4(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        ActivityC45651qj LIZ;
        IPoiPublishUpdateUiStatusAbility iPoiPublishUpdateUiStatusAbility;
        o.LJIIIZ(v, "v");
        LifecycleOwner lifecycleOwner = (LifecycleOwner) iDCListenerS246S0100000_9.l0;
        if ((lifecycleOwner instanceof C8W0) && lifecycleOwner != null && (LIZ = C212428Vi.LIZ(lifecycleOwner)) != null && (iPoiPublishUpdateUiStatusAbility = (IPoiPublishUpdateUiStatusAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), IPoiPublishUpdateUiStatusAbility.class, null)) != null) {
            iPoiPublishUpdateUiStatusAbility.uq(v);
        }
    }

    public static final void onViewAttachedToWindow$5(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        o.LJIIIZ(v, "v");
        M2Q m2q = (M2Q) iDCListenerS246S0100000_9.l0;
        NearbyEncouragePublishCardLayoutManger nearbyEncouragePublishCardLayoutManger = m2q.LJLIL;
        nearbyEncouragePublishCardLayoutManger.getClass();
        nearbyEncouragePublishCardLayoutManger.LLFII.add(m2q);
    }

    public static final void onViewAttachedToWindow$6(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        o.LJIIIZ(v, "v");
        if (C53095Ksd.LIZ()) {
            C42625Go9.LIZIZ((C54041LIv) iDCListenerS246S0100000_9.l0);
        }
    }

    public static final void onViewAttachedToWindow$7(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        o.LJIIIZ(v, "v");
        C53883LCt c53883LCt = (C53883LCt) iDCListenerS246S0100000_9.l0;
        if (c53883LCt.LIZIZ) {
            c53883LCt.LJFF();
        }
    }

    public static final void onViewAttachedToWindow$8(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View view) {
        o.LJIIIZ(view, "view");
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = (ViewOnClickListenerC57546MiE) iDCListenerS246S0100000_9.l0;
        viewOnClickListenerC57546MiE.LJLJJI.LLII.add(viewOnClickListenerC57546MiE);
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View p0) {
        o.LJIIIZ(p0, "p0");
        ((SmartImageView) ((C56155M2d) iDCListenerS246S0100000_9.l0).LJLJJLL.findViewById(R.id.f12)).setAttached(false);
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View view) {
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(view, "view");
        EventBus.LIZJ().LJIJ((MainTabStrip) iDCListenerS246S0100000_9.l0);
        Context context = view.getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            C55096Ljo.LJIILLIIL(LJJIFFI, MainActivityScope.class, ITabStrip.class);
        }
    }

    public static final void onViewDetachedFromWindow$11(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View view) {
        C53888LCy c53888LCy = (C53888LCy) iDCListenerS246S0100000_9.l0;
        AnimatorSet animatorSet = c53888LCy.LJIIL;
        if (animatorSet != null) {
            animatorSet.cancel();
            c53888LCy.LJ = false;
            c53888LCy.LIZLLL = false;
        }
        c53888LCy.LIZJ(8);
    }

    public static final void onViewDetachedFromWindow$5(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        o.LJIIIZ(v, "v");
        M2Q onItemSelectedListener = (M2Q) iDCListenerS246S0100000_9.l0;
        NearbyEncouragePublishCardLayoutManger nearbyEncouragePublishCardLayoutManger = onItemSelectedListener.LJLIL;
        nearbyEncouragePublishCardLayoutManger.getClass();
        o.LJIIIZ(onItemSelectedListener, "onItemSelectedListener");
        nearbyEncouragePublishCardLayoutManger.LLFII.remove(onItemSelectedListener);
    }

    public static final void onViewDetachedFromWindow$6(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        o.LJIIIZ(v, "v");
        if (C53095Ksd.LIZ()) {
            C42625Go9.LIZJ((C54041LIv) iDCListenerS246S0100000_9.l0);
        }
    }

    public static final void onViewDetachedFromWindow$7(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        o.LJIIIZ(v, "v");
        ((C53883LCt) iDCListenerS246S0100000_9.l0).LIZLLL();
    }

    public static final void onViewDetachedFromWindow$8(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View view) {
        o.LJIIIZ(view, "view");
        ((ViewOnClickListenerC57546MiE) iDCListenerS246S0100000_9.l0).LLLLLLLLL();
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = (ViewOnClickListenerC57546MiE) iDCListenerS246S0100000_9.l0;
        viewOnClickListenerC57546MiE.LJLJJI.LLII.remove(viewOnClickListenerC57546MiE);
    }

    public static final void onViewDetachedFromWindow$9(IDCListenerS246S0100000_9 iDCListenerS246S0100000_9, View v) {
        Drawable tabIconBackImageDrawable;
        o.LJIIIZ(v, "v");
        C54113LLp c54113LLp = ((C54114LLq) iDCListenerS246S0100000_9.l0).LIZ;
        if (c54113LLp != null && (tabIconBackImageDrawable = c54113LLp.getTabIconBackImageDrawable()) != null && (tabIconBackImageDrawable instanceof FFH)) {
            FFH ffh = (FFH) tabIconBackImageDrawable;
            if (ffh.isRunning()) {
                ffh.stop();
            }
        }
    }
}
