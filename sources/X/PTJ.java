package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import org.apache.commons.io.DirectoryWalker;
import org.apache.commons.io.FileUtils;

/* loaded from: classes12.dex */
public class PTJ extends DirectoryWalker<PTK> {
    @Override // org.apache.commons.io.DirectoryWalker
    public final void handleFile(File file, int i, Collection<PTK> collection) {
        super.handleFile(file, i, collection);
        try {
            long parseLong = CastLongProtector.parseLong(file.getName());
            String readFileToString = FileUtils.readFileToString(file, Charset.forName("UTF-8"));
            PTK ptk = new PTK();
            ptk.LIZIZ = readFileToString;
            ptk.LIZ = parseLong;
            collection.add(ptk);
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
