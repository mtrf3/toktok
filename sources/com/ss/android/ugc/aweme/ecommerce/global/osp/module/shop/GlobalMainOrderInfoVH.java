package com.ss.android.ugc.aweme.ecommerce.global.osp.module.shop;

import X.AnonymousClass636;
import X.C1AU;
import X.C1GE;
import X.C2068389v;
import X.C221108m2;
import X.C224848s4;
import X.C249329qS;
import X.C26508Aam;
import X.C26730AeM;
import X.C26965Ai9;
import X.C27106AkQ;
import X.C27111AkV;
import X.C27113AkX;
import X.C27114AkY;
import X.C27945Axx;
import X.C27949Ay1;
import X.C29542Bic;
import X.C29S;
import X.C32151Nz;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70963Rt9;
import X.C72242sW;
import X.C73156SnQ;
import X.C78685UuP;
import X.C78857UxB;
import X.C78946Uyc;
import X.C79045V0n;
import X.O6R;
import X.ORZ;
import X.OUP;
import X.TBT;
import Y.ARunnableS2S0211000_4;
import Y.IDCSpanS1S1100000_4;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS3S0311000_4;
import kotlin.jvm.internal.AqS6S0111000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalMainOrderInfoVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public KeyBoardVisibilityUtil LJLJJL;
    public C27945Axx LJLJJLL;
    public final Map<Integer, View> LJLJL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, true);
        View view = this.LJLIL;
        Context context = view.getContext();
        if (context != null && (context instanceof C29S)) {
            this.LJLJJL = new KeyBoardVisibilityUtil((C1AU) context, 32, new AqS186S0100000_4(view, 96));
        }
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.AkT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getCheckPhoneNumber());
            }
        }, new AqS167S0200000_4(view, this, 17));
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.AkW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getPhoneNumberErr();
            }
        }, new AqS186S0100000_4(view, 97));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LJLJJL;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LJLJJL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String str;
        String str2;
        LogisticTextDTO logisticTextDTO;
        Map<String, String> map;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        LogisticLinkRichText logisticLinkRichText;
        boolean z;
        Object obj2;
        boolean z2;
        SpannableStringBuilder spannableStringBuilder2;
        String str4;
        List<LogisticLinkRichText> list;
        LogisticLinkRichText logisticLinkRichText2;
        String str5;
        int i;
        Context context;
        String str6;
        C26965Ai9 item = (C26965Ai9) obj;
        o.LJIIIZ(item, "item");
        Integer num = item.LJIIIZ;
        if (num != null && num.intValue() == 1) {
            View view = this.LJLIL;
            PhoneCredit phoneCredit = ((C26965Ai9) getItem()).LJIIJ;
            if (phoneCredit != null) {
                view.findViewById(R.id.hnw).setVisibility(0);
                C27106AkQ c27106AkQ = L().LLJJI;
                if (c27106AkQ != null && o.LJ(c27106AkQ.LIZIZ, Boolean.TRUE)) {
                    C27106AkQ c27106AkQ2 = L().LLJJI;
                    if (c27106AkQ2 != null) {
                        str = c27106AkQ2.LIZ;
                    } else {
                        str = null;
                    }
                    if (C78685UuP.LJJJZ(str)) {
                        ((C27111AkV) view.findViewById(R.id.hnw)).LIZ(R.id.eof).setFocusable(false);
                        C27106AkQ c27106AkQ3 = L().LLJJI;
                        if (c27106AkQ3 != null) {
                            str2 = c27106AkQ3.LIZ;
                        } else {
                            str2 = null;
                        }
                        phoneCredit = PhoneCredit.copy$default(phoneCredit, null, str2, null, null, 13, null);
                        ((C27111AkV) view.findViewById(R.id.hnw)).setPhoneCredit(phoneCredit);
                        OrderSubmitViewModel L = L();
                        L.LLJ = phoneCredit;
                        L.LLJI = 1;
                        L().LLJI = ((C26965Ai9) getItem()).LJIIIZ;
                        C27949Ay1.LJJIFFI(C27949Ay1.LIZ, "mobile_number", new HashMap(), null, null, null, null, null, 2044);
                    }
                }
                C72242sW c72242sW = new C72242sW();
                c72242sW.element = -1L;
                ((C27111AkV) view.findViewById(R.id.hnw)).setOnFocusChangeListener(new AqS167S0200000_4(this, c72242sW, 32));
                ((C27111AkV) view.findViewById(R.id.hnw)).setPhoneCredit(phoneCredit);
                OrderSubmitViewModel L2 = L();
                L2.LLJ = phoneCredit;
                L2.LLJI = 1;
                L().LLJI = ((C26965Ai9) getItem()).LJIIIZ;
                C27949Ay1.LJJIFFI(C27949Ay1.LIZ, "mobile_number", new HashMap(), null, null, null, null, null, 2044);
            }
        }
        View view2 = this.LJLIL;
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new C27945Axx(this);
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.jym);
            view2.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) view2.findViewById(R.id.jym)).LJII(new C29542Bic(16), -1);
            ((RecyclerView) view2.findViewById(R.id.jym)).setAdapter(this.LJLJJLL);
        }
        C27945Axx c27945Axx = this.LJLJJLL;
        if (c27945Axx != null) {
            c27945Axx.LJLIL = item;
            c27945Axx.LJLILLLLZI.clear();
            c27945Axx.LJLILLLLZI.addAll(item.LJII);
            c27945Axx.notifyDataSetChanged();
        }
        List<LogisticDTO> list2 = item.LIZLLL;
        String str7 = item.LJIIL;
        if (C1GE.LJIILIIL(list2)) {
            if (C78685UuP.LJJJZ(str7)) {
                ((TextView) this.LJLIL.findViewById(R.id.jxj)).setText(str7);
            } else {
                ((TextView) this.LJLIL.findViewById(R.id.jxj)).setText("Shipped");
            }
            View findViewById = this.LJLIL.findViewById(R.id.jwy);
            o.LJIIIIZZ(findViewById, "view.shipping_layout");
            OUP.LJJLIIIJ(findViewById);
            View view3 = this.itemView;
            ((ViewGroup) view3.findViewById(R.id.g_b)).removeAllViews();
            List<LogisticDTO> list3 = ((C26965Ai9) getItem()).LIZLLL;
            if (list3 != null) {
                int i2 = 0;
                for (LogisticDTO logisticDTO : list3) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        LogisticDTO logisticDTO2 = logisticDTO;
                        LogisticDTO logisticDTO3 = ((C26965Ai9) getItem()).LJ;
                        if (logisticDTO3 != null) {
                            str3 = logisticDTO3.logisticsServiceId;
                        } else {
                            str3 = null;
                        }
                        boolean LJ = o.LJ(str3, logisticDTO2.logisticsServiceId);
                        Context context2 = this.itemView.getContext();
                        o.LJIIIIZZ(context2, "itemView.context");
                        C249329qS c249329qS = new C249329qS(context2);
                        if (logisticDTO2.logisticsDescription != null) {
                            HashMap<String, Object> hashMap = L().LLIL;
                            if (hashMap == null || (obj2 = hashMap.get("enter_from_info")) == null) {
                                obj2 = "";
                            }
                            if ((obj2 instanceof String) && (str4 = (String) obj2) != null && (list = logisticDTO2.logisticRichTextList) != null && (logisticLinkRichText2 = (LogisticLinkRichText) ORZ.LJLLLL(list)) != null) {
                                final View view4 = this.itemView;
                                C27113AkX block = C27113AkX.LJLIL;
                                o.LJIIIZ(block, "block");
                                String str8 = logisticLinkRichText2.template;
                                if (str8 != null && str8.length() != 0) {
                                    StringBuilder sb = new StringBuilder(logisticLinkRichText2.template);
                                    Map<String, LogisticLinkText> map2 = logisticLinkRichText2.arguments;
                                    if (map2 != null) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (String str9 : map2.keySet()) {
                                            LogisticLinkText logisticLinkText = map2.get(str9);
                                            if (logisticLinkText != null && (str6 = logisticLinkText.text) != null) {
                                                if (sb.indexOf(str9) != -1) {
                                                    linkedHashMap.put(str9, logisticLinkText);
                                                }
                                                C26730AeM.LIZ(sb, str9, str6);
                                            }
                                        }
                                        spannableStringBuilder2 = new SpannableStringBuilder(sb);
                                        if (view4 != null && (context = view4.getContext()) != null && AnonymousClass636.LJIILJJIL(context) && C78857UxB.LJJJIL(logisticLinkRichText2.textDarkColor)) {
                                            str5 = logisticLinkRichText2.textDarkColor;
                                        } else {
                                            str5 = logisticLinkRichText2.textColor;
                                        }
                                        if (str5 != null) {
                                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(ColorProtector.parseColor(str5)), 0, spannableStringBuilder2.length(), 17);
                                        }
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str10 = (String) entry.getKey();
                                            final LogisticLinkText logisticLinkText2 = (LogisticLinkText) entry.getValue();
                                            String str11 = logisticLinkText2.text;
                                            if (str11 != null && o.LJ(logisticLinkText2.replaceWithIcon, Boolean.TRUE)) {
                                                int indexOf = sb.indexOf(str10);
                                                int length = str10.length() + indexOf;
                                                if (view4 != null) {
                                                    spannableStringBuilder2.insert(indexOf, (CharSequence) "    ");
                                                    Context context3 = view4.getContext();
                                                    o.LJIIIIZZ(context3, "view.context");
                                                    C2068389v c2068389v = new C2068389v();
                                                    c2068389v.LIZ = R.raw.icon_info_circle;
                                                    c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
                                                    c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
                                                    c2068389v.LIZLLL = C79045V0n.LJI(R.attr.go, context3);
                                                    i = 17;
                                                    spannableStringBuilder2.setSpan(c2068389v.LIZIZ(2, context3), indexOf, length + 4, 17);
                                                } else {
                                                    i = 17;
                                                }
                                                spannableStringBuilder2.setSpan(new IDCSpanS1S1100000_4(logisticDTO2, str4, 1), indexOf, indexOf + 2, i);
                                                block.invoke(new C224848s4(str10, str10, indexOf, length, spannableStringBuilder2));
                                            } else if (str11 != null) {
                                            }
                                            int indexOf2 = sb.indexOf(str11);
                                            int length2 = str11.length() + indexOf2;
                                            if (indexOf2 >= 0 && length2 <= sb.length()) {
                                                spannableStringBuilder2.setSpan(new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.ecommerce.global.osp.utils.BuildInfoIconUtil$buildWithIcon$1$4
                                                    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                                                    public final void updateDrawState(TextPaint ds) {
                                                        String str12;
                                                        Context context4;
                                                        o.LJIIIZ(ds, "ds");
                                                        if (o.LJ(LogisticLinkText.this.hasUnderscore, Boolean.TRUE)) {
                                                            ds.setUnderlineText(true);
                                                        }
                                                        View view5 = view4;
                                                        if (view5 != null && (context4 = view5.getContext()) != null && AnonymousClass636.LJIILJJIL(context4) && C78857UxB.LJJJIL(LogisticLinkText.this.darkColor)) {
                                                            str12 = LogisticLinkText.this.darkColor;
                                                        } else {
                                                            str12 = LogisticLinkText.this.color;
                                                        }
                                                        if (LogisticLinkText.this.color != null) {
                                                            ds.setColor(ColorProtector.parseColor(str12));
                                                        }
                                                    }
                                                }, indexOf2, length2, 17);
                                                Boolean bool = logisticLinkText2.isBold;
                                                if (bool != null && bool.booleanValue()) {
                                                    spannableStringBuilder2.setSpan(new StyleSpan(1), indexOf2, length2, 17);
                                                }
                                                block.invoke(new C224848s4(str10, str11, indexOf2, length2, spannableStringBuilder2));
                                            }
                                        }
                                    } else {
                                        spannableStringBuilder2 = new SpannableStringBuilder(sb);
                                    }
                                    z2 = true;
                                    c249329qS.LIZIZ(spannableStringBuilder2, z2);
                                }
                            }
                            z2 = true;
                            spannableStringBuilder2 = null;
                            c249329qS.LIZIZ(spannableStringBuilder2, z2);
                        } else {
                            List<LogisticLinkRichText> list4 = logisticDTO2.logisticRichTextList;
                            if (list4 != null && (logisticLinkRichText = (LogisticLinkRichText) ORZ.LJLLLL(list4)) != null) {
                                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                                View view5 = this.itemView;
                                C27114AkY c27114AkY = C27114AkY.LJLIL;
                                richTextUtil.getClass();
                                spannableStringBuilder = RichTextUtil.LIZ(logisticLinkRichText, view5, c27114AkY);
                            } else {
                                spannableStringBuilder = null;
                            }
                            c249329qS.LIZIZ(spannableStringBuilder, false);
                        }
                        c249329qS.setCheck(LJ);
                        c249329qS.setOnClick(new AqS3S0311000_4(LJ, this, c249329qS, logisticDTO2, i2, 0));
                        if (LJ && !L().LLJJIII) {
                            c249329qS = c249329qS;
                            c249329qS.post(new ARunnableS2S0211000_4(i2, c249329qS, logisticDTO2, true, 0));
                        }
                        ((ViewGroup) view3.findViewById(R.id.g_b)).addView(c249329qS);
                        if (LJ && !L().LLJJIII) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C78946Uyc.LJJIIJ(c249329qS, new C70963Rt9(), new AqS6S0111000_4(logisticDTO2, z, i2, 2));
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            String str12 = null;
            HashMap<String, Object> fw0 = L().fw0(false);
            LogisticDTO logisticDTO4 = ((C26965Ai9) getItem()).LJ;
            if (logisticDTO4 != null && (map = logisticDTO4.eventTrackInfo) != null) {
                fw0.putAll(map);
            }
            C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
            LogisticDTO logisticDTO5 = ((C26965Ai9) getItem()).LJ;
            if (logisticDTO5 != null && (logisticTextDTO = logisticDTO5.logisticText) != null) {
                str12 = logisticTextDTO.thresholdTextEn;
            }
            C27949Ay1.LJJIFFI(c27949Ay1, "logistics", fw0, str12, null, null, null, null, 2012);
        } else {
            View findViewById2 = this.LJLIL.findViewById(R.id.jwy);
            o.LJIIIIZZ(findViewById2, "view.shipping_layout");
            OUP.LJIJJLI(findViewById2);
        }
        View view6 = this.LJLIL;
        if (item.LJFF) {
            view6.findViewById(R.id.mu0).setVisibility(8);
            if (!this.LJLJJI) {
                this.LJLJJI = true;
                C27949Ay1.LJJIFFI(C27949Ay1.LIZ, "message", L().fw0(false), null, null, null, null, null, 2044);
                return;
            }
            return;
        }
        if (item.LJI == null) {
            return;
        }
        view6.findViewById(R.id.mu0).setVisibility(0);
        ((TextView) view6.findViewById(R.id.mu0)).setText(item.LJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalMainOrderInfoVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJL = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 90));
    }
}
