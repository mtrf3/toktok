package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.HBk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43656HBk {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C43657HBl.LJLIL);

    public static void LIZ(CreativeInfo creativeInfo, NowsShootModel shootModel, Bitmap bitmap, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = z2;
        boolean z5 = z3;
        if ((i & 16) != 0) {
            z4 = false;
        }
        if ((i & 32) != 0) {
            z5 = false;
        }
        o.LJIIIZ(shootModel, "shootModel");
        o.LJIIIZ(bitmap, "bitmap");
        LIZ.set(false);
        XKX.LIZLLL((InterfaceC70422pa) LIZIZ.getValue(), null, null, new C43655HBj(z4, bitmap, creativeInfo, z, z5, shootModel, null), 3);
    }
}
