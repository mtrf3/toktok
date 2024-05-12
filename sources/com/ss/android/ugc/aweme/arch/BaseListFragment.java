package com.ss.android.ugc.aweme.arch;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C207668Da;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC84984XWy;
import X.XRT;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseListFragment<T> extends AmeBaseFragment implements Observer<C207668Da> {
    public InterfaceC84984XWy<T> LJLIL;
    public DataCenter LJLILLLLZI;

    public abstract String V();

    public abstract String b();

    public abstract void initData();

    public abstract InterfaceC84984XWy<T> o2(View view);

    public abstract int vl();

    public abstract String wl();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        C207668Da c207668Da2 = c207668Da;
        if (this.LJLIL == null || c207668Da2 == null || TextUtils.isEmpty(c207668Da2.LIZ)) {
            return;
        }
        String str = c207668Da2.LIZ;
        boolean z = false;
        Object obj = null;
        if (TextUtils.equals(str, V())) {
            Object obj2 = c207668Da2.LIZIZ;
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj == 0) {
                return;
            }
            this.LJLIL.LIZ();
            return;
        }
        if (TextUtils.equals(str, b())) {
            Object obj3 = c207668Da2.LIZIZ;
            if (obj3 != null) {
                obj = obj3;
            }
            if (obj == 0) {
                return;
            }
            this.LJLIL.showLoadMoreError();
            return;
        }
        if (!TextUtils.equals(str, wl())) {
            return;
        }
        XRT xrt = (XRT) this.LJLILLLLZI.get(wl());
        int intValue = ((Integer) xrt.LIZ("action_type")).intValue();
        if (intValue == 1) {
            List<T> list = (List) xrt.LIZ("list_data");
            InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLIL;
            Object LIZ = xrt.LIZ("list_hasmore");
            if (LIZ instanceof Integer) {
                if (((Integer) LIZ).intValue() == 1) {
                    z = true;
                }
            } else if (LIZ instanceof Boolean) {
                z = ((Boolean) LIZ).booleanValue();
            }
            interfaceC84984XWy.J5(list, z);
            return;
        }
        if (intValue != 2) {
            return;
        }
        List<T> list2 = (List) xrt.LIZ("list_data");
        InterfaceC84984XWy<T> interfaceC84984XWy2 = this.LJLIL;
        Object LIZ2 = xrt.LIZ("list_hasmore");
        if (LIZ2 instanceof Integer) {
            if (((Integer) LIZ2).intValue() == 1) {
                z = true;
            }
        } else if (LIZ2 instanceof Boolean) {
            z = ((Boolean) LIZ2).booleanValue();
        }
        interfaceC84984XWy2.j0(list2, z);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = DataCenter.gv0(ViewModelProviders.of(this), this);
        }
        if (!TextUtils.isEmpty(wl())) {
            this.LJLILLLLZI.iv0(wl(), this, false);
        }
        if (!TextUtils.isEmpty(V())) {
            this.LJLILLLLZI.iv0(V(), this, false);
        }
        if (!TextUtils.isEmpty(b())) {
            this.LJLILLLLZI.iv0(b(), this, false);
        }
        this.LJLIL = o2(view);
        initData();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, vl(), viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
