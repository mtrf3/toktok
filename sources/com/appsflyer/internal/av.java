package com.appsflyer.internal;

import X.AbstractC04850Gz;
import X.C04830Gx;
import X.C1FD;
import android.content.Context;
import android.os.Build;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.compat.function.Consumer;
import com.appsflyer.compat.function.Function;
import com.appsflyer.internal.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class av implements Runnable {
    public bh AFInAppEventParameterName;
    public AbstractC04850Gz AFInAppEventType;
    public final bd AFKeystoreWrapper;
    public final bg AFVersionDeclaration;
    public final ba valueOf;
    public final ExecutorService values;

    @Override // java.lang.Runnable
    public final void run() {
        com_appsflyer_internal_av_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public final void com_appsflyer_internal_av__run$___twin___() {
        try {
            if (this.AFInAppEventType == null) {
                bh bhVar = this.AFInAppEventParameterName;
                at atVar = new at(this);
                C04830Gx c04830Gx = new C04830Gx(bhVar.values);
                c04830Gx.LIZJ = atVar;
                c04830Gx.LIZ = true;
                C1FD LIZ = c04830Gx.LIZ();
                this.AFInAppEventType = LIZ;
                LIZ.LJII(new aw(this));
            }
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.values("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.values("Failed to setup Play billing", th);
        }
    }

    public static void com_appsflyer_internal_av_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(av avVar) {
        boolean LIZ;
        try {
            avVar.com_appsflyer_internal_av__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static /* synthetic */ void AFKeystoreWrapper(av avVar, final boolean z, List list) {
        boolean z2;
        String str;
        String str2;
        final ad valueOf = avVar.AFKeystoreWrapper.valueOf();
        Map<String, String> map = null;
        if (valueOf != null) {
            z2 = valueOf.init;
            Function<List<Purchase>, Map<String, String>> function = valueOf.values;
            if (function != null) {
                map = function.apply(list);
            }
        } else {
            z2 = false;
        }
        ac acVar = new ac(z2, z, list, map);
        bg bgVar = avVar.AFVersionDeclaration;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", bgVar.valueOf.valueOf.getPackageName());
        String string = AppsFlyerProperties.getInstance().getString("AppUserId");
        if (string != null) {
            hashMap.put("cuid", string);
        }
        Context context = bgVar.valueOf.valueOf;
        hashMap.put("app_version_name", ac.values(context, context.getPackageName()));
        HashMap hashMap2 = new HashMap();
        c.d.b AFInAppEventType = ad.AFInAppEventType(bgVar.valueOf.valueOf, new HashMap());
        if (AFInAppEventType != null && (str2 = AFInAppEventType.values) != null) {
            hashMap2.put("advertising_id", str2);
        }
        hashMap2.put("appsflyer_id", ak.AFInAppEventParameterName((WeakReference<Context>) new WeakReference(bgVar.valueOf.valueOf)));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb.toString());
        hashMap2.put("sdk_version", ai.valueOf);
        hashMap.put("device_data", hashMap2);
        hashMap.put("is_cached", Boolean.valueOf(acVar.AFInAppEventType()));
        if (acVar.AFKeystoreWrapper()) {
            str = "SANDBOX";
        } else {
            str = "PRODUCTION";
        }
        hashMap.put("environment", str);
        hashMap.put("additional_parameters", acVar.AFInAppEventParameterName);
        ArrayList arrayList = new ArrayList();
        for (Purchase purchase : acVar.AFInAppEventType) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("token", purchase.LIZLLL());
            hashMap3.put("subscription_id", purchase.getSku());
            arrayList.add(hashMap3);
        }
        hashMap.put("subscriptions", arrayList);
        v vVar = new v("https://ars.appsflyer.com/api/v1/android/validate_subscription", new JSONObject(hashMap).toString().getBytes(), "POST", Collections.emptyMap());
        y yVar = bgVar.AFInAppEventParameterName;
        bi biVar = new bi(vVar, yVar.AFKeystoreWrapper, yVar.AFInAppEventType, new bl());
        bk<String> bkVar = new bk<String>() { // from class: com.appsflyer.internal.av.1
            @Override // com.appsflyer.internal.bk
            public final void valueOf(bm<String> bmVar) {
                Consumer<String> consumer;
                Consumer<String> consumer2;
                if (bmVar.valueOf()) {
                    if (z) {
                        av.this.valueOf.AFKeystoreWrapper("ars_history_sent");
                    }
                    ad adVar = valueOf;
                    if (adVar != null && (consumer2 = adVar.AFInAppEventType) != null) {
                        consumer2.accept(bmVar.AFKeystoreWrapper);
                        return;
                    }
                    return;
                }
                ad adVar2 = valueOf;
                if (adVar2 != null && (consumer = adVar2.valueOf) != null) {
                    consumer.accept(bmVar.AFKeystoreWrapper);
                }
            }

            @Override // com.appsflyer.internal.bk
            public final void valueOf(Throwable th) {
                Consumer<String> consumer;
                ad adVar = valueOf;
                if (adVar != null && (consumer = adVar.valueOf) != null) {
                    consumer.accept(th.getMessage());
                }
                AFLogger.valueOf(th);
            }
        };
        if (!biVar.AFInAppEventParameterName.getAndSet(true)) {
            biVar.values.submit(new Runnable() { // from class: com.appsflyer.internal.bi.1
                public /* synthetic */ bk AFInAppEventType;

                @Override // java.lang.Runnable
                public final void run() {
                    com_appsflyer_internal_bi$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_appsflyer_internal_bi$1__run$___twin___() {
                    try {
                        bi biVar2 = bi.this;
                        bm<String> valueOf2 = biVar2.AFInAppEventType.valueOf(biVar2.valueOf);
                        r2.valueOf(new bm(bi.this.AFKeystoreWrapper.AFInAppEventType(valueOf2.AFKeystoreWrapper), valueOf2.AFInAppEventParameterName, valueOf2.valueOf()));
                    } catch (IOException e) {
                        r2.valueOf(e);
                    }
                }

                public static void com_appsflyer_internal_bi$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_appsflyer_internal_bi$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass1(bk bkVar2) {
                    r2 = bkVar2;
                }
            });
            return;
        }
        throw new IllegalStateException("Http call is already executed");
    }

    public av(bd bdVar, bh bhVar, ba baVar, ExecutorService executorService, bg bgVar) {
        this.AFKeystoreWrapper = bdVar;
        this.AFInAppEventParameterName = bhVar;
        this.valueOf = baVar;
        this.values = executorService;
        this.AFVersionDeclaration = bgVar;
    }
}
