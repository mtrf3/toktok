package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Icl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47015Icl implements InterfaceC47021Icr {
    public final InterfaceC47034Id4 LIZ;

    @Override // X.InterfaceC47021Icr
    public final void release() {
        this.LIZ.release();
    }

    public C47015Icl(InterfaceC47034Id4 interfaceC47034Id4) {
        this.LIZ = interfaceC47034Id4;
    }

    @Override // X.InterfaceC47021Icr
    public final C47020Icq LIZJ(C47007Icd c47007Icd, IX4 prepareData, OnUIPlayListener onUIPlayListener, AqS158S0100000_8 clean) {
        o.LJIIIZ(prepareData, "prepareData");
        o.LJIIIZ(clean, "clean");
        if (C17N.LJJIJIIJI(c47007Icd, prepareData)) {
            if (c47007Icd != null) {
                c47007Icd.LJII();
            }
            return C73340SqO.LJJIJL(c47007Icd, C47038Id8.LJLIL);
        }
        return C73340SqO.LJJIJL(this.LIZ.LIZIZ(prepareData), new AqS139S0200000_8(this, c47007Icd, 32));
    }
}
