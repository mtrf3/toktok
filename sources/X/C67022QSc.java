package X;

import org.json.JSONObject;

/* renamed from: X.QSc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67022QSc {
    public String LIZ;
    public String LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public String LJ;
    public int LJFF;
    public String LJI;
    public JSONObject LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Action{sdkName='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", sdkVersion='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", launchSequence=");
        LIZ.append(this.LIZJ);
        LIZ.append(", actionId='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", message='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", result=");
        LIZ.append(this.LJFF);
        LIZ.append(", timeStamp='");
        Q89.LIZIZ(LIZ, this.LJI, '\'', ", extra=");
        LIZ.append(this.LJII);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C67022QSc(int i) {
        this.LIZJ = i;
    }
}
