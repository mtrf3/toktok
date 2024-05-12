package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.strategy.IStrategyStateSupplier;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Ikz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47525Ikz implements IStrategyStateSupplier {
    public final /* synthetic */ C47529Il3 LIZ;

    @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
    public final double getNetworkSpeed() {
        InterfaceC47097Ie5 interfaceC47097Ie5 = this.LIZ.LIZIZ;
        if (interfaceC47097Ie5 != null) {
            if (((C47087Idv) interfaceC47097Ie5).LIZ.LJIJJLI.getSpeedManager() != null) {
                return r1.LIZ.LJIJJLI.getSpeedManager().getAverageSpeedInKBps();
            }
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
    public final double getNetworkScore() {
        C47578Ilq.LIZ().getClass();
        return C47578Ilq.LIZJ;
    }

    @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
    public final int getNetworkType() {
        int i = C47906Ir8.LIZLLL().LIZ;
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 20;
        }
        if (i != 2 && i != 3 && i != 1 && i != 4) {
            return -1;
        }
        return 10;
    }

    public C47525Ikz(C47529Il3 c47529Il3) {
        this.LIZ = c47529Il3;
    }

    @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
    public final String mediaInfoJsonString(String str) {
        InterfaceC47097Ie5 interfaceC47097Ie5 = this.LIZ.LIZIZ;
        if (interfaceC47097Ie5 != null) {
            interfaceC47097Ie5.getClass();
        }
        return null;
    }

    @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
    public final String selectBitrateJsonString(String str, int i) {
        InterfaceC47097Ie5 interfaceC47097Ie5 = this.LIZ.LIZIZ;
        if (interfaceC47097Ie5 != null) {
            interfaceC47097Ie5.getClass();
        }
        return null;
    }

    @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
    public final String selectBitrateJsonString(String str, String str2, int i) {
        InterfaceC47097Ie5 interfaceC47097Ie5 = this.LIZ.LIZIZ;
        if (interfaceC47097Ie5 != null) {
            interfaceC47097Ie5.getClass();
        }
        return null;
    }

    @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
    public final String onAfterSelect(String str, String str2, int i, Object obj) {
        C47526Il0 c47526Il0;
        InterfaceC47527Il1 interfaceC47527Il1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[GearStrategy] StrategyHelper.onAfterSelect type=");
        LIZ.append(i);
        LIZ.append(" context=");
        LIZ.append(obj);
        C78253UnR.LJI("VCStrategy", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = null;
        if (!(obj instanceof C47526Il0) || (interfaceC47527Il1 = (c47526Il0 = (C47526Il0) obj).LIZ) == null) {
            C47542IlG c47542IlG = C47606ImI.LIZ;
            C78253UnR.LJI("VCStrategy", "listener is null");
            return str2;
        }
        Object obj2 = c47526Il0.LIZIZ;
        WeakReference<TTVideoEngine> weakReference = c47526Il0.LIZLLL;
        if (weakReference != null) {
            tTVideoEngine = weakReference.get();
        }
        HashMap hashMap = new HashMap();
        this.LIZ.getClass();
        C47529Il3.LIZIZ(str2, hashMap);
        if (tTVideoEngine != null) {
            tTVideoEngine.LLF(109, System.currentTimeMillis());
        }
        interfaceC47527Il1.LIZLLL(hashMap, obj2);
        if (tTVideoEngine != null) {
            tTVideoEngine.LLF(110, System.currentTimeMillis());
            if (hashMap.containsKey("video_bitrarte_user_selected")) {
                try {
                    tTVideoEngine.LLF(101, CastLongProtector.parseLong((String) hashMap.get("video_bitrarte_user_selected")));
                } catch (NumberFormatException unused) {
                }
                tTVideoEngine.LLD(102, 9);
                return "";
            }
            if (hashMap.containsKey("video_bitrarte")) {
                try {
                    tTVideoEngine.LLF(101, CastLongProtector.parseLong((String) hashMap.get("video_bitrarte")));
                } catch (NumberFormatException unused2) {
                }
            }
            if (hashMap.containsKey("select_reason")) {
                try {
                    tTVideoEngine.LLD(102, CastIntegerProtector.parseInt((String) hashMap.get("select_reason")));
                } catch (NumberFormatException unused3) {
                }
            }
            if (hashMap.containsKey("speed")) {
                try {
                    tTVideoEngine.LLF(103, CastLongProtector.parseLong((String) hashMap.get("speed")));
                } catch (NumberFormatException unused4) {
                }
            }
            if (hashMap.containsKey(104)) {
                try {
                    tTVideoEngine.LLD(104, CastIntegerProtector.parseInt((String) hashMap.get("error_code")));
                    return "";
                } catch (NumberFormatException unused5) {
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.ImS] */
    @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
    public final String onBeforeSelect(String str, String str2, int i, Object obj) {
        InterfaceC47527Il1 interfaceC47527Il1;
        C47526Il0 c47526Il0;
        TTVideoEngine tTVideoEngine;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[GearStrategy] StrategyHelper.onBeforeSelect type=");
        LIZ.append(i);
        LIZ.append(" context=");
        LIZ.append(obj);
        C78253UnR.LJI("VCStrategy", X1D.LIZIZ(LIZ));
        C47156If2 c47156If2 = null;
        TTVideoEngine tTVideoEngine2 = null;
        if (obj instanceof C47526Il0) {
            c47526Il0 = (C47526Il0) obj;
            interfaceC47527Il1 = c47526Il0.LIZ;
        } else {
            interfaceC47527Il1 = null;
            c47526Il0 = null;
        }
        if (interfaceC47527Il1 == null && C47606ImI.LIZ != null) {
            interfaceC47527Il1 = null;
        }
        if (interfaceC47527Il1 == null) {
            C78253UnR.LJI("VCStrategy", "listener is null");
            return str2;
        }
        if (c47526Il0 != null) {
            ?? r1 = c47526Il0.LIZJ;
            WeakReference<TTVideoEngine> weakReference = c47526Il0.LIZLLL;
            if (weakReference != null) {
                tTVideoEngine2 = weakReference.get();
            }
            tTVideoEngine = tTVideoEngine2;
            c47156If2 = r1;
        } else {
            tTVideoEngine = null;
        }
        if (c47156If2 == null) {
            c47156If2 = new C47113IeL().LIZIZ();
            try {
                c47156If2.LJJIIJZLJL(new JSONObject(str));
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[GearStrategy]fromMediaInfoJsonString exception=");
                LIZ2.append(e);
                C78253UnR.LJI("TTVideoEngine.BareVideoModel", X1D.LIZIZ(LIZ2));
            }
        }
        HashMap hashMap = new HashMap();
        this.LIZ.getClass();
        C47529Il3.LIZIZ(str2, hashMap);
        if (tTVideoEngine != null) {
            tTVideoEngine.LLF(107, System.currentTimeMillis());
        }
        interfaceC47527Il1.LJ();
        if (tTVideoEngine != null) {
            tTVideoEngine.LLF(108, System.currentTimeMillis());
        }
        this.LIZ.LJ().updateMedia(c47156If2.LJJI(2), "", c47156If2.LJIIIIZZ());
        this.LIZ.getClass();
        return C47529Il3.LIZ(hashMap);
    }
}
