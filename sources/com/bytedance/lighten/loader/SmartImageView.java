package com.bytedance.lighten.loader;

import X.C2050382x;
import X.C62562cu;
import X.C71893SJl;
import X.C78718Uuw;
import X.C79083V1z;
import X.C81392Vwy;
import X.C81705W4v;
import X.C81726W5q;
import X.C81814W9a;
import X.EnumC72807Shn;
import X.InterfaceC70769Rq1;
import X.InterfaceC85013Vh;
import X.S3K;
import X.S3L;
import X.V8K;
import X.V8L;
import X.V92;
import X.W5D;
import X.W5E;
import X.W5G;
import X.W5I;
import X.W5O;
import X.W61;
import X.W64;
import X.X1D;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS25S0300000_14;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class SmartImageView extends W5G implements InterfaceC85013Vh, W64 {
    public static boolean LJLJL;
    public WeakReference<W61> LJLIL;
    public W5D LJLILLLLZI;
    public String LJLJI;
    public C81392Vwy<Bitmap> LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    public void LIZIZ() {
    }

    public W64 getSmartHierarchy() {
        return this;
    }

    public final void LJ() {
        W5D w5d;
        Animatable LIZ;
        if (getController() == null || (w5d = this.LJLILLLLZI) == null || !this.LJLJJL || !w5d.LJFF || !this.LJLJJLL || (LIZ = getController().LIZ()) == null || LIZ.isRunning()) {
            return;
        }
        LIZ.start();
        WeakReference<W61> weakReference = this.LJLIL;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.LJLIL.get().LIZ();
    }

    public final void LJFF() {
        Animatable LIZ;
        if (getController() != null && (LIZ = getController().LIZ()) != null && LIZ.isRunning()) {
            LIZ.stop();
            WeakReference<W61> weakReference = this.LJLIL;
            if (weakReference != null && weakReference.get() != null) {
                this.LJLIL.get().LIZIZ();
            }
        }
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Drawable drawable;
        if (C81814W9a.LJIIJ().LIZJ() && getVisibility() == 0 && (drawable = getDrawable()) != null) {
            drawable.setVisible(true, false);
        }
        super.onAttachedToWindow();
    }

    public String getAnimPreviewFrameCacheKey() {
        return this.LJLJI;
    }

    public SmartImageView(Context context) {
        super(context);
        LIZIZ();
    }

    public static void setIsRemoveLog(boolean z) {
        LJLJL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.W5O, REQUEST, java.lang.Object] */
    public void LIZ(W5E w5e) {
        String str;
        String str2;
        C79083V1z.LJ(w5e.hashCode(), "SmartImageView", "display");
        boolean z = false;
        if (w5e.LJJIJL) {
            C62562cu c62562cu = w5e.LJJJ;
            if (c62562cu != null && !c62562cu.LIZ()) {
                this.LJLJI = (String) ListProtector.get(w5e.LJJJ.LIZ, 0);
            } else {
                this.LJLJI = w5e.LIZ.toString();
            }
            C71893SJl.LIZ(new ARunnableS12S0101000_8(2, this, 5));
        }
        C62562cu c62562cu2 = w5e.LJJJ;
        REQUEST request = 0;
        r4 = 0;
        r4 = 0;
        REQUEST request2 = 0;
        request = 0;
        request = 0;
        if (c62562cu2 != null && !c62562cu2.LIZ()) {
            W5O[] buildImageRequests = FrescoImageLoaderImpl.buildImageRequests(w5e);
            if (!LJLJL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("imageRequests => ");
                LIZ.append(Arrays.toString(buildImageRequests));
                C79083V1z.LJFF(w5e.hashCode(), "SmartImageView", "setController", X1D.LIZIZ(LIZ));
            }
            C81814W9a LJIIJ = C81814W9a.LJIIJ();
            if (LJIIJ.LIZIZ.LJJIJ.LIZ() != null && ((Boolean) LJIIJ.LIZIZ.LJJIJ.LIZ()).booleanValue() && (str2 = w5e.LIZIZ) != null) {
                request2 = FrescoImageLoaderImpl.buildImageRequest(w5e, UriProtector.parse(str2));
            }
            if (buildImageRequests.length == 0) {
                return;
            }
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJIIL = getController();
            LIZJ.LJIIJ = w5e.LIZLLL;
            if (w5e.LJJIZ != null) {
                z = true;
            }
            LIZJ.LJIIIZ = z;
            LIZJ.LIZJ = w5e.LJJIII;
            LIZJ.LJ = request2;
            LIZJ.LJFF(true, buildImageRequests);
            if (!TextUtils.isEmpty(w5e.LJJIII)) {
                LIZJ.LIZJ = w5e.LJJIII;
            }
            W5D w5d = this.LJLILLLLZI;
            if (w5d != null) {
                w5d.LJIIL(w5e);
                LIZJ.LJII = this.LJLILLLLZI;
            } else {
                W5D w5d2 = new W5D();
                this.LJLILLLLZI = w5d2;
                w5d2.LJIIL(w5e);
                LIZJ.LJII = this.LJLILLLLZI;
            }
            C2050382x.LIZ.execute(new ARunnableS25S0300000_14(this, LIZJ, w5e, 38));
            return;
        }
        ?? buildImageRequest = FrescoImageLoaderImpl.buildImageRequest(w5e, w5e.LIZ);
        if (!LJLJL) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("imageRequest => ");
            LIZ2.append((Object) buildImageRequest);
            C79083V1z.LJFF(w5e.hashCode(), "SmartImageView", "setController", X1D.LIZIZ(LIZ2));
        }
        C81814W9a LJIIJ2 = C81814W9a.LJIIJ();
        if (LJIIJ2.LIZIZ.LJJIJ.LIZ() != null && ((Boolean) LJIIJ2.LIZIZ.LJJIJ.LIZ()).booleanValue() && (str = w5e.LIZIZ) != null) {
            request = FrescoImageLoaderImpl.buildImageRequest(w5e, UriProtector.parse(str));
        }
        C81705W4v LIZJ2 = W5I.LIZJ();
        LIZJ2.LJIIL = getController();
        LIZJ2.LJIIJ = w5e.LIZLLL;
        if (w5e.LJJIZ != null) {
            z = true;
        }
        LIZJ2.LJIIIZ = z;
        LIZJ2.LJ = request;
        LIZJ2.LIZLLL = buildImageRequest;
        if (!TextUtils.isEmpty(w5e.LJJIII)) {
            LIZJ2.LIZJ = w5e.LJJIII;
        }
        W5D w5d3 = this.LJLILLLLZI;
        if (w5d3 != null) {
            w5d3.LJIIL(w5e);
            LIZJ2.LJII = this.LJLILLLLZI;
        } else {
            W5D w5d4 = new W5D();
            this.LJLILLLLZI = w5d4;
            w5d4.LJIIL(w5e);
            LIZJ2.LJII = this.LJLILLLLZI;
        }
        C2050382x.LIZ.execute(new ARunnableS25S0300000_14(this, LIZJ2, w5e, 39));
    }

    public void setActualImageScaleType(EnumC72807Shn enumC72807Shn) {
        if (enumC72807Shn != null) {
            getHierarchy().LJIILJJIL(C78718Uuw.LIZ(enumC72807Shn));
        }
    }

    public void setAnimationListener(W61 w61) {
        this.LJLIL = new WeakReference<>(w61);
    }

    public void setAttached(boolean z) {
        this.LJLJJL = z;
    }

    public void setCircleOptions(S3L s3l) {
        V8L v8l;
        V8K v8k;
        if (s3l == null) {
            return;
        }
        if (getHierarchy().LIZJ != null) {
            v8l = getHierarchy().LIZJ;
        } else {
            v8l = new V8L();
        }
        C81726W5q c81726W5q = s3l.LJFF;
        if (c81726W5q != null) {
            v8l.LJ(c81726W5q.LIZ, c81726W5q.LIZIZ, c81726W5q.LIZJ, c81726W5q.LIZLLL);
        }
        v8l.LIZIZ = s3l.LIZJ;
        v8l.LJFF(s3l.LIZLLL);
        v8l.LIZLLL(s3l.LIZ);
        v8l.LJFF = s3l.LIZIZ;
        v8l.LJI(0);
        v8l.LJII(s3l.LJ);
        if (s3l.LJI == S3K.OVERLAY_COLOR) {
            v8k = V8K.OVERLAY_COLOR;
        } else {
            v8k = V8K.BITMAP_ONLY;
        }
        v8l.LIZ = v8k;
        getHierarchy().LJIL(v8l);
    }

    public void setImageDisplayListener(InterfaceC70769Rq1 interfaceC70769Rq1) {
        W5D w5d = this.LJLILLLLZI;
        if (w5d != null) {
            w5d.LIZJ = interfaceC70769Rq1;
        }
    }

    public void setPlaceholderImage(int i) {
        if (i > 0) {
            getHierarchy().LJIJ(i);
        }
    }

    public void setUserVisibleHint(boolean z) {
        this.LJLJJLL = z;
    }

    public void setPlaceholderImage(Drawable drawable) {
        getHierarchy().LJIILL(drawable, 1);
    }

    public SmartImageView(Context context, V92 v92) {
        super(context, v92);
        setHierarchy(v92);
        LIZIZ();
    }

    public SmartImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZIZ();
    }

    public SmartImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZIZ();
    }
}
