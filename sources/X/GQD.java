package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GQD {
    public final ActivityC45651qj LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final GB1<AVTextExtraStruct> LIZJ;
    public final C62822Ol8 LIZLLL;

    public final void LIZ() {
        CaptionModel captionModel = this.LIZIZ.creativeModel.postPageModel.captionModel;
        String str = captionModel.markupText;
        if (str == null) {
            str = "";
        }
        List<AVTextExtraStruct> metadata = captionModel.markupExtra;
        GB1<AVTextExtraStruct> gb1 = this.LIZJ;
        gb1.getClass();
        o.LJIIIZ(metadata, "metadata");
        List<AbstractC41507GQt<AVTextExtraStruct>> LIZJ = gb1.LIZIZ.LIZJ(str, metadata);
        ((ArrayList) gb1.LJ).clear();
        ((ArrayList) gb1.LJ).addAll(LIZJ);
        if (this.LIZIZ.creativeModel.editPostModel == null) {
            List<AbstractC41507GQt<AVTextExtraStruct>> list = this.LIZJ.LJ;
            o.LJII(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.lexical.platform.textblock.TikTokLexicalTextBlock>");
            List<AbstractC41508GQu> LIZIZ = C65777Prh.LIZIZ(list);
            ArrayList arrayList = new ArrayList();
            for (GQR gqr : (List) this.LIZLLL.getValue()) {
                gqr.LIZLLL(LIZIZ);
                List<AbstractC41508GQu> LIZ = gqr.LIZ();
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(LIZ, 10));
                for (AbstractC41508GQu abstractC41508GQu : LIZ) {
                    abstractC41508GQu.getClass();
                    arrayList2.add(abstractC41508GQu);
                }
                arrayList.addAll(arrayList2);
            }
            LIZIZ.addAll(0, arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    public final void LIZIZ() {
        List<AbstractC41507GQt<AVTextExtraStruct>> list = this.LIZJ.LJ;
        o.LJII(list, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.lexical.platform.textblock.TikTokLexicalTextBlock>");
        Iterator it = ((ArrayList) list).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            AbstractC41508GQu abstractC41508GQu = (AbstractC41508GQu) it.next();
            if (abstractC41508GQu.LJJ()) {
                arrayList.add(abstractC41508GQu);
            } else if (!OAC.LJIIIZ(abstractC41508GQu)) {
                break;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        int i = 0;
        String str = "";
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i + 1;
            if (i >= 0) {
                AbstractC41508GQu abstractC41508GQu2 = (AbstractC41508GQu) next;
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = abstractC41508GQu2.LJIILL();
                if (i != arrayList.size() - 1) {
                    StringBuilder LIZ = X1D.LIZ();
                    c68322mC.element = q.LIZIZ(LIZ, (String) c68322mC.element, ' ', LIZ);
                }
                AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(c68322mC, 752);
                if (abstractC41508GQu2.LJJ()) {
                    AVTextExtraStruct LJIJI = abstractC41508GQu2.LJIJI(aqS157S0100000_7);
                    LJIJI.start += i2;
                    LJIJI.end += i2;
                    arrayList2.add(LJIJI);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append((String) c68322mC.element);
                    str = X1D.LIZIZ(LIZ2);
                    i2 += ((String) c68322mC.element).length();
                    i = i3;
                } else {
                    throw new UnsupportedOperationException("Can't new boundary metadata for non-chain type text block");
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        PostPageModel postPageModel = videoPublishEditModel.creativeModel.postPageModel;
        CaptionModel captionModel = postPageModel.captionModel;
        captionModel.chain = str;
        captionModel.disableDeleteChain = true;
        postPageModel.transientExtra = arrayList2;
        videoPublishEditModel.setChain(str);
    }

    public GQD(ActivityC45651qj activityC45651qj, VideoPublishEditModel editModel, GB1<AVTextExtraStruct> gb1) {
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = activityC45651qj;
        this.LIZIZ = editModel;
        this.LIZJ = gb1;
        this.LIZLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 751));
    }
}
