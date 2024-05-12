package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.Mbs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57152Mbs<T> implements InterfaceC64592gB {
    public static final C57152Mbs<T> LJLIL = new C57152Mbs<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C57391Mfj c57391Mfj = (C57391Mfj) obj;
        if (c57391Mfj.LIZIZ == EnumC58006Mpe.CHECKED && c57391Mfj.LIZLLL) {
            IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LJIIIIZZ();
        }
    }
}
