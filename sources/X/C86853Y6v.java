package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Y6v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86853Y6v {
    public Integer LIZ;
    public Integer LIZIZ;
    public C35755E1n LIZJ;
    public C86857Y6z LIZLLL;
    public C86856Y6y LJ;
    public Double LJFF;
    public Integer LJI;
    public Boolean LJII;

    public C86853Y6v() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86853Y6v)) {
            return false;
        }
        C86853Y6v c86853Y6v = (C86853Y6v) obj;
        return o.LJ(this.LIZ, c86853Y6v.LIZ) && o.LJ(this.LIZIZ, c86853Y6v.LIZIZ) && o.LJ(this.LIZJ, c86853Y6v.LIZJ) && o.LJ(this.LIZLLL, c86853Y6v.LIZLLL) && o.LJ(this.LJ, c86853Y6v.LJ) && o.LJ(this.LJFF, c86853Y6v.LJFF) && o.LJ(this.LJI, c86853Y6v.LJI) && o.LJ(this.LJII, c86853Y6v.LJII);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        C35755E1n c35755E1n = this.LIZJ;
        int hashCode3 = (hashCode2 + (c35755E1n == null ? 0 : c35755E1n.hashCode())) * 31;
        C86857Y6z c86857Y6z = this.LIZLLL;
        int hashCode4 = (hashCode3 + (c86857Y6z == null ? 0 : c86857Y6z.hashCode())) * 31;
        C86856Y6y c86856Y6y = this.LJ;
        int hashCode5 = (hashCode4 + (c86856Y6y == null ? 0 : c86856Y6y.hashCode())) * 31;
        Double d = this.LJFF;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.LJI;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.LJII;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceCloneResultModel(vopState=");
        LIZ.append(this.LIZ);
        LIZ.append(", quailtyResult=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", vopTextState=");
        LIZ.append(this.LIZJ);
        LIZ.append(", vopRecordingStatus=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", vopSpeakerInfo=");
        LIZ.append(this.LJ);
        LIZ.append(", playerProgress=");
        LIZ.append(this.LJFF);
        LIZ.append(", vopCode=");
        LIZ.append(this.LJI);
        LIZ.append(", isBlueToothConnected=");
        return C78920UyC.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C86853Y6v(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
    }
}
