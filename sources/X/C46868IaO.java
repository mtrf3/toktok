package X;

import com.ss.android.ugc.playerkit.model.BitrateSelectRecordConfig;
import com.ss.android.ugc.playerkit.model.PlayListWiseBitrateSelectConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.IaO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46868IaO {
    public static final PlayListWiseBitrateSelectConfig LIZ = (PlayListWiseBitrateSelectConfig) IZ8.LJJLIIIJLLLLLLLZ.getValue();
    public static final BitrateSelectRecordConfig LIZIZ = (BitrateSelectRecordConfig) IZ8.LJJLIIJ.getValue();
    public static final EnumC46870IaQ LIZJ;

    static {
        EnumC46870IaQ enumC46870IaQ;
        C46879IaZ c46879IaZ = EnumC46870IaQ.Companion;
        Integer bandwidthFactorCacheConfig = (Integer) IZ8.LJJLIL.getValue();
        o.LJIIIIZZ(bandwidthFactorCacheConfig, "bandwidthFactorCacheConfig");
        int intValue = bandwidthFactorCacheConfig.intValue();
        c46879IaZ.getClass();
        if (intValue != 1) {
            if (intValue != 2) {
                enumC46870IaQ = EnumC46870IaQ.FromMemory;
            } else {
                enumC46870IaQ = EnumC46870IaQ.FirstMemoryThenDisk;
            }
        } else {
            enumC46870IaQ = EnumC46870IaQ.FromDisk;
        }
        LIZJ = enumC46870IaQ;
    }
}
