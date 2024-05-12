package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.topbar.Video2StickerTopBarComponent$nextTask$2$compileResult$1", f = "Video2StickerTopBarComponent.kt", l = {174}, m = "invokeSuspend")
/* renamed from: X.5lI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144205lI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C144285lQ>, Object> {
    public int LJLIL;
    public final /* synthetic */ C144245lM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144205lI(C144245lM c144245lM, InterfaceC67352kd<? super C144205lI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c144245lM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C144205lI(this.LJLILLLLZI, interfaceC67352kd);
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
            ActivityC45651qj activity = this.LJLILLLLZI.getActivity();
            VideoPublishEditModel LLIFFJFJJ = this.LJLILLLLZI.LLIFFJFJJ();
            InterfaceC153045zY value = this.LJLILLLLZI.LLF().Kh().getValue();
            if (value != null) {
                C133765Mu c133765Mu = (C133765Mu) value;
                InterfaceC136385Ww LLIILZL = this.LJLILLLLZI.LLIILZL();
                C144265lO c144265lO = this.LJLILLLLZI.LJZI;
                if (c144265lO != null) {
                    this.LJLIL = 1;
                    obj = C144045l2.LIZ(activity, LLIFFJFJJ, c133765Mu, LLIILZL, c144265lO, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C144285lQ> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
