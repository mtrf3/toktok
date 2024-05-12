package com.bytedance.android.livesdk.chatroom.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C25320z2;
import X.C28946BXq;
import X.C29306Beo;
import X.C29S;
import X.C30868C9o;
import X.C3C5;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76800UCe;
import X.C90903hW;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC28951BXv;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveStickerDonationDialog extends BaseDialogFragmentV2 {
    public String LJLIL;
    public OrganizationModel LJLILLLLZI;
    public InterfaceC28951BXv LJLJI;
    public boolean LJLJJI;
    public View LJLJL;
    public LiveIconView LJLJLJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public boolean LJLJJL = true;
    public final C73318Sq2 LJLJJLL = new C73318Sq2();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC28951BXv interfaceC28951BXv = this.LJLJI;
        if (interfaceC28951BXv != null) {
            interfaceC28951BXv.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.LJLJJLL.LJLILLLLZI) {
            this.LJLJJLL.dispose();
        }
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.aai);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.requestWindowFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(true);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = (int) (C15380j0.LJIIJJI() * 0.6d);
            window.setAttributes(attributes);
            window.setDimAmount(0.0f);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS ti0;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJL = view.findViewById(R.id.khg);
        view.findViewById(R.id.bul);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.khd);
        this.LJLJLJ = liveIconView;
        if (liveIconView != null) {
            liveIconView.setVisibility(0);
        }
        TextView textView = (TextView) view.findViewById(R.id.khh);
        if (textView != null && this.LJLILLLLZI != null) {
            C16880lQ.LJIJI(textView, new ACListenerS25S0100000_5(this, 125));
            this.LJLJJLL.LIZ(C73943T0h.LIZ().LJ(C25320z2.class).LJJJJZI(new AfS57S0100000_5(this, 67)));
            this.LJLJJLL.LIZ(C73943T0h.LIZ().LJ(C28946BXq.class).LJJJJZI(new AfS57S0100000_5(this, 68)));
        }
        if (getContext() != null && C29306Beo.LJIJJLI(this.LJLIL)) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            Context context = getContext();
            o.LJI(context);
            String str = this.LJLIL;
            o.LJI(str);
            ti0 = ((IHybridContainerService) LIZ).ti0(context, str, true, true, new AqS171S0100000_5(this, 300));
            this.LJLJLLL = ti0;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.k98);
            if (viewGroup != null) {
                viewGroup.addView(this.LJLJLLL, -1, -1);
                return;
            }
            return;
        }
        C30868C9o.LIZJ(R.string.ng6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.din, inflater, viewGroup);
        C29S c29s = null;
        if (!(LLLZIIL instanceof View)) {
            LLLZIIL = null;
        }
        if (LLLZIIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
                C10A.LIZIZ(LLLZIIL, this);
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
        return LLLZIIL;
    }
}
