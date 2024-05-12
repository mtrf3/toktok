package X;

import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget$onLoad$5$2", f = "CaptionTextWidget.kt", l = {247}, m = "invokeSuspend")
/* renamed from: X.BZs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29000BZs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CaptionTextWidget LJLILLLLZI;
    public final /* synthetic */ C29296Bee LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29000BZs(CaptionTextWidget captionTextWidget, C29296Bee c29296Bee, InterfaceC67352kd<? super C29000BZs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = captionTextWidget;
        this.LJLJI = c29296Bee;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29000BZs(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            CaptionTextWidget captionTextWidget = this.LJLILLLLZI;
            C29296Bee it = this.LJLJI;
            captionTextWidget.LJZL = it;
            o.LJIIIIZZ(it, "it");
            ArrayList<TextView> arrayList = this.LJLILLLLZI.LJLZ;
            this.LJLIL = 1;
            if (captionTextWidget.LJZL(it, arrayList, this) == enumC58928NAu) {
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
