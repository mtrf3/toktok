package X;

import com.ss.android.ugc.aweme.shortvideo.video2sticker.Video2StickerEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.ui.Video2StickerEditActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.HZe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44274HZe implements InterfaceC80245VeT {
    public final /* synthetic */ Video2StickerEditActivity LIZ;

    public C44274HZe(Video2StickerEditActivity video2StickerEditActivity) {
        this.LIZ = video2StickerEditActivity;
    }

    @Override // X.InterfaceC80245VeT
    public final WM7 LIZ(ClassLoader classLoader, String str) {
        o.LJIIIZ(classLoader, "<anonymous parameter 0>");
        o.LJIIIZ(str, "<anonymous parameter 1>");
        Video2StickerEditRootScene video2StickerEditRootScene = new Video2StickerEditRootScene();
        this.LIZ.LJLJI = video2StickerEditRootScene;
        return video2StickerEditRootScene;
    }
}
