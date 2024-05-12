package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GQW extends GQR {
    public final ActivityC45651qj LIZ;
    public final VideoPublishEditModel LIZIZ;

    @Override // X.GQR
    public final List<AbstractC41508GQu> LIZ() {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = this.LIZIZ.infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StickerItemModel next = it.next();
                if (next.type == 4) {
                    if (next != null) {
                        String userName = this.LIZIZ.commentVideoModel.getUserName();
                        if (userName == null) {
                            userName = "";
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(this.LIZ.getString(R.string.dlk, QZZ.LIZIZ('@', userName)));
                        LIZ.append(" ");
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        o.LJIIIIZZ(LIZIZ, "StringBuilder().append(p…)\n            .toString()");
                        ArrayList arrayList = new ArrayList();
                        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, userName, 0, false, 6) - 1;
                        int length = userName.length() + LJJLIIIJL + 1;
                        String userId = this.LIZIZ.commentVideoModel.getUserId();
                        if (userId == null) {
                            userId = CardStruct.IStatusCode.DEFAULT;
                        }
                        AVTextExtraStruct createCommentStruct = AVTextExtraStructHelper.createCommentStruct(LJJLIIIJL, length, userId);
                        arrayList.add(AVTextExtraStructHelper.createCommentChainBoundaryStruct(LIZIZ));
                        arrayList.add(createCommentStruct);
                        GQL.LIZIZ(arrayList, true);
                        C45322HqY c45322HqY = new C45322HqY((CharSequence) LIZIZ, (List) arrayList);
                        CharSequence charSequence = c45322HqY.LJLJI;
                        List list2 = c45322HqY.LJLILLLLZI;
                        C41495GQh c41495GQh = new C41495GQh(new GQU());
                        c41495GQh.LJI(charSequence, list2);
                        return c41495GQh.LIZ();
                    }
                }
            }
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.GQR
    public final GQV LIZJ() {
        return GQV.REPLY_COMMENT_CHAIN;
    }

    @Override // X.GQR
    public final void LIZLLL(List<AbstractC41508GQu> original) {
        o.LJIIIZ(original, "original");
        Iterator<AbstractC41508GQu> it = original.iterator();
        while (it.hasNext()) {
            AbstractC41508GQu next = it.next();
            if (next instanceof C41513GQz) {
                it.remove();
                if (it.hasNext()) {
                    GQR.LJ(it.next());
                    return;
                }
                return;
            }
            if (!GQR.LIZIZ(next)) {
                return;
            }
        }
    }

    public GQW(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LIZ = activityC45651qj;
        this.LIZIZ = videoPublishEditModel;
    }
}
