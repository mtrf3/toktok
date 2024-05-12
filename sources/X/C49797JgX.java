package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JgX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49797JgX implements InterfaceC49844JhI {
    public final List<SearchMixFeed> LJLIL;
    public final /* synthetic */ C49783JgJ LJLILLLLZI;

    @Override // X.InterfaceC49844JhI
    public final String LIZLLL() {
        return this.LJLILLLLZI.LIZLLL();
    }

    @Override // X.InterfaceC49844JhI
    public final int LJ(String innerSearchId) {
        o.LJIIIZ(innerSearchId, "innerSearchId");
        return this.LJLILLLLZI.LJ(innerSearchId);
    }

    @Override // X.InterfaceC49844JhI
    public final String LJFF() {
        return this.LJLILLLLZI.LJFF();
    }

    public C49797JgX(C49841JhF c49841JhF, InterfaceC49778JgE interfaceC49778JgE, AbstractC65590Pog abstractC65590Pog, C49825Jgz c49825Jgz) {
        this.LJLIL = abstractC65590Pog;
        this.LJLILLLLZI = new C49783JgJ(c49841JhF, interfaceC49778JgE, abstractC65590Pog, c49825Jgz);
    }
}
