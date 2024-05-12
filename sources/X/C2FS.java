package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import fjb.a;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.2FS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC37501da LJLILLLLZI;
    public final /* synthetic */ InterfaceC18630oF LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FS(InterfaceC37501da interfaceC37501da, InterfaceC18630oF interfaceC18630oF, InterfaceC67352kd<? super C2FS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC37501da;
        this.LJLJI = interfaceC18630oF;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FS(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC37501da interfaceC37501da = this.LJLILLLLZI;
            InterfaceC18630oF interfaceC18630oF = this.LJLJI;
            this.LJLIL = 1;
            IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(interfaceC18630oF, 272);
            Object LIZIZ = C0UR.LIZIZ(interfaceC37501da, new C2DD(null, new IDqS420S0100000(interfaceC18630oF, 151), new IDqS420S0100000(interfaceC18630oF, 150), iDqS416S0100000, new IDqS443S0100000(interfaceC18630oF, 30)), this);
            if (LIZIZ != obj2) {
                LIZIZ = C76800UCe.LIZ;
            }
            if (LIZIZ != obj2) {
                LIZIZ = C76800UCe.LIZ;
            }
            if (LIZIZ == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
