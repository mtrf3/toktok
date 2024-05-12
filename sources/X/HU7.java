package X;

import com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl;

/* loaded from: classes8.dex */
public final class HU7 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final HU7 LJLIL = new HU7();

    public HU7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('-');
        int i = CreativePathWorkspaceImpl.concatVideoIndex;
        CreativePathWorkspaceImpl.concatVideoIndex = i + 1;
        LIZ.append(i);
        LIZ.append("-concat-v");
        return C43075GvP.LIZ(X1D.LIZIZ(LIZ));
    }
}
