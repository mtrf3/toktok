package X;

import android.content.Context;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokDialogImpl;

/* renamed from: X.aiu, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94556aiu extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ TiktokDialogImpl LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ Rect LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC93473aRR LJLJL;
    public final /* synthetic */ String LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94556aiu(TiktokDialogImpl tiktokDialogImpl, Context context, Rect rect, String str, String str2, String str3, InterfaceC93473aRR interfaceC93473aRR, String str4) {
        super(0);
        this.LJLIL = tiktokDialogImpl;
        this.LJLILLLLZI = context;
        this.LJLJI = rect;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = interfaceC93473aRR;
        this.LJLJLJ = str4;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        TiktokDialogImpl.showDialog$default(this.LJLIL, this.LJLILLLLZI, null, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, 0, 256, null);
        return C76800UCe.LIZ;
    }
}
