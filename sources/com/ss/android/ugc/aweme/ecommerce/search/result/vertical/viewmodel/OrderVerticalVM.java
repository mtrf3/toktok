package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel;

import X.C00F;
import X.C35652Dyy;
import X.InterfaceC55235Lm3;
import X.KFR;
import X.T2R;
import X.XKQ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OrderVerticalVM extends AssemViewModel<C35652Dyy> {
    public final Gson LJLIL;
    public XKQ LJLILLLLZI;
    public KFR LJLJI;
    public InterfaceC55235Lm3 LJLJJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35652Dyy defaultState() {
        return new C35652Dyy(0);
    }

    public OrderVerticalVM() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LJLIL = LIZ;
    }

    public final String hv0(JSONObject jSONObject) {
        String str;
        List<Object> list = null;
        if (jSONObject == null || (str = jSONObject.optString("traffic_source_list")) == null) {
            str = "[]";
        }
        JSONArray LJJII = T2R.LJJII(str);
        if (LJJII != null) {
            list = JsonExtKt.toList(LJJII);
        }
        String str2 = "";
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                String obj = it.next().toString();
                if (str2.length() == 0) {
                    str2 = obj;
                } else {
                    str2 = C00F.LIZIZ(str2, ',', obj);
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(com.ss.android.ugc.aweme.search.model.SearchResultParam r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            r4 = r8
            X.KFR r1 = r4.LJLJI
            if (r1 == 0) goto La
            java.lang.String r0 = "request_start"
            r1.LJ(r0)
        La:
            r6 = r9
            X.Jz6 r0 = r6.getSearchEnterParam()
            r7 = 0
            if (r0 == 0) goto L1e
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r0.getEcSearchEntranceData()
        L16:
            X.2mC r5 = new X.2mC
            r5.<init>()
            if (r0 == 0) goto L20
            goto L22
        L1e:
            r0 = r7
            goto L16
        L20:
            r0 = r7
            goto L3a
        L22:
            java.lang.String r0 = r0.getOrderSearchRegion()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L20
            java.lang.Integer r0 = X.C38350F3i.LJJIL(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L20
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3e
            r5.element = r0     // Catch: java.lang.Throwable -> L3e
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L3e
        L3a:
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L3e
            goto L46
        L3e:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L46:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r0 == 0) goto L4f
            X.C78983UzD.LJIIZILJ(r0)
        L4f:
            X.XKQ r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L56
            r0.LIZIZ(r7)
        L56:
            X.2pa r1 = r4.getAssemVMScope()
            X.ECh r2 = new X.ECh
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.XKQ r0 = X.XKX.LIZLLL(r1, r7, r7, r2, r0)
            r4.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.OrderVerticalVM.gv0(com.ss.android.ugc.aweme.search.model.SearchResultParam, org.json.JSONObject):void");
    }
}
