package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BWt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28923BWt extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C28915BWl LJLIL;
    public final /* synthetic */ C29163BcV LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ DataChannel LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28923BWt(C28915BWl c28915BWl, C29163BcV c29163BcV, Context context, DataChannel dataChannel, String str) {
        super(0);
        this.LJLIL = c28915BWl;
        this.LJLILLLLZI = c29163BcV;
        this.LJLJI = context;
        this.LJLJJI = dataChannel;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C28915BWl c28915BWl = this.LJLIL;
        C29163BcV c29163BcV = this.LJLILLLLZI;
        c28915BWl.LIZIZ(c29163BcV, new BX3(this.LJLJI, this.LJLJJI, c29163BcV, this.LJLJJL));
        return C76800UCe.LIZ;
    }
}
