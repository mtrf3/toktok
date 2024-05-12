package X;

import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SpZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73289SpZ<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C73663Svb LJLILLLLZI;

    public C73289SpZ(boolean z, C73663Svb c73663Svb) {
        this.LJLIL = z;
        this.LJLILLLLZI = c73663Svb;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        if (!this.LJLIL || !it.isEmpty()) {
            FRW.LIZLLL("discovery_client_show_time");
            return new DiscoverSectionList(it, this.LJLILLLLZI.LIZLLL, this.LJLILLLLZI.LJ, false, 8, null);
        }
        throw new Exception("api all went wrong");
    }
}
