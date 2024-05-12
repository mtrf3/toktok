package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VQUIInfo extends F9E {
    public final String compileResolution;
    public final List<String> segmentResolution;
    public final boolean shouldEncode;
    public final String sourceResolution;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VQUIInfo copy$default(VQUIInfo vQUIInfo, String str, String str2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vQUIInfo.sourceResolution;
        }
        if ((i & 2) != 0) {
            str2 = vQUIInfo.compileResolution;
        }
        if ((i & 4) != 0) {
            z = vQUIInfo.shouldEncode;
        }
        if ((i & 8) != 0) {
            list = vQUIInfo.segmentResolution;
        }
        return vQUIInfo.copy(str, str2, z, list);
    }

    public final VQUIInfo copy(String sourceResolution, String compileResolution, boolean z, List<String> segmentResolution) {
        o.LJIIIZ(sourceResolution, "sourceResolution");
        o.LJIIIZ(compileResolution, "compileResolution");
        o.LJIIIZ(segmentResolution, "segmentResolution");
        return new VQUIInfo(sourceResolution, compileResolution, z, segmentResolution);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.sourceResolution, this.compileResolution, Boolean.valueOf(this.shouldEncode), this.segmentResolution};
    }

    public VQUIInfo(String sourceResolution, String compileResolution, boolean z, List<String> segmentResolution) {
        o.LJIIIZ(sourceResolution, "sourceResolution");
        o.LJIIIZ(compileResolution, "compileResolution");
        o.LJIIIZ(segmentResolution, "segmentResolution");
        this.sourceResolution = sourceResolution;
        this.compileResolution = compileResolution;
        this.shouldEncode = z;
        this.segmentResolution = segmentResolution;
    }
}
