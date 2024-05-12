package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AbstractActivityC27434Api;
import X.C16880lQ;
import X.C223338pd;
import X.C27206Am2;
import X.C27739Aud;
import X.C27836AwC;
import X.C36636EZk;
import X.C38350F3i;
import X.C44847Hit;
import X.C65330PkU;
import X.C65352Pkq;
import X.C65803Ps7;
import X.C70903RsB;
import X.C71284RyK;
import X.C72264SXs;
import X.C780334l;
import X.C78866UxK;
import X.C78983UzD;
import X.EnumC63755P0l;
import X.InterfaceC18010nF;
import X.OSZ;
import X.X1D;
import X.XKX;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.internal.b;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class TransparentLoadingOSPActivity extends AbstractActivityC27434Api implements InterfaceC18010nF {
    public OrderSubmitRequestParam LJLJJI;
    public HashMap<String, Object> LJLJJL;
    public String LJLJLLL;
    public int LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public String LJLJJLL = "";
    public String LJLJL = "";
    public String LJLJLJ = "";

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.TRAN_LOADING_OSP.getPageCode();
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC37828Esy
    public final String getPageName() {
        String str;
        HashMap<String, Object> hashMap = this.LJLJJL;
        Object obj = null;
        if (hashMap != null) {
            obj = hashMap.get("previous_page");
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return super.getPageName();
        }
        return str;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onStart", true);
        super.onStart();
        ((C223338pd) _$_findCachedViewById(R.id.luc)).setVisibility(0);
        ((C223338pd) _$_findCachedViewById(R.id.luc)).LIZIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        long j;
        Boolean bool;
        Integer num;
        OrderSubmitRequestParam orderSubmitRequestParam;
        List<OrderShopDigest> list;
        OrderSubmitRequestParam orderSubmitRequestParam2;
        OrderSubmitRequestParam orderSubmitRequestParam3;
        Long keyTimestamp;
        HashMap<String, Object> hashMap;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ctn);
        String str = CardStruct.IStatusCode.DEFAULT;
        if (bundle == null) {
            string = C16880lQ.LLJJIJIIJIL(getIntent(), "requestParams");
            this.LJLJJL = C27739Aud.LIZ(this, "trackParams");
            string2 = C16880lQ.LLJJIJIIJIL(getIntent(), "repoId");
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "buy_type");
            if (LLJJIJIIJIL != null) {
                str = LLJJIJIIJIL;
            }
            this.LJLJLJ = str;
            this.LJLJL = C16880lQ.LLJJIJIIJIL(getIntent(), "_originalSchema");
            this.LJLJLLL = C16880lQ.LLJJIJIIJIL(getIntent(), "cart_storage_key");
            j = getIntent().getLongExtra("key_timestamp", Long.MIN_VALUE);
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "is_from_follow");
            if (LLJJIJIIJIL2 != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(LLJJIJIIJIL2));
            } else {
                bool = Boolean.FALSE;
            }
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "biz_type");
            if (LLJJIJIIJIL3 != null) {
                num = C38350F3i.LJJIL(LLJJIJIIJIL3);
            } else {
                num = null;
            }
        } else {
            string = bundle.getString("requestParams");
            this.LJLJJL = C27739Aud.LIZLLL(bundle, "trackParams");
            string2 = bundle.getString("repoId");
            this.LJLJL = bundle.getString("_originalSchema");
            String string3 = bundle.getString("buy_type");
            if (string3 != null) {
                str = string3;
            }
            this.LJLJLJ = str;
            this.LJLJLLL = bundle.getString("cart_storage_key");
            j = bundle.getLong("key_timestamp", Long.MIN_VALUE);
            String string4 = bundle.getString("is_from_follow");
            if (string4 != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(string4));
            } else {
                bool = Boolean.FALSE;
            }
            String string5 = bundle.getString("biz_type");
            if (string5 != null) {
                num = C38350F3i.LJJIL(string5);
            } else {
                num = null;
            }
        }
        if (j != Long.MIN_VALUE && (hashMap = this.LJLJJL) != null) {
            hashMap.put("start_click_time", Long.valueOf(j));
        }
        HashMap<String, Object> hashMap2 = this.LJLJJL;
        if (hashMap2 != null && hashMap2.get("entrance_info") == null) {
            hashMap2.put("entrance_info", C27739Aud.LJI(hashMap2));
        }
        String LIZ = C71284RyK.LIZ("cart_order_submit_params", this.LJLJLLL);
        if (LIZ != null) {
            string = LIZ;
        } else if (string == null && this.LJLJLLL != null) {
            Object LIZLLL = C72264SXs.LIZ(this).LIZLLL(this.LJLJLLL);
            if (LIZLLL instanceof String) {
                string = (String) LIZLLL;
            } else {
                string = null;
            }
        }
        if (string2 == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("default_repo_id");
            LIZ2.append(UUID.randomUUID());
            string2 = X1D.LIZIZ(LIZ2);
        }
        this.LJLJJLL = string2;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), string, C65330PkU.LIZJ(C65352Pkq.LIZLLL(OrderSubmitRequestParam.class)));
            if (!(fromJson instanceof OrderSubmitRequestParam)) {
                fromJson = null;
            }
            orderSubmitRequestParam = (OrderSubmitRequestParam) fromJson;
        } catch (s unused) {
            orderSubmitRequestParam = null;
        }
        this.LJLJJI = orderSubmitRequestParam;
        if (orderSubmitRequestParam != null) {
            list = orderSubmitRequestParam.getOrderShopDigest();
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            C78983UzD.LJIIZILJ(new RuntimeException("orderShop is null"));
        }
        this.LJLL = C27206Am2.LJ(C78866UxK.LJJZZIII(num), "order_submit", null);
        OrderSubmitRequestParam orderSubmitRequestParam4 = this.LJLJJI;
        if (orderSubmitRequestParam4 != null) {
            orderSubmitRequestParam2 = OrderSubmitRequestParam.copy$default(orderSubmitRequestParam4, null, null, null, null, null, null, bool, null, null, null, null, null, 4031, null);
        } else {
            orderSubmitRequestParam2 = null;
        }
        this.LJLJJI = orderSubmitRequestParam2;
        if (getIntent().hasExtra("key_timestamp") && ((orderSubmitRequestParam3 = this.LJLJJI) == null || (keyTimestamp = orderSubmitRequestParam3.getKeyTimestamp()) == null || keyTimestamp.longValue() != j)) {
            this.LJLJJI = null;
        }
        b.LJJIJIIJIL("rd_tiktokec_cart_submit_params_get", new OSZ("start_click_to_now", C44847Hit.LIZ(j)));
        new C70903RsB("TransparentLoading").LIZJ(false);
        OrderSubmitRequestParam orderSubmitRequestParam5 = this.LJLJJI;
        HashMap<String, Object> hashMap3 = this.LJLJJL;
        if (hashMap3 == null) {
            hashMap3 = new HashMap<>();
        }
        if (orderSubmitRequestParam5 == null) {
            C78983UzD.LJIILL("OSP_fetchBillInfoForCart: requestParamIsEmpty");
        } else {
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C27836AwC(orderSubmitRequestParam5, this, hashMap3, orderSubmitRequestParam5, null), 2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity", "onCreate", false);
    }
}
