package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion;

import X.C116714i3;
import X.C116724i4;
import X.C16880lQ;
import X.C221108m2;
import X.C26771Af1;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70759Rpr;
import X.C72545SdZ;
import X.C73156SnQ;
import X.EnumC72807Shn;
import X.RV8;
import X.SY4;
import X.TBT;
import X.W5F;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSaleReminderButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpFlashSaleReminderViewHolder extends AbsFullSpanVH {
    public final SY4 LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final TuxIconView LJLJI;
    public final TuxTextView LJLJJI;
    public final C26771Af1 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final Map<Integer, View> LJLJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLJJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.RlY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFlashSaleCountDown();
            }
        }, new AqS194S0100000_12(this, 54));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rla
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getReminderButtonState();
            }
        }, new AqS194S0100000_12(this, 55));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpFlashSaleReminderViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a2b, viewGroup, false));
        this.LJLJL = C44878HjO.LIZIZ(viewGroup, "parent");
        View findViewById = this.itemView.findViewById(R.id.din);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.….flash_sale_reminder_btn)");
        this.LJLIL = (SY4) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.di9);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.flash_sale_icon)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.dil);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.flash_sale_reminder_bg)");
        this.LJLJI = (TuxIconView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ivd);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.reminder_price)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.dis);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.flash_sale_start_time)");
        this.LJLJJL = (C26771Af1) findViewById5;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 55));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        Integer num;
        RV8 item = (RV8) obj;
        o.LJIIIZ(item, "item");
        Image image = item.LJFF;
        if (image != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJJIIJZLJL = this.LJLJI;
            C16880lQ.LLJJJ(LIZLLL);
        }
        Image image2 = item.LJII;
        if (image2 != null) {
            W5F LIZLLL2 = C70759Rpr.LIZLLL(image2);
            LIZLLL2.LJIJJ = EnumC72807Shn.FIT_START;
            LIZLLL2.LJJIIJZLJL = this.LJLILLLLZI;
            C16880lQ.LLJJJ(LIZLLL2);
        }
        String str = item.LJI;
        boolean z = false;
        if (str == null || str.length() == 0) {
            this.LJLJJI.setText("--");
        } else {
            C116724i4 c116724i4 = new C116724i4();
            String str2 = item.LJI;
            o.LJI(str2);
            c116724i4.LIZLLL(str2);
            C116714i3 c116714i3 = c116724i4.LIZ;
            TuxTextView tuxTextView = this.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("- ");
            LIZ.append((Object) c116714i3);
            tuxTextView.setText(X1D.LIZIZ(LIZ));
        }
        String str3 = item.LIZIZ;
        if (str3 != null) {
            this.LJLJJL.setStartTime(str3);
        }
        FlashSaleReminderButton flashSaleReminderButton = item.LJ;
        if (flashSaleReminderButton != null && flashSaleReminderButton.status != null) {
            SY4 sy4 = this.LJLIL;
            if (flashSaleReminderButton != null && (num = flashSaleReminderButton.status) != null && num.intValue() == 2) {
                z = true;
            }
            sy4.setEnabled(!z);
        }
        if (!getViewModel().LLJ) {
            getViewModel().LLJ = true;
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIJL(null);
            }
        }
        C16880lQ.LJIIJ(new Au2S16S0100000_7(this, 9, 42, 42), this.LJLIL);
    }
}
