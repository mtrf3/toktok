package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.4Va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110424Va extends C3UY {
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final String LJI;
    public final int LJII;

    public final Object[] LIZ() {
        return new Object[]{this.LIZLLL, Long.valueOf(this.LJ), Long.valueOf(this.LJFF), this.LJI, Integer.valueOf(this.LJII)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C110424Va) {
            return C78966Uyw.LJIIIZ(((C110424Va) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("EnterGroupChatSharePanelEventBody:%s,%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C110424Va(int i, long j, long j2, String scene, String isNetworkSuccess) {
        super(C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, scene), new OSZ("is_network_success", isNetworkSuccess)), C113554cx.LJJL(new OSZ("network_time_cost", Long.valueOf(j)), new OSZ("share_config_time_cost", Long.valueOf(j2)), new OSZ("retry_times", Integer.valueOf(i))), null, 4);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(isNetworkSuccess, "isNetworkSuccess");
        this.LIZLLL = scene;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = isNetworkSuccess;
        this.LJII = i;
    }
}
