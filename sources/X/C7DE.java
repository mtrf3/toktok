package X;

import android.content.Context;
import android.widget.Scroller;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.7DE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7DE extends Scroller {
    public final int LIZ;
    public boolean LIZIZ;

    public C7DE(Context context) {
        super(context);
        this.LIZ = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        if (this.LIZIZ) {
            super.startScroll(i, i2, i3, i4);
        } else {
            startScroll(i, i2, i3, i4, this.LIZ);
        }
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        if (!this.LIZIZ) {
            i5 = this.LIZ;
        }
        super.startScroll(i, i2, i3, i4, i5);
    }
}
