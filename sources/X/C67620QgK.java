package X;

import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.QgK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67620QgK<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ AbstractViewOnClickListenerC67619QgJ LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C67620QgK(AbstractViewOnClickListenerC67619QgJ abstractViewOnClickListenerC67619QgJ, String str) {
        this.LJLIL = abstractViewOnClickListenerC67619QgJ;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        String str;
        o.LJIIIZ(it, "it");
        List<InterfaceC37286EkE> LJIIL = this.LJLIL.LJIIL();
        String str2 = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC37286EkE interfaceC37286EkE : LJIIL) {
            InterfaceC37286EkE interfaceC37286EkE2 = interfaceC37286EkE;
            boolean LJ = o.LJ(str2, interfaceC37286EkE2.LJ());
            if ((C23930wn.LIZ() && o.LJ(str2, "CACHE") && o.LJ(interfaceC37286EkE2.LJ(), "GECKO")) || LJ) {
                arrayList.add(interfaceC37286EkE);
            }
        }
        String str3 = this.LJLILLLLZI;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC37286EkE interfaceC37286EkE3 = (InterfaceC37286EkE) it2.next();
            long LIZIZ = interfaceC37286EkE3.LIZIZ();
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("module: ", str3, ", name = ");
            LIZIZ2.append(C16880lQ.LJLLJ(interfaceC37286EkE3.getClass()));
            LIZIZ2.append(", size = ");
            LIZIZ2.append(LIZIZ / 1048576.0d);
            LIZIZ2.append("M, workspace: ");
            File LIZLLL = interfaceC37286EkE3.LIZLLL();
            if (LIZLLL != null) {
                str = LIZLLL.getAbsolutePath();
            } else {
                str = null;
            }
            LIZIZ2.append(str);
            C36922EeM.LIZLLL(2, "disk-manager", X1D.LIZIZ(LIZIZ2));
            arrayList2.add(Long.valueOf(LIZIZ));
        }
        long LLILLJJLI = ORZ.LLILLJJLI(arrayList2);
        String str4 = this.LJLILLLLZI;
        int hashCode = str4.hashCode();
        if (hashCode != 63879010) {
            if (hashCode != 67692361) {
                if (hashCode == 441562126 && str4.equals("RESOURCE")) {
                    this.LJLIL.LJLLL = LLILLJJLI;
                }
            } else if (str4.equals("GECKO")) {
                this.LJLIL.LJLLLL = LLILLJJLI;
            }
        } else if (str4.equals("CACHE")) {
            this.LJLIL.LJLLJ = LLILLJJLI;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", this.LJLILLLLZI);
        jSONObject.put("size", LLILLJJLI);
        FUA.LIZJ("disk_manager_module_size", jSONObject);
        AbstractViewOnClickListenerC67619QgJ abstractViewOnClickListenerC67619QgJ = this.LJLIL;
        String str5 = this.LJLILLLLZI;
        double d = LLILLJJLI;
        abstractViewOnClickListenerC67619QgJ.getClass();
        int hashCode2 = str5.hashCode();
        if (hashCode2 != 65307009) {
            if (hashCode2 != 67692361) {
                if (hashCode2 == 441562126 && str5.equals("RESOURCE")) {
                    double d2 = d / 1073741824;
                    if (d2 > 1.0d) {
                        Integer num = abstractViewOnClickListenerC67619QgJ.LJLL;
                        o.LJI(num);
                        return abstractViewOnClickListenerC67619QgJ.LJIILIIL(num.intValue(), Double.valueOf(d2));
                    }
                    Integer num2 = abstractViewOnClickListenerC67619QgJ.LJLJLLL;
                    o.LJI(num2);
                    return abstractViewOnClickListenerC67619QgJ.LJIILIIL(num2.intValue(), Double.valueOf(d / 1048576));
                }
            } else if (str5.equals("GECKO")) {
                double d3 = d / 1073741824;
                if (d3 > 1.0d) {
                    return abstractViewOnClickListenerC67619QgJ.LJIILIIL(R.string.r1p, Double.valueOf(d3));
                }
                return abstractViewOnClickListenerC67619QgJ.LJIILIIL(R.string.cfn, Double.valueOf(d / 1048576));
            }
        } else if (str5.equals("DRAFT")) {
            double d4 = d / 1073741824;
            if (d4 > 1.0d) {
                return abstractViewOnClickListenerC67619QgJ.LJIILIIL(R.string.qx_, Double.valueOf(d4));
            }
            return abstractViewOnClickListenerC67619QgJ.LJIILIIL(R.string.qx9, Double.valueOf(d / 1048576));
        }
        double d5 = d / 1048576;
        if (d5 < 30.0d) {
            Integer num3 = abstractViewOnClickListenerC67619QgJ.LJLJL;
            o.LJI(num3);
            return abstractViewOnClickListenerC67619QgJ.LJIILIIL(num3.intValue(), Float.valueOf(0.0f));
        }
        Integer num4 = abstractViewOnClickListenerC67619QgJ.LJLJL;
        o.LJI(num4);
        return abstractViewOnClickListenerC67619QgJ.LJIILIIL(num4.intValue(), Double.valueOf(d5));
    }
}
