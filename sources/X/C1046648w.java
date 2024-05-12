package X;

import Y.IDAListenerS229S0100000_1;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.ActionBarComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.48w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1046648w {
    public final FrameLayout LIZ;
    public final AlphaAnimation LIZIZ;
    public ActionBarComponent LIZJ;
    public final java.util.Map<String, Boolean> LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;

    public C1046648w(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LIZIZ = new AlphaAnimation(1.0f, 0.0f);
        this.LIZ = (FrameLayout) rootView.findViewById(R.id.nn);
        rootView.findViewById(R.id.hho);
        this.LIZLLL = new LinkedHashMap();
        this.LJ = C221108m2.LIZIZ(new AqS151S0100000_1(rootView, 25));
        this.LJFF = C221108m2.LIZIZ(new AqS151S0100000_1(rootView, 24));
        this.LJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 27));
        this.LJII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 26));
    }

    public final void LIZ(final String str, boolean z, boolean z2) {
        FrameLayout frameLayout;
        this.LIZLLL.put(str, Boolean.valueOf(z));
        if (!z2) {
            Iterator it = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
            while (it.hasNext()) {
                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                }
            }
            FrameLayout frameLayout2 = this.LIZ;
            if (frameLayout2 != null && frameLayout2.getVisibility() == 0) {
                return;
            }
            AlphaAnimation LIZIZ = C62850Ola.LIZIZ(0.0f, 1.0f, 200L);
            LIZIZ.setAnimationListener(new IDAListenerS229S0100000_1(this, 1));
            FrameLayout frameLayout3 = this.LIZ;
            if (frameLayout3 != null) {
                frameLayout3.startAnimation(LIZIZ);
            }
            FrameLayout frameLayout4 = this.LIZ;
            if (frameLayout4 == null) {
                return;
            }
            C17N.LJJLIIIJJI(frameLayout4);
            return;
        }
        FrameLayout frameLayout5 = this.LIZ;
        if (frameLayout5 != null) {
            frameLayout5.clearAnimation();
        }
        FrameLayout frameLayout6 = this.LIZ;
        if (frameLayout6 != null && frameLayout6.getVisibility() == 8) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1120172242) {
            if (hashCode != -1039745817) {
                if (hashCode == 2122922074 && str.equals("bottom_banner_not_showing")) {
                    if (!o.LJ(((LinkedHashMap) this.LIZLLL).get("bottom_banner_not_showing"), Boolean.TRUE) || (frameLayout = this.LIZ) == null) {
                        return;
                    }
                    C17N.LJJIIJZLJL(frameLayout);
                    return;
                }
            } else if (str.equals("normal")) {
                if (o.LJ(((LinkedHashMap) this.LIZLLL).get("message_long_pressed"), Boolean.TRUE)) {
                    FrameLayout frameLayout7 = this.LIZ;
                    if (frameLayout7 == null) {
                        return;
                    }
                    frameLayout7.setVisibility(4);
                    return;
                }
                AlphaAnimation alphaAnimation = this.LIZIZ;
                alphaAnimation.setDuration(120L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.48v
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        if (o.LJ(str, "message_long_pressed")) {
                            FrameLayout frameLayout8 = this.LIZ;
                            if (frameLayout8 != null) {
                                frameLayout8.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        FrameLayout frameLayout9 = this.LIZ;
                        if (frameLayout9 == null) {
                            return;
                        }
                        C17N.LJJIIJZLJL(frameLayout9);
                    }
                });
                FrameLayout frameLayout8 = this.LIZ;
                if (frameLayout8 == null) {
                    return;
                }
                frameLayout8.startAnimation(this.LIZIZ);
                return;
            }
        } else if (str.equals("keyboard_minimized")) {
            FrameLayout frameLayout9 = this.LIZ;
            if (frameLayout9 == null) {
                return;
            }
            C17N.LJJIIJZLJL(frameLayout9);
            return;
        }
        AlphaAnimation alphaAnimation2 = this.LIZIZ;
        alphaAnimation2.setDuration(120L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: X.48v
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (o.LJ(str, "message_long_pressed")) {
                    FrameLayout frameLayout82 = this.LIZ;
                    if (frameLayout82 != null) {
                        frameLayout82.setVisibility(4);
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout92 = this.LIZ;
                if (frameLayout92 == null) {
                    return;
                }
                C17N.LJJIIJZLJL(frameLayout92);
            }
        });
        FrameLayout frameLayout10 = this.LIZ;
        if (frameLayout10 == null) {
            return;
        }
        frameLayout10.startAnimation(this.LIZIZ);
    }
}
