package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public final class KF3 extends AbstractC65781Prl implements InterfaceC65784Pro<KF2> {
    public static final KF3 LJLIL = new KF3();

    public KF3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final KF2 invoke() {
        String str;
        KF2 kf2 = new KF2();
        kf2.LIZ = "100010";
        kf2.LIZIZ = "general";
        if (C38354F3m.LIZJ(EF7.LJIILIIL, "local_test")) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        kf2.LIZJ = str;
        kf2.LIZLLL = "mall";
        return kf2;
    }
}
