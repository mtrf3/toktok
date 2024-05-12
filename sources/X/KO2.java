package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public final class KO2 extends AbstractC65781Prl implements InterfaceC65784Pro<KO1> {
    public static final KO2 LJLIL = new KO2();

    public KO2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final KO1 invoke() {
        String str;
        KO1 ko1 = new KO1();
        ko1.LIZ = "100010";
        ko1.LIZIZ = "general";
        if (C38354F3m.LIZJ(EF7.LJIILIIL, "local_test")) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ko1.LIZJ = str;
        return ko1;
    }
}
