package X;

import com.google.gson.j;
import com.ss.android.ugc.aweme.playerkit.configpicker.MultiDimensionalConditionConfig;
import java.util.List;

/* loaded from: classes15.dex */
public final class VH6 {
    public final String LIZ;
    public final java.util.Map<String, List<String>> LIZIZ;
    public final java.util.Map<String, List<String>> LIZJ;
    public final j LIZLLL;
    public String LJ;

    public final int LIZ() {
        int size;
        java.util.Map<String, List<String>> map = this.LIZIZ;
        int i = 0;
        if (map == null) {
            size = 0;
        } else {
            size = map.size();
        }
        java.util.Map<String, List<String>> map2 = this.LIZJ;
        if (map2 != null) {
            i = map2.size();
        }
        return size + i;
    }

    public VH6(MultiDimensionalConditionConfig.ConditionConfig conditionConfig) {
        this.LIZ = conditionConfig.configId;
        this.LIZIZ = conditionConfig.clientFilterRequirement;
        this.LIZJ = conditionConfig.serverFilterRequirement;
        this.LIZLLL = conditionConfig.configContent;
    }
}
