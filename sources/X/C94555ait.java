package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokDialogImpl;

/* renamed from: X.ait, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94555ait extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ TiktokDialogImpl LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ C68322mC<Drawable> LJLJI;
    public final /* synthetic */ Rect LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ InterfaceC93473aRR LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94555ait(Context context, Rect rect, InterfaceC93473aRR interfaceC93473aRR, TiktokDialogImpl tiktokDialogImpl, String str, String str2, String str3, String str4, C68322mC c68322mC) {
        super(0);
        this.LJLIL = tiktokDialogImpl;
        this.LJLILLLLZI = context;
        this.LJLJI = c68322mC;
        this.LJLJJI = rect;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = interfaceC93473aRR;
        this.LJLJLLL = str4;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.showDialog(this.LJLILLLLZI, this.LJLJI.element, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, 1);
        return C76800UCe.LIZ;
    }
}
