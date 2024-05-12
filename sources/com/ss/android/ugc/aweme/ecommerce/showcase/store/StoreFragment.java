package com.ss.android.ugc.aweme.ecommerce.showcase.store;

import X.AVS;
import X.ActivityC45651qj;
import X.C00F;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C1E4;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C235119Kp;
import X.C238679Yh;
import X.C27739Aud;
import X.C29S;
import X.C32151Nz;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C40102FoY;
import X.C56412MCa;
import X.C60726NsQ;
import X.C61918ORu;
import X.C65330PkU;
import X.C65352Pkq;
import X.C76800UCe;
import X.C77123UOp;
import X.C78565UsT;
import X.C78685UuP;
import X.C8YZ;
import X.C90903hW;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC60061Nhh;
import X.InterfaceC60761Nsz;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.LEA;
import X.M4Z;
import X.OS9;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.OUP;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBW;
import X.X1D;
import X.XKQ;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.internal.b;
import com.google.gson.s;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.showcase.EcommerceStoreBizLogServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class StoreFragment extends ECBaseFragment implements KPL, InterfaceC60061Nhh, LEA {
    public static final Stack<StoreFragment> LLF = new Stack<>();
    public C61918ORu LJLILLLLZI;
    public long LJLJJL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJLL;
    public boolean LJLJL;
    public long LJLJLJ;
    public OS9 LJLJLLL;
    public int LJLL;
    public C235119Kp LJLLJ;
    public String LJLLL;
    public String LJLLLLLL;
    public XKQ LJLZ;
    public XKQ LJZ;
    public XKQ LJZI;
    public boolean LJZL;
    public PointF LL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public Map<String, Object> LJLIL = new LinkedHashMap();
    public final Map<String, Object> LJLJI = new LinkedHashMap();
    public String LJLJJI = "";
    public final String LJLLI = C1E4.LJIL();
    public String LJLLILLLL = "";
    public final Map<String, Object> LJLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final void Il() {
        C60726NsQ wl;
        Map<String, Object> map = this.LJLLLL;
        if (map == null || map.isEmpty() || (wl = wl()) == null) {
            return;
        }
        wl.updateData(C27739Aud.LJI(map));
    }

    public final C60726NsQ wl() {
        InterfaceC60761Nsz interfaceC60761Nsz;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
        } else {
            interfaceC60761Nsz = null;
        }
        if (!(interfaceC60761Nsz instanceof C60726NsQ)) {
            return null;
        }
        return (C60726NsQ) interfaceC60761Nsz;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AccountService.LJIJ().LJIILLIIL(this);
        IEventCenter LJ = EventCenter.LJ();
        LJ.LIZIZ("ec_cart_refresh", this);
        LJ.LIZIZ("ec_store_cart_adding", this);
        LJ.LIZIZ("ec_clear_unread_msg", this);
        LLF.remove(this);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C60726NsQ wl = wl();
        if (wl != null) {
            wl.onHide();
        }
        super.onPause();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLJL) {
            if (this.LJLJJL <= 0) {
                this.LJLJJL = SystemClock.uptimeMillis();
            }
            C60726NsQ wl = wl();
            if (wl != null) {
                wl.onShow();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else if (requireActivity().isFinishing()) {
            str = "return";
        } else {
            str = "next";
        }
        if (this.LJLJJL > 0) {
            JSONObject jsonObject = new JSONObject().put("stay_time", SystemClock.uptimeMillis() - this.LJLJJL).put("quit_type", str);
            this.LJLJJL = 0L;
            for (Map.Entry<String, Object> entry : this.LJLIL.entrySet()) {
                jsonObject.put(entry.getKey(), entry.getValue());
            }
            IEcommerceStoreBizLogService LJI = EcommerceStoreBizLogServiceImpl.LJI();
            o.LJIIIIZZ(jsonObject, "jsonObject");
            LJI.LJFF(jsonObject);
        }
        super.onStop();
    }

    public final void Al(String str) {
        ((SwipeRefreshLayout) _$_findCachedViewById(R.id.itn)).setEnabled(false);
        C16880lQ.LJLLLL(_$_findCachedViewById(R.id.d1_), (FrameLayout) _$_findCachedViewById(R.id.d1b));
        View expand_container = _$_findCachedViewById(R.id.d1a);
        o.LJIIIIZZ(expand_container, "expand_container");
        expand_container.setVisibility(0);
        ((SwipeRefreshLayout) _$_findCachedViewById(R.id.itn)).setOnRefreshListener(null);
        ((SwipeRefreshLayout) _$_findCachedViewById(R.id.itn)).setRefreshing(false);
        Map LJJLIL = C113554cx.LJJLIL(this.LJLJI);
        LJJLIL.put("module_name", "hidden_shop_info");
        LJJLIL.put("click_area", str);
        C78685UuP.LJJLIIIJJIZ("tiktokec_module_click", LJJLIL);
        C78685UuP.LJJLIIIJJIZ("tiktokec_module_show", this.LJLJI);
    }

    public final void Gl(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (i <= 0) {
            View shopping_cart_red_badge = _$_findCachedViewById(R.id.jyz);
            o.LJIIIIZZ(shopping_cart_red_badge, "shopping_cart_red_badge");
            shopping_cart_red_badge.setVisibility(8);
        } else {
            if (C00F.LIZ(31744, 0, "ec_store_mini_cart", true) > 0) {
                return;
            }
            View shopping_cart_red_badge2 = _$_findCachedViewById(R.id.jyz);
            o.LJIIIIZZ(shopping_cart_red_badge2, "shopping_cart_red_badge");
            shopping_cart_red_badge2.setVisibility(0);
            ((AVS) _$_findCachedViewById(R.id.jyz)).setCount(i);
        }
    }

    public final void Hl(User user) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.dl4);
        String string = requireContext().getResources().getString(R.string.fg1);
        o.LJIIIIZZ(string, "requireContext().resourc….ecom_showcase_followers)");
        String LJJIIJ = C77123UOp.LJJIIJ(user.getFollowerCount());
        o.LJIIIIZZ(LJJIIJ, "getDisplayCount(followerCount.toLong())");
        textView.setText(ujb.o.LJJJJZ(string, "{{amount}}", LJJIIJ, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl(com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData r17) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment.vl(com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData):void");
    }

    public final void xl(GetShopHomepageData getShopHomepageData) {
        String str;
        Integer num;
        if ((C00F.LIZ(31744, 0, "ec_store_cart", true) & (-2)) == 2) {
            StringBuilder LIZ = X1D.LIZ();
            CartEntry cartEntry = getShopHomepageData.cartEntry;
            if (cartEntry != null) {
                str = cartEntry.link;
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append("&trackParams=");
            LIZ.append(Uri.encode(C27739Aud.LJI(this.LJLIL)));
            this.LJLLLLLL = X1D.LIZIZ(LIZ);
            CartEntry cartEntry2 = getShopHomepageData.cartEntry;
            if (cartEntry2 != null) {
                num = cartEntry2.itemCount;
            } else {
                num = null;
            }
            Gl(num);
            View cart_group = _$_findCachedViewById(R.id.b6a);
            o.LJIIIIZZ(cart_group, "cart_group");
            cart_group.setVisibility(0);
            Map LJJLIL = C113554cx.LJJLIL(this.LJLIL);
            LJJLIL.put("page_name", "shop");
            LJJLIL.put("source_page_type", "shop");
            b.LJJIJIIJI("tiktokec_cart_entrance_show", LJJLIL);
            HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("source", 7));
            Object obj = this.LJLIL.get("enter_from");
            if (obj != null) {
                LJJJLZIJ.put("enter_from", obj);
                LJJJLZIJ.put("enter_from_info", obj);
            }
            Object obj2 = this.LJLIL.get("traffic_source_list");
            if (obj2 != null) {
                LJJJLZIJ.put("traffic_source_list", obj2);
            }
            View cart_group2 = _$_findCachedViewById(R.id.b6a);
            o.LJIIIIZZ(cart_group2, "cart_group");
            C78565UsT.LJJIZ(cart_group2, getViewLifecycleOwner(), new M4Z(LJJJLZIJ, this, LJJLIL, null), 2);
            LLF.push(this);
            AccountService.LJIJ().LJIILJJIL(this);
            IEventCenter LJ = EventCenter.LJ();
            LJ.LIZJ("ec_cart_refresh", this);
            LJ.LIZJ("ec_store_cart_adding", this);
        }
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        HashMap<String, Object> LJII;
        Number number;
        Number number2;
        Integer num;
        o.LJIIIZ(eventName, "eventName");
        int hashCode = eventName.hashCode();
        Object obj = null;
        if (hashCode != -1928471132) {
            int i = 0;
            if (hashCode != 1496933857) {
                if (hashCode != 2018042557 || !eventName.equals("ec_cart_refresh") || !o.LJ(LLF.peek(), this)) {
                    return;
                }
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(CartRefreshEvent.class)));
                    if (!(fromJson instanceof CartRefreshEvent)) {
                        fromJson = null;
                    }
                    CartRefreshEvent cartRefreshEvent = (CartRefreshEvent) fromJson;
                    if (cartRefreshEvent != null && (num = cartRefreshEvent.count) != null) {
                        int intValue = num.intValue();
                        Integer num2 = cartRefreshEvent.addCount;
                        if (num2 != null) {
                            i = num2.intValue();
                        }
                        C78565UsT.LJJIJIIJIL(this, new C238679Yh(this, intValue, i, cartRefreshEvent, null));
                        return;
                    }
                    return;
                } catch (s unused) {
                    return;
                }
            }
            if (!eventName.equals("ec_store_cart_adding") || !o.LJ(LLF.peek(), this) || (LJII = C27739Aud.LJII(str)) == null) {
                return;
            }
            Object obj2 = LJII.get("x");
            if (!(obj2 instanceof Number) || (number = (Number) obj2) == null) {
                return;
            }
            Object obj3 = LJII.get("y");
            if (!(obj3 instanceof Number) || (number2 = (Number) obj3) == null) {
                return;
            }
            float LJIIZILJ = C32151Nz.LJIIZILJ(number);
            float LJIIZILJ2 = C32151Nz.LJIIZILJ(number2);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getTop();
            }
            this.LL = new PointF(LJIIZILJ, LJIIZILJ2 + _$_findCachedViewById(R.id.bv5).getTop() + i);
            return;
        }
        if (!eventName.equals("ec_clear_unread_msg")) {
            return;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str);
        if (LJII2 != null) {
            obj = LJII2.get("seller_id");
        }
        if (!o.LJ(obj, this.LJLLILLLL)) {
            return;
        }
        View dot = _$_findCachedViewById(R.id.cf5);
        o.LJIIIIZZ(dot, "dot");
        dot.setVisibility(8);
        this.LJLJI.put("red_dot_type", LiveGiftNewGifterBadgeSetting.DEFAULT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03a3, code lost:
    
        if (r14 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03a5, code lost:
    
        r6 = new X.C235929Ns();
        r5 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.b6a);
        r1 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.b6a).getParent();
        kotlin.jvm.internal.o.LJII(r1, "null cannot be cast to non-null type android.view.ViewGroup");
        X.C16880lQ.LJLLL(r5, (android.view.ViewGroup) r1);
        kotlin.jvm.internal.o.LJIIIIZZ(r5, "cart_group.also((cart_gr…s ViewGroup)::removeView)");
        r6.LIZJ = r5;
        r14.LIZIZ(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03d1, code lost:
    
        r1 = r17.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03d3, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03d5, code lost:
    
        ((X.C252709vu) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.l_2)).setNavActions(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03de, code lost:
    
        ((X.C252709vu) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.l_2)).LJIILJJIL(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03e9, code lost:
    
        X.C78565UsT.LJJIJIIJIL(r17, new X.C61923ORz(r17, null));
        r17.LJLJJI = X.C78685UuP.LIZLLL(X.C78685UuP.LIZLLL(com.ss.android.ugc.aweme.ecommerce.showcase.settings.RomaSchemaGroupShoppingStoreSettings.LIZ().getValue(r17.LJLLILLLL, "shop").romaSchemaPageShopPage, r17.LJLLILLLL, "seller_id"), com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT, "is_host_profile");
        r15 = X.C47117IeP.LIZ(r1, "uri.queryParameterNames");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0419, code lost:
    
        if (r15.hasNext() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x041b, code lost:
    
        r14 = (java.lang.String) r15.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0425, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r14, "sellerId") != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x042b, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r14, "trackParams") != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x042d, code lost:
    
        r8 = X.X1D.LIZ();
        r8.append(r17.LJLJJI);
        r8.append('&');
        r8.append(r14);
        r8.append('=');
        r8.append(com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r14));
        r17.LJLJJI = X.X1D.LIZIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0451, code lost:
    
        r8 = X.X1D.LIZ();
        r17.LJLJJI = X.JBR.LJFF(r8, r17.LJLJJI, "&preload_container=1", r8);
        java.lang.System.currentTimeMillis();
        r17.LJLJJI = X.C78685UuP.LIZLLL(X.C78685UuP.LIZLLL(r17.LJLJJI, android.net.Uri.encode(X.C27739Aud.LJI(r17.LJLIL)), "trackParams"), r17.LJLLI, "store_session_id");
        r5 = new X.M2D();
        r1 = r17.LJLJJI;
        kotlin.jvm.internal.o.LJIIIZ(r1, "url");
        r5.LJIILLIIL = r1;
        r5.LJIILIIL = X.O9D.LIZIZ(new kotlin.jvm.internal.AqS176S0100000_10(r17, 268));
        r5.LJIIL = new X.C61468OAm();
        r5.LJ = "store_page_lynx_group_name";
        r1 = r17.LJLLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04a4, code lost:
    
        if (r1 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04aa, code lost:
    
        if (r1.isEmpty() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0505, code lost:
    
        kotlin.jvm.internal.o.LJIIIZ(r1, "data");
        r5.LIZ = com.lynx.tasm.TemplateData.LJ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04ac, code lost:
    
        r1 = requireContext();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "requireContext()");
        r5 = X.O9C.LIZ(r1, r5);
        r17.LJLJJLL = r5;
        X.C79081V1x.LJJJI(r5, "_ec_start_time", java.lang.Long.valueOf(r17.LJLJLJ));
        ((android.view.ViewGroup) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.itn)).addView(r17.LJLJJLL);
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.d1a);
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "expand_container");
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04dc, code lost:
    
        if (r0.getVisibility() != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04de, code lost:
    
        r0 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04e0, code lost:
    
        if (r0 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04e2, code lost:
    
        r0.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04e7, code lost:
    
        r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.itn);
        r0.LLFFF = 0;
        r0.LJZ = false;
        r0.LJZL.invalidate();
        ((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.itn)).setOnRefreshListener(new X.OS7(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0511, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0150, code lost:
    
        r1 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.k28);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "skeleton_page");
        r1.setVisibility(8);
        r1 = (X.C45621qg) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.bv5);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "coordinator");
        r1.setVisibility(8);
        r1 = (X.C73305Spp) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.kf_);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "status_view");
        r1.setVisibility(0);
        r1 = (X.C73305Spp) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.kf_);
        r0 = new X.C73306Spq();
        X.C73312Spw.LJIIIZ(r0);
        r1.setStatus(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0194, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x013a, code lost:
    
        if (r10 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
    
        if (r13 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0141, code lost:
    
        r11.LIZ(r12, r13, "store", r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014c, code lost:
    
        if (ujb.o.LJJJJJL(r17.LJLLILLLL) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014e, code lost:
    
        if (r1 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f0, code lost:
    
        if (X.C00F.LIZ(31744, 0, "ec_store_api_merge", true) != 1) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f2, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fb, code lost:
    
        if (r14 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fd, code lost:
    
        X.C78565UsT.LJJIJIIJIL(r17, new X.C61916ORs(r17, r1, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0205, code lost:
    
        r14 = mo49getActivity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0209, code lost:
    
        if (r14 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020b, code lost:
    
        r1 = (int) (((android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels - (X.C79081V1x.LJII(16) * 2)) - X.C79081V1x.LJII(7)) / 2.0f);
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.ege).getLayoutParams();
        r0.width = r1;
        r0.height = r1;
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.egf).getLayoutParams();
        r0.width = r1;
        r0.height = r1;
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.egg).getLayoutParams();
        r0.width = r1;
        r0.height = r1;
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.egh).getLayoutParams();
        r0.width = r1;
        r0.height = r1;
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.egi).getLayoutParams();
        r0.width = r1;
        r0.height = r1;
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.egj).getLayoutParams();
        r0.width = r1;
        r0.height = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0289, code lost:
    
        if (X.C00F.LIZ(31744, 0, "ec_store_collapse_head", true) != 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028b, code lost:
    
        r3 = r17.LJLIL.get("source_previous_page");
        r1 = r17.LJLIL.get("entrance_type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x029f, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "product_detail") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02a7, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "showcase_detail") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02af, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "pdp_shop_view_more") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x031d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b4, code lost:
    
        if (r2 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b6, code lost:
    
        r1 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.d1_);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "expand_btn");
        r1.setVisibility(0);
        r3 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.d1_);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "expand_btn");
        X.C78565UsT.LJJIZ(r3, getViewLifecycleOwner(), new X.C238689Yi(r17, null), 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d8, code lost:
    
        ((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.itn)).setEnabled(false);
        X.C16880lQ.LJLLLL(_$_findCachedViewById(com.zhiliaoapp.musically.R.id.d1_), (android.widget.FrameLayout) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.d1b));
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.d1a);
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "expand_container");
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0302, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "all_tab_search") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0304, code lost:
    
        r2 = kotlin.jvm.internal.o.LJ(r1, "visit_shop");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0311, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "store_tab_search") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x031a, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "goods_search") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x031f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0333, code lost:
    
        if (com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl.LJJJJZI().LJIILIIL() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0335, code lost:
    
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.je_);
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "search_bar");
        X.OUP.LJJLIIIJ(r0);
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.l_2);
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "title_bar");
        X.OUP.LJIJJLI(r0);
        X.C16880lQ.LJJJ((com.bytedance.tux.icon.TuxIconView) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.e9t), new Y.ACListenerS30S0100000_10(r14, 223));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x035e, code lost:
    
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.je_);
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "search_bar");
        X.OUP.LJIJJLI(r0);
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.l_2);
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "title_bar");
        X.OUP.LJJLIIIJ(r0);
        r9 = new X.C235119Kp();
        r1 = defpackage.s1.LIZJ();
        r1.LIZJ = com.zhiliaoapp.musically.R.raw.icon_arrow_left_ltr;
        r1.LIZIZ(new X.OSA(r14));
        r0 = defpackage.t1.LIZLLL(r9, new X.AbstractC234519Ih[]{r1});
        r0.LIZJ = "";
        r9.LIZJ = r0;
        r17.LJLLJ = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x039f, code lost:
    
        if ((X.C00F.LIZ(31744, 0, "ec_store_cart", true) & (-2)) != 2) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a1, code lost:
    
        r14 = r17.LJLLJ;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0071, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06c4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dl(com.ss.android.ugc.aweme.ecommerce.api.model.Response r20, com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 2990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment.Dl(com.ss.android.ugc.aweme.ecommerce.api.model.Response, com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (viewGroup != null) {
            view = OUP.LJIL(R.layout.a71, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 1 && z) {
            C78565UsT.LJJIJIIJIL(this, new C40102FoY(this, null));
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
