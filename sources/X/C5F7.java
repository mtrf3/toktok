package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel$compileRecordAudio$2", f = "AudioRecordActivityViewModel.kt", l = {150}, m = "invokeSuspend")
/* renamed from: X.5F7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AudioRecordActivityViewModel LJLJI;
    public final /* synthetic */ EditorProContext LJLJJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F7(AudioRecordActivityViewModel audioRecordActivityViewModel, EditorProContext editorProContext, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C5F7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = audioRecordActivityViewModel;
        this.LJLJJI = editorProContext;
        this.LJLJJL = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5F7(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                LIZ = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            LIZ = C793239k.LIZ(obj);
            LIZ.element = "";
            XIA xia = C78613UtF.LIZJ;
            C5F6 c5f6 = new C5F6(this.LJLJI, LIZ, this.LJLJJI, this.LJLJJL, null);
            this.LJLIL = LIZ;
            this.LJLILLLLZI = 1;
            if (XKX.LJI(xia, c5f6, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.LJLJJI.setValue(LIZ.element);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
