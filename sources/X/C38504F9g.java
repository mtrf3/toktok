package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.prefetch.worker.Worker;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.a1;
import defpackage.i0;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.F9g */
/* loaded from: classes7.dex */
public final class C38504F9g implements InterfaceC37747Erf {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIIJJI;
    public String LIZ;
    public final AbstractC38233EzV LIZIZ;
    public final InterfaceC61488OBg LIZJ;
    public EnumC37741ErZ LIZLLL;
    public Worker LJ;
    public InterfaceC37745Erd LJFF;
    public volatile boolean LJI;
    public OSJ<Integer, String, ? extends Throwable> LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final String LJIIIZ;
    public final C60737Nsb LJIIJ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C38504F9g.class), "segmentMap", "getSegmentMap()Ljava/util/concurrent/ConcurrentHashMap;");
        C65352Pkq.LIZ.getClass();
        LJIIJJI = new InterfaceC74236TBo[]{tbt};
    }

    public final void LIZ(String str) {
        C38097ExJ.LIZIZ("hybrid_prefetch_file_load_state", this.LJIIJ, str, new JSONObject().put("success", 0).put("errorCode", -996).put("errorMsg", "generate prefetch url failed"));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail to handle url, url = ");
        LIZ.append(str);
        String message = X1D.LIZIZ(LIZ);
        o.LJIIJ(message, "message");
    }

    public final C38254Ezq LIZIZ(String id) {
        Object putIfAbsent;
        o.LJIIJ(id, "id");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LJIIIIZZ.getValue();
        Object obj = concurrentHashMap.get(id);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(id, (obj = new C38254Ezq(id, this)))) != null) {
            obj = putIfAbsent;
        }
        return (C38254Ezq) obj;
    }

    public final void LJI(String str) {
        C60737Nsb c60737Nsb = this.LJIIJ;
        String str2 = this.LIZ;
        if (str2 == null) {
            str2 = this.LJIIIZ;
        }
        JSONObject put = new JSONObject().put("success", 0).put("errorCode", -997);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResourceLoader prefetch load error, ");
        LIZ.append(str);
        C38097ExJ.LIZIZ("hybrid_prefetch_file_load_state", c60737Nsb, str2, put.put("errorMsg", X1D.LIZIZ(LIZ)));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ResourceLoader prefetch load error, ");
        LIZ2.append(str);
        String message = X1D.LIZIZ(LIZ2);
        o.LJIIJ(message, "message");
        LJIIJ(this, 2, i0.LJFF("ResourceLoader prefetch load error, ", str), null, 4);
    }

    public final synchronized void LJII(java.util.Map<String, ?> map) {
        InterfaceC38260Ezw interfaceC38260Ezw;
        this.LJI = true;
        this.LIZLLL = EnumC37741ErZ.Ready;
        C39836FkG.LJII.getClass();
        if (C38262Ezy.LIZ().LIZ && (interfaceC38260Ezw = (InterfaceC38260Ezw) this.LJIIJ.LIZIZ(InterfaceC38260Ezw.class)) != null) {
            C37744Erc.LIZ(interfaceC38260Ezw, null, null, null, null, map, 15);
        }
        InterfaceC37745Erd interfaceC37745Erd = this.LJFF;
        if (interfaceC37745Erd != null) {
            C37744Erc.LIZ(interfaceC37745Erd, null, null, null, null, map, 15);
            this.LJFF = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResult: ");
        LIZ.append(map);
        C37750Eri.LIZ(X1D.LIZIZ(LIZ));
    }

    public final synchronized void LJIIIIZZ(C38255Ezr c38255Ezr) {
        Object obj;
        java.util.Map<String, Object> LJ;
        Integer num;
        String str;
        Object obj2 = null;
        Throwable th = null;
        if (this.LIZLLL != EnumC37741ErZ.Ready && !this.LJI) {
            if (this.LIZLLL == EnumC37741ErZ.Terminate) {
                OSJ<Integer, String, ? extends Throwable> osj = this.LJII;
                this.LJII = null;
                if (osj == null) {
                    num = null;
                    str = null;
                } else {
                    num = osj.getFirst();
                    str = osj.getSecond();
                    th = osj.getThird();
                }
                C37744Erc.LIZ(c38255Ezr, num, str, th, null, null, 24);
                return;
            }
            this.LJFF = c38255Ezr;
            return;
        }
        InterfaceC60710NsA interfaceC60710NsA = this.LJIIJ.hybridParams;
        if (interfaceC60710NsA != null && (LJ = interfaceC60710NsA.LJ()) != null) {
            obj = LJ.get("prefetchData");
        } else {
            obj = null;
        }
        if (obj instanceof java.util.Map) {
            obj2 = obj;
        }
        C37744Erc.LIZ(c38255Ezr, null, null, null, null, (java.util.Map) obj2, 15);
    }

    @Override // X.InterfaceC37747Erf
    public final void onError(String error) {
        o.LJIIJ(error, "error");
        C60737Nsb c60737Nsb = this.LJIIJ;
        String str = this.LIZ;
        if (str == null) {
            str = this.LJIIIZ;
        }
        JSONObject put = new JSONObject().put("success", 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("worker runtime error, ");
        LIZ.append(error);
        C38097ExJ.LIZIZ("hybrid_prefetch_worker_finish", c60737Nsb, str, put.put("errorMsg", X1D.LIZIZ(LIZ)).put("errorCode", -998));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onError: ");
        LIZ2.append(error);
        C37750Eri.LIZIZ(X1D.LIZIZ(LIZ2), null, 6);
        LJIIJ(this, 3, i0.LJFF("worker runtime error, ", error), null, 4);
    }

    @Override // X.InterfaceC37747Erf
    public final void onMessage(String message) {
        o.LJIIJ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMessage: ");
        LIZ.append(message);
        C37750Eri.LIZ(X1D.LIZIZ(LIZ));
    }

    public C38504F9g(C60737Nsb context, String originUrl) {
        o.LJIIJ(originUrl, "originUrl");
        o.LJIIJ(context, "context");
        this.LJIIIZ = originUrl;
        this.LJIIJ = context;
        String bid = context.bidFrom;
        o.LJIIJ(bid, "bid");
        ConcurrentHashMap<String, AbstractC38233EzV> concurrentHashMap = C38502F9e.LIZ;
        AbstractC38233EzV abstractC38233EzV = concurrentHashMap.get(bid);
        this.LIZIZ = abstractC38233EzV == null ? concurrentHashMap.get("hybridkit_default_bid") : abstractC38233EzV;
        this.LIZJ = C60905NvJ.LIZIZ(context, null);
        this.LIZLLL = EnumC37741ErZ.Unusable;
        this.LJIIIIZZ = C221108m2.LIZIZ(C38505F9h.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if (r3 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006f, code lost:
    
        if (r0 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        if (r5 != null) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38504F9g.LIZJ(java.lang.String, java.lang.String):void");
    }

    public final void LJ(C61295O3v c61295O3v, String str) {
        String LJ = a1.LJ(str, ", ", c61295O3v.LL.toString());
        C60737Nsb c60737Nsb = this.LJIIJ;
        String str2 = this.LIZ;
        if (str2 == null) {
            str2 = this.LJIIIZ;
        }
        JSONObject put = new JSONObject().put("success", 0).put("errorCode", -997);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Forest load error, ");
        LIZ.append(LJ);
        C38097ExJ.LIZIZ("hybrid_prefetch_file_load_state", c60737Nsb, str2, put.put("errorMsg", X1D.LIZIZ(LIZ)));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Forest error, ");
        LIZ2.append(LJ);
        String message = X1D.LIZIZ(LIZ2);
        o.LJIIJ(message, "message");
        LJIIJ(this, 2, i0.LJFF("Forest load error, ", LJ), null, 4);
    }

    public final void LIZLLL(C39902FlK c39902FlK, String str, C60737Nsb c60737Nsb) {
        String LIZLLL;
        boolean z;
        C61295O3v LIZ;
        String str2;
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setLoadToMemory(true);
        requestParams.setWaitGeckoUpdate(false);
        requestParams.setNeedLocalFile(Boolean.FALSE);
        requestParams.getCustomParams().put("rl_container_uuid", c60737Nsb.containerId);
        InterfaceC60710NsA interfaceC60710NsA = c60737Nsb.hybridParams;
        if (!(interfaceC60710NsA instanceof C60606NqU)) {
            interfaceC60710NsA = null;
        }
        C60606NqU c60606NqU = (C60606NqU) interfaceC60710NsA;
        if (c60606NqU == null || c60606NqU.LJIILJJIL == null) {
            LIZLLL = C60905NvJ.LIZLLL(str, requestParams, null);
        } else {
            C60905NvJ.LJII(requestParams, c60606NqU.LJIILJJIL);
            HybridSchemaParam hybridSchemaParam = c60606NqU.LJIILJJIL;
            if (hybridSchemaParam == null || (LIZLLL = C60905NvJ.LIZJ(hybridSchemaParam, str, true)) == null) {
                LIZLLL = "";
            }
        }
        String bundle = requestParams.getBundle();
        if (bundle == null || bundle.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String bundle2 = requestParams.getBundle();
            if (bundle2 != null) {
                String substring = bundle2.substring(0, s.LJJLIIIJLLLLLLLZ(bundle2, '/', 0, 6) + 1);
                o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                str2 = substring.concat("prefetch.js");
            } else {
                str2 = null;
            }
            requestParams.setBundle(str2);
        }
        android.net.Uri originUri = UriProtector.parse(LIZLLL);
        o.LJFF(originUri, "originUri");
        String lastPathSegment = originUri.getLastPathSegment();
        if (lastPathSegment != null && ujb.o.LJJJJ(lastPathSegment, ".js", false) && s.LJJLIIIJLLLLLLLZ(LIZLLL, '/', 0, 6) != -1) {
            String substring2 = LIZLLL.substring(0, s.LJJLIIIJLLLLLLLZ(LIZLLL, '/', 0, 6) + 1);
            o.LJFF(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            this.LIZ = substring2.concat("prefetch.js");
            java.util.Map<String, Object> customParams = requestParams.getCustomParams();
            String str3 = this.LIZ;
            if (str3 != null) {
                customParams.put("resource_url", str3);
                if (this.LIZLLL == EnumC37741ErZ.Terminate) {
                    return;
                }
                this.LIZLLL = EnumC37741ErZ.Fetching;
                String str4 = this.LIZ;
                if (str4 != null) {
                    C38515F9r LIZJ = c39902FlK.LIZJ(str4, requestParams);
                    if (LIZJ != null && (LIZ = LIZJ.LIZ()) != null) {
                        if (LIZ.LJZL) {
                            byte[] S = LIZ.S();
                            if (S != null) {
                                String str5 = new String(S, PVC.LIZ);
                                C60737Nsb c60737Nsb2 = this.LJIIJ;
                                String str6 = this.LIZ;
                                if (str6 == null) {
                                    str6 = this.LJIIIZ;
                                }
                                C38097ExJ.LIZIZ("hybrid_prefetch_file_load_state", c60737Nsb2, str6, new JSONObject().put("success", 1));
                                C60737Nsb c60737Nsb3 = this.LJIIJ;
                                String str7 = this.LIZ;
                                if (str7 == null) {
                                    str7 = this.LJIIIZ;
                                }
                                JSONObject put = new JSONObject().put("type", "forest");
                                String str8 = LIZ.LLD;
                                if (str8 == null) {
                                    str8 = "unknown";
                                }
                                C38097ExJ.LIZIZ("hybrid_prefetch_resource_load", c60737Nsb3, str7, put.put("res_from", str8).put("channel", LIZ.LJZI.getGeckoModel().LJLILLLLZI).put("bundle", LIZ.LJZI.getGeckoModel().LJLJI));
                                String str9 = this.LIZ;
                                if (str9 != null) {
                                    LIZJ(str9, str5);
                                    return;
                                } else {
                                    o.LJIIZILJ();
                                    throw null;
                                }
                            }
                            LJ(LIZ, "forest load succeeded but null bytes");
                            return;
                        }
                        LJ(LIZ, "fetch_reject_2");
                        return;
                    }
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        LIZ(LIZLLL);
    }

    public final void LJFF(String str, C60737Nsb c60737Nsb, IResourceService iResourceService) {
        String str2;
        String name;
        HybridSchemaParam hybridSchemaParam;
        Object LIZ;
        O1M o1m = new O1M(0);
        o1m.LIZLLL = 1;
        o1m.LJIIL = "prefetch";
        o1m.LJIIJJI = c60737Nsb;
        InterfaceC60710NsA interfaceC60710NsA = c60737Nsb.hybridParams;
        if (!(interfaceC60710NsA instanceof C60606NqU)) {
            interfaceC60710NsA = null;
        }
        C60606NqU c60606NqU = (C60606NqU) interfaceC60710NsA;
        if (c60606NqU != null && (hybridSchemaParam = c60606NqU.LJIILJJIL) != null) {
            if (ujb.o.LJJJLIIL(hybridSchemaParam.getUrl(), "http", false)) {
                str = hybridSchemaParam.getUrl();
            } else {
                str = hybridSchemaParam.getSurl();
                try {
                    o1m.LIZLLL = Integer.valueOf(hybridSchemaParam.getDynamic());
                    String channel = hybridSchemaParam.getChannel();
                    o.LJIIJ(channel, "<set-?>");
                    o1m.LJFF = channel;
                    String bundle = hybridSchemaParam.getBundle();
                    String substring = bundle.substring(0, s.LJJLIIIJLLLLLLLZ(bundle, '/', 0, 6) + 1);
                    o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String concat = substring.concat("prefetch.js");
                    o.LJIIJ(concat, "<set-?>");
                    o1m.LJI = concat;
                    C3C5.m7constructorimpl(o1m);
                    LIZ = o1m;
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                C3C5.m6boximpl(LIZ);
            }
        }
        android.net.Uri loadUri = UriProtector.parse(str);
        o.LJFF(loadUri, "loadUri");
        String lastPathSegment = loadUri.getLastPathSegment();
        if (lastPathSegment != null && ujb.o.LJJJJ(lastPathSegment, ".js", false) && s.LJJLIIIJLLLLLLLZ(str, '/', 0, 6) != -1) {
            String substring2 = str.substring(0, s.LJJLIIIJLLLLLLLZ(str, '/', 0, 6) + 1);
            o.LJFF(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String concat2 = substring2.concat("prefetch.js");
            this.LIZ = concat2;
            if (concat2 != null) {
                o1m.LJIIIIZZ = concat2;
                if (this.LIZLLL == EnumC37741ErZ.Terminate) {
                    return;
                }
                this.LIZLLL = EnumC37741ErZ.Fetching;
                O26 loadSync = iResourceService.loadSync(concat2, o1m);
                if (loadSync == null) {
                    LJI("fetch_reject_1: resInfo is null");
                    return;
                }
                String str3 = loadSync.LJII;
                if (str3 == null || str3.length() == 0) {
                    LJI("fetch_reject_1: filePath is null");
                    return;
                }
                InputStream LIZJ = loadSync.LIZJ();
                if (LIZJ != null) {
                    C60737Nsb c60737Nsb2 = this.LJIIJ;
                    String str4 = this.LIZ;
                    if (str4 == null) {
                        str4 = this.LJIIIZ;
                    }
                    C38097ExJ.LIZIZ("hybrid_prefetch_file_load_state", c60737Nsb2, str4, new JSONObject().put("success", 1));
                    C60737Nsb c60737Nsb3 = this.LJIIJ;
                    String str5 = this.LIZ;
                    if (str5 == null) {
                        str5 = this.LJIIIZ;
                    }
                    JSONObject put = new JSONObject().put("type", "resourceLoader");
                    O29 o29 = loadSync.LJIIIZ;
                    if (o29 != null && (name = o29.name()) != null) {
                        Locale locale = Locale.US;
                        o.LJFF(locale, "Locale.US");
                        str2 = name.toLowerCase(locale);
                        o.LJFF(str2, "(this as java.lang.String).toLowerCase(locale)");
                    } else {
                        str2 = "unknown";
                    }
                    C38097ExJ.LIZIZ("hybrid_prefetch_resource_load", c60737Nsb3, str5, put.put("res_from", str2).put("isCache", loadSync.LJIIJ).put("model", loadSync.LJIILIIL));
                    String str6 = this.LIZ;
                    if (str6 != null) {
                        LIZJ(str6, new String(C62848OlY.LJFF(LIZJ), PVC.LIZ));
                        return;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                LJI("resource loader load success but null input stream");
                return;
            }
            return;
        }
        LIZ(str);
    }

    public final synchronized void LJIIIZ(Integer num, String str, Throwable th) {
        C76800UCe c76800UCe;
        this.LIZLLL = EnumC37741ErZ.Terminate;
        try {
            Worker worker = this.LJ;
            if (worker != null) {
                worker.LIZIZ();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        InterfaceC37745Erd interfaceC37745Erd = this.LJFF;
        if (interfaceC37745Erd != null) {
            this.LJFF = null;
            C37744Erc.LIZ(interfaceC37745Erd, num, str, th, null, null, 24);
        }
        this.LJII = new OSJ<>(num, str, th);
        Iterator it = ((ConcurrentHashMap) this.LJIIIIZZ.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            ((C38254Ezq) ((Map.Entry) it.next()).getValue()).LIZIZ(num, str, th);
        }
    }

    public static /* synthetic */ void LJIIJ(C38504F9g c38504F9g, Integer num, String str, Throwable th, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        c38504F9g.LJIIIZ(num, str, th);
    }
}
