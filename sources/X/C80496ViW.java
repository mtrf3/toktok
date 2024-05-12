package X;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: X.ViW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80496ViW extends Property<ImageView, Matrix> {
    public final Matrix LIZ;

    public C80496ViW() {
        super(Matrix.class, "imageMatrixProperty");
        this.LIZ = new Matrix();
    }

    @Override // android.util.Property
    public final Matrix get(ImageView imageView) {
        this.LIZ.set(imageView.getImageMatrix());
        return this.LIZ;
    }

    @Override // android.util.Property
    public final void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
