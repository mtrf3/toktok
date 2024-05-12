package X;

/* loaded from: classes15.dex */
public final class VY9 {
    public final VY6 LIZ;
    public final /* synthetic */ VY8 LIZIZ;

    public VY9(VY8 vy8) {
        this.LIZIZ = vy8;
        VY6 vy6 = new VY6(vy8.getContext(), vy8.LLD);
        float scaleRuler = vy6.getScaleRuler();
        long j = vy8.getRulerLevel().LIZIZ;
        vy6.LJLJJI = scaleRuler;
        vy6.LJLJJL = j;
        vy6.LIZJ();
        vy6.invalidate();
        this.LIZ = vy6;
        vy8.addView(vy6);
    }
}
