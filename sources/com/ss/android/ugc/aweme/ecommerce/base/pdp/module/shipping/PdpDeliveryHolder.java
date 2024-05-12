package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping;

import X.ASL;
import X.C03090Af;
import X.C221108m2;
import X.C27158AlG;
import X.C27162AlK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70649Ro5;
import X.C79234V7u;
import X.InterfaceC71003Rtn;
import X.RU7;
import X.RUH;
import X.RUP;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class PdpDeliveryHolder extends PdpHolder {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final LinkedList<TuxTextView> LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x07e7, code lost:
    
        if (r1 == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0880, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x086d, code lost:
    
        if (r1 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x098a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x06c5, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04cb, code lost:
    
        if (r1 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x059c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0251, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L63;
     */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBind(X.C27127Akl r34) {
        /*
            Method dump skipped, instructions count: 2563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder.onBind(X.Akl):void");
    }

    public static C70649Ro5 L(Context context, String str) {
        C70649Ro5 c70649Ro5 = new C70649Ro5(context, null, 6);
        c70649Ro5.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        C27158AlG block = C27158AlG.LJLIL;
        o.LJIIIZ(block, "block");
        block.invoke(c70649Ro5);
        int i = C27162AlK.LJJII;
        c70649Ro5.setTagUi(new RUP(new RUH(0, null, null, new RU7(i, i, Integer.valueOf(R.drawable.b80)), 6), new RUH(4, null, null, null, 14), new RUH(2, str, null, null, 12)));
        return c70649Ro5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(android.view.View r16, X.C27127Akl r17) {
        /*
            r15 = this;
            r10 = r17
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping r0 = r10.LJLJI
            r14 = 0
            if (r0 == 0) goto Lc4
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService r11 = r0.shippingService
            if (r11 == 0) goto Lc5
            java.util.List<java.lang.String> r0 = r11.serviceNames
        Ld:
            java.lang.String r3 = "itemView.shipping_service_group"
            r4 = 2131376004(0x7f0a3784, float:1.8372172E38)
            r12 = r16
            if (r0 != 0) goto L21
            android.view.View r0 = r12.findViewById(r4)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            X.OUP.LJIJJLI(r0)
        L20:
            return
        L21:
            android.view.View r0 = r12.findViewById(r4)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            X.OUP.LJJLIIIJ(r0)
            java.util.List<java.lang.String> r0 = r11.serviceNames
            java.util.Iterator r9 = r0.iterator()
            java.lang.String r7 = ""
            r8 = 0
            r6 = r7
        L35:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r5 = r9.next()
            int r2 = r8 + 1
            if (r8 < 0) goto Lc8
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = ujb.o.LJJJJJL(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L63
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r6)
            if (r8 == 0) goto L5c
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r7)
            if (r0 == 0) goto L65
        L5c:
            r1.append(r5)
            java.lang.String r6 = X.X1D.LIZIZ(r1)
        L63:
            r8 = r2
            goto L35
        L65:
            java.lang.String r0 = " · "
            java.lang.String r5 = defpackage.i0.LJFF(r0, r5)
            goto L5c
        L6c:
            r0 = 2131379631(0x7f0a45af, float:1.8379528E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r6)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 66
            r9 = r15
            r1.<init>(r9, r2, r2, r0)
            X.Ol8 r13 = X.C221108m2.LIZIZ(r1)
            android.view.View r1 = r12.findViewById(r4)
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
            X.AfI r8 = new X.AfI
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = 3
            X.C78565UsT.LJJIZ(r1, r14, r8, r0)
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r0 = r11.icon
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.icon
            if (r0 == 0) goto La7
            X.2cu r14 = r0.toThumbFirstImageUrlModel()
        La7:
            X.W5F r1 = X.C70759Rpr.LIZLLL(r14)
            r0 = 2131231824(0x7f080450, float:1.807974E38)
            r1.LJIIJJI = r0
            X.Shn r0 = X.EnumC72807Shn.FIT_XY
            r1.LJIJJ = r0
            r0 = 2131368267(0x7f0a194b, float:1.835648E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.LJJIIJZLJL = r0
            X.C16880lQ.LLJJJ(r1)
            goto L20
        Lc4:
            r11 = r14
        Lc5:
            r0 = r14
            goto Ld
        Lc8:
            X.C47261Igj.LJJJJJ()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder.M(android.view.View, X.Akl):void");
    }

    public final void P(ShippingDialogDto shippingDialogDto, InterfaceC71003Rtn interfaceC71003Rtn) {
        FragmentManager childFragmentManager = this.LJLIL.getChildFragmentManager();
        if (shippingDialogDto == null || childFragmentManager == null) {
            return;
        }
        DeliveryBySellerInfoFragment deliveryBySellerInfoFragment = new DeliveryBySellerInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_shipping_dialog", shippingDialogDto);
        if (interfaceC71003Rtn != null) {
            C79234V7u.LJJIJIIJI(bundle, interfaceC71003Rtn, null);
        }
        deliveryBySellerInfoFragment.setArguments(bundle);
        ASL asl = new ASL();
        asl.LJI(1);
        int i = ((int) C27162AlK.LIZJ) / 2;
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLLLLL = i;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJLLILLLL = deliveryBySellerInfoFragment;
        tuxSheet.show(childFragmentManager, "DeliveryBySellerInfoFragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpDeliveryHolder(int i, View view, ECBaseFragment eCBaseFragment) {
        super(view, i);
        this.LJLJJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 172));
        this.LJLJI = new LinkedList<>();
    }
}
