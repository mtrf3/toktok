package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.playerkit.model.bright.BrightStrategy;
import com.ss.android.ugc.playerkit.model.bright.EnvBrightCondition;
import com.ss.android.ugc.playerkit.model.bright.EnvBrightStrategy;
import com.ss.android.ugc.playerkit.model.bright.ReportBrightStrategyKeys;
import com.ss.android.ugc.playerkit.model.bright.VideoConditions;
import com.ss.android.ugc.playerkit.model.bright.VideoTypeStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IZF {
    public float LIZ;
    public float LIZIZ;
    public java.util.Map<String, List<Integer>> LIZJ;
    public List<EnvBrightCondition> LIZLLL;
    public java.util.Map<String, List<VideoConditions>> LJ;
    public List<String> LJFF;
    public final java.util.Map<String, C46655ISt> LJI = new ConcurrentHashMap();
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public java.util.Map<String, List<Long>> LJIIJ;
    public java.util.Map<String, Boolean> LJIIJJI;
    public final List<String> LJIIL;
    public final float LJIILIIL;

    public static void LIZ() {
        Object value = IZ8.LLJI.getValue();
        o.LJIIIIZZ(value, "<get-PLAYER_ENABLE_BRIGHT_LOG>(...)");
        ((Boolean) value).booleanValue();
    }

    public IZF() {
        boolean z;
        this.LIZ = 255.0f;
        this.LIZIZ = 1.0f;
        new HashMap();
        new HashMap();
        new HandlerC46761IWv(C16880lQ.LLJJJJ());
        C46981IcD.LIZ();
        this.LJIIL = new ArrayList();
        this.LJIILIIL = -1.0f;
        Object value = IZ8.LLILZ.getValue();
        o.LJIIIIZZ(value, "<get-ENABLE_OBTAIN_MAX_BRIGHT_BY_REFLECT>(...)");
        if (((Boolean) value).booleanValue()) {
            int i = 255;
            try {
                try {
                    Resources system = Resources.getSystem();
                    int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android");
                    if (identifier != 0) {
                        i = system.getInteger(identifier);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("getMaxBrightness success, maxBrightness = ");
                        LIZ.append(i);
                        X1D.LIZIZ(LIZ);
                        LIZ();
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("getMaxBrightness resId not exist, use default value = ");
                        LIZ2.append(this.LIZ);
                        X1D.LIZIZ(LIZ2);
                        LIZ();
                    }
                } catch (Exception unused) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("getMaxBrightness error, use default value = ");
                    LIZ3.append(this.LIZ);
                    X1D.LIZIZ(LIZ3);
                    LIZ();
                }
            } finally {
                float f = i;
                this.LIZIZ = f / this.LIZ;
                this.LIZ = f;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("maxBrightness = ");
                LIZ4.append(this.LIZ);
                LIZ4.append(", brightScale = ");
                LIZ4.append(this.LIZIZ);
                X1D.LIZIZ(LIZ4);
                LIZ();
            }
        }
        Object value2 = IZ8.LLIZLLLIL.getValue();
        o.LJIIIIZZ(value2, "<get-PLAYER_ADJUST_BRIGHT_STRATEGY>(...)");
        this.LIZJ = ((BrightStrategy) value2).getStrategy();
        o.LJIIIIZZ(IZ8.LLIZ.getValue(), "<get-PLAYER_SCREEN_BRIGHT_STRATEGY>(...)");
        Object value3 = IZ8.LLILZIL.getValue();
        o.LJIIIIZZ(value3, "<get-PLAYER_ENV_BRIGHT_STRATEGY>(...)");
        this.LIZLLL = ((EnvBrightStrategy) value3).getStrategy();
        Object value4 = IZ8.LLILZLL.getValue();
        o.LJIIIIZZ(value4, "<get-PLAYER_VIDEO_TYPE_STRATEGY>(...)");
        this.LJ = ((VideoTypeStrategy) value4).getStrategy();
        Object value5 = IZ8.LLJ.getValue();
        o.LJIIIIZZ(value5, "<get-PLAYER_REPORT_BRIGH…A_FOR_STRATEGY_KEYS>(...)");
        this.LJFF = ((ReportBrightStrategyKeys) value5).getStrategy();
        Object value6 = IZ8.LLJILJIL.getValue();
        o.LJIIIIZZ(value6, "<get-ALLOW_ADJUST_MANUALLY_COUNT>(...)");
        this.LJII = ((Number) value6).intValue();
        Object value7 = IZ8.LLJILJILJ.getValue();
        o.LJIIIIZZ(value7, "<get-ALLOW_ADJUST_MANUALLY_COUNT_FOR_AUTO_0>(...)");
        this.LJIIIIZZ = ((Number) value7).intValue();
        Object value8 = IZ8.LLJILLL.getValue();
        o.LJIIIIZZ(value8, "<get-ALLOW_ADJUST_MANUALLY_COUNT_FOR_AUTO_1>(...)");
        this.LJIIIZ = ((Number) value8).intValue();
        Object value9 = IZ8.LLIILII.getValue();
        o.LJIIIIZZ(value9, "<get-isUseSystemAutoStatusForbidAdjust>(...)");
        if (((Boolean) value9).booleanValue()) {
            this.LJIIJ = new HashMap(2);
            this.LJIIJJI = new ConcurrentHashMap(2);
            ((HashMap) this.LJIIJ).put("auto0", new ArrayList(this.LJIIIIZZ));
            ((HashMap) this.LJIIJ).put("auto1", new ArrayList(this.LJIIIZ));
            java.util.Map<String, Boolean> map = this.LJIIJJI;
            Boolean bool = Boolean.FALSE;
            ((ConcurrentHashMap) map).put("auto1", bool);
            ((ConcurrentHashMap) this.LJIIJJI).put("auto0", bool);
        } else {
            List<EnvBrightCondition> list = this.LIZLLL;
            if (list != null && !list.isEmpty()) {
                this.LJIIJ = new HashMap(this.LIZLLL.size());
                this.LJIIJJI = new ConcurrentHashMap(this.LIZLLL.size());
                for (int i2 = 0; i2 < this.LIZLLL.size(); i2++) {
                    EnvBrightCondition envBrightCondition = (EnvBrightCondition) ListProtector.get(this.LIZLLL, i2);
                    ((HashMap) this.LJIIJ).put(envBrightCondition.getName(), new ArrayList(this.LJII));
                    ((ConcurrentHashMap) this.LJIIJJI).put(envBrightCondition.getName(), Boolean.FALSE);
                }
            }
        }
        Object value10 = IZ8.LLILLL.getValue();
        o.LJIIIIZZ(value10, "<get-ADJUST_BRIGHT_STRATEGY_VERSION>(...)");
        String str = (String) value10;
        Application application = C46982IcE.LIZ;
        if (application != null) {
            SharedPreferences LIZIZ = F9J.LIZIZ(application, 0, "video_bright_adjust");
            String string = LIZIZ.getString("bright_adjust_version", "0.0.0");
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("compareStrategyVersion, newVersion = ");
            LIZ5.append(str);
            LIZ5.append(", oldVersion = ");
            LIZ5.append(string);
            X1D.LIZIZ(LIZ5);
            LIZ();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string)) {
                String[] split = str.split("\\.");
                String[] split2 = string.split("\\.");
                if (split.length != split2.length) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("version length not equals , check libra config. newVersion length = ");
                    LIZ6.append(split.length);
                    LIZ6.append(", oldVersion length = ");
                    LIZ6.append(split2.length);
                    X1D.LIZIZ(LIZ6);
                    LIZ();
                } else {
                    int length = split.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (CastIntegerProtector.parseInt(split[i3]) > CastIntegerProtector.parseInt(split2[i3])) {
                            z = true;
                            break;
                        } else {
                            if (CastIntegerProtector.parseInt(split[i3]) < CastIntegerProtector.parseInt(split2[i3])) {
                                break;
                            }
                        }
                    }
                }
            }
            z = false;
            if (z) {
                LIZ();
                SharedPreferences.Editor edit = LIZIZ.edit();
                List<EnvBrightCondition> list2 = this.LIZLLL;
                if (list2 != null && !list2.isEmpty()) {
                    for (int i4 = 0; i4 < this.LIZLLL.size(); i4++) {
                        String name = ((EnvBrightCondition) ListProtector.get(this.LIZLLL, i4)).getName();
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("bright_adjust_manually_time_");
                        LIZ7.append(name);
                        edit.putLong(X1D.LIZIZ(LIZ7), -1L);
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append("bright_adjust_manually_forbid_");
                        LIZ8.append(name);
                        edit.putBoolean(X1D.LIZIZ(LIZ8), false);
                    }
                }
                edit.putLong("bright_adjust_manually_time_auto0", -1L);
                edit.putLong("bright_adjust_manually_time_auto1", -1L);
                edit.putBoolean("bright_adjust_manually_forbid_auto0", false);
                edit.putBoolean("bright_adjust_manually_forbid_auto1", false);
                edit.putString("bright_adjust_version", str);
                edit.apply();
            } else {
                Object value11 = IZ8.LLIILII.getValue();
                o.LJIIIIZZ(value11, "<get-isUseSystemAutoStatusForbidAdjust>(...)");
                if (((Boolean) value11).booleanValue()) {
                    boolean z2 = LIZIZ.getBoolean("bright_adjust_manually_forbid_auto0", false);
                    ((ConcurrentHashMap) this.LJIIJJI).put("auto0", Boolean.valueOf(z2));
                    if (z2) {
                        ((ArrayList) this.LJIIL).add("auto0");
                    }
                    boolean z3 = LIZIZ.getBoolean("bright_adjust_manually_forbid_auto1", false);
                    ((ConcurrentHashMap) this.LJIIJJI).put("auto1", Boolean.valueOf(z3));
                    if (z3) {
                        ((ArrayList) this.LJIIL).add("auto1");
                    }
                } else {
                    List<EnvBrightCondition> list3 = this.LIZLLL;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i5 = 0; i5 < this.LIZLLL.size(); i5++) {
                            String name2 = ((EnvBrightCondition) ListProtector.get(this.LIZLLL, i5)).getName();
                            StringBuilder LIZ9 = X1D.LIZ();
                            LIZ9.append("bright_adjust_manually_forbid_");
                            LIZ9.append(name2);
                            boolean z4 = LIZIZ.getBoolean(X1D.LIZIZ(LIZ9), false);
                            ((ConcurrentHashMap) this.LJIIJJI).put(name2, Boolean.valueOf(z4));
                            if (z4) {
                                ((ArrayList) this.LJIIL).add(name2);
                            }
                        }
                    }
                }
            }
        }
        java.util.Map<String, Boolean> map2 = this.LJIIJJI;
        if (map2 != null) {
            for (Map.Entry entry : ((ConcurrentHashMap) map2).entrySet()) {
                StringBuilder LIZ10 = X1D.LIZ();
                LIZ10.append("forbid strategy env = ");
                LIZ10.append((String) entry.getKey());
                LIZ10.append(", value = ");
                LIZ10.append(entry.getValue());
                X1D.LIZIZ(LIZ10);
                LIZ();
            }
        }
        if (C46982IcE.LIZ != null) {
            Object value12 = IZ8.LLIIIZ.getValue();
            o.LJIIIIZZ(value12, "<get-ENABLE_ADJUST_BRIGHT_STRATEGY>(...)");
            if (((Boolean) value12).booleanValue()) {
                C46982IcE.LIZ.registerActivityLifecycleCallbacks(new IUV(this));
                return;
            }
        }
        LIZ();
    }
}
