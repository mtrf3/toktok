package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.50l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1279550l {
    public final boolean LIZ;
    public final NLETrack LIZIZ;
    public final NLETrackSlot LIZJ;
    public final Integer LIZLLL;
    public final EnumC127354zD LJ;
    public final EnumC1280050q LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279550l)) {
            return false;
        }
        C1279550l c1279550l = (C1279550l) obj;
        return this.LIZ == c1279550l.LIZ && o.LJ(this.LIZIZ, c1279550l.LIZIZ) && o.LJ(this.LIZJ, c1279550l.LIZJ) && o.LJ(this.LIZLLL, c1279550l.LIZLLL) && this.LJ == c1279550l.LJ && this.LJFF == c1279550l.LJFF && this.LJI == c1279550l.LJI && this.LJII == c1279550l.LJII && this.LJIIIIZZ == c1279550l.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        NLETrack nLETrack = this.LIZIZ;
        int hashCode = (i + (nLETrack == null ? 0 : nLETrack.hashCode())) * 31;
        NLETrackSlot nLETrackSlot = this.LIZJ;
        int hashCode2 = (hashCode + (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode3 = (this.LJFF.hashCode() + ((this.LJ.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31)) * 31;
        ?? r02 = this.LJI;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode3 + i2) * 31;
        ?? r03 = this.LJII;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        return ((i3 + i4) * 31) + (this.LJIIIIZZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackPanelSelectState(updateMainTrack=");
        LIZ.append(this.LIZ);
        LIZ.append(", track=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", slot=");
        LIZ.append(this.LIZJ);
        LIZ.append(", selectIndex=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", editType=");
        LIZ.append(this.LJ);
        LIZ.append(", selectType=");
        LIZ.append(this.LJFF);
        LIZ.append(", autoSeek=");
        LIZ.append(this.LJI);
        LIZ.append(", useAlphaAnim=");
        LIZ.append(this.LJII);
        LIZ.append(", isDragMode=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public static C1279550l LIZ(C1279550l c1279550l, EnumC127354zD enumC127354zD, EnumC1280050q enumC1280050q, int i) {
        boolean z;
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        boolean z2;
        boolean z3;
        boolean z4;
        EnumC1280050q selectType = enumC1280050q;
        EnumC127354zD editType = enumC127354zD;
        if ((i & 1) != 0) {
            z = c1279550l.LIZ;
        } else {
            z = false;
        }
        Integer num = null;
        if ((i & 2) != 0) {
            nLETrack = c1279550l.LIZIZ;
        } else {
            nLETrack = null;
        }
        if ((i & 4) != 0) {
            nLETrackSlot = c1279550l.LIZJ;
        } else {
            nLETrackSlot = null;
        }
        if ((i & 8) != 0) {
            num = c1279550l.LIZLLL;
        }
        if ((i & 16) != 0) {
            editType = c1279550l.LJ;
        }
        if ((i & 32) != 0) {
            selectType = c1279550l.LJFF;
        }
        if ((i & 64) != 0) {
            z2 = c1279550l.LJI;
        } else {
            z2 = false;
        }
        if ((i & 128) != 0) {
            z3 = c1279550l.LJII;
        } else {
            z3 = false;
        }
        if ((i & 256) != 0) {
            z4 = c1279550l.LJIIIIZZ;
        } else {
            z4 = false;
        }
        o.LJIIIZ(editType, "editType");
        o.LJIIIZ(selectType, "selectType");
        return new C1279550l(z, nLETrack, nLETrackSlot, num, editType, selectType, z2, z3, z4);
    }

    public C1279550l(boolean z, NLETrack nLETrack, NLETrackSlot nLETrackSlot, Integer num, EnumC127354zD editType, EnumC1280050q selectType, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(editType, "editType");
        o.LJIIIZ(selectType, "selectType");
        this.LIZ = z;
        this.LIZIZ = nLETrack;
        this.LIZJ = nLETrackSlot;
        this.LIZLLL = num;
        this.LJ = editType;
        this.LJFF = selectType;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
    }

    public /* synthetic */ C1279550l(boolean z, NLETrack nLETrack, NLETrackSlot nLETrackSlot, Integer num, EnumC127354zD enumC127354zD, EnumC1280050q enumC1280050q, boolean z2, boolean z3, boolean z4, int i) {
        this(z, (i & 2) != 0 ? null : nLETrack, (i & 4) != 0 ? null : nLETrackSlot, (i & 8) == 0 ? num : null, (i & 16) != 0 ? EnumC127354zD.NONE : enumC127354zD, (i & 32) != 0 ? EnumC1280050q.NORMAL : enumC1280050q, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4);
    }
}
