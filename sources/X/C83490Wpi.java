package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83490Wpi extends TBS implements InterfaceC88471Ynr<Boolean, List<? extends MediaModel>, C76800UCe> {
    public C83490Wpi(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
        super(2, backgroundVideoStickerPresenter, BackgroundVideoStickerPresenter.class, "onMediaPageLoaded", "onMediaPageLoaded(ZLjava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wpb] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, List<? extends MediaModel> list) {
        ?? r4;
        boolean booleanValue = bool.booleanValue();
        List<? extends MediaModel> list2 = list;
        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = (BackgroundVideoStickerPresenter) this.receiver;
        ((ArrayList) backgroundVideoStickerPresenter.LJLJL).clear();
        if (booleanValue) {
            if (list2 != null) {
                r4 = new ArrayList(C32I.LJJL(list2, 10));
                for (MediaModel mediaModel : list2) {
                    List<String> list3 = backgroundVideoStickerPresenter.LJLJL;
                    String str = mediaModel.fileLocalUriPath;
                    o.LJIIIIZZ(str, "mediaModel.fileLocalUriPath");
                    ((ArrayList) list3).add(str);
                    String str2 = mediaModel.fileLocalUriPath;
                    o.LJIIIIZZ(str2, "mediaModel.fileLocalUriPath");
                    C83489Wph c83489Wph = new C83489Wph(str2, mediaModel.duration);
                    c83489Wph.LJI = 2;
                    c83489Wph.LJIIL = mediaModel.fileName;
                    c83489Wph.LJIIJ = mediaModel.width;
                    c83489Wph.LJIIJJI = mediaModel.height;
                    c83489Wph.LJIILIIL = mediaModel.mimeType;
                    r4.add(c83489Wph);
                }
            } else {
                r4 = C61878OQg.INSTANCE;
            }
            ?? r3 = backgroundVideoStickerPresenter.LJLJI;
            if (r3 != 0) {
                r3.LIZIZ();
                r3.LJIIIZ(r4);
                String str3 = backgroundVideoStickerPresenter.LJLILLLLZI;
                if (str3.length() > 0) {
                    r3.LJII(str3);
                }
                C83493Wpl c83493Wpl = (C83493Wpl) backgroundVideoStickerPresenter.LJLJLJ.getValue();
                c83493Wpl.LIZLLL = System.currentTimeMillis();
                c83493Wpl.LJI = r4.size();
                if (c83493Wpl.LIZJ()) {
                    backgroundVideoStickerPresenter.LJZI.LJIJ(c83493Wpl.LIZ());
                }
                c83493Wpl.LIZIZ();
                if (r4.isEmpty()) {
                    r3.LJFF();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
