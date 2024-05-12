package X;

import android.graphics.drawable.Animatable;
import android.view.View;

/* renamed from: X.4bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112894bt extends AbstractC65781Prl implements InterfaceC88474Ynu<android.net.Uri, View, C2047581v, Animatable, C76800UCe> {
    public final /* synthetic */ C112874br LJLIL;
    public final /* synthetic */ EnumC112954bz LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112894bt(C112874br c112874br, EnumC112954bz enumC112954bz) {
        super(4);
        this.LJLIL = c112874br;
        this.LJLILLLLZI = enumC112954bz;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        C112874br c112874br = this.LJLIL;
        EnumC112954bz enumC112954bz = this.LJLILLLLZI;
        if (!(c112874br.LJIIIIZZ instanceof C112984c2)) {
            c112874br.LJIIIZ(new C112924bw(enumC112954bz));
            c112874br.LJIIJJI();
        }
        return C76800UCe.LIZ;
    }
}
