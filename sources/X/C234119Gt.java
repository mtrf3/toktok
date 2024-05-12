package X;

import Y.IDComparatorS32S0000000_4;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS8S1201000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9Gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234119Gt extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ HeaderBaseContainerComponent LJLIL;
    public final /* synthetic */ List<ProfileComponents> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C234119Gt(HeaderBaseContainerComponent headerBaseContainerComponent, List<ProfileComponents> list) {
        super(1);
        this.LJLIL = headerBaseContainerComponent;
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assemble) {
        int i;
        Integer num;
        int intValue;
        Integer num2;
        Integer num3;
        o.LJIIIZ(assemble, "$this$assemble");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.LJLIL.LJLJJI);
        List<ProfileComponents> list = this.LJLILLLLZI;
        HeaderBaseContainerComponent headerBaseContainerComponent = this.LJLIL;
        Iterator it = linkedHashSet.iterator();
        while (true) {
            i = -1;
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (list != null) {
                Iterator<ProfileComponents> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (o.LJ(it2.next().componentName, str)) {
                        z = true;
                    }
                }
            }
            C234109Gs C3 = headerBaseContainerComponent.C3(str);
            if (C3 != null && !z && ((num3 = C3.LIZLLL) == null || num3.intValue() < 0)) {
                headerBaseContainerComponent.P3(str, C3.LIZIZ);
            }
        }
        List<ProfileComponents> list2 = this.LJLILLLLZI;
        if (list2 == null) {
            HeaderBaseContainerComponent headerBaseContainerComponent2 = this.LJLIL;
            headerBaseContainerComponent2.LJLILLLLZI = C113554cx.LJJLIL(C113554cx.LJJLIIIJLJLI(ORZ.LLILII(new IDComparatorS32S0000000_4(17), C5UN.LJJLJLI(headerBaseContainerComponent2.LJLILLLLZI))));
            Collection<C234109Gs> values = this.LJLIL.LJLILLLLZI.values();
            HeaderBaseContainerComponent headerBaseContainerComponent3 = this.LJLIL;
            int i2 = 0;
            for (C234109Gs c234109Gs : values) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C234109Gs c234109Gs2 = c234109Gs;
                    String str2 = c234109Gs2.LIZ;
                    if (str2.length() != 0 && (num2 = c234109Gs2.LIZLLL) != null && num2.intValue() >= 0) {
                        ProfileComponents profileComponents = new ProfileComponents();
                        headerBaseContainerComponent3.getClass();
                        C8VV.LIZJ(headerBaseContainerComponent3, new C234099Gr(headerBaseContainerComponent3, str2, str2, c234109Gs2, i2, profileComponents));
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            HeaderBaseContainerComponent headerBaseContainerComponent4 = this.LJLIL;
            int i4 = 0;
            for (ProfileComponents profileComponents2 : list2) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    String str3 = profileComponents2.componentName;
                    if (str3 != null) {
                        headerBaseContainerComponent4.LJLJJL.put(str3, Integer.valueOf(i4));
                    }
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            List<ProfileComponents> list3 = this.LJLILLLLZI;
            HeaderBaseContainerComponent headerBaseContainerComponent5 = this.LJLIL;
            int i6 = 0;
            for (ProfileComponents profileComponents3 : list3) {
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    ProfileComponents profileComponents4 = profileComponents3;
                    String str4 = profileComponents4.componentId;
                    if (str4 != null) {
                        java.util.Map<String, C234109Gs> LJJLIL = C113554cx.LJJLIL(C113554cx.LJJLIIIJLJLI(ORZ.LLILII(new IDComparatorS32S0000000_4(18), C5UN.LJJLJLI(headerBaseContainerComponent5.LJLILLLLZI))));
                        headerBaseContainerComponent5.LJLILLLLZI = LJJLIL;
                        for (String componentId : ((LinkedHashMap) LJJLIL).keySet()) {
                            o.LJIIIZ(componentId, "componentId");
                            if (!((ArrayList) headerBaseContainerComponent5.LJLJI).contains(componentId)) {
                                Iterator<ProfileComponents> it3 = list3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (o.LJ(componentId, it3.next().componentId)) {
                                            break;
                                        }
                                    } else {
                                        C234109Gs c234109Gs3 = headerBaseContainerComponent5.LJLILLLLZI.get(componentId);
                                        if (c234109Gs3 != null && (num = c234109Gs3.LIZLLL) != null && (intValue = num.intValue()) != i && i6 >= intValue) {
                                            C8VV.LIZJ(headerBaseContainerComponent5, new AqS8S1201000_4(headerBaseContainerComponent5, componentId, intValue, c234109Gs3, 4));
                                        }
                                    }
                                }
                            }
                            i = -1;
                        }
                        C234109Gs C32 = headerBaseContainerComponent5.C3(str4);
                        if (C32 != null) {
                            int size = ((ArrayList) headerBaseContainerComponent5.LJLJI).size() + i6;
                            String str5 = profileComponents4.componentName;
                            if (str5 == null) {
                                str5 = "";
                            }
                            C8VV.LIZJ(headerBaseContainerComponent5, new C234099Gr(headerBaseContainerComponent5, str4, str5, C32, size, profileComponents4));
                        }
                    }
                    i6 = i7;
                    i = -1;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
