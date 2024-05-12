package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class OGA {
    public final HashMap<Integer, C90T> LIZ = new HashMap<>();
    public final ONZ LIZIZ = new ONZ();
    public final List<Integer> LIZJ = C47261Igj.LJJIJIIJI(Integer.valueOf(OBQ.GREY_CARD.getType()), Integer.valueOf(OBQ.FORCE_VIDEO.getType()), Integer.valueOf(OBQ.FORCE_VIDEO_NO_COVER.getType()), Integer.valueOf(OBQ.BACKGROUND.getType()));

    public final C90T LIZ(Aweme aweme) {
        C90T onz;
        int LIZIZ = OMU.LIZIZ(aweme);
        if (!this.LIZJ.contains(Integer.valueOf(LIZIZ))) {
            return this.LIZIZ;
        }
        if (!this.LIZ.containsKey(Integer.valueOf(LIZIZ))) {
            HashMap<Integer, C90T> hashMap = this.LIZ;
            Integer valueOf = Integer.valueOf(LIZIZ);
            if (LIZIZ == OBQ.FORCE_VIDEO.getType() || LIZIZ == OBQ.FORCE_VIDEO_NO_COVER.getType()) {
                onz = this.LIZIZ;
            } else if (LIZIZ == OBQ.GREY_CARD.getType()) {
                onz = new C61794ONa();
            } else if (LIZIZ == OBQ.BACKGROUND.getType()) {
                onz = new ONY();
            } else {
                onz = new ONZ();
            }
            hashMap.put(valueOf, onz);
        }
        C90T c90t = this.LIZ.get(Integer.valueOf(LIZIZ));
        if (c90t != null) {
            return c90t;
        }
        return this.LIZIZ;
    }
}
