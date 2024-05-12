package X;

import com.ss.android.ugc.aweme.search.source.neo.model.CardConsumption;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.K1x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51053K1x extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<? extends String, ? extends CardConsumption>, CharSequence> {
    public static final C51053K1x LJLIL = new C51053K1x();

    public C51053K1x() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Map.Entry<? extends String, ? extends CardConsumption> entry) {
        Map.Entry<? extends String, ? extends CardConsumption> entry2 = entry;
        o.LJIIIZ(entry2, "<name for destructuring parameter 0>");
        String key = entry2.getKey();
        CardConsumption value = entry2.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key:");
        LIZ.append(key);
        LIZ.append(" cardData:");
        LIZ.append(value);
        return X1D.LIZIZ(LIZ);
    }
}
