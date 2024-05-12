package com.bytedance.android.livesdk.chatroom.ui;

import X.ActivityC45651qj;
import X.BPP;
import X.C03880Dg;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C28934BXe;
import X.C28940BXk;
import X.C28941BXl;
import X.C28946BXq;
import X.C29306Beo;
import X.C29S;
import X.C3C5;
import X.C47121t6;
import X.C51029K0z;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76800UCe;
import X.C77437UaH;
import X.C90903hW;
import X.CVT;
import X.DialogC77438UaI;
import X.DialogInterfaceOnClickListenerC28938BXi;
import X.DialogInterfaceOnDismissListenerC28936BXg;
import X.DialogInterfaceOnShowListenerC28937BXh;
import X.InterfaceC28935BXf;
import X.OSZ;
import Y.AfS57S0100000_5;
import Y.IDCListenerS49S0200000_5;
import Y.IDrS45S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.LiveShowMoreDialogEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveSettingEvent;
import com.bytedance.android.livesdkapi.depend.live.OrganizationResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveStickerDonationListDialog extends BaseDialogFragmentV2 implements View.OnClickListener, InterfaceC28935BXf {
    public int LJLIL;
    public boolean LJLJI;
    public C28941BXl LJLJJI;
    public final C28934BXe LJLJJL;
    public boolean LJLJJLL;
    public final C73318Sq2 LJLJL;
    public DialogC77438UaI LJLJLJ;
    public String LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public boolean LJLILLLLZI = true;

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    public LiveStickerDonationListDialog() {
        C28934BXe c28934BXe = new C28934BXe();
        c28934BXe.attachView(this);
        this.LJLJJL = c28934BXe;
        this.LJLJL = new C73318Sq2();
        this.LJLJLLL = "live_take_page";
    }

    public final void loadData() {
        if (!this.LJLILLLLZI || this.LJLJI) {
            return;
        }
        if (this.LJLIL == 0) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.kh8);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.g94);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
            CVT cvt = (CVT) _$_findCachedViewById(R.id.ia9);
            if (cvt != null) {
                cvt.setVisibility(0);
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.izm);
            if (_$_findCachedViewById3 != null) {
                _$_findCachedViewById3.setVisibility(8);
            }
        }
        this.LJLJJL.LJJJJ(C113554cx.LJJLIIIIJ(new OSZ("cursor", String.valueOf(this.LJLIL)), new OSZ("count", "11")));
        this.LJLJI = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJLL = false;
        this.LJLJJL.detachView();
        this.LJLJL.dispose();
        this.LJLJL.LIZLLL();
    }

    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.InterfaceC28935BXf
    public final void M(Throwable th) {
        if (!this.LJLJJLL) {
            return;
        }
        this.LJLJI = false;
        BPP.LIZLLL(getContext(), th, R.string.syh);
        if (this.LJLIL == 0) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.kh8);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.g94);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
            CVT cvt = (CVT) _$_findCachedViewById(R.id.ia9);
            if (cvt != null) {
                cvt.setVisibility(8);
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.izm);
            if (_$_findCachedViewById3 == null) {
                return;
            }
            _$_findCachedViewById3.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.izm) {
            loadData();
            return;
        }
        if (valueOf.intValue() != R.id.kh0) {
            return;
        }
        dismissAllowingStateLoss();
        if (o.LJ(this.LJLJLLL, "live_take_page")) {
            DataChannelGlobal.LJLJJI.rv0(PreviewLiveSettingEvent.class);
            return;
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null) {
            return;
        }
        LJIILIIL.pv0(LiveShowMoreDialogEvent.class);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ActivityC45651qj LIZIZ;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "live_take_page";
        if (arguments != null && (string = arguments.getString("event_page", "live_take_page")) != null) {
            str = string;
        }
        this.LJLJLLL = str;
        this.LJLJJLL = true;
        setStyle(1, R.style.aai);
        this.LJLJL.LIZ(C73943T0h.LIZ().LJ(C28940BXk.class).LJJJJZI(new AfS57S0100000_5(this, 69)));
        this.LJLJL.LIZ(C73943T0h.LIZ().LJ(C28946BXq.class).LJJJJZI(new AfS57S0100000_5(this, 70)));
        Context context = getContext();
        if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null) {
            this.LJLJJI = new C28941BXl(LIZIZ);
        }
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

    public final void onEvent(C28940BXk c28940BXk) {
        if (c28940BXk.LIZ == null) {
            return;
        }
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LIZJ = C15380j0.LJIILL(R.string.np4, c28940BXk.LIZ.name);
        c77437UaH.LIZIZ(R.string.np5);
        c77437UaH.LJ(R.string.np6, new IDCListenerS49S0200000_5(this, c28940BXk, 1), false);
        c77437UaH.LIZJ(R.string.snz, DialogInterfaceOnClickListenerC28938BXi.LJLIL, false);
        c77437UaH.LJIILL = DialogInterfaceOnDismissListenerC28936BXg.LJLIL;
        c77437UaH.LJIILLIIL = DialogInterfaceOnShowListenerC28937BXh.LJLIL;
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        this.LJLJLJ = LIZ;
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "5045696614427034039")).LIZ) {
            return;
        }
        LIZ.show();
    }

    @Override // X.InterfaceC28935BXf
    public final void wk(OrganizationResponse organizationResponse) {
        o.LJIIIZ(organizationResponse, "organizationResponse");
        if (!this.LJLJJLL) {
            return;
        }
        this.LJLJI = false;
        this.LJLIL = organizationResponse.cursor;
        boolean z = true;
        if (organizationResponse.hasMore != 1) {
            z = false;
        }
        this.LJLILLLLZI = z;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.kh8);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.g94);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(8);
        }
        C28941BXl c28941BXl = this.LJLJJI;
        if (c28941BXl != null) {
            c28941BXl.LJLLLLLL(organizationResponse);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C47121t6 c47121t6 = (C47121t6) _$_findCachedViewById(R.id.izm);
        if (c47121t6 != null) {
            C16880lQ.LJJIIZ(c47121t6, this);
        }
        LiveIconView liveIconView = (LiveIconView) _$_findCachedViewById(R.id.kh0);
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, this);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.kh8);
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LJLJJI);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.kh8);
        if (recyclerView2 != null) {
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.kh8);
        if (recyclerView3 != null) {
            recyclerView3.LJIIJJI(new IDrS45S0100000_5(this, 1));
        }
        loadData();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cyn, inflater, viewGroup);
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
