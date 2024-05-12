package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NxF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61025NxF implements Runnable {
    public final /* synthetic */ Forest LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ RequestParams LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    public RunnableC61025NxF(Forest forest, String str, String str2, String str3, RequestParams requestParams, String str4, boolean z) {
        this.LJLIL = forest;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = requestParams;
        this.LJLJJLL = str4;
        this.LJLJL = z;
    }

    public final void LIZ() {
        EnumC60713NsD enumC60713NsD;
        LinkedHashMap linkedHashMap;
        android.net.Uri mainUri = UriProtector.parse(this.LJLILLLLZI);
        GeckoXAdapter.Companion companion = GeckoXAdapter.Companion;
        o.LJFF(mainUri, "mainUri");
        String path = mainUri.getPath();
        o.LJFF(path, "mainUri.path");
        C61023NxD LIZ = C36882Edi.LIZ(this.LJLILLLLZI, companion.getPrefixAsGeckoCDN(path));
        if (LIZ == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Can not parse ak/channel/bundle from ");
            LIZ2.append(this.LJLILLLLZI);
            C39930Flm.LJ("PreloadAPI", X1D.LIZIZ(LIZ2), 4);
            return;
        }
        String LJJJJZ = ujb.o.LJJJJZ(this.LJLILLLLZI, LIZ.LJLJI, "preload.json", false);
        Forest forest = this.LJLIL;
        RequestParams requestParams = new RequestParams(EnumC61028NxI.PRELOAD_CONFIG);
        String str = this.LJLJI;
        if (str == null) {
            str = "";
        }
        requestParams.setGroupId(str);
        requestParams.setSessionId(this.LJLJJI);
        requestParams.getCustomParams().put("rl_container_uuid", requestParams.getGroupId());
        if ((this.LJLJJL.getResourceScene() == EnumC61028NxI.WEB_CHILD_RESOURCE || this.LJLJJL.getResourceScene() == EnumC61028NxI.WEB_MAIN_DOCUMENT) && C39821Fk1.LIZLLL) {
            this.LJLJJL.setParallelLoading(true);
            this.LJLJJL.setLoadToMemory(false);
        }
        requestParams.setDisableBuiltin(true);
        requestParams.setDisableCdn(true);
        requestParams.setOnlyLocal(true);
        C38515F9r createSyncRequest = forest.createSyncRequest(LJJJJZ, requestParams);
        if (createSyncRequest == null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Can not build RequestOperation for ");
            LIZ3.append(LIZ.LJLIL);
            LIZ3.append('/');
            LIZ3.append(LIZ.LJLILLLLZI);
            LIZ3.append("/preload.json");
            C39930Flm.LJ("PreloadAPI", X1D.LIZIZ(LIZ3), 4);
            return;
        }
        C61295O3v LIZ4 = createSyncRequest.LIZ();
        C61287O3n c61287O3n = null;
        if (LIZ4 == null || !LIZ4.LJZL) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("Getting ");
            LIZ5.append(LIZ.LJLIL);
            LIZ5.append('/');
            LIZ5.append(LIZ.LJLILLLLZI);
            LIZ5.append("/preload.json failed, msg: ");
            if (LIZ4 != null) {
                c61287O3n = LIZ4.LL;
            }
            LIZ5.append(c61287O3n);
            C39930Flm.LJ("PreloadAPI", X1D.LIZIZ(LIZ5), 4);
            return;
        }
        try {
            Gson gson = OXZ.LIZIZ.LIZ;
            byte[] S = LIZ4.S();
            if (S != null) {
                java.util.Map configMap = (java.util.Map) gson.LJI(new String(S, PVC.LIZ), java.util.Map.class);
                android.net.Uri parse = UriProtector.parse(this.LJLJJLL);
                o.LJFF(parse, "Uri.parse(url)");
                java.util.Map LJIJJLI = C78926UyI.LJIJJLI(parse);
                o.LJFF(configMap, "configMap");
                Object obj = configMap.get(this.LJLILLLLZI);
                if (obj != null) {
                    if (this.LJLJL) {
                        enumC60713NsD = EnumC60713NsD.WEB;
                    } else {
                        enumC60713NsD = EnumC60713NsD.LYNX;
                    }
                    if (!(obj instanceof java.util.Map)) {
                        obj = null;
                    }
                    java.util.Map map = (java.util.Map) obj;
                    if (map != null) {
                        java.util.Map LJJLIL = C113554cx.LJJLIL(map);
                        LJJLIL.remove("type");
                        java.util.Set<Map.Entry> entrySet = ((LinkedHashMap) LJJLIL).entrySet();
                        int i = 10;
                        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(entrySet, 10));
                        if (LJJIIZ < 16) {
                            LJJIIZ = 16;
                        }
                        linkedHashMap = new LinkedHashMap(LJJIIZ);
                        for (Map.Entry entry : entrySet) {
                            Object key = entry.getKey();
                            if (key != null) {
                                String str2 = (String) key;
                                Object value = entry.getValue();
                                if (value != null) {
                                    List list = (List) value;
                                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, i));
                                    for (Object obj2 : list) {
                                        if (obj2 != null) {
                                            java.util.Map map2 = (java.util.Map) obj2;
                                            StringBuilder sb = new StringBuilder();
                                            Object obj3 = map2.get("url");
                                            if (obj3 != null) {
                                                sb.append((String) obj3);
                                                sb.append('?');
                                                sb.append(ORZ.LLD(((LinkedHashMap) LJIJJLI).entrySet(), "&", null, null, null, 62));
                                                String LJJZZIII = s.LJJZZIII("?", sb.toString());
                                                Object obj4 = map2.get("enableMemory");
                                                if (obj4 != null) {
                                                    boolean booleanValue = ((Boolean) obj4).booleanValue();
                                                    Object obj5 = map2.get("size");
                                                    if (obj5 != null) {
                                                        ((Double) obj5).doubleValue();
                                                        arrayList.add(new C61027NxH(LJJZZIII, booleanValue, this.LJLJJL.getDisableCdn()));
                                                    } else {
                                                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Double");
                                                    }
                                                } else {
                                                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                                                }
                                            } else {
                                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                                            }
                                        } else {
                                            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                        }
                                    }
                                    OSZ osz = new OSZ(str2, arrayList);
                                    linkedHashMap.put(osz.getFirst(), osz.getSecond());
                                    i = 10;
                                } else {
                                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.List<*>");
                                }
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    this.LJLIL.preload(new C60714NsE(null, enumC60713NsD, linkedHashMap), this.LJLJI, this.LJLJJI);
                    return;
                }
                C39930Flm.LJ("PreloadAPI", "Building PreloadConfig for " + this.LJLJJLL + " failed, no matched item in preload.json", 4);
                return;
            }
            o.LJIIZILJ();
            throw null;
        } catch (Throwable th) {
            C39930Flm.LJ("PreloadAPI", "Building PreloadConfig for " + this.LJLJJLL + " failed, " + th, 4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
