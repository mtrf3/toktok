package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.ASL;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C110614Vt;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C26706Ady;
import X.C26937Ahh;
import X.C26952Ahw;
import X.C26954Ahy;
import X.C26956Ai0;
import X.C26957Ai1;
import X.C26969AiD;
import X.C27162AlK;
import X.C2QY;
import X.C32151Nz;
import X.C44878HjO;
import X.C45804HyK;
import X.C47261Igj;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C7MY;
import X.C9KF;
import X.FKM;
import X.O6R;
import X.ORS;
import Y.ACListenerS30S0300000_4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.logistic.ILogisticStyle;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import n.b;
import wg5.c;

/* loaded from: classes5.dex */
public class ExtraLogisticsInfoViewHolder extends ECJediViewHolder implements c {
    public Map<Integer, View> _$_findViewCache;
    public LinkedList<C2QY> cachedDetailListView;
    public ViewGroup detailListView;
    public TuxSheet selectSheet;
    public final C5H3 style$delegate;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final ILogisticStyle getStyle() {
        return (ILogisticStyle) this.style$delegate.getValue();
    }

    public void bindStyle() {
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(getStyle().getDeliveryDetailListRadius());
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        c110614Vt.LJFF = Integer.valueOf(R.attr.dz);
        ViewGroup viewGroup = this.detailListView;
        if (viewGroup == null) {
            return;
        }
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        viewGroup.setBackground(c110614Vt.LIZ(context));
    }

    public void bindView() {
        this.detailListView = (ViewGroup) this.itemView.findViewById(R.id.c6r);
    }

