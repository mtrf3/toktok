package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wdi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82746Wdi {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;
    public final InterfaceC65784Pro<Integer> LJI;

    public C82746Wdi() {
        this(C82756Wds.LJLIL, C82757Wdt.LJLIL, C82758Wdu.LJLIL, C82759Wdv.LJLIL, C82760Wdw.LJLIL, C82761Wdx.LJLIL, DIE.LJLIL);
    }

    public C82746Wdi(InterfaceC65784Pro<C76800UCe> accessMicPermission, InterfaceC65784Pro<C76800UCe> accessCameraPermission, InterfaceC65784Pro<C76800UCe> shootWithoutMic, InterfaceC65784Pro<C76800UCe> close, InterfaceC65784Pro<C76800UCe> openAlbum, InterfaceC65784Pro<C76800UCe> clickOpenSettings, InterfaceC65784Pro<Integer> getBottomMargin) {
        o.LJIIIZ(accessMicPermission, "accessMicPermission");
        o.LJIIIZ(accessCameraPermission, "accessCameraPermission");
        o.LJIIIZ(shootWithoutMic, "shootWithoutMic");
        o.LJIIIZ(close, "close");
        o.LJIIIZ(openAlbum, "openAlbum");
        o.LJIIIZ(clickOpenSettings, "clickOpenSettings");
        o.LJIIIZ(getBottomMargin, "getBottomMargin");
        this.LIZ = accessMicPermission;
        this.LIZIZ = accessCameraPermission;
        this.LIZJ = shootWithoutMic;
        this.LIZLLL = close;
        this.LJ = openAlbum;
        this.LJFF = clickOpenSettings;
        this.LJI = getBottomMargin;
    }
}
