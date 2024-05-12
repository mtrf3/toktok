package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import java.util.List;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a6c, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92182a6c implements InterfaceC91938a2g<Boolean> {
    public final List<InterfaceC91946a2o<Boolean>> LIZ;
    public final ParcelableSnapshotMutableState LIZIZ;
    public final ParcelableSnapshotMutableState LIZJ;
    public final ParcelableSnapshotMutableState LIZLLL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJFF;

    public C92182a6c() {
        this(7, 0);
    }

    @Override // X.InterfaceC91938a2g
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC91938a2g
    public final List<PaymentElements> LIZIZ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC91938a2g
    public final InterfaceC24760y8<C91941a2j> LIZLLL() {
        return this.LIZLLL;
    }

    public C92182a6c(int i, int i2) {
        C61878OQg validators;
        if ((i & 4) != 0) {
            validators = C61878OQg.INSTANCE;
        } else {
            validators = null;
        }
        o.LJIIIZ(validators, "validators");
        this.LIZ = validators;
        ParcelableSnapshotMutableState LJJJIL = C78966Uyw.LJJJIL(Boolean.FALSE);
        this.LIZIZ = LJJJIL;
        this.LIZJ = LJJJIL;
        this.LIZLLL = C78966Uyw.LJJJIL(new C91941a2j(true, false, "", ""));
        this.LJ = C92639aDz.LJLIL;
        this.LJFF = new IDqS418S0100000_31(this, 45);
    }
}
