package X;

import com.ss.android.ugc.aweme.relation.storage.experiment.StorageConfig;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.3gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90343gc {
    public static final StorageConfig LIZ = new StorageConfig(0, 86400000L, 172800000L, 5, null, 0, 48, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C90353gd.LJLIL);

    public static boolean LIZ() {
        Integer num = ((StorageConfig) LIZIZ.getValue()).enable;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        if (C35971E9v.LIZ() && ((Number) C90363ge.LIZ.getValue()).intValue() == 1 && o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }
}
