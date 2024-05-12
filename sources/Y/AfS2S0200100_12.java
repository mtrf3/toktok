package Y;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2I;
import X.C32I;
import X.C3C1;
import X.C3C5;
import X.C47261Igj;
import X.C57807MmR;
import X.C63803P2h;
import X.C72912tb;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.following.vm.RelationSearchVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AfS2S0200100_12 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public static final void accept$0(AfS2S0200100_12 afS2S0200100_12, Object obj) {
        ?? r2;
        RelationSearchResponse relationSearchResponse = (RelationSearchResponse) obj;
        relationSearchResponse.checkValid();
        List<User> list = relationSearchResponse.searchUser;
        if (list != null) {
            r2 = new ArrayList(C32I.LJJL(list, 10));
            int i = 0;
            for (User user : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    r2.add(new C57807MmR(user, i));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            r2 = (List) ((RelationSearchVM) afS2S0200100_12.l0).LJLJJLL.getValue();
        }
        C72912tb c72912tb = new C72912tb(Boolean.valueOf(r2.isEmpty()));
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS2S0200100_12.l1;
        A2G.LIZ.getClass();
        A2H LIZ = A2F.LIZ(r2);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
        ((RelationSearchVM) afS2S0200100_12.l0).setState(new AqS178S0100000_12(c72912tb, (C72912tb<Boolean>) 474));
        C63803P2h.LIZ(((RelationSearchVM) afS2S0200100_12.l0).getEnterFrom(), afS2S0200100_12.j2, c72912tb, ((RelationSearchVM) afS2S0200100_12.l0).LJLJL);
        RelationSearchVM relationSearchVM = (RelationSearchVM) afS2S0200100_12.l0;
        relationSearchVM.LJLJL--;
    }

    public static final void accept$1(AfS2S0200100_12 afS2S0200100_12, Object obj) {
        Exception exc;
        Throwable it = (Throwable) obj;
        if ((it instanceof Exception) && (exc = (Exception) it) != null) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS2S0200100_12.l1;
            A2G.LIZ.getClass();
            A2I LIZJ = A2F.LIZJ(exc);
            C3C5.m7constructorimpl(LIZJ);
            interfaceC67352kd.resumeWith(LIZJ);
        }
        o.LJIIIIZZ(it, "it");
        C3C1 c3c1 = new C3C1(it);
        ((RelationSearchVM) afS2S0200100_12.l0).setState(new AqS178S0100000_12(c3c1, 475));
        C63803P2h.LIZ(((RelationSearchVM) afS2S0200100_12.l0).getEnterFrom(), afS2S0200100_12.j2, c3c1, ((RelationSearchVM) afS2S0200100_12.l0).LJLJL);
        RelationSearchVM relationSearchVM = (RelationSearchVM) afS2S0200100_12.l0;
        relationSearchVM.LJLJL--;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS2S0200100_12(long r2, com.ss.android.ugc.aweme.following.vm.RelationSearchVM r4, X.InterfaceC67352kd r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.j2 = r2
            r0.l1 = r5
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r5
            r0.j2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S0200100_12.<init>(long, com.ss.android.ugc.aweme.following.vm.RelationSearchVM, X.2kd, int):void");
    }
}
