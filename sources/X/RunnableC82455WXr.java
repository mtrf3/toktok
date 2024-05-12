package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS56S0110000_14;
import kotlin.jvm.internal.AqS69S0110000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WXr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC82455WXr implements Runnable {
    public final /* synthetic */ C82454WXq LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public RunnableC82455WXr(C82454WXq c82454WXq, boolean z, boolean z2) {
        this.LJLIL = c82454WXq;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    public final void LIZ() {
        float width;
        float f;
        if (this.LJLIL.getSceneContext() == null) {
            return;
        }
        if (this.LJLILLLLZI) {
            if (this.LJLJI) {
                width = 3.0f;
            } else {
                ViewGroup viewGroup = this.LJLIL.LJLJJLL;
                if (viewGroup != null) {
                    width = viewGroup.getWidth();
                } else {
                    o.LJIJI("placeholderLayout");
                    throw null;
                }
            }
        } else {
            if (this.LJLIL.LJLLI != null) {
                width = r1.getWidth() * H7I.LIZ;
            } else {
                o.LJIJI("surfaceGroupOuter");
                throw null;
            }
        }
        C82454WXq c82454WXq = this.LJLIL;
        C1547165j c1547165j = c82454WXq.LJLJJI;
        if (c1547165j != null) {
            C82454WXq.LLJJIII(c82454WXq, c1547165j, width, c82454WXq.LJLLLL, c82454WXq.LJLLJ, (int) C74275TDb.LIZ(4.0f), 0.0f, 32);
            this.LJLIL.LLJJ(true);
            C82454WXq c82454WXq2 = this.LJLIL;
            ViewGroup viewGroup2 = c82454WXq2.LJLJJLL;
            if (viewGroup2 != null) {
                C82454WXq.LLJJIII(c82454WXq2, viewGroup2, width, c82454WXq2.LJLLLLLL, c82454WXq2.LJLLL, 0, 0.0f, 32);
                ViewGroup viewGroup3 = this.LJLIL.LJLJL;
                if (viewGroup3 != null) {
                    viewGroup3.setScaleX(1.0f);
                    ViewGroup viewGroup4 = this.LJLIL.LJLJL;
                    if (viewGroup4 != null) {
                        viewGroup4.setScaleY(1.0f);
                        ViewGroup viewGroup5 = this.LJLIL.LJLJJLL;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(0);
                            if (this.LJLILLLLZI) {
                                if (this.LJLJI) {
                                    if (this.LJLIL.LJLLI != null) {
                                        f = H7I.LIZ * r1.getWidth();
                                    } else {
                                        o.LJIJI("surfaceGroupOuter");
                                        throw null;
                                    }
                                } else {
                                    f = 3.0f;
                                }
                                C82454WXq c82454WXq3 = this.LJLIL;
                                ViewGroup viewGroup6 = c82454WXq3.LJLJJLL;
                                if (viewGroup6 != null) {
                                    C1547165j c1547165j2 = c82454WXq3.LJLJJI;
                                    if (c1547165j2 != null) {
                                        Context requireSceneContext = c82454WXq3.requireSceneContext();
                                        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                                        C144825mI.LIZ(viewGroup6, c1547165j2, f, requireSceneContext, 200L, null, null, false, new AqS56S0110000_14(this.LJLJI, this.LJLIL, 2), new AqS69S0110000_14(this.LJLJI, this.LJLIL, 0), 224);
                                        return;
                                    }
                                    o.LJIJI("innerBorder");
                                    throw null;
                                }
                                o.LJIJI("placeholderLayout");
                                throw null;
                            }
                            return;
                        }
                        o.LJIJI("placeholderLayout");
                        throw null;
                    }
                    o.LJIJI("placeholderContent");
                    throw null;
                }
                o.LJIJI("placeholderContent");
                throw null;
            }
            o.LJIJI("placeholderLayout");
            throw null;
        }
        o.LJIJI("innerBorder");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
