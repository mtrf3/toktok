package X;

import android.util.Pair;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.util.Comparator;

/* renamed from: X.IbD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C46919IbD implements Comparator {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ C46919IbD(int i) {
        this.LJLIL = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int bitRate;
        int bitRate2;
        switch (this.LJLIL) {
            case 0:
                bitRate = ((SimBitRate) ((Pair) obj2).second).getBitRate();
                bitRate2 = ((SimBitRate) ((Pair) obj).second).getBitRate();
                break;
            default:
                bitRate = ((SimBitRate) ((Pair) obj2).second).getBitRate();
                bitRate2 = ((SimBitRate) ((Pair) obj).second).getBitRate();
                break;
        }
        return bitRate - bitRate2;
    }
}
