package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.settings.MessageCenterTabListEntranceSettings;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.TabChunk$refresh$1", f = "MessageCenterAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.SHm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71842SHm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C71851SHv LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71842SHm(C71851SHv c71851SHv, InterfaceC67352kd<? super C71842SHm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71851SHv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71842SHm(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJJL.LJFF();
        C72808Sho<InterfaceC57784Mm4> c72808Sho = this.LJLIL.LJLJJL;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        MessageCenterTabListEntranceSettings.TabListEntranceConfigModel tabListEntranceConfigModel = MessageCenterTabListEntranceSettings.LIZ;
        MessageCenterTabListEntranceSettings.TabListEntranceConfigModel tabListEntranceConfigModel2 = (MessageCenterTabListEntranceSettings.TabListEntranceConfigModel) LIZLLL.LJIIIIZZ("ecom_shop_message_function_entrance_config", MessageCenterTabListEntranceSettings.TabListEntranceConfigModel.class, tabListEntranceConfigModel);
        if (tabListEntranceConfigModel2 != null) {
            tabListEntranceConfigModel = tabListEntranceConfigModel2;
        }
        c72808Sho.LIZJ(new C35538Dx8(tabListEntranceConfigModel.functionEntranceItems));
        this.LJLIL.LJLJJL.LIZJ(new C94133mj(O6R.LJJIIZ(C32151Nz.LJIIZILJ(new Integer(8))), R.attr.ds, 0, 0, 0, 60));
        this.LJLIL.LJLJJLL.gv0(EnumC71845SHp.TAB_LIST, EnumC71844SHo.SUCCESS);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
