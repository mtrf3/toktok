package com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C1AU;
import X.C1DG;
import X.C221108m2;
import X.C26338AVi;
import X.C26508Aam;
import X.C27050AjW;
import X.C27949Ay1;
import X.C28003Ayt;
import X.C29S;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.C73156SnQ;
import X.C78857UxB;
import X.C7MY;
import X.C88913eJ;
import X.KL2;
import X.OUP;
import X.S3I;
import X.S3L;
import X.TAT;
import X.TBT;
import X.TBV;
import X.W5F;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S6S0000000_4;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentInfoVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final S3L LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public KeyBoardVisibilityUtil LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, false);
        View view = this.LJLIL;
        Context context = view.getContext();
        if (context != null && (context instanceof C29S)) {
            this.LJLLI = new KeyBoardVisibilityUtil((C1AU) context, 32, new AqS186S0100000_4(view, 37));
        }
        C73156SnQ.LJIIIIZZ(this, L(), new TBV() { // from class: X.Az4
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getUserPaymentInfo();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((OrderSubmitState) obj).setUserPaymentInfo((PaymentInfo) obj2);
            }
        }, new AqS167S0200000_4(view, this, 1));
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.AzE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getCheckPayment());
            }
        }, new AqS167S0200000_4(view, this, 2));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LJLLI;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LJLLI = null;
    }

    public PaymentInfoVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 26));
        this.LJLJJL = (int) KL2.LIZJ(view.getContext(), 25.6f);
        this.LJLJJLL = (int) KL2.LIZJ(view.getContext(), 16.0f);
        this.LJLJL = (int) KL2.LIZJ(view.getContext(), 4.0f);
        S3I s3i = new S3I();
        s3i.LIZLLL = KL2.LIZJ(view.getContext(), 2.0f);
        this.LJLJLJ = new S3L(s3i);
        this.LJLJLLL = (int) KL2.LIZJ(view.getContext(), 26.0f);
        this.LJLL = (int) KL2.LIZJ(view.getContext(), 14.0f);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String string;
        boolean z;
        String str;
        int i;
        boolean z2;
        String str2;
        String str3;
        String str4;
        String str5;
        Availability availability;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Availability availability2;
        C28003Ayt item = (C28003Ayt) obj;
        o.LJIIIZ(item, "item");
        if (!item.LJFF) {
            OUP.LJIJJLI(this.LJLIL);
            return;
        }
        OUP.LJJLIIIJ(this.LJLIL);
        if (!this.LJLJI) {
            this.LJLJI = true;
            C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
            HashMap<String, Object> fw0 = L().fw0(false);
            PaymentMethod paymentMethod = item.LIZ;
            if (paymentMethod != null) {
                str9 = paymentMethod.LJIIL();
            } else {
                str9 = null;
            }
            PaymentMethod paymentMethod2 = item.LIZ;
            if (paymentMethod2 != null) {
                str10 = paymentMethod2.extraInfo;
            } else {
                str10 = null;
            }
            Boolean valueOf = Boolean.valueOf(C78857UxB.LJJJIL(str10));
            PaymentMethod paymentMethod3 = item.LIZ;
            if (paymentMethod3 != null) {
                str11 = paymentMethod3.balance;
            } else {
                str11 = null;
            }
            Boolean valueOf2 = Boolean.valueOf(C78857UxB.LJJJIL(str11));
            PaymentMethod paymentMethod4 = item.LIZ;
            if (paymentMethod4 != null && (availability2 = paymentMethod4.availability) != null) {
                str12 = availability2.unavailableCode;
            } else {
                str12 = null;
            }
            C27949Ay1.LJJIFFI(c27949Ay1, "payment_method", fw0, null, str9, valueOf, valueOf2, str12, 1084);
        }
        final View view = this.LJLIL;
        String LIZ = C88913eJ.LIZ(view, R.string.feq, "context.getString(R.stri…op_order_sum_payment_all)");
        C27050AjW c27050AjW = (C27050AjW) view.findViewById(R.id.hj_);
        if (c27050AjW != null) {
            String string2 = view.getContext().getString(R.string.fey);
            o.LJIIIIZZ(string2, "context.getString(R.stri…sum_payment_method_title)");
            c27050AjW.setTitleText(string2);
        }
        C27050AjW c27050AjW2 = (C27050AjW) view.findViewById(R.id.hj_);
        if (c27050AjW2 != null) {
            c27050AjW2.setTitleFont(42);
        }
        C27050AjW c27050AjW3 = (C27050AjW) view.findViewById(R.id.hj_);
        if (c27050AjW3 != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "context");
            c27050AjW3.setDescColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
        }
        View balance_layout = view.findViewById(R.id.ag5);
        o.LJIIIIZZ(balance_layout, "balance_layout");
        OUP.LJIJJLI(balance_layout);
        View unavailable_image = view.findViewById(R.id.mso);
        o.LJIIIIZZ(unavailable_image, "unavailable_image");
        OUP.LJIJJLI(unavailable_image);
        View payment_tip_layout = view.findViewById(R.id.hjk);
        o.LJIIIIZZ(payment_tip_layout, "payment_tip_layout");
        OUP.LJIJJLI(payment_tip_layout);
        if (item.LJ) {
            C27050AjW c27050AjW4 = (C27050AjW) view.findViewById(R.id.hj_);
            PaymentMethod paymentMethod5 = item.LIZ;
            if (paymentMethod5 != null && (str8 = paymentMethod5.displayName) != null) {
                LIZ = str8;
            }
            c27050AjW4.setDescText(LIZ);
            C27050AjW c27050AjW5 = (C27050AjW) view.findViewById(R.id.hj_);
            if (c27050AjW5 != null) {
                PaymentMethod paymentMethod6 = item.LIZ;
                if (paymentMethod6 != null) {
                    str7 = paymentMethod6.iconUrl;
                } else {
                    str7 = null;
                }
                c27050AjW5.setDescImage(str7);
            }
            C27050AjW c27050AjW6 = (C27050AjW) view.findViewById(R.id.hj_);
            if (c27050AjW6 != null) {
                c27050AjW6.setDescImageAlpha(1.0f);
            }
            C27050AjW c27050AjW7 = (C27050AjW) view.findViewById(R.id.hj_);
            if (c27050AjW7 != null) {
                c27050AjW7.LIZIZ(true);
            }
            View findViewById = view.findViewById(R.id.vu);
            if (findViewById != null) {
                OUP.LJIJJLI(findViewById);
            }
            PaymentMethod paymentMethod7 = item.LIZ;
            if (paymentMethod7 != null) {
                str5 = paymentMethod7.balance;
            } else {
                str5 = null;
            }
            if (!C78857UxB.LJJJIL(str5)) {
                str5 = null;
            }
            if (str5 != null) {
                View balance_layout2 = view.findViewById(R.id.ag5);
                o.LJIIIIZZ(balance_layout2, "balance_layout");
                OUP.LJJLIIIJ(balance_layout2);
                ((TextView) view.findViewById(R.id.ag6)).setText(str5);
                TextView textView = (TextView) view.findViewById(R.id.ag6);
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "context");
                textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context2));
            }
            PaymentMethod paymentMethod8 = item.LIZ;
            if (paymentMethod8 != null && (availability = paymentMethod8.availability) != null) {
                if (o.LJ(availability.isAvailable, Boolean.FALSE)) {
                    View balance_layout3 = view.findViewById(R.id.ag5);
                    o.LJIIIIZZ(balance_layout3, "balance_layout");
                    OUP.LJJLIIIJ(balance_layout3);
                    View unavailable_image2 = view.findViewById(R.id.mso);
                    o.LJIIIIZZ(unavailable_image2, "unavailable_image");
                    OUP.LJJLIIIJ(unavailable_image2);
                    TextView textView2 = (TextView) view.findViewById(R.id.ag6);
                    Context context3 = view.getContext();
                    o.LJIIIIZZ(context3, "context");
                    textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.e7, context3));
                    C27050AjW c27050AjW8 = (C27050AjW) view.findViewById(R.id.hj_);
                    if (c27050AjW8 != null) {
                        Context context4 = view.getContext();
                        o.LJIIIIZZ(context4, "context");
                        c27050AjW8.setDescColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context4));
                    }
                    C27050AjW c27050AjW9 = (C27050AjW) view.findViewById(R.id.hj_);
                    if (c27050AjW9 != null) {
                        c27050AjW9.setDescImageAlpha(0.3f);
                    }
                }
                if (o.LJ(availability.isAvailable, Boolean.TRUE) && (str6 = item.LIZ.orderPaymentTips) != null) {
                    View payment_tip_layout2 = view.findViewById(R.id.hjk);
                    o.LJIIIIZZ(payment_tip_layout2, "payment_tip_layout");
                    OUP.LJJLIIIJ(payment_tip_layout2);
                    ((TextView) view.findViewById(R.id.hjl)).setText(str6);
                    final String str13 = item.LIZ.prompt;
                    if (str13 != null) {
                        View payment_tip_icon = view.findViewById(R.id.hjj);
                        o.LJIIIIZZ(payment_tip_icon, "payment_tip_icon");
                        OUP.LJJLIIIJ(payment_tip_icon);
                        View payment_tip_icon2 = view.findViewById(R.id.hjj);
                        o.LJIIIIZZ(payment_tip_icon2, "payment_tip_icon");
                        C16880lQ.LJIIJ(new TAT() { // from class: X.5Yk
                            @Override // X.TAT
                            public final void LIZ(View view2) {
                                if (view2 != null) {
                                    Context context5 = view.getContext();
                                    o.LJIIIIZZ(context5, "context");
                                    C26227ARb LIZ2 = C3AW.LIZ(context5);
                                    LIZ2.LIZIZ(str13);
                                    UC0.LIZJ(LIZ2, C172176pJ.LJLIL);
                                    LIZ2.LJI().LIZLLL();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(700L);
                            }
                        }, payment_tip_icon2);
                    }
                }
            }
        } else {
            if (!this.LJLJJI) {
                this.LJLJJI = true;
                C27949Ay1 c27949Ay12 = C27949Ay1.LIZ;
                HashMap<String, Object> fw02 = L().fw0(false);
                PaymentMethod paymentMethod9 = item.LIZ;
                if (paymentMethod9 != null) {
                    str3 = paymentMethod9.LJIIL();
                } else {
                    str3 = null;
                }
                PaymentMethod paymentMethod10 = item.LIZ;
                if (paymentMethod10 != null) {
                    str4 = paymentMethod10.extraInfo;
                } else {
                    str4 = null;
                }
                C27949Ay1.LJJIFFI(c27949Ay12, "add_new_payment", fw02, null, str3, Boolean.valueOf(C78857UxB.LJJJIL(str4)), null, null, 1852);
            }
            View findViewById2 = view.findViewById(R.id.vu);
            if (findViewById2 != null) {
                OUP.LJJLIIIJ(findViewById2);
            }
            if (GooglePayProcess.LJ(item.LIZ) && !GooglePayProcess.LIZ()) {
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c5y);
                if (tuxTextView != null) {
                    C1DG.LJI(view, R.string.fey, tuxTextView);
                }
            } else {
                TextView textView3 = (TextView) view.findViewById(R.id.c5y);
                if (textView3 != null) {
                    PaymentMethod paymentMethod11 = item.LIZ;
                    if (paymentMethod11 == null || (string = paymentMethod11.displayName) == null) {
                        string = view.getContext().getString(R.string.fey);
                    }
                    textView3.setText(string);
                }
            }
            PaymentMethod paymentMethod12 = item.LIZ;
            if (paymentMethod12 == null || (str2 = paymentMethod12.extraInfo) == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.c5y).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.LJLJLLL;
                View payment_discount_hint = view.findViewById(R.id.hjc);
                o.LJIIIIZZ(payment_discount_hint, "payment_discount_hint");
                OUP.LJIJJLI(payment_discount_hint);
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.findViewById(R.id.c5y).getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = this.LJLL;
                View payment_discount_hint2 = view.findViewById(R.id.hjc);
                o.LJIIIIZZ(payment_discount_hint2, "payment_discount_hint");
                OUP.LJJLIIIJ(payment_discount_hint2);
                TextView textView4 = (TextView) view.findViewById(R.id.hjc);
                PaymentMethod paymentMethod13 = item.LIZ;
                if (paymentMethod13 != null) {
                    str = paymentMethod13.extraInfo;
                } else {
                    str = null;
                }
                textView4.setText(str);
            }
            List<PaymentMethod> list = item.LIZIZ;
            C27050AjW c27050AjW10 = (C27050AjW) view.findViewById(R.id.hj_);
            if (c27050AjW10 != null) {
                if (list == null || list.size() <= 1) {
                    LIZ = "";
                }
                c27050AjW10.setDescText(LIZ);
            }
            C27050AjW c27050AjW11 = (C27050AjW) view.findViewById(R.id.hj_);
            if (c27050AjW11 != null) {
                if (list != null && list.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c27050AjW11.LIZIZ(z2);
            }
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.hjg);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            if (list == null || list.size() == 1) {
                View findViewById3 = view.findViewById(R.id.hjf);
                if (findViewById3 != null) {
                    OUP.LJIJJLI(findViewById3);
                }
                View findViewById4 = view.findViewById(R.id.hjg);
                if (findViewById4 != null) {
                    OUP.LJIJJLI(findViewById4);
                }
            } else {
                View findViewById5 = view.findViewById(R.id.hjf);
                if (findViewById5 != null) {
                    if (item.LIZLLL != null) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    findViewById5.setVisibility(i);
                }
                TextView textView5 = (TextView) view.findViewById(R.id.hjf);
                if (textView5 != null) {
                    textView5.setText(item.LIZLLL);
                }
                View findViewById6 = view.findViewById(R.id.hjg);
                if (findViewById6 != null) {
                    OUP.LJJLIIIJ(findViewById6);
                }
                List<String> list2 = item.LIZJ;
                if (list2 != null) {
                    int size = list2.size();
                    if (6 <= size) {
                        size = 6;
                    }
                    List<String> subList = list2.subList(0, size);
                    if (subList != null) {
                        for (String str14 : subList) {
                            SmartImageView smartImageView = new SmartImageView(view.getContext());
                            smartImageView.setLayoutParams(new LinearLayout.LayoutParams(this.LJLJJL, this.LJLJJLL));
                            C26338AVi.LJI(smartImageView, null, null, Integer.valueOf(this.LJLJL), null, false, 27);
                            W5F LIZLLL = C70759Rpr.LIZLLL(str14);
                            LIZLLL.LJIILIIL = C7MY.LIZJ(view, "context", R.attr.cj);
                            LIZLLL.LJJIIJ = smartImageView;
                            C16880lQ.LLJJJ(LIZLLL);
                            smartImageView.setCircleOptions(this.LJLJLJ);
                            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.hjg);
                            if (viewGroup2 != null) {
                                viewGroup2.addView(smartImageView);
                            }
                        }
                    }
                }
            }
        }
        List<PaymentMethod> list3 = item.LIZIZ;
        if (list3 != null) {
            if (list3.size() == 1 && !item.LJ) {
                View findViewById7 = view.findViewById(R.id.hj_);
                if (findViewById7 != null) {
                    C16880lQ.LJIIJ(new Au2S6S0000000_4(3), findViewById7);
                }
            } else {
                View findViewById8 = view.findViewById(R.id.hj_);
                if (findViewById8 != null) {
                    C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 45), findViewById8);
                }
            }
        }
        View findViewById9 = view.findViewById(R.id.vt);
        if (findViewById9 == null) {
            return;
        }
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 46), findViewById9);
    }
}
