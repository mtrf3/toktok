package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.normal.MobileEffectUploadTask$execute$3", f = "MobileEffectUploadTask.kt", l = {82}, m = "invokeSuspend")
/* renamed from: X.EPi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36374EPi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C68322mC<List<UploadableMobileEffect>> LJLILLLLZI;
    public final /* synthetic */ ERH LJLJI;
    public final /* synthetic */ UploadImageConfig LJLJJI;
    public final /* synthetic */ UploadImageConfig LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36374EPi(C68322mC<List<UploadableMobileEffect>> c68322mC, ERH erh, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC67352kd<? super C36374EPi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = erh;
        this.LJLJJI = uploadImageConfig;
        this.LJLJJL = uploadImageConfig2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36374EPi(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            java.lang.String r3 = "DiyProp"
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L59
            if (r0 != r1) goto L90
            X.C141335gf.LIZJ(r12)
        Lf:
            java.util.List r12 = (java.util.List) r12
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L41
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L41
        L1b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "did all effect create succeed? allSucceed="
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            X.C15280iq.LJ(r3, r0)
        L2c:
            X.ERH r1 = r11.LJLJI
            r1.getClass()
            java.lang.String r0 = "Task success"
            X.C15280iq.LJ(r3, r0)
            X.QmO r0 = r1.LJFF
            r1 = 0
            if (r0 == 0) goto L8a
            r0.LJ(r1, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L41:
            java.util.Iterator r4 = r12.iterator()
        L45:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r4.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L45
            r1 = 0
            goto L1b
        L59:
            X.C141335gf.LIZJ(r12)
            X.2mC<java.util.List<com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect>> r0 = r11.LJLILLLLZI
            T r0 = r0.element
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L2c
            X.ERH r0 = r11.LJLJI
            X.EPe r7 = r0.LJII
            X.2mC<java.util.List<com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect>> r0 = r11.LJLILLLLZI
            T r6 = r0.element
            java.util.List r6 = (java.util.List) r6
            com.ss.android.ugc.aweme.publish.model.UploadImageConfig r8 = r11.LJLJJI
            com.ss.android.ugc.aweme.publish.model.UploadImageConfig r9 = r11.LJLJJL
            r11.LJLIL = r1
            r7.getClass()
            X.EPZ r5 = new X.EPZ
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = X.C48841JEv.LJI(r5, r11)
            if (r12 != r4) goto Lf
            return r4
        L8a:
            java.lang.String r0 = "nodeCallback"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r1
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36374EPi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
