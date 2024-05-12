package com.ugc.effectcreator.foundation.image;

import X.C76800UCe;
import X.C94020aaG;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.news.common.service.manager.IService;
import java.io.File;

/* loaded from: classes34.dex */
public interface IImageLoader extends IService {
    void compatLoadBitmap(Context context, String str, ImageView imageView, C94020aaG c94020aaG, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void downloadImage(Context context, String str, C94020aaG c94020aaG, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns);

    void downloadImageFile(Context context, String str, C94020aaG c94020aaG, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns);

    void init(Context context);

    void loadBitmap(Context context, String str, ImageView imageView, C94020aaG c94020aaG);

    void loadBitmap(Context context, String str, ImageView imageView, C94020aaG c94020aaG, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void loadBitmap(String str, C94020aaG c94020aaG, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns);

    Object loadBitmapSync(Context context, String str, C94020aaG c94020aaG, InterfaceC67352kd<? super Bitmap> interfaceC67352kd);

    void loadFile(Context context, File file, ImageView imageView, C94020aaG c94020aaG);

    void loadGif(Context context, String str, ImageView imageView, C94020aaG c94020aaG);

    void loadImageBitmap(Context context, Bitmap bitmap, ImageView imageView, C94020aaG c94020aaG);

    Bitmap resizeBitmapSync(Context context, Bitmap bitmap, int i, int i2);
}
