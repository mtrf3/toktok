package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import X.InterfaceC46949Ibh;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class GearConfig implements InterfaceC46949Ibh {

    @InterfaceC65349Pkn("bitrate_range")
    public List<Double> bitrateRange;

    @InterfaceC65349Pkn("default_bitrate")
    public double defaultBitrate;

    @InterfaceC65349Pkn("default_gear_name")
    public String defaultGearName;

    @InterfaceC65349Pkn("gear_group")
    public Set<String> gearGroup;

    @Override // X.InterfaceC46949Ibh
    public final Pair<Double, Double> LIZLLL() {
        List<Double> list = this.bitrateRange;
        if (list != null && list.size() == 2) {
            return new Pair<>(ListProtector.get(this.bitrateRange, 0), ListProtector.get(this.bitrateRange, 1));
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GearConfig{defaultGearName='");
        Q89.LIZIZ(LIZ, this.defaultGearName, '\'', ", gearGroup=");
        LIZ.append(this.gearGroup);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC46949Ibh
    public final Set<String> LIZ() {
        return this.gearGroup;
    }

    @Override // X.InterfaceC46949Ibh
    public final String LIZIZ() {
        return this.defaultGearName;
    }

    @Override // X.InterfaceC46949Ibh
    public final double LIZJ() {
        return this.defaultBitrate;
    }
}
