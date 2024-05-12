package X;

import Y.ACListenerS32S0100000_12;
import Y.ACListenerS46S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Sim, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72868Sim extends RelativeLayout {
    public static final /* synthetic */ int LJLJI = 0;
    public ImageView LJLIL;
    public ImageView LJLILLLLZI;

    public static Activity LIZ(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    public void setBackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.LJLIL;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS46S0200000_12(this, onClickListener, 20));
        }
    }

    public void setFlashLightClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, onClickListener);
        }
    }

    public void setPhotoPickerListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, onClickListener);
        }
    }

    public void setShowFlashLight(int i) {
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setTorch(boolean z) {
        int i;
        ImageView imageView = this.LJLILLLLZI;
        if (z) {
            i = R.drawable.b0y;
        } else {
            i = R.drawable.b0x;
        }
        imageView.setBackgroundResource(i);
    }

    public C72868Sim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cqi, C16880lQ.LLZIL(getContext()), this);
        this.LJLIL = (ImageView) LLLZIIL.findViewById(R.id.m0_);
        this.LJLILLLLZI = (ImageView) LLLZIIL.findViewById(R.id.mdx);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.x7, R.attr.a1a, R.attr.a1b, R.attr.adb});
            if (obtainStyledAttributes.getBoolean(1, true) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                this.LJLIL.setBackgroundResource(resourceId);
            }
            ImageView imageView = this.LJLILLLLZI;
            if (imageView != null) {
                imageView.setBackgroundResource(R.drawable.b23);
            }
            obtainStyledAttributes.recycle();
        }
        C16880lQ.LJIILLIIL(this.LJLIL, new ACListenerS32S0100000_12(this, 113));
    }
}
