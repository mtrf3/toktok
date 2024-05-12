package com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail;

import X.C117644jY;
import X.C27021Aj3;
import X.C27221AmH;
import X.C61878OQg;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ORZ;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS9S0010000_4;
import ujb.s;

/* loaded from: classes5.dex */
public class AddressEditDetailViewModel extends JediViewModel<AddressEditDetailState> {
    public CandInputData LJLJL;
    public Address LJLJLJ;
    public boolean LJLJLLL;
    public AddressPageStarter.AddressEditDetailEnterParams LJLL;
    public InputItemData LJLLILLLL;
    public boolean LJLLL;
    public String LJLLLL;
    public ClientConfig LJLZ;
    public Set<String> LJZL;
    public final boolean LJLJJLL = true;
    public List<C27021Aj3> LJLLI = C61878OQg.INSTANCE;
    public final long LJLLJ = -1;
    public final C117644jY<InterfaceC88472Yns<CandInputDataOptions, C76800UCe>> LJLLLLLL = new LinkedList<T>() { // from class: X.4jY
        public /* bridge */ int getSize() {
            return super.size();
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(T t) {
            if (t != null && (!isEmpty())) {
                clear();
            }
            return super.add(t);
        }

        @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final /* bridge */ T remove(int i) {
            return (T) removeAt(i);
        }

        public /* bridge */ Object removeAt(int i) {
            return super.remove(i);
        }
    };
    public final Map<String, C27221AmH> LJZ = new LinkedHashMap();
    public String LJZI = "Address should not contain emoji.";

    public final int Hv0() {
        String str;
        ArrayList arrayList;
        String str2;
        Address Iv0;
        List<AddressItem> list;
        String str3;
        Set<String> set = this.LJZL;
        if (set == null || set.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C27021Aj3 c27021Aj3 : this.LJLLI) {
                Integer num = c27021Aj3.LIZ.type;
                if (num == null || (num.intValue() != -100 && num.intValue() != -101)) {
                    if (c27021Aj3.LJI && (str = c27021Aj3.LIZ.key) != null) {
                        linkedHashSet.add(str);
                    }
                } else {
                    Object obj = c27021Aj3.LIZIZ;
                    if ((obj instanceof ArrayList) && (arrayList = (ArrayList) obj) != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C27021Aj3 c27021Aj32 = (C27021Aj3) it.next();
                            if (c27021Aj32.LJI && (str2 = c27021Aj32.LIZ.key) != null) {
                                linkedHashSet.add(str2);
                            }
                        }
                    }
                }
            }
            this.LJZL = linkedHashSet;
        }
        Set<String> set2 = this.LJZL;
        if (set2 != null && (Iv0 = Iv0(this.LJLLI)) != null && (list = Iv0.items) != null) {
            for (AddressItem addressItem : list) {
                if (ORZ.LJLJJI(addressItem.key, set2) && ((str3 = addressItem.value) == null || str3.length() == 0)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final AddressEditDetailState kv0() {
        return new AddressEditDetailState(0, null, null, false, null, 31, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJZL = null;
    }

    public final Address Iv0(List<C27021Aj3> list) {
        Address address;
        String str;
        AddressItem addressItem;
        Object obj;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator<C27021Aj3> it = list.iterator();
        while (true) {
            address = null;
            if (!it.hasNext()) {
                break;
            }
            C27021Aj3 next = it.next();
            String str4 = next.LIZ.key;
            if (str4 != null) {
                int hashCode = str4.hashCode();
                if (hashCode != -1768739439) {
                    if (hashCode != -1147692044) {
                        if (hashCode == 120381180 && str4.equals("address_detail")) {
                            obj = next.LIZIZ;
                            if ((obj instanceof String) && (str2 = (String) obj) != null) {
                                addressItem = new AddressItem(str4, s.LJZI(str2).toString());
                                arrayList.add(addressItem);
                            }
                        }
                    } else if (str4.equals("address")) {
                        Object obj2 = next.LIZIZ;
                        if (obj2 != null) {
                            if ((obj2 instanceof String) && (str3 = (String) obj2) != null) {
                                addressItem = new AddressItem(str4, s.LJZI(str3).toString());
                            }
                        } else {
                            addressItem = new AddressItem(str4, "");
                        }
                        arrayList.add(addressItem);
                    }
                } else if (str4.equals("unit_floor")) {
                    obj = next.LIZIZ;
                    if (obj instanceof String) {
                        addressItem = new AddressItem(str4, s.LJZI(str2).toString());
                        arrayList.add(addressItem);
                    }
                }
            }
            Object obj3 = next.LIZIZ;
            if ((obj3 instanceof String) && (str = (String) obj3) != null) {
                addressItem = new AddressItem(str4, s.LJZI(str).toString());
                arrayList.add(addressItem);
            }
        }
        Address address2 = this.LJLJLJ;
        if (address2 != null) {
            address = new Address(address2.id, arrayList, address2.region, address2.districts, address2.addressId);
        }
        this.LJLJLJ = address;
        return address;
    }

    public final void Jv0(boolean z) {
        setState(new AqS9S0010000_4(z, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C253009wO Kv0(X.C27021Aj3 r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel.Kv0(X.Aj3):X.9wO");
    }
}
