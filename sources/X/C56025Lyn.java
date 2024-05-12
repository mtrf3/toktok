package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Lyn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56025Lyn extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL = "mall";
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56025Lyn(boolean z, String str) {
        super(1);
        this.LJLILLLLZI = z;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        String str;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("page_name", this.LJLIL);
        sendLog.LIZLLL("tab_name", "mall");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        sendLog.LIZLLL("enter_method", "switch_tab");
        if (this.LJLILLLLZI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_data_cache", str);
        sendLog.LIZLLL("coldboot_to_click_duration", Long.valueOf(C56090Lzq.LIZIZ));
        String str2 = this.LJLJI;
        if (str2 == null) {
            str2 = "";
        }
        sendLog.LIZLLL("open_from", str2);
        sendLog.LJ(C56045Lz7.LIZJ());
        return C76800UCe.LIZ;
    }
}
