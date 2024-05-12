package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyManager$verifySchema$1", f = "EcSchemaVerifyManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62722dA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ EcSchemaVerifyRulesModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62722dA(boolean z, boolean z2, String str, EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel, InterfaceC67352kd<? super C62722dA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = str;
        this.LJLJJI = ecSchemaVerifyRulesModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62722dA(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C141335gf.LIZJ(obj);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        if (this.LJLIL) {
            str = "manual";
        } else if (this.LJLILLLLZI) {
            str = "router";
        } else {
            str = "spark";
        }
        LIZ.append(str);
        LIZ.append(": ");
        LIZ.append(this.LJLJI);
        X1D.LIZIZ(LIZ);
        boolean z = false;
        try {
            OSZ LIZ2 = C62602cy.LIZ(this.LJLJJI, this.LJLJI, this.LJLIL, this.LJLILLLLZI, arrayList);
            z = ((Boolean) LIZ2.getFirst()).booleanValue();
            str2 = (String) LIZ2.getSecond();
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "exception";
                    }
                    arrayList.add(new C2TA(99, message));
                    return C76800UCe.LIZ;
                } finally {
                    if (z || (!arrayList.isEmpty())) {
                        C62602cy.LIZJ(this.LJLJI, str2, arrayList, elapsedRealtime);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = "";
        }
        if (!z) {
            arrayList.isEmpty();
            C76800UCe c76800UCe = C76800UCe.LIZ;
            if (!arrayList.isEmpty()) {
                C62602cy.LIZJ(this.LJLJI, str2, arrayList, elapsedRealtime);
            }
            return c76800UCe;
        }
        C62602cy.LJI(this.LJLJJI, this.LJLJI, arrayList, "");
        C62602cy.LJII(this.LJLJJI, this.LJLJI, arrayList, "");
        C62602cy.LJ(this.LJLJJI, this.LJLJI, arrayList);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
