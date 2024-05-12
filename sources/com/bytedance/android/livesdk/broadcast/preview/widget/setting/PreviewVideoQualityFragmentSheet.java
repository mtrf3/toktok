package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0KB;
import X.C15380j0;
import X.C29185Bcr;
import X.C30161Gi;
import X.C51029K0z;
import X.C78496UrM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.broadcast.PreScheduleStreamChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.creator.PreScheduleStream;

/* loaded from: classes6.dex */
public final class PreviewVideoQualityFragmentSheet extends LiveSheetFragment {
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.nrj));
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
        ((LinkedHashMap) this.LLD).clear();
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
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d5c, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PreScheduleStream preScheduleStream;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (preScheduleStream = (PreScheduleStream) LJIILIIL.kv0(PreScheduleStreamChannel.class)) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
        View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.isn));
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null && (view2 = view3.findViewById(R.id.isn)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.isn), view2);
            } else {
                view2 = null;
            }
        }
        ((RecyclerView) view2).setAdapter(new C29185Bcr(this, preScheduleStream));
    }
}
