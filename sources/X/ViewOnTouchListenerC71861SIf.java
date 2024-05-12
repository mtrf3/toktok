package X;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdkapi.message.LiveMessageID;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.internal.b;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.SIf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnTouchListenerC71861SIf implements InterfaceC32188CkC, View.OnTouchListener, GestureDetector.OnGestureListener, Application.ActivityLifecycleCallbacks {
    public final C1AU LJLIL;
    public final EnterRoomConfig LJLILLLLZI;
    public final String LJLJI;
    public final XJL<C76800UCe> LJLJJI;
    public final CardView LJLJJL;
    public final LiveRoomStruct LJLJJLL;
    public final InterfaceC86353Xun LJLJL;
    public boolean LJLJLJ;
    public final java.util.Map<String, Object> LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public Animator LJLLLLLL;
    public final GestureDetector LJLZ;

    @Override // X.InterfaceC32188CkC
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public final void LIZJ(EnumC79342VBy message, Object obj) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC32188CkC
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJII(C28272B7s c28272B7s) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIL(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LLLZL() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
    }

    public final void LJ(String str) {
        ViewGroup viewGroup;
        this.LJLIL.getApplication().unregisterActivityLifecycleCallbacks(this);
        ViewParent parent = this.LJLJJL.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this.LJLJJL, viewGroup);
        }
        this.LJLJL.destroy();
        long currentTimeMillis = System.currentTimeMillis();
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJLJLLL);
        LJJLIL.put("duration", Long.valueOf(currentTimeMillis - this.LJLL));
        LJJLIL.put("close_type", str);
        b.LJJIJIIJI("livesdk_tiktokec_mini_window_live_duration", LJJLIL);
        java.util.Map LJJLIL2 = C113554cx.LJJLIL(this.LJLJLLL);
        LJJLIL2.put("stay_time", Long.valueOf(currentTimeMillis - this.LJLLI));
        LJJLIL2.put("close_type", str);
        b.LJJIJIIJI("livesdk_tiktokec_mini_window_close", LJJLIL2);
    }

    @Override // X.InterfaceC32188CkC
    public final void LJI(String s) {
        o.LJIIIZ(s, "s");
        if (this.LJLJJL.findViewById(R.id.guh) == null) {
            return;
        }
        View findViewById = this.LJLJJL.findViewById(R.id.guh);
        o.LJIIIIZZ(findViewById, "cardView.mute");
        C78565UsT.LJJIZ(findViewById, this.LJLIL, new C71860SIe(this, null), 2);
        View findViewById2 = this.LJLJJL.findViewById(R.id.bf7);
        o.LJIIIIZZ(findViewById2, "cardView.close");
        C78565UsT.LJJIZ(findViewById2, this.LJLIL, new C71859SId(this, null), 2);
        this.LJLJJL.setOnTouchListener(this);
        this.LJLL = System.currentTimeMillis();
        if (this.LJLJJL.getVisibility() != 0 && V1B.LJJZZI(this.LJLIL, false)) {
            this.LJLLI = this.LJLL;
        }
        View findViewById3 = this.LJLJJL.findViewById(R.id.h1t);
        o.LJIIIIZZ(findViewById3, "cardView.no_internet");
        findViewById3.setVisibility(8);
        ImageView imageView = (ImageView) this.LJLJJL.findViewById(R.id.guh);
        o.LJIIIIZZ(imageView, "cardView.mute");
        imageView.setVisibility(0);
        this.LJLJJL.setVisibility(0);
        b.LJJIJIIJI("livesdk_tiktokec_mini_window_live_play", this.LJLJLLL);
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIIZZ(String s) {
        String str;
        o.LJIIIZ(s, "s");
        if (this.LJLJJL.getParent() == null) {
            return;
        }
        if (!C48189Ivh.LJFF(this.LJLIL)) {
            View findViewById = this.LJLJJL.findViewById(R.id.h1t);
            o.LJIIIIZZ(findViewById, "cardView.no_internet");
            findViewById.setVisibility(0);
            ImageView imageView = (ImageView) this.LJLJJL.findViewById(R.id.guh);
            o.LJIIIIZZ(imageView, "cardView.mute");
            imageView.setVisibility(8);
        }
        if (this.LJLL <= 0) {
            return;
        }
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJLJLLL);
        LJJLIL.put("duration", Long.valueOf(System.currentTimeMillis() - this.LJLL));
        if (V1B.LJJZZI(this.LJLIL, false)) {
            str = "auto";
        } else if (ActivityStack.isAppBackGround()) {
            str = "quit_app";
        } else {
            str = "next";
        }
        LJJLIL.put("close_type", str);
        b.LJJIJIIJI("livesdk_tiktokec_mini_window_live_duration", LJJLIL);
        this.LJLL = 0L;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJJI(String str) {
        LiveMessageID liveMessageID;
        String str2 = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(m.class)));
            if (!(fromJson instanceof m)) {
                fromJson = null;
            }
            m mVar = (m) fromJson;
            if (mVar != null) {
                try {
                    try {
                        Object LIZLLL = C27739Aud.LJFF().LIZLLL(mVar.LJJIJIL("live_message_sei"), C65330PkU.LIZJ(C65352Pkq.LJI(LiveMessageSEI.class)));
                        if (!(LIZLLL instanceof LiveMessageSEI)) {
                            LIZLLL = null;
                        }
                        LiveMessageSEI liveMessageSEI = (LiveMessageSEI) LIZLLL;
                        if (liveMessageSEI != null && (liveMessageID = liveMessageSEI.uniqueID) != null) {
                            str2 = liveMessageID.messageScene;
                        }
                    } catch (s unused) {
                    }
                    if (o.LJ(str2, "end_room") && this.LJLJJL.getParent() != null) {
                        LJ("auto");
                        XJL<C76800UCe> xjl = this.LJLJJI;
                        if (xjl != null) {
                            C76800UCe c76800UCe = C76800UCe.LIZ;
                            C3C5.m7constructorimpl(c76800UCe);
                            xjl.resumeWith(c76800UCe);
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused2) {
                }
            }
        } catch (s unused3) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (!o.LJ(activity, this.LJLIL)) {
            return;
        }
        this.LJLJL.i(this.LJLJLJ, this.LJLJJLL, (FrameLayout) this.LJLJJL.findViewById(R.id.bs8), false, null);
        if (this.LJLJJL.getVisibility() == 0) {
            this.LJLLI = System.currentTimeMillis();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (o.LJ(activity, this.LJLIL) && activity.isFinishing()) {
            LJ("return");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        String str;
        o.LJIIIZ(activity, "activity");
        if (!o.LJ(activity, this.LJLIL)) {
            return;
        }
        this.LJLJL.LLZZLLIL();
        if (ActivityStack.isAppBackGround()) {
            str = "quit_app";
        } else {
            str = "next";
        }
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJLJLLL);
        LJJLIL.put("stay_time", Long.valueOf(System.currentTimeMillis() - this.LJLLI));
        LJJLIL.put("close_type", str);
        b.LJJIJIIJI("livesdk_tiktokec_mini_window_close", LJJLIL);
        if (this.LJLL <= 0) {
            return;
        }
        java.util.Map LJJLIL2 = C113554cx.LJJLIL(this.LJLJLLL);
        LJJLIL2.put("duration", Long.valueOf(System.currentTimeMillis() - this.LJLL));
        LJJLIL2.put("close_type", str);
        b.LJJIJIIJI("livesdk_tiktokec_mini_window_live_duration", LJJLIL2);
        this.LJLL = 0L;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        String str;
        EnterRoomConfig.RoomsData roomsData;
        o.LJIIIZ(e, "e");
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJLJLLL);
        Activity previousActivity = ActivityStack.getPreviousActivity();
        Long l = null;
        if (previousActivity != null) {
            str = previousActivity.getLocalClassName();
        } else {
            str = null;
        }
        if (o.LJ(str, "com.ss.android.ugc.aweme.live.LivePlayActivity")) {
            Object obj = ((LinkedHashMap) this.LJLJLLL).get("list_source_content_id");
            EnterRoomConfig enterRoomConfig = this.LJLILLLLZI;
            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                l = Long.valueOf(roomsData.roomId);
            }
            if (o.LJ(obj, String.valueOf(l))) {
                this.LJLIL.onBackPressed();
                LJJLIL.put("return_type", "back_to_live");
                b.LJJIJIIJI("livesdk_tiktokec_mini_window_return_full", LJJLIL);
                return true;
            }
        }
        C78461Uqn LJIILL = LiveOuterService.LJJJLL().LJIILL();
        C1AU c1au = this.LJLIL;
        EnterRoomConfig enterRoomConfig2 = this.LJLILLLLZI;
        if (enterRoomConfig2 != null) {
            LJIILL.LJIILJJIL(c1au, enterRoomConfig2);
            LJJLIL.put("return_type", "create_new_live");
            b.LJJIJIIJI("livesdk_tiktokec_mini_window_return_full", LJJLIL);
            return true;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r1 != 3) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC71861SIf.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJ(int i, int i2, View view) {
        Number number;
        int LIZ;
        Number number2;
        CardView cardView = this.LJLJJL;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i <= i2) {
                marginLayoutParams.height = C7MY.LIZIZ(185);
                if (i > 0) {
                    number2 = Float.valueOf((i * 185.0f) / i2);
                } else {
                    number2 = 104;
                }
                marginLayoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(number2));
                View findViewById = this.LJLJJL.findViewById(R.id.len);
                o.LJIIIIZZ(findViewById, "cardView.top_cover");
                findViewById.setVisibility(0);
                View findViewById2 = this.LJLJJL.findViewById(R.id.aph);
                o.LJIIIIZZ(findViewById2, "cardView.bottom_cover");
                findViewById2.setVisibility(0);
                View findViewById3 = this.LJLJJL.findViewById(R.id.j2a);
                o.LJIIIIZZ(findViewById3, "cardView.right_cover");
                findViewById3.setVisibility(8);
            } else {
                marginLayoutParams.width = C7MY.LIZIZ(180);
                if (i2 > 0) {
                    number = Float.valueOf((i2 * 180.0f) / i);
                } else {
                    number = 100;
                }
                marginLayoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(number));
                View findViewById4 = this.LJLJJL.findViewById(R.id.len);
                o.LJIIIIZZ(findViewById4, "cardView.top_cover");
                findViewById4.setVisibility(8);
                View findViewById5 = this.LJLJJL.findViewById(R.id.aph);
                o.LJIIIIZZ(findViewById5, "cardView.bottom_cover");
                findViewById5.setVisibility(8);
                View findViewById6 = this.LJLJJL.findViewById(R.id.j2a);
                o.LJIIIIZZ(findViewById6, "cardView.right_cover");
                findViewById6.setVisibility(0);
            }
            Object parent = this.LJLJJL.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            if (C26338AVi.LIZLLL(view2)) {
                LIZ = C7MY.LIZIZ(16);
            } else {
                LIZ = C47135Ieh.LIZ(16, view2.getWidth() - marginLayoutParams.width);
            }
            marginLayoutParams.leftMargin = LIZ;
            marginLayoutParams.topMargin = C47135Ieh.LIZ(186, view2.getHeight() - marginLayoutParams.height);
            cardView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public ViewOnTouchListenerC71861SIf(ActivityC45651qj activityC45651qj, StreamUrlStruct stream, EnterRoomConfig enterRoomConfig, String closeTimeKey, java.util.Map params, XKS xks) {
        String str;
        int i;
        o.LJIIIZ(stream, "stream");
        o.LJIIIZ(closeTimeKey, "closeTimeKey");
        o.LJIIIZ(params, "params");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = enterRoomConfig;
        this.LJLJI = closeTimeKey;
        this.LJLJJI = xks;
        Activity previousActivity = ActivityStack.getPreviousActivity();
        if (previousActivity != null) {
            str = previousActivity.getLocalClassName();
        } else {
            str = null;
        }
        this.LJLJLJ = !o.LJ(str, "com.ss.android.ugc.aweme.live.LivePlayActivity");
        java.util.Map<String, Object> LJJLIL = C113554cx.LJJLIL(params);
        if (enterRoomConfig != null) {
            LJJLIL.put("room_id", Long.valueOf(enterRoomConfig.mRoomsData.roomId));
        }
        LJJLIL.put("is_ad", 0);
        this.LJLJLLL = LJJLIL;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        LJJJLL.LJJIJIL().LJLLJ();
        View findViewById = activityC45651qj.findViewById(android.R.id.content);
        o.LJIIIIZZ(findViewById, "rootActivity.findViewById(android.R.id.content)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        CardView cardView = (CardView) OUP.LJIL(R.layout.ao2, viewGroup, false);
        this.LJLJJL = cardView;
        cardView.LIZLLL(0, 0, 0, 0);
        TuxIconView tuxIconView = (TuxIconView) cardView.findViewById(R.id.guh);
        if (this.LJLJLJ) {
            i = R.raw.icon_speaker_x_mark_ltr;
        } else {
            i = R.raw.icon_speaker_2_ltr;
        }
        tuxIconView.setIconRes(i);
        viewGroup.addView(cardView);
        LiveRoomStruct liveRoomStruct = new LiveRoomStruct();
        liveRoomStruct.stream_url = stream;
        this.LJLJJLL = liveRoomStruct;
        C32186CkA LJJJJZI = LJJJLL.LJJJJZI(this, EnumC72797Shd.SEARCH);
        o.LJIIIIZZ(LJJJJZI, "liveOuterService.generat…ayHelper.PageType.SEARCH)");
        this.LJLJL = LJJJJZI;
        if (V1B.LJJZZI(activityC45651qj, false)) {
            LJJJJZI.i(this.LJLJLJ, liveRoomStruct, (FrameLayout) cardView.findViewById(R.id.bs8), false, null);
        }
        activityC45651qj.getApplication().registerActivityLifecycleCallbacks(this);
        this.LJLZ = new GestureDetector(activityC45651qj, this);
    }
}
