package X;

import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45450Hsc extends C82266WQk {
    public C45450Hsc(C82261WQf c82261WQf) {
        super(c82261WQf);
    }

    @Override // X.C82266WQk, X.InterfaceC82272WQq
    public final boolean LIZJ(C79155V4t filterMeta) {
        String str;
        o.LJIIIZ(filterMeta, "filterMeta");
        String string = C45451Hsd.LIZ.getString(String.valueOf(filterMeta.LIZ), "");
        o.LJIIIIZZ(string, "kevaStore.getString(filterMeta.id.toString(), \"\")");
        ToolsUrlModel toolsUrlModel = filterMeta.LJFF;
        if (toolsUrlModel != null && (str = toolsUrlModel.uri) != null && !o.LJ(string, str)) {
            return false;
        }
        return super.LIZJ(filterMeta);
    }

    @Override // X.C82266WQk
    public final boolean LJII(int i) {
        File[] listFiles;
        File file = new File(LIZIZ(i));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile() && o.LJ(file2.getName(), "config.json")) {
                return true;
            }
        }
        return false;
    }
}
