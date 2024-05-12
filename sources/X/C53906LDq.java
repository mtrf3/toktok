package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hox.HoxFragmentGroup;
import com.bytedance.hox.HoxFragmentNode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LDq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53906LDq extends C08Z {
    public final /* synthetic */ com.bytedance.hox.Hox LIZ;

    public C53906LDq(com.bytedance.hox.Hox hox) {
        this.LIZ = hox;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        AbstractC53895LDf abstractC53895LDf;
        o.LJIIJ(fm, "fm");
        o.LJIIJ(f, "f");
        super.onFragmentDestroyed(fm, f);
        if (f instanceof InterfaceC53907LDr) {
            InterfaceC53907LDr interfaceC53907LDr = (InterfaceC53907LDr) f;
            String L6 = interfaceC53907LDr.L6();
            HashMap<String, AbstractC53895LDf> hashMap = this.LIZ.LJLJJI.get(f.getClass());
            if (hashMap == null || hashMap.isEmpty()) {
                return;
            }
            if (hashMap.size() == 1) {
                Collection<AbstractC53895LDf> values = hashMap.values();
                o.LJFF(values, "hoxNodeMapForFragment.values");
                abstractC53895LDf = (AbstractC53895LDf) ORZ.LJLLILLLL(values);
            } else if (L6.length() > 0) {
                abstractC53895LDf = hashMap.get(L6);
            } else {
                if (!L9J.LIZIZ) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Duplicated Fragment Class ");
                LIZ.append(f.getClass());
                LIZ.append(" has been registered without specifying different HoxNodeTags");
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            }
            if (abstractC53895LDf == null) {
                return;
            }
            this.LIZ.zv0(abstractC53895LDf.tag(), interfaceC53907LDr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C08Z
    public final void onFragmentCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        AbstractC53895LDf abstractC53895LDf;
        o.LJIIJ(fm, "fm");
        o.LJIIJ(f, "f");
        super.onFragmentCreated(fm, f, bundle);
        if (f instanceof InterfaceC53907LDr) {
            InterfaceC53907LDr interfaceC53907LDr = (InterfaceC53907LDr) f;
            String L6 = interfaceC53907LDr.L6();
            HashMap<String, AbstractC53895LDf> hashMap = this.LIZ.LJLJJI.get(f.getClass());
            if (hashMap == null || hashMap.isEmpty()) {
                return;
            }
            if (hashMap.size() == 1) {
                Collection<AbstractC53895LDf> values = hashMap.values();
                o.LJFF(values, "hoxNodeMapForFragment.values");
                abstractC53895LDf = (AbstractC53895LDf) ORZ.LJLLILLLL(values);
            } else if (L6.length() > 0) {
                abstractC53895LDf = hashMap.get(L6);
            } else {
                if (!L9J.LIZIZ) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Duplicated Fragment Class ");
                LIZ.append(f.getClass());
                LIZ.append(" has been registered without specifying different HoxNodeTags");
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            }
            if (abstractC53895LDf == null) {
                return;
            }
            if (abstractC53895LDf instanceof HoxFragmentNode) {
                HoxFragmentNode hoxFragmentNode = (HoxFragmentNode) abstractC53895LDf;
                hoxFragmentNode.LJLJJL = f;
                Iterator it = ((List) hoxFragmentNode.LJLJL.getValue()).iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((List) hoxFragmentNode.LJLJL.getValue()).clear();
            } else if (abstractC53895LDf instanceof HoxFragmentGroup) {
                HoxFragmentGroup hoxFragmentGroup = (HoxFragmentGroup) abstractC53895LDf;
                hoxFragmentGroup.LJLL = f;
                Iterator it2 = ((List) hoxFragmentGroup.LJLLILLLL.getValue()).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((List) hoxFragmentGroup.LJLLILLLL.getValue()).clear();
            }
            this.LIZ.hv0(abstractC53895LDf.tag(), interfaceC53907LDr);
        }
    }
}
