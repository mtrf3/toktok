package X;

import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import fjb.a;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity$getDraftInfoByPath$2", f = "CKEffectEditorActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aoV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94903aoV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CKEDraftInfo>, Object> {
    public final /* synthetic */ CKEffectEditorActivity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94903aoV(CKEffectEditorActivity cKEffectEditorActivity, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = cKEffectEditorActivity;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94903aoV(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CKEDraftInfo> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        CKEDraftInfo cKEDraftInfo;
        C141335gf.LIZJ(obj);
        C93733aVd.LIZIZ(this.LJLILLLLZI);
        ICKDraftManager LJ = CKEffectEditorContext.LJ();
        if (LJ != null) {
            cKEDraftInfo = LJ.initOneDraftWithPath(this.LJLILLLLZI);
        } else {
            cKEDraftInfo = null;
        }
        Intent intent = this.LJLIL.getIntent();
        if (intent != null && 17 == intent.getIntExtra("draft_type", -1)) {
            String uuid = UUID.randomUUID().toString();
            o.LJIIIIZZ(uuid, "UUID.randomUUID().toString()");
            if (cKEDraftInfo != null) {
                cKEDraftInfo.draftID = uuid;
            }
            String LIZIZ = C93965aZN.LIZIZ(C93965aZN.LIZ(), uuid);
            File file = new File(LIZIZ);
            if (!file.exists()) {
                file.mkdirs();
            }
            C93732aVc.LIZ(this.LJLILLLLZI, LIZIZ);
            if (cKEDraftInfo != null) {
                o.LJIIIZ(LIZIZ, "<set-?>");
                cKEDraftInfo.draftPath = LIZIZ;
            }
        }
        return cKEDraftInfo;
    }
}
