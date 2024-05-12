package X;

import Y.ALAdapterS10S0100000_13;
import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.UhH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77871UhH extends C29701Eo {
    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
        C54339LUh.LIZ(this);
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public C77871UhH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageFolder("images");
        addAnimatorListener(new ALAdapterS10S0100000_13(this, 47));
    }
}
