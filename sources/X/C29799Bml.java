package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.api.privilege.GradeConfig;
import tikcast.api.privilege.GradeScoreRule;
import tikcast.api.privilege.GradeShowConfig;
import tikcast.api.privilege.UpgradeBarrageEffectConfig;
import tikcast.api.privilege.UpgradeEffectConfig;
import tikcast.api.privilege.UserGrade;

/* renamed from: X.Bml, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29799Bml {
    public static UserGrade LIZ;
    public static boolean LIZIZ;
    public static final java.util.Map<Integer, GradeScoreRule> LIZJ = new LinkedHashMap();
    public static final java.util.Map<Integer, Integer> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<Integer, ImageModel> LJ = new LinkedHashMap();
    public static final java.util.Map<Integer, String> LJFF = new LinkedHashMap();
    public static final List<Integer> LJI = new ArrayList();
    public static int LJII = 1;
    public static String LJIIIIZZ;

    static {
        String LIZ2 = C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale());
        o.LJIIIIZZ(LIZ2, "getWebcastLanguage(Servi…ss.java).currentLocale())");
        LJIIIIZZ = LIZ2;
    }

    public static void LIZ(List list) {
        int i;
        UpgradeEffectConfig upgradeEffectConfig;
        GradeScoreRule gradeScoreRule;
        if (!LIZIZ) {
            if (((!LIZJ.isEmpty()) && (!LIZLLL.isEmpty())) || list == null || list.isEmpty()) {
                return;
            }
            ((ArrayList) LJI).clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GradeConfig gradeConfig = (GradeConfig) it.next();
                Integer num = null;
                if (gradeConfig != null && (gradeScoreRule = gradeConfig.gradeScore) != null) {
                    num = Integer.valueOf(gradeScoreRule.grade);
                }
                if (num != null) {
                    GradeScoreRule gradeScoreRule2 = gradeConfig.gradeScore;
                    if (gradeScoreRule2 != null) {
                        LIZJ.put(Integer.valueOf(gradeScoreRule2.grade), gradeScoreRule2);
                        LJII = Math.max(LJII, gradeScoreRule2.grade);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (gradeConfig == null) {
                    continue;
                }
                UpgradeBarrageEffectConfig upgradeBarrageEffectConfig = gradeConfig.barrageEffect;
                if (upgradeBarrageEffectConfig != null) {
                    if (Integer.valueOf(upgradeBarrageEffectConfig.grade) != null) {
                        UpgradeBarrageEffectConfig upgradeBarrageEffectConfig2 = gradeConfig.barrageEffect;
                        if (upgradeBarrageEffectConfig2 != null) {
                            LIZLLL.put(Integer.valueOf(upgradeBarrageEffectConfig2.grade), Integer.valueOf(upgradeBarrageEffectConfig2.displayConfig));
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else if (gradeConfig == null) {
                        continue;
                    }
                }
                GradeShowConfig gradeShowConfig = gradeConfig.showConfig;
                if (gradeShowConfig != null) {
                    if (Integer.valueOf(gradeShowConfig.grade) != null) {
                        GradeShowConfig gradeShowConfig2 = gradeConfig.showConfig;
                        if (gradeShowConfig2 != null) {
                            LJ.put(Integer.valueOf(gradeShowConfig2.grade), gradeShowConfig2.badgeIconLite);
                            LJFF.put(Integer.valueOf(gradeShowConfig2.grade), gradeShowConfig2.avatarBorderColor);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else if (gradeConfig != null) {
                    }
                }
                UpgradeEffectConfig upgradeEffectConfig2 = gradeConfig.upgradeEffect;
                if (upgradeEffectConfig2 != null && Integer.valueOf(upgradeEffectConfig2.grade) != null) {
                    List<Integer> list2 = LJI;
                    if (gradeConfig != null && (upgradeEffectConfig = gradeConfig.upgradeEffect) != null) {
                        i = upgradeEffectConfig.grade;
                    } else {
                        i = 0;
                    }
                    ((ArrayList) list2).add(Integer.valueOf(i));
                }
            }
            if (!(!LIZJ.isEmpty()) || !(!LIZLLL.isEmpty())) {
                return;
            }
            LIZIZ = true;
        }
    }
}
