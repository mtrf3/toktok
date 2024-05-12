package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.featurepage.FeatureFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.EditViewModel;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.FeatureViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.agh, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94419agh extends C1C3 {
    public final /* synthetic */ FeatureFragment LJFF;

    @Override // X.C0B4
    public final boolean LJII() {
        return false;
    }

    @Override // X.C0B4
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    public C94419agh(FeatureFragment featureFragment) {
        this.LJFF = featureFragment;
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        StatisticReporter LIZ;
        if (i == 2 && (LIZ = C93670aUc.LIZ()) != null) {
            LIZ.onEvent("interaction_objectpanel_order_drag", C51029K0z.LJJIIZI(new OSZ("object_num", String.valueOf(this.LJFF.LJLJJLL.getItemCount()))));
        }
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        C94071ab5 c94071ab5 = this.LJFF.LJLJJLL;
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        FeatureViewModel Hl = c94071ab5.LJLILLLLZI.Hl();
        List<AbstractC94512aiC> value = Hl.LJLJI.LIZ.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(value);
            if (adapterPosition < arrayList.size() && adapterPosition2 < arrayList.size()) {
                Object obj = ListProtector.get(arrayList, adapterPosition);
                ListProtector.set(arrayList, adapterPosition, ListProtector.get(arrayList, adapterPosition2));
                ListProtector.set(arrayList, adapterPosition2, obj);
                StateViewModel.hv0(Hl.LJLJI, arrayList);
                AbstractC94372afw abstractC94372afw = Hl.LJLJJI;
                if (abstractC94372afw != null) {
                    abstractC94372afw.LJII(arrayList);
                }
            }
        }
        EditViewModel Gl = c94071ab5.LJLILLLLZI.Gl();
        if (Gl != null) {
            Gl.kv0();
            return true;
        }
        return true;
    }
}
