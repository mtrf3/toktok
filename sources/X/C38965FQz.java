package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashMap;

/* renamed from: X.FQz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38965FQz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z) {
        C78897Uxp.LJLIL = z;
        if (!z) {
            return;
        }
        C78897Uxp.LJLILLLLZI = new C38964FQy();
        if (!C25200yq.LIZ) {
            Context LIZIZ = EF7.LIZIZ();
            if (!C78897Uxp.LJLIL) {
                return;
            }
            try {
                ((Application) C16880lQ.LLLLL(LIZIZ)).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0yp
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(final Activity activity) {
                        System.currentTimeMillis();
                        if (!C78897Uxp.LJLIL) {
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                        for (int i = 0; i < viewGroup.getChildCount(); i++) {
                            if (viewGroup.getChildAt(i) instanceof C264311z) {
                                return;
                            }
                        }
                        FrameLayout frameLayout = new FrameLayout(activity) { // from class: X.11z
                            public static final /* synthetic */ int LJLIL = 0;

                            @Override // android.view.View, android.view.ViewParent
                            public final void requestLayout() {
                                if (C16880lQ.LLJJJJ() != Looper.myLooper() && C78897Uxp.LJLILLLLZI != null) {
                                    C78897Uxp.LJLILLLLZI.LIZ(new HashMap());
                                }
                                super.requestLayout();
                            }

                            @Override // android.view.ViewGroup, android.view.View
                            public final void dispatchDraw(Canvas canvas) {
                                C78897Uxp.LJLILLLLZI.LIZJ(this, true);
                                super.dispatchDraw(canvas);
                                C78897Uxp.LJLILLLLZI.LIZJ(this, false);
                            }

                            @Override // android.view.ViewGroup, android.view.View
                            public final boolean gatherTransparentRegion(Region region) {
                                if (!((Boolean) C34839Dlr.LIZ.getValue()).booleanValue()) {
                                    return super.gatherTransparentRegion(region);
                                }
                                Object context = getContext();
                                if (!(context instanceof InterfaceC55380LoO)) {
                                    return super.gatherTransparentRegion(region);
                                }
                                if (!((InterfaceC55380LoO) context).enableSkipGatherRegion()) {
                                    return super.gatherTransparentRegion(region);
                                }
                                return true;
                            }

                            @Override // android.view.ViewGroup, android.view.ViewParent
                            public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
                                if (C16880lQ.LLJJJJ() != Looper.myLooper() && C78897Uxp.LJLILLLLZI != null) {
                                    C78897Uxp.LJLILLLLZI.LIZ(new HashMap());
                                }
                                return super.invalidateChildInParent(iArr, rect);
                            }

                            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                            public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                                C78897Uxp.LJLILLLLZI.LIZIZ(this, true);
                                super.onLayout(z2, i2, i3, i4, i5);
                                C78897Uxp.LJLILLLLZI.LIZIZ(this, false);
                            }
                        };
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        while (viewGroup.getChildCount() > 0) {
                            View childAt = viewGroup.getChildAt(0);
                            C16880lQ.LJLLL(childAt, viewGroup);
                            frameLayout.addView(childAt);
                        }
                        viewGroup.addView(frameLayout, 0);
                    }
                });
                C25200yq.LIZ = true;
            } catch (Throwable unused) {
            }
        }
    }
}
