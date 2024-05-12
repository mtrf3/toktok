package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GwR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43139GwR extends AbstractC43136GwO<C76800UCe> {
    public final ActivityC45651qj LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final ShortVideoContext LIZLLL;
    public final FaceStickerBean LJ;
    public final int LJFF;
    public final boolean LJI;
    public final ExtractFramesModel LJII;
    public final MediaModel LJIIIIZZ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C43139GwR(ActivityC45651qj activity, String photoPath, List<String> list, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, int i, boolean z, ExtractFramesModel extractFramesModel, MediaModel mediaModel, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(photoPath, "photoPath");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = activity;
        this.LIZIZ = photoPath;
        this.LIZJ = list;
        this.LIZLLL = shortVideoContext;
        this.LJ = faceStickerBean;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = extractFramesModel;
        this.LJIIIIZZ = mediaModel;
        this.LJIIIZ = interfaceC88472Yns;
    }
}
