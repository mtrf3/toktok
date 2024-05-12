package com.bytedance.android.livesdk.adminsetting.fastfiltercomment;

import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C17230lz;
import X.C17240m0;
import X.C28376BBs;
import X.C28379BBv;
import X.C28787BRn;
import X.C29306Beo;
import X.C51029K0z;
import X.C78496UrM;
import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FastFilterCommentFragmentSheet extends LiveSheetFragment {
    public C28376BBs LLD;
    public final Map<Integer, View> LLFFF = new LinkedHashMap();
    public String LLF = "";
    public String LLFF = "";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C17230lz Il() {
        C17230lz c17230lz = new C17230lz();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C17240m0(C15380j0.LJIILJJIL(R.string.kcq), R.style.a32, new C28379BBv(this)));
        c17230lz.LIZ(arrayList);
        return c17230lz;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFFF).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cwr, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            str = arguments.getString("trigger");
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LLF = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("action")) != null) {
            str2 = string;
        }
        this.LLFF = str2;
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_filter_suggestion_popup_show");
        LIZ.LJI();
        LIZ.LJIJJ(this.LLF, "trigger");
        LIZ.LJIJJ(this.LLFF, "action");
        LIZ.LJJIIJZLJL();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            j = C29306Beo.LJJIZ(LJIILIIL);
        } else {
            j = 0;
        }
        C28376BBs c28376BBs = new C28376BBs(j, C29306Beo.LJIIJ(LJIILIIL), this.LLF);
        this.LLD = c28376BBs;
        c28376BBs.LIZJ();
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 88), view.findViewById(R.id.bf7));
        ((TextView) view.findViewById(R.id.elu)).setText(C15380j0.LJIILL(R.string.kct, C15380j0.LJIILJJIL(R.string.kcu)));
    }
}
