package com.ugc.effectcreator.foundation.image;

import X.C76800UCe;
import X.C93745aVp;
import X.C94020aaG;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ImageLoaderService implements IImageLoader {
    public static final ImageLoaderService INSTANCE = new ImageLoaderService();
    public final /* synthetic */ IImageLoader $$delegate_0 = (IImageLoader) C93745aVp.LIZ(IImageLoader.class);

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void compatLoadBitmap(Context context, String path, ImageView imageView, C94020aaG option, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        this.$$delegate_0.compatLoadBitmap(context, path, imageView, option, interfaceC88472Yns);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void downloadImage(Context context, String url, C94020aaG option, InterfaceC88472Yns<? super Bitmap, C76800UCe> callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(option, "option");
        o.LJIIIZ(callback, "callback");
        this.$$delegate_0.downloadImage(context, url, option, callback);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void downloadImageFile(Context context, String url, C94020aaG option, InterfaceC88472Yns<? super String, C76800UCe> callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(option, "option");
        o.LJIIIZ(callback, "callback");
        this.$$delegate_0.downloadImageFile(context, url, option, callback);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void init(Context context) {
        o.LJIIIZ(context, "context");
        this.$$delegate_0.init(context);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadBitmap(Context context, String path, ImageView imageView, C94020aaG option) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        this.$$delegate_0.loadBitmap(context, path, imageView, option);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadBitmap(Context context, String path, ImageView imageView, C94020aaG option, InterfaceC88472Yns<? super Boolean, C76800UCe> resultListener) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        o.LJIIIZ(resultListener, "resultListener");
        this.$$delegate_0.loadBitmap(context, path, imageView, option, resultListener);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadBitmap(String path, C94020aaG option, InterfaceC88472Yns<? super Bitmap, C76800UCe> callback) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(option, "option");
        o.LJIIIZ(callback, "callback");
        this.$$delegate_0.loadBitmap(path, option, callback);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public Object loadBitmapSync(Context context, String str, C94020aaG c94020aaG, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        return this.$$delegate_0.loadBitmapSync(context, str, c94020aaG, interfaceC67352kd);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadFile(Context context, File file, ImageView imageView, C94020aaG option) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(file, "file");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        this.$$delegate_0.loadFile(context, file, imageView, option);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadGif(Context context, String path, ImageView imageView, C94020aaG option) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        this.$$delegate_0.loadGif(context, path, imageView, option);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadImageBitmap(Context context, Bitmap bitmap, ImageView imageView, C94020aaG option) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        this.$$delegate_0.loadImageBitmap(context, bitmap, imageView, option);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public Bitmap resizeBitmapSync(Context context, Bitmap bitmap, int i, int i2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bitmap, "bitmap");
        return this.$$delegate_0.resizeBitmapSync(context, bitmap, i, i2);
    }
}
