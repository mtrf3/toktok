package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HU5 {
    public static final /* synthetic */ int LIZ = 0;

    public static final Workspace LIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return new Workspace(new CreativePathWorkspaceImpl(creativeInfo));
    }

    public static final Workspace LIZIZ(CreativeInfo creativeInfo, String str) {
        CreativePathWorkspaceImpl creativePathWorkspaceImpl = new CreativePathWorkspaceImpl(creativeInfo);
        creativePathWorkspaceImpl.concatVideoPath = null;
        creativePathWorkspaceImpl.concatAudioPath = null;
        creativePathWorkspaceImpl.mMusicPath = str;
        return new Workspace(creativePathWorkspaceImpl);
    }
}
