package X;

import com.ss.android.ugc.aweme.share.improve.model.ShareH5Channel;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OXk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62064OXk implements Comparator<InterfaceC62225ObV> {
    public final C62822Ol8 LJLIL;

    public C62064OXk(List<ShareH5Channel> list) {
        this.LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(list, (List<ShareH5Channel>) 362));
    }

    public static int LIZ(InterfaceC62225ObV interfaceC62225ObV, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShareH5Channel shareH5Channel = (ShareH5Channel) it.next();
            if (o.LJ(shareH5Channel.getPlatformId(), interfaceC62225ObV.key())) {
                return list.indexOf(shareH5Channel);
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC62225ObV interfaceC62225ObV, InterfaceC62225ObV interfaceC62225ObV2) {
        InterfaceC62225ObV lhs = interfaceC62225ObV;
        InterfaceC62225ObV rhs = interfaceC62225ObV2;
        o.LJIIIZ(lhs, "lhs");
        o.LJIIIZ(rhs, "rhs");
        return LIZ(lhs, (List) this.LJLIL.getValue()) - LIZ(rhs, (List) this.LJLIL.getValue());
    }
}
