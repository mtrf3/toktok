package com.facebook.imagepipeline.common;

import X.C81810W8w;
import X.InterfaceC81842WAc;
import X.W8P;
import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: classes15.dex */
public class ImageDecodeOptionsBuilder {
    public boolean LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public InterfaceC81842WAc LJIIIIZZ;
    public Object LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public Rect LJIIL;
    public final int LIZ = 100;
    public int LIZJ = W8P.LIZ;
    public Bitmap.Config LJII = Bitmap.Config.ARGB_8888;

    public final void LIZ(C81810W8w c81810W8w) {
        this.LIZIZ = c81810W8w.LIZIZ;
        this.LIZJ = c81810W8w.LIZJ;
        this.LIZLLL = c81810W8w.LIZLLL;
        this.LJ = c81810W8w.LJ;
        this.LJFF = c81810W8w.LJFF;
        this.LJII = c81810W8w.LJII;
        this.LJIIIIZZ = c81810W8w.LJIIIIZZ;
        this.LJI = c81810W8w.LJI;
        this.LJIIIZ = c81810W8w.LJIIIZ;
        this.LJIIJ = c81810W8w.LJIIJ;
        this.LJIIJJI = c81810W8w.LJIIJJI;
        this.LJIIL = c81810W8w.LJIIL;
    }

    public ImageDecodeOptionsBuilder LIZIZ(int i) {
        this.LIZJ = i;
        return this;
    }

    public ImageDecodeOptionsBuilder setBitmapConfig(Bitmap.Config config) {
        this.LJII = config;
        this.LJIIJ = true;
        return this;
    }
}
