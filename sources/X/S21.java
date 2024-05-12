package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.data.FeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PriceInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS186S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S21 extends ConstraintLayout {
    public final C71279RyF LJLIL;
    public final S25 LJLILLLLZI;
    public final S24<ViewGroup> LJLJI;
    public final S36<ConstraintLayout> LJLJJI;
    public final S22<ViewGroup> LJLJJL;
    public View.OnClickListener LJLJJLL;
    public FeedProduct LJLJL;
    public final java.util.Map<Integer, View> LJLJLJ = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> getContentShowParams() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S21.getContentShowParams():java.util.Map");
    }

    public final FeedProduct getCurrentProduct() {
        FeedProduct feedProduct = this.LJLJL;
        if (feedProduct == null) {
            return null;
        }
        return feedProduct;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLIL.LIZ();
    }

    public final View.OnClickListener getClickListener() {
        return this.LJLJJLL;
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        this.LJLJJLL = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLJLI(FeedProduct feedProduct, long j) {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        PromotionItem promotionItem;
        boolean z2;
        List<SellingItem> list;
        List<PromotionItem> list2;
        String LIZIZ;
        this.LJLJL = feedProduct;
        S24<ViewGroup> s24 = this.LJLJI;
        PriceInfo priceInfo = feedProduct.priceInfo;
        SellingItem sellingItem = null;
        if (priceInfo != null) {
            str = priceInfo.originPrice;
            str2 = priceInfo.availablePrice;
            str3 = priceInfo.currency;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        boolean z3 = false;
        if (priceInfo != null && 2 == priceInfo.displayStyle) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = !z;
        if (priceInfo != null) {
            str4 = priceInfo.pricePrefix;
        } else {
            str4 = null;
        }
        RXY rxy = new RXY(str, str2, str3, z4, str4);
        s24.getClass();
        int i = s24.LJ;
        if (C78857UxB.LJJJIL(str2)) {
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str2.charAt(i2);
                if (',' != charAt && '.' != charAt && '\'' != charAt) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "filterTo(StringBuilder(), predicate).toString()");
            if (sb2.length() > 7) {
                i = s24.LJFF;
            }
            boolean z5 = rxy.LIZLLL;
            S28 s28 = s24.LJI;
            if (s28 == null) {
                s28 = s24.LIZLLL.LIZJ(s24.LIZ, z5);
                s24.LJI = s28;
            }
            String str5 = rxy.LIZJ;
            if (str5 != null) {
                s28.setCurrencyText(str5);
            }
            String str6 = rxy.LJ;
            if (str6 != null) {
                s28.setPricePrefix(str6);
            }
            s28.setPriceNumText(str2);
            s28.setPriceSize(i);
            s28.setVisibility(0);
        } else {
            S28 s282 = s24.LJI;
            if (s282 != null) {
                s282.setVisibility(8);
            }
        }
        String str7 = rxy.LIZ;
        String str8 = "";
        if (C78857UxB.LJJJIL(str7)) {
            TuxTextView tuxTextView = s24.LJII;
            if (tuxTextView == null) {
                tuxTextView = s24.LIZLLL.LIZIZ(s24.LIZ);
                s24.LJII = tuxTextView;
            }
            if (rxy.LIZLLL) {
                StringBuilder LIZ = X1D.LIZ();
                String str9 = rxy.LIZJ;
                if (str9 == null) {
                    str9 = "";
                }
                LIZIZ = JBR.LJFF(LIZ, str9, str7, LIZ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str7);
                String str10 = rxy.LIZJ;
                if (str10 == null) {
                    str10 = "";
                }
                LIZ2.append(str10);
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            tuxTextView.setText(LIZIZ);
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                marginLayoutParams.setMarginStart(C79081V1x.LJII(1));
                                marginLayoutParams.bottomMargin = C79081V1x.LJII(1);
                                tuxTextView.setTuxFont(91);
                            }
                        } else {
                            marginLayoutParams.setMarginStart(C79081V1x.LJII(4));
                            marginLayoutParams.bottomMargin = C79081V1x.LJII(1);
                            tuxTextView.setTuxFont(81);
                        }
                    } else {
                        marginLayoutParams.setMarginStart(C79081V1x.LJII(3));
                        marginLayoutParams.bottomMargin = C79081V1x.LJII(1);
                        tuxTextView.setTuxFont(71);
                    }
                } else {
                    marginLayoutParams.setMarginStart(C79081V1x.LJII(4));
                    marginLayoutParams.bottomMargin = C79081V1x.LJII(2);
                    tuxTextView.setTuxFont(51);
                }
            } else {
                marginLayoutParams.setMarginStart(C79081V1x.LJII(5));
                marginLayoutParams.bottomMargin = C79081V1x.LJII(2);
                tuxTextView.setTuxFont(31);
            }
            tuxTextView.setLayoutParams(marginLayoutParams);
            tuxTextView.setVisibility(0);
        } else {
            TuxTextView tuxTextView2 = s24.LJII;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
        }
        this.LJLILLLLZI.LIZLLL(feedProduct.title);
        ECImage eCImage = feedProduct.cover;
        if (eCImage != null && C78857UxB.LJJJIL(eCImage.url)) {
            String LJJIIZ = C1E4.LJJIIZ(eCImage.url, 216, 216, EnumC70569Rmn.LIVE_POP_CARD);
            S36<ConstraintLayout> s36 = this.LJLJJI;
            String str11 = eCImage.urlKey;
            if (str11 != null) {
                str8 = str11;
            }
            s36.LJII(null, LJJIIZ, str8);
        }
        this.LJLJJI.LJIIIZ(feedProduct.bagIndex, null, null);
        S22<ViewGroup> s22 = this.LJLJJL;
        PromotionView promotionView = feedProduct.promotionView;
        if (promotionView != null && (list2 = promotionView.promotion_items) != null) {
            promotionItem = (PromotionItem) ORZ.LJLLLL(list2);
        } else {
            promotionItem = null;
        }
        SellingView sellingView = feedProduct.sellingView;
        if (sellingView != null && (list = sellingView.sellingItems) != null) {
            sellingItem = (SellingItem) ORZ.LJLLLL(list);
        }
        long j2 = feedProduct.LIZ;
        s22.getClass();
        C68762mu c68762mu = s22.LJFF;
        if (c68762mu != null) {
            c68762mu.LIZ();
        }
        ((ViewGroup) s22.LIZ).removeAllViews();
        if (promotionItem != null) {
            s22.LJIIIIZZ = promotionItem;
            Integer type = promotionItem.getType();
            if (type == null || 4 != type.intValue()) {
                ((ViewGroup) s22.LIZ).addView(s22.LIZLLL.LIZ(s22.LIZ, promotionItem), 0, new ViewGroup.MarginLayoutParams(-2, -1));
                s22.LJII = true;
            } else {
                C68762mu c68762mu2 = new C68762mu();
                C68772mv LIZ3 = C68782mw.LIZ(j2, j, promotionItem.getStartTime(), promotionItem.getEndTime());
                if (LIZ3 != null) {
                    c68762mu2.LIZIZ(LIZ3);
                    int i3 = c68762mu2.LIZJ;
                    if (i3 == 2 || i3 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        c68762mu2.LIZIZ(LIZ3);
                        int i4 = c68762mu2.LIZJ;
                        if (i4 == 2 || i4 == 4) {
                            IDqS186S0200000_12 iDqS186S0200000_12 = new IDqS186S0200000_12((S22) s22, (S22<ViewGroup>) promotionItem, (PromotionItem) 6);
                            if (!((ArrayList) c68762mu2.LJ).contains(iDqS186S0200000_12)) {
                                ((ArrayList) c68762mu2.LJ).add(iDqS186S0200000_12);
                            }
                            C68762mu.LIZJ(c68762mu2);
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("flash sale first show state = ");
                            LIZ4.append(c68762mu2.LIZJ);
                            C36746EbW.LIZ(4, X1D.LIZIZ(LIZ4));
                            s22.LIZLLL(c68762mu2.LIZJ, promotionItem, c68762mu2.LIZ, true);
                        } else {
                            C36746EbW.LIZ(4, "flash sale is out of time");
                        }
                    } else {
                        C36746EbW.LIZ(4, "flash sale is out of time");
                    }
                }
                s22.LJFF = c68762mu2;
            }
        }
        if (sellingItem != null) {
            s22.LJIIIZ = sellingItem;
            T t = s22.LIZ;
            ((ViewGroup) t).addView(s22.LJ.LIZ(t, sellingItem), new ViewGroup.MarginLayoutParams(-2, -1));
        }
        if (((ViewGroup) s22.LIZ).getChildCount() > 0) {
            z3 = true;
        }
        s22.LIZJ(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S21(int i, final boolean z, Context context) {
        super(context, null, 0);
        S23 s23;
        InterfaceC71439S1z<ViewGroup> interfaceC71439S1z;
        int i2;
        C208118Et c208118Et;
        InterfaceC71439S1z<ViewGroup> interfaceC71439S1z2;
        C71279RyF c71279RyF = new C71279RyF();
        this.LJLIL = c71279RyF;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.vp);
        LayoutInflater LLZIL = C16880lQ.LLZIL(contextThemeWrapper);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedProductView init ,style = ");
        LIZ.append(i);
        LIZ.append(" , showAsBig = ");
        LIZ.append(z);
        int i3 = 4;
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        int i4 = 1;
        final int i5 = 31;
        final int i6 = 61;
        if (i != 1) {
            if (i != 2) {
                s23 = new S23(61);
                interfaceC71439S1z2 = new InterfaceC71439S1z<ViewGroup>(i6, z) { // from class: X.8Et
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i6;
                        this.LIZIZ = z;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC71439S1z
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String str;
                        TuxTextView tuxTextView;
                        Resources resources;
                        int i7;
                        ViewGroup containerView = viewGroup;
                        o.LJIIIZ(containerView, "containerView");
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = containerView.getContext();
                            o.LJIIIIZZ(context2, "containerView.context");
                            int generateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer LJI = C79045V0n.LJI(R.attr.dm, context2);
                            if (LJI != null) {
                                tuxIconView.setTintColor(LJI.intValue());
                            }
                            tuxIconView.setId(generateViewId);
                            TuxTextView tuxTextView2 = new TuxTextView(context2, null, 6, 0);
                            tuxTextView2.setTextAlignment(5);
                            tuxTextView2.setText(sellingItem.showText);
                            tuxTextView2.setTuxFont(this.LIZ);
                            tuxTextView2.setMaxLines(1);
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView2.setTextColorRes(R.attr.dm);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i7 = R.dimen.ot;
                            } else {
                                resources = context2.getResources();
                                i7 = R.dimen.ok;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i7);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.p2));
                            linearLayout.addView(tuxTextView2, layoutParams);
                            tuxTextView = linearLayout;
                        } else {
                            Context context3 = containerView.getContext();
                            o.LJIIIIZZ(context3, "containerView.context");
                            TuxTextView tuxTextView3 = new TuxTextView(context3, null, 6, 0);
                            tuxTextView3.setTextAlignment(5);
                            tuxTextView3.setTuxFont(this.LIZ);
                            tuxTextView3.setTextColorRes(R.attr.dm);
                            tuxTextView3.setMaxLines(1);
                            tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                            if (3 == sellingItem.sellingItemType) {
                                str = sellingItem.optShowText;
                                if (str == null) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(sellingItem.showText);
                                    LIZ2.append(' ');
                                    LIZ2.append(tuxTextView3.getContext().getResources().getString(R.string.f9u));
                                    str = X1D.LIZIZ(LIZ2);
                                }
                            } else {
                                str = sellingItem.showText;
                            }
                            tuxTextView3.setText(str);
                            tuxTextView = tuxTextView3;
                        }
                        return tuxTextView;
                    }
                };
            } else if (z) {
                C16880lQ.LLLZIIL(R.layout.ar2, LLZIL, this);
                s23 = new S23(31);
                interfaceC71439S1z2 = new InterfaceC71439S1z<ViewGroup>(i5, z) { // from class: X.8Et
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i5;
                        this.LIZIZ = z;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC71439S1z
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String str;
                        TuxTextView tuxTextView;
                        Resources resources;
                        int i7;
                        ViewGroup containerView = viewGroup;
                        o.LJIIIZ(containerView, "containerView");
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = containerView.getContext();
                            o.LJIIIIZZ(context2, "containerView.context");
                            int generateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer LJI = C79045V0n.LJI(R.attr.dm, context2);
                            if (LJI != null) {
                                tuxIconView.setTintColor(LJI.intValue());
                            }
                            tuxIconView.setId(generateViewId);
                            TuxTextView tuxTextView2 = new TuxTextView(context2, null, 6, 0);
                            tuxTextView2.setTextAlignment(5);
                            tuxTextView2.setText(sellingItem.showText);
                            tuxTextView2.setTuxFont(this.LIZ);
                            tuxTextView2.setMaxLines(1);
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView2.setTextColorRes(R.attr.dm);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i7 = R.dimen.ot;
                            } else {
                                resources = context2.getResources();
                                i7 = R.dimen.ok;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i7);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.p2));
                            linearLayout.addView(tuxTextView2, layoutParams);
                            tuxTextView = linearLayout;
                        } else {
                            Context context3 = containerView.getContext();
                            o.LJIIIIZZ(context3, "containerView.context");
                            TuxTextView tuxTextView3 = new TuxTextView(context3, null, 6, 0);
                            tuxTextView3.setTextAlignment(5);
                            tuxTextView3.setTuxFont(this.LIZ);
                            tuxTextView3.setTextColorRes(R.attr.dm);
                            tuxTextView3.setMaxLines(1);
                            tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                            if (3 == sellingItem.sellingItemType) {
                                str = sellingItem.optShowText;
                                if (str == null) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(sellingItem.showText);
                                    LIZ2.append(' ');
                                    LIZ2.append(tuxTextView3.getContext().getResources().getString(R.string.f9u));
                                    str = X1D.LIZIZ(LIZ2);
                                }
                            } else {
                                str = sellingItem.showText;
                            }
                            tuxTextView3.setText(str);
                            tuxTextView = tuxTextView3;
                        }
                        return tuxTextView;
                    }
                };
            } else {
                C16880lQ.LLLZIIL(R.layout.ar4, LLZIL, this);
                final int i7 = 71;
                s23 = new S23(71);
                interfaceC71439S1z2 = new InterfaceC71439S1z<ViewGroup>(i7, z) { // from class: X.8Et
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i7;
                        this.LIZIZ = z;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC71439S1z
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String str;
                        TuxTextView tuxTextView;
                        Resources resources;
                        int i72;
                        ViewGroup containerView = viewGroup;
                        o.LJIIIZ(containerView, "containerView");
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = containerView.getContext();
                            o.LJIIIIZZ(context2, "containerView.context");
                            int generateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer LJI = C79045V0n.LJI(R.attr.dm, context2);
                            if (LJI != null) {
                                tuxIconView.setTintColor(LJI.intValue());
                            }
                            tuxIconView.setId(generateViewId);
                            TuxTextView tuxTextView2 = new TuxTextView(context2, null, 6, 0);
                            tuxTextView2.setTextAlignment(5);
                            tuxTextView2.setText(sellingItem.showText);
                            tuxTextView2.setTuxFont(this.LIZ);
                            tuxTextView2.setMaxLines(1);
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView2.setTextColorRes(R.attr.dm);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i72 = R.dimen.ot;
                            } else {
                                resources = context2.getResources();
                                i72 = R.dimen.ok;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i72);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.p2));
                            linearLayout.addView(tuxTextView2, layoutParams);
                            tuxTextView = linearLayout;
                        } else {
                            Context context3 = containerView.getContext();
                            o.LJIIIIZZ(context3, "containerView.context");
                            TuxTextView tuxTextView3 = new TuxTextView(context3, null, 6, 0);
                            tuxTextView3.setTextAlignment(5);
                            tuxTextView3.setTuxFont(this.LIZ);
                            tuxTextView3.setTextColorRes(R.attr.dm);
                            tuxTextView3.setMaxLines(1);
                            tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                            if (3 == sellingItem.sellingItemType) {
                                str = sellingItem.optShowText;
                                if (str == null) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(sellingItem.showText);
                                    LIZ2.append(' ');
                                    LIZ2.append(tuxTextView3.getContext().getResources().getString(R.string.f9u));
                                    str = X1D.LIZIZ(LIZ2);
                                }
                            } else {
                                str = sellingItem.showText;
                            }
                            tuxTextView3.setText(str);
                            tuxTextView = tuxTextView3;
                        }
                        return tuxTextView;
                    }
                };
            }
            i2 = 1;
            c208118Et = interfaceC71439S1z2;
        } else {
            if (z) {
                C16880lQ.LLLZIIL(R.layout.ar1, LLZIL, this);
                s23 = new S23(31);
                interfaceC71439S1z = new InterfaceC71439S1z<ViewGroup>(i5, z) { // from class: X.8Et
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i5;
                        this.LIZIZ = z;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC71439S1z
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String str;
                        TuxTextView tuxTextView;
                        Resources resources;
                        int i72;
                        ViewGroup containerView = viewGroup;
                        o.LJIIIZ(containerView, "containerView");
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = containerView.getContext();
                            o.LJIIIIZZ(context2, "containerView.context");
                            int generateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer LJI = C79045V0n.LJI(R.attr.dm, context2);
                            if (LJI != null) {
                                tuxIconView.setTintColor(LJI.intValue());
                            }
                            tuxIconView.setId(generateViewId);
                            TuxTextView tuxTextView2 = new TuxTextView(context2, null, 6, 0);
                            tuxTextView2.setTextAlignment(5);
                            tuxTextView2.setText(sellingItem.showText);
                            tuxTextView2.setTuxFont(this.LIZ);
                            tuxTextView2.setMaxLines(1);
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView2.setTextColorRes(R.attr.dm);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i72 = R.dimen.ot;
                            } else {
                                resources = context2.getResources();
                                i72 = R.dimen.ok;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i72);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.p2));
                            linearLayout.addView(tuxTextView2, layoutParams);
                            tuxTextView = linearLayout;
                        } else {
                            Context context3 = containerView.getContext();
                            o.LJIIIIZZ(context3, "containerView.context");
                            TuxTextView tuxTextView3 = new TuxTextView(context3, null, 6, 0);
                            tuxTextView3.setTextAlignment(5);
                            tuxTextView3.setTuxFont(this.LIZ);
                            tuxTextView3.setTextColorRes(R.attr.dm);
                            tuxTextView3.setMaxLines(1);
                            tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                            if (3 == sellingItem.sellingItemType) {
                                str = sellingItem.optShowText;
                                if (str == null) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(sellingItem.showText);
                                    LIZ2.append(' ');
                                    LIZ2.append(tuxTextView3.getContext().getResources().getString(R.string.f9u));
                                    str = X1D.LIZIZ(LIZ2);
                                }
                            } else {
                                str = sellingItem.showText;
                            }
                            tuxTextView3.setText(str);
                            tuxTextView = tuxTextView3;
                        }
                        return tuxTextView;
                    }
                };
            } else {
                C16880lQ.LLLZIIL(R.layout.ar3, LLZIL, this);
                s23 = new S23(61);
                interfaceC71439S1z = new InterfaceC71439S1z<ViewGroup>(i6, z) { // from class: X.8Et
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i6;
                        this.LIZIZ = z;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC71439S1z
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String str;
                        TuxTextView tuxTextView;
                        Resources resources;
                        int i72;
                        ViewGroup containerView = viewGroup;
                        o.LJIIIZ(containerView, "containerView");
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = containerView.getContext();
                            o.LJIIIIZZ(context2, "containerView.context");
                            int generateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer LJI = C79045V0n.LJI(R.attr.dm, context2);
                            if (LJI != null) {
                                tuxIconView.setTintColor(LJI.intValue());
                            }
                            tuxIconView.setId(generateViewId);
                            TuxTextView tuxTextView2 = new TuxTextView(context2, null, 6, 0);
                            tuxTextView2.setTextAlignment(5);
                            tuxTextView2.setText(sellingItem.showText);
                            tuxTextView2.setTuxFont(this.LIZ);
                            tuxTextView2.setMaxLines(1);
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView2.setTextColorRes(R.attr.dm);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i72 = R.dimen.ot;
                            } else {
                                resources = context2.getResources();
                                i72 = R.dimen.ok;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i72);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.p2));
                            linearLayout.addView(tuxTextView2, layoutParams);
                            tuxTextView = linearLayout;
                        } else {
                            Context context3 = containerView.getContext();
                            o.LJIIIIZZ(context3, "containerView.context");
                            TuxTextView tuxTextView3 = new TuxTextView(context3, null, 6, 0);
                            tuxTextView3.setTextAlignment(5);
                            tuxTextView3.setTuxFont(this.LIZ);
                            tuxTextView3.setTextColorRes(R.attr.dm);
                            tuxTextView3.setMaxLines(1);
                            tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                            if (3 == sellingItem.sellingItemType) {
                                str = sellingItem.optShowText;
                                if (str == null) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(sellingItem.showText);
                                    LIZ2.append(' ');
                                    LIZ2.append(tuxTextView3.getContext().getResources().getString(R.string.f9u));
                                    str = X1D.LIZIZ(LIZ2);
                                }
                            } else {
                                str = sellingItem.showText;
                            }
                            tuxTextView3.setText(str);
                            tuxTextView = tuxTextView3;
                        }
                        return tuxTextView;
                    }
                };
            }
            i2 = 2;
            c208118Et = interfaceC71439S1z;
        }
        setBackground(C04270Et.LIZIZ(contextThemeWrapper, R.drawable.apq));
        C66851QLn c66851QLn = new C66851QLn();
        if (z) {
            i3 = 2;
        } else {
            i4 = 3;
        }
        this.LJLJI = new S24<>(this, c66851QLn, i4, i3);
        TuxTextView ecommercelive_product_desc = (TuxTextView) _$_findCachedViewById(R.id.cmo);
        o.LJIIIIZZ(ecommercelive_product_desc, "ecommercelive_product_desc");
        S25 s25 = new S25(ecommercelive_product_desc);
        this.LJLILLLLZI = s25;
        s25.LJ(i2);
        ViewGroup ecommercelive_product_main_image_layout = (ViewGroup) _$_findCachedViewById(R.id.cmr);
        o.LJIIIIZZ(ecommercelive_product_main_image_layout, "ecommercelive_product_main_image_layout");
        this.LJLJJI = new S36<>(ecommercelive_product_main_image_layout, new S3H(z));
        C119754mx ecommercelive_promotion_sellingpoint_layout = (C119754mx) _$_findCachedViewById(R.id.cn0);
        o.LJIIIIZZ(ecommercelive_promotion_sellingpoint_layout, "ecommercelive_promotion_sellingpoint_layout");
        S22<ViewGroup> s22 = new S22<>(ecommercelive_promotion_sellingpoint_layout, s23, c208118Et);
        this.LJLJJL = s22;
        c71279RyF.LIZ.add(s22);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.cm9), new ACListenerS32S0100000_12(this, 211));
    }
}
