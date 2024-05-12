package X;

import Y.ACallableS24S1300000_2;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* renamed from: X.67i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1552267i {
    public abstract String LIZIZ(int i, String str);

    public static Bitmap LIZJ(View view, ViewGroup viewGroup) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(C6PB.LIZ().getResources().getDisplayMetrics().densityDpi);
            Canvas canvas = new Canvas(createBitmap);
            view.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 1073741824));
            view.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(view, canvas);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            C6PB.LIZJ();
            C6PB.LIZJ().LIZIZ(e);
            return null;
        }
    }

    public final C10K LIZ(final View view, View view2, String str, int i, int i2, final int i3, final int i4) {
        final int i5 = i2;
        final int i6 = i;
        if (view == null || view2 == null || TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stickerView = ");
            LIZ.append(view);
            LIZ.append(", stickerLayout = ");
            LIZ.append(view2);
            LIZ.append("draftDir = ");
            LIZ.append(str);
            return C10K.LJIIIIZZ(new NullPointerException(X1D.LIZIZ(LIZ)));
        }
        final String LIZIZ = LIZIZ(((ViewGroup) view2).indexOfChild(view), str);
        File file = new File(LIZIZ);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    C44687HgJ.LJIILIIL(LIZIZ);
                } else {
                    C16880lQ.LLLZZIL(file);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C44687HgJ.LJFF(LIZIZ, true);
        if (i6 == 0) {
            i6 = C6PB.LIZLLL().LIZ;
        }
        if (i5 == 0) {
            i5 = C6PB.LIZLLL().LIZIZ;
        }
        return C10K.LIZIZ(new ACallableS24S1300000_2(this, LIZIZ, view2, view, 1), C10K.LJIIIIZZ, null).LJIILLIIL(new C10I() { // from class: X.67K
            @Override // X.C10I
            public final Object then(C10K c10k) {
                C67J c67j;
                int i7 = i6;
                int i8 = i5;
                int i9 = i3;
                int i10 = i4;
                String str2 = LIZIZ;
                View view3 = view;
                Bitmap LIZ2 = C140585fS.LIZ(((C67L) c10k.LJIIJJI()).LIZ, i7, i8, i9, i10);
                if (C42299Git.LJFF(LIZ2, new File(str2), 100, Bitmap.CompressFormat.PNG)) {
                    c67j = new C67J(str2, ((C67L) c10k.LJIIJJI()).LIZIZ.intValue(), view3.hashCode());
                } else {
                    c67j = null;
                }
                C42299Git.LJ(((C67L) c10k.LJIIJJI()).LIZ);
                C42299Git.LJ(LIZ2);
                return c67j;
            }
        }, C10K.LJI);
    }
}
