package com.google.android.play.core.appupdate;

import android.app.PendingIntent;

/* loaded from: classes7.dex */
public abstract class a {
    public abstract int LIZ();

    public abstract long LIZIZ();

    public abstract long LIZJ();

    public abstract long LIZLLL();

    public abstract Integer LJ();

    public abstract PendingIntent LJFF();

    public abstract PendingIntent LJI();

    public abstract PendingIntent LJII();

    public abstract PendingIntent LJIIIIZZ();

    public abstract int LJIIJ();

    public abstract String LJIIJJI();

    public abstract long LJIIL();

    public abstract int LJIILIIL();

    public abstract int LJIILJJIL();

    public final PendingIntent LJIIIZ(t tVar) {
        int i = tVar.LIZ;
        if (i == 0) {
            if (LJI() != null) {
                return LJI();
            }
            if (!tVar.LIZIZ || LIZIZ() > LIZLLL()) {
                return null;
            }
            return LJIIIIZZ();
        }
        if (i == 1) {
            if (LJFF() != null) {
                return LJFF();
            }
            if (tVar.LIZIZ && LIZIZ() <= LIZLLL()) {
                return LJII();
            }
        }
        return null;
    }
}
