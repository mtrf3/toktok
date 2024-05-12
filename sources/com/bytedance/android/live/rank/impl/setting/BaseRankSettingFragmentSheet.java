package com.bytedance.android.live.rank.impl.setting;

import X.BJ6;
import X.BJ7;
import X.BJ8;
import X.BJW;
import X.BZI;
import X.C011602u;
import X.C0KB;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C30161Gi;
import X.C51029K0z;
import X.C78496UrM;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class BaseRankSettingFragmentSheet extends LiveSheetFragment {
    public BJW LLD;
    public BJW LLF;
    public BJW LLFF;
    public final Map<Integer, View> LLFFF = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFFF).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public BaseRankSettingFragmentSheet() {
        BJW bjw = BJW.RANK_SWITCH_STATUS_HIDE;
        this.LLD = bjw;
        this.LLF = bjw;
        this.LLFF = bjw;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.ml5));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    public BJW Ml() {
        return this.LLFF;
    }

    public BJW Nl() {
        return this.LLD;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    public final BZI Ol(String str) {
        String str2;
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIJJ("live_take_page", "enter_from");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && C29306Beo.LJIIJ(LJIILIIL)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ.LJIJJ(str2, "user_type");
        return LIZ;
    }

    public void Pl(BJW bjw) {
        o.LJIIIZ(bjw, "<set-?>");
        this.LLFF = bjw;
    }

    public void Ql(BJW bjw) {
        o.LJIIIZ(bjw, "<set-?>");
        this.LLD = bjw;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d09, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.dup);
        BJW Nl = Nl();
        BJW bjw = BJW.RANK_SWITCH_STATUS_HIDE;
        int i3 = 8;
        boolean z3 = false;
        if (Nl != bjw) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        C011602u c011602u = (C011602u) _$_findCachedViewById(R.id.duo);
        BJW Nl2 = Nl();
        BJW bjw2 = BJW.RANK_SWITCH_STATUS_ON;
        if (Nl2 == bjw2) {
            z = true;
        } else {
            z = false;
        }
        c011602u.setChecked(z);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.dup), new BJ8(this));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.dqs);
        if (this.LLF != bjw) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        _$_findCachedViewById2.setVisibility(i2);
        C011602u c011602u2 = (C011602u) _$_findCachedViewById(R.id.dqr);
        if (this.LLF == bjw2) {
            z2 = true;
        } else {
            z2 = false;
        }
        c011602u2.setChecked(z2);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.dqs), new BJ6(this));
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.ckp);
        if (Ml() != bjw) {
            i3 = 0;
        }
        _$_findCachedViewById3.setVisibility(i3);
        C011602u c011602u3 = (C011602u) _$_findCachedViewById(R.id.cko);
        if (Ml() == bjw2) {
            z3 = true;
        }
        c011602u3.setChecked(z3);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.ckp), new BJ7(this));
    }
}
