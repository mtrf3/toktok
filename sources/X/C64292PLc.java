package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.PLc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64292PLc implements FilenameFilter {
    public final /* synthetic */ String LIZ;

    public C64292PLc(String str) {
        this.LIZ = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.contains(this.LIZ);
    }
}
