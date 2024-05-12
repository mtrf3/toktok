package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS9S1100100_4;
import kotlin.jvm.internal.o;

/* renamed from: X.A9y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25782A9y extends AbstractC65781Prl implements InterfaceC88471Ynr<C3C8, C43I<? extends Boolean>, C76800UCe> {
    public final /* synthetic */ C244869jG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25782A9y(C244869jG c244869jG) {
        super(2);
        this.LJLIL = c244869jG;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C3C8 selectSubscribe, C43I<? extends Boolean> c43i) {
        Boolean LIZ;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (LIZ = c43i2.LIZ()) != null) {
            if (LIZ.booleanValue() && !C1E4.LJIJJLI()) {
                C244869jG c244869jG = this.LJLIL;
                Bundle bundle = c244869jG.LJLJJI;
                RecUserAfterAuthPopupVM recUserAfterAuthPopupVM = c244869jG.LJLJI;
                recUserAfterAuthPopupVM.getClass();
                ArrayList arrayList = new ArrayList();
                if (recUserAfterAuthPopupVM.LJLJJLL != null) {
                    arrayList.add(EnumC58046MqI.CONTACT);
                }
                if (recUserAfterAuthPopupVM.LJLJL != null) {
                    arrayList.add(EnumC58046MqI.FACEBOOK);
                }
                bundle.putSerializable("auth_platform_key", new ArrayList(arrayList));
                bundle.putString("enter_method", "authorize_pop_up");
                bundle.putInt("loading_style_key", 301);
                bundle.putBoolean("use_storage_key", true);
                bundle.putBoolean("is_after_auth", true);
                String enterFrom = bundle.getString("enter_from", "");
                c244869jG.LJLILLLLZI.LJIILL(bundle, c244869jG.LJLIL);
                long currentTimeMillis = System.currentTimeMillis();
                o.LJIIIIZZ(enterFrom, "enterFrom");
                EnumC25783A9z enumC25783A9z = EnumC25783A9z.AUTHORIZE;
                long j = AA1.LIZ().LIZ.getLong("dialog_last_shown_timestamp", 0L);
                if (j == 0 || (valueOf = Long.valueOf(j)) == null) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(currentTimeMillis - valueOf.longValue());
                }
                long j2 = AA1.LIZ().LIZ.getLong("dialog_last_negative_feedback_timestamp", 0L);
                if (j2 == 0 || (valueOf3 = Long.valueOf(j2)) == null) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(currentTimeMillis - valueOf3.longValue());
                }
                new AA2(enterFrom, enumC25783A9z, valueOf2, valueOf4).LIZLLL(null);
                C57738MlK.LIZIZ.LJIIIIZZ(enterFrom);
                InterfaceC25781A9x interfaceC25781A9x = c244869jG.LJLILLLLZI;
                FragmentManager supportFragmentManager = c244869jG.LJLIL.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "hostActivity.supportFragmentManager");
                interfaceC25781A9x.LJIIZILJ(supportFragmentManager, C65352Pkq.LIZ(InterfaceC25781A9x.class).LJFF(), new AqS9S1100100_4(currentTimeMillis, enterFrom, c244869jG, 4));
                AA1.LIZ().LIZ.storeLong("dialog_last_shown_timestamp", System.currentTimeMillis());
            } else {
                this.LJLIL.LJLILLLLZI.dismiss();
                PopupManager.LIZJ(C246509lu.class);
            }
        }
        return C76800UCe.LIZ;
    }
}
