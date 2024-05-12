package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.TagInfo;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.net.DownloadableModelResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.XAo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84402XAo extends XCZ {
    public final C0R1 LJI;
    public final XCG LJII;
    public final C84376X9o LJIIIIZZ;
    public final int LJIIIZ;
    public final InterfaceC84400XAm LJIIJ;

    @Override // X.XCZ
    public final void LIZJ() {
    }

    public final XD6 LJI() {
        Object LIZ;
        Object LIZ2;
        HashMap hashMap = new HashMap();
        String str = this.LJII.LIZJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        hashMap.put("sdk_version", str);
        String str3 = this.LJII.LJII;
        if (str3 != null) {
            str2 = str3;
        }
        hashMap.put("device_type", str2);
        if (this.LJII.LJJIJ == XA2.ZIP) {
            hashMap.put("url_type", "zip");
        } else {
            hashMap.put("url_type", "source");
        }
        X9D x9d = this.LJII.LJJIJIIJIL;
        if (x9d == null) {
            x9d = X9D.ONLINE;
        }
        hashMap.put("status", String.valueOf(x9d.ordinal()));
        int i = this.LJIIIZ;
        if (i > 0) {
            hashMap.put("busi_id", String.valueOf(i));
        }
        try {
            LIZ = this.LJIIIIZZ.LIZLLL("model/effect_local_config.json");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Object obj = null;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str4 = (String) LIZ;
        if (str4 != null) {
            try {
                G0J g0j = this.LJII.LJIJ;
                if (g0j != null) {
                    LIZ2 = (TagInfo) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(str4, TagInfo.class);
                } else {
                    LIZ2 = null;
                }
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th2) {
                LIZ2 = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (!C3C5.m12isFailureimpl(LIZ2)) {
                obj = LIZ2;
            }
            TagInfo tagInfo = (TagInfo) obj;
            if (tagInfo != null) {
                hashMap.put("tag", tagInfo.getTag());
            }
        }
        hashMap.putAll(XCH.LIZ(this.LJII, false));
        return new XD6(C61597OFl.LIZ(hashMap, o.LJIILLIIL("/model/api/arithmetics", this.LJII.LJJIIJZLJL)), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XCZ
    public final void LIZ() {
        VNB vnb;
        InterfaceC79048V0q interfaceC79048V0q;
        String LIZLLL;
        C15140ic.LIZ();
        try {
            if (this.LIZIZ) {
                return;
            }
            XD6 LJI = LJI();
            X62 x62 = (X62) this.LJII.LJIJI.LIZ;
            String str = null;
            if (x62 != null) {
                vnb = x62.fetchFromNetwork(LJI);
                if (vnb != null && (interfaceC79048V0q = vnb.LIZJ) != null && (LIZLLL = C79045V0n.LIZLLL(interfaceC79048V0q)) != null) {
                    if (!C107244Iu.LIZIZ(LIZLLL)) {
                        C84394XAg LJII = LJII(LIZLLL);
                        if (LJII != null) {
                            InterfaceC84400XAm interfaceC84400XAm = this.LJIIJ;
                            if (interfaceC84400XAm != null) {
                                interfaceC84400XAm.LIZIZ(LJII);
                            }
                            this.LJII.getClass();
                            return;
                        }
                        InterfaceC84400XAm interfaceC84400XAm2 = this.LJIIJ;
                        if (interfaceC84400XAm2 != null) {
                            interfaceC84400XAm2.LIZ(new RuntimeException("result return null when parseResponse"));
                            return;
                        }
                        return;
                    }
                    InterfaceC84400XAm interfaceC84400XAm3 = this.LJIIJ;
                    if (interfaceC84400XAm3 != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("responseString is empty when convertToString, errorMsg: ");
                        if (vnb != null) {
                            str = vnb.LJ;
                        }
                        LIZ.append(str);
                        interfaceC84400XAm3.LIZ(new RuntimeException(X1D.LIZIZ(LIZ)));
                        return;
                    }
                    return;
                }
            } else {
                vnb = null;
            }
            InterfaceC84400XAm interfaceC84400XAm4 = this.LJIIJ;
            if (interfaceC84400XAm4 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("responseString return null when convertToString, errorMsg: ");
                if (vnb != null) {
                    str = vnb.LJ;
                }
                LIZ2.append(str);
                interfaceC84400XAm4.LIZ(new RuntimeException(X1D.LIZIZ(LIZ2)));
            }
        } catch (Exception e) {
            this.LJII.getClass();
            InterfaceC84400XAm interfaceC84400XAm5 = this.LJIIJ;
            if (interfaceC84400XAm5 != null) {
                interfaceC84400XAm5.LIZ(e);
            }
        }
    }

    public final C84394XAg LJII(String str) {
        DownloadableModelResponse downloadableModelResponse;
        java.util.Map<String, List<ModelInfo>> arithmetics;
        G0J g0j = this.LJII.LJIJ;
        if (g0j == null || (downloadableModelResponse = (DownloadableModelResponse) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(str, DownloadableModelResponse.class)) == null) {
            return null;
        }
        C1UD c1ud = new C1UD();
        int status_code = downloadableModelResponse.getStatus_code();
        if (status_code == 0) {
            DownloadableModelResponse.Data data = downloadableModelResponse.getData();
            if (data != null && (arithmetics = data.getArithmetics()) != null) {
                for (Map.Entry<String, List<ModelInfo>> entry : arithmetics.entrySet()) {
                    String key = entry.getKey();
                    entry.getValue();
                    List<ModelInfo> list = arithmetics.get(key);
                    if (list != null) {
                        Iterator<ModelInfo> it = list.iterator();
                        while (it.hasNext()) {
                            c1ud.LIZIZ(key, it.next());
                        }
                    } else {
                        "modelInfo list is null".toString();
                        throw new IllegalStateException("modelInfo list is null");
                    }
                }
                return new C84394XAg(c1ud);
            }
            throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
        }
        StringBuilder LJ = C7MY.LJ("status code == ", status_code, " , indicates there is no model config from server, sdk version is ");
        LJ.append(this.LJII.LIZJ);
        throw new IllegalStateException(X1D.LIZIZ(LJ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84402XAo(XCG config, C84376X9o buildInAssetsManager, int i, C84392XAe c84392XAe) {
        super(null, null);
        o.LJIIJ(config, "config");
        o.LJIIJ(buildInAssetsManager, "buildInAssetsManager");
        this.LJII = config;
        this.LJIIIIZZ = buildInAssetsManager;
        this.LJIIIZ = i;
        this.LJIIJ = c84392XAe;
        this.LJI = new C0R1(false);
    }
}
