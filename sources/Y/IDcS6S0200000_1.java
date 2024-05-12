package Y;

import X.AbstractC028509h;
import X.InterfaceC57784Mm4;
import X.SYL;
import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.assem.VideoSelectionListAssem;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class IDcS6S0200000_1 extends AbstractC028509h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(IDcS6S0200000_1 iDcS6S0200000_1, int i) {
        int headerCount = ((VideoSelectionListAssem) iDcS6S0200000_1.l0).v3().getHeaderCount();
        List<InterfaceC57784Mm4> LJII = ((VideoSelectionListAssem) iDcS6S0200000_1.l0).v3().getState().LJII();
        if (i < headerCount) {
            return ((GridLayoutManager) iDcS6S0200000_1.l1).LLIIIL;
        }
        if (i >= ((ArrayList) LJII).size() + headerCount) {
            return ((GridLayoutManager) iDcS6S0200000_1.l1).LLIIIL;
        }
        return 1;
    }

    public static final int LJFF$1(IDcS6S0200000_1 iDcS6S0200000_1, int i) {
        List<InterfaceC57784Mm4> LJII = ((SYL) iDcS6S0200000_1.l0).getState().LJII();
        int headerCount = ((SYL) iDcS6S0200000_1.l0).getHeaderCount();
        if (i < headerCount) {
            return ((WrapGridLayoutManager) iDcS6S0200000_1.l1).LLIIIL;
        }
        if (i >= ((ArrayList) LJII).size() + headerCount) {
            return ((WrapGridLayoutManager) iDcS6S0200000_1.l1).LLIIIL;
        }
        return 1;
    }

    public IDcS6S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
