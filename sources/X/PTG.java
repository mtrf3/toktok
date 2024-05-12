package X;

import java.io.File;
import java.util.Collection;
import org.apache.commons.io.DirectoryWalker;

/* loaded from: classes12.dex */
public class PTG extends DirectoryWalker<File> {
    @Override // org.apache.commons.io.DirectoryWalker
    public final void handleFile(File file, int i, Collection<File> collection) {
        super.handleFile(file, i, collection);
        collection.add(file);
    }
}
