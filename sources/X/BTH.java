package X;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerWindowSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BTH implements Application.ActivityLifecycleCallbacks, View.OnTouchListener {
    public static boolean LJLILLLLZI;
    public static ViewGroup LJLJI;
    public static int LJLJJI;
    public static ViewGroup.LayoutParams LJLJJL;
    public static DialogFragment LJLJJLL;
    public static ViewGroup LJLJL;
    public static View LJLJLJ;
    public static boolean LJLL;
    public static boolean LJLLI;
    public static long LJLLILLLL;
    public static long LJLLJ;
    public static LivePlayFragment LJLLLLLL;
    public static float LJZI;
    public static float LJZL;
    public static int LL;
    public static int LLD;
    public static long LLF;
    public static final BTH LJLIL = new BTH();
    public static final java.util.Map<Activity, ViewGroup> LJLJLLL = new LinkedHashMap();
    public static String LJLLL = "";
    public static final java.util.Map<String, String> LJLLLL = new LinkedHashMap();
    public static final int LJLZ = C7MY.LIZIZ(16);
    public static final int LJZ = C7MY.LIZIZ(118);
    public static final java.util.Map<String, String> LLFF = C113554cx.LJJL(new OSZ("/obj/byte-gurd-source-sg/tiktok/fe/live/fe_tiktok_ecommerce_shop_cart/all/pages/main/template.js", "cart"), new OSZ("/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_ecommerce_voucher_products_panel/pages/voucher_products_list_2/template.js", "add_on_item"));

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
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    public static final void LJI() {
        if (LJLLILLLL > 0) {
            java.util.Map LJJLIL = C113554cx.LJJLIL(LJLLLL);
            LJJLIL.put("page_name", LJLLL);
            OSZ osz = new OSZ("duration", String.valueOf(LJLLILLLL));
            LJJLIL.put(osz.getFirst(), osz.getSecond());
            BZI LIZ = C28787BRn.LIZ("livesdk_tiktokec_mini_window_live_duration");
            LIZ.LJJIFFI(LJJLIL);
            LIZ.LJJIIJZLJL();
            LJLLILLLL = 0L;
        }
    }

    public static final void LJIIIIZZ() {
        ViewParent viewParent;
        ViewGroup viewGroup = LJLJL;
        if (viewGroup != null) {
            if (LJLLJ > 0) {
                LJLLILLLL = (SystemClock.elapsedRealtime() - LJLLJ) + LJLLILLLL;
            }
            ViewParent parent = viewGroup.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(viewGroup, (ViewGroup) parent);
            View view = LJLJLJ;
            if (view != null) {
                viewParent = view.getParent();
            } else {
                viewParent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewParent;
            if (viewGroup2 != null) {
                C16880lQ.LJLLL(LJLJLJ, viewGroup2);
            }
            ViewGroup viewGroup3 = LJLJI;
            if (viewGroup3 != null) {
                viewGroup3.addView(LJLJLJ, LJLJJI, LJLJJL);
            }
            LJLJI = null;
            LJLJJL = null;
            LJLJL = null;
            LJLJLJ = null;
        }
        ((LinkedHashMap) LJLJLLL).clear();
        LJLLJ = 0L;
        LJLL = false;
        LJLLI = false;
        if (LJLILLLLZI) {
            LivePlayFragment livePlayFragment = LJLLLLLL;
            if (livePlayFragment != null) {
                livePlayFragment.vm("internal window reset", false);
            }
            LJLILLLLZI = false;
        }
        if (LJLJJLL != null) {
            LJLJJLL = null;
        }
    }

    public static final void LIZ(boolean z) {
        ViewParent viewParent;
        ViewGroup viewGroup = LJLJL;
        if (viewGroup != null) {
            if (z) {
                BTH bth = LJLIL;
                OSZ[] oszArr = {new OSZ("close_type", "auto")};
                bth.getClass();
                LJIIIZ("livesdk_tiktokec_mini_window_close", oszArr);
            } else {
                LJLILLLLZI = true;
                LivePlayFragment livePlayFragment = LJLLLLLL;
                if (livePlayFragment != null) {
                    livePlayFragment.vm("internal window user close", true);
                }
                BTH bth2 = LJLIL;
                OSZ[] oszArr2 = {new OSZ("close_type", "manual")};
                bth2.getClass();
                LJIIIZ("livesdk_tiktokec_mini_window_close", oszArr2);
            }
            if (LJLLJ > 0) {
                LJLLILLLL = (SystemClock.elapsedRealtime() - LJLLJ) + LJLLILLLL;
            }
            ViewParent parent = viewGroup.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(viewGroup, (ViewGroup) parent);
            View view = LJLJLJ;
            if (view != null) {
                viewParent = view.getParent();
            } else {
                viewParent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewParent;
            if (viewGroup2 != null) {
                C16880lQ.LJLLL(LJLJLJ, viewGroup2);
            }
            ViewGroup viewGroup3 = LJLJI;
            if (viewGroup3 != null) {
                viewGroup3.addView(LJLJLJ, LJLJJI, LJLJJL);
            }
            LJLJI = null;
            LJLJJL = null;
            LJLJL = null;
            LJLJLJ = null;
        }
        ((LinkedHashMap) LJLJLLL).clear();
        LJLLJ = 0L;
        LJLL = true;
    }

    public static ViewGroup LIZJ(Activity activity) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJLJLLL;
        Object obj = linkedHashMap.get(activity);
        if (obj == null) {
            Object findViewById = activity.findViewById(R.id.content);
            o.LJIIIIZZ(findViewById, "findViewById(android.R.id.content)");
            obj = (ViewGroup) findViewById;
            linkedHashMap.put(activity, obj);
        }
        return (ViewGroup) obj;
    }

    public static ViewGroup LIZLLL(DialogFragment dialogFragment) {
        Window window;
        Dialog dialog = dialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            return (ViewGroup) window.findViewById(R.id.content);
        }
        return null;
    }

    public static String LJ(Activity activity) {
        String str;
        if (activity instanceof SparkActivity) {
            SparkContext sparkContext = ((SparkActivity) activity).LJLIL;
            if (sparkContext != null && (str = sparkContext.url) != null) {
                android.net.Uri parse = UriProtector.parse(str);
                o.LJIIIIZZ(parse, "Uri.parse(this)");
                return LJFF(parse);
            }
        } else {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "in_window");
            if (LLJJIJIIJIL != null) {
                return LLJJIJIIJIL;
            }
            android.net.Uri uri = (android.net.Uri) activity.getIntent().getParcelableExtra("bundle_uri");
            if (uri != null) {
                return LJFF(uri);
            }
        }
        return null;
    }

    public static String LJFF(android.net.Uri uri) {
        String queryParameter = UriProtector.getQueryParameter(uri, "in_window");
        if (queryParameter == null) {
            String queryParameter2 = UriProtector.getQueryParameter(uri, "url");
            if (queryParameter2 != null) {
                android.net.Uri parse = UriProtector.parse(queryParameter2);
                o.LJIIIIZZ(parse, "Uri.parse(this)");
                String path = parse.getPath();
                if (path != null) {
                    return LLFF.get(path);
                }
            }
            return null;
        }
        return queryParameter;
    }

    public static final void LJII(LivePlayFragment fragment) {
        ActivityC45651qj mo49getActivity;
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(fragment, "fragment");
        if (!LiveInnerWindowSetting.INSTANCE.getValue() || (mo49getActivity = fragment.mo49getActivity()) == null) {
            return;
        }
        if (LJLLLLLL == null) {
            Application application = mo49getActivity.getApplication();
            BTH bth = LJLIL;
            application.registerActivityLifecycleCallbacks(bth);
            bth.getClass();
            LJIIJ(fragment);
            return;
        }
        LJLIL.getClass();
        LivePlayFragment livePlayFragment = LJLLLLLL;
        if (livePlayFragment != null) {
            activityC45651qj = livePlayFragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        if (!o.LJ(activityC45651qj, mo49getActivity)) {
            return;
        }
        LJIIJ(fragment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r1 == true) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r4) {
        /*
            X.BTH.LJLLLLLL = r4
            r3 = 0
            if (r4 == 0) goto La5
            java.util.Map<java.lang.String, java.lang.String> r2 = X.BTH.LJLLLL
            java.lang.String r1 = "EVENT_ORIGIN_FEATURE"
            java.lang.String r0 = "TEMAI"
            r2.put(r1, r0)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.LLLZL
            if (r0 == 0) goto Lb7
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            if (r0 == 0) goto Lb7
            java.lang.String r0 = r0.anchorId
        L18:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "author_id"
            r2.put(r0, r1)
            long r0 = r4.LJLIL
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "room_id"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.LLLZL
            if (r0 == 0) goto Lb5
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lb5
            java.lang.String r0 = r0.enterFromMerge
        L36:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "enter_from_merge"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.LLLZL
            if (r0 == 0) goto Lb3
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r0.enterMethod
        L49:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "enter_method"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.LLLZL
            if (r0 == 0) goto Lb1
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lb1
            java.lang.String r0 = r0.actionType
        L5c:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "action_type"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.LLLZL
            if (r0 == 0) goto Laf
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Laf
            java.lang.String r0 = r0.followStatus
        L6f:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "follow_status"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.LLLZL
            if (r0 == 0) goto Lad
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lad
            boolean r1 = r0.enterFromAd
            r0 = 1
            if (r1 != r0) goto Lad
        L85:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_ad"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.LLLZL
            if (r0 == 0) goto L98
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            if (r0 == 0) goto L98
            java.lang.String r3 = r0.requestId
        L98:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "request_id"
            r2.put(r0, r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lac
        La5:
            java.util.Map<java.lang.String, java.lang.String> r0 = X.BTH.LJLLLL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
        Lac:
            return
        Lad:
            r0 = 0
            goto L85
        Laf:
            r0 = r3
            goto L6f
        Lb1:
            r0 = r3
            goto L5c
        Lb3:
            r0 = r3
            goto L49
        Lb5:
            r0 = r3
            goto L36
        Lb7:
            r0 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTH.LJIIJ(com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LJLJLLL.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ActivityC45651qj mo49getActivity;
        ActivityC45651qj mo49getActivity2;
        Application application;
        o.LJIIIZ(activity, "activity");
        LivePlayFragment livePlayFragment = LJLLLLLL;
        if (livePlayFragment == null || (mo49getActivity = livePlayFragment.mo49getActivity()) == null) {
            return;
        }
        if (!o.LJ(mo49getActivity, activity)) {
            boolean z = false;
            if (mo49getActivity.isFinishing()) {
                LivePlayFragment livePlayFragment2 = LJLLLLLL;
                if (livePlayFragment2 != null && (mo49getActivity2 = livePlayFragment2.mo49getActivity()) != null && (application = mo49getActivity2.getApplication()) != null) {
                    application.unregisterActivityLifecycleCallbacks(this);
                }
                LJIIJ(null);
                LJLJI = null;
                LJLJJL = null;
                LJLJL = null;
                LJLJLJ = null;
                ((LinkedHashMap) LJLJLLL).clear();
                LJLLJ = 0L;
                LJLL = false;
                LJLLI = false;
                LJLILLLLZI = false;
                LJLJJLL = null;
                return;
            }
            if (LJLLI) {
                activity.finish();
                return;
            }
            if (!LJLL) {
                String LJ = LJ(activity);
                if (LJ == null || ujb.o.LJJJJJL(LJ)) {
                    z = true;
                }
                LJLL = z;
            }
            LJIIJJI(activity, null);
            return;
        }
        DialogFragment dialogFragment = LJLJJLL;
        if (dialogFragment != null) {
            if (LJLLI) {
                dialogFragment.dismiss();
                return;
            } else {
                if (((LinkedHashMap) LJLJLLL).get(activity) == null) {
                    return;
                }
                LJIIJJI(activity, null);
                return;
            }
        }
        LJIIIIZZ();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object obj;
        Context context;
        o.LJIIIZ(activity, "activity");
        if (LJLLJ > 0) {
            ViewGroup viewGroup = LJLJL;
            Activity activity2 = null;
            if (viewGroup != null) {
                obj = viewGroup.getParent();
            } else {
                obj = null;
            }
            View view = (View) obj;
            if (view != null && (context = view.getContext()) != null) {
                activity2 = C45804HyK.LJIJJ(context);
            }
            if (o.LJ(activity2, activity)) {
                LJLLILLLL = (SystemClock.elapsedRealtime() - LJLLJ) + LJLLILLLL;
                LJLLJ = 0L;
            }
        }
    }

    public static void LJIIIZ(String str, OSZ... oszArr) {
        Object obj;
        ViewGroup viewGroup;
        Bundle arguments;
        ViewGroup viewGroup2 = LJLJL;
        String str2 = null;
        if (viewGroup2 != null) {
            obj = viewGroup2.getParent();
        } else {
            obj = null;
        }
        View view = (View) obj;
        if (view == null) {
            return;
        }
        DialogFragment dialogFragment = LJLJJLL;
        if (dialogFragment != null) {
            viewGroup = LIZLLL(dialogFragment);
        } else {
            viewGroup = null;
        }
        if (o.LJ(viewGroup, view)) {
            DialogFragment dialogFragment2 = LJLJJLL;
            if (dialogFragment2 != null && (arguments = dialogFragment2.getArguments()) != null) {
                str2 = arguments.getString("in_window");
            }
        } else {
            Activity LIZ = FT5.LIZ(view, "contentView.context");
            if (LIZ != null) {
                str2 = LJ(LIZ);
            }
        }
        java.util.Map LJJLIL = C113554cx.LJJLIL(LJLLLL);
        if (str2 == null) {
            str2 = "";
        }
        LJJLIL.put("page_name", str2);
        C113554cx.LJJLIIIJL(LJJLIL, oszArr);
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJJIFFI(LJJLIL);
        LIZ2.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r5 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.app.Activity r11, androidx.fragment.app.DialogFragment r12) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTH.LJIIJJI(android.app.Activity, androidx.fragment.app.DialogFragment):void");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        Object parent = v.getParent();
                        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        View view = (View) parent;
                        int LJJIIZ = O6R.LJJIIZ(event.getRawX() - LJZI) + LL;
                        int LJJIIZ2 = O6R.LJJIIZ(event.getRawY() - LJZL) + LLD;
                        int i = LJLZ;
                        marginLayoutParams.setMarginStart(Math.min(Math.max(i, LJJIIZ), (view.getWidth() - i) - v.getWidth()));
                        int i2 = LJZ;
                        marginLayoutParams.topMargin = Math.min(Math.max(i2, LJJIIZ2), (view.getHeight() - i2) - v.getHeight());
                        v.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            } else {
                Object parent2 = v.getParent();
                o.LJII(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                Context context = ((View) parent2).getContext();
                o.LJIIIIZZ(context, "v.parent as ViewGroup).context");
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (System.currentTimeMillis() - LLF >= 100) {
                    LJIIIZ("livesdk_tiktokec_mini_window_move", new OSZ[0]);
                } else {
                    LivePlayFragment livePlayFragment = LJLLLLLL;
                    if (livePlayFragment != null) {
                        activityC45651qj = livePlayFragment.mo49getActivity();
                    } else {
                        activityC45651qj = null;
                    }
                    if (!o.LJ(activityC45651qj, LJIJJ)) {
                        LJLLI = true;
                        if (LJIJJ != null) {
                            LJIJJ.finish();
                        }
                    } else {
                        DialogFragment dialogFragment = LJLJJLL;
                        if (dialogFragment != null) {
                            dialogFragment.dismiss();
                        }
                    }
                    LJIIIZ("livesdk_tiktokec_mini_window_return_full", new OSZ[0]);
                }
            }
        } else {
            LLF = System.currentTimeMillis();
            LJZI = event.getRawX();
            LJZL = event.getRawY();
            ViewGroup.LayoutParams layoutParams2 = v.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            LL = marginLayoutParams2.getMarginStart();
            LLD = marginLayoutParams2.topMargin;
        }
        return true;
    }
}
