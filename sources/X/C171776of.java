package X;

import android.content.Intent;
import android.os.IBinder;
import com.ss.android.ugc.cut_ui.IBinderWrapper;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.newplayer.CutPlayerActivity$launchCompile$1$2$running$1$onCompileDone$1", f = "CutPlayerActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171776of extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractActivityC171766oe LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171776of(AbstractActivityC171766oe abstractActivityC171766oe, C68322mC<String> c68322mC, InterfaceC67352kd<? super C171776of> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractActivityC171766oe;
        this.LJLILLLLZI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C171776of(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        IBinder iBinder;
        Intent intent;
        AbstractBinderC172026p4 abstractBinderC172026p4;
        C141335gf.LIZJ(obj);
        Intent LLIILII = this.LJLIL.LLIILII(this.LJLILLLLZI.element);
        Intent intent2 = this.LJLIL.getIntent();
        o.LJIIIIZZ(intent2, "intent");
        IBinderWrapper iBinderWrapper = (IBinderWrapper) intent2.getParcelableExtra("result_receiver");
        if (iBinderWrapper == null) {
            iBinder = null;
        } else {
            iBinder = iBinderWrapper.iBinder;
        }
        if (!(iBinder instanceof AbstractBinderC172026p4) || (abstractBinderC172026p4 = (AbstractBinderC172026p4) iBinder) == null) {
            intent = null;
        } else {
            intent = abstractBinderC172026p4.LIZ();
        }
        if (intent != null) {
            C172586py.LIZJ("cutui.CutPlayerActivity", o.LJIILLIIL(intent, "compile success then go ahread : "));
            AbstractActivityC171766oe abstractActivityC171766oe = this.LJLIL;
            if (abstractActivityC171766oe.LLFZ) {
                abstractActivityC171766oe.LL = true;
                C78598Ut0.LJIJJ(intent, abstractActivityC171766oe);
                abstractActivityC171766oe.startActivityForResult(intent, 1002);
                InterfaceC132665Io interfaceC132665Io = abstractActivityC171766oe.LJLJJLL;
                if (interfaceC132665Io != null) {
                    interfaceC132665Io.destroy();
                }
                abstractActivityC171766oe.LJLJJLL = null;
            } else {
                abstractActivityC171766oe.LLFII = intent;
            }
        } else {
            C172586py.LIZJ("cutui.CutPlayerActivity", "compile success then return back");
            this.LJLIL.setResult(-1, LLIILII);
            this.LJLIL.finish();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
