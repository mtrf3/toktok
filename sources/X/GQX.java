package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GQX extends GQR {
    public final ActivityC45651qj LIZ;
    public final VideoPublishEditModel LIZIZ;

    @Override // X.GQR
    public final List<AbstractC41508GQu> LIZ() {
        InteractStickerStruct interactStickerStruct;
        QaStruct qaStruct;
        int i;
        int i2;
        List<InteractStickerStruct> LJI = C164826dS.LJI(this.LIZIZ.getMainBusinessContext(), 12, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJI != null) {
            Iterator<InteractStickerStruct> it = LJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    interactStickerStruct = it.next();
                    if (interactStickerStruct.getQaStruct() != null) {
                        break;
                    }
                } else {
                    interactStickerStruct = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
            if (interactStickerStruct2 != null && (qaStruct = interactStickerStruct2.getQaStruct()) != null) {
                if (qaStruct.getQuestionId() == 0) {
                    i = R.string.pqh;
                    i2 = 5;
                } else {
                    i = R.string.pqg;
                    i2 = 7;
                }
                String userName = qaStruct.getUserName();
                if (userName == null) {
                    userName = "";
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZ.getString(i, QZZ.LIZIZ('@', userName)));
                LIZ.append(" ");
                String LIZIZ = X1D.LIZIZ(LIZ);
                o.LJIIIIZZ(LIZIZ, "StringBuilder().append(p…)\n            .toString()");
                ArrayList arrayList = new ArrayList();
                int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, userName, 0, false, 6) - 1;
                AVTextExtraStruct createQaStickerStruct = AVTextExtraStructHelper.createQaStickerStruct(LJJLIIIJL, userName.length() + LJJLIIIJL + 1, String.valueOf(qaStruct.getUserId()), i2);
                arrayList.add(AVTextExtraStructHelper.createQAStickerChainBoundaryStruct(LIZIZ, i2));
                arrayList.add(createQaStickerStruct);
                arrayList.addAll(GQL.LIZ(LIZIZ, arrayList));
                GQL.LIZIZ(arrayList, true);
                C45322HqY c45322HqY = new C45322HqY((CharSequence) LIZIZ, (List) arrayList);
                CharSequence charSequence = c45322HqY.LJLJI;
                List list = c45322HqY.LJLILLLLZI;
                C41495GQh c41495GQh = new C41495GQh(new GQU());
                c41495GQh.LJI(charSequence, list);
                return c41495GQh.LIZ();
            }
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.GQR
    public final GQV LIZJ() {
        return GQV.QA_STICKER_CHAIN;
    }

    @Override // X.GQR
    public final void LIZLLL(List<AbstractC41508GQu> original) {
        o.LJIIIZ(original, "original");
        Iterator<AbstractC41508GQu> it = original.iterator();
        while (it.hasNext()) {
            AbstractC41508GQu next = it.next();
            if ((next instanceof GR1) || (next instanceof GR0)) {
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

    public GQX(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LIZ = activityC45651qj;
        this.LIZIZ = videoPublishEditModel;
    }
}
