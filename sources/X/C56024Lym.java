package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Lym, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56024Lym extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public static final C56024Lym LJLIL = new C56024Lym();

    public C56024Lym() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("page_name", "mall");
        FashionMallFragment.LJZ.getClass();
        String str = FashionMallFragment.LJZI;
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("enter_from", str);
        C56045Lz7.LIZ.getClass();
        sendLog.LJ(C56045Lz7.LIZJ());
        return C76800UCe.LIZ;
    }
}
