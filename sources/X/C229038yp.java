package X;

import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.8yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229038yp extends F9E implements C33Q {
    public final AbstractC72932td<CheckPlayResponse> LJLIL;
    public final AbstractC72932td<ManageResponse> LJLILLLLZI;

    public C229038yp() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C229038yp(int r2) {
        /*
            r1 = this;
            X.33X r0 = X.C33X.LIZ
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229038yp.<init>(int):void");
    }

    public C229038yp(AbstractC72932td<CheckPlayResponse> checkNameRequest, AbstractC72932td<ManageResponse> changeNameRequest) {
        o.LJIIIZ(checkNameRequest, "checkNameRequest");
        o.LJIIIZ(changeNameRequest, "changeNameRequest");
        this.LJLIL = checkNameRequest;
        this.LJLILLLLZI = changeNameRequest;
    }

    public static C229038yp L(C229038yp c229038yp, AbstractC72932td checkNameRequest, AbstractC72932td changeNameRequest, int i) {
        if ((i & 1) != 0) {
            checkNameRequest = c229038yp.LJLIL;
        }
        if ((i & 2) != 0) {
            changeNameRequest = c229038yp.LJLILLLLZI;
        }
        c229038yp.getClass();
        o.LJIIIZ(checkNameRequest, "checkNameRequest");
        o.LJIIIZ(changeNameRequest, "changeNameRequest");
        return new C229038yp(checkNameRequest, changeNameRequest);
    }
}
