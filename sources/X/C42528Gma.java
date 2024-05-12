package X;

import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.o;

/* renamed from: X.Gma, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42528Gma implements InterfaceC72342sg {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(AIZ.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C42529Gmb.LJLIL);

    @Override // X.InterfaceC72342sg
    public final InterfaceC72332sf LIZ() {
        return (InterfaceC72332sf) this.LIZ.getValue();
    }

    @Override // X.InterfaceC72342sg
    public final Object LIZIZ() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-externalServices>(...)");
        return ((IExternalService) value).draftService().queryDraftList(new GPJ(true, true, null, null, 28));
    }
}
