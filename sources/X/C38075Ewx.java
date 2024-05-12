package X;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.Ewx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38075Ewx {
    public Pattern LIZ;
    public EnumC38078Ex0 LIZIZ;
    public List<String> LIZJ;
    public List<String> LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteConfig{pattern=");
        LIZ.append(this.LIZ);
        LIZ.append(", permissionGroup=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", includedMethods=");
        LIZ.append(this.LIZJ);
        LIZ.append(", excludedMethods=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, '}', LIZ);
    }
}
