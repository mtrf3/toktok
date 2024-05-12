package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ComponentTypeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MatchComponentTypeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TzZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76457TzZ {
    public static final ConcurrentHashMap<String, MatchComponentTypeInfo> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final C76458Tza LIZJ = new C76458Tza();

    public static void LIZJ() {
        for (Map.Entry<String, MatchComponentTypeInfo> entry : LIZ.entrySet()) {
            if (!o.LJ(entry.getKey(), UCK.STRIKE_CARD.getValue()) && !o.LJ(entry.getKey(), UCK.SMOKE_CARD.getValue()) && !entry.getValue().isReported() && entry.getValue().getResult() != ComponentTypeResult.SUCCESS && !o.LJ(entry.getValue().getStartShowTime(), CardStruct.IStatusCode.DEFAULT)) {
                entry.getValue().setReported(true);
                LJ(entry.getKey(), entry.getValue().getResult().getValue());
            }
        }
        LIZ.clear();
        LIZIZ.clear();
    }

    public static void LIZIZ(String type, boolean z) {
        ComponentTypeResult componentTypeResult;
        o.LJIIIZ(type, "type");
        if (z) {
            return;
        }
        ConcurrentHashMap<String, MatchComponentTypeInfo> concurrentHashMap = LIZ;
        MatchComponentTypeInfo matchComponentTypeInfo = concurrentHashMap.get(type);
        if (matchComponentTypeInfo != null && matchComponentTypeInfo.isReported()) {
            return;
        }
        long LIZ2 = C30725C4b.LIZ();
        if (concurrentHashMap.containsKey(type)) {
            MatchComponentTypeInfo matchComponentTypeInfo2 = concurrentHashMap.get(type);
            if (matchComponentTypeInfo2 != null) {
                componentTypeResult = matchComponentTypeInfo2.getResult();
            } else {
                componentTypeResult = null;
            }
            if (componentTypeResult == ComponentTypeResult.SEI) {
                MatchComponentTypeInfo matchComponentTypeInfo3 = concurrentHashMap.get(type);
                if (matchComponentTypeInfo3 != null) {
                    matchComponentTypeInfo3.setResult(ComponentTypeResult.SUCCESS);
                    matchComponentTypeInfo3.setStartShowTime(String.valueOf(LIZ2));
                    matchComponentTypeInfo3.setReported(true);
                }
                LJ(type, ComponentTypeResult.SUCCESS.getValue());
                return;
            }
        }
        if (concurrentHashMap.containsKey(type)) {
            return;
        }
        concurrentHashMap.put(type, new MatchComponentTypeInfo(String.valueOf(LIZ2), 0L, ComponentTypeResult.SHOW, false));
    }

    public static void LIZLLL(String type, boolean z) {
        MatchComponentTypeInfo matchComponentTypeInfo;
        o.LJIIIZ(type, "type");
        if (z) {
            return;
        }
        ConcurrentHashMap<String, MatchComponentTypeInfo> concurrentHashMap = LIZ;
        if (concurrentHashMap.containsKey(type) && (matchComponentTypeInfo = concurrentHashMap.get(type)) != null) {
            if (!matchComponentTypeInfo.isReported() && matchComponentTypeInfo.getResult() != ComponentTypeResult.SUCCESS && !o.LJ(matchComponentTypeInfo.getStartShowTime(), CardStruct.IStatusCode.DEFAULT)) {
                LJ(type, matchComponentTypeInfo.getResult().getValue());
            }
            concurrentHashMap.remove(type);
        }
    }

    public static void LJ(String type, String result) {
        boolean LJI = B5G.LIZIZ().LJI();
        if (C76265TwT.LJIILIIL) {
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            Boolean valueOf = Boolean.valueOf(LJI);
            o.LJIIIZ(type, "type");
            o.LJIIIZ(result, "result");
            JSONObject LIZLLL = FT5.LIZLLL(type, result);
            C05630Jz.LIZ(o.LJ(valueOf, Boolean.TRUE) ? 1 : 0, "is_first_sei", LIZLLL);
            C76271TwZ.LJLJJLL(c76271TwZ, "battle_component_show", LIZLLL, null, null, false, 28);
            return;
        }
        C76272Twa c76272Twa = C76272Twa.LIZ;
        Boolean valueOf2 = Boolean.valueOf(LJI);
        o.LJIIIZ(type, "type");
        o.LJIIIZ(result, "result");
        JSONObject LIZLLL2 = FT5.LIZLLL(type, result);
        C05630Jz.LIZ(o.LJ(valueOf2, Boolean.TRUE) ? 1 : 0, "is_first_sei", LIZLLL2);
        c76272Twa.LJJJLL(0, "battle_component_show", LIZLLL2);
    }

    public static void LIZ(UCK type, long j, boolean z) {
        o.LJIIIZ(type, "type");
        if (z) {
            for (Map.Entry<String, String> entry : LIZIZ.entrySet()) {
                if (!o.LJ(entry.getKey(), UCK.SMOKE_CARD.getValue()) && !o.LJ(entry.getKey(), UCK.STRIKE_CARD.getValue())) {
                    LIZIZ.remove(entry.getKey());
                }
            }
            if (j != 0) {
                LIZIZ.put(type.getValue(), String.valueOf(j));
            }
            C8E.LIZJ().rd("component_type", LIZIZ);
        }
    }

    public static void LJFF(long j, String type, boolean z) {
        U8H LJJZZI;
        o.LJIIIZ(type, "type");
        if (z) {
            if (j == 0) {
                LIZIZ.remove(type);
            } else {
                LIZIZ.put(type, String.valueOf(j));
            }
            InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
            if (LJJIJL != null && (LJJZZI = LJJIJL.LJJZZI()) != null) {
                LJJZZI.LJJJJJL("component_type", LIZIZ);
            }
        }
    }
}
