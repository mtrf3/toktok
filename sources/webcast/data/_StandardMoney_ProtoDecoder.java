package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _StandardMoney_ProtoDecoder implements InterfaceC31105CIr<StandardMoney> {
    @Override // X.InterfaceC31105CIr
    public final StandardMoney LIZ(Q9H q9h) {
        StandardMoney standardMoney = new StandardMoney();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    standardMoney.exchangeRate = Float.intBitsToFloat(q9h.LJIIIIZZ());
                                }
                            } else {
                                standardMoney.moneyStr = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            standardMoney.currencyCharacter = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        standardMoney.currencyName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    standardMoney.money = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return standardMoney;
            }
        }
    }
}
