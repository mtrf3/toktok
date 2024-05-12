package X;

import com.google.gson.j;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class PTD {
    public String[] LIZ;
    public String LIZIZ;
    public String LIZJ;
    public j LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConfItem{stackFeatures=");
        LIZ.append(Arrays.toString(this.LIZ));
        LIZ.append(", protectorType='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", returnType='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", returnValue='");
        LIZ.append(this.LIZLLL);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
