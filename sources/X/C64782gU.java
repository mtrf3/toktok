package X;

import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel$updateCart$1", f = "ShopMainLynxViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2gU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64782gU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ShopMainLynxViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64782gU(ShopMainLynxViewModel shopMainLynxViewModel, String str, InterfaceC67352kd<? super C64782gU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = shopMainLynxViewModel;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64782gU(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        if (r0 < 0) goto L28;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.C141335gf.LIZJ(r13)
            com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel r4 = r12.LJLIL
            java.lang.String r2 = r12.LJLILLLLZI
            r5 = 0
            com.google.gson.Gson r1 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L22
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.mall.bean.Card> r0 = com.ss.android.ugc.aweme.ecommerce.mall.bean.Card.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L22
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L22
            java.lang.Object r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> L22
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.ecommerce.mall.bean.Card     // Catch: com.google.gson.s -> L22
            if (r0 != 0) goto L1f
            r3 = r5
        L1f:
            com.ss.android.ugc.aweme.ecommerce.mall.bean.Card r3 = (com.ss.android.ugc.aweme.ecommerce.mall.bean.Card) r3     // Catch: com.google.gson.s -> L22
            goto L23
        L22:
            r3 = r5
        L23:
            r4.getClass()
            if (r3 == 0) goto L65
            java.lang.String r2 = r3.getStyle()
            com.google.gson.Gson r1 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L65
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.mall.tools.dto.ToolPanelEntryCardStyleDTO> r0 = com.ss.android.ugc.aweme.ecommerce.mall.tools.dto.ToolPanelEntryCardStyleDTO.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L65
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L65
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> L65
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.mall.tools.dto.ToolPanelEntryCardStyleDTO     // Catch: com.google.gson.s -> L65
            if (r0 != 0) goto L43
            r1 = r5
        L43:
            com.ss.android.ugc.aweme.ecommerce.mall.tools.dto.ToolPanelEntryCardStyleDTO r1 = (com.ss.android.ugc.aweme.ecommerce.mall.tools.dto.ToolPanelEntryCardStyleDTO) r1     // Catch: com.google.gson.s -> L65
            if (r1 != 0) goto La3
            goto L65
        L48:
            int r1 = r1.intValue()
            if (r1 != r0) goto Lc3
        L4e:
            com.ss.android.ugc.aweme.ecommerce.mall.bean.CardTip r2 = (com.ss.android.ugc.aweme.ecommerce.mall.bean.CardTip) r2
            if (r2 != 0) goto L7b
        L52:
            X.LvN r5 = new X.LvN
            X.M1j r0 = X.EnumC56135M1j.CARD_TYPE_CART_ENTRY
            int r0 = r0.getValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r10 = 1
            r11 = 40
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L65:
            com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel r2 = r12.LJLIL
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 465(0x1d1, float:6.52E-43)
            r1.<init>(r5, r0)
            r2.setState(r1)
            com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel r1 = r12.LJLIL
            X.2ml r0 = r1.LJLJLLL
            r1.lv0(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7b:
            java.lang.String r0 = r2.getData()     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L8c
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 >= 0) goto L8d
        L87:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L8f
            goto L8f
        L8c:
            r0 = 0
        L8d:
            r4 = r0
            goto L87
        L8f:
            r7 = r5
            X.LvN r5 = new X.LvN
            X.M1j r0 = X.EnumC56135M1j.CARD_TYPE_CART_ENTRY
            int r0 = r0.getValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r10 = 1
            r11 = 32
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L65
        La3:
            java.lang.String r9 = r1.getButtonName()
            if (r9 != 0) goto Lab
            java.lang.String r9 = ""
        Lab:
            com.ss.android.ugc.aweme.ecommerce.mall.tools.dto.ToolPanelEntryLinkDTO r0 = r1.getLink()
            if (r0 == 0) goto Lb7
            java.lang.String r8 = r0.getLink()
            if (r8 != 0) goto Lb9
        Lb7:
            java.lang.String r8 = r4.LJLJLJ
        Lb9:
            java.util.List r0 = r3.getTipList()
            if (r0 == 0) goto L52
            java.util.Iterator r3 = r0.iterator()
        Lc3:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto Lde
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.mall.bean.CardTip r0 = (com.ss.android.ugc.aweme.ecommerce.mall.bean.CardTip) r0
            java.lang.Integer r1 = r0.getType()
            X.2gV r0 = X.EnumC64792gV.CARD_TIP_TYPE_REDDOT
            int r0 = r0.getValue()
            if (r1 != 0) goto L48
            goto Lc3
        Lde:
            r2 = r5
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64782gU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
