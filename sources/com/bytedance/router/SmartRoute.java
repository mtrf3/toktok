package com.bytedance.router;

import X.C16880lQ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes11.dex */
public class SmartRoute {
    public Bundle mAnimationBundle;
    public OpenResultCallback mCallback;
    public Context mContext;
    public Uri mData;
    public String mUrl = "";
    public int enterAnim = -1;
    public int exitAnim = -1;
    public Boolean mExternalType = Boolean.FALSE;
    public Fragment mFragment = null;
    public Intent mExtraParams = new Intent();

    public Intent buildIntent() {
        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
        String startRoute = routerMonitor.startRoute(this.mUrl);
        RouteManager.getInstance().setTempResultCallback(this.mCallback);
        if (TextUtils.isEmpty(this.mUrl) || !Util.isLegalUrl(this.mUrl)) {
            Logger.e("SmartRoute#buildIntent error!!!");
            RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#buildIntent error!");
            return null;
        }
        RouteIntent buildRouteIntent = buildRouteIntent();
        buildRouteIntent.setRouteId(startRoute);
        Intent buildIntent = RouteManager.getInstance().buildIntent(this.mContext, buildRouteIntent);
        routerMonitor.reportSuccess(startRoute);
        return buildIntent;
    }

    public RouteIntent buildRouteIntent() {
        int i;
        Intent intent = this.mExtraParams;
        if (intent != null) {
            i = intent.getFlags();
        } else {
            i = 0;
        }
        String str = this.mUrl;
        if (str != null) {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "launchFlag");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    i = Integer.decode(queryParameter).intValue();
                } catch (Exception unused) {
                }
            }
        }
        RouteIntent.Builder builder = new RouteIntent.Builder();
        builder.withUrl(this.mUrl);
        builder.withParam(this.mExtraParams);
        builder.addFlags(i);
        builder.withAnimation(this.enterAnim, this.exitAnim);
        builder.withBundleAnimation(this.mAnimationBundle);
        builder.withCallback(this.mCallback);
        builder.withData(this.mData);
        builder.withExternalType(this.mExternalType.booleanValue());
        return builder.build();
    }

    public void open() {
        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
        String startRoute = routerMonitor.startRoute(this.mUrl);
        routerMonitor.collectParams(startRoute, C16880lQ.LLJJIJI(this.mExtraParams));
        RouteManager.getInstance().setTempResultCallback(this.mCallback);
        if (this.mContext == null || TextUtils.isEmpty(this.mUrl) || !Util.isLegalUrl(this.mUrl)) {
            Logger.e("SmartRoute#open error");
            routerMonitor.reportFail(startRoute, "SmartRoute#open error");
            RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#open error");
        } else {
            RouteIntent buildRouteIntent = buildRouteIntent();
            buildRouteIntent.setRouteId(startRoute);
            RouteManager.getInstance().open(this.mContext, buildRouteIntent);
        }
    }

    public SmartRoute(Context context) {
        this.mContext = context;
    }

    public SmartRoute addFlags(int i) {
        this.mExtraParams.addFlags(i);
        return this;
    }

    public void open(int i) {
        open(i, null);
    }

    public SmartRoute setExternal(boolean z) {
        this.mExternalType = Boolean.valueOf(z);
        return this;
    }

    public SmartRoute withBundleAnimation(Bundle bundle) {
        this.mAnimationBundle = bundle;
        return this;
    }

    public SmartRoute withCallback(OpenResultCallback openResultCallback) {
        this.mCallback = openResultCallback;
        return this;
    }

    public SmartRoute withFragment(Fragment fragment) {
        this.mFragment = fragment;
        return this;
    }

    public SmartRoute withNavArg(Parcelable parcelable) {
        if (parcelable != null) {
            this.mExtraParams.putExtra("smart_key_route_arg", parcelable);
        }
        return this;
    }

    public SmartRoute withParam(Intent intent) {
        if (C16880lQ.LLJJIJI(intent) != null) {
            if (C16880lQ.LLJJIJI(this.mExtraParams) == null) {
                this.mExtraParams.putExtras(new Bundle());
            }
            C16880lQ.LLJJIJI(this.mExtraParams).putAll(C16880lQ.LLJJIJI(intent));
        }
        return this;
    }

    public SmartRoute withUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public SmartRoute withParam(Bundle bundle) {
        if (bundle != null) {
            this.mExtraParams.putExtras(bundle);
        }
        return this;
    }

    public SmartRoute withParam(Uri uri) {
        this.mData = uri;
        return this;
    }

    private void sliceParams2Intent(Intent intent, String str) {
        Map<String, String> sliceUrlParams = Util.sliceUrlParams(str);
        if (sliceUrlParams == null || sliceUrlParams.size() == 0) {
            return;
        }
        for (Map.Entry<String, String> entry : sliceUrlParams.entrySet()) {
            intent.putExtra(entry.getKey(), entry.getValue());
        }
    }

    public void open(int i, OnActivityResultCallback onActivityResultCallback) {
        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
        String startRoute = routerMonitor.startRoute(this.mUrl);
        routerMonitor.collectParams(startRoute, C16880lQ.LLJJIJI(this.mExtraParams));
        if (i != Integer.MIN_VALUE) {
            RouteManager.getInstance().setTempResultCallback(this.mCallback);
            if (this.mContext == null || TextUtils.isEmpty(this.mUrl) || !Util.isLegalUrl(this.mUrl) || !(this.mContext instanceof Activity)) {
                RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#open(int requestCode) error!");
                Logger.e("SmartRoute#open(int requestCode) error");
                return;
            }
            RouteIntent buildRouteIntent = buildRouteIntent();
            buildRouteIntent.setRequestCode(i);
            buildRouteIntent.setRouteId(startRoute);
            buildRouteIntent.setOnActivityResultCallback(onActivityResultCallback);
            Fragment fragment = this.mFragment;
            if (fragment != null) {
                buildRouteIntent.setFragment(fragment);
            }
            RouteManager.getInstance().open(this.mContext, buildRouteIntent);
            return;
        }
        routerMonitor.reportFail(startRoute, "requestCode must not be Integer.MIN_VALUE:-2147483648 !!!");
        throw new IllegalArgumentException("requestCode must not be Integer.MIN_VALUE:-2147483648 !!!");
    }

    public SmartRoute withAnimation(int i, int i2) {
        this.enterAnim = i;
        this.exitAnim = i2;
        return this;
    }

    public SmartRoute withParam(String str, byte b) {
        this.mExtraParams.putExtra(str, b);
        return this;
    }

    public SmartRoute withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
        this.mExtraParams.putCharSequenceArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamIntegerList(String str, ArrayList<Integer> arrayList) {
        this.mExtraParams.putIntegerArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamParcelableList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.mExtraParams.putParcelableArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamStringList(String str, ArrayList<String> arrayList) {
        this.mExtraParams.putStringArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParam(String str, char c) {
        this.mExtraParams.putExtra(str, c);
        return this;
    }

    public SmartRoute withParam(String str, double d) {
        this.mExtraParams.putExtra(str, d);
        return this;
    }

    public SmartRoute withParam(String str, float f) {
        this.mExtraParams.putExtra(str, f);
        return this;
    }

    public SmartRoute withParam(String str, int i) {
        this.mExtraParams.putExtra(str, i);
        return this;
    }

    public SmartRoute withParam(String str, long j) {
        this.mExtraParams.putExtra(str, j);
        return this;
    }

    public SmartRoute withParam(String str, Bundle bundle) {
        this.mExtraParams.putExtra(str, bundle);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable parcelable) {
        this.mExtraParams.putExtra(str, parcelable);
        return this;
    }

    public SmartRoute withParam(String str, Serializable serializable) {
        this.mExtraParams.putExtra(str, serializable);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence charSequence) {
        this.mExtraParams.putExtra(str, charSequence);
        return this;
    }

    public SmartRoute withParam(String str, String str2) {
        this.mExtraParams.putExtra(str, str2);
        return this;
    }

    public SmartRoute withParam(String str, short s) {
        this.mExtraParams.putExtra(str, s);
        return this;
    }

    public SmartRoute withParam(String str, boolean z) {
        this.mExtraParams.putExtra(str, z);
        return this;
    }

    public SmartRoute withParam(String str, byte[] bArr) {
        this.mExtraParams.putExtra(str, bArr);
        return this;
    }

    public SmartRoute withParam(String str, char[] cArr) {
        this.mExtraParams.putExtra(str, cArr);
        return this;
    }

    public SmartRoute withParam(String str, double[] dArr) {
        this.mExtraParams.putExtra(str, dArr);
        return this;
    }

    public SmartRoute withParam(String str, float[] fArr) {
        this.mExtraParams.putExtra(str, fArr);
        return this;
    }

    public SmartRoute withParam(String str, int[] iArr) {
        this.mExtraParams.putExtra(str, iArr);
        return this;
    }

    public SmartRoute withParam(String str, long[] jArr) {
        this.mExtraParams.putExtra(str, jArr);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable[] parcelableArr) {
        this.mExtraParams.putExtra(str, parcelableArr);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence[] charSequenceArr) {
        this.mExtraParams.putExtra(str, charSequenceArr);
        return this;
    }

    public SmartRoute withParam(String str, String[] strArr) {
        this.mExtraParams.putExtra(str, strArr);
        return this;
    }

    public SmartRoute withParam(String str, short[] sArr) {
        this.mExtraParams.putExtra(str, sArr);
        return this;
    }

    public SmartRoute withParam(String str, boolean[] zArr) {
        this.mExtraParams.putExtra(str, zArr);
        return this;
    }
}
