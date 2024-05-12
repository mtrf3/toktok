package X;

import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gu1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C42989Gu1 extends TBS implements InterfaceC65784Pro<InterfaceC153045zY> {
    public C42989Gu1(Object obj) {
        super(0, obj, H5Y.class, "tryCreateEditor", "tryCreateEditor()Lcom/ss/android/ugc/asve/editor/IASVEEditor;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.5zY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.5zY] */
    @Override // X.InterfaceC65784Pro
    public final InterfaceC153045zY invoke() {
        C3C4 c3c4;
        C43403H1r c43403H1r;
        H5Y h5y = (H5Y) this.receiver;
        h5y.getClass();
        try {
            h5y.LJII().LIZ();
            c43403H1r = h5y.LJI;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            c3c4 = LIZ;
        }
        if (c43403H1r != null) {
            ?? LIZIZ = C152875zH.LIZIZ(c43403H1r.LIZ, new AqS173S0100000_7(h5y, 357));
            C5UF.LIZ(LIZIZ);
            C3C5.m7constructorimpl(LIZIZ);
            c3c4 = LIZIZ;
            if (C3C5.m12isFailureimpl(c3c4)) {
                return null;
            }
            return c3c4;
        }
        o.LJIJI("editModelContainer");
        throw null;
    }
}
