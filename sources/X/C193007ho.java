package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.7ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193007ho implements InterfaceC192547h4 {
    public final /* synthetic */ C193027hq LJLIL;

    @Override // X.InterfaceC192547h4, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public C193007ho(C193027hq c193027hq) {
        this.LJLIL = c193027hq;
    }

    @Override // X.InterfaceC192547h4
    public void ag(boolean z, CollectionDetail detail) {
        o.LJIIIZ(detail, "detail");
        this.LJLIL.LIZ(!z, detail);
    }
}
