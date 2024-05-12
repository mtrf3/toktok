package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.IAVDraftFeedbackService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.KidsDraftVideoFeedFragment;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.GNf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41415GNf implements IAVDraftService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C41419GNj.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final IAVDraftFeedbackService getFeedbackService() {
        return (IAVDraftFeedbackService) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final boolean enableAddDraftLossMonitor() {
        return C60903NvH.LJIIJJI().LJJJI().enableAddDraftLossMonitor();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<String> genCreationIdsOfVisibleDraft() {
        return C60903NvH.LJIIJJI().LJJJI().genCreationIdsOfVisibleDraft();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final ExecutorService executor() {
        return GUL.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final Fragment genKidDraftDetailFragment(AwemeDraft awemeDraft) {
        o.LJIIIZ(awemeDraft, "awemeDraft");
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        new KidsDraftVideoFeedFragment();
        KidsDraftVideoFeedFragment.LJLLILLLL = awemeDraft;
        return new KidsDraftVideoFeedFragment();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final boolean hasAssociationWithPostedDraft(String aid) {
        o.LJIIIZ(aid, "aid");
        return C60903NvH.LJIIJJI().LJJJI().LIZJ().LIZ(aid);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<String> queryAllDraftsCreationIdFromDB(GPK params) {
        o.LJIIIZ(params, "params");
        return C60903NvH.LJIIJJI().LJJJI().LIZJ().LJI(params);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<AwemeDraft> queryDraftList(GPJ params) {
        o.LJIIIZ(params, "params");
        return C60903NvH.LJIIJJI().LJJJI().LIZJ().queryDraftList(params);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final C26336AVg queryDraftsInfo(GPK queryParams) {
        o.LJIIIZ(queryParams, "queryParams");
        return C60903NvH.LJIIJJI().LJJJI().LIZJ().queryDraftsInfo(queryParams);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void registerListener(IDraftListener listener) {
        o.LJIIIZ(listener, "listener");
        C60903NvH.LJIIJJI().LJJJI().LIZ().registerListener(listener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void reportDraftLostException(List<String> list) {
        o.LJIIIZ(list, "list");
        C60903NvH.LJIIJJI().LJJJI().LJIIL(list);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void saveDraft(IAVDraftService.SaveDraftByPathParam saveDraftByPathParams) {
        o.LJIIIZ(saveDraftByPathParams, "saveDraftByPathParams");
        C60903NvH.LJIIJJI().LJJJI().LJFF().LIZJ(saveDraftByPathParams);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void unregisterListener(IDraftListener listener) {
        o.LJIIIZ(listener, "listener");
        C60903NvH.LJIIJJI().LJJJI().LIZ().unregisterListener(listener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void editPostedDraft(Context context, String aid) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aid, "aid");
        XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new GLQ(this, context, aid, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void openDraftActivity(Context context, Bundle bundle) {
        o.LJIIIZ(context, "context");
        C60903NvH.LJIIJJI().LJJJI().LIZLLL().openDraftActivity(context, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r19, android.content.Context r20, X.InterfaceC67352kd<? super X.C76800UCe> r21) {
        /*
            r18 = this;
            r3 = r21
            boolean r0 = r3 instanceof X.GLT
            if (r0 == 0) goto L96
            r6 = r3
            X.GLT r6 = (X.GLT) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L14:
            java.lang.Object r1 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L9f
            X.A8y r14 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
        L29:
            r14.dismiss()
        L2c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2f:
            X.C141335gf.LIZJ(r1)
            r1 = r19
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r1.LJJJJI
            boolean r0 = r0.isUpdateInfoStickers
            if (r0 != 0) goto L3d
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3d:
            X.GNz r3 = X.C83309Wmn.LIZLLL
            java.util.List r2 = X.C41435GNz.LIZ(r1)
            if (r2 != 0) goto L48
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L48:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L2c
            X.A8y r14 = new X.A8y
            r1 = r20
            r14.<init>(r1)
            X.0Dg r10 = new X.0Dg
            r0 = 2
            r10.<init>(r0)
            r9 = 0
            java.lang.Object[] r15 = new java.lang.Object[r9]
            X.Pk0 r8 = new X.Pk0
            java.lang.String r7 = "()V"
            java.lang.String r0 = "-9046647182644090074"
            r8.<init>(r9, r7, r0)
            r11 = 300000(0x493e0, float:4.2039E-40)
            java.lang.String r12 = "com/bytedance/tux/status/loading/TuxLoadingDialogHUD"
            java.lang.String r13 = "show"
            java.lang.String r16 = "void"
            r17 = r8
            X.Ff9 r0 = r10.LIZJ(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L92
        L7c:
            X.1qj r1 = X.C45804HyK.LJJIFFI(r1)
            if (r1 == 0) goto L29
            X.Wmn r0 = new X.Wmn
            r0.<init>(r1)
            r6.LJLIL = r14
            r6.LJLJJI = r4
            java.lang.Object r1 = r3.LIZIZ(r0, r2, r6)
            if (r1 != r5) goto L24
            return r5
        L92:
            r14.show()
            goto L7c
        L96:
            X.GLT r6 = new X.GLT
            r0 = r18
            r6.<init>(r0, r3)
            goto L14
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41415GNf.LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, android.content.Context, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void loadThumbCover(AwemeDraft draft, VideoCoverConfig videoCoverConfig, IEffectService.OnVideoCoverCallback callback) {
        o.LJIIIZ(draft, "draft");
        o.LJIIIZ(callback, "callback");
        C41802Gas.LJIIIIZZ(draft, videoCoverConfig, callback);
    }
}