    public final DeliveryPanelViewModel getViewModel() {
        return (DeliveryPanelViewModel) this.viewModel$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final ViewGroup getDetailListView() {
        return this.detailListView;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C26952Ahw item) {
        int i;
        String str;
        String priceStr;
        Resources resources;
        DisplayMetrics displayMetrics;
        Integer valueOf;
        o.LJIIIZ(item, "item");
        bindView();
        bindStyle();
        ViewGroup viewGroup = this.detailListView;
        if (viewGroup != null) {
            LinkedList<C2QY> linkedList = this.cachedDetailListView;
            while (viewGroup.getChildCount() > 0) {
                C16880lQ.LLIFFJFJJ(0, viewGroup);
                C76800UCe c76800UCe = C76800UCe.LIZ;
                if (c76800UCe instanceof C2QY) {
                    linkedList.add(c76800UCe);
                }
            }
        }
        int i2 = 0;
        for (LogisticDTO logisticDTO : item.LIZ) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                LogisticDTO logisticDTO2 = logisticDTO;
                C2QY c2qy = (C2QY) ORS.LJJLJLI(this.cachedDetailListView);
                if (c2qy == null) {
                    Context context = this.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    c2qy = new C2QY(context);
                }
                c2qy.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                ViewGroup.LayoutParams layoutParams = c2qy.LIZ(R.id.jwz).getLayoutParams();
                Context context2 = c2qy.getContext();
                o.LJIIIIZZ(context2, "context");
                Activity LJIJJ = C45804HyK.LJIJJ(context2);
                if (LJIJJ != null && (resources = LJIJJ.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && (valueOf = Integer.valueOf(displayMetrics.widthPixels)) != null) {
                    layoutParams.width = valueOf.intValue() / 5;
                }
                c2qy.LIZ(R.id.jwz).setLayoutParams(layoutParams);
                LogisticLinkRichText logisticLinkRichText = logisticDTO2.shippingThresholdText;
                if (logisticLinkRichText != null) {
                    TextView textView = (TextView) c2qy.LIZ(R.id.jwu);
                    RichTextUtil richTextUtil = RichTextUtil.LIZ;
                    View view = this.itemView;
                    C26956Ai0 c26956Ai0 = C26956Ai0.LJLIL;
                    richTextUtil.getClass();
                    textView.setText(RichTextUtil.LIZ(logisticLinkRichText, view, c26956Ai0));
                }
                String str2 = logisticDTO2.leadTime;
                if (str2 != null) {
                    ((TextView) c2qy.LIZ(R.id.jxi)).setText(str2);
                }
                Price price = logisticDTO2.shippingFee;
                if (price != null && (priceStr = price.getPriceStr()) != null) {
                    ((TextView) c2qy.LIZ(R.id.jwt)).setText(priceStr);
                }
                b.LIZIZ(R.attr.by, this.itemView.getContext());
                if (o.LJ(logisticDTO2.freeShipping, Boolean.TRUE)) {
                    ((TextView) c2qy.LIZ(R.id.jwt)).setTextColor(b.LIZIZ(R.attr.ha, this.itemView.getContext()));
                } else {
                    ((TextView) c2qy.LIZ(R.id.jwt)).setTextColor(b.LIZIZ(R.attr.go, this.itemView.getContext()));
                }
                String str3 = logisticDTO2.deliveryName;
                if (str3 != null) {
                    ((TextView) c2qy.LIZ(R.id.jwz)).setText(str3);
                }
                View findViewById = c2qy.findViewById(R.id.fob);
                o.LJIIIIZZ(findViewById, "logisticInfo.findViewByI….id.learn_more_container)");
                if (logisticDTO2.logisticsDescription != null) {
                    c2qy.LIZ(R.id.jwr).setVisibility(8);
                    LogisticLinkRichText logisticLinkRichText2 = logisticDTO2.orderCutOffNotice;
                    if (logisticLinkRichText2 != null) {
                        TextView textView2 = (TextView) c2qy.LIZ(R.id.jww);
                        RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                        View view2 = this.itemView;
                        C26957Ai1 c26957Ai1 = C26957Ai1.LJLIL;
                        richTextUtil2.getClass();
                        textView2.setText(RichTextUtil.LIZ(logisticLinkRichText2, view2, c26957Ai1));
                    }
                    View findViewById2 = c2qy.findViewById(R.id.jx2);
                    o.LJIIIIZZ(findViewById2, "logisticInfo.findViewById(R.id.shipping_module)");
                    findViewById2.setPadding(C7MY.LIZIZ(16), C7MY.LIZIZ(20), C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                    findViewById.setVisibility(0);
                    C16880lQ.LJIIJ(new ACListenerS30S0300000_4(logisticDTO2, this, c2qy, 3), findViewById);
                    Map<String, String> map = logisticDTO2.eventTrackInfo;
                    if (map != null) {
                        str = map.get("is_next_day_delivery");
                    } else {
                        str = null;
                    }
                    C26937Ahh.LJ("next_day_delivery_info", null, str, 2);
                    if (logisticDTO2.orderCutOffNotice == null) {
                        c2qy.LIZ(R.id.jwr).setVisibility(0);
                        String str4 = logisticDTO2.arrivalInfo;
                        if (str4 != null) {
                            ((TextView) c2qy.LIZ(R.id.jwr)).setText(str4);
                        }
                    } else {
                        c2qy.LIZ(R.id.jwr).setVisibility(8);
                    }
                } else {
                    c2qy.LIZ(R.id.jwr).setVisibility(0);
                    String str5 = logisticDTO2.arrivalInfo;
                    if (str5 != null) {
                        ((TextView) c2qy.LIZ(R.id.jwr)).setText(str5);
                    }
                    findViewById.setVisibility(8);
                }
                boolean z = true;
                if (i2 == item.LIZ.size() - 1) {
                    z = false;
                }
                ImageView bottom_divider = (ImageView) c2qy.LIZ(R.id.apk);
                o.LJIIIIZZ(bottom_divider, "bottom_divider");
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                bottom_divider.setVisibility(i);
                setStyle(c2qy, logisticDTO2);
                setThirdPartyLogistics(c2qy, logisticDTO2);
                ViewGroup viewGroup2 = this.detailListView;
                if (viewGroup2 != null) {
                    viewGroup2.addView(c2qy);
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void setDetailListView(ViewGroup viewGroup) {
        this.detailListView = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraLogisticsInfoViewHolder(ViewGroup viewGroup, int i) {
        super(C1FL.LIZIZ(viewGroup, i, viewGroup, false, "from(parent.context)\n   …te(layout, parent, false)"));
        this._$_findViewCache = C44878HjO.LIZIZ(viewGroup, "parent");
        this.cachedDetailListView = new LinkedList<>();
        C65776Prg LIZ = C65352Pkq.LIZ(DeliveryPanelViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 19));
        this.style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 164));
    }

    public void setStyle(C2QY view, LogisticDTO logistic) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(logistic, "logistic");
        ((TuxTextView) view.LIZ(R.id.jwz)).setTextColorRes(b.LIZIZ(R.attr.gv, this.itemView.getContext()));
    }

    public void setThirdPartyLogistics(C2QY view, LogisticDTO logistic) {
        boolean z;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(logistic, "logistic");
        if (logistic.leadTime == null) {
            z = true;
        } else {
            z = false;
        }
        view.setThirdPartyLogistics(z);
    }

    public void showNextDayDeliverySheet(Context context, LogisticDTO logistic) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(logistic, "logistic");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context2 = this.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        C26969AiD c26969AiD = new C26969AiD(context2, null, 0);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = FKM.LIZ().getString(R.string.fan);
        o.LJIIIIZZ(string, "application.getString(id)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new C26954Ahy(elapsedRealtime, this, logistic));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLLI = c26969AiD;
        asl.LJI(1);
        int i = (int) C27162AlK.LIZJ;
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = i;
        tuxSheet2.LJLLJ = true;
        tuxSheet2.LJZL = true;
        tuxSheet2.LJZI = false;
        this.selectSheet = tuxSheet2;
        c26969AiD.LJJLJLI(logistic, true);
        TuxSheet tuxSheet3 = this.selectSheet;
        if (tuxSheet3 != null) {
            FragmentManager supportFragmentManager = ((ActivityC45651qj) context).getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "context as AppCompatActi…y).supportFragmentManager");
            tuxSheet3.show(supportFragmentManager, "next_day_delivery");
        }
    }

    public /* synthetic */ ExtraLogisticsInfoViewHolder(ViewGroup viewGroup, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i2 & 2) != 0 ? R.layout.ye : i);
    }
}
