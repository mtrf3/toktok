package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.apm6.perf.base.model.ThreadStatInfo;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30591Hz implements InterfaceC75706TnS, C14Q, InterfaceC73592SuS, InterfaceC40381Ft3 {
    public static B93 LJLIL;
    public static final C30591Hz LJLILLLLZI = new C30591Hz();
    public static final C30591Hz LJLJI = new C30591Hz();

    @Override // X.InterfaceC40381Ft3
    public void LIZ() {
        if (C80763Ey.LIZLLL()) {
            C80533Eb.LIZ();
        }
        C85773Yf.LJ();
    }

    public static boolean LJIIZILJ() {
        return e1.LIZ(31744, "open_new_anr_monitor_v2", true, false);
    }

    @Override // X.InterfaceC40381Ft3
    public void LJ() {
        C106184Es.LIZ(true, null, null, null, 14);
        if (C3TX.LIZIZ()) {
            C3K3.LIZ().LJ();
        } else {
            if (C82253Kr.LLFFF == null) {
                return;
            }
            C82253Kr c82253Kr = C82253Kr.LLFFF;
            if (c82253Kr != null) {
                XKX.LIZLLL(c82253Kr.LJLJJLL, c82253Kr.LJLJLJ, null, new C37K(c82253Kr, null), 2);
            }
            C34B.LJI("SessionListManagerV2", "switchLocal set mSortIMAtNext true");
        }
    }

    @Override // X.InterfaceC40381Ft3
    public MutableLiveData LIZIZ() {
        return C82873Nb.LIZLLL;
    }

    @Override // X.InterfaceC40381Ft3
    public void LIZJ() {
        C85773Yf.LJ();
    }

    public static final int LJIIJ(AwemeDraft awemeDraft) {
        CreativeFlowData creativeFlowData;
        EditorProModel editorProModel;
        EditorProModel editorProModel2;
        o.LJIIIZ(awemeDraft, "<this>");
        CreativeFlowData creativeFlowData2 = awemeDraft.LJJJJI.creativeFlowData;
        if ((creativeFlowData2 != null && (editorProModel2 = creativeFlowData2.getEditorProModel()) != null && editorProModel2.isAdvancedEdit()) || ((creativeFlowData = awemeDraft.LJJJJI.creativeFlowData) != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && editorProModel.isAdvancedEditDraft())) {
            return 10;
        }
        if (awemeDraft.photoMovieContext != null) {
            return 1;
        }
        if (awemeDraft.LJJJJI.isStoryDraft) {
            return 4;
        }
        if (awemeDraft.LJIIL()) {
            return 5;
        }
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
        if (aVDraftExtras.statusCreateVideoData != null) {
            return 6;
        }
        if (aVDraftExtras.stitchParams != null) {
            return 7;
        }
        if (!TextUtils.isEmpty(awemeDraft.LJJIL)) {
            return 8;
        }
        AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJI;
        if (aVDraftExtras2.isFastImport) {
            return 3;
        }
        if (awemeDraft.LJIILL == 0) {
            return 2;
        }
        if (aVDraftExtras2.recordMode != 1) {
            return 0;
        }
        return 9;
    }

    public static List LJIIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return UriProtector.parse(str).getPathSegments();
    }

    public static final android.net.Uri LJIILL(android.net.Uri uri) {
        android.net.Uri parse;
        o.LJIIIZ(uri, "<this>");
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (queryParameter == null || (parse = UriProtector.parse(queryParameter)) == null || !parse.isHierarchical()) {
            return null;
        }
        return parse;
    }

    public static boolean LJIILLIIL(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "<this>");
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        return ujb.o.LJJJLIIL(host, "webview", false);
    }

    public static final boolean LJIJI(android.net.Uri uri) {
        o.LJIIIZ(uri, "<this>");
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        return ujb.o.LJJJLIIL(host, "lynxview", false);
    }

    public static boolean LJIJJ(List list) {
        return !LJIILLIIL(list);
    }

    public static final boolean LJIJJLI(Long l) {
        if (l != null && l.longValue() != 0) {
            return true;
        }
        return false;
    }

    public static final java.util.Map LJJ(android.net.Uri uri) {
        String path;
        o.LJIIIZ(uri, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "";
        if (LJIJI(uri)) {
            String queryParameter = UriProtector.getQueryParameter(uri, "channel");
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap.put("lynx_channel", queryParameter);
            String queryParameter2 = UriProtector.getQueryParameter(uri, "bundle");
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
            linkedHashMap.put("lynx_bundle", str);
        } else if (LJIJ(uri)) {
            android.net.Uri LJIILL = LJIILL(uri);
            if (LJIILL != null && (path = LJIILL.getPath()) != null) {
                str = path;
            }
            linkedHashMap.put("h5_path", str);
        }
        return linkedHashMap;
    }

    public static final java.util.Map LJJI(android.net.Uri uri) {
        o.LJIIIZ(uri, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null) {
            for (String key : queryParameterNames) {
                String queryParameter = UriProtector.getQueryParameter(uri, key);
                if (queryParameter != null) {
                    o.LJIIIIZZ(key, "key");
                    linkedHashMap.put(key, queryParameter);
                }
            }
        }
        return linkedHashMap;
    }

    public static void LJJII(int i) {
        String str;
        if (i == 1) {
            str = "anchor_linkmic_red_dot_shown";
        } else {
            str = "guest_linkmic_red_dot_shown";
        }
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (context != null) {
            C29889BoD LIZIZ = C29889BoD.LIZIZ(context);
            LIZIZ.LJII(Boolean.TRUE, str);
            LIZIZ.LIZ();
        }
    }

    public static final String LJJIIJ(String url) {
        o.LJIIIZ(url, "url");
        android.net.Uri LJJJJIZL = C17N.LJJJJIZL(url);
        String queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "channel");
        if (queryParameter == null && (queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "url")) == null && (queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "surl")) == null) {
            return url;
        }
        return queryParameter;
    }

    public static final int LJJIIJZLJL(String str) {
        o.LJIIIZ(str, "<this>");
        if (str.charAt(0) == '#') {
            String substring = str.substring(1);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            C17N.LJIIJ(16);
            long parseLong = CastLongProtector.parseLong(substring, 16);
            if (str.length() == 7) {
                parseLong |= -16777216;
            } else if (str.length() != 9) {
                "Unknown color".toString();
                throw new IllegalArgumentException("Unknown color");
            }
            return (int) parseLong;
        }
        throw new IllegalArgumentException("Unknown color");
    }

    public static String LJJIIZ(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    @Override // X.C14Q
    public Object apply(Object obj) {
        return Boolean.valueOf(C84283Sm.LJII((C63120Opw) obj));
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        MotionEvent ev = (MotionEvent) obj;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75706TnS
    public void LJFF(OFV ofv) {
    }

    public static final android.net.Uri LJI(android.net.Uri uri, java.util.Map map) {
        android.net.Uri uri2;
        if (LJIJ(uri)) {
            android.net.Uri LJIILL = LJIILL(uri);
            if (LJIILL != null) {
                uri2 = LJI(LJIILL, map);
            } else {
                uri2 = null;
            }
            android.net.Uri build = C78939UyV.LJJJJIZL(uri, "url").buildUpon().appendQueryParameter("url", String.valueOf(uri2)).build();
            o.LJIIIIZZ(build, "{\n        val innerUri =…toString()).build()\n    }");
            return build;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        android.net.Uri build2 = buildUpon.build();
        o.LJIIIIZZ(build2, "{\n        buildUpon().ap…}\n        }.build()\n    }");
        return build2;
    }

    public static final boolean LJII(Effect effect, InterfaceC84497XEf checkEffectDownloaded) {
        String str;
        o.LJIIIZ(checkEffectDownloaded, "$this$checkEffectDownloaded");
        if (effect != null && (effect.getEffectType() != 0 || checkEffectDownloaded.LJJIL(effect))) {
            if (!V3N.LJJII(effect)) {
                return true;
            }
            String effectId = effect.getEffectId();
            o.LJIIIZ(effectId, "effectId");
            if (HXH.LIZ.containsKey(effectId)) {
                return true;
            }
            List<String> music = effect.getMusic();
            if (music != null && (str = (String) ORZ.LJLLLL(music)) != null && H9H.LIZIZ(str) != null) {
                return true;
            }
        }
        return false;
    }

    public static final String LJIIIIZZ(String str, String str2) {
        if (str == null) {
            return null;
        }
        String LJJJJZ = ujb.o.LJJJJZ(str, C60903NvH.LJIIJJI().LJJIJL().getPathService().getRoot(), "./", true);
        if (str2 == null) {
            str2 = "creationId";
        }
        return ujb.o.LJJJJZ(LJJJJZ, str2, "creationId", true);
    }

    public static final String LJIIJJI(android.net.Uri uri, String key) {
        String queryParameter;
        o.LJIIIZ(uri, "<this>");
        o.LJIIIZ(key, "key");
        android.net.Uri LJIILL = LJIILL(uri);
        if (LJIILL == null || (queryParameter = UriProtector.getQueryParameter(LJIILL, key)) == null) {
            return UriProtector.getQueryParameter(uri, key);
        }
        return queryParameter;
    }

    public static String LJIILIIL(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return UriProtector.getQueryParameter(UriProtector.parse(str), str2);
    }

    public static void LJIILJJIL(int i, java.util.Map map) {
        for (File file : new File(C0NY.LIZIZ("/proc/", i, "/task/")).listFiles()) {
            try {
                int parseInt = CastIntegerProtector.parseInt(file.getName());
                C64125PEr.LIZLLL().getClass();
                ThreadStatInfo threadStatInfo = MonitorJni.getThreadStatInfo(i, parseInt);
                if (parseInt != 0 && threadStatInfo != null && !TextUtils.isEmpty(threadStatInfo.threadName) && threadStatInfo.threadCpuTime != 0) {
                    C64191PHf c64191PHf = new C64191PHf();
                    c64191PHf.LIZ = parseInt;
                    c64191PHf.LIZIZ = threadStatInfo.threadName;
                    c64191PHf.LIZJ = threadStatInfo.threadCpuTime;
                    ((HashMap) map).put(Integer.valueOf(parseInt), c64191PHf);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static boolean LJIL(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        android.net.Uri parse2 = UriProtector.parse(str2);
        if (!TextUtils.equals(parse.getScheme(), parse2.getScheme()) || !TextUtils.equals(parse.getHost(), parse2.getHost())) {
            return false;
        }
        List<String> pathSegments = parse.getPathSegments();
        List<String> pathSegments2 = parse2.getPathSegments();
        if (pathSegments.size() != pathSegments2.size()) {
            return false;
        }
        int size = pathSegments.size();
        for (int i = 0; i < size; i++) {
            if (!((String) ListProtector.get(pathSegments, i)).startsWith(":") && !((String) ListProtector.get(pathSegments, i)).equals(ListProtector.get(pathSegments2, i))) {
                return false;
            }
        }
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        if (queryParameterNames != null && queryParameterNames.size() != 0) {
            java.util.Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(parse2);
            Iterator<String> it = queryParameterNames.iterator();
            Iterator<String> it2 = queryParameterNames2.iterator();
            while (it.hasNext()) {
                if (!it2.hasNext() || !TextUtils.equals(it.next(), it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final android.net.Uri LJJIFFI(android.net.Uri uri, List keys) {
        android.net.Uri uri2;
        o.LJIIIZ(uri, "<this>");
        o.LJIIIZ(keys, "keys");
        if (LJIJ(uri)) {
            android.net.Uri LJIILL = LJIILL(uri);
            if (LJIILL != null) {
                uri2 = LJJIFFI(LJIILL, keys);
            } else {
                uri2 = null;
            }
            List LLJILJILJ = ORZ.LLJILJILJ(keys);
            ((ArrayList) LLJILJILJ).add("url");
            android.net.Uri build = C78939UyV.LJJJJJ(uri, LLJILJILJ).buildUpon().appendQueryParameter("url", String.valueOf(uri2)).build();
            o.LJIIIIZZ(build, "{\n        val innerUri =…toString()).build()\n    }");
            return build;
        }
        return C78939UyV.LJJJJJ(uri, keys);
    }

    public static final void LJJIII(RecyclerView recyclerView, InterfaceC55235Lm3 scope) {
        o.LJIIIZ(scope, "scope");
        recyclerView.setTag(R.id.i0b, scope);
    }

    public static final void LJJIIZI(YMB ymb, String msg) {
        o.LJIIIZ(ymb, "<this>");
        o.LJIIIZ(msg, "msg");
        ymb.log("MessageManagerV2", msg);
    }

    @Override // X.InterfaceC75706TnS
    public void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto permitApply error = ");
        LIZ.append(c76003TsF);
        LIZ.append(", throwable.message=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        JBR.LJIIJ(LIZ, str, LIZ, "MultiHostCrossRefuseManager");
    }

    public static final List LJIIIZ(int i, SaleProp groupItem, String[] strArr, List list) {
        C70216Rh6 c70216Rh6;
        boolean z;
        o.LJIIIZ(groupItem, "groupItem");
        ArrayList arrayList = new ArrayList();
        List<SalePropValue> list2 = groupItem.salePropValueList;
        if (list2 != null && (!list2.isEmpty()) && strArr != null && strArr.length > i) {
            for (SalePropValue salePropValue : list2) {
                if (salePropValue.propValueId != null && salePropValue.propValue != null) {
                    if (o.LJ(groupItem.hasImage, Boolean.TRUE)) {
                        c70216Rh6 = new C70216Rh6(salePropValue.propValueId, salePropValue.propValue, salePropValue.image, false);
                    } else {
                        c70216Rh6 = new C70216Rh6(salePropValue.propValueId, salePropValue.propValue, null, false);
                    }
                    Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                    o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                    String[] strArr2 = (String[]) copyOf;
                    if (strArr2.length == 0) {
                        strArr2 = new String[]{""};
                    }
                    strArr2[i] = salePropValue.propValueId;
                    if (RXW.LIZ(list, strArr2) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c70216Rh6.LJ = z;
                    c70216Rh6.LJFF = o.LJ(ORY.LJJJJI(i, strArr), salePropValue.propValueId);
                    arrayList.add(c70216Rh6);
                }
            }
        }
        return arrayList;
    }
}
