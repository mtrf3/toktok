package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.P1r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63787P1r extends F9E implements C33Q {
    public final AbstractC72932td<List<InterfaceC57784Mm4>> LJLIL;
    public final AbstractC72932td<List<User>> LJLILLLLZI;

    public C63787P1r() {
        this(0);
    }

    public static C63787P1r L(AbstractC72932td listState, AbstractC72932td listData) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(listData, "listData");
        return new C63787P1r(listState, listData);
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
    public /* synthetic */ C63787P1r(int r2) {
        /*
            r1 = this;
            X.33X r0 = X.C33X.LIZ
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63787P1r.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C63787P1r(AbstractC72932td<? extends List<? extends InterfaceC57784Mm4>> listState, AbstractC72932td<? extends List<? extends User>> listData) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(listData, "listData");
        this.LJLIL = listState;
        this.LJLILLLLZI = listData;
    }
}
