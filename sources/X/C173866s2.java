package X;

import com.ss.android.ttve.vealgorithm.params.VEAlgorithmParam;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.6s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173866s2 extends VEAlgorithmParam {
    public final String LIZ;
    public final C173856s1 LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C173866s2) {
            return C78966Uyw.LJIIIZ(((C173866s2) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("DynamicLightWaveParams:%s,%s", LIZ());
    }

    public C173866s2() {
        this("", new C173856s1(0));
    }

    public C173866s2(String sourcePath, C173856s1 videoMetaDataInfo) {
        o.LJIIIZ(sourcePath, "sourcePath");
        o.LJIIIZ(videoMetaDataInfo, "videoMetaDataInfo");
        this.LIZ = sourcePath;
        this.LIZIZ = videoMetaDataInfo;
    }
}
