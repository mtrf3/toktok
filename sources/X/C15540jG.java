package X;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0jG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15540jG {
    public C47061t0 LIZ;
    public C31073CHl LJ;
    public int LJII;
    public boolean LJIIJ;
    public Animatable LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public InterfaceC81599W0t LJIILJJIL;
    public boolean LJIILL;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public boolean LJFF = true;
    public int LJI = 1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;

    public final void LIZ() {
        Animatable animatable = this.LJIIJJI;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void LJ() {
        Animatable animatable = this.LJIIJJI;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.W5O, REQUEST] */
    public final void LIZIZ() {
        final long nanoTime = System.nanoTime();
        if (!TextUtils.isEmpty(this.LIZIZ) && !TextUtils.isEmpty(this.LIZJ)) {
            List<String> LJIIJ = C15510jD.LJIIJ(this.LIZIZ, this.LIZJ);
            if (!LJIIJ.isEmpty()) {
                this.LIZLLL = (String) ListProtector.get(LJIIJ, 0);
            }
        }
        if (TextUtils.isEmpty(this.LIZLLL)) {
            C15440j6.LIZJ(nanoTime, "", "filePath is null", false);
            return;
        }
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(this.LIZLLL));
        LIZLLL.LIZLLL = V85.LJ;
        if (this.LJIILL) {
            LIZLLL.LJII = true;
        }
        ?? LIZ = LIZLLL.LIZ();
        if (LIZ == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LIZLLL = LIZ;
        LIZJ.LJIIJ = this.LJFF;
        LIZJ.LJII = new W4V<InterfaceC81599W0t>() { // from class: X.1mh
            @Override // X.W4V, X.W4Z
            public final void LJ(String str, Throwable th) {
                C0NB.LIZIZ("GuideAnim", "onFail");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("GeckoWebpController.onFailure,channel:");
                LIZ2.append(C15540jG.this.LIZIZ);
                LIZ2.append(",fileName:");
                LIZ2.append(C15540jG.this.LIZJ);
                LIZ2.append(",filePath:");
                LIZ2.append(C15540jG.this.LIZLLL);
                LIZ2.append(",throwable:");
                LIZ2.append(th);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                C15540jG c15540jG = C15540jG.this;
                C15440j6.LIZIZ(nanoTime, c15540jG.LIZLLL, c15540jG.LIZIZ, c15540jG.LIZJ, LIZIZ, false);
            }

            @Override // X.W4V, X.W4Z
            public final void LJFF(String id, Object obj, Animatable animatable) {
                WAA waa;
                InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
                o.LJIIIZ(id, "id");
                C0NB.LIZIZ("GuideAnim", "onFinal");
                if (!(animatable instanceof AnimatedDrawable2)) {
                    C0NB.LIZIZ("GuideAnim", "is not Animatable2");
                    return;
                }
                C15540jG c15540jG = C15540jG.this;
                c15540jG.LJIILJJIL = interfaceC81599W0t;
                c15540jG.LJIIJJI = animatable;
                int i = c15540jG.LJI;
                if (i >= 1) {
                    AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                    animatedDrawable2.LJFF(new C518821w(animatedDrawable2.LJLJI, i));
                } else if (c15540jG.LJIIIIZZ > 0) {
                    AnimatedDrawable2 animatedDrawable22 = (AnimatedDrawable2) animatable;
                    long LIZLLL2 = animatedDrawable22.LIZLLL();
                    C15540jG c15540jG2 = C15540jG.this;
                    int i2 = (int) (((c15540jG2.LJIIIIZZ + LIZLLL2) - 1) / LIZLLL2);
                    c15540jG2.LJI = i2;
                    animatedDrawable22.LJFF(new C518821w(animatedDrawable22.LJLJI, i2));
                }
                C31073CHl c31073CHl = C15540jG.this.LJ;
                if (c31073CHl != null) {
                    c31073CHl.LJFF();
                }
                if (C15540jG.this.LJIIL) {
                    AnimatedDrawable2 animatedDrawable23 = (AnimatedDrawable2) animatable;
                    if (!C81796W8i.LIZIZ(animatedDrawable23.LJLJJLL) && (waa = animatedDrawable23.LJLJI) != null) {
                        animatedDrawable23.LJLJJI = new V9F(waa);
                    }
                }
                final C15540jG c15540jG3 = C15540jG.this;
                ((AnimatedDrawable2) animatable).LJI(new C78983UzD() { // from class: X.1mi
                    @Override // X.C78983UzD, X.InterfaceC81841WAb
                    public final void LIZ(AnimatedDrawable2 drawable) {
                        o.LJIIIZ(drawable, "drawable");
                        C15540jG c15540jG4 = C15540jG.this;
                        c15540jG4.LJII = 0;
                        c15540jG4.LJIIIZ = System.currentTimeMillis();
                        C31073CHl c31073CHl2 = C15540jG.this.LJ;
                        if (c31073CHl2 != null) {
                            c31073CHl2.LJI(drawable);
                        }
                    }

                    @Override // X.C78983UzD, X.InterfaceC81841WAb
                    public final void LIZIZ(AnimatedDrawable2 animatedDrawable24) {
                        C15540jG c15540jG4 = C15540jG.this;
                        int i3 = c15540jG4.LJII + 1;
                        c15540jG4.LJII = i3;
                        if (i3 >= c15540jG4.LJI && animatedDrawable24 != null) {
                            animatedDrawable24.stop();
                        }
                    }

                    @Override // X.C78983UzD, X.InterfaceC81841WAb
                    public final void LIZJ(AnimatedDrawable2 drawable) {
                        o.LJIIIZ(drawable, "drawable");
                        C31073CHl c31073CHl2 = C15540jG.this.LJ;
                        if (c31073CHl2 != null) {
                            c31073CHl2.LJII(drawable);
                        }
                    }

                    @Override // X.C78983UzD, X.InterfaceC81841WAb
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable24, int i3) {
                        int i4;
                        C31073CHl c31073CHl2 = C15540jG.this.LJ;
                        if (c31073CHl2 != null) {
                            if (animatedDrawable24 != null) {
                                i4 = animatedDrawable24.LIZJ();
                            } else {
                                i4 = 0;
                            }
                            c31073CHl2.LJ(i3, i4);
                        }
                        if (C15540jG.this.LJIIIIZZ > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            C15540jG c15540jG4 = C15540jG.this;
                            if (currentTimeMillis - c15540jG4.LJIIIZ >= c15540jG4.LJIIIIZZ && !c15540jG4.LJIIJ && animatedDrawable24 != null) {
                                animatedDrawable24.stop();
                            }
                        }
                    }
                });
                C15540jG c15540jG4 = C15540jG.this;
                C15440j6.LIZIZ(nanoTime, c15540jG4.LIZLLL, c15540jG4.LIZIZ, c15540jG4.LIZJ, "", true);
            }
        };
        W4R LIZ2 = LIZJ.LIZ();
        C47061t0 c47061t0 = this.LIZ;
        if (c47061t0 != null) {
            c47061t0.setController(LIZ2);
            if (this.LJIILIIL) {
                c47061t0.getHierarchy().LJIILLIIL(0);
            }
        }
    }

    public final void LIZJ(String fileName) {
        o.LJIIIZ(fileName, "fileName");
        this.LIZJ = fileName;
    }

    public final void LIZLLL(C47061t0 draweeView) {
        o.LJIIIZ(draweeView, "draweeView");
        this.LIZ = draweeView;
    }
}
