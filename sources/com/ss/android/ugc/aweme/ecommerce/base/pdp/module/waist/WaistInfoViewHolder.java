package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.waist;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C018905p;
import X.C03660Ck;
import X.C110614Vt;
import X.C116714i3;
import X.C116724i4;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C25620zW;
import X.C26338AVi;
import X.C26706Ady;
import X.C26771Af1;
import X.C26775Af5;
import X.C27570Aru;
import X.C2WL;
import X.C32151Nz;
import X.C44878HjO;
import X.C5H3;
import X.C61328O5c;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69689RWr;
import X.C70101RfF;
import X.C70376Rjg;
import X.C70414RkI;
import X.C70445Rkn;
import X.C70646Ro2;
import X.C70759Rpr;
import X.C72545SdZ;
import X.C73156SnQ;
import X.C78685UuP;
import X.C78983UzD;
import X.C79045V0n;
import X.C7MY;
import X.C8FR;
import X.EnumC72807Shn;
import X.InterfaceC27046AjS;
import X.L9G;
import X.O6R;
import X.OUP;
import X.RV8;
import X.SAM;
import X.SY4;
import X.TBT;
import X.W5F;
import X.X1D;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSaleReminderButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import v82.IDdS503S0100000_12;
import wg5.c;

/* loaded from: classes13.dex */
public final class WaistInfoViewHolder extends AbsFullSpanVH implements c {
    public Map<Integer, View> _$_findViewCache;
    public View contentView;
    public final Context context;
    public final C5H3 style$delegate;
    public final C5H3 viewModel$delegate;
    public boolean waistExposed;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPrice() {
        CharSequence charSequence;
        int i;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        ((TuxTextView) view.findViewById(R.id.i4d)).setTextColorRes(R.attr.dj);
        if (((C69689RWr) getItem()).LIZLLL) {
            ((TuxTextView) view.findViewById(R.id.i4d)).setTuxFont(32);
        } else {
            ((TuxTextView) view.findViewById(R.id.i4d)).setTuxFont(22);
        }
        TextView textView = (TextView) view.findViewById(R.id.i4d);
        String str = ((C69689RWr) getItem()).LJFF;
        if (str.length() == 0) {
            charSequence = "--";
        } else {
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZLLL(str);
            charSequence = c116724i4.LIZ;
        }
        textView.setText(charSequence);
        C116724i4 c116724i42 = new C116724i4();
        c116724i42.LIZLLL(((C69689RWr) getItem()).LJ);
        C116714i3 c116714i3 = c116724i42.LIZ;
        ((TextView) view.findViewById(R.id.geb)).getPaint().setFlags(16);
        ((TextView) view.findViewById(R.id.geb)).getPaint().setAntiAlias(true);
        ((TextView) view.findViewById(R.id.geb)).setText(c116714i3);
        View findViewById = view.findViewById(R.id.geb);
        o.LJIIIIZZ(findViewById, "contentView.market_price");
        if (C78685UuP.LJJJZ(((C69689RWr) getItem()).LJ)) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((AppCompatTextView) view.findViewById(R.id.cao)).setBackgroundResource(R.drawable.abb);
        ((TuxTextView) view.findViewById(R.id.cao)).setTextColorRes(R.attr.dj);
        TextView textView2 = (TextView) view.findViewById(R.id.cao);
        o.LJIIIIZZ(textView2, "contentView.discount");
        OUP.LJJLIIIJILLIZJL(textView2, ((C69689RWr) getItem()).LJI);
        View findViewById2 = view.findViewById(R.id.geb);
        o.LJIIIIZZ(findViewById2, "contentView.market_price");
        if (findViewById2.getVisibility() != 0) {
            View findViewById3 = view.findViewById(R.id.cao);
            o.LJIIIIZZ(findViewById3, "contentView.discount");
            ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
            if (!(layoutParams instanceof C018905p)) {
                layoutParams = null;
            }
            C018905p c018905p = (C018905p) layoutParams;
            if (c018905p != null) {
                c018905p.startToStart = view.findViewById(R.id.lfb).getId();
                findViewById3.setLayoutParams(c018905p);
            }
        }
        if (isNewAtmosphereStyle(((C69689RWr) getItem()).LIZIZ)) {
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.dg, context);
            if (LJI != null) {
                view.findViewById(R.id.cao).setBackgroundColor(LJI.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPriceOrDeductionText() {
        View view = this.contentView;
        if (view == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.hl1);
        if (textView != null) {
            textView.setText(((C69689RWr) getItem()).LJFF);
        }
        ViewGroup.LayoutParams layoutParams = null;
        String str = null;
        int i = 8;
        if (C78685UuP.LJJJZ(((C69689RWr) getItem()).LJ) || C78685UuP.LJJJZ(((C69689RWr) getItem()).LJI)) {
            view.findViewById(R.id.hkx).setVisibility(8);
            view.findViewById(R.id.hl0).setVisibility(0);
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZLLL(((C69689RWr) getItem()).LJ);
            C116714i3 c116714i3 = c116724i4.LIZ;
            ((TextView) view.findViewById(R.id.hkz)).getPaint().setFlags(16);
            ((TextView) view.findViewById(R.id.hkz)).getPaint().setAntiAlias(true);
            ((TextView) view.findViewById(R.id.hkz)).setText(c116714i3);
            View findViewById = view.findViewById(R.id.hkz);
            o.LJIIIIZZ(findViewById, "contentView.pdp_waist_original_price");
            if (C78685UuP.LJJJZ(((C69689RWr) getItem()).LJ)) {
                i = 0;
            }
            findViewById.setVisibility(i);
            ((AppCompatTextView) view.findViewById(R.id.hky)).setBackgroundResource(R.drawable.abv);
            ((TuxTextView) view.findViewById(R.id.hky)).setTextColorRes(R.attr.dj);
            TextView textView2 = (TextView) view.findViewById(R.id.hky);
            o.LJIIIIZZ(textView2, "contentView.pdp_waist_discount");
            OUP.LJJLIIIJILLIZJL(textView2, ((C69689RWr) getItem()).LJI);
            View findViewById2 = view.findViewById(R.id.hkz);
            o.LJIIIIZZ(findViewById2, "contentView.pdp_waist_original_price");
            if (findViewById2.getVisibility() == 0) {
                return;
            }
            View findViewById3 = view.findViewById(R.id.hky);
            o.LJIIIIZZ(findViewById3, "contentView.pdp_waist_discount");
            ViewGroup.LayoutParams layoutParams2 = findViewById3.getLayoutParams();
            if (layoutParams2 instanceof C018905p) {
                layoutParams = layoutParams2;
            }
            C018905p c018905p = (C018905p) layoutParams;
            if (c018905p == null) {
                return;
            }
            c018905p.startToStart = view.findViewById(R.id.lfb).getId();
            findViewById3.setLayoutParams(c018905p);
            return;
        }
        view.findViewById(R.id.hkx).setVisibility(0);
        view.findViewById(R.id.hl0).setVisibility(8);
        TextView textView3 = (TextView) view.findViewById(R.id.hkg);
        if (textView3 != null) {
            DeductibleVoucherReminder deductibleVoucherReminder = ((C69689RWr) getItem()).LJIIJ;
            if (deductibleVoucherReminder != null) {
                str = deductibleVoucherReminder.spuDeductionText;
            }
            textView3.setText(str);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.hkf);
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_chevron_down_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView.setTuxIcon(c2068389v);
        }
        View findViewById4 = view.findViewById(R.id.hkx);
        o.LJIIIIZZ(findViewById4, "contentView.pdp_waist_deduction_text_layout");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 11, 42), findViewById4);
    }

