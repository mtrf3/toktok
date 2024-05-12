package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$compileForEditorPro$3$5", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136035Vn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C43544H7c LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136035Vn(C43544H7c c43544H7c, InterfaceC67352kd<? super C136035Vn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c43544H7c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C136035Vn(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Activity activity = this.LJLIL.LIZ;
        String string = activity.getResources().getString(R.string.pmn);
        o.LJIIIIZZ(string, "activity.resources.getSt….qa_error_somethingwrong)");
        C43544H7c.LJJ(activity, string);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
