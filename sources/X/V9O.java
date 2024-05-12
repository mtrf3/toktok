package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.lynx.tasm.ui.image.GlobalImageLoadListener;
import java.util.List;

/* loaded from: classes14.dex */
public class V9O extends V9P {
    public int mBlurRadius;
    public int mShadowColor;
    public int mShadowOffsetX;
    public int mShadowOffsetY;
    public int mShadowRadius;

    public void com_lynx_tasm_ui_image_FrescoFilterImageView__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
    }

    public void markShadowDirty() {
        this.mIsDirty = true;
    }

    @Override // X.V9P, X.VA9, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com_lynx_tasm_ui_image_FrescoFilterImageView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_imageViewOnDetachedFromWindow(this);
    }

    private void configureBounds() {
        if (getTopLevelDrawable() != null && isUseShadowProcessor()) {
            getTopLevelDrawable().setBounds(new Rect(0, 0, getWidth(), getHeight()));
        }
    }

    private boolean isUseShadowProcessor() {
        if (getWidth() != 0 && getHeight() != 0 && (this.mShadowRadius != 0 || this.mShadowColor != 0 || this.mBlurRadius != 0)) {
            return true;
        }
        return false;
    }

    @Override // X.V9P
    public void maybeUpdateView() {
        super.maybeUpdateView();
    }

    @Override // X.V9P
    public void onImageRequestLoaded() {
        configureBounds();
    }

    public static void com_lynx_tasm_ui_image_FrescoFilterImageView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_imageViewOnDetachedFromWindow(V9O v9o) {
        v9o.com_lynx_tasm_ui_image_FrescoFilterImageView__onDetachedFromWindow$___twin___();
        C54339LUh.LIZ(v9o);
    }

    @Override // X.V9P, X.VA9, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getTopLevelDrawable() != null && isUseShadowProcessor()) {
            getTopLevelDrawable().draw(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // X.V9P
    public void onPostprocessorPreparing(List<VA3> list) {
        if (isUseShadowProcessor()) {
            list.add(new C78748UvQ(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), getFrescoScaleType(), this.mShadowOffsetX, this.mShadowOffsetY, this.mShadowColor, this.mShadowRadius, this.mBlurRadius));
        }
    }

    @Override // X.V9P
    public void setBlurRadius(int i) {
        if (this.mBlurRadius != i) {
            this.mBlurRadius = i;
            markShadowDirty();
        }
    }

    @Override // X.V9P
    public void setBorderRadius(VQQ vqq) {
        super.setBorderRadius(vqq);
    }

    public void setShadowColor(int i) {
        if (this.mShadowColor != i) {
            this.mShadowColor = i;
            markShadowDirty();
        }
    }

    public void setShadowOffsetX(int i) {
        if (this.mShadowOffsetX != i) {
            this.mShadowOffsetX = i;
            markShadowDirty();
        }
    }

    public void setShadowOffsetY(int i) {
        if (this.mShadowOffsetY != i) {
            this.mShadowOffsetY = i;
            markShadowDirty();
        }
    }

    public void setShadowRadius(int i) {
        if (this.mShadowRadius != i) {
            this.mShadowRadius = i;
            markShadowDirty();
        }
    }

    public V9O(Context context, AbstractC81686W4c abstractC81686W4c, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, abstractC81686W4c, globalImageLoadListener, obj);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        configureBounds();
        return frame;
    }
}
