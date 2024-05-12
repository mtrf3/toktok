package o53;

import X.AnonymousClass064;
import X.C49612JdY;
import X.C57396Mfo;
import X.C81392Vwy;
import X.C81581W0b;
import X.C81831W9r;
import X.C81851WAl;
import X.InterfaceC81599W0t;
import X.InterfaceC81853WAn;
import X.KS9;
import X.V9E;
import X.V9M;
import X.W4V;
import X.W5C;
import X.W5G;
import X.W5X;
import X.W63;
import X.W68;
import X.WLT;
import X.WRQ;
import Y.ARunnableS33S0200000_14;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.lynx.tasm.ui.image.FrescoInlineImageShadowNode;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDdS479S0100000_14 extends W4V {
    public final int $t;
    public Object l0;

    public static final void LIZJ$1(IDdS479S0100000_14 iDdS479S0100000_14, String str) {
    }

    @Override // X.W4V, X.W4Z
    public final void LIZJ(String str) {
        switch (this.$t) {
            case 1:
                LIZJ$0(this, str);
                return;
            case 2:
                LIZJ$1(this, str);
                return;
            default:
                super.LIZJ(str);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LIZLLL(Object obj, String str) {
        switch (this.$t) {
            case 1:
                LIZLLL$0(this, obj, str);
                return;
            case 2:
                LIZLLL$1(this, obj, str);
                return;
            default:
                super.LIZLLL(obj, str);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, th);
                return;
            case 1:
                LJ$1(this, str, th);
                return;
            case 2:
                LJ$2(this, str, th);
                return;
            case 3:
                LJ$3(this, str, th);
                return;
            default:
                super.LJ(str, th);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, str, obj, animatable);
                return;
            case 1:
                LJFF$1(this, str, obj, animatable);
                return;
            case 2:
                LJFF$2(this, str, obj, animatable);
                return;
            case 3:
                LJFF$3(this, str, obj, animatable);
                return;
            default:
                super.LJFF(str, obj, animatable);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        switch (this.$t) {
            case 2:
                LJI$0(this, obj, str);
                return;
            default:
                super.LJI(obj, str);
                return;
        }
    }

    public IDdS479S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZJ$0(IDdS479S0100000_14 iDdS479S0100000_14, String str) {
        ((W5X) iDdS479S0100000_14.l0).LJLJI = false;
    }

    public static final void LIZLLL$0(IDdS479S0100000_14 iDdS479S0100000_14, Object obj, String str) {
        ((W5X) iDdS479S0100000_14.l0).LJLJI = false;
    }

    public static final void LJ$0(IDdS479S0100000_14 iDdS479S0100000_14, String str, Throwable th) {
        String message;
        if (th == null) {
            message = "unknown";
        } else {
            message = th.getMessage();
        }
        ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJ(message);
        ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJIILL().LJIIJ(((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJI, "image", message);
    }

    public static final void LJ$1(IDdS479S0100000_14 iDdS479S0100000_14, String str, Throwable th) {
        ((W5X) iDdS479S0100000_14.l0).LJLJI = false;
    }

    public static final void LJ$2(IDdS479S0100000_14 iDdS479S0100000_14, String str, Throwable th) {
        InterfaceC81853WAn interfaceC81853WAn = ((KS9) iDdS479S0100000_14.l0).LJ;
        if (interfaceC81853WAn != null) {
            interfaceC81853WAn.LIZIZ(str, th);
        }
        ((KS9) iDdS479S0100000_14.l0).LIZ();
    }

    public static final void LJ$3(IDdS479S0100000_14 iDdS479S0100000_14, String id, Throwable throwable) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(throwable, "throwable");
        ((C81581W0b) iDdS479S0100000_14.l0).LIZJ();
    }

    public static final void LJI$0(IDdS479S0100000_14 iDdS479S0100000_14, Object obj, String str) {
        InterfaceC81853WAn interfaceC81853WAn = ((KS9) iDdS479S0100000_14.l0).LJ;
        if (interfaceC81853WAn != null) {
            interfaceC81853WAn.LIZJ(str);
        }
    }

    public static final /* bridge */ /* synthetic */ void LIZLLL$1(IDdS479S0100000_14 iDdS479S0100000_14, Object obj, String str) {
    }

    public static final void LJFF$0(IDdS479S0100000_14 iDdS479S0100000_14, String str, Object obj, Animatable animatable) {
        if (obj instanceof W5C) {
            C81392Vwy<Bitmap> cloneUnderlyingBitmapReference = ((W5C) obj).cloneUnderlyingBitmapReference();
            if (cloneUnderlyingBitmapReference == null) {
                ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJ("reference null");
                ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJIILL().LJIIJ(((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJI, "image", "reference null");
                return;
            }
            Bitmap LJI = cloneUnderlyingBitmapReference.LJI();
            if (LJI == null) {
                ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJ("bitmap null");
                ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJIILL().LJIIJ(((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJI, "image", "bitmap null");
                return;
            } else {
                ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJI(LJI.getWidth(), LJI.getHeight());
                return;
            }
        }
        if (animatable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            int intrinsicWidth = animatedDrawable2.getIntrinsicWidth();
            int intrinsicHeight = animatedDrawable2.getIntrinsicHeight();
            animatedDrawable2.LJFF(new V9M(animatedDrawable2.LJLJI, ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJJIZL));
            ((FrescoInlineImageShadowNode) iDdS479S0100000_14.l0).LJJJI(intrinsicWidth, intrinsicHeight);
            V9E.LIZJ(animatedDrawable2);
        }
    }

    public static final void LJFF$1(IDdS479S0100000_14 iDdS479S0100000_14, String str, Object obj, Animatable animatable) {
        Animatable LIZ;
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        ((W5X) iDdS479S0100000_14.l0).getClass();
        String url = ((W5X) iDdS479S0100000_14.l0).getUrl();
        if (!TextUtils.isEmpty(url)) {
            W68 w68 = C49612JdY.LIZ;
            if (w68.LIZJ(url) == null && (interfaceC81599W0t instanceof C81831W9r)) {
                w68.LIZ(url, (C81831W9r) interfaceC81599W0t);
            }
        }
        if (animatable != null) {
            W5X w5x = (W5X) iDdS479S0100000_14.l0;
            w5x.LJLJI = true;
            if (!w5x.LJLILLLLZI || w5x.getController() == null || !w5x.LJLILLLLZI || !w5x.LJLJI || !w5x.LJLJJI || (LIZ = w5x.getController().LIZ()) == null || LIZ.isRunning()) {
                return;
            }
            LIZ.start();
            WeakReference<W63> weakReference = w5x.LJLIL;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            w5x.LJLIL.get().LIZ();
            return;
        }
        ((W5X) iDdS479S0100000_14.l0).LJLJI = false;
    }

    public static final void LJFF$2(IDdS479S0100000_14 iDdS479S0100000_14, String str, Object obj, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        if (animatable != null) {
            if ((animatable instanceof AnimatedDrawable2) && ((KS9) iDdS479S0100000_14.l0).LJII != 0) {
                ((AnimatedDrawable2) animatable).LJI(new C81851WAl(iDdS479S0100000_14));
            }
            InterfaceC81853WAn interfaceC81853WAn = ((KS9) iDdS479S0100000_14.l0).LJ;
            if (interfaceC81853WAn != null) {
                interfaceC81853WAn.LIZ(str, interfaceC81599W0t, animatable);
            }
        }
    }

    public static final void LJFF$3(IDdS479S0100000_14 iDdS479S0100000_14, String id, Object obj, Animatable animatable) {
        C81581W0b c81581W0b;
        FrameLayout frameLayout;
        W5G w5g;
        W5G w5g2;
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        o.LJIIIZ(id, "id");
        C81581W0b c81581W0b2 = (C81581W0b) iDdS479S0100000_14.l0;
        ConstraintLayout constraintLayout = c81581W0b2.LJLJL;
        if (constraintLayout != null && (w5g2 = c81581W0b2.LJLJJLL) != null && interfaceC81599W0t != null && Math.max(interfaceC81599W0t.getHeight(), interfaceC81599W0t.getWidth()) > c81581W0b2.LJLL) {
            AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
            LIZ.LJIIJ(w5g2.getId(), c81581W0b2.LJLL);
            LIZ.LJIIL(w5g2.getId(), c81581W0b2.LJLL);
            LIZ.LIZIZ(constraintLayout);
        }
        C81581W0b c81581W0b3 = (C81581W0b) iDdS479S0100000_14.l0;
        String str = c81581W0b3.LJLIL.LJLIL;
        if (str != null && str.length() > 0) {
            TuxTextView tuxTextView = c81581W0b3.LJLJJL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
                tuxTextView.post(new ARunnableS33S0200000_14(c81581W0b3, tuxTextView, 87));
            }
        } else {
            TuxTextView tuxTextView2 = c81581W0b3.LJLJJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(4);
            }
        }
        Object e8 = ((WLT) c81581W0b3.LJLILLLLZI.LJ(WRQ.class, null)).e8();
        o.LJII(e8, "null cannot be cast to non-null type android.view.View");
        View view = (View) e8;
        if (view.getWidth() / view.getHeight() != 0.75f) {
            view = ((WLT) c81581W0b3.LJLILLLLZI.LJ(WRQ.class, null)).sm0();
        }
        ConstraintLayout constraintLayout2 = c81581W0b3.LJLJL;
        if (constraintLayout2 != null && (w5g = c81581W0b3.LJLJJLL) != null) {
            c81581W0b3.LIZIZ().setVisibility(0);
            c81581W0b3.LIZIZ().setAlpha(0.3f);
            w5g.setVisibility(0);
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(constraintLayout2);
            anonymousClass064.LJIJJLI(w5g.getId(), 3, view.getTop() + ((int) (view.getHeight() * 0.25f)));
            anonymousClass064.LIZIZ(constraintLayout2);
        }
        c81581W0b3.LJLJLJ = true;
        String str2 = ((C81581W0b) iDdS479S0100000_14.l0).LJLIL.LJLIL;
        if ((str2 != null && str2.length() > 0) || (frameLayout = (c81581W0b = (C81581W0b) iDdS479S0100000_14.l0).LJLJI) == null) {
            return;
        }
        frameLayout.postDelayed(c81581W0b.LJLLJ, c81581W0b.LJLLI);
    }
}
