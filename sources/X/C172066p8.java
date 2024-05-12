package X;

import Y.ACListenerS23S0201000_5;
import android.widget.ImageView;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity$onPlayerCompileStart$1", f = "NewCutPlayerActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6p8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172066p8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NewCutPlayerActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172066p8(NewCutPlayerActivity newCutPlayerActivity, InterfaceC67352kd<? super C172066p8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = newCutPlayerActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C172066p8(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        NewCutPlayerActivity newCutPlayerActivity = this.LJLIL;
        String string = newCutPlayerActivity.getString(R.string.e84);
        o.LJIIIIZZ(string, "getString(R.string.creat…ate_material_compressing)");
        AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this.LJLIL, 326);
        if (!newCutPlayerActivity.isFinishing()) {
            ProgressDialogC173666ri LIZIZ = ProgressDialogC173666ri.LIZIZ(newCutPlayerActivity, string);
            ACListenerS23S0201000_5 aCListenerS23S0201000_5 = new ACListenerS23S0201000_5(1, LIZIZ, aqS152S0100000_2, 7);
            ImageView imageView = (ImageView) LIZIZ.findViewById(R.id.eay);
            if (imageView != null) {
                C16880lQ.LJIILLIIL(imageView, aCListenerS23S0201000_5);
            }
            ImageView imageView2 = (ImageView) LIZIZ.findViewById(R.id.eay);
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            LIZIZ.setProgress(0);
            this.LJLIL.LLIIIILZ = LIZIZ;
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/cut_ui_impl/process/CancellableProgressDialog", "show", LIZIZ, new Object[0], "void", new C65300Pk0(false, "()V", "6709003492846297920")).LIZ) {
                LIZIZ.show();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
