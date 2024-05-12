package X;

import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionModule$collectSelectedDraftEffectsBeforePublish$1", f = "EffectDraftSubmissionModule.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69202nc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C793139j LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69202nc(C793139j c793139j, InterfaceC67352kd<? super C69202nc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c793139j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69202nc(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UploadableMobileEffect2 uploadableMobileEffect2;
        DraftInfo draftInfo;
        C141335gf.LIZJ(obj);
        EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel = this.LJLIL.LIZLLL;
        if (effectDraftSubmissionListViewModel != null) {
            List<C69192nb> value = effectDraftSubmissionListViewModel.LJLIL.getValue();
            if (value != null) {
                C793139j c793139j = this.LJLIL;
                for (C69192nb c69192nb : value) {
                    if (C69162nY.LIZ()) {
                        Iterator<UploadableMobileEffect2> it = c793139j.LIZ.creativeModel.mobileEffectsModel2.exportedEffects.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                uploadableMobileEffect2 = it.next();
                                if (o.LJ(c69192nb.LJLILLLLZI.effectId, uploadableMobileEffect2.effectId)) {
                                    break;
                                }
                            } else {
                                uploadableMobileEffect2 = null;
                                break;
                            }
                        }
                        UploadableMobileEffect2 uploadableMobileEffect22 = uploadableMobileEffect2;
                        if (uploadableMobileEffect22 != null && (draftInfo = uploadableMobileEffect22.draftInfo) != null) {
                            draftInfo.needSubmission = c69192nb.LJLIL;
                        }
                    } else if (c69192nb.LJLIL) {
                        c69192nb.LJLILLLLZI.needSubmission = true;
                    } else {
                        UploadableDraftEffect uploadableDraftEffect = c69192nb.LJLILLLLZI;
                        uploadableDraftEffect.needSubmission = false;
                        C39579Fg7.LJIL(uploadableDraftEffect.zipFilePath);
                    }
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
