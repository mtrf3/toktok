package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc;

import X.AnonymousClass636;
import X.C221108m2;
import X.C26338AVi;
import X.C27172AlU;
import X.C27173AlV;
import X.C27174AlW;
import X.C27175AlX;
import X.C27177AlZ;
import X.C27186Ali;
import X.C27599AsN;
import X.C32151Nz;
import X.C44878HjO;
import X.C45804HyK;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70445Rkn;
import X.C70920RsS;
import X.C72545SdZ;
import X.C73340SqO;
import X.C78565UsT;
import X.C78857UxB;
import X.C78946Uyc;
import X.C78983UzD;
import X.C7MY;
import X.InterfaceC27598AsM;
import X.InterfaceC27624Asm;
import X.InterfaceC88472Yns;
import X.O6R;
import X.X1D;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class ProductDescTextViewHolder extends AbsBrickFullSpanVH {
    public final InterfaceC88472Yns<Integer, Object> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        super.onResume();
        if (o.LJ(((C27172AlU) getItem()).LJLILLLLZI, "title")) {
            trackTag(new C70445Rkn(getItem()));
        } else {
            trackTag(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void onBind(C27172AlU item) {
        int subTitlePaddingTop;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        Integer num;
        int i;
        int LIZIZ;
        int LIZIZ2;
        int LIZIZ3;
        int LIZIZ4;
        o.LJIIIZ(item, "item");
        super.onBind(item);
        IProductDescStyle I50 = ((InterfaceC27598AsM) C73340SqO.LJIILJJIL((PdpViewModel) this.LJLJI.getValue(), InterfaceC27598AsM.class)).I50();
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.text);
        String str2 = item.LJLILLLLZI;
        int hashCode = str2.hashCode();
        if (hashCode != -42298471) {
            if (hashCode != 3549) {
                if (hashCode != 3735) {
                    if (hashCode != 3556653) {
                        if (hashCode == 110371416 && str2.equals("title")) {
                            tuxTextView.setTuxFont(I50.getTitleFont());
                            Object invoke = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() + 1));
                            if ((invoke instanceof C27172AlU) && o.LJ(((C27172AlU) invoke).LJLILLLLZI, "text")) {
                                View view = this.itemView;
                                view.setPadding(view.getPaddingLeft(), (int) I50.getTitlePaddingTop(), this.itemView.getPaddingRight(), (int) I50.getTitleWithTextPaddingBottom());
                            } else {
                                View view2 = this.itemView;
                                view2.setPadding(view2.getPaddingLeft(), (int) I50.getTitlePaddingTop(), this.itemView.getPaddingRight(), (int) I50.getTitlePaddingBottom());
                            }
                            View view3 = this.itemView;
                            C78946Uyc.LJJIIJZLJL(view3, C62850Ola.LJI(view3, "itemView"), new AqS154S0100000_4(item, 229), new AqS170S0100000_4(item, 300));
                            this.itemView.findViewById(R.id.cf5).setVisibility(8);
                            tuxTextView.setTextColorRes(I50.getTitleColorId());
                        }
                    } else if (str2.equals("text")) {
                        tuxTextView.setTuxFont(I50.getTextFont());
                        Context context = tuxTextView.getContext();
                        o.LJIIIIZZ(context, "context");
                        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(I50.getTextColorId(), context));
                        Object invoke2 = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() + 1));
                        Object invoke3 = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() - 1));
                        int textDefaultPadding = (int) I50.getTextDefaultPadding();
                        int textDefaultPadding2 = (int) I50.getTextDefaultPadding();
                        if (invoke2 instanceof C27172AlU) {
                            C27172AlU c27172AlU = (C27172AlU) invoke2;
                            if (o.LJ(c27172AlU.LJLILLLLZI, "text") || o.LJ(c27172AlU.LJLILLLLZI, "title")) {
                                textDefaultPadding2 = 0;
                            }
                        }
                        if (invoke3 instanceof C27172AlU) {
                            C27172AlU c27172AlU2 = (C27172AlU) invoke3;
                            if (o.LJ(c27172AlU2.LJLILLLLZI, "text") || o.LJ(c27172AlU2.LJLILLLLZI, "sub_title")) {
                                textDefaultPadding = 0;
                            }
                        }
                        if ((invoke3 instanceof C27177AlZ) || (invoke3 instanceof C27599AsN)) {
                            textDefaultPadding = C7MY.LIZIZ(16);
                        }
                        if ((invoke2 instanceof C27177AlZ) || (invoke2 instanceof C27599AsN) || invoke2 == null) {
                            textDefaultPadding2 = C7MY.LIZIZ(16);
                        }
                        View view4 = this.itemView;
                        view4.setPadding(view4.getPaddingLeft(), textDefaultPadding, this.itemView.getPaddingRight(), textDefaultPadding2);
                        View findViewById = this.itemView.findViewById(R.id.cf5);
                        o.LJIIIIZZ(findViewById, "itemView.dot");
                        findViewById.setVisibility(8);
                    }
                } else if (str2.equals("ul")) {
                    tuxTextView.setTuxFont(I50.getTextFont());
                    Context context2 = tuxTextView.getContext();
                    o.LJIIIIZZ(context2, "context");
                    tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(I50.getTextColorId(), context2));
                    this.itemView.findViewById(R.id.cf5).setVisibility(0);
                    this.itemView.findViewById(R.id.msm).setVisibility(0);
                    this.itemView.findViewById(R.id.h_y).setVisibility(8);
                    Object invoke4 = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() - 1));
                    Object invoke5 = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() + 1));
                    if ((invoke4 instanceof C27177AlZ) || (invoke4 instanceof C27599AsN)) {
                        LIZIZ3 = C7MY.LIZIZ(16);
                    } else {
                        LIZIZ3 = 0;
                    }
                    if ((invoke5 instanceof C27177AlZ) || (invoke5 instanceof C27599AsN) || invoke5 == null) {
                        LIZIZ4 = C7MY.LIZIZ(16);
                    } else {
                        LIZIZ4 = 0;
                    }
                    View view5 = this.itemView;
                    view5.setPadding(view5.getPaddingLeft(), LIZIZ3, this.itemView.getPaddingRight(), LIZIZ4);
                }
            } else if (str2.equals("ol")) {
                tuxTextView.setTuxFont(I50.getTextFont());
                Context context3 = tuxTextView.getContext();
                o.LJIIIIZZ(context3, "context");
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(I50.getTextColorId(), context3));
                this.itemView.findViewById(R.id.cf5).setVisibility(0);
                this.itemView.findViewById(R.id.msm).setVisibility(8);
                this.itemView.findViewById(R.id.h_y).setVisibility(0);
                StringBuilder LIZ = X1D.LIZ();
                ((TextView) this.itemView.findViewById(R.id.h_y)).setText(b0.LIZJ(LIZ, item.LJLJJI, '.', LIZ));
                Object invoke6 = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() - 1));
                Object invoke7 = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() + 1));
                if ((invoke6 instanceof C27177AlZ) || (invoke6 instanceof C27599AsN)) {
                    LIZIZ = C7MY.LIZIZ(16);
                } else {
                    LIZIZ = 0;
                }
                if ((invoke7 instanceof C27177AlZ) || (invoke7 instanceof C27599AsN) || invoke7 == null) {
                    LIZIZ2 = C7MY.LIZIZ(16);
                } else {
                    LIZIZ2 = 0;
                }
                View view6 = this.itemView;
                view6.setPadding(view6.getPaddingLeft(), LIZIZ, this.itemView.getPaddingRight(), LIZIZ2);
            }
        } else if (str2.equals("sub_title")) {
            tuxTextView.setTuxFont(I50.getSubTitleFont());
            tuxTextView.setTextColorRes(I50.getSubTitleColorId());
            this.itemView.findViewById(R.id.cf5).setVisibility(8);
            int subTitlePaddingBottom = (int) I50.getSubTitlePaddingBottom();
            Object invoke8 = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() - 1));
            if (((invoke8 instanceof C27172AlU) && o.LJ(((C27172AlU) invoke8).LJLILLLLZI, "title")) || (invoke8 instanceof C27186Ali)) {
                subTitlePaddingTop = 0;
            } else {
                if (invoke8 instanceof C27177AlZ) {
                    invoke8.getClass();
                    if (o.LJ("image", "image")) {
                        subTitlePaddingTop = C7MY.LIZIZ(32);
                    }
                }
                subTitlePaddingTop = (int) I50.getSubTitlePaddingTop();
            }
            View view7 = this.itemView;
            view7.setPadding(view7.getPaddingLeft(), subTitlePaddingTop, this.itemView.getPaddingRight(), subTitlePaddingBottom);
        }
        if (item.LJLJL != null) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.text);
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            LogisticLinkRichText logisticLinkRichText = item.LJLJL;
            final Context context4 = this.itemView.getContext();
            richTextUtil.getClass();
            o.LJIIIZ(logisticLinkRichText, "<this>");
            String str3 = logisticLinkRichText.template;
            if (str3 == null || str3.length() == 0) {
                spannableStringBuilder = null;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(logisticLinkRichText.template);
                Map<String, LogisticLinkText> map = logisticLinkRichText.arguments;
                if (map != null) {
                    if (context4 != null && AnonymousClass636.LJIILJJIL(context4) && C78857UxB.LJJJIL(logisticLinkRichText.textDarkColor)) {
                        str = logisticLinkRichText.textDarkColor;
                    } else {
                        str = logisticLinkRichText.textColor;
                    }
                    if (str != null) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(ColorProtector.parseColor(str)), 0, spannableStringBuilder.length(), 17);
                    }
                    for (String str4 : map.keySet()) {
                        final LogisticLinkText logisticLinkText = map.get(str4);
                        if (logisticLinkText != null) {
                            String str5 = logisticLinkText.text;
                            if (str5 == null) {
                                str5 = "";
                            }
                            int i2 = 0;
                            while (true) {
                                int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, str4, i2, false, 4);
                                if (LJJLIIIJL <= -1) {
                                    break;
                                }
                                i2 = str4.length() + LJJLIIIJL;
                                RichTextUtil.LIZ.getClass();
                                if (i2 <= spannableStringBuilder.length()) {
                                    spannableStringBuilder.replace(LJJLIIIJL, i2, (CharSequence) str5);
                                    i2 = str5.length() + LJJLIIIJL;
                                    Boolean bool = logisticLinkText.isBold;
                                    Boolean bool2 = Boolean.TRUE;
                                    if (o.LJ(bool, bool2) && o.LJ(logisticLinkText.isItalic, bool2)) {
                                        num = 3;
                                    } else if (o.LJ(logisticLinkText.isBold, bool2)) {
                                        num = 1;
                                    } else {
                                        if (o.LJ(logisticLinkText.isItalic, bool2)) {
                                            num = 2;
                                        }
                                        i = 17;
                                        spannableStringBuilder.setSpan(new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil$replaceSpan$1
                                            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                                            public final void updateDrawState(TextPaint ds) {
                                                String str6;
                                                o.LJIIIZ(ds, "ds");
                                                if (o.LJ(LogisticLinkText.this.hasUnderscore, Boolean.TRUE)) {
                                                    ds.setUnderlineText(true);
                                                }
                                                Context context5 = context4;
                                                if (context5 != null && AnonymousClass636.LJIILJJIL(context5) && C78857UxB.LJJJIL(LogisticLinkText.this.darkColor)) {
                                                    str6 = LogisticLinkText.this.darkColor;
                                                } else {
                                                    str6 = LogisticLinkText.this.color;
                                                }
                                                if (LogisticLinkText.this.color != null) {
                                                    ds.setColor(ColorProtector.parseColor(str6));
                                                }
                                            }
                                        }, LJJLIIIJL, i2, i);
                                    }
                                    if (num != null) {
                                        i = 17;
                                        spannableStringBuilder.setSpan(new StyleSpan(num.intValue()), LJJLIIIJL, i2, 17);
                                        spannableStringBuilder.setSpan(new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil$replaceSpan$1
                                            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                                            public final void updateDrawState(TextPaint ds) {
                                                String str6;
                                                o.LJIIIZ(ds, "ds");
                                                if (o.LJ(LogisticLinkText.this.hasUnderscore, Boolean.TRUE)) {
                                                    ds.setUnderlineText(true);
                                                }
                                                Context context5 = context4;
                                                if (context5 != null && AnonymousClass636.LJIILJJIL(context5) && C78857UxB.LJJJIL(LogisticLinkText.this.darkColor)) {
                                                    str6 = LogisticLinkText.this.darkColor;
                                                } else {
                                                    str6 = LogisticLinkText.this.color;
                                                }
                                                if (LogisticLinkText.this.color != null) {
                                                    ds.setColor(ColorProtector.parseColor(str6));
                                                }
                                            }
                                        }, LJJLIIIJL, i2, i);
                                    }
                                    i = 17;
                                    spannableStringBuilder.setSpan(new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil$replaceSpan$1
                                        @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                                        public final void updateDrawState(TextPaint ds) {
                                            String str6;
                                            o.LJIIIZ(ds, "ds");
                                            if (o.LJ(LogisticLinkText.this.hasUnderscore, Boolean.TRUE)) {
                                                ds.setUnderlineText(true);
                                            }
                                            Context context5 = context4;
                                            if (context5 != null && AnonymousClass636.LJIILJJIL(context5) && C78857UxB.LJJJIL(LogisticLinkText.this.darkColor)) {
                                                str6 = LogisticLinkText.this.darkColor;
                                            } else {
                                                str6 = LogisticLinkText.this.color;
                                            }
                                            if (LogisticLinkText.this.color != null) {
                                                ds.setColor(ColorProtector.parseColor(str6));
                                            }
                                        }
                                    }, LJJLIIIJL, i2, i);
                                }
                            }
                            if (i2 == 0) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("ecommerce RichText arguments key not in template, key ");
                                LIZ2.append(str4);
                                C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
                            }
                        }
                    }
                }
            }
            textView.setText(spannableStringBuilder);
        } else {
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.text);
            CharSequence charSequence = item.LJLIL;
            if (charSequence == null) {
                Integer num2 = item.LJLJI;
                if (num2 != null) {
                    charSequence = tuxTextView.getContext().getString(num2.intValue());
                } else {
                    charSequence = null;
                }
            }
            textView2.setText(charSequence);
        }
        Object invoke9 = this.LJLILLLLZI.invoke(Integer.valueOf(getAbsoluteAdapterPosition() + 1));
        if (invoke9 == null || !(invoke9 instanceof InterfaceC27624Asm)) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJIIIZ(itemView, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))), 23);
        }
        if (item.LJLJJL) {
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.nav));
            ((TextView) this.itemView.findViewById(R.id.nay)).setText(this.itemView.getContext().getString(I50.getViewMoreText()));
            ((TuxTextView) this.itemView.findViewById(R.id.nay)).setTextColorRes(I50.getViewMoreTextColorRes());
            ((TuxIconView) this.itemView.findViewById(R.id.nax)).setTintColorRes(I50.getViewMoreIconColorRes());
            if (!this.LJLJJI) {
                this.LJLJJI = true;
                View findViewById2 = this.itemView.findViewById(R.id.nav);
                o.LJIIIIZZ(findViewById2, "itemView.view_more");
                C78946Uyc.LJJIIJZLJL(findViewById2, new C70920RsS(), C27174AlW.LJLIL, C27173AlV.LJLIL);
            }
            View findViewById3 = this.itemView.findViewById(R.id.nav);
            o.LJIIIIZZ(findViewById3, "itemView.view_more");
            C78565UsT.LJJIZ(findViewById3, null, new C27175AlX(this, null), 3);
            return;
        }
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.nav));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductDescTextViewHolder(ViewGroup viewGroup, InterfaceC88472Yns<? super Integer, ? extends Object> interfaceC88472Yns) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a36, viewGroup, false));
        this.LJLJJL = C44878HjO.LIZIZ(viewGroup, "parent");
        this.LJLILLLLZI = interfaceC88472Yns;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 51));
    }
}
