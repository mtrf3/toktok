package X;

import android.content.Context;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.aDY, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92612aDY extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ PinChangeViewAssem LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92612aDY(PinChangeViewAssem pinChangeViewAssem, String str, Context context) {
        super(1);
        this.LJLIL = pinChangeViewAssem;
        this.LJLILLLLZI = str;
        this.LJLJI = context;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN arn) {
        ARN args = arn;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        C92058a4c.LIZLLL("bnpl_pin_change", this.LJLIL.A3().LJLILLLLZI, "forgot", this.LJLILLLLZI);
        C92033a4D.LIZ(this.LJLJI, "bnpl_pin_change");
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LJLIL);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
        return C76800UCe.LIZ;
    }
}
