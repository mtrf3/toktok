package com.ss.android.ugc.aweme.ecommerce.mall.ui;

import X.C113554cx;
import X.C142425iQ;
import X.C16880lQ;
import X.C214298b3;
import X.C27740Aue;
import X.C32151Nz;
import X.C36746EbW;
import X.C40925G4j;
import X.C53866LCc;
import X.C55625LsL;
import X.C55815LvP;
import X.C56092Lzs;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68672ml;
import X.C76800UCe;
import X.C78450Uqc;
import X.C78926UyI;
import X.C82682Wcg;
import X.C9BE;
import X.EnumC55811LvL;
import X.InterfaceC65895Ptb;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.O6R;
import X.OSZ;
import X.TBT;
import X.WHL;
import X.X1D;
import Y.ACListenerS35S0300000_9;
import Y.IDeS355S0100000_9;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S0S1300000_9;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallShopCartAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public InterfaceC82683Wch LJLILLLLZI;
    public EnumC55811LvL LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
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

    public MallShopCartAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainLynxViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 132), C55625LsL.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C36746EbW.LIZ(3, "onViewCreated");
        ((TuxAlertBadgeLayout) _$_findCachedViewById(R.id.jyt)).LIZIZ();
        A3("sslocal://webcast_lynxview?hide_nav_bar=1&use_new_container=1&trans_status_bar=1&hide_status_bar=0&trackParams=%7B%22previous_page%22%3A%22mall%22%2C%22enter_from%22%3A%22mall%22%7D&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_shop_cart%2Fall%2Fpages%2Fmain%2Ftemplate.js", C113554cx.LJJLIIIIJ(new OSZ("notice_number", CardStruct.IStatusCode.DEFAULT)), new C53866LCc(C56092Lzs.LIZ));
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.LvJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55983Ly7) obj).LJLJJI;
            }
        }, null, null, null, new AqS175S0100000_9(this, 616), 14, null);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.LvK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55983Ly7) obj).LJLJJL;
            }
        }, null, new AqS175S0100000_9(this, 617), null, new AqS175S0100000_9(this, 618), 10, null);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.LXe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55983Ly7) obj).LJLJJLL;
            }
        }, null, null, null, new AqS175S0100000_9(this, 619), 14, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2mm, android.view.View] */
    public final void x3(C68672ml c68672ml, InterfaceC88472Yns<? super Map<String, String>, C76800UCe> interfaceC88472Yns) {
        final Context context = getContext();
        if (context != null) {
            if (c68672ml != null) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.jys);
                ?? r2 = new LinearLayout(context) { // from class: X.2mm
                    public final TuxIconView LJLIL;
                    public final TuxTextView LJLILLLLZI;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(context, null);
                        new LinkedHashMap();
                        C16880lQ.LLLZIIL(R.layout.a72, C16880lQ.LLZIL(context), this);
                        this.LJLIL = (TuxIconView) findViewById(R.id.jyp);
                        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.jyq);
                    }

                    public final void setContent(C68672ml shopCartTooltip) {
                        TuxTextView tuxTextView;
                        o.LJIIIZ(shopCartTooltip, "shopCartTooltip");
                        Bitmap bitmap = shopCartTooltip.LIZ;
                        if (bitmap != null) {
                            C1M5 c1m5 = new C1M5(getContext().getResources(), bitmap);
                            c1m5.LIZJ(C32151Nz.LJIIZILJ(4));
                            TuxIconView tuxIconView = this.LJLIL;
                            if (tuxIconView != null) {
                                tuxIconView.setImageDrawable(c1m5);
                            }
                            TuxIconView tuxIconView2 = this.LJLIL;
                            if (tuxIconView2 != null) {
                                tuxIconView2.setVisibility(0);
                            }
                        }
                        String str = shopCartTooltip.LIZIZ;
                        if (str != null) {
                            TuxTextView tuxTextView2 = this.LJLILLLLZI;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setText(str);
                            }
                            TuxTextView tuxTextView3 = this.LJLILLLLZI;
                            if (tuxTextView3 != null) {
                                tuxTextView3.setVisibility(0);
                            }
                        }
                        if (shopCartTooltip.LIZ == null && shopCartTooltip.LIZIZ != null && (tuxTextView = this.LJLILLLLZI) != null) {
                            C26338AVi.LJI(tuxTextView, AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(12), false, 16);
                        }
                    }
                };
                r2.setContent(c68672ml);
                if (_$_findCachedViewById != null) {
                    this.LJLJI = EnumC55811LvL.BEYOND_TIME_LIMIT;
                    C142425iQ c142425iQ = new C142425iQ(context);
                    c142425iQ.LIZ.LIZIZ = _$_findCachedViewById;
                    c142425iQ.LJFF();
                    int LJIJJLI = C63081OpJ.LJIJJLI(context, 8.0f);
                    C82682Wcg c82682Wcg = c142425iQ.LIZ;
                    c82682Wcg.LJ = 0;
                    c82682Wcg.LJFF = LJIJJLI;
                    c82682Wcg.LJIJ = r2;
                    c142425iQ.LJI(WHL.BOTTOM);
                    c142425iQ.LIZ.LJIIIIZZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
                    c142425iQ.LJIIIZ(R.attr.gy);
                    long j = c68672ml.LIZJ;
                    C82682Wcg c82682Wcg2 = c142425iQ.LIZ;
                    c82682Wcg2.LJII = j;
                    c82682Wcg2.LJIJJLI = false;
                    c142425iQ.LJIIJ(new ACListenerS35S0300000_9(this, c68672ml, interfaceC88472Yns, 0), true);
                    c142425iQ.LJII(new AqS159S0100000_9(c68672ml, 131));
                    c142425iQ.LJ(new AqS156S0200000_9(this, c68672ml, 10));
                    InterfaceC82683Wch LIZJ = c142425iQ.LIZJ();
                    this.LJLILLLLZI = LIZJ;
                    LIZJ.show();
                    return;
                }
                return;
            }
            InterfaceC82683Wch interfaceC82683Wch = this.LJLILLLLZI;
            if (interfaceC82683Wch == null || !interfaceC82683Wch.isShowing()) {
                return;
            }
            this.LJLJI = EnumC55811LvL.OTHER;
            InterfaceC82683Wch interfaceC82683Wch2 = this.LJLILLLLZI;
            if (interfaceC82683Wch2 != null) {
                interfaceC82683Wch2.dismiss();
            }
            C36746EbW.LIZ(3, "ShopTab Tooltip CartTooltip dismiss");
        }
    }

    public final void A3(String str, Map map, InterfaceC88472Yns interfaceC88472Yns) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shop cart schema ");
        LIZ.append(str);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        View shopping_cart = _$_findCachedViewById(R.id.jys);
        o.LJIIIIZZ(shopping_cart, "shopping_cart");
        C16880lQ.LJIIJ(new Au2S0S1300000_9(str, map, this, interfaceC88472Yns, 1), shopping_cart);
    }

    public final void v3(Map<String, String> map, InterfaceC88472Yns<? super Map<String, String>, C76800UCe> interfaceC88472Yns, String str, String str2) {
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        buildUpon.appendQueryParameter("target_handler", "ecom,webcast");
        buildUpon.appendQueryParameter("business_from", "ecom");
        buildUpon.appendQueryParameter("previous_page", "mall");
        buildUpon.appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis()));
        String builder = buildUpon.toString();
        o.LJIIIIZZ(builder, "builder.toString()");
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(map);
        }
        Context context = getContext();
        if (context != null) {
            C55815LvP c55815LvP = new C55815LvP(this, context, builder, str2);
            IAccountService LJIJ = AccountService.LJIJ();
            if (!LJIJ.LJFF().isLogin()) {
                InterfaceC65895Ptb LJI = LJIJ.LJI();
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = C27740Aue.LIZ(context);
                c78450Uqc.LJ = new IDeS355S0100000_9(c55815LvP, 5);
                C40925G4j.LIZ(c78450Uqc, LJI);
                return;
            }
            c55815LvP.invoke();
        }
    }
}
