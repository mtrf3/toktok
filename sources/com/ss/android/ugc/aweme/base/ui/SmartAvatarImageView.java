package com.ss.android.ugc.aweme.base.ui;

import X.C72434Sbm;
import X.InterfaceC78716Uuu;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class SmartAvatarImageView extends C72434Sbm {
    public static Drawable LJLLLLLL;

    @Override // X.C72434Sbm, com.bytedance.lighten.loader.SmartImageView
    public final void LIZIZ() {
        super.LIZIZ();
        if (LJLLLLLL == null) {
            LJLLLLLL = getResources().getDrawable(R.drawable.b0p);
        }
        Drawable drawable = LJLLLLLL;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap != null) {
                getHierarchy().LJIJJ(new BitmapDrawable(getResources(), bitmap), InterfaceC78716Uuu.LJJLIIIJILLIZJL);
                return;
            } else {
                getHierarchy().LJIJI(R.drawable.b0p, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
                return;
            }
        }
        getHierarchy().LJIJI(R.drawable.b0p, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
    }

    public SmartAvatarImageView(Context context) {
        super(context);
    }

    public SmartAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmartAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
