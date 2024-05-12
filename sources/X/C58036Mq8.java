package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mq8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58036Mq8 {
    public static final void LIZ(SJO sjo, C57846Mn4 c57846Mn4) {
        Integer valueOf;
        Bitmap bitmap = null;
        if (c57846Mn4 != null && (valueOf = Integer.valueOf(c57846Mn4.LIZ)) != null) {
            if (valueOf.intValue() == 103 || valueOf.intValue() == 104) {
                return;
            }
            if (valueOf != null) {
                if (valueOf.intValue() == 100) {
                    sjo.setPathToClip(C58037Mq9.LJLIL);
                    Drawable drawable = EF7.LIZIZ().getDrawable(R.drawable.b9_);
                    if (drawable != null) {
                        bitmap = C1DH.LJJJ(drawable, C7MY.LIZIZ(24), O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), 4);
                    }
                    sjo.setBitmap(bitmap);
                    sjo.setMatrixOfBitmap(C58039MqB.LJLIL);
                    return;
                }
                if (valueOf.intValue() == 101 || valueOf.intValue() == 102) {
                    sjo.setPathToClip(C58038MqA.LJLIL);
                    Drawable drawable2 = EF7.LIZIZ().getDrawable(R.drawable.b9_);
                    if (drawable2 != null) {
                        bitmap = C1DH.LJJJ(drawable2, C7MY.LIZIZ(24), O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), 4);
                    }
                    sjo.setBitmap(bitmap);
                    sjo.setMatrixOfBitmap(C58040MqC.LJLIL);
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mlbb badge does not supported current variant: ");
                LIZ.append(c57846Mn4.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        sjo.setBitmap(null);
    }

    public static final void LIZIZ(SJO sjo, User user, C57846Mn4 uiConfig) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(uiConfig, "uiConfig");
        if (C53211KuV.LIZ(user)) {
            LIZ(sjo, uiConfig);
        } else {
            LIZ(sjo, null);
        }
    }
}
