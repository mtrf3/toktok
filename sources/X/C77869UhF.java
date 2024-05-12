package X;

import Y.ALAdapterS10S0100000_13;
import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.UhF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77869UhF extends C29701Eo {
    private void init() {
        setImageFolder("images");
        addAnimatorListener(new ALAdapterS10S0100000_13(this, 19));
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
    }

    public C77869UhF(Context context) {
        super(context);
        init();
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public C77869UhF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public C77869UhF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
