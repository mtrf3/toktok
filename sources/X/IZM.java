package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class IZM extends C46742IWc {
    public IZY LJLJI;
    public String LJLJJI;
    public java.util.Map<String, Object> LJLJJL;
    public String LJLJJLL;

    public final java.util.Map<String, String> LIZLLL() {
        IZG izg;
        HashMap LIZ = C45243HpH.LIZ("vr_projection_model_type", CardStruct.IStatusCode.DEFAULT, "is_from_cache", CardStruct.IStatusCode.DEFAULT);
        LIZ.put("video_resolution", this.LJLJJLL);
        java.util.Map<String, Object> map = this.LJLJJL;
        if (map != null && (izg = (IZG) C78926UyI.LJIJI("meta_info", map)) != null) {
            LIZ.put("strategy_tokens", izg.getStrategyTokens());
            LIZ.put("video_meta", izg.getMetaStr());
            E0B vidToken = izg.getVidToken();
            if (vidToken == null) {
                LIZ.put("is_video_id", CardStruct.IStatusCode.DEFAULT);
            } else if (!vidToken.isValid()) {
                LIZ.put("is_video_id", "-1");
            } else {
                LIZ.put("is_video_id", "-2");
            }
        }
        IZY izy = this.LJLJI;
        if (izy != null) {
            izy.LJJIJIL(LIZ);
        }
        return LIZ;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJL(new IZN(this, player));
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILIIL() {
        String str;
        List<C46836IZs> list;
        long j;
        List list2;
        java.util.Map<String, String> LIZLLL = LIZLLL();
        java.util.Map<String, Object> map = this.LJLJJL;
        if (map != null) {
            String obj = map.get("key").toString();
            IZR izr = C46828IZk.LIZ;
            izr.getClass();
            if (!TextUtils.isEmpty(obj)) {
                String[] split = obj.split("_");
                if (split != null && split.length > 1) {
                    str = split[0];
                } else {
                    str = obj;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(obj)) {
                        if (!TextUtils.isEmpty(str) && ((ConcurrentHashMap) izr.LIZ).containsKey(str) && (list2 = (List) ((ConcurrentHashMap) izr.LIZ).get(str)) != null && list2.size() > 0) {
                            for (int i = 0; i < list2.size(); i++) {
                                C46836IZs c46836IZs = (C46836IZs) ListProtector.get(list2, i);
                                if (c46836IZs != null) {
                                    j = c46836IZs.LIZIZ;
                                    break;
                                }
                            }
                        }
                    } else if (((ConcurrentHashMap) izr.LIZ).containsKey(str) && (list = (List) ((ConcurrentHashMap) izr.LIZ).get(str)) != null) {
                        for (C46836IZs c46836IZs2 : list) {
                            if (c46836IZs2 != null && obj.equals(c46836IZs2.LIZ)) {
                                j = c46836IZs2.LIZIZ;
                                break;
                            }
                        }
                    }
                }
            }
            j = -1;
            ((HashMap) LIZLLL).put("video_cache_size", String.valueOf(j));
        }
        return LIZLLL;
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILJJIL() {
        return LIZLLL();
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILL() {
        return LIZLLL();
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJJIIJ() {
        return LIZLLL();
    }

    public IZM(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
        this.LJLJJLL = "";
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIII(boolean z) {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player != null && z && this.LJLJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBeforeReset: lastDataSourceHelper: ");
            LIZ.append(this.LJLJI);
            LIZ.append("; mPlayer: ");
            LIZ.append(player);
            LIZ.append("; sourceID: ");
            LIZ.append(this.LJLJJI);
            SimRadar.keyScan("TTPlayer", "EngineDataSourceHelper", X1D.LIZIZ(LIZ));
            this.LJLJI.LJJJJLI(player);
        }
    }
}
