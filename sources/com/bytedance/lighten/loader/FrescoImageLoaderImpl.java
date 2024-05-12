package com.bytedance.lighten.loader;

import X.C2050382x;
import X.C38027EwB;
import X.C38028EwC;
import X.C38995FSd;
import X.C43588H8u;
import X.C49612JdY;
import X.C62562cu;
import X.C71893SJl;
import X.C72434Sbm;
import X.C78665Uu5;
import X.C78718Uuw;
import X.C78755UvX;
import X.C79083V1z;
import X.C79238V7y;
import X.C79265V8z;
import X.C80932VpY;
import X.C80936Vpc;
import X.C81250Vug;
import X.C81257Vun;
import X.C81392Vwy;
import X.C81687W4d;
import X.C81697W4n;
import X.C81720W5k;
import X.C81726W5q;
import X.C81810W8w;
import X.EnumC62195Ob1;
import X.EnumC81745W6j;
import X.ExecutorC2050282w;
import X.FSY;
import X.HWC;
import X.HZE;
import X.InterfaceC70869Rrd;
import X.InterfaceC78660Uu0;
import X.InterfaceC78716Uuu;
import X.InterfaceC80940Vpg;
import X.InterfaceC81252Vui;
import X.InterfaceC81715W5f;
import X.InterfaceC81727W5r;
import X.InterfaceC85013Vh;
import X.KL0;
import X.MHO;
import X.PGN;
import X.QGT;
import X.QM9;
import X.S3K;
import X.S3L;
import X.SIR;
import X.V85;
import X.V8K;
import X.V8L;
import X.V92;
import X.VA9;
import X.W4W;
import X.W50;
import X.W53;
import X.W54;
import X.W5A;
import X.W5D;
import X.W5E;
import X.W5H;
import X.W5I;
import X.W5J;
import X.W5O;
import X.W5P;
import X.W5T;
import X.W5Y;
import X.W66;
import X.W6J;
import X.W8E;
import X.W92;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes15.dex */
public class FrescoImageLoaderImpl implements InterfaceC81727W5r {
    public static boolean sIsRemoveLog;
    public InterfaceC70869Rrd mCache;
    public ExecutorService mIOExecutor;

    public static /* synthetic */ W5O LIZIZ(W5O w5o, W4W w4w) {
        lambda$loadBitmap$0(w5o, w4w);
        return w5o;
    }

    public static /* synthetic */ W5O lambda$loadBitmap$0(W5O w5o, W4W w4w) {
        return w5o;
    }

    public FrescoImageLoaderImpl(InterfaceC70869Rrd interfaceC70869Rrd) {
        this.mCache = interfaceC70869Rrd;
        C38027EwB LIZ = C38028EwC.LIZ(FSY.FIXED);
        LIZ.LIZIZ = "fresco-loader-io";
        LIZ.LIZJ = 2;
        this.mIOExecutor = C38995FSd.LIZ(LIZ.LIZ());
    }

    public static void buildCircleOptions(W5E w5e) {
        VA9 va9;
        V8L v8l;
        S3L s3l = w5e.LJJ;
        if (s3l == null || (va9 = (VA9) w5e.LJJIIZI) == null) {
            return;
        }
        if (((V92) va9.getHierarchy()).LIZJ != null) {
            v8l = ((V92) va9.getHierarchy()).LIZJ;
        } else {
            v8l = new V8L();
        }
        ((V92) va9.getHierarchy()).LJIL(circleConvertRoundParams(v8l, s3l));
    }

