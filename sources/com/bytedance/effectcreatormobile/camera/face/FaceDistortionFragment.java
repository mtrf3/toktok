package com.bytedance.effectcreatormobile.camera.face;

import X.ActivityC45651qj;
import X.C019005q;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C90903hW;
import X.C93405aQL;
import X.C93408aQO;
import X.C93410aQQ;
import X.C93464aRI;
import X.C93472aRQ;
import X.C93643aUB;
import X.C93670aUc;
import X.C93825aX7;
import X.C93886aY6;
import X.C94077abB;
import X.C94311aex;
import X.C94312aey;
import X.C94314af0;
import X.C94753am5;
import X.EnumC93477aRV;
import X.InterfaceC65784Pro;
import X.InterfaceC93411aQR;
import X.InterfaceC93645aUD;
import X.OSZ;
import X.XKX;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.effectcreatormobile.camera.RecorderViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.EEPointList;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFacePoints;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class FaceDistortionFragment extends Fragment {
    public static final /* synthetic */ int LJZ = 0;
    public C94314af0 LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public Long LJLJL;
    public final ViewModelLazy LJLJLJ = C93408aQO.LIZ(this, C65352Pkq.LIZ(FaceDistortionNameViewModel.class), new IDqS423S0100000_42((Fragment) this, 21), null);
    public final ViewModelLazy LJLJLLL = C93408aQO.LIZ(this, C65352Pkq.LIZ(RecorderViewModel.class), new IDqS423S0100000_42((Fragment) this, 22), null);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 26));
    public final ViewModelLazy LJLLI = C93408aQO.LIZ(this, C65352Pkq.LIZ(FaceDistortionViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42((Fragment) this, 23), 24), new IDqS423S0100000_42(this, 27));
    public final InterfaceC93411aQR LJLLILLLL = C93410aQQ.LIZJ().providePageLoadingView();
    public final InterfaceC93645aUD LJLLJ;
    public float LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final C94077abB LJLZ;

    public final FaceDistortionViewModel Al() {
        return (FaceDistortionViewModel) this.LJLLI.getValue();
    }

    public final C93886aY6 xl() {
        return (C93886aY6) this.LJLL.getValue();
    }

    public final void Dl() {
        EEPointList eEPointList;
        if (this.LJLLLL) {
            return;
        }
        onEventObjectAction("cancel");
        FaceDistortionViewModel Al = Al();
        List<? extends PointF> list = Al.LJLLL;
        UIAnnotationFacePoints uIAnnotationFacePoints = Al.LJLLLL;
        if (uIAnnotationFacePoints != null) {
            eEPointList = uIAnnotationFacePoints.getFacePoints();
        } else {
            eEPointList = null;
        }
        boolean z = false;
        if (list != null && eEPointList != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                PointF pointF = (PointF) it.next();
                float f = 1000;
                arrayList.add(new OSZ(Float.valueOf(((int) (pointF.x * f)) / 1000.0f), Float.valueOf(((int) (pointF.y * f)) / 1000.0f)));
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(eEPointList, 10));
            Iterator<EEPoint> it2 = eEPointList.iterator();
            while (it2.hasNext()) {
                EEPoint it3 = it2.next();
                o.LJIIIIZZ(it3, "it");
                float f2 = 1000;
                arrayList2.add(new OSZ(Float.valueOf(((int) (((float) it3.getX()) * f2)) / 1000.0f), Float.valueOf(((int) (((float) it3.getY()) * f2)) / 1000.0f)));
            }
            if (!o.LJ(arrayList, arrayList2)) {
                if (this.LJLILLLLZI != null) {
                    z = true;
                }
                if (z) {
                    Context requireContext = requireContext();
                    o.LJIIIIZZ(requireContext, "requireContext()");
                    IDialog LIZ = C93405aQL.LIZ();
                    String string = requireContext.getString(R.string.fvb);
                    o.LJIIIIZZ(string, "context.getString(R.stri…ol_alert_exit_distortion)");
                    String string2 = requireContext.getString(R.string.fv3);
                    o.LJIIIIZZ(string2, "context.getString(R.stri…_tool_alert_back_content)");
                    String string3 = requireContext.getString(R.string.fw3);
                    o.LJIIIIZZ(string3, "context.getString(R.string.effect_tool_exit)");
                    C93472aRQ.LIZ(LIZ, requireContext, string, string2, string3, requireContext.getString(R.string.fvg), new C94312aey(this), null, null, null, null, 1984);
                    return;
                }
                Context requireContext2 = requireContext();
                o.LJIIIIZZ(requireContext2, "requireContext()");
                IDialog LIZ2 = C93405aQL.LIZ();
                String string4 = requireContext2.getString(R.string.fv7);
                o.LJIIIIZZ(string4, "context.getString(R.stri…_alert_discardedit_title)");
                String string5 = requireContext2.getString(R.string.fv6);
                o.LJIIIIZZ(string5, "context.getString(R.stri…lert_discardedit_content)");
                String string6 = requireContext2.getString(R.string.fvl);
                o.LJIIIIZZ(string6, "context.getString(R.string.effect_tool_clear)");
                C93472aRQ.LIZ(LIZ2, requireContext2, string4, string5, string6, requireContext2.getString(R.string.fvg), new C94311aex(this), null, null, null, null, 1984);
                return;
            }
        }
        cancel();
        vl(true);
    }

    public final void cancel() {
        UIAnnotationFacePoints uIAnnotationFacePoints;
        if (this.LJLILLLLZI != null) {
            Feature feature = Al().LJLLLLLL;
            if (feature != null) {
                CKEffectEditorContext.LJIILIIL(feature);
                return;
            }
            return;
        }
        FaceDistortionViewModel Al = Al();
        List<? extends PointF> list = Al.LJLLL;
        if (list == null || (uIAnnotationFacePoints = Al.LJLLLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            PointF pointF = (PointF) it.next();
            EEPoint eEPoint = new EEPoint();
            eEPoint.setX(pointF.x);
            eEPoint.setY(pointF.y);
            arrayList.add(eEPoint);
        }
        uIAnnotationFacePoints.updateValue(new EEPointList(arrayList));
    }

    public FaceDistortionFragment() {
        InterfaceC93645aUD provideStatusPage;
        provideStatusPage = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Large);
        this.LJLLJ = provideStatusPage;
        this.LJLZ = new C94077abB(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLIL = null;
    }

    public final Long wl() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Long valueOf = Long.valueOf(arguments.getLong("key_face_distortion_restoring_feature_key", -1L));
            if (valueOf.longValue() > -1) {
                return valueOf;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Object obj2 = null;
        if (arguments != null) {
            str = arguments.getString("key_effect_path");
        } else {
            str = null;
        }
        this.LJLILLLLZI = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("key_effect_id");
        } else {
            str2 = null;
        }
        this.LJLJI = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("key_effect_name");
        } else {
            str3 = null;
        }
        this.LJLJJI = str3;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str4 = arguments4.getString("key_resource_name");
        } else {
            str4 = null;
        }
        this.LJLJJL = str4;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str5 = arguments5.getString("key_capabilities");
        } else {
            str5 = null;
        }
        this.LJLJJLL = str5;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            obj = C16880lQ.LLJJIII(arguments6, "key_feature_id");
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            obj2 = obj;
        }
        Long l = (Long) obj2;
        this.LJLJL = l;
        if ((this.LJLILLLLZI != null && this.LJLJI != null && this.LJLJJI != null && this.LJLJJL != null && this.LJLJJLL != null) || l != null) {
            return;
        }
        "If creating a new face distortion, faceEffectPath, faceEffectId, displayName, resourceName and capabilities cannot be null; if editing an existing face distortion, featureId cannot be null".toString();
        throw new IllegalArgumentException("If creating a new face distortion, faceEffectPath, faceEffectId, displayName, resourceName and capabilities cannot be null; if editing an existing face distortion, featureId cannot be null");
    }

    public final void onEventObjectAction(String str) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("distortion_edit", C51029K0z.LJJIIZI(new OSZ("action_type", str)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        long j;
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Feature feature = Al().LJLLLLLL;
            if (feature != null) {
                j = C93825aX7.LIZ(feature);
            } else {
                j = -1;
            }
            arguments.putLong("key_face_distortion_restoring_feature_key", j);
        }
    }

    public final void vl(boolean z) {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94753am5(this, z, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        CKEffectEditorContext.LIZJ(viewLifecycleOwner, new IDqS423S0100000_42(this, 25));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvw, viewGroup, false);
        int i = R.id.auv;
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.auv);
        if (textView != null) {
            i = R.id.nlx;
            if (LLLLIILL.findViewById(R.id.nlx) != null) {
                i = R.id.nly;
                if (LLLLIILL.findViewById(R.id.nly) != null) {
                    i = R.id.nlz;
                    LinearLayout linearLayout = (LinearLayout) LLLLIILL.findViewById(R.id.nlz);
                    if (linearLayout != null) {
                        i = R.id.nm0;
                        LinearLayout linearLayout2 = (LinearLayout) LLLLIILL.findViewById(R.id.nm0);
                        if (linearLayout2 != null) {
                            i = R.id.ayr;
                            TextView textView2 = (TextView) LLLLIILL.findViewById(R.id.ayr);
                            if (textView2 != null) {
                                i = R.id.nm5;
                                View findViewById = LLLLIILL.findViewById(R.id.nm5);
                                if (findViewById != null) {
                                    i = R.id.e1u;
                                    C019005q c019005q = (C019005q) LLLLIILL.findViewById(R.id.e1u);
                                    if (c019005q != null) {
                                        i = R.id.nnu;
                                        C93464aRI c93464aRI = (C93464aRI) LLLLIILL.findViewById(R.id.nnu);
                                        if (c93464aRI != null) {
                                            i = R.id.gey;
                                            FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.gey);
                                            if (frameLayout != null) {
                                                i = R.id.l61;
                                                TextureView textureView = (TextureView) LLLLIILL.findViewById(R.id.l61);
                                                if (textureView != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
                                                    this.LJLIL = new C94314af0(constraintLayout, textView, linearLayout, linearLayout2, textView2, findViewById, c019005q, c93464aRI, frameLayout, textureView);
                                                    try {
                                                        ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                                                        ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                                                        C10A.LIZIZ(constraintLayout, this);
                                                        ActivityC45651qj mo49getActivity = mo49getActivity();
                                                        if (mo49getActivity instanceof C29S) {
                                                            c29s = (C29S) mo49getActivity;
                                                        } else {
                                                            c29s = null;
                                                        }
                                                        C90903hW.LIZ(c29s);
                                                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                    } catch (Throwable th) {
                                                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                    }
                                                    return constraintLayout;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }
}
