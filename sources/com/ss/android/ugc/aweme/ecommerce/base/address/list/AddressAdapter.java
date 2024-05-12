package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.AbstractC26779Af9;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C26508Aam;
import X.C26587Ac3;
import X.C26610AcQ;
import X.C26615AcV;
import X.C26619AcZ;
import X.C44878HjO;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70918RsQ;
import X.C76542zS;
import X.C78685UuP;
import X.C78897Uxp;
import X.C78946Uyc;
import X.C78948Uye;
import X.InterfaceC71003Rtn;
import X.OUR;
import Y.ARunnableS8S0400000_4;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS50S0400000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressAdapter extends AbstractC26779Af9<Object> {
    public final LifecycleOwner LJLJJLL;

    /* loaded from: classes5.dex */
    public static final class AddressViewHolder extends ECJediViewHolder {
        public final int LJLIL;
        public final C62822Ol8 LJLILLLLZI;
        public final Map<Integer, View> LJLJI;

        @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
        public final void _$_clearFindViewByIdCache() {
            ((LinkedHashMap) this.LJLJI).clear();
        }

        @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
        public final View _$_findCachedViewById(int i) {
            View findViewById;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

        public final AddressListViewModel L() {
            return (AddressListViewModel) this.LJLILLLLZI.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final void onBind(Object obj) {
            boolean z;
            int i;
            boolean z2;
            String str;
            ReachableAddress item = (ReachableAddress) obj;
            o.LJIIIZ(item, "item");
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            if (this.latestItemPositionInternal != this.LJLIL - 1) {
                z = true;
            } else {
                z = false;
            }
            C26508Aam.LIZ(itemView, z);
            View view = this.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.widget.AddressInfoCard");
            C26610AcQ c26610AcQ = (C26610AcQ) view;
            c26610AcQ.setUiMode("show_all");
            c26610AcQ.setHasPrefix(false);
            if (L().Nv0() || L().LJLLILLLL) {
                i = 3;
            } else {
                i = 1;
            }
            c26610AcQ.setSuffixType(i);
            if (L().LJLLJ) {
                Boolean bool = item.reachable;
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            c26610AcQ.setReachable(z2);
            String str2 = "";
            if (!o.LJ(item.addressValid, Boolean.FALSE)) {
                str = "";
            } else {
                str = item.invalidHintMessage;
            }
            c26610AcQ.setHintText(str);
            c26610AcQ.setPaddingVertical(22);
            Address address = item.address;
            if (address != null) {
                withState(L(), new AqS50S0400000_4(address, this, item, c26610AcQ, 4));
                String LIZLLL = address.LIZLLL("name");
                if (LIZLLL == null) {
                    LIZLLL = "";
                }
                c26610AcQ.setNameText(LIZLLL);
                List LJJIJIIJI = C47261Igj.LJJIJIIJI(address.LIZLLL("phone"), address.LIZLLL("alternate_phone"));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : LJJIJIIJI) {
                    if (C78685UuP.LJJJZ((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                c26610AcQ.setPhoneList(arrayList);
                String LIZLLL2 = address.LIZLLL("email");
                if (LIZLLL2 == null) {
                    LIZLLL2 = "";
                }
                c26610AcQ.setEmailText(LIZLLL2);
                c26610AcQ.setAddressDetailText(address.LIZ());
                c26610AcQ.setRegionText(Address.LIZIZ(address, false, 3));
                String LIZLLL3 = address.LIZLLL("zipcode");
                if (LIZLLL3 != null) {
                    str2 = LIZLLL3;
                }
                c26610AcQ.setZipcodeText(str2);
                c26610AcQ.setDefault(address.LJ());
                if (L().LJLLILLLL) {
                    c26610AcQ.setUnavailable(!c26610AcQ.getReachable());
                }
                if (L().Nv0() || L().LJLLILLLL) {
                    if (L().Nv0()) {
                        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, address, 59), c26610AcQ);
                    }
                    if (L().LJLLILLLL) {
                        C16880lQ.LJIIJ(new Au2S10S0300000_4(address, this, c26610AcQ, 23), c26610AcQ);
                    }
                } else {
                    if (c26610AcQ.getReachable()) {
                        if (L().Ov0()) {
                            C16880lQ.LJIIJ(new Au2S10S0300000_4(address, this, c26610AcQ, 24), c26610AcQ);
                        } else {
                            C16880lQ.LJIIJ(new Au2S10S0300000_4(address, this, c26610AcQ, 25), c26610AcQ);
                        }
                        View edit = c26610AcQ._$_findCachedViewById(R.id.cn7);
                        o.LJIIIIZZ(edit, "edit");
                        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, address, 60), edit);
                    }
                    View edit2 = c26610AcQ._$_findCachedViewById(R.id.cn7);
                    o.LJIIIIZZ(edit2, "edit");
                    C16880lQ.LJIIJ(new Au2S14S0200000_4(this, address, 61), edit2);
                }
                this.itemView.post(new ARunnableS8S0400000_4(this, address, item, c26610AcQ, 1));
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AddressViewHolder(android.view.ViewGroup r5, int r6) {
            /*
                r4 = this;
                java.lang.String r0 = "parent"
                java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r5, r0)
                r4.LJLJI = r0
                X.AcQ r3 = new X.AcQ
                android.content.Context r2 = r5.getContext()
                java.lang.String r0 = "parent.context"
                kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
                r1 = 0
                r0 = 0
                r3.<init>(r2, r0, r1)
                r4.<init>(r3)
                r4.LJLIL = r6
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel.class
                X.Prg r2 = X.C65352Pkq.LIZ(r0)
                kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
                r0 = 15
                r1.<init>(r4, r2, r2, r0)
                X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
                r4.LJLILLLLZI = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter.AddressViewHolder.<init>(android.view.ViewGroup, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void M(String str, boolean z) {
            PageNodeMonitorService.LJIIIZ().LJIIIIZZ("shipping_address");
            if (L().LJLLILLLL) {
                View view = this.itemView;
                C78946Uyc.LJJIIJ(view, OUR.LIZLLL(view, "itemView"), new AqS47S0110000_4(this, z, 2));
                return;
            }
            int i = this.latestItemPositionInternal - 1;
            Boolean bool = ((ReachableAddress) getItem()).addressValid;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C26615AcV.LIZ);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "shipping_info");
            linkedHashMap.put("module_name", "address");
            if (bool != null) {
                bool.booleanValue();
                linkedHashMap.put("is_valid", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            linkedHashMap.put("is_default", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("rank", Integer.valueOf(i));
            linkedHashMap.put("click_area", str);
            C76542zS.LIZ("tiktokec_module_click", linkedHashMap);
        }
    }

    /* loaded from: classes5.dex */
    public static final class AddAddressBarHolder extends ECJediViewHolder {
        public final int LJLIL;
        public final C62822Ol8 LJLILLLLZI;
        public boolean LJLJI;
        public final Map<Integer, View> LJLJJI;

        @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
        public final void _$_clearFindViewByIdCache() {
            ((LinkedHashMap) this.LJLJJI).clear();
        }

        @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

        @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            super.onCreate();
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78897Uxp.LJJJJJL(itemView, 0.0f);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final void onBind(Object item) {
            boolean z;
            o.LJIIIZ(item, "item");
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            if (this.latestItemPositionInternal != this.LJLIL - 1) {
                z = true;
            } else {
                z = false;
            }
            C26508Aam.LIZ(itemView, z);
            if (!this.LJLJI) {
                this.LJLJI = true;
                View itemView2 = this.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(itemView2);
                if (LJIILIIL != null) {
                    C78946Uyc.LJJII(LJIILIIL, new C70918RsQ(0), C26619AcZ.LJLIL);
                }
            }
            View itemView3 = this.itemView;
            o.LJIIIIZZ(itemView3, "itemView");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 121, 42), itemView3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddAddressBarHolder(ViewGroup viewGroup, int i) {
            super(C1FL.LIZIZ(viewGroup, R.layout.wr, viewGroup, false, "from(parent.context).inf…_add_item, parent, false)"));
            this.LJLJJI = C44878HjO.LIZIZ(viewGroup, "parent");
            this.LJLIL = i;
            C65776Prg LIZ = C65352Pkq.LIZ(AddressListViewModel.class);
            this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 14));
        }
    }

    @Override // X.AbstractC26779Af9
    public final IComponentStrategyService<?> LLD() {
        return new DefaultAddressListStrategyService();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressAdapter(LifecycleOwner parent) {
        super(parent, new C26587Ac3(), "shipping_info", null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = parent;
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLJJL.LIZIZ(i);
    }
}
