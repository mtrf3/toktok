package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C16880lQ;
import X.C58628Mzg;
import X.C58991NDf;
import X.C58993NDh;
import X.C76800UCe;
import X.C78983UzD;
import X.EnumC58992NDg;
import X.F2Y;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC88472Yns;
import X.KR3;
import X.N0X;
import X.NDZ;
import X.ORS;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VNS;
import X.X1D;
import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class IBEPreRenderReadyMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IBEPreRenderReadyMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "IBEPreRenderReady";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        ViewParent viewParent;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        String str;
        Object obj;
        View view;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        F2Y LIZ = this.contextProviderFactory.LIZ(VNS.class);
        if (LIZ != null && (view = (View) LIZ.LIZIZ()) != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if ((viewParent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) viewParent) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("IBEPrerenderReady success: id = ");
            SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
            if (sparkContext != null) {
                str = sparkContext.containerId;
            } else {
                str = null;
            }
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
            C58993NDh c58993NDh = NDZ.LIZ;
            c58993NDh.getClass();
            ConcurrentHashMap<String, List<C58991NDf>> concurrentHashMap = c58993NDh.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<C58991NDf>>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it.next().getValue(), arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (o.LJ(((C58991NDf) obj).LIZ, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C58991NDf c58991NDf = (C58991NDf) obj;
            if (c58991NDf != null) {
                synchronized (c58991NDf) {
                    int ordinal = c58991NDf.LJFF.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS42S0100000_6(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 6));
                            }
                        } else {
                            C78983UzD.LJIILJJIL();
                        }
                    } else {
                        C58628Mzg c58628Mzg = c58991NDf.LIZIZ;
                        N0X.LIZ.getClass();
                        c58628Mzg.LJIILJJIL(N0X.LJFF, new AqS176S0100000_10(c58991NDf, 17));
                        if (c58991NDf.LJFF == EnumC58992NDg.NOT_READY) {
                            KR3.LIZ("Spark loadFinish is not called");
                        }
                    }
                    c58991NDf.LJFF = EnumC58992NDg.READY;
                    InterfaceC88472Yns<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> interfaceC88472Yns = c58991NDf.LIZJ;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                    }
                    c58991NDf.LIZJ = null;
                }
                return;
            }
            return;
        }
        C78983UzD.LJIILJJIL();
    }
}
