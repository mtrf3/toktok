package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.2sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72072sF extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ Long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72072sF(View view, Integer num, Long l, String str, String str2) {
        super(1);
        this.LJLIL = l;
        this.LJLILLLLZI = str;
        this.LJLJI = view;
        this.LJLJJI = num;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        o.LJIIIZ(it, "it");
        String str = null;
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C72062sE(this.LJLJI, this.LJLIL, this.LJLJJI, this.LJLJJL, null), 3);
        Long l = this.LJLIL;
        if (l != null) {
            str = l.toString();
        }
        C87393br.LJIL("chat", "click", str, this.LJLILLLLZI, Boolean.TRUE, "save_sticker");
        return C76800UCe.LIZ;
    }
}
