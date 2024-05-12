package com.bytedance.android.livesdk.adminsetting;

import X.B83;
import X.C05490Jl;
import X.C0KB;
import X.C15380j0;
import X.C16340kY;
import X.C16360ka;
import X.C28373BBp;
import X.C28381BBx;
import X.C29374Bfu;
import X.C30161Gi;
import X.C78496UrM;
import X.CN1;
import X.InterfaceC06390Mx;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMuteDurationSettingFragmentSheet extends LiveSheetFragment {
    public C05490Jl LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLF;
        Integer valueOf = Integer.valueOf(R.id.cjd);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.cjd)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.mjj));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C05490Jl c05490Jl = this.LLD;
        if (c05490Jl != null) {
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            InterfaceC06390Mx LIZ = CN1.LIZ(IAdminSettingService.class);
            o.LJIIIIZZ(LIZ, "getService(IAdminSettingService::class.java)");
            ((IAdminSettingService) LIZ).ap0("anchor", c05490Jl, "live_take_page", currentUserId, null);
            this.LLD = null;
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d0l, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cjd);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Context context = getContext();
        if (context != null) {
            C28381BBx c28381BBx = new C28381BBx(context, true);
            c28381BBx.LJLJJLL = new AqS171S0100000_5(this, LiveTryModeCountDownThresholdSetting.DEFAULT);
            ((RecyclerView) _$_findCachedViewById(R.id.cjd)).setAdapter(c28381BBx);
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).Zo0(new AqS171S0100000_5(c28381BBx, 121));
        }
        C16360ka.LJIJJ(_$_findCachedViewById(R.id.cjd), new C28373BBp());
        C16340kY.LIZJ(_$_findCachedViewById(R.id.cjd));
    }
}
