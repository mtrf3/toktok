package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$checkAddValid$1", f = "VideoChosenResultFromAddSceneImpl.kt", l = {135, 136, 137}, m = "invokeSuspend")
/* renamed from: X.GdI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41952GdI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C41988Gds LJLJI;
    public final /* synthetic */ List<MediaModel> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41952GdI(C41988Gds c41988Gds, List<? extends MediaModel> list, InterfaceC67352kd<? super C41952GdI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c41988Gds;
        this.LJLJJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41952GdI c41952GdI = new C41952GdI(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c41952GdI.LJLILLLLZI = obj;
        return c41952GdI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLIL
            r7 = 3
            r8 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L16
            if (r0 == r9) goto L42
            if (r0 == r8) goto L54
            if (r0 != r7) goto L71
            X.C141335gf.LIZJ(r11)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            X.C141335gf.LIZJ(r11)
            java.lang.Object r4 = r10.LJLILLLLZI
            X.2pa r4 = (X.InterfaceC70422pa) r4
            X.GdJ r2 = new X.GdJ
            X.Gds r1 = r10.LJLJI
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r10.LJLJJI
            r2.<init>(r1, r0, r5)
            X.XKn r3 = X.XKX.LIZIZ(r4, r5, r5, r2, r7)
            X.GdH r2 = new X.GdH
            X.Gds r1 = r10.LJLJI
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r10.LJLJJI
            r2.<init>(r1, r0, r5)
            X.XKn r1 = X.XKX.LIZIZ(r4, r5, r5, r2, r7)
            r10.LJLILLLLZI = r1
            r10.LJLIL = r9
            java.lang.Object r0 = r3.LJJIJ(r10)
            if (r0 != r6) goto L49
            return r6
        L42:
            java.lang.Object r1 = r10.LJLILLLLZI
            X.2mE r1 = (X.InterfaceC68342mE) r1
            X.C141335gf.LIZJ(r11)
        L49:
            r10.LJLILLLLZI = r5
            r10.LJLIL = r8
            java.lang.Object r11 = r1.LJI(r10)
            if (r11 != r6) goto L57
            return r6
        L54:
            X.C141335gf.LIZJ(r11)
        L57:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r4 = r11.booleanValue()
            X.XIF r3 = X.EXT.LIZ
            X.GdK r2 = new X.GdK
            X.Gds r1 = r10.LJLJI
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r10.LJLJJI
            r2.<init>(r1, r4, r0, r5)
            r10.LJLIL = r7
            java.lang.Object r0 = X.XKX.LJI(r3, r2, r10)
            if (r0 != r6) goto L13
            return r6
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41952GdI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
