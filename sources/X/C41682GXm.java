package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import kotlin.jvm.internal.o;

/* renamed from: X.GXm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41682GXm {
    public final String LIZ;
    public final CanvasBackground LIZIZ;
    public final Bitmap LIZJ;
    public final GZX LIZLLL;

    public C41682GXm(String filePath, CanvasBackground background, Bitmap bitmap, GZX generateNickNameStickerResult) {
        o.LJIIIZ(filePath, "filePath");
        o.LJIIIZ(background, "background");
        o.LJIIIZ(generateNickNameStickerResult, "generateNickNameStickerResult");
        this.LIZ = filePath;
        this.LIZIZ = background;
        this.LIZJ = bitmap;
        this.LIZLLL = generateNickNameStickerResult;
    }
}
