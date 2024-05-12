package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes7.dex */
public final class FPK {
    public String LJ;
    public boolean LJFF;
    public final List<String> LIZ = new ArrayList();
    public final java.util.Set<String> LIZIZ = new HashSet();
    public String LIZJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LIZLLL = CardStruct.IStatusCode.DEFAULT;
    public final List<FPJ> LJI = new ArrayList();

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cart_");
        LIZ.append(this.LIZJ);
        LIZ.append("_");
        return JBR.LJFF(LIZ, this.LIZLLL, ".prof", LIZ);
    }
}
