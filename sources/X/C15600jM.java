package X;

import Y.IDRunnableS85S0100000;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.0jM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15600jM {
    public C47061t0 LIZ;
    public C76857UEj LIZIZ;
    public String LIZJ;
    public long LJFF;
    public long LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public AnimatedDrawable2 LJIIIZ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LIZLLL = true;
    public int LJ = 1;
    public final Handler LJIIJ = new Handler(C16880lQ.LLJJJJ());

    public final void LIZJ() {
        this.LJIIIIZZ = 0;
        this.LJIIJJI = false;
        long j = this.LJI;
        if (j > 0) {
            this.LJIIJ.postDelayed(new IDRunnableS85S0100000(this, 88), j);
        }
        this.LJIIL = true;
    }

    public final void LIZ() {
        Boolean bool;
        if (this.LJIIL) {
            this.LJIIJJI = true;
            AnimatedDrawable2 animatedDrawable2 = this.LJIIIZ;
            if (animatedDrawable2 != null) {
                bool = Boolean.valueOf(animatedDrawable2.isRunning());
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                AnimatedDrawable2 animatedDrawable22 = this.LJIIIZ;
                if (animatedDrawable22 != null) {
                    animatedDrawable22.stop();
                }
            } else {
                C76857UEj c76857UEj = this.LIZIZ;
                if (c76857UEj != null) {
                    c76857UEj.LJIIL(this.LJIIIIZZ);
                }
            }
            AnimatedDrawable2 animatedDrawable23 = this.LJIIIZ;
            if (animatedDrawable23 != null) {
                animatedDrawable23.LJ(1);
            }
            this.LJIIJ.removeCallbacksAndMessages(null);
        }
        this.LJIIL = false;
    }

    public final void LIZIZ() {
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJII(this.LIZJ);
        LIZJ.LJIIJ = this.LIZLLL;
        LIZJ.LJII = new W4V<InterfaceC81599W0t>() { // from class: X.1mk
            @Override // X.W4V, X.W4Z
            public final void LJ(String str, Throwable th) {
                C76857UEj c76857UEj = C15600jM.this.LIZIZ;
                if (c76857UEj != null) {
                    c76857UEj.LJIIIIZZ();
                }
            }

            @Override // X.W4V, X.W4Z
            public final void LJFF(String id, Object obj, final Animatable animatable) {
                o.LJIIIZ(id, "id");
                if (!(animatable instanceof AnimatedDrawable2)) {
                    C76857UEj c76857UEj = C15600jM.this.LIZIZ;
                    if (c76857UEj != null) {
                        c76857UEj.LJIIIIZZ();
                        return;
                    }
                    return;
                }
                AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                C15600jM.this.LJIIIZ = animatedDrawable2;
                animatedDrawable2.LJFF(new C518821w(animatedDrawable2.LJLJI, 1));
                C15600jM.this.getClass();
                final C15600jM c15600jM = C15600jM.this;
                animatedDrawable2.LJI(new C78983UzD() { // from class: X.1mj
                    @Override // X.C78983UzD, X.InterfaceC81841WAb
                    public final void LIZ(AnimatedDrawable2 drawable) {
                        o.LJIIIZ(drawable, "drawable");
                        C15600jM c15600jM2 = C15600jM.this;
                        int i = c15600jM2.LJIIIIZZ + 1;
                        c15600jM2.LJIIIIZZ = i;
                        if (i == 1) {
                            C76857UEj c76857UEj2 = c15600jM2.LIZIZ;
                            if (c76857UEj2 != null) {
                                c76857UEj2.LJIIJJI(drawable);
                                return;
                            }
                            return;
                        }
                        C76857UEj c76857UEj3 = c15600jM2.LIZIZ;
                        if (c76857UEj3 == null) {
                            return;
                        }
                        c76857UEj3.LJIIJ();
                    }

                    @Override // X.C78983UzD, X.InterfaceC81841WAb
                    public final void LIZJ(AnimatedDrawable2 drawable) {
                        o.LJIIIZ(drawable, "drawable");
                        C15600jM c15600jM2 = C15600jM.this;
                        int i = c15600jM2.LJ;
                        if (i == -1 || c15600jM2.LJIIIIZZ < i) {
                            c15600jM2.LJIIJ.postDelayed(new IDRunnableS85S0100000(c15600jM2, 89), c15600jM2.LJFF);
                        }
                        C15600jM c15600jM3 = C15600jM.this;
                        int i2 = c15600jM3.LJ;
                        if ((i2 == -1 || c15600jM3.LJIIIIZZ < i2) && !c15600jM3.LJIIJJI) {
                            C76857UEj c76857UEj2 = c15600jM3.LIZIZ;
                            if (c76857UEj2 != null) {
                                c76857UEj2.LJIIIZ(animatable);
                                return;
                            }
                            return;
                        }
                        C76857UEj c76857UEj3 = c15600jM3.LIZIZ;
                        if (c76857UEj3 == null) {
                            return;
                        }
                        c76857UEj3.LJIIL(c15600jM3.LJIIIIZZ);
                    }

                    @Override // X.C78983UzD, X.InterfaceC81841WAb
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                        if (C15600jM.this.LIZIZ != null && animatedDrawable22 != null) {
                            animatedDrawable22.LIZJ();
                        }
                    }
                });
            }
        };
        W4R LIZ = LIZJ.LIZ();
        C47061t0 c47061t0 = this.LIZ;
        if (c47061t0 != null) {
            c47061t0.setController(LIZ);
            if (this.LJII) {
                c47061t0.getHierarchy().LJIILLIIL(0);
            }
        }
    }
}
