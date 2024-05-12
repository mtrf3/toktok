package X;

import com.bytedance.ies.nle.editor_jni.NLEPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C122004qa {
    public String LIZ;
    public String LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public float LJI;
    public double LJII;
    public float LJIIIIZZ;
    public boolean LJIIIZ;
    public List<NLEPoint> LJIIJ;
    public String LJIIJJI;
    public final List<C122014qb> LJIIL;
    public final EnumC122254qz LJIILIIL;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioParams(type=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", filePath=");
        LIZ.append(this.LIZ);
        LIZ.append(", uuid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", timeClipStart=");
        LIZ.append(this.LIZJ);
        LIZ.append(", timeClipEnd=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", startTime=");
        LIZ.append(this.LJ);
        LIZ.append(", endTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", volume=");
        LIZ.append(this.LJI);
        LIZ.append(", dbRange=");
        LIZ.append(this.LJII);
        LIZ.append(", speed=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", filterList=");
        return C1NE.LIZIZ(LIZ, this.LJIIL, ')', LIZ);
    }

    public C122004qa(EnumC122254qz type) {
        o.LJIIIZ(type, "type");
        this.LJIILIIL = type;
        this.LJFF = -2L;
        this.LJI = 1.0f;
        this.LJIIIIZZ = 1.0f;
        this.LJIIL = new ArrayList();
    }
}