    public static C81810W8w buildImageDecodeOptions(W5E w5e) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        Bitmap.Config config = w5e.LJIJJLI;
        if (config != null) {
            imageDecodeOptionsBuilder.setBitmapConfig(config);
        }
        imageDecodeOptionsBuilder.LJ = w5e.LJI;
        int i = w5e.LJII;
        if (i >= 0) {
            imageDecodeOptionsBuilder.LIZIZ(i);
        }
        if (w5e.LJ != -1) {
            HashMap hashMap = new HashMap();
            hashMap.put("frame_scheduler_id", Integer.valueOf(w5e.LJ));
            W66 w66 = w5e.LJJJI;
            if (w66 != null) {
                hashMap.put("frame_scheduler_listener", w66);
            }
            imageDecodeOptionsBuilder.LJIIIZ = hashMap;
        }
        return new C81810W8w(imageDecodeOptionsBuilder);
    }

    public static W5O[] buildImageRequests(W5E w5e) {
        C79083V1z.LJ(w5e.hashCode(), "FrescoImageLoaderImpl", "buildImageRequests");
        List<String> imageUrlModelUrls = getImageUrlModelUrls(w5e);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = imageUrlModelUrls.iterator();
        while (it.hasNext()) {
            W5P makeImageRequestBuilder = makeImageRequestBuilder(w5e, UriProtector.parse(it.next()));
            SIR sir = w5e.LJJJIL;
            C78665Uu5 c78665Uu5 = new C78665Uu5();
            c78665Uu5.LIZ = sir;
            makeImageRequestBuilder.LJIILJJIL = c78665Uu5;
            W5O LIZ = makeImageRequestBuilder.LIZ();
            if (!sIsRemoveLog) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("build ImageRequest:");
                LIZ2.append(LIZ);
                C79083V1z.LJFF(w5e.hashCode(), "FrescoImageLoaderImpl", "buildImageRequests", X1D.LIZIZ(LIZ2));
            }
            arrayList.add(LIZ);
        }
        if (arrayList.size() == 0) {
            return new W5O[0];
        }
        return (W5O[]) arrayList.toArray(new W5O[arrayList.size()]);
    }

    public static W92 buildPriority(W5E w5e) {
        KL0 kl0 = w5e.LJJII;
        if (kl0 == KL0.LOW) {
            return W92.LOW;
        }
        if (kl0 == KL0.HIGH) {
            return W92.HIGH;
        }
        return W92.MEDIUM;
    }

    public static C79238V7y buildResizeOptions(W5E w5e) {
        int i = w5e.LJIIJJI;
        if (i > 0) {
            return new C79238V7y(i, w5e.LJIIIZ, w5e.LJIIJ);
        }
        return new C79238V7y(w5e.LJIIIZ, w5e.LJIIJ);
    }

    public static List<String> getImageUrlModelUrls(W5E w5e) {
        C62562cu c62562cu = w5e.LJJJ;
        if (c62562cu == null || c62562cu.LIZ()) {
            return Collections.emptyList();
        }
        return w5e.LJJJ.LIZ;
    }

    public static /* synthetic */ void lambda$makeImageRequestBuilder$1(W5E w5e) {
        buildCircleOptions(w5e);
        setBackgroundImage(w5e);
        setPlaceholderAndScaleType(w5e);
    }

    public static void setBackgroundImage(W5E w5e) {
        VA9 va9;
        if (w5e.LJJIJL || (va9 = (VA9) w5e.LJJIIZI) == null) {
            return;
        }
        Drawable drawable = w5e.LJIJJ;
        if (drawable == null) {
            ((V92) va9.getHierarchy()).LJIILL(null, 0);
        } else {
            ((V92) va9.getHierarchy()).LJIILL(new C79265V8z(drawable, InterfaceC78716Uuu.LJJLIIIJILLIZJL), 0);
        }
    }

    public static void setIsRemoveLog(boolean z) {
        sIsRemoveLog = z;
    }

    public static void setPlaceholderAndScaleType(W5E w5e) {
        VA9 va9 = (VA9) w5e.LJJIIZI;
        if (va9 == null) {
            return;
        }
        if (w5e.LJIILL > 0) {
            if (w5e.LJIIZILJ != null) {
                ((V92) va9.getHierarchy()).LJIJI(w5e.LJIILL, C78718Uuw.LIZ(w5e.LJIIZILJ));
            } else {
                ((V92) va9.getHierarchy()).LJIJ(w5e.LJIILL);
            }
        } else if (w5e.LJIILLIIL != null) {
            if (w5e.LJIIZILJ != null) {
                ((V92) va9.getHierarchy()).LJIJJ(w5e.LJIILLIIL, C78718Uuw.LIZ(w5e.LJIIZILJ));
            } else {
                ((V92) va9.getHierarchy()).LJIILL(w5e.LJIILLIIL, 1);
            }
        }
        if (w5e.LJIJ > 0) {
            ((V92) va9.getHierarchy()).LJIIZILJ(w5e.LJIJ);
        } else if (w5e.LJIJI != null) {
            ((V92) va9.getHierarchy()).LJIILL(w5e.LJIJI, 5);
        }
        if (w5e.LJIL != null) {
            ((V92) va9.getHierarchy()).LJIILJJIL(C78718Uuw.LIZ(w5e.LJIL));
        }
        if (w5e.LJJIZ != null) {
            ((V92) va9.getHierarchy()).LJIILL(w5e.LJJIZ, 4);
        }
        if (w5e.LJIILJJIL >= 0) {
            ((V92) va9.getHierarchy()).LJIILLIIL(w5e.LJIILJJIL);
        }
    }

    @Override // X.InterfaceC81727W5r
    public void display(W5E w5e) {
        Object obj;
        C81250Vug c81250Vug;
        W5O[] w5oArr;
        C79083V1z.LJ(w5e.hashCode(), "FrescoImageLoaderImpl", "display");
        InterfaceC85013Vh interfaceC85013Vh = w5e.LJJIIZI;
        if (interfaceC85013Vh instanceof C72434Sbm) {
            ((SmartImageView) interfaceC85013Vh).LIZ(w5e);
            return;
        }
        if (interfaceC85013Vh instanceof SmartImageView) {
            ((SmartImageView) interfaceC85013Vh).LIZ(w5e);
            return;
        }
        ImageView imageView = w5e.LJJIJ;
        if (imageView != null) {
            C79083V1z.LJ(w5e.hashCode(), "FrescoBareImageLoader", "into");
            Object tag = imageView.getTag();
            InterfaceC81252Vui interfaceC81252Vui = null;
            if (!(tag instanceof C78755UvX) || (obj = ((HashMap) tag).get("DraweeHolder")) == null) {
                obj = null;
            }
            if (obj instanceof C81250Vug) {
                c81250Vug = (C81250Vug) obj;
            } else {
                c81250Vug = null;
            }
            C62562cu c62562cu = w5e.LJJJ;
            if (c62562cu != null && !c62562cu.LIZ()) {
                w5oArr = buildImageRequests(w5e);
                if (w5oArr == null) {
                    return;
                }
            } else {
                Uri uri = w5e.LIZ;
                if (uri == null) {
                    return;
                } else {
                    w5oArr = new W5O[]{buildImageRequest(w5e, uri)};
                }
            }
            if (w5oArr.length == 0) {
                return;
            }
            if (c81250Vug != null) {
                interfaceC81252Vui = c81250Vug.LJ;
            }
            W5D w5d = new W5D();
            w5d.LJIIL(w5e);
            C2050382x.LIZ.execute(new W54(imageView, w5e, w5d, interfaceC81252Vui, c81250Vug, w5oArr));
            return;
        }
        C79083V1z.LIZIZ(w5e.hashCode(), "FrescoImageLoaderImpl", "display", "needs SmartImageView or ImageView to display, use with(view)");
        throw new IllegalArgumentException("FrescoImageLoaderImplneeds SmartImageView or ImageView to display, use with(view)");
    }

    @Override // X.InterfaceC81727W5r
    public void download(W5E w5e) {
        Uri parse;
        C79083V1z.LJ(w5e.hashCode(), "FrescoImageLoaderImpl", "download");
        List<String> imageUrlModelUrls = getImageUrlModelUrls(w5e);
        if (imageUrlModelUrls.isEmpty()) {
            parse = w5e.LIZ;
        } else {
            parse = UriProtector.parse((String) ListProtector.get(imageUrlModelUrls, 0));
        }
        this.mCache.LIZJ(parse, new W5J(this, w5e, parse));
    }

    public Executor getCallbackExecutor(W5E w5e) {
        ExecutorC2050282w executorC2050282w = C2050382x.LIZ;
        Executor executor = w5e.LJJIIJ;
        if (executor != null) {
            return executor;
        }
        return executorC2050282w;
    }

    @Override // X.InterfaceC81727W5r
    public void loadBitmap(W5E w5e) {
        C79083V1z.LJ(w5e.hashCode(), "FrescoImageLoaderImpl", "loadBitmap");
        C62562cu c62562cu = w5e.LJJJ;
        if (c62562cu == null || c62562cu.LIZ()) {
            final W5O buildImageRequest = buildImageRequest(w5e, w5e.LIZ);
            createBaseBitmapDataSubscriber(W8E.LJII().LJI().LJ(buildImageRequest, null), w5e, new InterfaceC81715W5f() { // from class: X.W5s
                @Override // X.InterfaceC81715W5f
                public final W5O LIZ(W4W w4w) {
                    W5O w5o = W5O.this;
                    FrescoImageLoaderImpl.lambda$loadBitmap$0(w5o, w4w);
                    return w5o;
                }
            });
            return;
        }
        W5O[] buildImageRequests = buildImageRequests(w5e);
        if (buildImageRequests.length == 0) {
            C79083V1z.LIZIZ(w5e.hashCode(), "FrescoImageLoaderImpl", "loadBitmap", "loadBitmap, url is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (W5O w5o : buildImageRequests) {
            if (w5o != null) {
                W6J LIZ = W5I.LIZ();
                W50 w50 = W50.FULL_FETCH;
                LIZ.getClass();
                arrayList.add(new C81257Vun(LIZ, w5o, w50));
            }
        }
        if (arrayList.isEmpty()) {
            C79083V1z.LIZIZ(w5e.hashCode(), "FrescoImageLoaderImpl", "loadBitmap", " suppliers is empty");
        } else {
            createBaseBitmapDataSubscriber(new C81697W4n(new C81687W4d(arrayList)), w5e, new W5Y(arrayList, buildImageRequests));
        }
    }

    @Override // X.InterfaceC81727W5r
    public void trimDisk(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("level=");
        LIZ.append(i);
        C79083V1z.LJFF(0, "FrescoImageLoaderImpl", "trimDisk", X1D.LIZIZ(LIZ));
        this.mIOExecutor.submit(new W5T(i));
    }

    @Override // X.InterfaceC81727W5r
    public void trimMemory(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" level=");
        LIZ.append(i);
        C79083V1z.LJFF(0, "FrescoImageLoaderImpl", "trimMemory", X1D.LIZIZ(LIZ));
        if (i != 5) {
            if (i != 10) {
                if (i != 40) {
                    return;
                }
                PGN.LIZ.LIZIZ(EnumC81745W6j.OnSystemLowMemoryWhileAppInBackground);
                return;
            } else {
                PGN.LIZ.LIZIZ(EnumC81745W6j.OnCloseToDalvikHeapLimit);
                C49612JdY.LIZ.LIZIZ();
                return;
            }
        }
        PGN.LIZ.LIZIZ(EnumC81745W6j.OnSystemLowMemoryWhileAppInForeground);
        C49612JdY.LIZ.LIZIZ();
    }

    public static void buildBlurOptions(W5P w5p, W5E w5e) {
        MHO mho = w5e.LJJI;
        if (mho != null) {
            w5p.LJIIJ = new C80932VpY(mho.LIZ, 3, w5e.LIZJ);
        }
    }

    public static void buildCropOptions(W5P w5p, W5E w5e) {
        w5e.getClass();
    }

    public static W5O buildImageRequest(W5E w5e, Uri uri) {
        C79083V1z.LJFF(w5e.hashCode(), "FrescoImageLoaderImpl", "buildImageRequest", C43588H8u.LIZ("uri:", uri));
        W5P makeImageRequestBuilder = makeImageRequestBuilder(w5e, uri);
        SIR sir = w5e.LJJJIL;
        C78665Uu5 c78665Uu5 = new C78665Uu5();
        c78665Uu5.LIZ = sir;
        makeImageRequestBuilder.LJIILJJIL = c78665Uu5;
        return makeImageRequestBuilder.LIZ();
    }

    public static void buildPostProcessor(W5P w5p, W5E w5e) {
        Object obj;
        QM9 qm9 = w5e.LJJIFFI;
        if (qm9 == null || (obj = qm9.LJLIL) == null || ((List) obj).isEmpty()) {
            return;
        }
        w5p.LJIIJ = new C80936Vpc((InterfaceC80940Vpg) ListProtector.get((List) w5e.LJJIFFI.LJLIL, 0));
    }

    public static V8L circleConvertRoundParams(V8L v8l, S3L s3l) {
        V8K v8k;
        if (s3l == null) {
            return v8l;
        }
        if (v8l == null) {
            v8l = new V8L();
        }
        C81726W5q c81726W5q = s3l.LJFF;
        if (c81726W5q != null) {
            v8l.LJ(c81726W5q.LIZ, c81726W5q.LIZIZ, c81726W5q.LIZJ, c81726W5q.LIZLLL);
        } else {
            float f = s3l.LIZLLL;
            if (f > 0.0f) {
                v8l.LJFF(f);
            }
        }
        v8l.LIZIZ = s3l.LIZJ;
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
        return v8l;
    }

    public static W5P makeImageRequestBuilder(W5E w5e, Uri uri) {
        C79083V1z.LJFF(w5e.hashCode(), "FrescoImageLoaderImpl", "makeImageRequestBuilder", C43588H8u.LIZ("uri:", uri));
        W5P LIZLLL = W5P.LIZLLL(uri);
        LIZLLL.LJI = w5e.LJIIIIZZ;
        if (w5e.LJFF) {
            LIZLLL.LIZLLL = V85.LIZJ;
        } else {
            LIZLLL.LIZLLL = V85.LIZLLL;
        }
        EnumC62195Ob1 enumC62195Ob1 = w5e.LJJIIJZLJL;
        if (enumC62195Ob1 == EnumC62195Ob1.SMALL) {
            LIZLLL.LJFF = QGT.SMALL;
        } else if (enumC62195Ob1 == EnumC62195Ob1.CUSTOM) {
            LIZLLL.LJFF = QGT.CUSTOM;
            String str = w5e.LJJIIZ;
            str.getClass();
            LIZLLL.LJIILLIIL = str;
        }
        buildCropOptions(LIZLLL, w5e);
        buildPostProcessor(LIZLLL, w5e);
        buildBlurOptions(LIZLLL, w5e);
        W92 buildPriority = buildPriority(w5e);
        LIZLLL.LJ = buildImageDecodeOptions(w5e);
        LIZLLL.LJIIIZ = buildPriority;
        if (w5e.LJFF) {
            LIZLLL.LIZLLL = V85.LIZJ;
        } else {
            LIZLLL.LIZLLL = V85.LIZLLL;
        }
        if (w5e.LJIIIZ > 0 && w5e.LJIIJ > 0) {
            LIZLLL.LIZJ = buildResizeOptions(w5e);
        }
        LIZLLL.LJIIL = w5e.LJJIL;
        C71893SJl.LIZ(new HZE(2, w5e));
        return LIZLLL;
    }

    private void createBaseBitmapDataSubscriber(W4W<C81392Vwy<W5A>> w4w, W5E w5e, InterfaceC81715W5f interfaceC81715W5f) {
        C79083V1z.LJ(w5e.hashCode(), "FrescoImageLoaderImpl", "createBaseBitmapDataSubscriber");
        InterfaceC78660Uu0 interfaceC78660Uu0 = w5e.LJJIJIL;
        W53 w53 = new W53(w5e);
        w53.LJI(w5e.LJJIII, null);
        w4w.LJ(new W5H(this, w5e, w53, interfaceC81715W5f, w4w, interfaceC78660Uu0), this.mIOExecutor);
        HWC.LIZ(w5e, new C81720W5k(w4w));
    }
}
