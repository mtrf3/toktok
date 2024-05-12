package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ecom.search;

import X.AbstractC56012Ht;
import X.C16880lQ;
import X.C42603Gnn;
import X.C45663Hw3;
import X.C45890Hzi;
import X.C45895Hzn;
import X.C45896Hzo;
import X.C45897Hzp;
import X.G7O;
import X.KL2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExtendAlbumScene extends AbstractC56012Ht<C45895Hzn, C45897Hzp> implements G7O {
    public RecyclerView LJLIL;
    public int LJLILLLLZI;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getUiStates().LJ.LJLIL.isEmpty()) {
            this.mView.setVisibility(8);
            return;
        }
        View view = this.mView;
        if (view instanceof C45890Hzi) {
            o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ecom.search.ExtendAlbumLayout");
            ((C45890Hzi) view).setGestureListener(new C45896Hzo(this));
        }
        this.LJLIL = (RecyclerView) findViewById(R.id.cks);
        C42603Gnn c42603Gnn = new C42603Gnn(getUiActions().LJLJI, getUiStates().LJ.LJLIL);
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            recyclerView.setAdapter(c42603Gnn);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new WrapGridLayoutManager() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ecom.search.ExtendAlbumScene$onActivityCreated$2$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final boolean LJIL() {
                    return false;
                }
            });
            recyclerView.LJII(new C45663Hw3(4, (int) KL2.LIZJ(recyclerView.getContext(), 1.0f), false), -1);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        this.LJLILLLLZI = (int) (KL2.LJIIIZ(getSceneContext()) * 0.19d);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.anx, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        viewGroup.getLayoutParams().height = this.LJLILLLLZI;
        return viewGroup;
    }
}
