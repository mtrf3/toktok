package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.musicreplace.MusicReplaceLogicComponent$startReplaceMusic$1", f = "MusicReplaceApiComponent.kt", l = {105}, m = "invokeSuspend")
/* renamed from: X.5uG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149765uG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C149705uA LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C166866gk LJLJJI;
    public final /* synthetic */ InterfaceC149745uE LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ NLEEditor LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C149765uG(C149705uA c149705uA, String str, C166866gk c166866gk, InterfaceC149745uE interfaceC149745uE, String str2, int i, NLEEditor nLEEditor, InterfaceC67352kd<? super C149765uG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c149705uA;
        this.LJLJI = str;
        this.LJLJJI = c166866gk;
        this.LJLJJL = interfaceC149745uE;
        this.LJLJJLL = str2;
        this.LJLJL = i;
        this.LJLJLJ = nLEEditor;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C149765uG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
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
            XIC xic = C78613UtF.LIZ;
            C149775uH c149775uH = new C149775uH(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, null);
            this.LJLIL = 1;
            if (XKX.LJI(xic, c149775uH, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
