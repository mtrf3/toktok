package X;

import com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl;

/* loaded from: classes8.dex */
public final class HU8 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final HU8 LJLIL = new HU8();

    public HU8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('-');
        int i = CreativePathWorkspaceImpl.recordMP4Index;
        CreativePathWorkspaceImpl.recordMP4Index = i + 1;
        LIZ.append(i);
        LIZ.append(".mp4");
        return C43075GvP.LIZ(X1D.LIZIZ(LIZ));
    }
}