package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchBarIconGenerator$onAwemeChange$1", f = "SearchBarIconGenerator.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C54136LMm LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ TextView LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLW(TextView textView, C54136LMm c54136LMm, Aweme aweme, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c54136LMm;
        this.LJLJI = aweme;
        this.LJLJJI = textView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLW(this.LJLJJI, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C54136LMm c54136LMm = this.LJLILLLLZI;
            Aweme aweme = this.LJLJI;
            TextView textView = this.LJLJJI;
            this.LJLIL = 1;
            c54136LMm.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new C51023K0t(textView, c54136LMm, aweme, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C54136LMm c54136LMm2 = this.LJLILLLLZI;
        TextView textView2 = this.LJLJJI;
        Aweme aweme2 = this.LJLJI;
        String str = (String) obj;
        if (c54136LMm2.LJLLLL) {
            textView2.setText(c54136LMm2.LJIILL());
        } else {
            textView2.setText(str);
        }
        c54136LMm2.LJLLILLLL = new OSZ<>(aweme2, str);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
