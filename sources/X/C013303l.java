package X;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: X.03l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C013303l {
    public static final int[] LIZJ = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final ProgressBar LIZ;
    public Bitmap LIZIZ;

    public C013303l(ProgressBar progressBar) {
        this.LIZ = progressBar;
    }

    public void LIZ(AttributeSet attributeSet, int i) {
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(this.LIZ.getContext(), attributeSet, LIZJ, i, 0);
        Drawable LJFF = LJIILIIL.LJFF(0);
        if (LJFF != null) {
            ProgressBar progressBar = this.LIZ;
            if (LJFF instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) LJFF;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable LIZIZ = LIZIZ(animationDrawable.getFrame(i2), true);
                    LIZIZ.setLevel(10000);
                    animationDrawable2.addFrame(LIZIZ, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                LJFF = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(LJFF);
        }
        Drawable LJFF2 = LJIILIIL.LJFF(1);
        if (LJFF2 != null) {
            this.LIZ.setProgressDrawable(LIZIZ(LJFF2, false));
        }
        LJIILIIL.LJIILJJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable LIZIZ(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof InterfaceC07870Sp) {
            InterfaceC07870Sp interfaceC07870Sp = (InterfaceC07870Sp) drawable;
            Drawable LIZIZ = interfaceC07870Sp.LIZIZ();
            if (LIZIZ != null) {
                interfaceC07870Sp.LIZ(LIZIZ(LIZIZ, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (id == 16908301 || id == 16908303) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    drawableArr[i] = LIZIZ(drawable2, z2);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                        layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                        layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                        layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                        layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                        layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                        layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                        layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                        layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.LIZIZ == null) {
                    this.LIZIZ = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }
}
