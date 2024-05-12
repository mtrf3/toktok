package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Uv4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78726Uv4 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(String imagePath) {
        o.LJIIIZ(imagePath, "imagePath");
        if (ujb.o.LJJJLIIL(imagePath, "http", false) || ujb.o.LJJJLIIL(imagePath, "file://", false)) {
            return imagePath;
        }
        return i0.LJFF("file://", imagePath);
    }
}
