package com.bytedance.pipo.checkout.element.component.business.address;

import X.AbstractC91767Zzv;
import X.C162476Zf;
import X.C32541Pm;
import X.C32I;
import X.C40689Fy1;
import X.C41311jj;
import X.C44001o4;
import X.C47261Igj;
import X.C51029K0z;
import X.C76800UCe;
import X.C78966Uyw;
import X.C92083a51;
import X.C92160a6G;
import X.C92161a6H;
import X.C93055aKh;
import X.EnumC91763Zzr;
import X.EnumC91766Zzu;
import X.InterfaceC35811ar;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.X1D;
import X.XKQ;
import X.XKW;
import X.XKX;
import Y.IDComparatorS44S0000000_31;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.pipo.checkout.api.network.model.response.District;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class AddressViewModel extends LinearStateViewModel<EnumC91763Zzr, List<? extends District>> {
    public final C92083a51 LJLIL;
    public final AbstractC91767Zzv LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final List<EnumC91763Zzr> LJLJJL;
    public final XKW LJLJJLL;
    public final Map<EnumC91763Zzr, InterfaceC88472Yns<List<District>, C76800UCe>> LJLJL;
    public final Map<EnumC91763Zzr, List<District>> LJLJLJ;
    public final ParcelableSnapshotMutableState LJLJLLL;
    public final C32541Pm LJLL;
    public final Map<String, List<District>> LJLLI;
    public final ParcelableSnapshotMutableState LJLLILLLL;
    public final ParcelableSnapshotMutableState LJLLJ;
    public final ParcelableSnapshotMutableState LJLLL;
    public final C41311jj<EnumC91763Zzr, District> LJLLLL;
    public final Map<EnumC91763Zzr, Boolean> LJLLLLLL;
    public final Map<EnumC91763Zzr, InterfaceC35811ar<Integer>> LJLZ;
    public final ParcelableSnapshotMutableState LJZ;
    public final Map<EnumC91763Zzr, InterfaceC35811ar<Boolean>> LJZI;
    public XKQ LJZL;
    public final List<String> LL;
    public final boolean LLD;

    public AddressViewModel() {
        throw null;
    }

    public final List<District> nv0() {
        List<District> list = (List) ((LinkedHashMap) this.LJLJLJ).get(this.LJLJLLL.getValue());
        if (list == null) {
            List<District> emptyList = Collections.emptyList();
            o.LJIIIIZZ(emptyList, "emptyList()");
            return emptyList;
        }
        return list;
    }

    public final C44001o4 tv0() {
        return C78966Uyw.LJIJI(new IDqS422S0100000_31(this, 7));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        XKQ xkq = this.LJZL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJZL = null;
    }

    public final void ov0() {
        String upperCase;
        if (nv0().isEmpty()) {
            return;
        }
        if (this.LLD) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.LJLLILLLL;
            List LLILII = ORZ.LLILII(new IDComparatorS44S0000000_31(1), nv0());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : LLILII) {
                String name = ((District) obj).getName();
                if (name == null) {
                    upperCase = "";
                } else {
                    String valueOf = String.valueOf(C40689Fy1.LLFII(name));
                    o.LJII(valueOf, "null cannot be cast to non-null type java.lang.String");
                    upperCase = valueOf.toUpperCase(Locale.ROOT);
                    o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
                Object obj2 = linkedHashMap.get(upperCase);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(upperCase, obj2);
                }
                ((List) obj2).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((CharSequence) entry.getKey()).length() > 0) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            parcelableSnapshotMutableState.setValue(linkedHashMap2);
            this.LJLLL.setValue(ORZ.LLJI(((Map) this.LJLLILLLL.getValue()).keySet()));
        } else {
            this.LJLLILLLL.setValue(C51029K0z.LJJIIZI(new OSZ("", nv0())));
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.LJLLL;
            List emptyList = Collections.emptyList();
            o.LJIIIIZZ(emptyList, "emptyList()");
            parcelableSnapshotMutableState2.setValue(emptyList);
        }
        this.LJLLJ.setValue(EnumC91766Zzu.Showing);
    }

    @Override // com.bytedance.pipo.checkout.element.component.business.address.LinearStateViewModel
    public final ParcelableSnapshotMutableState gv0() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.pipo.checkout.element.component.business.address.LinearStateViewModel
    public final Map<EnumC91763Zzr, List<? extends District>> hv0() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.pipo.checkout.element.component.business.address.LinearStateViewModel
    public final List<EnumC91763Zzr> iv0() {
        return this.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    public final void uv0(InterfaceC88472Yns<? super List<District>, C76800UCe> interfaceC88472Yns) {
        ?? arrayList;
        AbstractC91767Zzv abstractC91767Zzv = this.LJLILLLLZI;
        if (abstractC91767Zzv instanceof C92161a6H) {
            arrayList = C47261Igj.LJJIJ(this.LJLLLL.get(this.LJLJLLL.getValue()));
        } else if (abstractC91767Zzv instanceof C92160a6G) {
            List LLILII = ORZ.LLILII(new IDComparatorS44S0000000_31(0), this.LJLLLL.LJLILLLLZI);
            arrayList = new ArrayList(C32I.LJJL(LLILII, 10));
            Iterator it = LLILII.iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getValue());
            }
        } else {
            throw new C162476Zf();
        }
        interfaceC88472Yns.invoke(arrayList);
        this.LJLLLLLL.put(this.LJLJLLL.getValue(), Boolean.TRUE);
        if (this.LJLILLLLZI instanceof C92161a6H) {
            XKQ xkq = this.LJZL;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LJZL = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), this.LJLJJLL, null, new C93055aKh(this, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vv0(com.bytedance.pipo.checkout.api.network.model.response.District r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C92521aC5
            if (r0 == 0) goto L7c
            r6 = r9
            X.aC5 r6 = (X.C92521aC5) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r5 = r6.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r3 = 1
            if (r0 == 0) goto L61
            if (r0 != r3) goto L82
            java.lang.Object r2 = r6.LJLIL
            com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel r2 = (com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel) r2
            X.C141335gf.LIZJ(r5)
        L24:
            X.1o4 r0 = r2.tv0()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L37
        L34:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L37:
            java.util.List<X.Zzr> r1 = r2.LJLJJL
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r2.LJLJLLL
            java.lang.Object r0 = r0.getValue()
            int r0 = r1.indexOf(r0)
            int r0 = r0 + 1
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            if (r1 == 0) goto L34
            java.util.Map<X.Zzr, java.util.List<com.bytedance.pipo.checkout.api.network.model.response.District>> r0 = r2.LJLJLJ
            r0.put(r1, r5)
            java.util.Map<X.Zzr, X.1ar<java.lang.Boolean>> r0 = r2.LJZI
            java.lang.Object r1 = r0.get(r1)
            X.1ar r1 = (X.InterfaceC35811ar) r1
            if (r1 != 0) goto L5b
            goto L34
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            goto L34
        L61:
            X.C141335gf.LIZJ(r5)
            java.lang.Integer r0 = r8.getGeonameId()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r7.LJLJI
            r6.LJLIL = r7
            r6.LJLJJI = r3
            r0 = 4
            java.lang.Object r5 = mv0(r7, r2, r1, r6, r0)
            if (r5 != r4) goto L7a
            return r4
        L7a:
            r2 = r7
            goto L24
        L7c:
            X.aC5 r6 = new X.aC5
            r6.<init>(r7, r9)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel.vv0(com.bytedance.pipo.checkout.api.network.model.response.District, X.2kd):java.lang.Object");
    }

    public static String pv0(String str, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("geonameid-");
        LIZ.append((Object) str);
        LIZ.append(",code-");
        LIZ.append((Object) str2);
        LIZ.append(",language-");
        LIZ.append((Object) str3);
        return X1D.LIZIZ(LIZ);
    }

    public static /* synthetic */ String qv0(AddressViewModel addressViewModel, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        addressViewModel.getClass();
        return pv0(null, null, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:34|35|36|38|39|41|42|(4:44|(2:49|(5:51|(2:53|54)(1:63)|(1:56)|57|(2:59|61)(1:62)))|64|(0))|65|(5:67|(1:69)|11|(0)|14)|15|16|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:24)|25|26|27|29|30|(2:32|33)(13:34|35|36|38|39|41|42|(4:44|(2:49|(5:51|(2:53|54)(1:63)|(1:56)|57|(2:59|61)(1:62)))|64|(0))|65|(5:67|(1:69)|11|(0)|14)|15|16|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:24|25|26|27|29|30|(2:32|33)(13:34|35|36|38|39|41|42|(4:44|(2:49|(5:51|(2:53|54)(1:63)|(1:56)|57|(2:59|61)(1:62)))|64|(0))|65|(5:67|(1:69)|11|(0)|14)|15|16|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0118, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x009a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[Catch: Exception -> 0x0116, TryCatch #6 {Exception -> 0x0116, blocks: (B:42:0x00cc, B:44:0x00d2, B:46:0x00d8, B:51:0x00e4, B:56:0x00f8, B:57:0x0101, B:59:0x010b, B:63:0x00f0), top: B:41:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4 A[Catch: Exception -> 0x0116, TryCatch #6 {Exception -> 0x0116, blocks: (B:42:0x00cc, B:44:0x00d2, B:46:0x00d8, B:51:0x00e4, B:56:0x00f8, B:57:0x0101, B:59:0x010b, B:63:0x00f0), top: B:41:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0126 -> B:15:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014d -> B:11:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.InterfaceC67352kd<? super java.util.List<com.bytedance.pipo.checkout.api.network.model.response.District>> r24) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel.lv0(java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object rv0(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C92520aC4
            if (r0 == 0) goto L3d
            r4 = r9
            X.aC4 r4 = (X.C92520aC4) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L43
            java.lang.Object r0 = r4.LJLIL
            com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel r0 = (com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel) r0
            X.C141335gf.LIZJ(r3)
        L24:
            r0.jv0(r3)
            r0.ov0()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2d:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r5
            r4.LJLJJI = r0
            java.lang.Object r3 = r5.lv0(r6, r7, r8, r4)
            if (r3 != r2) goto L3b
            return r2
        L3b:
            r0 = r5
            goto L24
        L3d:
            X.aC4 r4 = new X.aC4
            r4.<init>(r5, r9)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel.rv0(java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ Object mv0(AddressViewModel addressViewModel, String str, String str2, InterfaceC67352kd interfaceC67352kd, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return addressViewModel.lv0(str, str2, null, interfaceC67352kd);
    }

    public static /* synthetic */ Object sv0(AddressViewModel addressViewModel, String str, String str2, InterfaceC67352kd interfaceC67352kd, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return addressViewModel.rv0(null, str, str2, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e8, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ea, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddressViewModel(X.C92083a51 r9, X.AbstractC91767Zzv r10, java.lang.String r11, java.lang.String r12, java.util.List r13, X.EnumC91763Zzr r14, java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel.<init>(X.a51, X.Zzv, java.lang.String, java.lang.String, java.util.List, X.Zzr, java.util.Map):void");
    }
}
