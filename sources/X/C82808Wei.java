package X;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.Wei, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82808Wei implements FilenameFilter {
    public final /* synthetic */ OJD LIZ;

    public C82808Wei(OJD ojd) {
        this.LIZ = ojd;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        OJD ojd = this.LIZ;
        o.LJIIIIZZ(name, "name");
        return ojd.matches(name);
    }
}
