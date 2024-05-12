package X;

import android.media.VolumeProvider;
import android.os.Build;

/* renamed from: X.0dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12270dz {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public int LIZLLL;
    public VolumeProvider LJ;

    public final Object LIZ() {
        if (this.LJ == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                final int i = this.LIZ;
                final int i2 = this.LIZIZ;
                final int i3 = this.LIZLLL;
                final String str = this.LIZJ;
                this.LJ = new VolumeProvider(i, i2, i3, str) { // from class: X.0dv
                    @Override // android.media.VolumeProvider
                    public final void onAdjustVolume(int i4) {
                        AbstractC12270dz.this.LIZIZ(i4);
                    }

                    @Override // android.media.VolumeProvider
                    public final void onSetVolumeTo(int i4) {
                        AbstractC12270dz.this.LIZJ(i4);
                    }
                };
            } else {
                final int i4 = this.LIZ;
                final int i5 = this.LIZIZ;
                final int i6 = this.LIZLLL;
                this.LJ = new VolumeProvider(i4, i5, i6) { // from class: X.0dw
                    @Override // android.media.VolumeProvider
                    public final void onAdjustVolume(int i7) {
                        AbstractC12270dz.this.LIZIZ(i7);
                    }

                    @Override // android.media.VolumeProvider
                    public final void onSetVolumeTo(int i7) {
                        AbstractC12270dz.this.LIZJ(i7);
                    }
                };
            }
        }
        return this.LJ;
    }

    public abstract void LIZIZ(int i);

    public abstract void LIZJ(int i);

    public AbstractC12270dz(int i, int i2, int i3, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = i3;
        this.LIZJ = str;
    }
}
