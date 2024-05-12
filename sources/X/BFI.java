package X;

import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class BFI {
    public static final C5H3 LIZ = C78996UzQ.LJJIJIIJI(BFH.LJLIL);
    public static DataChannel LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static DrawGuessWord LJ;

    public static void LIZIZ() {
        LIZJ = true;
        C1EW.LIZ(((DrawGuessApi) C1A.LIZJ(DrawGuessApi.class)).getWordList(C29306Beo.LJJIZ(LIZIZ))).LJJJLIIL(BFJ.LJLIL, BFK.LJLIL);
    }

    public static DrawGuessWord LIZ() {
        DrawGuessWord drawGuessWord = null;
        if (!LIZLLL) {
            return null;
        }
        C5H3 c5h3 = LIZ;
        if (((ArrayList) c5h3.getValue()).size() < 3 && !LIZJ) {
            LIZIZ();
        }
        ArrayList arrayList = (ArrayList) c5h3.getValue();
        if (!arrayList.isEmpty()) {
            drawGuessWord = (DrawGuessWord) ListProtector.remove(arrayList, 0);
        }
        LJ = drawGuessWord;
        return drawGuessWord;
    }
}
