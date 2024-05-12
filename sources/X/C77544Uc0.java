package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.viewmodel.exchange.UGExchangeDialogVM;
import kotlin.jvm.internal.AqS102S0300000_13;

/* renamed from: X.Uc0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77544Uc0 extends UHX {
    public final InterfaceC77468Uam LJII;
    public final C5H3 LJIIIIZZ;
    public final long LJIIIZ;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
    
        if (LJIIIIZZ().LJLLILLLL != false) goto L13;
     */
    @Override // X.UHX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77544Uc0.LJI():boolean");
    }

    @Override // X.UHX
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final UGExchangeDialogVM LIZJ() {
        return (UGExchangeDialogVM) this.LJIIIIZZ.getValue();
    }

    public C77544Uc0(Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam) {
        super(context, c77453UaX);
        this.LJII = interfaceC77468Uam;
        this.LJIIIIZZ = C78996UzQ.LJJIJIIJI(new AqS102S0300000_13(context, this, c77453UaX, 10));
        this.LJIIIZ = c77453UaX.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
    }
}
