package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.C109464Ri;
import X.C117144ik;
import X.C16880lQ;
import X.InterfaceC60761Nsz;
import X.InterfaceC60844NuK;
import X.NMS;
import X.NZ1;
import X.NZ2;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdSparkHybridFragment extends SparkFragment implements NMS {
    public final boolean LLD;
    public SparkContext LLF;
    public NZ1 LLFF;
    public NZ2 LLFFF;
    public final Map<Integer, View> LLFII;

    public AdSparkHybridFragment() {
        this(false);
    }

    @Override // X.NMS
    public final void I1(String str) {
    }

    @Override // X.NMS
    public final boolean LJIIJ() {
        return false;
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final NZ1 Al() {
        NZ2 nz2;
        NZ1 nz1 = this.LLFF;
        if (nz1 == null) {
            SparkContext Dl = Dl();
            nz1 = null;
            if (Dl != null) {
                nz1 = (NZ1) Dl.LIZIZ(NZ1.class);
            }
            if ((nz1 instanceof NZ2) && (nz2 = (NZ2) nz1) != null) {
                nz2.LJ();
            }
        }
        this.LLFF = nz1;
        return nz1;
    }

    public final SparkContext Dl() {
        String str;
        SparkContext sparkContext = this.LLF;
        if (sparkContext == null) {
            C109464Ri.LIZ.getClass();
            C117144ik c117144ik = C117144ik.LIZIZ;
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("SparkContextContainerId");
            } else {
                str = null;
            }
            c117144ik.getClass();
            sparkContext = C117144ik.LIZ(str);
        }
        this.LLF = sparkContext;
        return sparkContext;
    }

    @Override // X.NMS
    public final void onHide() {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onHide();
        }
        NZ2 xl = xl();
        if (xl != null) {
            xl.onHide();
        }
    }

    @Override // X.NMS
    public final void onShow() {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onShow();
        }
        NZ2 xl = xl();
        if (xl != null) {
            xl.onShow();
        }
    }

    public final NZ2 xl() {
        NZ2 nz2 = this.LLFFF;
        if (nz2 == null) {
            SparkContext Dl = Dl();
            if (Dl != null && (nz2 = (NZ2) Dl.LIZIZ(NZ2.class)) != null) {
                nz2.LJ();
            } else {
                nz2 = null;
            }
        }
        this.LLFFF = nz2;
        return nz2;
    }

    @Override // X.NMS
    public final void LJJLI() {
        NZ2 xl = xl();
        if (xl != null) {
            xl.LJJLI();
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        NZ2 xl = xl();
        if (xl != null) {
            xl.LLLJL();
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        NZ2 nz2 = this.LLFFF;
        if (nz2 != null) {
            nz2.onPause();
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        NZ2 nz2 = this.LLFFF;
        if (nz2 != null) {
            nz2.onResume();
        }
    }

    public AdSparkHybridFragment(boolean z) {
        this.LLFII = new LinkedHashMap();
        this.LLD = z;
    }

    @Override // X.NMS
    public final void LLLJIL(Runnable runnable) {
        NZ2 xl = xl();
        if (xl != null) {
            xl.LLLJIL(runnable);
        }
    }

    @Override // X.NMS
    public final void loadUrl(String schema) {
        SparkContext sparkContext;
        o.LJIIIZ(schema, "schema");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null) {
            sparkContext.LJJIJLIJ(schema);
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIIJJI(sparkContext);
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC60844NuK interfaceC60844NuK;
        Context context;
        View LJI;
        SparkContext Dl = Dl();
        if (Dl == null || (interfaceC60844NuK = (InterfaceC60844NuK) Dl.LIZIZ(InterfaceC60844NuK.class)) == null) {
            NZ1 Al = Al();
            if (Al instanceof InterfaceC60844NuK) {
                interfaceC60844NuK = (InterfaceC60844NuK) Al;
            } else {
                interfaceC60844NuK = null;
            }
        }
        NZ1 Al2 = Al();
        if (Al2 != null && (context = getContext()) != null) {
            Al2.LIZLLL(context);
            Al2.LJJ();
            ViewGroup LIZIZ = Al2.LIZIZ();
            if (interfaceC60844NuK != null && (LJI = interfaceC60844NuK.LJI(context)) != null) {
                LIZIZ.removeAllViews();
                ViewParent parent = LJI.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    C16880lQ.LJLLL(LJI, (ViewGroup) parent);
                }
                LIZIZ.addView(LJI);
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        if (this.LLD) {
            return;
        }
        super.onViewCreated(view, bundle);
    }
}
