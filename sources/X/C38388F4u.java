package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.F4u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38388F4u {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Dialog dialog) {
        Object LIZ;
        View view;
        Object tag;
        try {
            Field mWindowField = Dialog.class.getDeclaredField("mWindow");
            o.LJIIIIZZ(mWindowField, "mWindowField");
            boolean z = true;
            mWindowField.setAccessible(true);
            Object obj = mWindowField.get(dialog);
            String str = null;
            if (!(obj instanceof Window)) {
                obj = null;
            }
            Window window = (Window) obj;
            if (window != null) {
                view = window.peekDecorView();
            } else {
                view = null;
            }
            if (view != null && (tag = view.getTag(R.id.ni3)) != 0) {
                if (tag instanceof String) {
                    str = tag;
                }
                str = str;
                if (str != null && str.length() != 0) {
                    z = false;
                }
            }
            if ((z || !ujb.o.LJJJLIIL(str, "Dialog#", false)) && view != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Dialog#");
                LIZ2.append(C16880lQ.LJLLILLLL(dialog.getClass()));
                view.setTag(R.id.ni3, X1D.LIZIZ(LIZ2));
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("error occured. ");
            LIZ3.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
            X1D.LIZIZ(LIZ3);
        }
    }
}
