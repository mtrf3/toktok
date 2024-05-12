package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$removeZippedFiles$1", f = "EffectDraftSubmissionModule.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69142nW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ EffectDraftSubmissionListViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69142nW(EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel, InterfaceC67352kd<? super C69142nW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = effectDraftSubmissionListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69142nW(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<UploadableDraftEffect> list = this.LJLIL.LJLJI;
        if (list != null) {
            Iterator<UploadableDraftEffect> it = list.iterator();
            while (it.hasNext()) {
                C39579Fg7.LJIL(it.next().zipFilePath);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("zippedDraftEffects");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
