package Y;

import X.C0NB;
import X.InterfaceC48038ItG;
import android.graphics.BitmapFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDhS0S1000000_1 implements InterfaceC48038ItG {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public IDhS0S1000000_1(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(IDhS0S1000000_1 iDhS0S1000000_1, Object it) {
        o.LJIIIZ(it, "it");
        try {
            return BitmapFactory.decodeFile(iDhS0S1000000_1.s0);
        } catch (Exception e) {
            C0NB.LJIIJ(6, "NinePatchUtil", e.getStackTrace());
            C0NB.LJ("NinePatchUtil", e.getMessage());
            return null;
        }
    }

    public static final Object apply$1(IDhS0S1000000_1 iDhS0S1000000_1, Object it) {
        o.LJIIIZ(it, "it");
        return iDhS0S1000000_1.s0;
    }

    public static final Object apply$2(IDhS0S1000000_1 iDhS0S1000000_1, Object it) {
        o.LJIIIZ(it, "it");
        return iDhS0S1000000_1.s0;
    }

    public static final Object apply$3(IDhS0S1000000_1 iDhS0S1000000_1, Object obj) {
        Aweme aweme;
        List list = (List) obj;
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            aweme = new Aweme();
        } else {
            aweme = (Aweme) ListProtector.get(list, 0);
        }
        String str = iDhS0S1000000_1.s0;
        if (aweme.getAid() == null) {
            aweme.setAid(str);
        }
        if (aweme.getAuthor() == null) {
            User user = new User();
            user.setUid(str);
            aweme.setAuthor(user);
        }
        return aweme;
    }
}
