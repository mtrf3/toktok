package Y;

import X.AbstractC028509h;
import X.C74272TCy;
import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDcS39S0100000_12 extends AbstractC028509h {
    public final int $t;
    public Object l0;

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

    public IDcS39S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(IDcS39S0100000_12 iDcS39S0100000_12, int i) {
        if (i == 0 || i == ((GridLayoutManager) iDcS39S0100000_12.l0).LJJJJZ() - 1) {
            return 2;
        }
        return 1;
    }

    public static final int LJFF$1(IDcS39S0100000_12 iDcS39S0100000_12, int i) {
        if (i != 0) {
            C74272TCy c74272TCy = ((SearchStickerViewContainer) iDcS39S0100000_12.l0).LJLL;
            if (c74272TCy != null) {
                if (i != c74272TCy.getItemCount() - 1) {
                    return 1;
                }
            } else {
                o.LJIJI("stickerAdapter");
                throw null;
            }
        }
        return 5;
    }
}
