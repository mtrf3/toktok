package X;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.Wej, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82809Wej implements FilenameFilter {
    public final /* synthetic */ String LIZ;

    public C82809Wej(String str) {
        this.LIZ = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return !o.LJ(str, this.LIZ);
    }
}
