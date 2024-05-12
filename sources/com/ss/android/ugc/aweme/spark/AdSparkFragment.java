package com.ss.android.ugc.aweme.spark;

import X.C109464Ri;
import X.C117144ik;
import X.C16880lQ;
import X.InterfaceC60844NuK;
import X.NVO;
import X.NZ1;
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
public final class AdSparkFragment extends SparkFragment {
    public final boolean LLD;
    public SparkContext LLF;
    public NZ1 LLFF;
    public final Map<Integer, View> LLFFF;

    public AdSparkFragment() {
        this(false);
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFFF).clear();
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final SparkContext Al() {
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

    public final NZ1 xl() {
        NVO nvo;
        NZ1 nz1 = this.LLFF;
        if (nz1 == null) {
            SparkContext Al = Al();
            nz1 = null;
            if (Al != null) {
                nz1 = (NZ1) Al.LIZIZ(NZ1.class);
            }
            if ((nz1 instanceof NVO) && (nvo = (NVO) nz1) != null) {
                nvo.LJ();
            }
        }
        this.LLFF = nz1;
        return nz1;
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        NVO nvo;
        super.onDestroy();
        NZ1 xl = xl();
        if ((xl instanceof NVO) && (nvo = (NVO) xl) != null) {
            nvo.LLLJL();
        }
    }

    public AdSparkFragment(boolean z) {
        this.LLFFF = new LinkedHashMap();
        this.LLD = z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC60844NuK interfaceC60844NuK;
        Context context;
        View LJI;
        SparkContext Al = Al();
        if (Al == null || (interfaceC60844NuK = (InterfaceC60844NuK) Al.LIZIZ(InterfaceC60844NuK.class)) == null) {
            NZ1 xl = xl();
            if (xl instanceof NVO) {
                interfaceC60844NuK = (NVO) xl;
            } else {
                interfaceC60844NuK = null;
            }
        }
        NZ1 xl2 = xl();
        if (xl2 != null && (context = getContext()) != null) {
            xl2.LIZLLL(context);
            xl2.LJJ();
            ViewGroup LIZIZ = xl2.LIZIZ();
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
