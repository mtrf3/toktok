package X;

import android.widget.ImageView;

/* renamed from: X.VoR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80863VoR {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public double LIZLLL;
    public ImageView LJ;
    public final C80864VoS LJFF;
    public final C80864VoS LJI;
    public final int[] LJII = new int[2];
    public final float[] LJIIIIZZ = new float[2];
    public final int[] LJIIIZ = new int[3];
    public final float[] LJIIJ = new float[3];

    public final double LIZ() {
        return this.LIZLLL * 0.55f;
    }

    public final void LIZIZ(int i) {
        ImageView imageView;
        ImageView imageView2 = this.LJ;
        if (imageView2 != null && imageView2.getVisibility() == 0 && (imageView = this.LJ) != null) {
            imageView.setColorFilter(i);
        }
    }

    public C80863VoR(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LJFF = new C80864VoS(i, i2);
        this.LJI = new C80864VoS(i2, i3);
    }
}
