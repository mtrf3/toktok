package X;

import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget$onLoad$6$1", f = "CaptionTextWidget.kt", l = {262}, m = "invokeSuspend")
/* renamed from: X.BZt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29001BZt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CaptionTextWidget LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29001BZt(CaptionTextWidget captionTextWidget, InterfaceC67352kd<? super C29001BZt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = captionTextWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29001BZt(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C29296Bee c29296Bee;
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
            C29296Bee c29296Bee2 = captionTextWidget.LJZL;
            if (c29296Bee2 != null && (!c29296Bee2.LJ.isEmpty()) && o.LJ(ListProtector.get(c29296Bee2.LJ, 0), captionTextWidget.LLF) && (c29296Bee = captionTextWidget.LJZL) != null) {
                ArrayList<TextView> arrayList = captionTextWidget.LJLZ;
                this.LJLIL = 1;
                if (captionTextWidget.LJZL(c29296Bee, arrayList, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
