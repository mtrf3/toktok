package kotlin.jvm.internal;

import X.AbstractC62625Ohx;
import X.AbstractC65781Prl;
import X.C10K;
import X.C39048FUe;
import X.C61255O2h;
import X.C61261O2n;
import X.C61268O2u;
import X.C61269O2v;
import X.C62271OcF;
import X.C62313Ocv;
import X.C62358Ode;
import X.C68322mC;
import X.C70414RkI;
import X.C76800UCe;
import X.EnumC39866Fkk;
import X.InterfaceC62225ObV;
import X.InterfaceC88472Yns;
import X.O18;
import X.O1M;
import X.O26;
import X.O2C;
import X.OYP;
import X.PMI;
import X.X1D;
import Y.ACallableS39S1200000_10;
import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AqS15S1400000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.Ocv, T] */
    public static final Object invoke$0(AqS15S1400000_10 aqS15S1400000_10, Object obj) {
        String str;
        String str2;
        AbstractC62625Ohx shortLink = (AbstractC62625Ohx) obj;
        o.LJIIIZ(shortLink, "shortLink");
        String str3 = ((OYP) shortLink).LIZLLL;
        String str4 = "";
        if (!C62358Ode.LIZIZ((InterfaceC62225ObV) aqS15S1400000_10.l1, ((SharePackage) aqS15S1400000_10.l2).itemType, 5)) {
            str = "";
            str2 = "";
        } else {
            str = ((SharePackage) aqS15S1400000_10.l2).description;
            str2 = ((SharePackage) aqS15S1400000_10.l2).title;
        }
        C68322mC c68322mC = (C68322mC) aqS15S1400000_10.l3;
        Uri LIZ = O18.LIZ((Context) aqS15S1400000_10.l4, new File(aqS15S1400000_10.s0));
        if (o.LJ(((InterfaceC62225ObV) aqS15S1400000_10.l1).key(), "snapchat")) {
            str = "";
        }
        o.LJIIIIZZ(LIZ, "getFileProviderUri(context, File(outPath))");
        c68322mC.element = new C62313Ocv(LIZ, aqS15S1400000_10.s0, str, str2, str3, null, false, 200);
        C62313Ocv c62313Ocv = (C62313Ocv) ((C68322mC) aqS15S1400000_10.l3).element;
        String str5 = c62313Ocv.LJFF;
        if (str5 != null) {
            str4 = str5;
        }
        ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str4);
        ((BaseBundle) ((PMI) ((C68322mC) aqS15S1400000_10.l3).element).LIZ).putString("media_type", "image/png");
        ((SharePackage) aqS15S1400000_10.l2).extras.putString("share_form", "url_photo_form");
        InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) aqS15S1400000_10.l1;
        interfaceC62225ObV.LJIIJ((AbstractC62625Ohx) ((C68322mC) aqS15S1400000_10.l3).element, (Context) aqS15S1400000_10.l4, new C62271OcF(interfaceC62225ObV, (SharePackage) aqS15S1400000_10.l2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S1400000_10 aqS15S1400000_10, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadSync: reject uri =");
        LIZ.append(aqS15S1400000_10.s0);
        c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.D, "ResourceLoader");
        ((JSONObject) aqS15S1400000_10.l1).put("m_total", ((C61268O2u) aqS15S1400000_10.l2).LIZIZ());
        O26 resInfo = ((C61261O2n) aqS15S1400000_10.l3).LIZ;
        O1M taskConfig = (O1M) aqS15S1400000_10.l4;
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        o.LJIIJ(resInfo, "resInfo");
        o.LJIIJ(taskConfig, "taskConfig");
        C10K.LIZIZ(new ACallableS39S1200000_10(resInfo, taskConfig, message, 2), C10K.LJI, null);
        O2C.LIZIZ((JSONObject) aqS15S1400000_10.l1, ((C61261O2n) aqS15S1400000_10.l3).LIZ, (O1M) aqS15S1400000_10.l4, false);
        C61255O2h c61255O2h = C61269O2v.LIZIZ;
        C61261O2n c61261O2n = (C61261O2n) aqS15S1400000_10.l3;
        c61255O2h.LIZJ(c61261O2n.LIZ, c61261O2n.LIZIZ, it);
        String jSONArray = ((C61261O2n) aqS15S1400000_10.l3).LIZ.LIZLLL.toString();
        o.LJFF(jSONArray, "resourceLoadTask.info.pipelineStatus.toString()");
        C39048FUe.LIZIZ(c39048FUe, jSONArray, null, null, 6);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS15S1400000_10 aqS15S1400000_10, Object obj) {
        String str;
        String str2;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup((HashMap) aqS15S1400000_10.l1);
        logNode.plusAssign("from_user_id", aqS15S1400000_10.s0);
        logNode.plusAssign("platform", ((InterfaceC62225ObV) aqS15S1400000_10.l2).key());
        logNode.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        C70414RkI c70414RkI = (C70414RkI) aqS15S1400000_10.l3;
        int aw0 = ((PdpViewModel) aqS15S1400000_10.l4).aw0();
        c70414RkI.getClass();
        if (aw0 != 1) {
            if (aw0 != 2) {
                str = "product_detail";
            } else {
                str = "shop_review";
            }
        } else {
            str = "product_review";
        }
        logNode.plusAssign("page_name", str);
        if (o.LJ(String.valueOf(((HashMap) aqS15S1400000_10.l1).get("author_id")), aqS15S1400000_10.s0)) {
            str2 = "author";
        } else {
            str2 = "user";
        }
        logNode.plusAssign("user_type", str2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S1400000_10(InterfaceC62225ObV interfaceC62225ObV, SharePackage sharePackage, C68322mC c68322mC, Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC62225ObV;
        this.l2 = sharePackage;
        this.l3 = c68322mC;
        this.l4 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S1400000_10(String str, JSONObject jSONObject, C61268O2u c61268O2u, C61261O2n c61261O2n, O1M o1m, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = jSONObject;
        this.l2 = c61268O2u;
        this.l3 = c61261O2n;
        this.l4 = o1m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS15S1400000_10(HashMap hashMap, HashMap<String, Object> hashMap2, String str, InterfaceC62225ObV interfaceC62225ObV, C70414RkI c70414RkI, PdpViewModel pdpViewModel) {
        super(1);
        this.$t = pdpViewModel;
        this.l1 = hashMap;
        this.s0 = hashMap2;
        this.l2 = str;
        this.l3 = interfaceC62225ObV;
        this.l4 = c70414RkI;
    }
}
