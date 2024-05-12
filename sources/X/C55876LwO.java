package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS156S0200000_9;

/* renamed from: X.LwO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55876LwO implements InterfaceC55929LxF {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<EnumC55811LvL, C76800UCe> LIZIZ;
    public final /* synthetic */ LQ6 LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.InterfaceC55929LxF
    public final void LIZIZ() {
        TopTabAbility LJJLIIIJJIZ;
        C36746EbW.LIZ(3, "ShopTab Tooltip Click");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LIZJ.LIZ);
        if (LJJIFFI != null) {
            Intent intent = LJJIFFI.getIntent();
            if (intent != null) {
                intent.putExtra("extra_shop_tab_mock_click", 1);
            }
            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI);
            if (LJJLIIIJJI != null && (LJJLIIIJJIZ = C78847Ux1.LJJLIIIJJIZ(LJJLIIIJJI)) != null) {
                LJJLIIIJJIZ.Of0();
            }
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC55929LxF
    public final void LIZ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC55929LxF
    public final void LIZJ(EnumC55811LvL enumC55811LvL) {
        InterfaceC88472Yns<EnumC55811LvL, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(enumC55811LvL);
        }
    }

    public C55876LwO(AqS156S0200000_9 aqS156S0200000_9, AqS140S0200000_9 aqS140S0200000_9, LQ6 lq6, AqS156S0200000_9 aqS156S0200000_92) {
        this.LIZ = aqS156S0200000_9;
        this.LIZIZ = aqS140S0200000_9;
        this.LIZJ = lq6;
        this.LIZLLL = aqS156S0200000_92;
    }
}
