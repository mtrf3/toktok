package X;

import android.content.Context;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import com.bytedance.effectcreatormobile.objectselect.EffectSelectFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS191S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ald, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94725ald extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public final /* synthetic */ IDqS191S0200000_42 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C94033aaT LJLJI;
    public final /* synthetic */ C94618aju LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94725ald(IDqS191S0200000_42 iDqS191S0200000_42, long j, C94033aaT c94033aaT, C94618aju c94618aju) {
        super(2);
        this.LJLIL = iDqS191S0200000_42;
        this.LJLILLLLZI = j;
        this.LJLJI = c94033aaT;
        this.LJLJJI = c94618aju;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, String str) {
        boolean booleanValue = bool.booleanValue();
        String result = str;
        o.LJIIIZ(result, "result");
        if (booleanValue) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
            EffectSelectFragment effectSelectFragment = ((C94092abQ) this.LJLIL.l1).LJLJI;
            String str2 = this.LJLJI.LJ;
            Long valueOf = Long.valueOf(currentTimeMillis);
            effectSelectFragment.getClass();
            EffectSelectFragment.Al(true, valueOf, str2);
            this.LJLJJI.LJLLLLLL(this.LJLJI, EnumC93674aUg.Normal);
            ((C94092abQ) this.LJLIL.l1).LJLLLLLL(this.LJLJI, result);
        } else {
            EffectSelectFragment effectSelectFragment2 = ((C94092abQ) this.LJLIL.l1).LJLJI;
            String str3 = this.LJLJI.LJ;
            effectSelectFragment2.getClass();
            EffectSelectFragment.Al(false, null, str3);
            this.LJLJJI.LJLLLLLL(this.LJLJI, EnumC93674aUg.Retry);
            ToastService toastService = ToastService.INSTANCE;
            Context context = ((C93672aUe) this.LJLIL.l0).getContext();
            o.LJIIIIZZ(context, "context");
            String string = ((C94092abQ) this.LJLIL.l1).LJLJI.getString(R.string.fx4);
            o.LJIIIIZZ(string, "getString(com.ugc.effect…ffect_tool_noconnection1)");
            toastService.showToast(context, string);
        }
        return C76800UCe.LIZ;
    }
}