    public final IWaistInfoStyle getStyle() {
        return (IWaistInfoStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showCommonActivity() {
        Image image;
        WaistBanner waistBanner = ((C69689RWr) getItem()).LIZJ;
        if (waistBanner != null && (image = waistBanner.background) != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.ngl);
            L9G.LIZ(LIZLLL);
        }
        showPrice();
        showActivity(((C69689RWr) getItem()).LIZJ);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rlb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getReminderButtonState();
            }
        }, new AqS194S0100000_12(this, 57));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.RlZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFlashSaleCountDown();
            }
        }, new AqS194S0100000_12(this, 58));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onResume() {
        super.onResume();
        trackTag(new C70445Rkn(getItem()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showReminderConfirmDlg() {
        RV8 rv8 = ((C69689RWr) getItem()).LJII;
        if (rv8 == null) {
            return;
        }
        PdpViewModel viewModel = getViewModel();
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        viewModel.fx0(context, rv8, itemView, new AqS154S0200000_7(this, rv8, 20));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaistInfoViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a5e, viewGroup, false));
        this._$_findViewCache = C44878HjO.LIZIZ(viewGroup, "parent");
        this.context = this.itemView.getContext();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 71));
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 367));
    }

    private final void adjustMallFlashSellStyle(C69689RWr c69689RWr) {
        String str;
        FlashSale flashSale;
        Integer num;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        Integer defaultEndIntTextColor = getStyle().getDefaultEndIntTextColor();
        if (defaultEndIntTextColor != null) {
            int intValue = defaultEndIntTextColor.intValue();
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.did);
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(intValue);
            }
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.dia);
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(intValue);
            }
            C26775Af5 c26775Af5 = (C26775Af5) view.findViewById(R.id.dia);
            if (c26775Af5 != null) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                c26775Af5.setColor(C79045V0n.LJI(intValue, context));
            }
        }
        String LIZ = SAM.LIZ();
        if (LIZ != null) {
            str = LIZ.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str = null;
        }
        if (o.LJ(str, "SA") || (flashSale = c69689RWr.LIZIZ) == null || (num = flashSale.flashSaleStyle) == null || num.intValue() != 2) {
            return;
        }
        ((TuxTextView) view.findViewById(R.id.dia)).setTextColorRes(R.attr.dj);
        ((C26775Af5) view.findViewById(R.id.dia)).setStyle(1);
        ((TuxTextView) view.findViewById(R.id.did)).setTextColorRes(R.attr.dj);
        ((TuxTextView) view.findViewById(R.id.did)).setTuxFont(92);
        ImageView imageView = (ImageView) view.findViewById(R.id.e9a);
        o.LJIIIIZZ(imageView, "contentView.ic_coupon");
        imageView.setVisibility(8);
        this.itemView.findViewById(R.id.ngl).setBackgroundColor(0);
        FlashSale flashSale2 = c69689RWr.LIZIZ;
        if (flashSale2.remindButton != null) {
            return;
        }
        if (isNewAtmosphereStyle(flashSale2)) {
            Context context2 = this.context;
            o.LJIIIIZZ(context2, "context");
            Integer LJI = C79045V0n.LJI(R.attr.dg, context2);
            if (LJI != null) {
                view.findViewById(R.id.cao).setBackgroundColor(LJI.intValue());
            }
            ((TuxTextView) view.findViewById(R.id.cao)).setTuxFont(92);
            View findViewById = view.findViewById(R.id.i4d);
            if (findViewById == null) {
                return;
            }
            C26338AVi.LJI(findViewById, AnonymousClass391.LIZJ(0), null, null, null, false, 30);
            return;
        }
        ((AppCompatTextView) view.findViewById(R.id.cao)).setBackgroundResource(R.drawable.adh);
        ((TuxTextView) view.findViewById(R.id.cao)).setTuxFont(81);
    }

    private final void adjustMallFlashSellStyleUS(C69689RWr c69689RWr) {
        String str;
        FlashSale flashSale;
        Integer num;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        Integer defaultEndIntTextColor = getStyle().getDefaultEndIntTextColor();
        if (defaultEndIntTextColor != null) {
            int intValue = defaultEndIntTextColor.intValue();
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.did);
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(intValue);
            }
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.dia);
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(intValue);
            }
            C26775Af5 c26775Af5 = (C26775Af5) view.findViewById(R.id.dia);
            if (c26775Af5 != null) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                c26775Af5.setColor(C79045V0n.LJI(intValue, context));
            }
        }
        String LIZ = SAM.LIZ();
        if (LIZ != null) {
            str = LIZ.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str = null;
        }
        if (o.LJ(str, "SA") || (flashSale = c69689RWr.LIZIZ) == null || (num = flashSale.flashSaleStyle) == null || num.intValue() != 2) {
            return;
        }
        ((TuxTextView) view.findViewById(R.id.dia)).setTextColorRes(R.attr.dj);
        ((C26775Af5) view.findViewById(R.id.dia)).setStyle(1);
        ((TuxTextView) view.findViewById(R.id.did)).setTextColorRes(R.attr.dj);
        ((TuxTextView) view.findViewById(R.id.did)).setTuxFont(92);
        ImageView imageView = (ImageView) view.findViewById(R.id.di9);
        o.LJIIIIZZ(imageView, "contentView.flash_sale_icon");
        imageView.setVisibility(8);
        this.itemView.findViewById(R.id.ngl).setBackgroundColor(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindWaist(X.C69689RWr r15) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.waist.WaistInfoViewHolder.bindWaist(X.RWr):void");
    }

    private final boolean isNewAtmosphereStyle(FlashSale flashSale) {
        Integer num;
        if (flashSale == null || flashSale.atmosphereStyle == null || (num = flashSale.atmosphereStyle) == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    private final boolean isShowFlashIcon(FlashSale flashSale) {
        Integer num = flashSale.flashSaleStyle;
        if ((num != null && num.intValue() != 2) || flashSale.flashSaleStyle == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showActivity(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistBanner r11) {
        /*
            r10 = this;
            android.view.View r6 = r10.contentView
            if (r6 != 0) goto L5
            return
        L5:
            r5 = 2131373874(0x7f0a2f32, float:1.8367852E38)
            android.view.View r1 = r6.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r9 = 0
            if (r1 == 0) goto L18
            if (r11 == 0) goto Lf2
            java.lang.String r0 = r11.promotionName
        L15:
            X.OUP.LJJLIIIJILLIZJL(r1, r0)
        L18:
            r4 = 2131362005(0x7f0a00d5, float:1.8343778E38)
            android.view.View r1 = r6.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L2a
            if (r11 == 0) goto Lef
            java.lang.String r0 = r11.activityName
        L27:
            X.OUP.LJJLIIIJILLIZJL(r1, r0)
        L2a:
            android.view.View r0 = r6.findViewById(r5)
            r3 = 0
            if (r0 == 0) goto Lec
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 != 0) goto Lec
        L38:
            java.lang.String r8 = "\\n"
            java.lang.String r7 = "context"
            if (r0 == 0) goto La6
            android.view.View r2 = r6.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L96
        L46:
            android.view.View r1 = r6.findViewById(r4)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto L53
            r0 = 92
            r1.setTuxFont(r0)
        L53:
            android.view.View r2 = r6.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L6a
            android.content.Context r1 = r10.context
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r7)
            r0 = 2130968665(0x7f040059, float:1.754599E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r1)
            r2.setTextColor(r0)
        L6a:
            android.view.View r2 = r6.findViewById(r4)
            if (r2 == 0) goto L7f
            android.content.Context r1 = r10.context
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r7)
            r0 = 2130968641(0x7f040041, float:1.7545941E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r1)
            r2.setBackgroundColor(r0)
        L7f:
            android.view.View r0 = r6.findViewById(r5)
            if (r0 != 0) goto L8a
            java.lang.String r0 = "WaistInfoViewHolder, promotion_name is null"
            X.C78983UzD.LJIILL(r0)
        L8a:
            android.view.View r0 = r6.findViewById(r4)
            if (r0 != 0) goto L95
            java.lang.String r0 = "WaistInfoViewHolder, activity_name is null"
            X.C78983UzD.LJIILL(r0)
        L95:
            return
        L96:
            if (r11 == 0) goto La2
            java.lang.String r1 = r11.activityName
            if (r1 == 0) goto La2
            java.lang.String r0 = " "
            java.lang.String r9 = ujb.o.LJJJJZ(r1, r8, r0, r3)
        La2:
            r2.setText(r9)
            goto L46
        La6:
            android.view.View r2 = r6.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto Ldc
        Lae:
            android.view.View r1 = r6.findViewById(r4)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto Lbb
            r0 = 62
            r1.setTuxFont(r0)
        Lbb:
            android.view.View r2 = r6.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto Ld2
            android.content.Context r1 = r10.context
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r7)
            r0 = 2130968606(0x7f04001e, float:1.754587E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r1)
            r2.setTextColor(r0)
        Ld2:
            android.view.View r0 = r6.findViewById(r4)
            if (r0 == 0) goto L7f
            r0.setBackgroundColor(r3)
            goto L7f
        Ldc:
            if (r11 == 0) goto Le8
            java.lang.String r1 = r11.activityName
            if (r1 == 0) goto Le8
            java.lang.String r0 = "\n"
            java.lang.String r9 = ujb.o.LJJJJZ(r1, r8, r0, r3)
        Le8:
            r2.setText(r9)
            goto Lae
        Lec:
            r0 = 0
            goto L38
        Lef:
            r0 = r9
            goto L27
        Lf2:
            r0 = r9
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.waist.WaistInfoViewHolder.showActivity(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistBanner):void");
    }

    private final void showCommonActivityUK(WaistBanner waistBanner) {
        boolean z;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        Image image = waistBanner.background;
        if (image != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.ngl);
            L9G.LIZ(LIZLLL);
        }
        showPriceOrDeductionText();
        String str = waistBanner.promotionName;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = (TextView) view.findViewById(R.id.icp);
            if (textView != null) {
                OUP.LJJLIIIJILLIZJL(textView, waistBanner.activityName);
            }
            View findViewById = view.findViewById(R.id.pf);
            if (findViewById == null) {
                return;
            }
            findViewById.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.icp);
        if (textView2 != null) {
            OUP.LJJLIIIJILLIZJL(textView2, waistBanner.promotionName);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.pf);
        if (textView3 == null) {
            return;
        }
        OUP.LJJLIIIJILLIZJL(textView3, waistBanner.activityName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showCommonActivityUS(WaistBanner waistBanner) {
        boolean z;
        View view;
        TextView textView;
        TextView textView2;
        TextView textView3;
        View findViewById;
        TextView textView4;
        Image image = waistBanner.background;
        if (image != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.ngl);
            L9G.LIZ(LIZLLL);
        }
        String str = waistBanner.promotionName;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            View view2 = this.contentView;
            if (view2 != null && (textView4 = (TextView) view2.findViewById(R.id.icp)) != null) {
                OUP.LJJLIIIJILLIZJL(textView4, waistBanner.activityName);
            }
            View view3 = this.contentView;
            if (view3 == null || (findViewById = view3.findViewById(R.id.pf)) == null) {
                return;
            }
            findViewById.setVisibility(8);
            return;
        }
        View view4 = this.contentView;
        if (view4 != null && (textView3 = (TextView) view4.findViewById(R.id.icp)) != null) {
            OUP.LJJLIIIJILLIZJL(textView3, waistBanner.promotionName);
        }
        if (C78685UuP.LJJJZ(waistBanner.activityName)) {
            View view5 = this.contentView;
            if (view5 == null || (textView2 = (TextView) view5.findViewById(R.id.pf)) == null) {
                return;
            }
            OUP.LJJLIIIJILLIZJL(textView2, waistBanner.activityName);
            return;
        }
        if (((C69689RWr) getItem()).LJIIIIZZ == null || (view = this.contentView) == null || (textView = (TextView) view.findViewById(R.id.d11)) == null) {
            return;
        }
        PickTag pickTag = ((C69689RWr) getItem()).LJIIIIZZ;
        if (pickTag != null) {
            str2 = pickTag.name;
        }
        OUP.LJJLIIIJILLIZJL(textView, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showFlashSaleOngoing(FlashSale flashSale) {
        String str;
        EnumC72807Shn enumC72807Shn;
        Image image;
        Integer num;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        showPrice();
        TextView textView = (TextView) view.findViewById(R.id.dig);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (isShowFlashIcon(flashSale)) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_bolt_fill;
            c2068389v.LIZIZ = C7MY.LIZIZ(14);
            c2068389v.LIZJ = C7MY.LIZIZ(14);
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            C8FR LIZIZ = c2068389v.LIZIZ(2, context);
            Context context2 = this.context;
            o.LJIIIIZZ(context2, "context");
            C8FR.LIZJ(LIZIZ, C26338AVi.LIZJ(context2), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 2);
            C27570Aru.LIZ(spannableStringBuilder, " ", LIZIZ);
        }
        FlashSale flashSale2 = ((C69689RWr) getItem()).LIZIZ;
        if (flashSale2 == null || (str = flashSale2.title) == null) {
            str = "";
        }
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        if (isNewAtmosphereStyle(flashSale)) {
            ((TuxTextView) view.findViewById(R.id.dig)).setTextColorRes(R.attr.dj);
        }
        FlashSale flashSale3 = ((C69689RWr) getItem()).LIZIZ;
        if (flashSale3 == null || (num = flashSale3.flashSaleStyle) == null || num.intValue() != 2) {
            enumC72807Shn = EnumC72807Shn.CENTER_CROP;
        } else {
            enumC72807Shn = EnumC72807Shn.FIT_XY;
        }
        FlashSale flashSale4 = ((C69689RWr) getItem()).LIZIZ;
        if (flashSale4 != null && (image = flashSale4.image) != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIJJ = enumC72807Shn;
            LIZLLL.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.ngl);
            L9G.LIZ(LIZLLL);
        }
        C70759Rpr.LIZLLL(flashSale.countdownBg).LJIIIZ(new IDdS503S0100000_12(view, 0));
        adjustMallFlashSellStyle((C69689RWr) getItem());
        C70646Ro2 c70646Ro2 = getViewModel().LLFZ;
        if (c70646Ro2 != null) {
            updateCountDown(c70646Ro2.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showFlashSaleOngoingUK(FlashSale flashSale) {
        String str;
        EnumC72807Shn enumC72807Shn;
        Image image;
        Integer num;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        showPriceOrDeductionText();
        TextView textView = (TextView) view.findViewById(R.id.dig);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (isShowFlashIcon(flashSale)) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_bolt_fill;
            c2068389v.LIZIZ = C7MY.LIZIZ(14);
            c2068389v.LIZJ = C7MY.LIZIZ(14);
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            C8FR LIZIZ = c2068389v.LIZIZ(2, context);
            Context context2 = this.context;
            o.LJIIIIZZ(context2, "context");
            C8FR.LIZJ(LIZIZ, C26338AVi.LIZJ(context2), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 2);
            C27570Aru.LIZ(spannableStringBuilder, " ", LIZIZ);
        }
        FlashSale flashSale2 = ((C69689RWr) getItem()).LIZIZ;
        if (flashSale2 == null || (str = flashSale2.title) == null) {
            str = "";
        }
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        FlashSale flashSale3 = ((C69689RWr) getItem()).LIZIZ;
        if (flashSale3 == null || (num = flashSale3.flashSaleStyle) == null || num.intValue() != 2) {
            enumC72807Shn = EnumC72807Shn.CENTER_CROP;
        } else {
            enumC72807Shn = EnumC72807Shn.FIT_XY;
        }
        FlashSale flashSale4 = ((C69689RWr) getItem()).LIZIZ;
        if (flashSale4 != null && (image = flashSale4.image) != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIJJ = enumC72807Shn;
            LIZLLL.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.ngl);
            L9G.LIZ(LIZLLL);
        }
        C70759Rpr.LIZLLL(flashSale.countdownBg).LJIIIZ(new IDdS503S0100000_12(view, 1));
        adjustMallFlashSellStyle((C69689RWr) getItem());
        C70646Ro2 c70646Ro2 = getViewModel().LLFZ;
        if (c70646Ro2 != null) {
            updateCountDown(c70646Ro2.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showFlashSaleOngoingUS(FlashSale flashSale) {
        String str;
        Image image;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        FlashSale flashSale2 = ((C69689RWr) getItem()).LIZIZ;
        if (flashSale2 != null && (image = flashSale2.image) != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.ngl);
            L9G.LIZ(LIZLLL);
        }
        TextView textView = (TextView) view.findViewById(R.id.diu);
        FlashSale flashSale3 = ((C69689RWr) getItem()).LIZIZ;
        if (flashSale3 != null) {
            str = flashSale3.title;
        } else {
            str = null;
        }
        textView.setText(str);
        C70759Rpr.LIZLLL(flashSale.countdownBg).LJIIIZ(new IDdS503S0100000_12(view, 2));
        adjustMallFlashSellStyleUS((C69689RWr) getItem());
        C70646Ro2 c70646Ro2 = getViewModel().LLFZ;
        if (c70646Ro2 != null) {
            updateCountDown(c70646Ro2.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showReminderMall(C69689RWr c69689RWr) {
        RV8 rv8;
        boolean z;
        Integer num;
        SY4 sy4;
        View view = this.contentView;
        if (view != null && (rv8 = c69689RWr.LJII) != null) {
            Image image = rv8.LJFF;
            if (image != null) {
                W5F LIZLLL = C70759Rpr.LIZLLL(image);
                LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
                LIZLLL.LJJIIJZLJL = (ImageView) view.findViewById(R.id.dil);
                L9G.LIZ(LIZLLL);
            }
            Image image2 = rv8.LJII;
            if (image2 != null) {
                W5F LIZLLL2 = C70759Rpr.LIZLLL(image2);
                LIZLLL2.LJIJJ = EnumC72807Shn.FIT_START;
                LIZLLL2.LJJIIJZLJL = (ImageView) view.findViewById(R.id.di9);
                L9G.LIZ(LIZLLL2);
            } else {
                ImageView imageView = (ImageView) view.findViewById(R.id.di9);
                o.LJIIIIZZ(imageView, "contentView.flash_sale_icon");
                imageView.setVisibility(8);
            }
            String str = rv8.LJI;
            boolean z2 = true;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TextView textView = (TextView) view.findViewById(R.id.ivd);
                if (textView != null) {
                    textView.setText("--");
                }
            } else {
                C116724i4 c116724i4 = new C116724i4();
                c116724i4.LIZLLL(rv8.LJI);
                C116714i3 c116714i3 = c116724i4.LIZ;
                TextView textView2 = (TextView) view.findViewById(R.id.ivd);
                if (textView2 != null) {
                    textView2.setText("- " + ((Object) c116714i3));
                }
            }
            if (rv8.LIZIZ != null) {
                ((C26771Af1) view.findViewById(R.id.dis)).setStartTime(rv8.LIZIZ);
            }
            FlashSaleReminderButton flashSaleReminderButton = rv8.LJ;
            if (flashSaleReminderButton != null) {
                num = flashSaleReminderButton.status;
            } else {
                num = null;
            }
            if (num != null && (sy4 = (SY4) view.findViewById(R.id.din)) != null) {
                Integer num2 = rv8.LJ.status;
                if (num2 != null && num2.intValue() == 2) {
                    z2 = false;
                }
                sy4.setEnabled(z2);
            }
            HashMap<String, Object> LIZJ = C03660Ck.LIZJ("previous_page", "flash_sale");
            LIZJ.put("is_sold_out", ((C69689RWr) getItem()).LJIIJJI);
            trySendReminderShowLog(LIZJ);
            View findViewById = view.findViewById(R.id.din);
            if (findViewById != null) {
                C16880lQ.LJIIJ(new Au2S19S0200000_12(this, LIZJ, 13, 42), findViewById);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showReminderMallNewStyle(C69689RWr c69689RWr) {
        String str;
        boolean z;
        C116714i3 c116714i3;
        String str2;
        boolean z2;
        String str3;
        FlashSaleReminderButton flashSaleReminderButton;
        Integer num;
        String str4;
        Image image;
        View view = this.contentView;
        if (view == null) {
            return;
        }
        RV8 rv8 = c69689RWr.LJII;
        if (rv8 != null && (image = rv8.LJFF) != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJJIIJZLJL = (ImageView) view.findViewById(R.id.dim);
            L9G.LIZ(LIZLLL);
        }
        RV8 rv82 = c69689RWr.LJII;
        String str5 = null;
        if (rv82 != null) {
            str = rv82.LJI;
        } else {
            str = null;
        }
        boolean z3 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View findViewById = view.findViewById(R.id.ive);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        } else {
            RV8 rv83 = c69689RWr.LJII;
            if (rv83 != null && (str2 = rv83.LJI) != null) {
                C116724i4 c116724i4 = new C116724i4();
                c116724i4.LIZLLL(str2);
                c116714i3 = c116724i4.LIZ;
            } else {
                c116714i3 = null;
            }
            TextView textView = (TextView) view.findViewById(R.id.ive);
            if (textView != null) {
                textView.setText(String.valueOf(c116714i3));
            }
        }
        FlashSale flashSale = c69689RWr.LIZIZ;
        if (flashSale == null || (str4 = flashSale.title) == null || str4.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            View findViewById2 = view.findViewById(R.id.div);
            o.LJIIIIZZ(findViewById2, "contentView.flash_sale_title_new");
            findViewById2.setVisibility(8);
        } else {
            TextView textView2 = (TextView) view.findViewById(R.id.div);
            FlashSale flashSale2 = c69689RWr.LIZIZ;
            if (flashSale2 != null) {
                str3 = flashSale2.title;
            } else {
                str3 = null;
            }
            textView2.setText(str3);
        }
        C26775Af5 c26775Af5 = (C26775Af5) view.findViewById(R.id.dif);
        if (c26775Af5 != null) {
            c26775Af5.setTextColorRes(R.attr.dj);
            FlashSale flashSale3 = c69689RWr.LIZIZ;
            if (flashSale3 != null) {
                str5 = flashSale3.startTime;
            }
            c26775Af5.setStartTime(str5);
            C70646Ro2 c70646Ro2 = getViewModel().LLFZ;
            if (c70646Ro2 != null) {
                c26775Af5.LJJJJL(c70646Ro2.LIZIZ, (TuxTextView) view.findViewById(R.id.die));
            }
        }
        RV8 rv84 = c69689RWr.LJII;
        if (rv84 != null && (flashSaleReminderButton = rv84.LJ) != null && (num = flashSaleReminderButton.status) != null) {
            int intValue = num.intValue();
            SY4 sy4 = (SY4) view.findViewById(R.id.dio);
            if (sy4 != null) {
                if (intValue == 2) {
                    z3 = false;
                }
                sy4.setEnabled(z3);
            }
        }
        resetButtonBackgroundColor((C2WL) view.findViewById(R.id.dio));
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("previous_page", "flash_sale");
        hashMap.put("is_sold_out", ((C69689RWr) getItem()).LJIIJJI);
        trySendReminderShowLog(hashMap);
        View findViewById3 = view.findViewById(R.id.dio);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new Au2S19S0200000_12(this, hashMap, 14, 42), findViewById3);
        }
    }

    private final void trySendReminderShowLog(HashMap<String, Object> hashMap) {
        if (!getViewModel().LLJ) {
            getViewModel().LLJ = true;
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIJL(hashMap);
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C69689RWr item) {
        int i;
        String str;
        o.LJIIIZ(item, "item");
        try {
            bindWaist(item);
        } catch (NullPointerException e) {
            View view = this.contentView;
            if (view != null) {
                i = view.getId();
            } else {
                i = 0;
            }
            StringBuilder LIZIZ = C25620zW.LIZIZ("WaistInfoViewHolder: NullPointerException in ", this.itemView.getContext().getResources().getResourceEntryName(i), ", contentView is ");
            View view2 = this.contentView;
            if (view2 != null) {
                str = C16880lQ.LJLLJ(view2.getClass());
            } else {
                str = null;
            }
            LIZIZ.append(str);
            C78983UzD.LJIJ(e, X1D.LIZIZ(LIZIZ));
        }
    }

    public final void resetButtonBackgroundColor(C2WL c2wl) {
        Integer valueOf;
        if (c2wl != null) {
            c2wl.setNeedCustomColor(true);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(2);
            if (c2wl.isEnabled()) {
                valueOf = Integer.valueOf(R.attr.dj);
            } else {
                valueOf = Integer.valueOf(R.attr.dm);
            }
            c110614Vt.LIZIZ = valueOf;
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            c2wl.setBackground(c110614Vt.LIZ(context));
        }
    }

    public final void updateCountDown(long j) {
        C26775Af5 c26775Af5;
        View view = this.contentView;
        if (view != null && (c26775Af5 = (C26775Af5) view.findViewById(R.id.dia)) != null) {
            c26775Af5.LJJJJJ(j, (TuxTextView) view.findViewById(R.id.did));
        }
    }

    public final void openPanelWithSchema(String str, String str2) {
        Object obj;
        String str3;
        HashMap<String, Object> hashMap;
        HashMap<String, Object> trackParams;
        String str4 = str;
        Context context = this.context;
        if (context instanceof ActivityC45651qj) {
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            if (str4 == null) {
                str4 = "";
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = getViewModel().LJLJJLL;
            String str5 = null;
            if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                obj = trackParams.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam2 = getViewModel().LJLJJLL;
            if (pdpEnterParam2 != null) {
                hashMap = pdpEnterParam2.getTrackParams();
            } else {
                hashMap = null;
            }
            C70101RfF c70101RfF = IPdpStarter.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam3 = getViewModel().LJLJJLL;
            c70101RfF.getClass();
            String valueOf = String.valueOf(C70101RfF.LIZIZ(pdpEnterParam3));
            Boolean valueOf2 = Boolean.valueOf(getViewModel().LJLJL);
            IPdpStarter.PdpEnterParam pdpEnterParam4 = getViewModel().LJLJJLL;
            if (pdpEnterParam4 != null) {
                str5 = pdpEnterParam4.getSourceInfo();
            }
            c70376Rjg.LIZ(context, str4, str3, hashMap, null, str2, valueOf, valueOf2, str5, getViewModel().lw0(), null);
        }
    }
}
