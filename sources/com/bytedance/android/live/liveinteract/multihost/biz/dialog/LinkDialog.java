package com.bytedance.android.live.liveinteract.multihost.biz.dialog;

import X.AbstractC75932Tr6;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C28507BGt;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76029Tsf;
import X.C76093Tth;
import X.C76095Ttj;
import X.C76800UCe;
import X.EnumC29609Bjh;
import X.EnumC76391TyV;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.InterfaceC75477Tjl;
import X.InterfaceC75854Tpq;
import X.InterfaceC76087Ttb;
import X.InterfaceC76094Tti;
import X.TBV;
import Y.ACListenerS33S0100000_13;
import Y.AUListenerS99S0200000_9;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkDialogDismissEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkTransLayoutFixSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkDialog extends LiveDialogFragment implements InterfaceC76087Ttb, InterfaceC75854Tpq, InterfaceC75477Tjl {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final LifecycleOwner LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public View LJLJI;
    public final C76093Tth LJLJJI;
    public EnumC76391TyV LJLJJL;
    public AbstractC75932Tr6 LJLJJLL;
    public final Map<Integer, View> LJLJL;

    static {
        TBV tbv = new TBV(LinkDialog.class, "childDialogParams", "getChildDialogParams()Lcom/bytedance/android/live/liveinteract/multihost/biz/dialog/LinkDialogContract$LinkDialogParams;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        if (LinkTransLayoutFixSettings.INSTANCE.getValue()) {
            i = R.layout.d4d;
        } else {
            i = R.layout.d4c;
        }
        C28507BGt c28507BGt = new C28507BGt(i);
        c28507BGt.LIZJ = R.style.ac_;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(LinkDialogDismissEvent.class);
        }
        super.dismiss();
    }

    @Override // X.InterfaceC75854Tpq
    public final EnumC76391TyV g6() {
        EnumC76391TyV enumC76391TyV = this.LJLJJL;
        if (enumC76391TyV != null) {
            return enumC76391TyV;
        }
        o.LJIJI("initFragmentType");
        throw null;
    }

    public final void vl() {
        Context context;
        Dialog dialog;
        View currentFocus;
        if (this.isViewValid && (context = getContext()) != null && (dialog = getDialog()) != null && (currentFocus = dialog.getCurrentFocus()) != null) {
            Object LLILL = C16880lQ.LLILL(context, "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) LLILL;
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        InteractDialogFragmentBaseContract$AbsView<?> LIZJ = xl().LIZJ();
        if (LIZJ == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIJJI(R.anim.gw, R.anim.gx, R.anim.gw, R.anim.gx);
        LIZ.LJ(null);
        LIZ.LJIIIIZZ(R.id.dm7, 1, LIZJ, null);
        LIZ.LJIILJJIL();
    }

    public final C76029Tsf wl() {
        return this.LJLJJI.LIZ(this, LJLJLJ[0]);
    }

    public final InterfaceC76094Tti xl() {
        return (InterfaceC76094Tti) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        if (wl().LIZJ) {
            if (xl().LIZIZ()) {
                getChildFragmentManager().LJJLIIIJJI();
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = wl().LJI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            return true;
        }
        if (!wl().LJFF) {
            return true;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = wl().LJI;
        if (interfaceC65784Pro2 != null) {
            interfaceC65784Pro2.invoke();
            return false;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        xl().LIZ();
    }

    @Override // X.InterfaceC75477Tjl
    public final LifecycleOwner getLifecycleOwner() {
        return this.LJLIL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_LINK;
    }

    @Override // X.InterfaceC76087Ttb
    public final DataChannel j9() {
        return this.dataChannel;
    }

    public LinkDialog(LifecycleOwner mLifecycleOwner) {
        o.LJIIIZ(mLifecycleOwner, "mLifecycleOwner");
        this.LJLJL = new LinkedHashMap();
        this.LJLIL = mLifecycleOwner;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 118));
        this.LJLJJI = new C76093Tth(new C76029Tsf(), this);
    }

    @Override // X.InterfaceC75477Tjl
    public final void f9(C76029Tsf c76029Tsf) {
        this.LJLJJI.LIZIZ(LJLJLJ[0], this, c76029Tsf);
    }

    public static final void Dl(LinkDialog linkDialog, View view) {
        ViewGroup viewGroup;
        View view2 = linkDialog.LJLJI;
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.fj7)) != null) {
            viewGroup.removeAllViews();
            if (view != null) {
                viewGroup.setVisibility(0);
                viewGroup.addView(view);
            } else {
                viewGroup.setVisibility(8);
            }
        }
    }

    public final void Al(EnumC76391TyV type, AbstractC75932Tr6 abstractC75932Tr6) {
        o.LJIIIZ(type, "type");
        this.LJLJJL = type;
        this.LJLJJLL = abstractC75932Tr6;
    }

    @Override // X.InterfaceC75477Tjl
    public final void D6(int i, int i2) {
        ViewGroup viewGroup;
        if (i < 0 || i2 < 0) {
            return;
        }
        View view = this.LJLJI;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.dm7);
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
            }
        } else {
            viewGroup = null;
        }
        if (i != 0) {
            ValueAnimator ofInt = ValueAnimator.ofInt(C15380j0.LIZ(i), C15380j0.LIZ(i2));
            ofInt.addUpdateListener(new AUListenerS99S0200000_9(layoutParams, viewGroup, 0));
            ofInt.setDuration(300L);
            ofInt.start();
            return;
        }
        if (layoutParams != null) {
            layoutParams.height = C15380j0.LIZ(i2);
        }
        if (viewGroup == null) {
            return;
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC75477Tjl
    public final void W5(EnumC76391TyV fragmentType, AbstractC75932Tr6 abstractC75932Tr6) {
        o.LJIIIZ(fragmentType, "fragmentType");
        if (xl().LIZLLL(fragmentType, abstractC75932Tr6)) {
            vl();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = view;
        getChildFragmentManager().LJ(new C76095Ttj(this, view));
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 42), view.findViewById(R.id.hep));
        InterfaceC76094Tti xl = xl();
        EnumC76391TyV enumC76391TyV = this.LJLJJL;
        if (enumC76391TyV != null) {
            xl.LIZLLL(enumC76391TyV, this.LJLJJLL);
            vl();
        } else {
            o.LJIJI("initFragmentType");
            throw null;
        }
    }
}
