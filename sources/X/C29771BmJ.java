package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.FansConfig;
import webcast.data.FansLevelShowConfig;
import webcast.data.FansScoreRule;
import webcast.data.FansUpgradeBarrageEffectConfig;
import webcast.data.FansUpgradeDynamicEffectConfig;

/* renamed from: X.BmJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29771BmJ {
    public static final java.util.Map<Integer, FansScoreRule> LIZ = new LinkedHashMap();
    public static final java.util.Map<Integer, Integer> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<Long, ImageModel> LIZJ = new LinkedHashMap();
    public static final java.util.Map<Long, ImageModel> LIZLLL = new LinkedHashMap();
    public static final List<Integer> LJ;
    public static final java.util.Map<Integer, String> LJFF;
    public static int LJI;
    public static boolean LJII;

    static {
        new LinkedHashMap();
        LJ = new ArrayList();
        LJFF = new LinkedHashMap();
        LJI = 1;
    }

    public static void LIZ() {
        List<String> configStringList = InterfaceC30442Bx8.l2.LIZJ();
        o.LJIIIIZZ(configStringList, "configStringList");
        if (!configStringList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Gson gson = new Gson();
            Iterator<String> it = configStringList.iterator();
            while (it.hasNext()) {
                arrayList.add(GsonProtectorUtils.fromJson(gson, it.next(), FansConfig.class));
            }
            LIZIZ(arrayList);
        }
    }

    public static void LIZIZ(List list) {
        int i;
        FansScoreRule fansScoreRule;
        if (LJII || list == null || list.isEmpty()) {
            return;
        }
        ((ArrayList) LJ).clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FansConfig fansConfig = (FansConfig) it.next();
            Integer num = null;
            if (fansConfig != null && (fansScoreRule = fansConfig.fansScoreRule) != null) {
                num = Integer.valueOf(fansScoreRule.level);
            }
            if (num != null) {
                FansScoreRule fansScoreRule2 = fansConfig.fansScoreRule;
                if (fansScoreRule2 != null) {
                    LIZ.put(Integer.valueOf(fansScoreRule2.level), fansScoreRule2);
                    LJI = Math.max(LJI, fansScoreRule2.level);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (fansConfig == null) {
                continue;
            }
            FansUpgradeBarrageEffectConfig fansUpgradeBarrageEffectConfig = fansConfig.updateBarrageEffect;
            if (fansUpgradeBarrageEffectConfig != null) {
                if (Integer.valueOf(fansUpgradeBarrageEffectConfig.level) != null) {
                    FansUpgradeBarrageEffectConfig fansUpgradeBarrageEffectConfig2 = fansConfig.updateBarrageEffect;
                    if (fansUpgradeBarrageEffectConfig2 != null) {
                        LIZIZ.put(Integer.valueOf(fansUpgradeBarrageEffectConfig2.level), Integer.valueOf(fansUpgradeBarrageEffectConfig2.displayConfig));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (fansConfig == null) {
                    continue;
                }
            }
            FansLevelShowConfig fansLevelShowConfig = fansConfig.showConfig;
            if (fansLevelShowConfig != null) {
                if (Long.valueOf(fansLevelShowConfig.level) != null) {
                    FansLevelShowConfig fansLevelShowConfig2 = fansConfig.showConfig;
                    if (fansLevelShowConfig2 != null) {
                        LIZJ.put(Long.valueOf(fansLevelShowConfig2.level), fansLevelShowConfig2.badgeIcon);
                        LIZLLL.put(Long.valueOf(fansLevelShowConfig2.level), fansLevelShowConfig2.leftUpEntranceIcon);
                        if (!TextUtils.isEmpty(fansLevelShowConfig2.fontColorCode)) {
                            LJFF.put(Integer.valueOf((int) fansLevelShowConfig2.level), fansLevelShowConfig2.fontColorCode);
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (fansConfig != null) {
                }
            }
            FansUpgradeDynamicEffectConfig fansUpgradeDynamicEffectConfig = fansConfig.updateDynamicEffect;
            if (fansUpgradeDynamicEffectConfig != null && Integer.valueOf(fansUpgradeDynamicEffectConfig.level) != null) {
                List<Integer> list2 = LJ;
                FansUpgradeDynamicEffectConfig fansUpgradeDynamicEffectConfig2 = fansConfig.updateDynamicEffect;
                if (fansUpgradeDynamicEffectConfig2 != null) {
                    i = fansUpgradeDynamicEffectConfig2.level;
                } else {
                    i = 0;
                }
                ((ArrayList) list2).add(Integer.valueOf(i));
            }
        }
    }
}
