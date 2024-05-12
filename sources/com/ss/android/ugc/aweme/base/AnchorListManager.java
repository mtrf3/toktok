package com.ss.android.ugc.aweme.base;

import X.C10K;
import X.C16880lQ;
import X.C211898Th;
import X.C27739Aud;
import X.C2YJ;
import X.C33808DOq;
import X.C36922EeM;
import X.C40084FoG;
import X.C42789Gqn;
import X.C42791Gqp;
import X.C42919Gst;
import X.C47261Igj;
import X.C61878OQg;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C65777Prh;
import X.C75792yF;
import X.C79057V0z;
import X.CallableC42918Gss;
import X.E4Q;
import X.E4T;
import X.EF7;
import X.EnumC42929Gt3;
import X.EnumC42934Gt8;
import X.ExecutorC42920Gsu;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC65349Pkn;
import X.InterfaceC65784Pro;
import X.InterfaceC789838c;
import X.ORS;
import X.ORZ;
import X.X1D;
import Y.ACallableS110S0100000_7;
import android.os.Looper;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BAGetLeadsAnchorStateApi;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BAProductAnchorStateApi;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import defpackage.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorListManager {
    public static final AnchorListApi LIZ;
    public static final InterfaceC789838c LIZIZ;
    public static final Keva LIZJ;
    public static final Keva LIZLLL;
    public static boolean LJ;
    public static String LJFF;
    public static int LJI;
    public static final AtomicBoolean LJII;
    public static boolean LJIIIIZZ;
    public static Map<String, AnchorPublishStruct> LJIIIZ;

    /* loaded from: classes8.dex */
    public interface AnchorImpressionApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/anchor/addlink/impression/report/")
        C10K<Object> postAnchorImpressionReport(@InterfaceC64987Pex("impression_list_json") String str);
    }

    /* loaded from: classes8.dex */
    public interface AnchorListApi {
        @E4Q("/aweme/v1/anchor/list/")
        C10K<AnchorListResp> getAnchorList();
    }

    /* loaded from: classes8.dex */
    public static final class AnchorAddLinkImpression {

        @InterfaceC65349Pkn("anchor_subtype")
        public final String anchorSubtype;

        @InterfaceC65349Pkn("anchor_type")
        public final int anchorType;

        @InterfaceC65349Pkn("impression_type")
        public final int impressionType;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorAddLinkImpression)) {
                return false;
            }
            AnchorAddLinkImpression anchorAddLinkImpression = (AnchorAddLinkImpression) obj;
            return this.impressionType == anchorAddLinkImpression.impressionType && this.anchorType == anchorAddLinkImpression.anchorType && o.LJ(this.anchorSubtype, anchorAddLinkImpression.anchorSubtype);
        }

        public final int hashCode() {
            int i = ((this.impressionType * 31) + this.anchorType) * 31;
            String str = this.anchorSubtype;
            return i + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AnchorAddLinkImpression(impressionType=");
            LIZ.append(this.impressionType);
            LIZ.append(", anchorType=");
            LIZ.append(this.anchorType);
            LIZ.append(", anchorSubtype=");
            return q.LIZIZ(LIZ, this.anchorSubtype, ')', LIZ);
        }

        public AnchorAddLinkImpression(int i, int i2, String str) {
            this.impressionType = i;
            this.anchorType = i2;
            this.anchorSubtype = str;
        }

        public /* synthetic */ AnchorAddLinkImpression(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? "" : str);
        }
    }

    /* loaded from: classes3.dex */
    public static final class AnchorLogExtra {

        @InterfaceC65349Pkn("anchor_type")
        public final String impressionType;

        /* JADX WARN: Multi-variable type inference failed */
        public AnchorLogExtra() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnchorLogExtra) && o.LJ(this.impressionType, ((AnchorLogExtra) obj).impressionType);
        }

        public final int hashCode() {
            String str = this.impressionType;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AnchorLogExtra(impressionType=");
            return q.LIZIZ(LIZ, this.impressionType, ')', LIZ);
        }

        public AnchorLogExtra(String str) {
            this.impressionType = str;
        }

        public /* synthetic */ AnchorLogExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static boolean LIZIZ() {
        try {
            Boolean enableAnchorCache = C2YJ.LIZIZ.LIZ.getEnableAnchorCache();
            o.LJIIIIZZ(enableAnchorCache, "{\n            SettingsRe…ableAnchorCache\n        }");
            return enableAnchorCache.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LJIIL() {
        Collection values;
        AnchorPublishStruct anchorPublishStruct;
        try {
            Keva keva = LIZJ;
            String LJIILLIIL = C75792yF.LIZIZ().LJIILLIIL(LJI(), new C42919Gst().getType());
            o.LJIIIIZZ(LJIILLIIL, "getGson().toJson(noFilte…ublishStruct>>() {}.type)");
            C79057V0z.LJJJJJ(keva, "anchor_map_key", LJIILLIIL);
            Map LJI2 = LJI();
            if (LJI2 != null && (values = LJI2.values()) != null && (anchorPublishStruct = (AnchorPublishStruct) ORZ.LJLLL(values)) != null) {
                LIZLLL.storeString("ECOMMERCE_i18N_STORAGE_PROMPT_STRING", anchorPublishStruct.anchorTips);
            }
            C79057V0z.LJJJJJL(keva, "anchor_local_map_success", true);
            String str = LJFF;
            if (str != null && !ujb.o.LJJJJJL(str)) {
                C79057V0z.LJJJJJ(keva, "anchor_region_keva", str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AnchorListManager saveData Exception: ");
            LIZ2.append(e);
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
            C36922EeM.LJFF(e);
            C16880lQ.LLLLIIL(e);
        }
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LIZ = (AnchorListApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(LIZIZ2).create(AnchorListApi.class);
        LIZIZ = C40084FoG.LIZIZ(LIZIZ2);
        Keva repo = Keva.getRepo("anchor_data_keva");
        o.LJIIIIZZ(repo, "getRepo(ANCHOR_KEVA_NAME)");
        LIZJ = repo;
        Keva repo2 = Keva.getRepo("fe-storage");
        o.LJIIIIZZ(repo2, "getRepo(REACT_NATIVE_PREFERENCE_NAME)");
        LIZLLL = repo2;
        LJII = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static List LJFF() {
        ?? r4;
        ?? r3;
        Collection values;
        Collection values2;
        Map LJI2 = LJI();
        if (LJI2 != null && (values2 = LJI2.values()) != null) {
            r4 = new ArrayList();
            for (Object obj : values2) {
                if (((AnchorPublishStruct) obj).isNew) {
                    r4.add(obj);
                }
            }
        } else {
            r4 = C61878OQg.INSTANCE;
        }
        Map LJI3 = LJI();
        if (LJI3 != null && (values = LJI3.values()) != null) {
            r3 = new ArrayList();
            for (Object obj2 : values) {
                if (!((AnchorPublishStruct) obj2).isNew) {
                    r3.add(obj2);
                }
            }
        } else {
            r3 = C61878OQg.INSTANCE;
        }
        return ORZ.LLIIIZ(r3, r4);
    }

    public static Map LJI() {
        Map<String, AnchorPublishStruct> map;
        Collection<AnchorPublishStruct> values;
        boolean z;
        if (LIZIZ()) {
            Map<String, AnchorPublishStruct> map2 = LJIIIZ;
            if (map2 == null || map2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !LJ) {
                Keva keva = LIZJ;
                LJFF = C79057V0z.LJJIFFI(keva, "anchor_region_keva");
                Map<String, AnchorPublishStruct> map3 = null;
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI(keva, "anchor_map_key"), C65330PkU.LIZJ(C65352Pkq.LIZJ(C65352Pkq.LJFF(Map.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(AnchorPublishStruct.class))))));
                    if (!C65777Prh.LJII(fromJson)) {
                        fromJson = null;
                    }
                    map3 = (Map) fromJson;
                } catch (s unused) {
                }
                LJIIIIZZ(map3);
                LJIIJ(map3);
                LJIIIZ(map3);
                BAGetLeadsAnchorStateApi.LIZ(map3);
                BAProductAnchorStateApi.LIZ(map3);
                LJIIIZ = map3;
            }
        }
        if (!C211898Th.LIZ() && (map = LJIIIZ) != null && (values = map.values()) != null) {
            ORS.LJJLIIJ(values, C42789Gqn.LJLIL);
        }
        return LJIIIZ;
    }

    public static boolean LIZ(int i) {
        Collection values;
        Map LJI2 = LJI();
        if (LJI2 == null || (values = LJI2.values()) == null || values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((AnchorPublishStruct) it.next()).type == i) {
                return true;
            }
        }
        return false;
    }

    public static void LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        Executor executor;
        if (!LJII.get() && o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && C33808DOq.LIZ()) {
            executor = C10K.LJI;
        } else {
            executor = ExecutorC42920Gsu.LJLIL;
        }
        C10K.LIZIZ(new ACallableS110S0100000_7(interfaceC65784Pro, 5), executor, null);
    }

    public static String LIZLLL(AnchorPublishStruct anchorPublishStruct) {
        Integer num;
        StringBuilder LIZ2 = X1D.LIZ();
        String str = null;
        if (anchorPublishStruct != null) {
            num = Integer.valueOf(anchorPublishStruct.type);
        } else {
            num = null;
        }
        LIZ2.append(num);
        LIZ2.append('(');
        if (anchorPublishStruct != null) {
            str = anchorPublishStruct.subtype;
        }
        return q.LIZIZ(LIZ2, str, ')', LIZ2);
    }

    public static String LJII(AnchorPublishStruct anchor) {
        AnchorLogExtra anchorLogExtra;
        o.LJIIIZ(anchor, "anchor");
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), anchor.logExtra, C65330PkU.LIZJ(C65352Pkq.LJI(AnchorLogExtra.class)));
            if (!(fromJson instanceof AnchorLogExtra)) {
                fromJson = null;
            }
            anchorLogExtra = (AnchorLogExtra) fromJson;
        } catch (s unused) {
            anchorLogExtra = null;
        }
        if (anchorLogExtra == null) {
            return null;
        }
        return anchorLogExtra.impressionType;
    }

    public static void LJIIIIZZ(Map map) {
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it.next()).getValue();
                if (anchorPublishStruct.isNew) {
                    anchorPublishStruct.hadNew = true;
                }
            }
        }
    }

    public static void LJIIIZ(Map map) {
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((AnchorPublishStruct) ((Map.Entry) it.next()).getValue()).type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                    LJIIIIZZ = true;
                }
            }
        }
    }

    public static void LJIIJ(Map map) {
        LJI = 0;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((AnchorPublishStruct) ((Map.Entry) it.next()).getValue()).isNew) {
                    LJI++;
                }
            }
        }
    }

    public static void LJIIJJI(AnchorPublishStruct anchor) {
        AnchorPublishStruct anchorPublishStruct;
        o.LJIIIZ(anchor, "anchor");
        String LIZLLL2 = LIZLLL(anchor);
        Map LJI2 = LJI();
        if (LJI2 != null && (anchorPublishStruct = (AnchorPublishStruct) LJI2.get(LIZLLL2)) != null) {
            anchorPublishStruct.isNew = false;
        }
        LJIIL();
        ((AnchorImpressionApi) LIZIZ.create(AnchorImpressionApi.class)).postAnchorImpressionReport(C27739Aud.LJI(C47261Igj.LJJIJ(new AnchorAddLinkImpression(EnumC42929Gt3.CreationPageEntered.getValue(), anchor.type, anchor.subtype))));
    }

    public static void LJIILIIL(Map map) {
        boolean LIZ2 = C211898Th.LIZ();
        Callable callable = CallableC42918Gss.LJLIL;
        if (LIZ2) {
            LJIIIZ = map;
            C10K.LIZJ(callable);
            return;
        }
        if (map != null) {
            Collection values = map.values();
            if (values != null) {
                ORS.LJJLIIJ(values, C42791Gqp.LJLIL);
            }
        } else {
            map = null;
        }
        LJIIIZ = map;
        C10K.LIZJ(callable);
    }

    public static AnchorPublishStruct LJ(int i, String subtype) {
        o.LJIIIZ(subtype, "subtype");
        Map LJI2 = LJI();
        if (LJI2 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(i);
            LIZ2.append('(');
            LIZ2.append(subtype);
            LIZ2.append(')');
            return (AnchorPublishStruct) LJI2.get(X1D.LIZIZ(LIZ2));
        }
        return null;
    }
}
