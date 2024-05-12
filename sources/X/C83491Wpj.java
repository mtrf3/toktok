package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83491Wpj extends TBS implements InterfaceC88471Ynr<Boolean, List<MediaModel>, C76800UCe> {
    public C83491Wpj(DiyPropVideoStickerHandler diyPropVideoStickerHandler) {
        super(2, diyPropVideoStickerHandler, DiyPropVideoStickerHandler.class, "onMediaPageLoaded", "onMediaPageLoaded(ZLjava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Wpb] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, List<MediaModel> list) {
        ?? r4;
        boolean booleanValue = bool.booleanValue();
        List<MediaModel> list2 = list;
        DiyPropVideoStickerHandler diyPropVideoStickerHandler = (DiyPropVideoStickerHandler) this.receiver;
        ((ArrayList) diyPropVideoStickerHandler.LJLJLJ).clear();
        if (booleanValue) {
            if (list2 != null) {
                r4 = new ArrayList(C32I.LJJL(list2, 10));
                for (MediaModel mediaModel : list2) {
                    List<String> list3 = diyPropVideoStickerHandler.LJLJLJ;
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
            ?? r2 = diyPropVideoStickerHandler.LJLILLLLZI;
            if (r2 != 0) {
                r2.LIZIZ();
                r2.LJIIIZ(r4);
                String str3 = diyPropVideoStickerHandler.LJLJJI;
                if (str3.length() > 0) {
                    r2.LJII(str3);
                }
                if (r4.isEmpty()) {
                    r2.LJFF();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
