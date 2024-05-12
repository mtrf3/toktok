package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Lzk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56084Lzk extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public static final C56084Lzk LJLIL = new C56084Lzk();

    public C56084Lzk() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Object obj;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("page_name", "mall");
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        boolean LIZ = C56090Lzq.LIZ();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!LIZ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_first_install_launch", obj);
        if (!C56090Lzq.LIZIZ()) {
            str = "1";
        }
        sendLog.LIZLLL("is_first_show_mall", str);
        return C76800UCe.LIZ;
    }
}
