package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141555h1 implements InterfaceC134045Nw {
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C44512HdU LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJFF;

    @Override // X.InterfaceC134045Nw
    public final void onCompileDone() {
        String creationId = this.LIZJ.LIZ.getCreationId();
        long currentTimeMillis = System.currentTimeMillis() - this.LIZLLL;
        o.LJIIIZ(creationId, "creationId");
        ((HashMap) C127414zJ.LIZ).put(creationId, Long.valueOf(currentTimeMillis));
        C44512HdU.LJFF.put(this.LJ, this.LIZIZ);
        this.LIZ.invoke(Boolean.TRUE, this.LIZIZ);
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        InterfaceC88472Yns<Float, C76800UCe> interfaceC88472Yns = this.LJFF;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Float.valueOf(f));
        }
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        this.LIZ.invoke(Boolean.FALSE, this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C141555h1(InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr, String str, C44512HdU c44512HdU, long j, String str2, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88471Ynr;
        this.LIZIZ = str;
        this.LIZJ = c44512HdU;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJFF = interfaceC88472Yns;
    }
}
