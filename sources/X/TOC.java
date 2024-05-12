package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOC extends AbstractC74560TOa<ProviderEffect, String, C76800UCe> implements TOD {
    public final TOE LJII;
    public final InterfaceC65784Pro<InterfaceC74544TNk> LJIIIIZZ;

    @Override // X.AbstractC74560TOa
    public final String LJI(ProviderEffect providerEffect) {
        ProviderEffect key = providerEffect;
        o.LJIIIZ(key, "key");
        String id = key.getId();
        if (id != null) {
            return id;
        }
        return "";
    }

    public TOC(TOE toe, AqS162S0100000_12 aqS162S0100000_12) {
        super(3);
        this.LJII = toe;
        this.LJIIIIZZ = aqS162S0100000_12;
    }

    @Override // X.AbstractC74560TOa
    public final void LJFF(Object obj, TOZ toz) {
        ProviderEffect key = (ProviderEffect) obj;
        o.LJIIIZ(key, "key");
        String LIZIZ = this.LJII.LIZIZ(key);
        if (this.LJII.LIZ(key)) {
            toz.LJIIJJI(key, LIZIZ);
        } else {
            this.LJIIIIZZ.invoke().LIZIZ(key, new C74534TNa(toz, LIZIZ));
        }
    }
}
