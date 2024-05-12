package X;

import Y.AUListenerS91S0100000_2;
import Y.IDCListenerS255S0100000_8;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jmt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50191Jmt {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZJ(ViewGroup viewGroup) {
        int i;
        int[] iArr = new int[2];
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = 0;
        ValueAnimator resetContainerMarginTop$lambda$8 = ValueAnimator.ofInt(iArr);
        o.LJIIIIZZ(resetContainerMarginTop$lambda$8, "resetContainerMarginTop$lambda$8");
        C50194Jmw.LIZ(resetContainerMarginTop$lambda$8);
        resetContainerMarginTop$lambda$8.addUpdateListener(new AUListenerS91S0100000_2(viewGroup, 29));
        resetContainerMarginTop$lambda$8.start();
    }

    public static int LIZIZ(DynamicPatch dynamicPatch, SearchHubHeaderVM searchHubHeaderVM) {
        C50201Jn3 state;
        JSONObject optJSONObject;
        int i = 0;
        if (dynamicPatch != null) {
            String rawData = dynamicPatch.getRawData();
            o.LJIIIIZZ(rawData, "lynxData.rawData");
            try {
                JSONObject LJJJLIIL = C78966Uyw.LJJJLIIL(rawData);
                if (LJJJLIIL != null && (optJSONObject = LJJJLIIL.optJSONObject("label_info")) != null) {
                    i = optJSONObject.optInt("top_height");
                }
            } catch (Exception unused) {
            }
            return C05040Hs.LIZ(1, i);
        }
        if (searchHubHeaderVM == null || (state = searchHubHeaderVM.getState()) == null) {
            return 0;
        }
        return state.LJLJLJ;
    }

    public static void LIZ(RecyclerView recyclerView, ViewGroup viewGroup, String str) {
        C73210SoI c73210SoI;
        C8HS c8hs;
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter instanceof C73210SoI) {
            c73210SoI = (C73210SoI) adapter;
        } else {
            c73210SoI = null;
        }
        if (c73210SoI != null) {
            List<View> LJZI = c73210SoI.LJZI();
            ArrayList arrayList = (ArrayList) LJZI;
            if (!arrayList.isEmpty()) {
                for (int size = arrayList.size() - 1; size < 1; size++) {
                    View view = (View) ListProtector.get(LJZI, size);
                    c73210SoI.LLFF(size);
                    if (view.getParent() != null) {
                        if (C78996UzQ.LJJIIJZLJL(view)) {
                            C78996UzQ.LJI();
                        }
                        recyclerView.removeView(view);
                    }
                }
            }
            AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q = c73210SoI.LJLIL;
            if ((abstractC029409q instanceof JVP) && (c8hs = (C8HS) abstractC029409q) != null) {
                c8hs.clearData();
            }
        }
        if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
            LIZJ(viewGroup);
        } else {
            recyclerView.addOnLayoutChangeListener(new IDCListenerS255S0100000_8(viewGroup, 4));
        }
        SearchResultParam param = new SearchResultParam();
        param.setKeyword(str);
        param.setEnterMethod("entity_switch");
        param.setShouldRecordInHistory(1);
        param.setAppName(EF7.LIZ());
        param.setScreenWidth(C60605NqT.LJIIJ(C60605NqT.LJFF(C39849FkT.LIZ()), C39849FkT.LIZ()));
        param.setScreenHeight(C60605NqT.LJIIJ(C60605NqT.LIZJ(C39849FkT.LIZ()), C39849FkT.LIZ()));
        o.LJIIIIZZ(param, "param");
        C2U8.LIZ(new C50221JnN(param));
    }

    public static void LIZLLL(Fragment fragment, RecyclerView recyclerView, SearchHubEntityCard searchHubEntityCard) {
        EntityCardTitle entityCardTitle;
        o.LJIIIZ(fragment, "fragment");
        View view = null;
        if (searchHubEntityCard != null) {
            entityCardTitle = searchHubEntityCard.topCardInfo;
        } else {
            entityCardTitle = null;
        }
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.dgj);
        }
        if (!(view instanceof ViewGroup) || view == null) {
            return;
        }
        if (entityCardTitle != null) {
            view.setVisibility(0);
            recyclerView.LJLI(0);
        } else {
            view.setVisibility(8);
            if (C49804Jge.LJJIZ()) {
                return;
            }
            V1B.LJLLI(0, recyclerView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d2 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(androidx.fragment.app.Fragment r28, final androidx.recyclerview.widget.RecyclerView r29, com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard r30) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50191Jmt.LJ(androidx.fragment.app.Fragment, androidx.recyclerview.widget.RecyclerView, com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard):void");
    }
}
