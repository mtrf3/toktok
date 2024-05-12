package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* renamed from: X.6pE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C172126pE extends SurfaceView {
    public YTN LJLIL;

    @Override // android.view.SurfaceView
    public SurfaceHolder getHolder() {
        return this.LJLIL;
    }

    public C172126pE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = new YTN(super.getHolder());
    }
}
