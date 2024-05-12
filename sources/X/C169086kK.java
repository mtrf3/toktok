package X;

import Y.ACallableS105S0100000_2;
import Y.ARunnableS21S0200000_2;
import Y.AgS120S0100000_2;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.tools.draft.music.DraftSoundEffectProcessor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169086kK extends AbstractC168856jx {
    public final C169096kL LIZ;
    public final String LIZIZ = "DraftSoundEffectRestoreHandler";
    public final int LIZJ = 14;
    public final int LIZLLL = LinkMicRtcMixBitrateSetting.DEFAULT;
    public final boolean LJ = true;

    @Override // X.InterfaceC168706ji
    public final int LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC168856jx
    public final boolean LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC168706ji
    public final C169096kL getParams() {
        return this.LIZ;
    }

    @Override // X.InterfaceC168706ji
    public final int getPriority() {
        return this.LIZLLL;
    }

    public C169086kK(C169096kL c169096kL) {
        this.LIZ = c169096kL;
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZLLL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        if (((AwemeDraft) this.LIZ.LIZLLL).LIZ.soundEffectInfoModel.soundEffectList.size() == 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.6kI] */
    @Override // X.AbstractC168856jx
    public final Object LJFF(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
        ActivityC45651qj activityC45651qj;
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C169096kL c169096kL = this.LIZ;
        Context context = (Context) c169096kL.LIZ;
        if (context instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) context;
        } else {
            activityC45651qj = null;
        }
        AwemeDraft draft = (AwemeDraft) c169096kL.LIZLLL;
        ?? r1 = new InterfaceC169156kR() { // from class: X.6kI
            @Override // X.InterfaceC169156kR
            public final void LIZ(List results) {
                int i;
                o.LJIIIZ(results, "results");
                C169096kL c169096kL2 = C169086kK.this.LIZ;
                AwemeDraft awemeDraft = (AwemeDraft) c169096kL2.LIZJ;
                IDraftListener iDraftListener = (IDraftListener) c169096kL2.LJ;
                Boolean LJIIIIZZ = C41663GWt.LJIIIIZZ(awemeDraft, results);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("clearSoundEffectAndRefreshDraft called, isRemoved:");
                LIZ.append(LJIIIIZZ.toString());
                H78.LIZIZ("soundEffect", X1D.LIZIZ(LIZ));
                if (LJIIIIZZ.booleanValue()) {
                    C78841Uwv.LJJIIZ("", new AqS149S0200000_2(awemeDraft, (AwemeDraft) new C68322mC(), (C68322mC<DraftFileSaveResult>) 86));
                    GX4.LIZIZ(awemeDraft);
                    GX4.LJFF(awemeDraft);
                    C44172HVg.LJJ.LJJJI().LJFF().LIZ(new NDG(awemeDraft, new GLI("DraftEditHelper", 2)));
                    if (iDraftListener != null) {
                        iDraftListener.onUpdated(new IDraftListener.UpdateParams(awemeDraft, false));
                    }
                }
                awemeDraft.LIZ.soundEffectInfoModel.shouldShowRemoveToast = LJIIIIZZ.booleanValue();
                Boolean isSoundEffectILLegal = C41663GWt.LJIIIIZZ((AwemeDraft) C169086kK.this.LIZ.LIZLLL, results);
                SoundEffectInfoModel soundEffectInfoModel = ((AwemeDraft) C169086kK.this.LIZ.LIZLLL).LIZ.soundEffectInfoModel;
                o.LJIIIIZZ(isSoundEffectILLegal, "isSoundEffectILLegal");
                soundEffectInfoModel.shouldShowRemoveToast = isSoundEffectILLegal.booleanValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C169086kK.this.LIZIZ);
                LIZ2.append(" ; restore done ... ;  isSoundEffectILLegal: ");
                LIZ2.append(isSoundEffectILLegal);
                C5Z2.LIZ(X1D.LIZIZ(LIZ2));
                XJL<List<DraftFileRestoreResult>> xjl = xks;
                DraftFileRestoreResult[] draftFileRestoreResultArr = new DraftFileRestoreResult[1];
                C169086kK c169086kK = C169086kK.this;
                if (!isSoundEffectILLegal.booleanValue()) {
                    i = 0;
                } else {
                    i = -3000;
                }
                DraftFileRestoreException draftFileRestoreException = new DraftFileRestoreException(i, null, 2, null);
                c169086kK.getClass();
                draftFileRestoreResultArr[0] = C168716jj.LIZ(c169086kK, null, false, draftFileRestoreException);
                ArrayList LJII = C47261Igj.LJII(draftFileRestoreResultArr);
                C3C5.m7constructorimpl(LJII);
                xjl.resumeWith(LJII);
            }
        };
        o.LJIIIZ(draft, "draft");
        DraftSoundEffectProcessor draftSoundEffectProcessor = new DraftSoundEffectProcessor(draft, r1);
        if (activityC45651qj != null) {
            activityC45651qj.runOnUiThread(new ARunnableS21S0200000_2(draftSoundEffectProcessor, activityC45651qj, 51));
        }
        ((ArrayList) draftSoundEffectProcessor.LJLJI).clear();
        ((ArrayList) draftSoundEffectProcessor.LJLJJI).clear();
        for (SoundEffect soundEffect : draft.LIZ.soundEffectInfoModel.soundEffectList) {
            ((ArrayList) draftSoundEffectProcessor.LJLJI).add(soundEffect);
            ((ArrayList) draftSoundEffectProcessor.LJLJJI).add(new C123244sa(V1B.LJJLIIIJLLLLLLLZ(soundEffect), 14));
        }
        if (((ArrayList) draftSoundEffectProcessor.LJLJI).size() == 0) {
            C10K.LIZIZ(new ACallableS105S0100000_2(draftSoundEffectProcessor, 26), C10K.LJIIIIZZ, null);
        } else {
            C10K.LIZJ(new ACallableS105S0100000_2(draftSoundEffectProcessor, 27)).LJ(new AgS120S0100000_2(draftSoundEffectProcessor, 23), C10K.LJIIIIZZ, null);
        }
        xks.LJIILIIL(new AqS168S0100000_2(this, 491));
        return xks.LJIIJJI();
    }
}
