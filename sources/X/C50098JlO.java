package X;

import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.JlO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50098JlO extends JSR implements InterfaceC49368JZc {
    public static final /* synthetic */ int LJLLL = 0;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public final C50103JlT LJLJLJ;
    public C50105JlV LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public InterfaceC50104JlU LJLLJ;

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0107, code lost:
    
        if (r6 == 0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch] */
    /* JADX WARN: Type inference failed for: r0v131, types: [T, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch] */
    /* JADX WARN: Type inference failed for: r0v47, types: [T, X.Jwt] */
    @Override // X.JSR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50098JlO.LJ():void");
    }

    public final java.util.Map<String, Object> LJIIIIZZ() {
        SearchGlobalViewModel searchGlobalViewModel;
        String str;
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
        if (activityC45651qj != null) {
            searchGlobalViewModel = (SearchGlobalViewModel) ViewModelProviders.of(activityC45651qj).get(SearchGlobalViewModel.class);
        } else {
            searchGlobalViewModel = null;
        }
        HashMap hashMap = new HashMap();
        java.util.Map<String, ? extends Object> map = this.LJLIL.LJIIIIZZ;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String str2 = this.LJLIL.LIZJ;
        if (str2 != null) {
            hashMap.put("reactId", str2);
        }
        hashMap.put("sessionid", Integer.valueOf(this.LJLJL));
        hashMap.put("screenWidth", Integer.valueOf(KL2.LJIIJJI(this.LJLIL.LIZIZ)));
        hashMap.put("isPreload", Boolean.FALSE);
        String str3 = "unknown";
        if (searchGlobalViewModel == null) {
            str = "unknown";
        } else {
            str = searchGlobalViewModel.gv0();
        }
        hashMap.put("origin_format", str);
        if (searchGlobalViewModel != null) {
            str3 = searchGlobalViewModel.jv0();
        }
        hashMap.put("current_format", str3);
        return hashMap;
    }

    public final void LJIIIZ() {
        String str;
        boolean z;
        String str2;
        boolean z2;
        JTD jtd;
        C50105JlV c50105JlV = this.LJLJLLL;
        if (c50105JlV != null) {
            JTS bulletContext = this.LJLIL;
            boolean z3 = this.LJLILLLLZI;
            boolean z4 = this.LJLJI;
            int i = this.LJLJJL;
            long j = this.LJLJJLL;
            int i2 = this.LJLL;
            boolean z5 = this.LJLJJI;
            o.LJIIIZ(bulletContext, "bulletContext");
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - c50105JlV.LIZ;
            DynamicPatch dynamicPatch = bulletContext.LJII;
            if (dynamicPatch != null) {
                str = dynamicPatch.schema;
            } else {
                str = null;
            }
            int LIZ = C50101JlR.LIZ(str);
            String loadType = bulletContext.LJFF;
            o.LJIIIZ(loadType, "loadType");
            if (str != null && s.LJJJLZIJ(str, "bundle=products/template.js", false)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                JSONObject LJ = C47135Ieh.LJ("type", "load_success", "schema", str);
                LJ.put("load_type", loadType);
                C48658J7u.LIZIZ("rd_tiktokec_lynx_load", LJ);
            }
            C50102JlS c50102JlS = new C50102JlS();
            c50102JlS.LJIIZILJ("type", "load_success");
            c50102JlS.LJIIZILJ("schema", str);
            c50102JlS.LJIIZILJ("load_type", bulletContext.LJFF);
            c50102JlS.LJIIZILJ("rank", String.valueOf(bulletContext.LJI));
            c50102JlS.LJIIZILJ("load_time", String.valueOf(j2));
            c50102JlS.LJIIZILJ("prerender", String.valueOf(z4 ? 1 : 0));
            String str3 = "1";
            if (z3) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c50102JlS.LJIIZILJ("preload", str2);
            if (!z5) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c50102JlS.LJIIZILJ("continue_render", str3);
            int i3 = 1;
            if (i != 1) {
                i3 = 0;
            }
            c50102JlS.LJIIZILJ("is_built_in", String.valueOf(i3));
            c50102JlS.LJIL(i2);
            c50102JlS.LJIIZILJ("load_stage", String.valueOf(LIZ));
            c50102JlS.LJIIZILJ("res_version", String.valueOf(j));
            c50102JlS.LJIILIIL();
            C50101JlR.LIZIZ(str);
            android.net.Uri uri = UriProtector.parse(str);
            Object obj = bulletContext.LJIILJJIL;
            if (obj != null) {
                JTC jtc = bulletContext.LJIIZILJ;
                if (jtc != null && (jtd = jtc.LIZ) != null && jtd.LIZ != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C49963JjD LIZ2 = C49966JjG.LIZ(obj);
                o.LJIIIIZZ(uri, "uri");
                C49964JjE c49964JjE = new C49964JjE(c50105JlV.LIZ, currentTimeMillis, j, z2);
                if (LIZ2.LIZIZ != 0) {
                    if (LIZ2.LIZ().containsKey(uri)) {
                        String uri2 = uri.toString();
                        o.LJIIIIZZ(uri2, "uri.toString()");
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(uri2);
                        LIZ3.append(uri.hashCode());
                        android.net.Uri uriFinal = UriProtector.parse(X1D.LIZIZ(LIZ3));
                        LinkedHashMap<android.net.Uri, C49964JjE> LIZ4 = LIZ2.LIZ();
                        o.LJIIIIZZ(uriFinal, "uriFinal");
                        LIZ4.put(uriFinal, c49964JjE);
                    } else {
                        LIZ2.LIZ().put(uri, c49964JjE);
                    }
                }
            }
        }
        this.LJLJLLL = null;
    }

    public C50098JlO(JTS jts) {
        super(jts);
        this.LJLJJL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = new C50103JlT();
        this.LJLL = 1;
        JTV jtv = (JTV) jts.LJIIL.getValue();
        jtv.getClass();
        ((ArrayList) jtv.LIZ).add(this);
    }

    @Override // X.InterfaceC49368JZc
    public final void LIZIZ(F3T f3t) {
        f3t.LJ(JTY.class, new F25(this.LJLIL.LJIIJJI.getValue()));
    }

    public static void LJII(C50107JlX c50107JlX, boolean z, boolean z2) {
        TextView textView;
        String str;
        boolean z3 = ((SharedPreferences) C38332F2q.LIZ.getValue()).getBoolean("enable_spark_debug_label", true);
        C39836FkG.LJII.getClass();
        if (C38262Ezy.LIZ().LIZ && z3 && (textView = (TextView) c50107JlX.findViewById(R.id.c3y)) != null) {
            C15280iq.LIZIZ("LoadDelegate", "addSSRTag for spark");
            CharSequence text = textView.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            if (!z2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(" SSR-NO_HYDRATE");
                textView.setText(X1D.LIZIZ(LIZ));
                return;
            }
            String LJJJJZ = ujb.o.LJJJJZ(str, "SSR-NO_HYDRATE", "", false);
            if (z) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJJJJZ);
                LIZ2.append(" SSR-DATA");
                textView.setText(X1D.LIZIZ(LIZ2));
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LJJJJZ);
            LIZ3.append(" SSR-URL");
            textView.setText(X1D.LIZIZ(LIZ3));
        }
    }
}
