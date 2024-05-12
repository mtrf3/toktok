package X;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.IvS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48174IvS extends C48170IvO {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48174IvS(File file, File file2, String str) {
        super(file, file2, str);
        o.LJIIIZ(file, "file");
    }

    public /* synthetic */ C48174IvS(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}
