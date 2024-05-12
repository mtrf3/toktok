package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import fjb.a;
import kotlin.jvm.internal.AqS0S2301000_2;
import kotlin.jvm.internal.AqS4S1301000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.musicreplace.MusicReplaceLogicComponent$startReplaceMusic$1$1", f = "MusicReplaceApiComponent.kt", l = {106}, m = "invokeSuspend")
/* renamed from: X.5uH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149775uH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C149705uA LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C166866gk LJLJJI;
    public final /* synthetic */ InterfaceC149745uE LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ NLEEditor LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C149775uH(C149705uA c149705uA, String str, C166866gk c166866gk, InterfaceC149745uE interfaceC149745uE, String str2, int i, NLEEditor nLEEditor, InterfaceC67352kd<? super C149775uH> interfaceC67352kd) {
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
        return new C149775uH(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
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
            C161846Wu LJJLIIIJJI = this.LJLILLLLZI.LJJLIIIJJI();
            final C149705uA c149705uA = this.LJLILLLLZI;
            final String str = this.LJLJI;
            final C166866gk c166866gk = this.LJLJJI;
            final InterfaceC149745uE interfaceC149745uE = this.LJLJJL;
            final String str2 = this.LJLJJLL;
            final int i2 = this.LJLJL;
            final NLEEditor nLEEditor = this.LJLJLJ;
            InterfaceC166346fu<C158886Lk> interfaceC166346fu = new InterfaceC166346fu<C158886Lk>() { // from class: X.5uI
                @Override // X.InterfaceC166346fu
                public final void LIZ(C166276fn executeResult, C158886Lk c158886Lk) {
                    o.LJIIIZ(executeResult, "executeResult");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("JDW: MusicReplaceApiComponent: PipelineListener->onFailure: Handler ");
                    LIZ.append(executeResult.LIZJ);
                    LIZ.append(' ');
                    LIZ.append(executeResult.LIZIZ);
                    H78.LJI(X1D.LIZIZ(LIZ));
                    if (o.LJ(C149705uA.this.LJLJJL.get(str), Boolean.TRUE)) {
                        if (executeResult.LIZ == 2) {
                            C2VQ.LIZIZ(new AqS0S2301000_2(C149705uA.this, c166866gk, interfaceC149745uE, str, str2, i2, 1), 0L);
                            return;
                        }
                        return;
                    }
                    C2VQ.LIZIZ(new AqS0S2301000_2(C149705uA.this, c166866gk, interfaceC149745uE, str, str2, i2, 2), 0L);
                }

                @Override // X.InterfaceC166346fu
                public final void LIZIZ(C166276fn executeResult, C158886Lk allData) {
                    o.LJIIIZ(executeResult, "executeResult");
                    o.LJIIIZ(allData, "allData");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("JDW: MusicReplaceApiComponent: PipelineListener->onBegin: Handler ");
                    LIZ.append(executeResult.LIZJ);
                    LIZ.append(' ');
                    LIZ.append(executeResult.LIZIZ);
                    H78.LJI(X1D.LIZIZ(LIZ));
                    if (o.LJ(C149705uA.this.LJLJJL.get(str), Boolean.TRUE)) {
                        if (executeResult.LIZ == 1) {
                            C2VQ.LIZIZ(new AqS4S1301000_2(C149705uA.this, executeResult.LIZJ, c166866gk, interfaceC149745uE, str, 2), 0L);
                            return;
                        }
                        return;
                    }
                    C2VQ.LIZIZ(new AqS0S2301000_2(C149705uA.this, c166866gk, interfaceC149745uE, str, str2, i2, 0), 0L);
                }

                @Override // X.InterfaceC166346fu
                public final void LIZJ(C166276fn executeResult, C158886Lk c158886Lk) {
                    C158886Lk c158886Lk2 = c158886Lk;
                    o.LJIIIZ(executeResult, "executeResult");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("JDW: MusicReplaceApiComponent: PipelineListener->onSuccess: Handler ");
                    LIZ.append(executeResult.LIZJ);
                    LIZ.append(' ');
                    LIZ.append(executeResult.LIZIZ);
                    H78.LJI(X1D.LIZIZ(LIZ));
                    if (o.LJ(C149705uA.this.LJLJJL.get(str), Boolean.TRUE)) {
                        if (executeResult.LIZ == 2) {
                            C2VQ.LIZIZ(new C149725uC(C149705uA.this, c158886Lk2, nLEEditor, c166866gk, interfaceC149745uE, str, str2, i2), 0L);
                            return;
                        }
                        return;
                    }
                    C2VQ.LIZIZ(new AqS0S2301000_2(C149705uA.this, c166866gk, interfaceC149745uE, str, str2, i2, 3), 0L);
                }
            };
            this.LJLIL = 1;
            if (LJJLIIIJJI.LIZIZ(LJJLIIIJJI.LIZLLL(), interfaceC166346fu, this) == enumC58928NAu) {
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
