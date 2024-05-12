package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JgT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49793JgT<T, RESPONSE extends SearchApiResult> extends AbstractC51037K1h<T, RESPONSE> {
    public C50287JoR LJLIL;
    public SearchResultParam LJLJJI;
    public WeakReference<ActivityC45651qj> LJLJJL;
    public InterfaceC49794JgU LJLJJLL;
    public InterfaceC49816Jgq LJLJL;
    public boolean LJLJLJ;
    public int LJLL;
    public String LJLLI;
    public String LJLLJ;
    public String LJLLL;
    public final LinkedHashSet<T> LJLILLLLZI = new LinkedHashSet<>();
    public final List<T> LJLJI = new ArrayList();
    public final boolean LJLJLLL = true;
    public String LJLLILLLL = "";

    public abstract int LJIILL();

    private final String LJIILIIL() {
        C49814Jgo keyword;
        InterfaceC49816Jgq interfaceC49816Jgq = this.LJLJL;
        if (interfaceC49816Jgq == null || (keyword = interfaceC49816Jgq.getKeyword()) == null) {
            return "";
        }
        if (LJIJ() || TextUtils.isEmpty(keyword.LJLILLLLZI)) {
            return keyword.LJLIL;
        }
        return keyword.LJLILLLLZI;
    }

    private final boolean LJIJ() {
        if (this.mListQueryType == 1) {
            return true;
        }
        return false;
    }

    public final String LJIILJJIL() {
        ActivityC45651qj activityC45651qj;
        String str;
        String searchEnterFromPage;
        C50433Jqn searchCommonModel;
        if (this.LJLJJI == null) {
            return "";
        }
        String LJIJI = LJIJI();
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJL;
        String str2 = null;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        String LJ = a1.LJ("ref_search_base_model_", LJIJI, "_enter_from_page");
        JSONObject jSONObject = new JSONObject();
        SearchResultParam searchResultParam = this.LJLJJI;
        if (searchResultParam == null || (str = searchResultParam.getSearchEnterFromPage()) == null) {
            str = "";
        }
        jSONObject.put("enter_from", str);
        C50652JuK.Companion.getClass();
        C50650JuI LJII = C50651JuJ.LJII(activityC45651qj);
        if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null) {
            str2 = searchCommonModel.getEnterFrom();
        }
        jSONObject.put("enter_from_x", str2);
        JVR.LIZLLL(LJ, C77275UUl.LIZLLL("enter_from"), jSONObject);
        SearchResultParam searchResultParam2 = this.LJLJJI;
        if (searchResultParam2 == null || (searchEnterFromPage = searchResultParam2.getSearchEnterFromPage()) == null) {
            return "";
        }
        return searchEnterFromPage;
    }

    public static String LJIJI() {
        InterfaceC50157JmL LIZ = K0M.LIZ();
        if (LIZ != null) {
            return C50605JtZ.LJII(LIZ.LIZIZ());
        }
        return "null";
    }

    public final void LJIIJJI() {
        if (LJIIZILJ()) {
            this.LJLILLLLZI.clear();
        } else {
            ((ArrayList) this.LJLJI).clear();
        }
    }

    @Override // X.AbstractC51036K1g
    public final List<T> getItems() {
        if (LJIIZILJ()) {
            return new ArrayList(this.LJLILLLLZI);
        }
        return this.LJLJI;
    }

    public boolean LJIIZILJ() {
        return this.LJLJLLL;
    }

    public final void LJIIIZ(List<? extends T> list) {
        if (LJIIZILJ()) {
            if (list == null || list.isEmpty()) {
                return;
            }
            this.LJLILLLLZI.addAll(list);
            return;
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        ((ArrayList) this.LJLJI).addAll(list);
    }

    public final String LJIIL(Object... params) {
        o.LJIIIZ(params, "params");
        if (!TextUtils.isEmpty(LJIILIIL())) {
            return LJIILIIL();
        }
        if (params.length > 0) {
            Object obj = params[0];
            if (obj instanceof Object[]) {
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof String) {
                        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                        return (String) obj2;
                    }
                }
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    @Override // X.C8BS
    /* renamed from: LJIILLIIL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleData(RESPONSE r11) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC49793JgT.handleData(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    public void LJIJJ(List<? extends T> list) {
        if (LJIIZILJ()) {
            this.LJLILLLLZI.clear();
            if (list == null || list.isEmpty()) {
                return;
            }
            this.LJLILLLLZI.addAll(list);
            return;
        }
        ((ArrayList) this.LJLJI).clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        ((ArrayList) this.LJLJI).addAll(list);
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... param) {
        String str;
        o.LJIIIZ(param, "param");
        if (param.length >= 2) {
            Object obj = param[1];
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (((java.lang.Integer) r1).intValue() == 1) goto L10;
     */
    @Override // X.AbstractC51036K1g, X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean sendRequest(java.lang.Object... r5) {
        /*
            r4 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = X.AV1.LJIIJJI()
            r3 = 0
            if (r0 == 0) goto L1f
            android.os.Message r2 = android.os.Message.obtain()
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Under ChildrenMode"
            r1.<init>(r0)
            r2.obj = r1
            com.bytedance.common.utility.collection.WeakHandler r0 = r4.mHandler
            r0.sendMessage(r2)
            return r3
        L1f:
            boolean r0 = r4.needCheckEmptyForQueryType()
            r2 = 1
            if (r0 == 0) goto L3a
            boolean r0 = r4.isDataEmpty()
            if (r0 == 0) goto L3a
        L2c:
            java.lang.String r0 = r4.LJLLJ
            r4.LJLLL = r0
        L30:
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            boolean r0 = super.sendRequest(r0)
            return r0
        L3a:
            r1 = r5[r3]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 != r2) goto L30
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC49793JgT.sendRequest(java.lang.Object[]):boolean");
    }

    public final void LJIIJ(int i, String str) {
        InterfaceC49794JgU interfaceC49794JgU = this.LJLJJLL;
        if (interfaceC49794JgU != null) {
            interfaceC49794JgU.LIZ(i, str);
            this.LJLJJLL = null;
            if (isLoading()) {
                this.mIsLoading = false;
            }
        }
    }
}
