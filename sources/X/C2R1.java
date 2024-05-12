package X;

import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2R1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2R1 {
    public final List<BannerPanelItem> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2R1)) {
            return false;
        }
        C2R1 c2r1 = (C2R1) obj;
        return o.LJ(this.LIZ, c2r1.LIZ) && o.LJ(this.LIZIZ, c2r1.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BannerPanelOpenEvent(panelList=");
        LIZ.append(this.LIZ);
        LIZ.append(", focusId=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C2R1(List<BannerPanelItem> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
