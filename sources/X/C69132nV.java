package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$zipUsedDraftEffects$2", f = "EffectDraftSubmissionModule.kt", l = {163}, m = "invokeSuspend")
/* renamed from: X.2nV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69132nV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends UploadableDraftEffect>>, Object> {
    public EffectDraftSubmissionListViewModel LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public UploadableDraftEffect LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ List<UploadableDraftEffect> LJLJLJ;
    public final /* synthetic */ EffectDraftSubmissionListViewModel LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69132nV(List<UploadableDraftEffect> list, EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel, InterfaceC67352kd<? super C69132nV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJLJ = list;
        this.LJLJLLL = effectDraftSubmissionListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C69132nV c69132nV = new C69132nV(this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        c69132nV.LJLJL = obj;
        return c69132nV;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004c -> B:7:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:5:0x0023). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r2 = r16
            X.NAu r11 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r15.LJLJJLL
            r10 = 7340032(0x700000, float:1.0285576E-38)
            r9 = 0
            r8 = 1
            if (r0 == 0) goto L7c
            if (r0 != r8) goto L98
            com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect r4 = r15.LJLJJL
            java.lang.Object r5 = r15.LJLJJI
            java.lang.Object r12 = r15.LJLJI
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r7 = r15.LJLILLLLZI
            java.util.Collection r7 = (java.util.Collection) r7
            com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel r6 = r15.LJLIL
            java.lang.Object r1 = r15.LJLJL
            X.2pa r1 = (X.InterfaceC70422pa) r1
            X.C141335gf.LIZJ(r2)
        L23:
            java.io.File r2 = (java.io.File) r2
            if (r2 != 0) goto L70
        L27:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r5 = r12.next()
            r4 = r5
            com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect r4 = (com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect) r4
            boolean r0 = X.C69162nY.LIZ()
            if (r0 == 0) goto L50
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r4.zipFilePath
            r2.<init>(r0)
            long r13 = r2.length()
            long r2 = (long) r10
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 <= 0) goto L4c
            r4.enableSubmission = r9
        L4c:
            r7.add(r5)
            goto L27
        L50:
            X.2nU r3 = new X.2nU
            r2 = 0
            r3.<init>(r6, r4, r2)
            r0 = 3
            X.XKn r0 = X.XKX.LIZIZ(r1, r2, r2, r3, r0)
            r15.LJLJL = r1
            r15.LJLIL = r6
            r15.LJLILLLLZI = r7
            r15.LJLJI = r12
            r15.LJLJJI = r5
            r15.LJLJJL = r4
            r15.LJLJJLL = r8
            java.lang.Object r2 = r0.LJJIJ(r15)
            if (r2 != r11) goto L23
            return r11
        L70:
            long r13 = r2.length()
            long r2 = (long) r10
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 <= 0) goto L4c
            r4.enableSubmission = r9
            goto L4c
        L7c:
            X.C141335gf.LIZJ(r2)
            java.lang.Object r1 = r15.LJLJL
            X.2pa r1 = (X.InterfaceC70422pa) r1
            java.util.List<com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect> r0 = r15.LJLJLJ
            com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel r6 = r15.LJLJLLL
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r12 = r0.iterator()
            goto L27
        L91:
            java.util.List r7 = (java.util.List) r7
            com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel r0 = r15.LJLJLLL
            r0.LJLJI = r7
            return r7
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69132nV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends UploadableDraftEffect>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
