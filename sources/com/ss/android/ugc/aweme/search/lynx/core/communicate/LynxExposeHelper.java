package com.ss.android.ugc.aweme.search.lynx.core.communicate;

import X.C141335gf;
import X.C3C5;
import X.C48966JJq;
import X.C50989Jzl;
import X.C68182ly;
import X.C76800UCe;
import X.KO9;
import X.KOA;
import X.KOB;
import X.KOC;
import X.KOE;
import X.KOG;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class LynxExposeHelper {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes9.dex */
    public static final class ExposeView implements GenericLifecycleObserver {
        public final WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS> LJLIL;
        public final KOG LJLILLLLZI;
        public Lifecycle.Event LJLJI = Lifecycle.Event.ON_ANY;
        public boolean LJLJJI;
        public boolean LJLJJL;
        public ViewTreeObserver LJLJJLL;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
            } else if (event == Lifecycle.Event.ON_START) {
                onStart();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        private final void onPause() {
            this.LJLJI = Lifecycle.Event.ON_PAUSE;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        private final void onResume() {
            this.LJLJI = Lifecycle.Event.ON_RESUME;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        private final void onStart() {
            this.LJLJI = Lifecycle.Event.ON_START;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        private final void onStop() {
            this.LJLJI = Lifecycle.Event.ON_STOP;
        }

        public final void LIZJ() {
            ViewTreeObserver viewTreeObserver;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL.get();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                viewTreeObserver = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            this.LJLJJLL = viewTreeObserver;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.KOD r7) {
            /*
                r6 = this;
                java.lang.ref.WeakReference<X.NtS> r0 = r6.LJLIL
                java.lang.Object r5 = r0.get()
                android.view.View r5 = (android.view.View) r5
                if (r5 == 0) goto Laa
                boolean r0 = r5.isAttachedToWindow()
                r4 = 1
                if (r0 != 0) goto L47
            L11:
                r2 = 0
            L12:
                boolean r0 = r6.LJLJJI
                if (r2 == r0) goto Laa
                X.1qj r0 = X.C48966JJq.LIZ(r5)
                if (r0 != 0) goto L22
                com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity r0 = X.C50989Jzl.LJ()
                if (r0 == 0) goto L45
            L22:
                androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
                if (r0 == 0) goto L45
                java.util.List r0 = r0.LJJJJLI()
                if (r0 == 0) goto L45
                int r0 = r0.size()
                if (r0 <= r4) goto L45
            L34:
                X.KOD r0 = X.KOD.FOCUS
                if (r7 != r0) goto L3e
                androidx.lifecycle.Lifecycle$Event r1 = r6.LJLJI
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_ANY
                if (r1 == r0) goto L40
            L3e:
                if (r4 == 0) goto L9d
            L40:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_ANY
                r6.LJLJI = r0
                return
            L45:
                r4 = 0
                goto L34
            L47:
                boolean r0 = r5.hasWindowFocus()
                if (r0 != 0) goto L4e
                goto L11
            L4e:
                int r0 = r5.getWindowVisibility()
                if (r0 == 0) goto L55
                goto L11
            L55:
                boolean r0 = r5.isShown()
                if (r0 != 0) goto L5c
                goto L11
            L5c:
                int r0 = r5.getWidth()
                if (r0 <= 0) goto L11
                int r0 = r5.getHeight()
                if (r0 <= 0) goto L11
                float r1 = r5.getAlpha()
                r0 = 0
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 > 0) goto L72
                goto L11
            L72:
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                boolean r0 = r5.getGlobalVisibleRect(r2)
                if (r0 != 0) goto L7e
                goto L11
            L7e:
                int r0 = r5.getMeasuredWidth()
                int r3 = r5.getMeasuredHeight()
                int r3 = r3 * r0
                int r1 = r2.height()
                int r0 = r2.width()
                int r0 = r0 * r1
                float r2 = (float) r0
                float r1 = (float) r3
                r0 = 1008981770(0x3c23d70a, float:0.01)
                float r1 = r1 * r0
                int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r0 < 0) goto L11
                r2 = 1
                goto L12
            L9d:
                X.KOG r0 = r6.LJLILLLLZI
                if (r0 == 0) goto La4
                r0.LIZ(r2)
            La4:
                r6.LJLJJI = r2
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_ANY
                r6.LJLJI = r0
            Laa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper.ExposeView.LIZIZ(X.KOD):void");
        }

        public ExposeView(WeakReference weakReference, KOE koe) {
            ViewTreeObserver viewTreeObserver;
            this.LJLIL = weakReference;
            this.LJLILLLLZI = koe;
            View view = (View) weakReference.get();
            if (view != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            this.LJLJJLL = viewTreeObserver;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) weakReference.get();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                String url = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getUrl();
                KOB kob = new KOB(url, this);
                KOA koa = new KOA(url, this);
                KOC koc = new KOC(url, this);
                LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, kob, koa, koc);
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.addOnAttachStateChangeListener(new KO9(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, kob, koa, koc));
            }
        }

        public final void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
            Object LIZ;
            if (!this.LJLJJL) {
                LifecycleOwner LIZ2 = C48966JJq.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                if (LIZ2 != null || (LIZ2 = C50989Jzl.LJ()) != null) {
                    C68182ly.LIZ(LIZ2, this);
                }
                ViewTreeObserver viewTreeObserver = this.LJLJJLL;
                if (viewTreeObserver != null) {
                    try {
                        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                        viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
                        viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                        LIZ = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                    if (m10exceptionOrNullimpl != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("viewTReeObserver error:");
                        LIZ3.append(m10exceptionOrNullimpl.getMessage());
                        X1D.LIZIZ(LIZ3);
                        LIZJ();
                    }
                }
                this.LJLJJL = true;
            }
        }
    }
}
