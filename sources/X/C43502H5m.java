package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H5m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43502H5m implements InterfaceC65753PrJ<String> {
    public final /* synthetic */ AbstractC43498H5i LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        InterfaceC43506H5q LJIILL = this.LIZ.LJIILL();
        if (LJIILL != null) {
            EnumC43505H5p enumC43505H5p = EnumC43505H5p.STAGE_BIND;
            AbstractC43498H5i abstractC43498H5i = this.LIZ;
            LJIILL.LIZ(enumC43505H5p, 2, abstractC43498H5i.LJIIIIZZ, abstractC43498H5i.LJIIIZ, null, 10004, "vid_bind_error", 0L);
        }
        InterfaceC43506H5q LJIILL2 = this.LIZ.LJIILL();
        if (LJIILL2 != null) {
            LJIILL2.LIZIZ(this.LIZIZ);
        }
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(String str) {
        InterfaceC43506H5q LJIILL = this.LIZ.LJIILL();
        if (LJIILL != null) {
            EnumC43505H5p enumC43505H5p = EnumC43505H5p.STAGE_BIND;
            AbstractC43498H5i abstractC43498H5i = this.LIZ;
            LJIILL.LIZ(enumC43505H5p, 1, abstractC43498H5i.LJIIIIZZ, abstractC43498H5i.LJIIIZ, null, null, null, C45049Hm9.LIZLLL(abstractC43498H5i.LJIIJJI));
        }
        InterfaceC43506H5q LJIILL2 = this.LIZ.LJIILL();
        if (LJIILL2 != null) {
            LJIILL2.LIZIZ(this.LIZIZ);
        }
    }

    public C43502H5m(AbstractC43498H5i abstractC43498H5i, String str) {
        this.LIZ = abstractC43498H5i;
        this.LIZIZ = str;
    }
}
