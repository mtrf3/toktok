package X;

/* loaded from: classes15.dex */
public class VRR {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;

    public final void LIZ(int i) {
        this.LIZLLL = ((i >> 24) & 255) / 255.0f;
        this.LIZ = ((i >> 16) & 255) / 255.0f;
        this.LIZIZ = ((i >> 8) & 255) / 255.0f;
        this.LIZJ = (i & 255) / 255.0f;
    }
}
