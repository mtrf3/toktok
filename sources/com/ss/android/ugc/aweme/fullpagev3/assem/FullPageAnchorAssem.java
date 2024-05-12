package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.ActivityC45651qj;
import X.C116644hw;
import X.C188727au;
import X.C201467vS;
import X.C212428Vi;
import X.C36922EeM;
import X.C42921Gsv;
import X.C47261Igj;
import X.C57244MdM;
import X.C7F9;
import X.HG3;
import X.HSI;
import X.KL2;
import X.RBX;
import X.S0Q;
import X.S1E;
import X.S1O;
import X.S1P;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS39S0301000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class FullPageAnchorAssem extends BaseFullPageAssem {
    public S1O LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ActivityC45651qj LIZ;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJJI = new S1O();
        Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.hz5);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view2 = (View) linkedHashMap.get(valueOf);
        if (view2 == null) {
            View containerView = getContainerView();
            if (containerView != null && (view2 = containerView.findViewById(R.id.hz5)) != null) {
                linkedHashMap.put(valueOf, view2);
            } else {
                view2 = null;
            }
        }
        RecyclerView recyclerView = (RecyclerView) view2;
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            S1O s1o = this.LJLJJI;
            if (s1o != null) {
                recyclerView.setAdapter(s1o);
                recyclerView.LJII(new C116644hw(0, (int) KL2.LIZJ(recyclerView.getContext(), 10.0f), 0), -1);
            } else {
                o.LJIJI("anchorAdapter");
                throw null;
            }
        }
        Aweme aweme = A3().getAweme();
        if (aweme == null || (LIZ = C212428Vi.LIZ(this)) == null) {
            return;
        }
        PostModeDetailParams postModeDetailParams = A3().getPostModeDetailParams();
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        PostModeDetailParams postModeDetailParams2 = A3().getPostModeDetailParams();
        if (postModeDetailParams2 == null || (str2 = postModeDetailParams2.enterMethod) == null) {
            str2 = "";
        }
        JSONObject put = new JSONObject().put("request_id", ((RBX) HG3.LJIILL()).getCurUser().getRequestId());
        o.LJIIIIZZ(put, "JSONObject().put(REQUEST_ID, requestId)");
        C7F9 c7f9 = new C7F9(aweme, LIZ, str, str2, put, false);
        C188727au c188727au = new C188727au();
        C201467vS.LJ(c188727au, aweme);
        c188727au.LJI("from_page", "graphic_detail");
        C201467vS.LIZIZ(c188727au, aweme);
        if (this.LJLJJI != null) {
            FullPageParam param = A3();
            o.LJIIIZ(param, "param");
            ArrayList arrayList = new ArrayList();
            List<S1E> LIZJ = c7f9.LIZJ();
            ArrayList arrayList2 = new ArrayList();
            for (S1E s1e : LIZJ) {
                if (!r4.LJLILLLLZI.contains(s1e.LJIJI().LIZ())) {
                    arrayList2.add(s1e);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                S1E s1e2 = (S1E) it.next();
                if (s1e2 instanceof S0Q) {
                    ArrayList arrayList3 = new ArrayList();
                    if (!C42921Gsv.LIZ()) {
                        arrayList3 = new ArrayList();
                    } else {
                        int i = 0;
                        for (ShopWindowAnchorModel shopWindowAnchorModel : ((S0Q) s1e2).LJLJLJ.LJIIL()) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                ShopWindowAnchorModel shopWindowAnchorModel2 = shopWindowAnchorModel;
                                try {
                                    Long l = shopWindowAnchorModel2.LIZ.productId;
                                    if (l == null || (str3 = l.toString()) == null) {
                                        str3 = "";
                                    }
                                    try {
                                    } catch (Exception e) {
                                        e = e;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                try {
                                    arrayList3.add(new S1P(str3, shopWindowAnchorModel2.LIZ.title, s1e2, new AqS39S0301000_12(s1e2, shopWindowAnchorModel2, c188727au, i, 1)));
                                } catch (Exception e3) {
                                    e = e3;
                                    C36922EeM.LJ(e.getMessage());
                                    i = i2;
                                }
                                i = i2;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    arrayList.addAll(arrayList3);
                } else {
                    arrayList.add(new S1P(s1e2.LJIJI().LIZ(), s1e2.LIZ(), s1e2, new AqS159S0200000_12(s1e2, c188727au, 93)));
                }
            }
            C57244MdM c57244MdM = new C57244MdM(LIZ, param);
            c57244MdM.LJLIL = c7f9;
            arrayList.add(new S1P(((HSI) c57244MdM.LJIJI()).LIZ(), c57244MdM.LIZ(), c57244MdM, new AqS159S0200000_12(c57244MdM, c188727au, 93)));
            S1O s1o2 = this.LJLJJI;
            if (s1o2 != null) {
                s1o2.submitList(arrayList);
                return;
            } else {
                o.LJIJI("anchorAdapter");
                throw null;
            }
        }
        o.LJIJI("anchorAdapter");
        throw null;
    }
}
