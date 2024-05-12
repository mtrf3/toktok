package X;

import com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EkJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37291EkJ<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ KidsDiskClearActivity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C37291EkJ(KidsDiskClearActivity kidsDiskClearActivity, String str) {
        this.LJLIL = kidsDiskClearActivity;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        String string;
        String string2;
        String string3;
        String str;
        o.LJIIIZ(it, "it");
        List<InterfaceC37286EkE> LJIIJ = P8H.LJIIJ();
        if (LJIIJ != null) {
            String str2 = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) LJIIJ).iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                InterfaceC37286EkE interfaceC37286EkE = (InterfaceC37286EkE) next;
                if (interfaceC37286EkE != null) {
                    str = interfaceC37286EkE.LJ();
                } else {
                    str = null;
                }
                if (o.LJ(str2, str)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Long.valueOf(((InterfaceC37286EkE) it3.next()).LIZIZ()));
            }
            Long valueOf = Long.valueOf(ORZ.LLILLJJLI(arrayList2));
            if (valueOf != null) {
                KidsDiskClearActivity kidsDiskClearActivity = this.LJLIL;
                String str3 = this.LJLILLLLZI;
                double longValue = valueOf.longValue();
                kidsDiskClearActivity.getClass();
                if (o.LJ(str3, "RESOURCE")) {
                    double d = longValue / 1073741824;
                    if (d > 1.0d) {
                        string3 = kidsDiskClearActivity.getString(R.string.qx5, Double.valueOf(d));
                    } else {
                        string3 = kidsDiskClearActivity.getString(R.string.qx4, Double.valueOf(longValue / 1048576));
                    }
                    o.LJIIIIZZ(string3, "{\n                if (si…          }\n            }");
                    return string3;
                }
                if (o.LJ(str3, "DRAFT")) {
                    double d2 = longValue / 1073741824;
                    if (d2 > 1.0d) {
                        string2 = kidsDiskClearActivity.getString(R.string.qx_, Double.valueOf(d2));
                    } else {
                        string2 = kidsDiskClearActivity.getString(R.string.qx9, Double.valueOf(longValue / 1048576));
                    }
                    o.LJIIIIZZ(string2, "{\n                if (si…          }\n            }");
                    return string2;
                }
                double d3 = longValue / 1048576;
                if (d3 < 30.0d) {
                    string = kidsDiskClearActivity.getString(R.string.qxn, Float.valueOf(0.0f));
                } else {
                    string = kidsDiskClearActivity.getString(R.string.qxn, Double.valueOf(d3));
                }
                o.LJIIIIZZ(string, "{ // TYPE_CACHE 临时文件\n   …          }\n            }");
                return string;
            }
        }
        return this.LJLIL.LLFII(this.LJLILLLLZI);
    }
}
