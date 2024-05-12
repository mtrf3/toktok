package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.helper.DraftRestoreHelper$restoreNLEData$1", f = "DraftRestoreHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5D9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5D9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AwemeDraft LJLIL;
    public final /* synthetic */ C5DA LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5D9(AwemeDraft awemeDraft, C5DA c5da, InterfaceC67352kd<? super C5D9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = awemeDraft;
        this.LJLILLLLZI = c5da;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5D9(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        EditorProModel editorProModel;
        C141335gf.LIZJ(obj);
        CreativeFlowData creativeFlowData = this.LJLIL.LJJJJI.creativeFlowData;
        if (creativeFlowData != null && creativeFlowData.getEditorProModel() != null) {
            CreativeFlowData creativeFlowData2 = this.LJLIL.LJJJJI.creativeFlowData;
            if (creativeFlowData2 != null && (editorProModel = creativeFlowData2.getEditorProModel()) != null) {
                z = editorProModel.isAdvancedEditDraft();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty(this.LJLIL.LIZ.nleInfoModel.nleDataPath)) {
            str = this.LJLIL.LIZ.nleInfoModel.nleDataPath;
        } else {
            str = this.LJLIL.LJJJJI.nleDataPath;
        }
        NLEInfoModel nLEInfoModel = this.LJLIL.LIZ.nleInfoModel;
        nLEInfoModel.nleDataVersion = C122954s7.LIZ(nLEInfoModel.nleDataVersion, str, z).getSecond().intValue();
        if (TextUtils.isEmpty(this.LJLIL.LJIIJ) && !TextUtils.isEmpty(str)) {
            this.LJLIL.LJIIJ = C39579Fg7.LJIJI(str);
        }
        this.LJLILLLLZI.onFinish(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
