package com.bytedance.android.live.effect.bgeffect;

import X.C10A;
import X.C16880lQ;
import X.C28507BGt;
import X.C29306Beo;
import X.C61712OJw;
import X.C61713OJx;
import X.InterfaceC08010Td;
import Y.IDCListenerS135S0100000;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveBgDialogFragment extends LiveDialogFragment {
    public InterfaceC08010Td LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cuj);
        c28507BGt.LIZJ = R.style.ac5;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 3;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FrameLayout frameLayout;
        View view;
        super.onDestroyView();
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td != null) {
            interfaceC08010Td.LIZ();
        }
        View view2 = getView();
        if (view2 != null && (frameLayout = (FrameLayout) view2.findViewById(R.id.aja)) != null) {
            InterfaceC08010Td interfaceC08010Td2 = this.LJLIL;
            if (interfaceC08010Td2 != null) {
                view = interfaceC08010Td2.getView();
            } else {
                view = null;
            }
            C16880lQ.LJLLLL(view, frameLayout);
        }
        this.LJLIL = null;
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (C29306Beo.LIZIZ(getContext()) != null) {
            C61713OJx LIZ = C61712OJw.LIZ(this);
            LIZ.LIZIZ(false, false);
            LIZ.LIZIZ.LJIIL();
            LIZ.LJFF(-16777216);
            LIZ.LIZIZ.LJII(false);
            LIZ.LIZJ();
        }
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td != null) {
            interfaceC08010Td.onDialogForeground();
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td != null) {
            interfaceC08010Td.onDialogBackground();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIILJJIL((FrameLayout) view.findViewById(R.id.am2), new IDCListenerS135S0100000(this, 48));
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        View view3 = null;
        if (interfaceC08010Td == null || (view2 = interfaceC08010Td.getView()) == null || view2.getParent() == null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.aja);
            InterfaceC08010Td interfaceC08010Td2 = this.LJLIL;
            if (interfaceC08010Td2 != null) {
                view3 = interfaceC08010Td2.getView();
            }
            viewGroup.addView(view3);
        } else {
            dismiss();
        }
        InterfaceC08010Td interfaceC08010Td3 = this.LJLIL;
        if (interfaceC08010Td3 != null) {
            interfaceC08010Td3.LIZIZ(this);
        }
    }
}
