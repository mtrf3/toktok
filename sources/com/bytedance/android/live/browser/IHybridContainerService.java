package com.bytedance.android.live.browser;

import X.C76800UCe;
import X.InterfaceC06390Mx;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;

/* loaded from: classes.dex */
public interface IHybridContainerService extends InterfaceC06390Mx {
    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS Lm0(Context context, String str, String str2, boolean z, InterfaceC88471Ynr<? super SparkContext, ? super Integer, C76800UCe> interfaceC88471Ynr);

    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS R70(Context context, String str, String str2, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns);

    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS Si0(Context context, String str, String str2, boolean z, boolean z2, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns);

    void Uu();

    SparkContext Vs0(Context context, String str, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns);

    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS cZ(Context context, String str, boolean z, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns);

    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS ti0(Context context, String str, boolean z, boolean z2, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns);
}
