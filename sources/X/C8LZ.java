package X;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS4S0501000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8LZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LZ {
    public static final LinkedHashMap<String, C78915Uy7> LIZ = new LinkedHashMap<>();
    public static final List<ReusedUIAssem<? extends C3C8>> LIZIZ = new ArrayList();

    public static final <ASSEM extends BaseContainer<? extends VContainerProtocol, ? extends C3C8>> void LIZ(ASSEM assem, C8LU operator, ViewGroup viewGroup) {
        o.LJIIIZ(assem, "<this>");
        o.LJIIIZ(operator, "operator");
        if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.DESTROYED) <= 0) {
            return;
        }
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(assem), RootCellCommonAbility.class, null);
        ArrayList arrayList = (ArrayList) LIZIZ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ReusedUIAssem reusedUIAssem = (ReusedUIAssem) ListProtector.get(arrayList, i);
            if (reusedUIAssem instanceof BaseContainer) {
                C78926UyI.LJFF(assem, new AqS4S0501000_3(i, viewGroup, reusedUIAssem, rootCellCommonAbility, operator, assem, 0));
            } else {
                C8VR.LIZ(assem, new AqS4S0501000_3(i, viewGroup, reusedUIAssem, rootCellCommonAbility, operator, assem, 1));
            }
        }
        ((ArrayList) LIZIZ).clear();
        LIZ.clear();
    }
}
