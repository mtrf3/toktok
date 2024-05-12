package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USMainOrderInfoVH;
import com.ss.android.ugc.aweme.utils.Au2S3S0400000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Axz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27947Axz extends AbstractC029409q<C27973AyP> {
    public final List<C27959AyB> LJLIL;
    public final /* synthetic */ USMainOrderInfoVH LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C27947Axz(USMainOrderInfoVH uSMainOrderInfoVH) {
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI = uSMainOrderInfoVH;
        this.LJLIL = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Throwable, android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C27973AyP c27973AyP, int i) {
        String LIZIZ;
        ArrayList arrayList;
        List<PromotionItem> list;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num;
        int LJJI;
        List<UserRightDetail> list2;
        C62562cu imageUrlModel;
        HashMap<String, Object> hashMap;
        C27973AyP holder = c27973AyP;
        o.LJIIIZ(holder, "holder");
        if (i >= this.LJLIL.size()) {
            return;
        }
        C27959AyB c27959AyB = (C27959AyB) ListProtector.get(this.LJLIL, i);
        Image image = c27959AyB.LIZJ;
        SmartImageView smartImageView = holder.LJLILLLLZI;
        USMainOrderInfoVH uSMainOrderInfoVH = this.LJLILLLLZI;
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            C27949Ay1.LJJJJJL();
            W5F LIZLLL = C70759Rpr.LIZLLL(imageUrlModel);
            LIZLLL.LJJI = KL0.HIGH;
            LIZLLL.LIZIZ("product_image_tag");
            LIZLLL.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LIZLLL);
            smartImageView.setColorFilter(134217728);
            if (uSMainOrderInfoVH.L().LJLJJLL == 0 && (hashMap = uSMainOrderInfoVH.L().LLIL) != null) {
                C27949Ay1.LIZLLL(!imageUrlModel.LIZ() ? 1 : 0, hashMap);
            }
        }
        holder.LJLJI.LJJJIL(c27959AyB.LIZLLL, c27959AyB.LJIIIZ);
        OUP.LJJLIIIJILLIZJL(holder.LJLJJI, c27959AyB.LJ);
        OUP.LJJLIIIJILLIZJL(holder.LJLJJL, c27959AyB.LJFF);
        String str = c27959AyB.LJIJ;
        TuxTextView tuxTextView = holder.LJLJJLL;
        tuxTextView.setText(str);
        tuxTextView.getPaint().setFlags(16);
        tuxTextView.getPaint().setAntiAlias(true);
        Integer valueOf = Integer.valueOf(c27959AyB.LIZIZ);
        TuxTextView tuxTextView2 = holder.LJLJL;
        Context context = tuxTextView2.getContext();
        o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(valueOf);
            LIZ.append(" x");
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("x ");
            LIZ2.append(valueOf);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        tuxTextView2.setText(LIZIZ);
        UserRight userRight = c27959AyB.LJIIJJI;
        ?? r1 = 0;
        if (userRight != null && (list2 = userRight.userRightDetails) != null) {
            arrayList = new ArrayList();
            for (UserRightDetail userRightDetail : list2) {
                if (o.LJ(userRightDetail.expose, Boolean.TRUE)) {
                    arrayList.add(userRightDetail);
                }
            }
        } else {
            arrayList = null;
        }
        PromotionView promotionView = c27959AyB.LJIILL;
        if (promotionView != null) {
            list = promotionView.promotion_items;
        } else {
            list = null;
        }
        int i8 = 0;
        if (arrayList != null) {
            z = C1GE.LJIILIIL(arrayList);
        } else {
            z = false;
        }
        if (list != null) {
            z2 = C1GE.LJIILIIL(list);
        } else {
            z2 = false;
        }
        if (z || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C119774mz c119774mz = holder.LJLJLJ;
        if (z3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        c119774mz.setVisibility(i2);
        if (c119774mz.getChildCount() > 0) {
            LinkedList<C2RX> linkedList = holder.LJLLI;
            while (c119774mz.getChildCount() > 0) {
                View childAt = c119774mz.getChildAt(0);
                C16880lQ.LJLLL(childAt, c119774mz);
                if (childAt instanceof C2RX) {
                    linkedList.add(childAt);
                }
            }
        }
        if (z3) {
            C119774mz c119774mz2 = holder.LJLJLJ;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZLLL = Integer.valueOf(C45804HyK.LJJI(1));
            Context context2 = c119774mz2.getContext();
            o.LJIIIIZZ(context2, "context");
            c110614Vt.LJ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZLLL = Integer.valueOf(C45804HyK.LJJI(1));
            Context context3 = c119774mz2.getContext();
            o.LJIIIIZZ(context3, "context");
            c110614Vt2.LJ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.eb, context3));
            int i9 = 6;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        UserRightDetail userRightDetail2 = (UserRightDetail) next;
                        C2RX c2rx = (C2RX) ORS.LJJLJLI(holder.LJLLI);
                        if (c2rx == null) {
                            Context context4 = c119774mz2.getContext();
                            o.LJIIIIZZ(context4, "context");
                            c2rx = new C2RX(context4, r1, i9, i8);
                        }
                        Icon icon = userRightDetail2.icon;
                        C62562cu c62562cu = r1;
                        if (icon != null) {
                            Image image2 = icon.icon;
                            c62562cu = r1;
                            if (image2 != null) {
                                c62562cu = image2.toImageUrlModel();
                            }
                        }
                        if (c62562cu != null) {
                            W5F LIZLLL2 = C70759Rpr.LIZLLL(c62562cu);
                            LIZLLL2.LJJIIJ = (SmartImageView) c2rx._$_findCachedViewById(R.id.mve);
                            C16880lQ.LLJJJ(LIZLLL2);
                            View us_label_icon = c2rx._$_findCachedViewById(R.id.mve);
                            o.LJIIIIZZ(us_label_icon, "us_label_icon");
                            OUP.LJJLIIIJ(us_label_icon);
                        } else {
                            View us_label_icon2 = c2rx._$_findCachedViewById(R.id.mve);
                            o.LJIIIIZZ(us_label_icon2, "us_label_icon");
                            OUP.LJIJJLI(us_label_icon2);
                        }
                        c2rx.LJJLJLI(new AqS170S0100000_4(userRightDetail2, 366));
                        Context context5 = c119774mz2.getContext();
                        o.LJIIIIZZ(context5, "context");
                        c2rx.setBackground(c110614Vt.LIZ(context5));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C45804HyK.LJJI(24));
                        if (i10 == 0) {
                            i4 = 0;
                        } else {
                            i4 = 12;
                        }
                        layoutParams.setMarginStart(C45804HyK.LJJI(i4));
                        c119774mz2.addView(c2rx, layoutParams);
                        if (o.LJ(userRightDetail2.showPopup, Boolean.TRUE)) {
                            HashMap hashMap2 = new HashMap();
                            String str2 = c27959AyB.LJIL;
                            if (str2 != null) {
                                hashMap2.put("product_id", str2);
                            }
                            String str3 = c27959AyB.LJIILJJIL;
                            if (str3 != null) {
                                hashMap2.put("author_id", str3);
                            }
                            String str4 = userRightDetail2.nameEn;
                            if (str4 != null) {
                                hashMap2.put("module_name", str4);
                                hashMap2.put("rights_content", str4);
                            }
                            hashMap2.put("module_type", "user_rights");
                            Integer num2 = userRightDetail2.popupStyle;
                            if (num2 != null) {
                                if (num2.intValue() == 1) {
                                    C16880lQ.LJIIJ(new Au2S3S0400000_4(this.LJLILLLLZI, hashMap2, this, userRightDetail2, 3), c2rx);
                                } else if (num2.intValue() == 2) {
                                    C16880lQ.LJIIJ(new Au2S3S0400000_4(this.LJLILLLLZI, hashMap2, c27959AyB, userRightDetail2, 4), c2rx);
                                }
                            }
                        }
                        i10 = i11;
                        r1 = 0;
                        i9 = 6;
                        i8 = 0;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw r1;
                    }
                }
            }
            if (list != null) {
                int i12 = 0;
                for (PromotionItem promotionItem : list) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        PromotionItem promotionItem2 = promotionItem;
                        C2RX c2rx2 = (C2RX) ORS.LJJLJLI(holder.LJLLI);
                        if (c2rx2 == null) {
                            Context context6 = c119774mz2.getContext();
                            o.LJIIIIZZ(context6, "context");
                            c2rx2 = new C2RX(context6, null, 6, 0);
                        }
                        c2rx2.LJJLJLI(new AqS170S0100000_4(promotionItem2, 367));
                        Context context7 = c119774mz2.getContext();
                        o.LJIIIIZZ(context7, "context");
                        c2rx2.setBackground(c110614Vt2.LIZ(context7));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, C45804HyK.LJJI(24));
                        if (i12 != 0 || z) {
                            i3 = 12;
                        } else {
                            i3 = 0;
                        }
                        layoutParams2.setMarginStart(C45804HyK.LJJI(i3));
                        c119774mz2.addView(c2rx2, layoutParams2);
                        i12 = i13;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        View view = holder.LJLJLLL;
        if (C1GE.LJIILIIL(c27959AyB.LJIIZILJ)) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        view.setVisibility(i5);
        LinearLayout linearLayout = holder.LJLL;
        if (C1GE.LJIILIIL(c27959AyB.LJIIZILJ)) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        linearLayout.setVisibility(i6);
        LinearLayout linearLayout2 = holder.LJLL;
        if (linearLayout2.getChildCount() > 0) {
            LinkedList<C27955Ay7> linkedList2 = holder.LJLLILLLL;
            while (linearLayout2.getChildCount() > 0) {
                View childAt2 = linearLayout2.getChildAt(0);
                C16880lQ.LJLLL(childAt2, linearLayout2);
                if (childAt2 instanceof C27955Ay7) {
                    linkedList2.add(childAt2);
                }
            }
        }
        List<C27967AyJ> list3 = c27959AyB.LJIIZILJ;
        if (list3 != null) {
            int i14 = 0;
            for (C27967AyJ c27967AyJ : list3) {
                int i15 = i14 + 1;
                if (i14 >= 0) {
                    C27967AyJ c27967AyJ2 = c27967AyJ;
                    C27955Ay7 c27955Ay7 = (C27955Ay7) ORS.LJJLJLI(holder.LJLLILLLL);
                    if (c27955Ay7 == null) {
                        Context context8 = linearLayout2.getContext();
                        o.LJIIIIZZ(context8, "context");
                        c27955Ay7 = new C27955Ay7(context8, null, 0);
                    }
                    c27955Ay7.setProductImg(c27967AyJ2.LIZ);
                    ((SG3) c27955Ay7._$_findCachedViewById(R.id.mw5)).LJJJIL(c27967AyJ2.LIZIZ, c27967AyJ2.LIZJ);
                    c27955Ay7.setSkuPros(c27967AyJ2.LIZLLL);
                    c27955Ay7.setLabel(c27967AyJ2.LJ);
                    c27955Ay7.setSkuNumber(c27967AyJ2.LJFF);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    if (i14 == 0) {
                        LJJI = C45804HyK.LJJI(0);
                    } else {
                        LJJI = C45804HyK.LJJI(12);
                    }
                    layoutParams3.topMargin = LJJI;
                    linearLayout2.addView(c27955Ay7, layoutParams3);
                    i14 = i15;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        ConstraintLayout constraintLayout = holder.LJLIL;
        SkuCardStyleInfo skuCardStyleInfo = c27959AyB.LJIILLIIL;
        if (skuCardStyleInfo == null || (num = skuCardStyleInfo.skuCardStyleType) == null || num.intValue() != 1) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        constraintLayout.setVisibility(i7);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C27973AyP com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.a98, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C27973AyP c27973AyP = new C27973AyP(view);
        C0AX.LIZ(viewGroup, c27973AyP.itemView, R.id.lj7);
        View view2 = c27973AyP.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c27973AyP.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C27973AyP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c27973AyP.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c27973AyP.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C27973AyP.class.getName();
        return c27973AyP;
    }
}
