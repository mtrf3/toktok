package com.lynx.fresco;

import X.AbstractC81029Vr7;
import X.AbstractC81030Vr8;
import X.C79411VEp;
import X.C81028Vr6;
import X.C81032VrA;
import X.C81250Vug;
import X.C81705W4v;
import X.C81810W8w;
import X.V85;
import X.V92;
import X.VNU;
import X.W5I;
import X.W5P;
import Y.ARunnableS17S0400000_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS50S0100000_14;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* loaded from: classes15.dex */
public class FrescoImageLoader extends AbstractC81029Vr7 {
    public volatile C81705W4v mBuilder;
    public C81250Vug<V92> mDraweeHolder;

    @Override // X.AbstractC81029Vr7
    public void onPause() {
    }

    @Override // X.AbstractC81029Vr7
    public void onRelease() {
    }

    @Override // X.AbstractC81029Vr7
    public void onResume() {
    }

    public C81705W4v getBuilder() {
        if (this.mBuilder == null) {
            synchronized (this) {
                if (this.mBuilder == null) {
                    this.mBuilder = W5I.LIZJ();
                }
            }
        }
        return this.mBuilder;
    }

    @Override // X.AbstractC81029Vr7
    public void onDestroy() {
        C79411VEp.LJ(new ARunnableS50S0100000_14(this, 32));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.W5O, REQUEST] */
    public void load(Uri uri, C81032VrA c81032VrA, AbstractC81030Vr8 abstractC81030Vr8, Object obj) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        W5P LIZLLL = W5P.LIZLLL(uri);
        LIZLLL.LIZLLL = V85.LIZJ;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        imageDecodeOptionsBuilder.getClass();
        LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
        ?? LIZ = LIZLLL.LIZ();
        C81705W4v builder = getBuilder();
        builder.LIZJ = obj;
        builder.LIZLLL = LIZ;
        builder.LJII = new C81028Vr6(this, abstractC81030Vr8, uri);
        C79411VEp.LJ(new ARunnableS33S0200000_14(this, obj, 18));
    }

    @Override // X.AbstractC81029Vr7
    public void onLoad(VNU vnu, Uri uri, C81032VrA c81032VrA, AbstractC81030Vr8 abstractC81030Vr8) {
        C79411VEp.LJ(new ARunnableS17S0400000_14(this, uri, abstractC81030Vr8, vnu, 1));
    }
}
