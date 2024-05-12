package X;

import com.ss.android.ugc.aweme.library.api.LibraryApi;
import com.ss.android.ugc.aweme.model.library.LibraryDetailResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.MHs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56560MHs<T> implements InterfaceC66992k3 {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C56560MHs(boolean z, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<LibraryDetailResponse> interfaceC65052gv) {
        LibraryDetailResponse libraryDetailResponse;
        try {
            if (!this.LJLIL) {
                String libraryId = this.LJLILLLLZI;
                o.LJIIIZ(libraryId, "libraryId");
                C56559MHr LIZIZ = C56557MHp.LIZ.LIZIZ(libraryId);
                if (LIZIZ != null && System.currentTimeMillis() - LIZIZ.LIZIZ < 15000 && (libraryDetailResponse = LIZIZ.LIZ) != null) {
                    ((C73578SuE) interfaceC65052gv).onSuccess(libraryDetailResponse);
                    return;
                }
            }
            String libraryId2 = this.LJLILLLLZI;
            o.LJIIIZ(libraryId2, "libraryId");
            C10K<LibraryDetailResponse> queryLibraryDetail = LibraryApi.LIZ.queryLibraryDetail(libraryId2);
            try {
                queryLibraryDetail.LJIJI();
            } catch (InterruptedException unused) {
            }
            if (queryLibraryDetail.LJIILJJIL()) {
                try {
                    Exception LJIIJ = queryLibraryDetail.LJIIJ();
                    o.LJIIIIZZ(LJIIJ, "task.error");
                    throw LJIIJ;
                } catch (Exception unused2) {
                }
            }
            LibraryDetailResponse LJIIJJI = queryLibraryDetail.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            LibraryDetailResponse libraryDetailResponse2 = LJIIJJI;
            ((C73578SuE) interfaceC65052gv).onSuccess(libraryDetailResponse2);
            String libraryId3 = this.LJLILLLLZI;
            o.LJIIIZ(libraryId3, "libraryId");
            C56557MHp.LIZ.LIZJ(libraryId3, new C56559MHr(libraryDetailResponse2, System.currentTimeMillis()));
        } catch (Throwable th) {
            C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
            if (!c73578SuE.isDisposed()) {
                c73578SuE.onError(th);
            }
        }
    }
}
