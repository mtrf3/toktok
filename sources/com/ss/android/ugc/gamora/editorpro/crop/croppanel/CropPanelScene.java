package com.ss.android.ugc.gamora.editorpro.crop.croppanel;

import X.AbstractC56012Ht;
import X.C1280450u;
import X.C134485Po;
import X.C134525Ps;
import X.C134535Pt;
import X.C134555Pv;
import X.C5PL;
import X.InterfaceC134575Px;
import X.TBT;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editorpro.crop.croppanel.CropPanelScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CropPanelScene extends AbstractC56012Ht<C134525Ps, C134555Pv> {
    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!C1280450u.LIZ()) {
            return;
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C134485Po c134485Po = new C134485Po(context);
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.gamora.editorpro.crop.croppanel.CropPanelScene$onViewCreated$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final boolean LJIJJLI() {
                    return false;
                }
            });
            recyclerView.setAdapter(c134485Po);
        }
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        ArrayList<C134535Pt> arrayList = c134485Po.LJLILLLLZI;
        arrayList.clear();
        String string = context2.getString(R.string.fm0);
        o.LJIIIIZZ(string, "context.getString(R.stri…een_freeformSection_body)");
        arrayList.add(new C134535Pt(string, C5PL.FREE));
        arrayList.add(new C134535Pt("9:16", C5PL.MODE_9_16));
        arrayList.add(new C134535Pt("16:9", C5PL.MODE_16_9));
        arrayList.add(new C134535Pt("1:1", C5PL.MODE_1_1));
        arrayList.add(new C134535Pt("3:4", C5PL.MODE_3_4));
        arrayList.add(new C134535Pt("4:3", C5PL.MODE_4_3));
        c134485Po.notifyDataSetChanged();
        c134485Po.LJLJI = new InterfaceC134575Px() { // from class: X.5Pp
            @Override // X.InterfaceC134575Px
            public final boolean LIZ(C5PL cropMode, boolean z) {
                o.LJIIIZ(cropMode, "cropMode");
                if (!CropPanelScene.this.getUiStates().LJ.LJLILLLLZI) {
                    return false;
                }
                CropPanelScene.this.getUiActions().LIZ.invoke(cropMode, Boolean.valueOf(z));
                return true;
            }
        };
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Pr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C134525Ps) obj).LJLIL;
            }
        }, null, new AqS168S0100000_2(c134485Po, 341), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (!C1280450u.LIZ()) {
            return new FrameLayout(requireSceneContext());
        }
        RecyclerView recyclerView = new RecyclerView(requireSceneContext(), null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setHasFixedSize(true);
        return recyclerView;
    }
}
