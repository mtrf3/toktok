package X;

import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.EditorProScene$handleSave$1", f = "EditorProScene.kt", l = {2508}, m = "invokeSuspend")
/* renamed from: X.5FF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EditorProScene LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5FF(EditorProScene editorProScene, boolean z, InterfaceC67352kd<? super C5FF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = editorProScene;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5FF(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            EditorProScene editorProScene = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (editorProScene.saveRecordAudio(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (this.LJLJI && this.LJLILLLLZI.allowChangeInEp2Publish()) {
            this.LJLILLLLZI.saveAndToPublish();
        } else {
            C1284452i multiTrackController = this.LJLILLLLZI.getMultiTrackController();
            if (multiTrackController != null) {
                multiTrackController.LJIJI(false, false);
            }
            this.LJLILLLLZI.handleSaveAsync();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
