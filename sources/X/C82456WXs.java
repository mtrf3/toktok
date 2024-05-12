package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.WXs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82456WXs implements WY6 {
    public final /* synthetic */ C82454WXq LIZ;

    @Override // X.WY6
    public final boolean LJJJLZIJ() {
        SmartImageView smartImageView = this.LIZ.LJLIL;
        if (smartImageView != null) {
            if (smartImageView.getVisibility() == 0) {
                return true;
            }
            return false;
        }
        o.LJIJI("ivOuter");
        throw null;
    }

    public C82456WXs(C82454WXq c82454WXq) {
        this.LIZ = c82454WXq;
    }

    @Override // X.WY6
    public final void LJJJLL(View v) {
        o.LJIIIZ(v, "v");
        this.LIZ.getUiActions().LJLJJI.invoke();
    }

    @Override // X.WY6
    public final void LJIJ(float f, View v) {
        int width;
        int width2;
        o.LJIIIZ(v, "v");
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.LIZ.LJLL;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
            ViewGroup viewGroup2 = this.LIZ.LJLL;
            if (viewGroup2 != null) {
                boolean z = false;
                int width3 = (viewGroup2.getWidth() / 2) + iArr[0];
                ViewGroup viewGroup3 = this.LIZ.LJLL;
                if (viewGroup3 != null) {
                    float x = viewGroup3.getX();
                    if (f <= width3 && x <= f) {
                        z = true;
                    }
                    C82454WXq c82454WXq = this.LIZ;
                    int i = c82454WXq.LJLLL;
                    if (z) {
                        width = i;
                    } else {
                        ViewGroup viewGroup4 = c82454WXq.LJLL;
                        if (viewGroup4 != null) {
                            int width4 = viewGroup4.getWidth() - i;
                            SmartImageView smartImageView = c82454WXq.LJLILLLLZI;
                            if (smartImageView != null) {
                                width = width4 - smartImageView.getWidth();
                            } else {
                                o.LJIJI("ivInner");
                                throw null;
                            }
                        } else {
                            o.LJIJI("nowsContainer");
                            throw null;
                        }
                    }
                    SmartImageView smartImageView2 = c82454WXq.LJLILLLLZI;
                    if (smartImageView2 != null) {
                        smartImageView2.animate().x(width).y(i).setDuration(300L).setInterpolator(C55953Lxd.LJ()).start();
                        if (z) {
                            width2 = c82454WXq.LJLLJ;
                        } else {
                            ViewGroup viewGroup5 = c82454WXq.LJLL;
                            if (viewGroup5 != null) {
                                int width5 = viewGroup5.getWidth() - c82454WXq.LJLLJ;
                                C1547165j c1547165j = c82454WXq.LJLJJI;
                                if (c1547165j != null) {
                                    width2 = width5 - c1547165j.getWidth();
                                } else {
                                    o.LJIJI("innerBorder");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("nowsContainer");
                                throw null;
                            }
                        }
                        int i2 = c82454WXq.LJLLJ;
                        C1547165j c1547165j2 = c82454WXq.LJLJJI;
                        if (c1547165j2 != null) {
                            c1547165j2.animate().x(width2).y(i2).setDuration(300L).setInterpolator(C55953Lxd.LJ()).start();
                            return;
                        } else {
                            o.LJIJI("innerBorder");
                            throw null;
                        }
                    }
                    o.LJIJI("ivInner");
                    throw null;
                }
                o.LJIJI("nowsContainer");
                throw null;
            }
            o.LJIJI("nowsContainer");
            throw null;
        }
        o.LJIJI("nowsContainer");
        throw null;
    }
}
