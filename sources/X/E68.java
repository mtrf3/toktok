package X;

import com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection;
import com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene;

/* loaded from: classes7.dex */
public class E68 {
    public static final TooltipProtectionModel$TooltipDataProtection LIZ;

    public int LIZ(E67 e67) {
        throw null;
    }

    public boolean LIZIZ(E67 e67) {
        throw null;
    }

    static {
        E6G e6g = E6G.FEED;
        int value = e6g.getValue();
        Integer[] numArr = {Integer.valueOf(E69.FOLLOW_LIVE.getValue()), Integer.valueOf(E69.NOW_GUIDE.getValue()), Integer.valueOf(E69.POST_NOW.getValue()), Integer.valueOf(E69.MAKE_ANOTHER_VIDEO.getValue())};
        E6G e6g2 = E6G.MUSIC_DETAIL;
        E6G e6g3 = E6G.SHOOT;
        LIZ = new TooltipProtectionModel$TooltipDataProtection(C47261Igj.LJJIJIIJI(new TooltipProtectionModel$TooltipsByScene(value, C47261Igj.LJJIJIIJI(numArr)), new TooltipProtectionModel$TooltipsByScene(e6g2.getValue(), C47261Igj.LJJIJ(Integer.valueOf(E6A.FAVORITE_SOUND.getValue()))), new TooltipProtectionModel$TooltipsByScene(e6g3.getValue(), C47261Igj.LJJIJ(Integer.valueOf(E6E.GO_LIVE.getValue())))), null, C47261Igj.LJJIJIIJI(Integer.valueOf(e6g.getValue()), Integer.valueOf(e6g2.getValue()), Integer.valueOf(e6g3.getValue())), Boolean.TRUE, 2, null);
    }
}
