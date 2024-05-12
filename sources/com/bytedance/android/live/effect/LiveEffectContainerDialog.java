package com.bytedance.android.live.effect;

import X.C10A;
import X.C16880lQ;
import X.C28507BGt;
import X.C78983UzD;
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
public final class LiveEffectContainerDialog extends LiveDialogFragment {
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d29);
        C78983UzD.LJIILIIL(c28507BGt);
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
        if (view2 != null && (frameLayout = (FrameLayout) view2.findViewById(R.id.crm)) != null) {
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
        C78983UzD.LJJLIIIJJIZ(this);
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 47), view);
        InterfaceC08010Td interfaceC08010Td = this.LJLIL;
        if (interfaceC08010Td == null || (view2 = interfaceC08010Td.getView()) == null || view2.getParent() != null) {
            dismiss();
        } else {
            ((ViewGroup) view.findViewById(R.id.crm)).addView(view2);
        }
        InterfaceC08010Td interfaceC08010Td2 = this.LJLIL;
        if (interfaceC08010Td2 != null) {
            interfaceC08010Td2.LIZIZ(this);
        }
    }
}
