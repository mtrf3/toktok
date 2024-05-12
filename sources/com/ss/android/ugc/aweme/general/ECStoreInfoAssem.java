package com.ss.android.ugc.aweme.general;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C27739Aud;
import X.C47135Ieh;
import X.C48658J7u;
import X.C49362JYw;
import X.C55096Ljo;
import X.C70759Rpr;
import X.C73994T2g;
import X.C76800UCe;
import X.C79045V0n;
import X.C8VR;
import X.C8XO;
import X.EnumC46511INf;
import X.EnumC72807Shn;
import X.HG3;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.JXS;
import X.KL2;
import X.LD0;
import X.ORZ;
import X.RBX;
import X.W5F;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.EComImage;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopLabel;
import com.ss.android.ugc.aweme.ecommerce.model.LabelIcon;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ECStoreInfoAssem extends ReusedUISlotAssem<ECStoreInfoAssem> implements C8XO<JXS> {
    public JXS LLFF;
    public LD0 LLFFF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ap8;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Integer, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // X.C8XO
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(X.JXS r27) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.general.ECStoreInfoAssem.q4(java.lang.Object):void");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JXS jxs) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS139S0200000_8(view, this, 3));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JXS jxs) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b0, code lost:
    
        if (r1.getTotal() > 0) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n4(androidx.constraintlayout.widget.ConstraintLayout r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.general.ECStoreInfoAssem.n4(androidx.constraintlayout.widget.ConstraintLayout, java.lang.String):void");
    }

    public final void p4(View view, String str, String str2) {
        String str3;
        User user;
        String str4;
        String str5;
        String str6;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str7;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct4;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct6;
        SearchMixFeedBase searchMixFeedBase7;
        EComShopCardStruct eComShopCardStruct7;
        String str8;
        SearchMixFeedBase searchMixFeedBase8;
        EComShopCardStruct eComShopCardStruct8;
        JXS jxs = this.LLFF;
        String str9 = "";
        if (jxs == null || (searchMixFeedBase8 = jxs.LJLIL) == null || (eComShopCardStruct8 = searchMixFeedBase8.shopCard) == null || (str3 = eComShopCardStruct8.docId) == null) {
            str3 = "";
        }
        C49362JYw.LIZ(view, str3);
        Context context = view.getContext();
        JXS jxs2 = this.LLFF;
        InterfaceC55235Lm3 scope = C55096Ljo.LJIIZILJ(this);
        o.LJIIIZ(scope, "scope");
        Uri.Builder builder = null;
        HashMap<String, Object> LIZJ = C49362JYw.LIZJ(null, "", null, false, jxs2, scope);
        LIZJ.put("enter_method", str2);
        LIZJ.put("source_previous_page", "general_search");
        Integer num = null;
        if (jxs2 != null && (searchMixFeedBase7 = jxs2.LJLIL) != null && (eComShopCardStruct7 = searchMixFeedBase7.shopCard) != null && (str8 = eComShopCardStruct7.shopSchema) != null) {
            builder = UriProtector.parse(str8).buildUpon();
            builder.appendQueryParameter("trackParams", C27739Aud.LJI(LIZJ));
        }
        SmartRouter.buildRoute(context, String.valueOf(builder)).open();
        C73994T2g.LJJIII(str, this.LLFF, C55096Ljo.LJIIZILJ(this));
        JXS jxs3 = this.LLFF;
        InterfaceC55235Lm3 scope2 = C55096Ljo.LJIIZILJ(this);
        o.LJIIIZ(scope2, "scope");
        if (jxs3 != null && (searchMixFeedBase6 = jxs3.LJLIL) != null && (eComShopCardStruct6 = searchMixFeedBase6.shopCard) != null) {
            user = eComShopCardStruct6.userInfo;
        } else {
            user = null;
        }
        JSONObject LJ = C47135Ieh.LJ("EVENT_ORIGIN_FEATURE", "TEMAI", "enter_from", "general_search");
        LJ.put("page_name", "general_search");
        if (jxs3 != null && (searchMixFeedBase5 = jxs3.LJLIL) != null && (eComShopCardStruct5 = searchMixFeedBase5.shopCard) != null && o.LJ(eComShopCardStruct5.isOfficial, Boolean.TRUE)) {
            LJ.put("logo_type", "official_brand");
        }
        LJ.put("entrance_type", "shop_card");
        if (jxs3 == null || (searchMixFeedBase4 = jxs3.LJLIL) == null || (eComShopCardStruct4 = searchMixFeedBase4.shopCard) == null || (str4 = eComShopCardStruct4.shopId) == null) {
            str4 = "";
        }
        LJ.put("shop_id", str4);
        if (jxs3 == null || (searchMixFeedBase3 = jxs3.LJLIL) == null || (eComShopCardStruct3 = searchMixFeedBase3.shopCard) == null || (str5 = eComShopCardStruct3.userId) == null) {
            str5 = "";
        }
        LJ.put("author_id", str5);
        if (jxs3 != null && (searchMixFeedBase2 = jxs3.LJLIL) != null && (eComShopCardStruct2 = searchMixFeedBase2.shopCard) != null) {
            str6 = eComShopCardStruct2.userId;
        } else {
            str6 = null;
        }
        LJ.put("is_self", TextUtils.equals(str6, ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0);
        LJ.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope2, ISearchContextAbility.class)).If().LIZJ().LJLJI);
        if (jxs3 != null && (searchMixFeedBase = jxs3.LJLIL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str7 = eComShopCardStruct.docId) != null) {
            str9 = str7;
        }
        LJ.put("search_result_id", str9);
        LJ.put("search_entrance", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope2, ISearchContextAbility.class)).cs().LIZJ().LJLIL);
        if (user != null) {
            num = Integer.valueOf(user.getFollowerStatus());
        }
        LJ.put("follow_status", num);
        C48658J7u.LIZIZ("tiktokec_shop_entrance_click", LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m4(EComShopLabel eComShopLabel, LinearLayout linearLayout, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC65784Pro<Boolean> interfaceC65784Pro2) {
        int i;
        Object obj;
        EComImage eComImage;
        List<String> list;
        Object LJLLLLLL;
        EComImage eComImage2;
        List<String> list2;
        EComImage eComImage3;
        Integer num;
        EComImage eComImage4;
        Integer num2;
        EComImage eComImage5;
        List<String> list3;
        LabelIcon labelIcon = eComShopLabel.icon;
        if (labelIcon != null && (eComImage5 = labelIcon.labelImageLight) != null && (list3 = eComImage5.urlList) != null) {
            i = list3.size();
        } else {
            i = 0;
        }
        String str = "";
        if (i > 0) {
            LabelIcon labelIcon2 = eComShopLabel.icon;
            if (labelIcon2 != null && (eComImage4 = labelIcon2.labelImageLight) != null && (num2 = eComImage4.width) != null) {
                num2.intValue();
            }
            LabelIcon labelIcon3 = eComShopLabel.icon;
            if (labelIcon3 != null && (eComImage3 = labelIcon3.labelImageLight) != null && (num = eComImage3.height) != null) {
                num.intValue();
            }
            SmartImageView smartImageView = new SmartImageView(getContext());
            smartImageView.setLayoutParams(new LinearLayout.LayoutParams((int) KL2.LIZJ(getContext(), 47.0f), (int) KL2.LIZJ(getContext(), 15.0f)));
            LabelIcon labelIcon4 = eComShopLabel.icon;
            if (labelIcon4 == null || (eComImage2 = labelIcon4.labelImageLight) == null || (list2 = eComImage2.urlList) == null || (obj = ORZ.LJLLLLLL(0, list2)) == null) {
                obj = "";
            }
            Context context = linearLayout.getContext();
            o.LJIIIIZZ(context, "parentView.context");
            if (AnonymousClass636.LJIILJJIL(context)) {
                LabelIcon labelIcon5 = eComShopLabel.icon;
                if (labelIcon5 != null && (eComImage = labelIcon5.labelImageDark) != null && (list = eComImage.urlList) != null && (LJLLLLLL = ORZ.LJLLLLLL(0, list)) != 0) {
                    str = LJLLLLLL;
                }
                obj = str;
            }
            W5F LIZLLL = C70759Rpr.LIZLLL(obj);
            LIZLLL.LJIJJ = EnumC72807Shn.FIT_XY;
            LIZLLL.LJJIIJZLJL = smartImageView;
            C16880lQ.LLJJJ(LIZLLL);
            linearLayout.addView(smartImageView);
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.TRUE);
            }
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) KL2.LIZJ(getContext(), 1.0f), (int) KL2.LIZJ(getContext(), 8.0f));
        layoutParams.setMarginStart((int) KL2.LIZJ(getContext(), 6.0f));
        view.setLayoutParams(layoutParams);
        Context context2 = linearLayout.getContext();
        o.LJIIIIZZ(context2, "parentView.context");
        view.setBackground(C79045V0n.LJIIIIZZ(R.attr.dz, context2));
        Integer num3 = eComShopLabel.type;
        int type = EnumC46511INf.REVIEW_RATING.getType();
        if (num3 == null || num3.intValue() != type) {
            if (interfaceC65784Pro2 != null && interfaceC65784Pro2.invoke().booleanValue()) {
                linearLayout.addView(view);
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Boolean.TRUE);
                }
            }
            Context context3 = linearLayout.getContext();
            o.LJIIIIZZ(context3, "parentView.context");
            TuxTextView tuxTextView = new TuxTextView(context3, null, 6, 0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            if (interfaceC65784Pro2 != null && interfaceC65784Pro2.invoke().booleanValue()) {
                layoutParams2.setMarginStart((int) KL2.LIZJ(getContext(), 6.0f));
            }
            tuxTextView.setLayoutParams(layoutParams2);
            tuxTextView.setTuxFont(61);
            Context context4 = linearLayout.getContext();
            o.LJIIIIZZ(context4, "parentView.context");
            Integer LJI = C79045V0n.LJI(R.attr.gv, context4);
            if (LJI != null) {
                tuxTextView.setTextColor(LJI.intValue());
            }
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            String str2 = eComShopLabel.translatedLabelText;
            if (str2 != null) {
                str = str2;
            }
            tuxTextView.setText(str);
            linearLayout.addView(tuxTextView);
            if (interfaceC88472Yns2 == null) {
                return;
            }
            interfaceC88472Yns2.invoke(Boolean.TRUE);
            return;
        }
        if (interfaceC65784Pro2 != null && interfaceC65784Pro2.invoke().booleanValue() && interfaceC65784Pro != null && !interfaceC65784Pro.invoke().booleanValue()) {
            linearLayout.addView(view);
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(Boolean.TRUE);
            }
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.apa, null, false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        LLLLIILL.setLayoutParams(layoutParams3);
        if (interfaceC65784Pro2 != null && interfaceC65784Pro2.invoke().booleanValue()) {
            layoutParams3.setMarginStart((int) KL2.LIZJ(getContext(), 6.0f));
        }
        linearLayout.addView(LLLLIILL);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.ml3);
        String str3 = eComShopLabel.value;
        if (str3 != null) {
            str = str3;
        }
        textView.setText(str);
        if (interfaceC88472Yns2 == null) {
            return;
        }
        interfaceC88472Yns2.invoke(Boolean.TRUE);
    }
}
