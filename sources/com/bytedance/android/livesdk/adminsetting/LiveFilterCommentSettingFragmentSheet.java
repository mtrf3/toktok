package com.bytedance.android.livesdk.adminsetting;

import X.BZI;
import X.C0KB;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C28375BBr;
import X.C28787BRn;
import X.C30161Gi;
import X.C41051jJ;
import X.C41071jL;
import X.C5H3;
import X.C72259SXn;
import X.C78496UrM;
import X.C78996UzQ;
import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS206S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFilterCommentSettingFragmentSheet extends LiveSheetFragment {
    public C28375BBr LLF;
    public LinearLayout LLFFF;
    public LinearLayout LLFII;
    public LinearLayout LLFZ;
    public LiveIconView LLI;
    public C41071jL LLIFFJFJJ;
    public C41051jJ LLII;
    public C41051jJ LLIIII;
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();
    public final C5H3 LLD = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 102));
    public final C5H3 LLFF = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 101));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.mgy));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIIILZ).clear();
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

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        long j;
        String str;
        String string;
        super.onViewStateRestored(bundle);
        Room room = (Room) this.LLD.getValue();
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        boolean booleanValue = ((Boolean) this.LLFF.getValue()).booleanValue();
        C41051jJ c41051jJ = this.LLII;
        C41051jJ c41051jJ2 = this.LLIIII;
        C41071jL c41071jL = this.LLIFFJFJJ;
        LinearLayout linearLayout = this.LLFZ;
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("trigger")) == null) {
            str = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("entry")) != null) {
            str2 = string;
        }
        C28375BBr c28375BBr = new C28375BBr(j, booleanValue, c41051jJ, c41051jJ2, c41071jL, linearLayout, str, str2);
        this.LLF = c28375BBr;
        c28375BBr.LIZJ();
        LinearLayout linearLayout2 = this.LLFFF;
        if (linearLayout2 != null) {
            C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS25S0100000_5(this, 74));
        }
        C41051jJ c41051jJ3 = this.LLII;
        if (c41051jJ3 != null) {
            c41051jJ3.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 9));
        }
        LinearLayout linearLayout3 = this.LLFII;
        if (linearLayout3 != null) {
            C16880lQ.LJIIZILJ(linearLayout3, new ACListenerS25S0100000_5(this, 75));
        }
        C41051jJ c41051jJ4 = this.LLIIII;
        if (c41051jJ4 != null) {
            c41051jJ4.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 10));
        }
        LinearLayout linearLayout4 = this.LLFZ;
        if (linearLayout4 != null) {
            C16880lQ.LJIIZILJ(linearLayout4, new ACListenerS25S0100000_5(this, 76));
        }
        C41071jL c41071jL2 = this.LLIFFJFJJ;
        if (c41071jL2 != null) {
            c41071jL2.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 11));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cww, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LiveIconView liveIconView;
        C41071jL c41071jL;
        C41051jJ c41051jJ;
        String str;
        String string;
        LinearLayout linearLayout4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = getView();
        C41051jJ c41051jJ2 = null;
        if (view2 != null) {
            linearLayout = (LinearLayout) view2.findViewById(R.id.g5b);
        } else {
            linearLayout = null;
        }
        this.LLFFF = linearLayout;
        View view3 = getView();
        if (view3 != null) {
            linearLayout2 = (LinearLayout) view3.findViewById(R.id.g2f);
        } else {
            linearLayout2 = null;
        }
        this.LLFII = linearLayout2;
        View view4 = getView();
        if (view4 != null) {
            linearLayout3 = (LinearLayout) view4.findViewById(R.id.g5m);
        } else {
            linearLayout3 = null;
        }
        this.LLFZ = linearLayout3;
        View view5 = getView();
        if (view5 != null) {
            liveIconView = (LiveIconView) view5.findViewById(R.id.ebr);
        } else {
            liveIconView = null;
        }
        this.LLI = liveIconView;
        View view6 = getView();
        if (view6 != null) {
            c41071jL = (C41071jL) view6.findViewById(R.id.gai);
        } else {
            c41071jL = null;
        }
        this.LLIFFJFJJ = c41071jL;
        View view7 = getView();
        if (view7 != null) {
            c41051jJ = (C41051jJ) view7.findViewById(R.id.fo3);
        } else {
            c41051jJ = null;
        }
        this.LLII = c41051jJ;
        View view8 = getView();
        if (view8 != null) {
            c41051jJ2 = (C41051jJ) view8.findViewById(R.id.fo2);
        }
        this.LLIIII = c41051jJ2;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("entry")) != null && o.LJ(string, "autosuggest_comment_filter") && (linearLayout4 = this.LLFII) != null) {
            linearLayout4.setBackgroundColor(C259910h.LIZIZ(R.attr.aql, getContext()));
        }
        LiveIconView liveIconView2 = this.LLI;
        if (liveIconView2 != null) {
            C16880lQ.LJJII(liveIconView2, new ACListenerS25S0100000_5(this, 73));
        }
        LiveIconView liveIconView3 = this.LLI;
        if (liveIconView3 != null) {
            C72259SXn.LIZIZ(liveIconView3, 5, 5, 5, 5);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_filter_filter_comments_view");
        LIZ.LJIIZILJ();
        if (((Boolean) this.LLFF.getValue()).booleanValue()) {
            str = "anchor";
        } else {
            str = "admin";
        }
        LIZ.LJIJJ(str, "admin_type");
        LIZ.LJJIIJZLJL();
    }
}
