package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C234529Ii;
import X.C235119Kp;
import X.C27162AlK;
import X.C27350AoM;
import X.C27531ArH;
import X.C29S;
import X.C3C5;
import X.C70414RkI;
import X.C76800UCe;
import X.C84654XKg;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SpecificationsFragment extends ECBaseFragment implements InterfaceC219588ja {
    public static C84654XKg LJLILLLLZI;
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "specifications";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.f3s);
        o.LJIIIIZZ(string, "getString(R.string.ec_pdp_spec)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 239));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C84654XKg c84654XKg = LJLILLLLZI;
        if (c84654XKg != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            c84654XKg.resumeWith(c76800UCe);
        }
        LJLILLLLZI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        C70414RkI LIZ = C27350AoM.LIZ(mo49getActivity());
        if (LIZ != null) {
            long stayDuration = getStayDuration();
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else {
                str = "return";
            }
            LIZ.LJJJJLI("specifications", stayDuration, str, null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.2RQ, android.view.View, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Parcelable[] parcelableArr;
        Specification[] specificationArr;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        final AttributeSet attributeSet = null;
        if (arguments != null) {
            parcelableArr = arguments.getParcelableArray("data");
        } else {
            parcelableArr = null;
        }
        if ((parcelableArr instanceof Specification[]) && (specificationArr = (Specification[]) parcelableArr) != null) {
            ArrayList arrayList = new ArrayList(specificationArr.length);
            final int i = 0;
            for (Specification specification : specificationArr) {
                final Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                ?? r2 = new ConstraintLayout(context, attributeSet, i) { // from class: X.2RQ
                    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

                    public final View _$_findCachedViewById(int i2) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
                        View view2 = (View) linkedHashMap.get(Integer.valueOf(i2));
                        if (view2 != null) {
                            return view2;
                        }
                        View findViewById = findViewById(i2);
                        if (findViewById == null) {
                            return null;
                        }
                        linkedHashMap.put(Integer.valueOf(i2), findViewById);
                        return findViewById;
                    }

                    public final void setDesc(String str) {
                        if (str != null) {
                            ((TextView) _$_findCachedViewById(R.id.desc)).setText(str);
                        }
                    }

                    public final void setTitle(String str) {
                        if (str != null) {
                            ((TextView) _$_findCachedViewById(R.id.title)).setText(str);
                        }
                    }

                    {
                        super(context, attributeSet, i);
                        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a48, this, true);
                    }
                };
                int i2 = C27162AlK.LJIIIIZZ;
                r2.setTitle(specification.name);
                r2.setDesc(specification.value);
                r2.setPadding(i2, i2, i2, i2);
                arrayList.add(r2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ViewGroup) _$_findCachedViewById(R.id.jci)).addView((View) it.next());
            }
        }
        C70414RkI LIZ = C27350AoM.LIZ(mo49getActivity());
        if (LIZ != null) {
            LIZ.LJJJJL(null, "specifications");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context != null) {
            view = C27531ArH.LIZ(R.layout.a28, context, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}
