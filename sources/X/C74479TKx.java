package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.TKx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74479TKx extends C0A6 {
    public final /* synthetic */ C74480TKy LJLIL;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    public C74479TKx(C74480TKy c74480TKy) {
        this.LJLIL = c74480TKy;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int LLILL;
        View LJJIJIL;
        C74480TKy c74480TKy;
        C74478TKw c74478TKw;
        Object next;
        OSZ osz;
        EffectCategoryResponse effectCategoryResponse;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (((ArrayList) this.LJLIL.LJJIL).isEmpty()) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && (LJJIJIL = linearLayoutManager.LJJIJIL((LLILL = linearLayoutManager.LLILL()))) != null && (c74478TKw = (c74480TKy = this.LJLIL).LJJIJIL) != null) {
            Object obj = c74478TKw.LJLILLLLZI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
                if (((Number) entry.getKey()).intValue() < LLILL) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                    do {
                        Object next2 = it.next();
                        int intValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                        if (intValue < intValue2) {
                            next = next2;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                osz = new OSZ(entry2.getKey(), entry2.getValue());
            } else {
                osz = null;
            }
            C42230Ghm c42230Ghm = c74480TKy.LJJIJL;
            o.LJI(c42230Ghm);
            if (osz == null || (effectCategoryResponse = (EffectCategoryResponse) osz.getSecond()) == null) {
                effectCategoryResponse = (EffectCategoryResponse) ((OSZ) ORZ.LJLLJ(c74480TKy.LJJIL)).getFirst();
            }
            c74480TKy.LJJIIZI(c42230Ghm, effectCategoryResponse);
            EffectCategoryResponse effectCategoryResponse2 = (EffectCategoryResponse) ((LinkedHashMap) c74478TKw.LJLILLLLZI).get(Integer.valueOf(LLILL));
            if (effectCategoryResponse2 != null) {
                int top = LJJIJIL.getTop();
                C42230Ghm c42230Ghm2 = c74480TKy.LJJIJLIJ;
                o.LJI(c42230Ghm2);
                View view = c42230Ghm2.itemView;
                o.LJIIIIZZ(view, "fakeAboutStickyHeader!!.itemView");
                if (top > (-view.getMeasuredHeight())) {
                    C42230Ghm c42230Ghm3 = c74480TKy.LJJIJL;
                    o.LJI(c42230Ghm3);
                    View view2 = c42230Ghm3.itemView;
                    o.LJIIIIZZ(view2, "fakeStickyHeader!!.itemView");
                    view2.setTranslationY(LJJIJIL.getTop());
                    C42230Ghm c42230Ghm4 = c74480TKy.LJJIJLIJ;
                    o.LJI(c42230Ghm4);
                    View view3 = c42230Ghm4.itemView;
                    o.LJIIIIZZ(view3, "fakeAboutStickyHeader!!.itemView");
                    view3.setVisibility(0);
                    C42230Ghm c42230Ghm5 = c74480TKy.LJJIJLIJ;
                    o.LJI(c42230Ghm5);
                    View view4 = c42230Ghm5.itemView;
                    o.LJIIIIZZ(view4, "fakeAboutStickyHeader!!.itemView");
                    view4.setTranslationY(LJJIJIL.getTop());
                    C42230Ghm c42230Ghm6 = c74480TKy.LJJIJLIJ;
                    o.LJI(c42230Ghm6);
                    c74480TKy.LJJIIZI(c42230Ghm6, effectCategoryResponse2);
                    LJJIJIL.setVisibility(4);
                    c74480TKy.LJJJI = LJJIJIL;
                    return;
                }
            }
            C42230Ghm c42230Ghm7 = c74480TKy.LJJIJL;
            o.LJI(c42230Ghm7);
            View view5 = c42230Ghm7.itemView;
            o.LJIIIIZZ(view5, "fakeStickyHeader!!.itemView");
            view5.setTranslationY(0.0f);
            C42230Ghm c42230Ghm8 = c74480TKy.LJJIJLIJ;
            o.LJI(c42230Ghm8);
            View view6 = c42230Ghm8.itemView;
            o.LJIIIIZZ(view6, "fakeAboutStickyHeader!!.itemView");
            view6.setVisibility(4);
            View view7 = c74480TKy.LJJJI;
            if (view7 != null) {
                view7.setVisibility(0);
            }
            c74480TKy.LJJJI = null;
        }
    }
}
