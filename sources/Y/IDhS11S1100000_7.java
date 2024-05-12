package Y;

import X.AbstractC73672Svk;
import X.C45146Hni;
import X.H0R;
import X.InterfaceC48038ItG;
import android.util.Pair;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDhS11S1100000_7 implements InterfaceC48038ItG {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS11S1100000_7 iDhS11S1100000_7, Object obj) {
        PhotoModule photoModule = (PhotoModule) iDhS11S1100000_7.l1;
        String str = iDhS11S1100000_7.s0;
        photoModule.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return new Pair(str, arrayList);
    }

    public static final Object apply$1(IDhS11S1100000_7 iDhS11S1100000_7, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        C45146Hni c45146Hni = (C45146Hni) iDhS11S1100000_7.l1;
        String str = iDhS11S1100000_7.s0;
        if (str == null) {
            str = "";
        }
        c45146Hni.getClass();
        return AbstractC73672Svk.LJIIJ(new H0R(it, str));
    }

    public IDhS11S1100000_7(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
