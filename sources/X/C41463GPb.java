package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResults;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResults;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.tools.draft.operate.DraftSaveMonitorEvent;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftSaveOpKt$saveDraftInternal$2", f = "DraftSaveOp.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GPb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41463GPb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C142535ib>, Object> {
    public final /* synthetic */ AwemeDraft LJLIL;
    public final /* synthetic */ GLI LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41463GPb(AwemeDraft awemeDraft, GLI gli, InterfaceC67352kd<? super C41463GPb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = awemeDraft;
        this.LJLILLLLZI = gli;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41463GPb(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x01e6: IGET (r2 I:com.ss.android.ugc.aweme.draft.model.AwemeDraft) = (r0 I:X.GPb) (LINE:16777702) X.GPb.LJLIL com.ss.android.ugc.aweme.draft.model.AwemeDraft, block:B:38:0x01df */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.GPb] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? r0;
        C141335gf.LIZJ(obj);
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('\n');
            LIZ.append(GX8.LJII(new File(C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(this.LJLIL.LIZIZ())), 1));
            DraftSaveResult LJIIZILJ = C77412UZs.LJIIZILJ(this.LJLIL, null, X1D.LIZIZ(LIZ), 1);
            DraftSavePreProcessResults LJJIJL = C78555UsJ.LJJIJL(this.LJLIL);
            DraftSaveResult copy$default = DraftSaveResult.copy$default(LJIIZILJ, null, 0, 0, null, 0L, 0, null, LJJIJL, null, null, null, false, null, null, 0, 0, 65407, null);
            if (!LJJIJL.isSuc()) {
                C77412UZs.LJJIJ(copy$default);
                return new C142535ib(copy$default, this.LJLIL);
            }
            C60903NvH.LJIIJJI().LJJIIJ();
            DraftCheckResult LIZ2 = GX8.LIZ(this.LJLIL);
            DraftSaveResult copy$default2 = DraftSaveResult.copy$default(copy$default, null, 0, 0, null, 0L, 0, null, null, LIZ2, null, null, false, null, null, 0, 0, 65279, null);
            if (!LIZ2.isSuc()) {
                C77412UZs.LJJIJ(copy$default2);
                return new C142535ib(copy$default2, this.LJLIL);
            }
            DraftFileSaveResults LIZJ = GX4.LIZJ(this.LJLIL);
            DraftSaveResult copy$default3 = DraftSaveResult.copy$default(copy$default2, null, 0, 0, null, 0L, 0, null, null, null, LIZJ, null, false, null, null, 0, 0, 65023, null);
            if (!LIZJ.isSuc()) {
                C77412UZs.LJJIJ(copy$default3);
                return new C142535ib(copy$default3, this.LJLIL);
            }
            C43659HBn.LJIIJ(this.LJLIL);
            AwemeDraft LIZJ2 = GPD.LIZJ(new GPE(this.LJLIL.LIZIZ(), false));
            DraftDBSaveResult LJJLJLI = C45804HyK.LJJLJLI(new NDG(this.LJLIL, this.LJLILLLLZI));
            DraftSaveResult copy$default4 = DraftSaveResult.copy$default(copy$default3, null, 0, 0, null, 0L, 0, null, null, null, null, LJJLJLI, false, null, null, 0, 0, 64511, null);
            if (!LJJLJLI.isSuc()) {
                C77412UZs.LJJIJ(copy$default4);
                return new C142535ib(copy$default4, this.LJLIL);
            }
            if (GOA.LIZ() && C41323GJr.LIZ.contains(copy$default4.getDraftScene())) {
                DraftSaveMonitorEvent draftSaveMonitorEvent = new DraftSaveMonitorEvent(copy$default4.getCreationId(), copy$default4.getDraftScene(), copy$default4.getDraftAwemeType(), this.LJLIL.LIZIZ().getVersion(), copy$default4.getSaveDraftTime(), copy$default4.getSaveDraftAppVersion(), copy$default4.getFileTreeInfo());
                ((Keva) ETA.LIZ.getValue()).storeString(draftSaveMonitorEvent.creationId, draftSaveMonitorEvent.toString());
            }
            if (LIZJ2 != null) {
                AwemeDraft awemeDraft = this.LJLIL;
                GLI gli = this.LJLILLLLZI;
                if (LIZJ2.LIZIZ().getVersion() != awemeDraft.LIZIZ().getVersion() && gli.LIZIZ != 19) {
                    HHD.LIZ(new GPP(LIZJ2, new C41360GLc("DraftSaveOpt oldDraft"), null, null, 60));
                }
            }
            if (this.LJLILLLLZI.LIZIZ != 19) {
                GX8.LJ(this.LJLIL.LIZIZ());
            }
            C77412UZs.LJJIJ(copy$default4);
            return new C142535ib(copy$default4, this.LJLIL);
        } catch (Throwable th) {
            C60903NvH.LJIIJJI().LJJIIJ();
            DraftSaveResult LJIIZILJ2 = C77412UZs.LJIIZILJ(r0.LJLIL, th, null, 2);
            C77412UZs.LJJIJ(LJIIZILJ2);
            return new C142535ib(LJIIZILJ2, r0.LJLIL);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C142535ib> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
