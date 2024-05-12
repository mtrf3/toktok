package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JPv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49127JPv implements InterfaceC49194JSk {
    public final /* synthetic */ C49124JPs LJLIL;

    public C49127JPv(C49124JPs c49124JPs) {
        this.LJLIL = c49124JPs;
    }

    @Override // X.InterfaceC49194JSk
    public final int LLD(Aweme aweme) {
        int i;
        List<? extends Aweme> list;
        o.LJIIIZ(aweme, "aweme");
        C49125JPt c49125JPt = this.LJLIL.LJLLLL;
        if (c49125JPt != null && (list = c49125JPt.LJLJLJ) != null) {
            i = list.indexOf(aweme);
        } else {
            i = -1;
        }
        C49133JQb.LIZ("ResultAutoPlay", Integer.valueOf(i));
        return i;
    }
}
