package X;

import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.LynxSearchList;
import kotlin.jvm.internal.o;

/* renamed from: X.JRw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49180JRw {
    public final LynxSearchList LIZ;
    public final C79655VNz LIZIZ;
    public LynxBaseUI LIZJ;

    public C49180JRw(LynxSearchList searchList) {
        o.LJIIIZ(searchList, "searchList");
        this.LIZ = searchList;
        C79655VNz c79655VNz = searchList.mContext.LJLJL;
        o.LJIIIIZZ(c79655VNz, "searchList.lynxContext.listNodeInfoFetcher");
        this.LIZIZ = c79655VNz;
    }
}
