package Y;

import X.C234419Hx;
import X.C66851QLn;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTABaseComponent;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class IDComparatorS337S0100000_4 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS337S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS337S0100000_4 iDComparatorS337S0100000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((InteractStickerWidget) iDComparatorS337S0100000_4.l0).LJIJJLI(((InteractStickerStruct) obj).getType())), Integer.valueOf(((InteractStickerWidget) iDComparatorS337S0100000_4.l0).LJIJJLI(((InteractStickerStruct) obj2).getType())));
    }

    public static final int compare$1(IDComparatorS337S0100000_4 iDComparatorS337S0100000_4, Object obj, Object obj2) {
        Integer num;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) ((ProfileHeaderCTABaseComponent) iDComparatorS337S0100000_4.l0).LJLLJ).get(obj);
        Integer num2 = null;
        if (c234419Hx != null) {
            num = Integer.valueOf(c234419Hx.LIZ);
        } else {
            num = null;
        }
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) ((ProfileHeaderCTABaseComponent) iDComparatorS337S0100000_4.l0).LJLLJ).get(obj2);
        if (c234419Hx2 != null) {
            num2 = Integer.valueOf(c234419Hx2.LIZ);
        }
        return C66851QLn.LJFF(num, num2);
    }

    public static final int compare$2(IDComparatorS337S0100000_4 iDComparatorS337S0100000_4, Object obj, Object obj2) {
        Integer num;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) ((ProfileHeaderCTABaseComponent) iDComparatorS337S0100000_4.l0).LJLLJ).get(obj);
        Integer num2 = null;
        if (c234419Hx != null) {
            num = Integer.valueOf(c234419Hx.LIZ);
        } else {
            num = null;
        }
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) ((ProfileHeaderCTABaseComponent) iDComparatorS337S0100000_4.l0).LJLLJ).get(obj2);
        if (c234419Hx2 != null) {
            num2 = Integer.valueOf(c234419Hx2.LIZ);
        }
        return C66851QLn.LJFF(num, num2);
    }

    public static final int compare$3(IDComparatorS337S0100000_4 iDComparatorS337S0100000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Boolean.valueOf(!((List) iDComparatorS337S0100000_4.l0).contains(((ContentLanguage) obj).getLanguageCode())), Boolean.valueOf(!((List) iDComparatorS337S0100000_4.l0).contains(((ContentLanguage) obj2).getLanguageCode())));
    }
}
