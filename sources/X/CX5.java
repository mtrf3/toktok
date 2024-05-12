package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class CX5 extends FrameLayout {
    public final ImageView LJLIL;
    public final ImageView LJLILLLLZI;
    public final ImageView LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    public void setAvatar(ImageModel imageModel) {
        if (imageModel != null) {
            ImageView imageView = this.LJLIL;
            int i = this.LJLJJI;
            C31665Cbl.LJIIJ(imageView, imageModel, i, i, R.drawable.d65);
        }
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (imageModel != null) {
            this.LJLILLLLZI.setVisibility(0);
            ImageView imageView = this.LJLILLLLZI;
            int i = this.LJLJJL;
            C31665Cbl.LIZLLL(imageView, imageModel, i, i);
            return;
        }
        this.LJLILLLLZI.setVisibility(8);
    }

    public void setIcon(ImageModel imageModel) {
        if (imageModel != null) {
            this.LJLJI.setVisibility(0);
            ImageView imageView = this.LJLJI;
            int i = this.LJLJJLL;
            C15640jQ.LIZJ(i, i, -1, imageView, imageModel, null, false);
            return;
        }
        this.LJLJI.setVisibility(4);
    }

    public void setAvatar(int i) {
        C15640jQ.LJIIJ(this.LJLIL, i, -1, -1);
    }

    public CX5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int LIZJ = (int) KL2.LIZJ(context, 100.0f);
        this.LJLJJI = LIZJ;
        int LIZJ2 = (int) KL2.LIZJ(context, 42.0f);
        this.LJLJJLL = LIZJ2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bo5, R.attr.bo6, R.attr.box});
            this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(1, LIZJ);
            this.LJLJJL = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.LJLJJLL = obtainStyledAttributes.getDimensionPixelSize(2, LIZJ2);
            obtainStyledAttributes.recycle();
        }
        ImageView imageView = new ImageView(context);
        this.LJLIL = imageView;
        int i = this.LJLJJI;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.LJLILLLLZI = imageView2;
        int i2 = this.LJLJJL;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        imageView2.setLayoutParams(layoutParams2);
        addView(imageView2);
        ImageView imageView3 = new ImageView(context);
        this.LJLJI = imageView3;
        int i3 = this.LJLJJLL;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams3.bottomMargin = (int) KL2.LIZJ(context, 3.0f);
        layoutParams3.rightMargin = (int) KL2.LIZJ(context, 2.0f);
        layoutParams3.gravity = 8388693;
        imageView3.setLayoutParams(layoutParams3);
        addView(imageView3);
        imageView3.setVisibility(4);
    }
}
