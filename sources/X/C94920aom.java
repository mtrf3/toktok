package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$getProjectSize$2", f = "MainFragment.kt", l = {244, LiveCoverMinSizeSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.aom, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94920aom extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Long>, Object> {
    public C72242sW LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ MainFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94920aom(MainFragment mainFragment, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = mainFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94920aom(this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Long> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r6 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L2d
            if (r0 != r4) goto L76
            X.2sW r3 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L12:
            long r1 = r3.element
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            return r0
        L1a:
            X.C141335gf.LIZJ(r8)
            X.XIA r1 = X.C78613UtF.LIZJ
            X.aoi r0 = new X.aoi
            r0.<init>(r7, r6)
            r7.LJLILLLLZI = r2
            java.lang.Object r8 = X.XKX.LJI(r1, r0, r7)
            if (r8 != r5) goto L30
            return r5
        L2d:
            X.C141335gf.LIZJ(r8)
        L30:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r8 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo) r8
            X.2mC r2 = new X.2mC
            r2.<init>()
            if (r8 == 0) goto L73
            java.lang.String r0 = r8.draftPath
            if (r0 == 0) goto L73
        L3d:
            r2.element = r0
            X.2sW r3 = new X.2sW
            r3.<init>()
            r0 = 0
            r3.element = r0
            T r0 = r2.element
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L12
            java.io.File r1 = new java.io.File
            T r0 = r2.element
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L12
            X.XIA r1 = X.C78613UtF.LIZJ
            X.aoh r0 = new X.aoh
            r0.<init>(r7, r3, r2, r6)
            r7.LJLIL = r3
            r7.LJLILLLLZI = r4
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r7)
            if (r0 != r5) goto L12
            return r5
        L73:
            java.lang.String r0 = ""
            goto L3d
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94920aom.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
