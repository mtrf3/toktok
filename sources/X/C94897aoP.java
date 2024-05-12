package X;

import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel$requestData$1", f = "FaceDistortionViewModel.kt", l = {100, 101, 111, 119, 122, 124}, m = "invokeSuspend")
/* renamed from: X.aoP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94897aoP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FaceDistortionViewModel LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94897aoP(FaceDistortionViewModel faceDistortionViewModel, Long l, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = faceDistortionViewModel;
        this.LJLJI = l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94897aoP(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:8:0x0014, B:11:0x002c, B:14:0x003d, B:16:0x0045, B:19:0x008a, B:24:0x006a, B:26:0x006e, B:29:0x0029, B:30:0x003a, B:31:0x0087, B:32:0x009e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:8:0x0014, B:11:0x002c, B:14:0x003d, B:16:0x0045, B:19:0x008a, B:24:0x006a, B:26:0x006e, B:29:0x0029, B:30:0x003a, B:31:0x0087, B:32:0x009e), top: B:2:0x0006 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r2 = r14
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r12 = r13
            int r1 = r12.LJLIL
            switch(r1) {
                case 0: goto L11;
                case 1: goto L29;
                case 2: goto L3a;
                case 3: goto L87;
                case 4: goto L87;
                case 5: goto L9e;
                case 6: goto Lb7;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L11:
            X.C141335gf.LIZJ(r2)
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r1 = r12.LJLILLLLZI     // Catch: java.lang.Exception -> La2
            X.XLM r3 = r1.LJLJLJ     // Catch: java.lang.Exception -> La2
            X.aat r2 = new X.aat     // Catch: java.lang.Exception -> La2
            r1 = 0
            r2.<init>(r1)     // Catch: java.lang.Exception -> La2
            r1 = 1
            r12.LJLIL = r1     // Catch: java.lang.Exception -> La2
            r3.setValue(r2)     // Catch: java.lang.Exception -> La2
            X.UCe r1 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> La2
            if (r1 != r0) goto L2c
            return r0
        L29:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> La2
        L2c:
            com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect r2 = X.C93797aWf.LIZ()     // Catch: java.lang.Exception -> La2
            r1 = 2
            r12.LJLIL = r1     // Catch: java.lang.Exception -> La2
            java.lang.Object r2 = r2.fetchFaceModel(r12)     // Catch: java.lang.Exception -> La2
            if (r2 != r0) goto L3d
            return r0
        L3a:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> La2
        L3d:
            X.ae3 r2 = (X.C94255ae3) r2     // Catch: java.lang.Exception -> La2
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r3 = r12.LJLILLLLZI     // Catch: java.lang.Exception -> La2
            java.lang.String r8 = r3.LJLILLLLZI     // Catch: java.lang.Exception -> La2
            if (r8 == 0) goto L6a
            java.lang.Long r4 = r12.LJLJI     // Catch: java.lang.Exception -> La2
            X.aY6 r5 = r3.LJLIL     // Catch: java.lang.Exception -> La2
            java.lang.String r6 = r2.LJLJL     // Catch: java.lang.Exception -> La2
            java.lang.String r7 = r2.LJLJLJ     // Catch: java.lang.Exception -> La2
            java.lang.String r9 = r3.LJLJJI     // Catch: java.lang.Exception -> La2
            kotlin.jvm.internal.o.LJI(r9)     // Catch: java.lang.Exception -> La2
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r1 = r12.LJLILLLLZI     // Catch: java.lang.Exception -> La2
            java.lang.String r10 = r1.LJLJJL     // Catch: java.lang.Exception -> La2
            kotlin.jvm.internal.o.LJI(r10)     // Catch: java.lang.Exception -> La2
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r1 = r12.LJLILLLLZI     // Catch: java.lang.Exception -> La2
            java.lang.String r11 = r1.LJLJJLL     // Catch: java.lang.Exception -> La2
            kotlin.jvm.internal.o.LJI(r11)     // Catch: java.lang.Exception -> La2
            r1 = 3
            r12.LJLIL = r1     // Catch: java.lang.Exception -> La2
            java.lang.Object r1 = r3.kv0(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> La2
            if (r1 != r0) goto L8a
            return r0
        L6a:
            java.lang.Long r1 = r3.LJLJL     // Catch: java.lang.Exception -> La2
            if (r1 == 0) goto L8a
            java.lang.Long r4 = r12.LJLJI     // Catch: java.lang.Exception -> La2
            X.aY6 r5 = r3.LJLIL     // Catch: java.lang.Exception -> La2
            java.lang.String r6 = r2.LJLJL     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r2.LJLJLJ     // Catch: java.lang.Exception -> La2
            long r8 = r1.longValue()     // Catch: java.lang.Exception -> La2
            r1 = 4
            r12.LJLIL = r1     // Catch: java.lang.Exception -> La2
            r3 = r3
            r7 = r2
            r10 = r12
            java.lang.Object r1 = r3.lv0(r4, r5, r6, r7, r8, r10)     // Catch: java.lang.Exception -> La2
            if (r1 != r0) goto L8a
            return r0
        L87:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> La2
        L8a:
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r1 = r12.LJLILLLLZI     // Catch: java.lang.Exception -> La2
            X.XLM r4 = r1.LJLJLJ     // Catch: java.lang.Exception -> La2
            X.aau r3 = new X.aau     // Catch: java.lang.Exception -> La2
            X.UCe r2 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> La2
            r3.<init>(r2)     // Catch: java.lang.Exception -> La2
            r1 = 5
            r12.LJLIL = r1     // Catch: java.lang.Exception -> La2
            r4.setValue(r3)     // Catch: java.lang.Exception -> La2
            if (r2 != r0) goto Lba
            return r0
        L9e:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> La2
            goto Lba
        La2:
            r4 = move-exception
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r1 = r12.LJLILLLLZI
            X.XLM r3 = r1.LJLJLJ
            X.aas r2 = new X.aas
            r2.<init>(r4)
            r1 = 6
            r12.LJLIL = r1
            r3.setValue(r2)
            X.UCe r1 = X.C76800UCe.LIZ
            if (r1 != r0) goto Lba
            return r0
        Lb7:
            X.C141335gf.LIZJ(r2)
        Lba:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94897aoP.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
