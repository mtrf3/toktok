package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GX9 implements FilenameFilter {
    public final /* synthetic */ CreativeInfo LIZ;

    public GX9(CreativeInfo creativeInfo) {
        this.LIZ = creativeInfo;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return !o.LJ(str, String.valueOf(this.LIZ.getVersion()));
    }
}
