package X;

import com.ss.android.ugc.aweme.services.now.ICreativeNowDraftService;
import com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GLk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41368GLk implements ICreativeNowDraftService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C41369GLl.LJLIL);

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0022 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft> getNowDraftList() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41368GLk.getNowDraftList():java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowDraftService
    public final void deleteDraft(CreativeNowDraft draft) {
        o.LJIIIZ(draft, "draft");
        XKX.LIZLLL((InterfaceC70422pa) this.LIZ.getValue(), null, null, new C41361GLd(draft, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowDraftService
    public final void getNowDraftListAsync(InterfaceC88472Yns<? super List<CreativeNowDraft>, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        XKX.LIZLLL((InterfaceC70422pa) this.LIZ.getValue(), null, null, new C68922nA(this, callback, null), 3);
    }
}
