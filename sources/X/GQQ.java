package X;

import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GQQ extends GQR {
    public final VideoPublishEditModel LIZ;

    @Override // X.GQR
    public final List<AbstractC41508GQu> LIZ() {
        String str;
        if (!H7R.LJJIJIL(this.LIZ)) {
            return C61878OQg.INSTANCE;
        }
        DefaultPostContentModel defaultPostContentModel = this.LIZ.creativeModel.initialModel.defaultPostContentModel;
        if (defaultPostContentModel == null || (str = defaultPostContentModel.defaultDescription) == null) {
            str = "";
        }
        C41495GQh c41495GQh = new C41495GQh(new GQU());
        c41495GQh.LJI(str, C61878OQg.INSTANCE);
        return c41495GQh.LIZ();
    }

    @Override // X.GQR
    public final GQV LIZJ() {
        return GQV.DEFAULT;
    }

    public GQQ(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LIZ = videoPublishEditModel;
    }

    @Override // X.GQR
    public final void LIZLLL(List<AbstractC41508GQu> original) {
        DefaultPostContentModel defaultPostContentModel;
        String str;
        o.LJIIIZ(original, "original");
        if (!H7R.LJJIJIL(this.LIZ) || (defaultPostContentModel = this.LIZ.creativeModel.initialModel.defaultPostContentModel) == null || (str = defaultPostContentModel.defaultDescription) == null) {
            return;
        }
        Iterator<AbstractC41508GQu> it = original.iterator();
        while (it.hasNext()) {
            AbstractC41508GQu next = it.next();
            if (next instanceof C41503GQp) {
                String charSequence = s.LJZI(next.LJIILL()).toString();
                if (charSequence.length() == 0) {
                    continue;
                } else if (!ujb.o.LJJJLIIL(str, charSequence, false)) {
                    return;
                } else {
                    it.remove();
                }
            }
        }
    }
}
