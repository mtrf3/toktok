package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.1mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C42901mI extends AbstractC33071Rn {
    public static final /* synthetic */ int LIZIZ = 0;

    @Override // X.AbstractC33071Rn
    public final boolean LIZIZ() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }
}
