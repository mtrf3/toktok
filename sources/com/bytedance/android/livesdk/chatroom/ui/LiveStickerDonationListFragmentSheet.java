package com.bytedance.android.livesdk.chatroom.ui;

import X.ActivityC45651qj;
import X.BPP;
import X.C03880Dg;
import X.C0KB;
import X.C113554cx;
import X.C15380j0;
import X.C16880lQ;
import X.C28934BXe;
import X.C28940BXk;
import X.C28941BXl;
import X.C28946BXq;
import X.C29306Beo;
import X.C30161Gi;
import X.C47121t6;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C73943T0h;
import X.C77437UaH;
import X.C78496UrM;
import X.CVT;
import X.DialogC77438UaI;
import X.DialogInterfaceOnClickListenerC28932BXc;
import X.DialogInterfaceOnDismissListenerC28930BXa;
import X.DialogInterfaceOnShowListenerC28931BXb;
import X.InterfaceC28935BXf;
import X.OSZ;
import Y.AfS57S0100000_5;
import Y.IDCListenerS49S0200000_5;
import Y.IDrS45S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdkapi.depend.live.OrganizationResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveStickerDonationListFragmentSheet extends LiveSheetFragment implements View.OnClickListener, InterfaceC28935BXf {
    public int LLD;
    public boolean LLFF;
    public C28941BXl LLFFF;
    public final C28934BXe LLFII;
    public boolean LLFZ;
    public final C73318Sq2 LLI;
    public DialogC77438UaI LLIFFJFJJ;
    public String LLII;
    public final Map<Integer, View> LLIIII = new LinkedHashMap();
    public boolean LLF = true;

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIII;
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

    public LiveStickerDonationListFragmentSheet() {
        C28934BXe c28934BXe = new C28934BXe();
        c28934BXe.attachView(this);
        this.LLFII = c28934BXe;
        this.LLI = new C73318Sq2();
        this.LLII = "live_take_page";
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.kxi));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    public final void loadData() {
        if (!this.LLF || this.LLFF) {
            return;
        }
        if (this.LLD == 0) {
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
        this.LLFII.LJJJJ(C113554cx.LJJLIIIIJ(new OSZ("cursor", String.valueOf(this.LLD)), new OSZ("count", "11")));
        this.LLFF = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLFZ = false;
        this.LLFII.detachView();
        this.LLI.dispose();
        this.LLI.LIZLLL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIII).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    @Override // X.InterfaceC28935BXf
    public final void M(Throwable th) {
        if (!this.LLFZ) {
            return;
        }
        this.LLFF = false;
        BPP.LIZLLL(getContext(), th, R.string.syh);
        if (this.LLD == 0) {
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
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null || valueOf.intValue() != R.id.izm) {
            return;
        }
        loadData();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ActivityC45651qj LIZIZ;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "live_take_page";
        if (arguments != null && (string = arguments.getString("event_page", "live_take_page")) != null) {
            str = string;
        }
        this.LLII = str;
        this.LLFZ = true;
        this.LLI.LIZ(C73943T0h.LIZ().LJ(C28940BXk.class).LJJJJZI(new AfS57S0100000_5(this, 71)));
        this.LLI.LIZ(C73943T0h.LIZ().LJ(C28946BXq.class).LJJJJZI(new AfS57S0100000_5(this, 72)));
        Context context = getContext();
        if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null) {
            this.LLFFF = new C28941BXl(LIZIZ);
        }
    }

    public final void onEvent(C28940BXk c28940BXk) {
        if (c28940BXk.LIZ == null) {
            return;
        }
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LIZJ = C15380j0.LJIILL(R.string.np4, c28940BXk.LIZ.name);
        c77437UaH.LIZIZ(R.string.np5);
        c77437UaH.LJ(R.string.np6, new IDCListenerS49S0200000_5(this, c28940BXk, 2), false);
        c77437UaH.LIZJ(R.string.snz, DialogInterfaceOnClickListenerC28932BXc.LJLIL, false);
        c77437UaH.LJIILL = DialogInterfaceOnDismissListenerC28930BXa.LJLIL;
        c77437UaH.LJIILLIIL = DialogInterfaceOnShowListenerC28931BXb.LJLIL;
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        this.LLIFFJFJJ = LIZ;
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "6591964020640574880")).LIZ) {
            return;
        }
        LIZ.show();
    }

    @Override // X.InterfaceC28935BXf
    public final void wk(OrganizationResponse organizationResponse) {
        o.LJIIIZ(organizationResponse, "organizationResponse");
        if (!this.LLFZ) {
            return;
        }
        this.LLFF = false;
        this.LLD = organizationResponse.cursor;
        boolean z = true;
        if (organizationResponse.hasMore != 1) {
            z = false;
        }
        this.LLF = z;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.kh8);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.g94);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(8);
        }
        C28941BXl c28941BXl = this.LLFFF;
        if (c28941BXl != null) {
            c28941BXl.LJLLLLLL(organizationResponse);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cyo, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
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
            recyclerView.setAdapter(this.LLFFF);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.kh8);
        if (recyclerView2 != null) {
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.kh8);
        if (recyclerView3 != null) {
            recyclerView3.LJIIJJI(new IDrS45S0100000_5(this, 2));
        }
        loadData();
    }
}
