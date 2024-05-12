package X;

import X.InterfaceC67754QiU;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.QiO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67748QiO<R extends InterfaceC67754QiU, A> extends BasePendingResult<R> implements InterfaceC68012Qme<R> {
    public final C67728Qi4 LJIILJJIL;
    public final C67718Qhu<?> LJIILL;

    public abstract void LJIILIIL(InterfaceC67836Qjo interfaceC67836Qjo);

    public final void LJIILJJIL(Status status) {
        QH7.LIZ("Failed result must not be success", !status.LJJJJL());
        LIZ(LJ(status));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC67748QiO(C67718Qhu<?> c67718Qhu, AbstractC67709Qhl abstractC67709Qhl) {
        super(abstractC67709Qhl);
        QH7.LJIIIZ(abstractC67709Qhl, "GoogleApiClient must not be null");
        QH7.LJIIIZ(c67718Qhu, "Api must not be null");
        this.LJIILJJIL = c67718Qhu.LIZIZ;
        this.LJIILL = c67718Qhu;
    }
}
