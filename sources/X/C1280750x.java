package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.50x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1280750x {
    public final int LIZ;
    public final int LIZIZ;
    public final EnumC123864ta LIZJ;
    public final List<NLETrackSlot> LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1280750x)) {
            return false;
        }
        C1280750x c1280750x = (C1280750x) obj;
        return this.LIZ == c1280750x.LIZ && this.LIZIZ == c1280750x.LIZIZ && this.LIZJ == c1280750x.LIZJ && o.LJ(this.LIZLLL, c1280750x.LIZLLL) && o.LJ(this.LJ, c1280750x.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZLLL, (this.LIZJ.hashCode() + (((this.LIZ * 31) + this.LIZIZ) * 31)) * 31, 31);
        String str = this.LJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackInfo(layer=");
        LIZ.append(this.LIZ);
        LIZ.append(", veLayer=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", trackType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", slotList=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", extraType=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public static C1280750x LIZ(C1280750x c1280750x, int i) {
        int i2 = c1280750x.LIZIZ;
        EnumC123864ta trackType = c1280750x.LIZJ;
        List<NLETrackSlot> slotList = c1280750x.LIZLLL;
        String str = c1280750x.LJ;
        c1280750x.getClass();
        o.LJIIIZ(trackType, "trackType");
        o.LJIIIZ(slotList, "slotList");
        return new C1280750x(i, i2, trackType, slotList, str);
    }

    public /* synthetic */ C1280750x(int i, int i2, EnumC123864ta enumC123864ta, List list) {
        this(i, i2, enumC123864ta, list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1280750x(int i, int i2, EnumC123864ta trackType, List<? extends NLETrackSlot> slotList, String str) {
        o.LJIIIZ(trackType, "trackType");
        o.LJIIIZ(slotList, "slotList");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = trackType;
        this.LIZLLL = slotList;
        this.LJ = str;
    }
}
