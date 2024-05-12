package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.Mbm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57146Mbm implements InterfaceC64672gJ<C57148Mbo> {
    @Override // X.InterfaceC64672gJ
    public final Object emit(C57148Mbo c57148Mbo, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C77216USe c77216USe = c57148Mbo.LIZ;
        if (c77216USe.LJLILLLLZI == UQ0.SYNC && c77216USe.LJLIL.LJLJI) {
            IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LJIIIIZZ();
        }
        return C76800UCe.LIZ;
    }
}
