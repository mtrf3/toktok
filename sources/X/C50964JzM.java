package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JzM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50964JzM implements Application.ActivityLifecycleCallbacks {
    public static final C50964JzM LJLIL = new C50964JzM();
    public static final ArrayList<OSZ<Activity, C50965JzN>> LJLILLLLZI = new ArrayList<>();
    public static boolean LJLJI;

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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    public static C50965JzN LIZJ() {
        OSZ osz = (OSZ) ORZ.LLFII(LJLILLLLZI);
        if (osz != null) {
            return (C50965JzN) osz.getSecond();
        }
        return null;
    }

    public static void LIZLLL() {
        C50965JzN LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.LIZIZ = 0;
            LIZJ.LIZJ = 0L;
            LIZJ.LIZLLL = 0L;
            LIZJ.LJ = 0L;
            LIZJ.LJFF = "video_detail_page";
            LIZJ.LIZJ = SystemClock.uptimeMillis();
            LIZJ.LIZIZ = 1;
        }
    }

    public static void LIZ(Activity activity) {
        Iterator<OSZ<Activity, C50965JzN>> it = LJLILLLLZI.iterator();
        o.LJIIIIZZ(it, "searchResultActivityList.iterator()");
        while (it.hasNext()) {
            OSZ<Activity, C50965JzN> next = it.next();
            o.LJIIIIZZ(next, "iterator.next()");
            if (o.LJ(next.getFirst(), activity)) {
                it.remove();
            }
        }
        LJLILLLLZI.add(new OSZ<>(activity, new C50965JzN(activity)));
    }

    public static void LJ(Activity activity) {
        Iterator<OSZ<Activity, C50965JzN>> it = LJLILLLLZI.iterator();
        o.LJIIIIZZ(it, "searchResultActivityList.iterator()");
        while (it.hasNext()) {
            OSZ<Activity, C50965JzN> next = it.next();
            o.LJIIIIZZ(next, "iterator.next()");
            OSZ<Activity, C50965JzN> osz = next;
            if (o.LJ(osz.getFirst(), activity)) {
                osz.getSecond();
                it.remove();
                return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof K01) {
            LJ(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C50965JzN LIZJ;
        o.LJIIIZ(activity, "activity");
        if ((activity instanceof K01) && (LIZJ = LIZJ()) != null) {
            LIZJ.LIZIZ = 0;
            LIZJ.LIZJ = 0L;
            LIZJ.LIZLLL = 0L;
            LIZJ.LJ = 0L;
            LIZJ.LJFF = "unknown";
        }
    }

    @QD3
    public final void onVideoPlayerStatus(C46276IEe event) {
        C50965JzN LIZJ;
        String str;
        int i;
        o.LJIIIZ(event, "event");
        int i2 = event.LJLIL;
        if ((i2 == 3 || i2 == 5 || i2 == 2) && (LIZJ = LIZJ()) != null && LIZJ.LIZIZ == 2) {
            LIZJ.LJ = SystemClock.uptimeMillis();
            LIZJ.LIZIZ = 3;
            if (o.LJ(LIZJ.LJFF, "video_detail_page")) {
                Activity activity = LIZJ.LIZ;
                o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                SearchResultParam searchResultParam = ((SearchStartViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(SearchStartViewModel.class)).LLD;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("click_2_create", LIZJ.LIZLLL - LIZJ.LIZJ);
                jSONObject.put("create_2_play", LIZJ.LJ - LIZJ.LIZLLL);
                jSONObject.put("click_2_play", LIZJ.LJ - LIZJ.LIZJ);
                jSONObject.put("type", LIZJ.LJFF);
                if (searchResultParam == null || (str = searchResultParam.getKeyword()) == null) {
                    str = "";
                }
                jSONObject.put("keyword", str);
                if (searchResultParam != null) {
                    i = searchResultParam.getIndex();
                } else {
                    i = 0;
                }
                jSONObject.put("page_index", i);
                LIZJ.LIZIZ = 0;
                LIZJ.LIZJ = 0L;
                LIZJ.LIZLLL = 0L;
                LIZJ.LJ = 0L;
                LIZJ.LJFF = "unknown";
                FMX.LJIILJJIL("search_detail_video_play", jSONObject);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C50965JzN LIZJ;
        o.LJIIIZ(activity, "activity");
        if (activity instanceof K01) {
            LIZ(activity);
        } else {
            if (!(activity instanceof InterfaceC224908sA) || (LIZJ = LIZJ()) == null || LIZJ.LIZIZ != 1) {
                return;
            }
            LIZJ.LIZLLL = SystemClock.uptimeMillis();
            LIZJ.LIZIZ = 2;
        }
    }
}
