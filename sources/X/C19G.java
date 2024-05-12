package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.19G, reason: invalid class name */
/* loaded from: classes.dex */
public class C19G extends C21330sb {
    public boolean LJLILLLLZI;

    public C19G(Drawable drawable) {
        super(drawable);
        this.LJLILLLLZI = true;
    }

    @Override // X.C21330sb, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LJLILLLLZI) {
            super.draw(canvas);
        }
    }

    @Override // X.C21330sb, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.LJLILLLLZI) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // X.C21330sb, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.LJLILLLLZI) {
            super.setHotspot(f, f2);
        }
    }

    @Override // X.C21330sb, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.LJLILLLLZI) {
            return super.setVisible(z, z2);
        }
        return false;
    }

    @Override // X.C21330sb, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.LJLILLLLZI) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }
}
