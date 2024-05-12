package com.bytedance.router.fragment;

import X.ActivityC45651qj;
import X.C16880lQ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.monitor.RouterMonitor;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FragmentRoute {
    public static final Companion Companion = new Companion();
    public final ActivityC45651qj activity;
    public OpenResultCallback callback;
    public int enterAnim;
    public int exitAnim;
    public Intent extraParams;
    public final Fragment fragment;
    public FragmentManager fragmentManager;
    public final FragmentNavigationContainer navigationContainer;
    public int popEnterAnim;
    public int popExitAnim;
    public PopOp popOp;
    public PushOp pushOp;
    public PushType pushType;
    public String url;

    public FragmentRoute(ActivityC45651qj activityC45651qj, FragmentNavigationContainer fragmentNavigationContainer) {
        this(activityC45651qj, null, fragmentNavigationContainer, 2, null);
    }

    public FragmentRoute(FragmentNavigationContainer fragmentNavigationContainer) {
        this(null, null, fragmentNavigationContainer, 3, null);
    }

    public final void commit() {
        commit$default(this, null, 1, null);
    }

    public final FragmentRoute pop() {
        pop$default(this, null, 1, null);
        return this;
    }

    public final FragmentRoute popTo(String str) {
        popTo$default(this, str, null, null, 6, null);
        return this;
    }

    public final FragmentRoute popTo(String str, String str2) {
        popTo$default(this, str, str2, null, 4, null);
        return this;
    }

    public final FragmentRoute push(String str) {
        push$default(this, str, null, null, 6, null);
        return this;
    }

    public final FragmentRoute push(String str, String str2) {
        push$default(this, str, str2, null, 4, null);
        return this;
    }

    private final RouteIntent buildRouteIntent() {
        FragmentNavigationContainer fragmentNavigationContainer = this.navigationContainer;
        FragmentNavigationRouteIntent.Builder builder = new FragmentNavigationRouteIntent.Builder();
        builder.withFragmentNavigationContainer(fragmentNavigationContainer);
        builder.withFragmentManager(this.fragmentManager);
        builder.withPushOp(this.pushOp);
        builder.withPopOp(this.popOp);
        builder.withFragment(this.fragment);
        builder.withParam(this.extraParams);
        builder.withCallback(this.callback);
        return builder.build();
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ActivityC45651qj getActivity() {
        return this.activity;
    }

    private final void processOps(boolean z) {
        PushOp pushOp = this.pushOp;
        if (pushOp != null) {
            pushOp.setImmediate(z);
            pushOp.setPushType(this.pushType);
            pushOp.setEnterAnim(this.enterAnim);
            pushOp.setExitAnim(this.exitAnim);
            pushOp.setPopEnterAnim(this.popEnterAnim);
            pushOp.setPopExitAnim(this.popExitAnim);
        }
        PopOp popOp = this.popOp;
        if (popOp != null) {
            popOp.setImmediate(z);
        }
    }

    public final void commit(Boolean bool) {
        boolean z;
        PopOp popOp;
        String str;
        Fragment fragment;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        processOps(z);
        PushOp pushOp = this.pushOp;
        if ((pushOp == null || (str = pushOp.getUrl()) == null) && ((popOp = this.popOp) == null || (str = popOp.getUrl()) == null)) {
            str = "";
        }
        RouteIntent buildRouteIntent = buildRouteIntent();
        if (buildRouteIntent != null) {
            buildRouteIntent.setRouteId(RouterMonitor.INSTANCE.startRoute(str));
            Context context = this.activity;
            if (context != null || ((fragment = buildRouteIntent.getFragment()) != null && (context = fragment.getContext()) != null)) {
                RouteManager.getInstance().fragmentNavigation(context, buildRouteIntent);
            }
        }
    }

    public final FragmentRoute pop(Boolean bool) {
        this.popOp = new PopOp(null, null, 3, null);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            PopOp popOp = this.popOp;
            if (popOp != null) {
                popOp.setTryFinishActivity(booleanValue);
            }
        }
        return this;
    }

    public final FragmentRoute withCallback(OpenResultCallback callback) {
        o.LJIIIZ(callback, "callback");
        this.callback = callback;
        return this;
    }

    public final FragmentRoute withFragmentManager(FragmentManager manager) {
        o.LJIIIZ(manager, "manager");
        this.fragmentManager = manager;
        return this;
    }

    public final FragmentRoute withNavArg(Parcelable parcelable) {
        if (parcelable != null) {
            this.extraParams.putExtra("smart_key_route_arg", parcelable);
        }
        return this;
    }

    public final FragmentRoute withParam(Intent intent) {
        o.LJIIIZ(intent, "intent");
        Intent intent2 = this.extraParams;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        intent2.putExtras(LLJJIJI);
        return this;
    }

    public final FragmentRoute withPushType(PushType pushType) {
        if (pushType != null) {
            this.pushType = pushType;
        }
        return this;
    }

    public final FragmentRoute withUrl(String url) {
        o.LJIIIZ(url, "url");
        this.url = url;
        return this;
    }

    public final FragmentRoute withParam(Bundle bundle) {
        this.extraParams.putExtras(bundle);
        return this;
    }

    public final FragmentRoute withParam(String str, byte b) {
        this.extraParams.putExtra(str, b);
        return this;
    }

    public final FragmentRoute withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
        this.extraParams.putCharSequenceArrayListExtra(str, arrayList);
        return this;
    }

    public final FragmentRoute withParamIntegerList(String str, ArrayList<Integer> arrayList) {
        this.extraParams.putIntegerArrayListExtra(str, arrayList);
        return this;
    }

    public final FragmentRoute withParamParcelableList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.extraParams.putParcelableArrayListExtra(str, arrayList);
        return this;
    }

    public final FragmentRoute withParamStringList(String str, ArrayList<String> arrayList) {
        this.extraParams.putStringArrayListExtra(str, arrayList);
        return this;
    }

    public final FragmentRoute withParam(String str, char c) {
        this.extraParams.putExtra(str, c);
        return this;
    }

    public final FragmentRoute withParam(String str, double d) {
        this.extraParams.putExtra(str, d);
        return this;
    }

    public final FragmentRoute withParam(String str, float f) {
        this.extraParams.putExtra(str, f);
        return this;
    }

    public final FragmentRoute withParam(String str, int i) {
        this.extraParams.putExtra(str, i);
        return this;
    }

    public final FragmentRoute withParam(String str, long j) {
        this.extraParams.putExtra(str, j);
        return this;
    }

    public final FragmentRoute withParam(String str, Bundle bundle) {
        this.extraParams.putExtra(str, bundle);
        return this;
    }

    public final FragmentRoute withParam(String str, Parcelable parcelable) {
        this.extraParams.putExtra(str, parcelable);
        return this;
    }

    public final FragmentRoute withParam(String str, Serializable serializable) {
        this.extraParams.putExtra(str, serializable);
        return this;
    }

    public final FragmentRoute withParam(String str, CharSequence charSequence) {
        this.extraParams.putExtra(str, charSequence);
        return this;
    }

    public final FragmentRoute withParam(String str, String str2) {
        this.extraParams.putExtra(str, str2);
        return this;
    }

    public final FragmentRoute withParam(String str, short s) {
        this.extraParams.putExtra(str, s);
        return this;
    }

    public final FragmentRoute withParam(String str, boolean z) {
        this.extraParams.putExtra(str, z);
        return this;
    }

    public final FragmentRoute withParam(String str, byte[] bArr) {
        this.extraParams.putExtra(str, bArr);
        return this;
    }

    public final FragmentRoute withParam(String str, char[] cArr) {
        this.extraParams.putExtra(str, cArr);
        return this;
    }

    public final FragmentRoute withParam(String str, double[] dArr) {
        this.extraParams.putExtra(str, dArr);
        return this;
    }

    public final FragmentRoute withParam(String str, float[] fArr) {
        this.extraParams.putExtra(str, fArr);
        return this;
    }

    public final FragmentRoute withParam(String str, int[] iArr) {
        this.extraParams.putExtra(str, iArr);
        return this;
    }

    public final FragmentRoute withParam(String str, long[] jArr) {
        this.extraParams.putExtra(str, jArr);
        return this;
    }

    public final FragmentRoute withParam(String str, Parcelable[] parcelableArr) {
        this.extraParams.putExtra(str, parcelableArr);
        return this;
    }

    public final FragmentRoute withParam(String str, CharSequence[] charSequenceArr) {
        this.extraParams.putExtra(str, charSequenceArr);
        return this;
    }

    public final FragmentRoute withParam(String str, String[] strArr) {
        this.extraParams.putExtra(str, strArr);
        return this;
    }

    public final FragmentRoute withParam(String str, short[] sArr) {
        this.extraParams.putExtra(str, sArr);
        return this;
    }

    public final FragmentRoute withParam(String str, boolean[] zArr) {
        this.extraParams.putExtra(str, zArr);
        return this;
    }

    public FragmentRoute(ActivityC45651qj activityC45651qj, Fragment fragment, FragmentNavigationContainer navigationContainer) {
        o.LJIIIZ(navigationContainer, "navigationContainer");
        this.activity = activityC45651qj;
        this.fragment = fragment;
        this.navigationContainer = navigationContainer;
        this.pushType = PushType.REPLACE;
        this.popEnterAnim = -1;
        this.popExitAnim = -1;
        this.enterAnim = -1;
        this.exitAnim = -1;
        this.extraParams = new Intent();
        this.url = "";
    }

    public final FragmentRoute popTo(String str, String str2, Boolean bool) {
        this.popOp = new PopOp(str, str2);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            PopOp popOp = this.popOp;
            if (popOp != null) {
                popOp.setPopInclusive(booleanValue);
            }
        }
        return this;
    }

    public final FragmentRoute push(String str, String str2, Integer num) {
        if (str != null) {
            this.pushOp = new PushOp(str, str2, num);
        }
        return this;
    }

    public static /* synthetic */ void commit$default(FragmentRoute fragmentRoute, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        fragmentRoute.commit(bool);
    }

    public static /* synthetic */ FragmentRoute pop$default(FragmentRoute fragmentRoute, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.TRUE;
        }
        fragmentRoute.pop(bool);
        return fragmentRoute;
    }

    public final FragmentRoute withAnimation(int i, int i2, int i3, int i4) {
        this.enterAnim = i;
        this.exitAnim = i2;
        this.popEnterAnim = i3;
        this.popExitAnim = i4;
        return this;
    }

    public /* synthetic */ FragmentRoute(ActivityC45651qj activityC45651qj, Fragment fragment, FragmentNavigationContainer fragmentNavigationContainer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : activityC45651qj, (i & 2) != 0 ? null : fragment, fragmentNavigationContainer);
    }

    public static /* synthetic */ FragmentRoute popTo$default(FragmentRoute fragmentRoute, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        fragmentRoute.popTo(str, str2, bool);
        return fragmentRoute;
    }

    public static /* synthetic */ FragmentRoute push$default(FragmentRoute fragmentRoute, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        fragmentRoute.push(str, str2, num);
        return fragmentRoute;
    }
}
