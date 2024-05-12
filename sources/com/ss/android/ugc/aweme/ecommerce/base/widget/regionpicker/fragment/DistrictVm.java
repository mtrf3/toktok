package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AbstractC029409q;
import X.AbstractC27419ApT;
import X.C27380Aoq;
import X.C27417ApR;
import X.C27570Aru;
import X.C47261Igj;
import X.ORZ;
import Y.ARunnableS5S0301000_4;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DistrictVm extends ViewModel {
    public OrderSKUDTO LJLJI;
    public C27417ApR LJLJJI;
    public final MutableLiveData<String> LJLJJLL;
    public C27380Aoq LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final MutableLiveData<String> LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public Integer LJLLLLLL;
    public Integer LJLZ;
    public String LJZ;
    public Integer LJZI;
    public boolean LJZL;
    public final List<District> LL;
    public final int LLD;
    public boolean LLF;
    public int LJLIL = Integer.MAX_VALUE;
    public final List<District> LJLILLLLZI = new ArrayList();
    public int LJLJJL = -1;

    public final C27417ApR gv0() {
        C27417ApR c27417ApR = this.LJLJJI;
        if (c27417ApR != null) {
            return c27417ApR;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public final C27380Aoq hv0() {
        C27380Aoq c27380Aoq = this.LJLJL;
        if (c27380Aoq != null) {
            return c27380Aoq;
        }
        o.LJIJI("logger");
        throw null;
    }

    public DistrictVm() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("");
        this.LJLJJLL = mutableLiveData;
        new ArrayList();
        this.LJLLILLLL = new MutableLiveData<>("");
        this.LJLLL = "shipping_address";
        this.LJLLLL = "shipping_info";
        this.LL = new ArrayList();
        this.LLD = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }

    public final void iv0(int i, String str) {
        String str2;
        List<District> list;
        District district;
        if (i < ((ArrayList) this.LJLILLLLZI).size()) {
            DistrictData districtData = ((District) ListProtector.get(this.LJLILLLLZI, i)).response;
            String str3 = null;
            if (districtData == null || (str2 = districtData.titleEn) == null || ujb.o.LJJJJJL(str2)) {
                return;
            }
            C27380Aoq hv0 = hv0();
            DistrictData districtData2 = ((District) ListProtector.get(this.LJLILLLLZI, i)).response;
            if (districtData2 != null && (list = districtData2.districts) != null && (district = (District) ORZ.LJLLLLLL(0, list)) != null) {
                str3 = district.districtKey;
            }
            hv0.LIZJ(str3, str, true);
        }
    }

    public final void jv0(FragmentManager manager, int i) {
        DistrictPage districtPage;
        View view;
        o.LJIIIZ(manager, "manager");
        int i2 = 0;
        if (i >= 0 && i < ((ArrayList) this.LJLILLLLZI).size()) {
            int i3 = -1;
            this.LJLJJL = -1;
            DistrictData districtData = ((District) ListProtector.get(this.LJLILLLLZI, i)).response;
            if (districtData != null) {
                String str = districtData.titleEn;
                if (str != null && !ujb.o.LJJJJJL(str)) {
                    hv0().LIZLLL = SystemClock.elapsedRealtime();
                }
                this.LJLJJLL.setValue(districtData.title);
                int i4 = i + 1;
                View view2 = null;
                if (((ArrayList) this.LJLILLLLZI).size() > i4) {
                    if (i >= 0 && i < manager.LJJJJLI().size()) {
                        View view3 = ((Fragment) ListProtector.get(manager.LJJJJLI(), i)).getView();
                        if (view3 != null) {
                            view = view3.findViewById(R.id.isf);
                        } else {
                            view = null;
                        }
                        AbstractC029409q adapter = ((RecyclerView) view).getAdapter();
                        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommercebase.view.Adapter<*>");
                        AbstractC27419ApT abstractC27419ApT = (AbstractC27419ApT) adapter;
                        int i5 = abstractC27419ApT.LJLJJI;
                        if (i5 < 0) {
                            String str2 = ((District) ListProtector.get(this.LJLILLLLZI, i4)).geoNameId;
                            List<District> list = districtData.districts;
                            o.LJI(list);
                            Iterator<District> it = list.iterator();
                            i5 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    if (o.LJ(it.next().geoNameId, str2)) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                } else {
                                    i5 = -1;
                                    break;
                                }
                            }
                        }
                        abstractC27419ApT.LJZ(i5);
                    } else {
                        return;
                    }
                }
                Fragment fragment = (Fragment) ListProtector.get(manager.LJJJJLI(), i);
                if (C47261Igj.LJJI(this.LL) >= i && ((ArrayList) this.LL).size() > 0) {
                    View view4 = fragment.getView();
                    if (view4 != null) {
                        view2 = view4.findViewById(R.id.isf);
                    }
                    RecyclerView recyclerView = (RecyclerView) view2;
                    AbstractC029409q adapter2 = recyclerView.getAdapter();
                    o.LJII(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommercebase.view.Adapter<*>");
                    AbstractC27419ApT abstractC27419ApT2 = (AbstractC27419ApT) adapter2;
                    List<District> list2 = districtData.districts;
                    if (list2 != null) {
                        Iterator<District> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (o.LJ(it2.next().geoNameId, ((District) ListProtector.get(this.LL, i)).geoNameId)) {
                                i3 = i2;
                                break;
                            }
                            i2++;
                        }
                    } else {
                        i3 = abstractC27419ApT2.LJLJJI;
                    }
                    if ((fragment instanceof DistrictPage) && (districtPage = (DistrictPage) fragment) != null) {
                        districtPage.vl(i3);
                    }
                    recyclerView.LJLI(i3);
                    recyclerView.post(new ARunnableS5S0301000_4(i, this, fragment, manager, 0));
                } else {
                    ((ArrayList) this.LL).clear();
                    o.LJIIIIZZ(fragment, "fragment");
                    C27570Aru.LJIIIIZZ(this.LLD, fragment);
                }
            }
            if (((ArrayList) this.LJLILLLLZI).size() >= 1 && ((ArrayList) this.LJLILLLLZI).size() >= i + 1) {
                gv0().LJZ(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(androidx.fragment.app.FragmentManager r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C27384Aou
            if (r0 == 0) goto L7c
            r5 = r10
            X.Aou r5 = (X.C27384Aou) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L82
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.util.List r0 = r9.LJJJJLI()
            int r7 = r0.size()
            X.1B3 r6 = new X.1B3
            r6.<init>(r9)
            r1 = 2130772036(0x7f010044, float:1.714718E38)
            r0 = 2130772037(0x7f010045, float:1.7147181E38)
            r6.LJIIJJI(r1, r0, r1, r0)
            com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage r2 = new com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage
            boolean r0 = r8.LJZL
            r2.<init>(r0)
            r1 = 0
            r0 = 2131367367(0x7f0a15c7, float:1.8354654E38)
            r6.LJIIIIZZ(r0, r3, r2, r1)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r6.LJ(r0)
            r6.LJI()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District> r0 = r8.LJLILLLLZI
            int r7 = r7 - r3
            java.lang.Object r2 = X.ORZ.LJLLLLLL(r7, r0)
            com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District r2 = (com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District) r2
            if (r2 == 0) goto L20
            r5.getClass()
            r5.getClass()
            r5.LJLJI = r3
            X.XKS r1 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r5)
            r1.<init>(r3, r0)
            r1.LJIIL()
            r2.continuation = r1
            java.lang.Object r0 = r1.LJIIJJI()
            if (r0 != r4) goto L20
            return r4
        L7c:
            X.Aou r5 = new X.Aou
            r5.<init>(r8, r10)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm.kv0(androidx.fragment.app.FragmentManager, X.2kd):java.lang.Object");
    }
}
