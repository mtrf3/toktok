package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.response.District;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a9L, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92351a9L extends C92219a7D {
    public final List<EnumC91763Zzr> LJIIZILJ;
    public final boolean LJIJ;
    public final java.util.Map<EnumC91763Zzr, InterfaceC35811ar<List<District>>> LJIJI;
    public final java.util.Map<EnumC91763Zzr, InterfaceC88472Yns<List<District>, C76800UCe>> LJIJJ;
    public final java.util.Map<EnumC91763Zzr, InterfaceC35811ar<C91941a2j>> LJIJJLI;
    public final java.util.Map<EnumC91763Zzr, InterfaceC65784Pro<C76800UCe>> LJIL;
    public final java.util.Map<EnumC91763Zzr, InterfaceC65784Pro<C76800UCe>> LJJ;
    public final InterfaceC65784Pro<C76800UCe> LJJI;
    public final List<Elements> LJJIFFI;

    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final List<PaymentElements> LIZIZ() {
        EnumC91763Zzr enumC91763Zzr;
        EnumC91763Zzr enumC91763Zzr2;
        EnumC91763Zzr enumC91763Zzr3;
        List<District> value;
        Object obj;
        List<District> value2;
        Object obj2;
        List<District> value3;
        Object obj3;
        String code;
        String name;
        String name2;
        List<District> value4;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        Iterator<EnumC91763Zzr> it = this.LJIIZILJ.iterator();
        while (true) {
            if (it.hasNext()) {
                enumC91763Zzr = it.next();
                if (enumC91763Zzr == EnumC91763Zzr.CountryRegion) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    break;
                }
            } else {
                enumC91763Zzr = null;
                break;
            }
        }
        Iterator<EnumC91763Zzr> it2 = this.LJIIZILJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                enumC91763Zzr2 = it2.next();
                if (enumC91763Zzr2 == EnumC91763Zzr.State) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
            } else {
                enumC91763Zzr2 = null;
                break;
            }
        }
        Iterator<EnumC91763Zzr> it3 = this.LJIIZILJ.iterator();
        while (true) {
            if (it3.hasNext()) {
                enumC91763Zzr3 = it3.next();
                if (enumC91763Zzr3 == EnumC91763Zzr.City) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else {
                enumC91763Zzr3 = null;
                break;
            }
        }
        InterfaceC35811ar<List<District>> interfaceC35811ar = this.LJIJI.get(enumC91763Zzr);
        if (interfaceC35811ar == null || (value = interfaceC35811ar.getValue()) == null) {
            obj = null;
        } else {
            obj = (District) ORZ.LJLLJ(value);
        }
        InterfaceC35811ar<List<District>> interfaceC35811ar2 = this.LJIJI.get(enumC91763Zzr2);
        if (interfaceC35811ar2 == null || (value2 = interfaceC35811ar2.getValue()) == null) {
            obj2 = null;
        } else {
            obj2 = (District) ORZ.LJLLJ(value2);
        }
        InterfaceC35811ar<List<District>> interfaceC35811ar3 = this.LJIJI.get(enumC91763Zzr3);
        if (interfaceC35811ar3 == null || (value3 = interfaceC35811ar3.getValue()) == null) {
            obj3 = null;
        } else {
            obj3 = (District) ORZ.LJLLJ(value3);
        }
        if (this.LJIJ) {
            InterfaceC35811ar<List<District>> interfaceC35811ar4 = this.LJIJI.get(enumC91763Zzr);
            if (interfaceC35811ar4 == null) {
                value4 = null;
            } else {
                value4 = interfaceC35811ar4.getValue();
            }
            if (value4 != null) {
                try {
                    obj = ListProtector.get(value4, 0);
                    obj2 = ListProtector.get(value4, 1);
                    obj3 = ListProtector.get(value4, 2);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println((Object) o.LJIILLIIL(e, "fail to get address info: "));
                }
            }
        }
        List<Elements> list = this.LJJIFFI;
        if (list != null) {
            Iterator<Elements> it4 = list.iterator();
            while (it4.hasNext()) {
                String paramName = it4.next().getParamName();
                EnumC91966a38 enumC91966a38 = EnumC91966a38.BillingCountryRegion;
                if (o.LJ(paramName, enumC91966a38.getType())) {
                    String type = EnumC91957a2z.AddressCountryRegion.getType();
                    String type2 = enumC91966a38.getType();
                    District district = (District) obj;
                    if (district == null) {
                        code = null;
                    } else {
                        code = district.getCode();
                    }
                    arrayList.add(new PaymentElements(type, type2, code));
                } else {
                    EnumC91966a38 enumC91966a382 = EnumC91966a38.BillingState;
                    if (o.LJ(paramName, enumC91966a382.getType())) {
                        String type3 = EnumC91957a2z.AddressState.getType();
                        String type4 = enumC91966a382.getType();
                        District district2 = (District) obj2;
                        if (district2 == null) {
                            name = null;
                        } else {
                            name = district2.getName();
                        }
                        arrayList.add(new PaymentElements(type3, type4, name));
                    } else {
                        EnumC91966a38 enumC91966a383 = EnumC91966a38.BillingCity;
                        if (o.LJ(paramName, enumC91966a383.getType())) {
                            String type5 = EnumC91957a2z.AddressCity.getType();
                            String type6 = enumC91966a383.getType();
                            District district3 = (District) obj3;
                            if (district3 == null) {
                                name2 = null;
                            } else {
                                name2 = district3.getName();
                            }
                            arrayList.add(new PaymentElements(type5, type6, name2));
                        }
                    }
                }
            }
        }
        return ORZ.LLJI(arrayList);
    }

    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final InterfaceC24760y8<C91941a2j> LIZLLL() {
        return C78966Uyw.LJIJI(new IDqS422S0100000_31(this, 67));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r4 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C91941a2j LJIILJJIL(X.EnumC91763Zzr r11) {
        /*
            r10 = this;
            java.util.List<? extends X.a2o<java.lang.String>> r1 = r10.LJ
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L11:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L4c
            java.lang.Object r1 = r3.next()
            X.a2o r1 = (X.InterfaceC91946a2o) r1
            java.util.Map<X.Zzr, X.1ar<java.util.List<com.bytedance.pipo.checkout.api.network.model.response.District>>> r0 = r10.LJIJI
            java.lang.Object r0 = r0.get(r11)
            X.1ar r0 = (X.InterfaceC35811ar) r0
            if (r0 != 0) goto L43
        L28:
            X.OQg r4 = X.C61878OQg.INSTANCE
        L2a:
            java.lang.String r0 = "districts"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r5 = "-"
            r6 = 0
            X.aDy r8 = X.C92638aDy.LJLIL
            r9 = 30
            r7 = r6
            java.lang.String r0 = X.ORZ.LLD(r4, r5, r6, r7, r8, r9)
            X.a7H r0 = r1.LIZ(r0)
            r2.add(r0)
            goto L11
        L43:
            java.lang.Object r4 = r0.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            if (r4 != 0) goto L2a
            goto L28
        L4c:
            boolean r0 = r2.isEmpty()
            r3 = 0
            if (r0 == 0) goto L8d
        L53:
            r6 = 1
        L54:
            java.util.Iterator r5 = r2.iterator()
        L58:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r2 = r5.next()
            r1 = r2
            X.a7H r1 = (X.C92223a7H) r1
            boolean r0 = r1.LJLIL
            if (r0 != 0) goto L58
            java.lang.String r0 = r1.LJLJI
            int r0 = r0.length()
            if (r0 <= 0) goto L58
            r4 = r2
        L72:
            X.a7H r4 = (X.C92223a7H) r4
            java.lang.String r2 = ""
            if (r4 != 0) goto L81
        L78:
            r1 = r2
            if (r4 != 0) goto L86
        L7b:
            X.a2j r0 = new X.a2j
            r0.<init>(r6, r3, r1, r2)
            return r0
        L81:
            java.lang.String r1 = r4.LJLILLLLZI
            if (r1 != 0) goto L86
            goto L78
        L86:
            java.lang.String r0 = r4.LJLJI
            if (r0 != 0) goto L8b
            goto L7b
        L8b:
            r2 = r0
            goto L7b
        L8d:
            java.util.Iterator r1 = r2.iterator()
        L91:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r1.next()
            X.a7H r0 = (X.C92223a7H) r0
            boolean r0 = r0.LJLIL
            if (r0 != 0) goto L91
            r6 = 0
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92351a9L.LJIILJJIL(X.Zzr):X.a2j");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92351a9L(C92083a51 apiService, Elements elements, String str, String str2, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        super(elements, null, true, null, interfaceC88472Yns, null, null, 438);
        boolean z;
        AbstractC91767Zzv abstractC91767Zzv;
        o.LJIIIZ(apiService, "apiService");
        this.LJIIZILJ = new ArrayList();
        this.LJJI = new IDqS422S0100000_31(this, 68);
        List<Elements> subElementList = elements.getSubElementList();
        this.LJJIFFI = subElementList;
        if (subElementList != null) {
            Iterator<Elements> it = subElementList.iterator();
            while (it.hasNext()) {
                String paramName = it.next().getParamName();
                if (o.LJ(paramName, EnumC91966a38.BillingCountryRegion.getType())) {
                    ((ArrayList) this.LJIIZILJ).add(EnumC91763Zzr.CountryRegion);
                } else if (o.LJ(paramName, EnumC91966a38.BillingState.getType())) {
                    ((ArrayList) this.LJIIZILJ).add(EnumC91763Zzr.State);
                } else if (o.LJ(paramName, EnumC91966a38.BillingCity.getType())) {
                    ((ArrayList) this.LJIIZILJ).add(EnumC91763Zzr.City);
                }
            }
        }
        if (((ArrayList) this.LJIIZILJ).isEmpty()) {
            ((ArrayList) this.LJIIZILJ).add(EnumC91763Zzr.CountryRegion);
        }
        if (((ArrayList) this.LJIIZILJ).size() == EnumC91763Zzr.values().length) {
            z = true;
        } else {
            z = false;
        }
        this.LJIJ = z;
        if (z) {
            this.LJIJI = C51029K0z.LJJIIZI(new OSZ(ORZ.LJLLJ(this.LJIIZILJ), C78966Uyw.LJJJIL(C61878OQg.INSTANCE)));
            this.LJIJJLI = C51029K0z.LJJIIZI(new OSZ(ORZ.LJLLJ(this.LJIIZILJ), C78966Uyw.LJJJIL(new C91941a2j(null, false, 15))));
            this.LJIJJ = C51029K0z.LJJIIZI(new OSZ(ORZ.LJLLJ(this.LJIIZILJ), new IDqS418S0100000_31(this, 42)));
            this.LJIL = C51029K0z.LJJIIZI(new OSZ(ORZ.LJLLJ(this.LJIIZILJ), this.LJJI));
            this.LJJ = C51029K0z.LJJIIZI(new OSZ(ORZ.LJLLJ(this.LJIIZILJ), new IDqS422S0100000_31(this, 66)));
        } else {
            List<EnumC91763Zzr> list = this.LJIIZILJ;
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(it2.next(), C78966Uyw.LJJJIL(C61878OQg.INSTANCE));
            }
            this.LJIJI = linkedHashMap;
            List<EnumC91763Zzr> list2 = this.LJIIZILJ;
            int LJJIIZ2 = C51029K0z.LJJIIZ(C32I.LJJL(list2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(LJJIIZ2 < 16 ? 16 : LJJIIZ2);
            Iterator it3 = ((ArrayList) list2).iterator();
            while (it3.hasNext()) {
                linkedHashMap2.put(it3.next(), C78966Uyw.LJJJIL(new C91941a2j(null, false, 15)));
            }
            this.LJIJJLI = linkedHashMap2;
            List<EnumC91763Zzr> list3 = this.LJIIZILJ;
            int LJJIIZ3 = C51029K0z.LJJIIZ(C32I.LJJL(list3, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(LJJIIZ3 < 16 ? 16 : LJJIIZ3);
            Iterator it4 = ((ArrayList) list3).iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                linkedHashMap3.put(next, new IDqS174S0200000_31(this, (EnumC91763Zzr) next, 10));
            }
            this.LJIJJ = linkedHashMap3;
            List<EnumC91763Zzr> list4 = this.LJIIZILJ;
            int LJJIIZ4 = C51029K0z.LJJIIZ(C32I.LJJL(list4, 10));
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(LJJIIZ4 < 16 ? 16 : LJJIIZ4);
            Iterator it5 = ((ArrayList) list4).iterator();
            while (it5.hasNext()) {
                linkedHashMap4.put(it5.next(), this.LJJI);
            }
            List<EnumC91763Zzr> list5 = this.LJIIZILJ;
            int LJJIIZ5 = C51029K0z.LJJIIZ(C32I.LJJL(list5, 10));
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(LJJIIZ5 >= 16 ? LJJIIZ5 : 16);
            Iterator it6 = ((ArrayList) list5).iterator();
            while (it6.hasNext()) {
                Object next2 = it6.next();
                linkedHashMap5.put(next2, new IDqS178S0200000_31(this, (EnumC91763Zzr) next2, 3));
            }
        }
        if (this.LJIJ) {
            abstractC91767Zzv = C92160a6G.LIZ;
        } else {
            abstractC91767Zzv = C92161a6H.LIZ;
        }
        List<EnumC91763Zzr> list6 = this.LJIIZILJ;
        new C92159a6F(apiService, abstractC91767Zzv, list6, (EnumC91763Zzr) ORZ.LJLLJ(list6), str, str2, this.LJIJJ);
    }
}
