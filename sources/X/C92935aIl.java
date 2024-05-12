package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.aIl, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92935aIl extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C92145a61, Bundle> {
    public static final C92935aIl LJLIL = new C92935aIl();

    public C92935aIl() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final Bundle invoke(C0MK Saver, C92145a61 c92145a61) {
        Bundle bundle;
        C92145a61 it = c92145a61;
        o.LJIIIZ(Saver, "$this$Saver");
        o.LJIIIZ(it, "it");
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : C113554cx.LJJLIIIJLLLLLLLZ(it.LJIJJ.LIZ).entrySet()) {
            entry.getKey();
            entry.getValue().getClass();
        }
        if (!arrayList.isEmpty()) {
            Bundle bundle3 = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle3.putBundle("android-support-nav:controller:navigatorState", bundle2);
            bundle = bundle3;
        } else {
            bundle = null;
        }
        Bundle bundle4 = bundle;
        Bundle bundle5 = bundle;
        if (!it.LJI.isEmpty()) {
            if (bundle == null) {
                bundle4 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[it.LJI.size()];
            Iterator<NavBackStackEntry> it2 = it.LJI.iterator();
            int i = 0;
            while (it2.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it2.next());
                i++;
            }
            bundle4.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
            bundle5 = bundle4;
        }
        Bundle bundle6 = bundle5;
        Bundle bundle7 = bundle5;
        if (!it.LJIIJ.isEmpty()) {
            if (bundle5 == null) {
                bundle6 = new Bundle();
            }
            int[] iArr = new int[it.LJIIJ.size()];
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (Map.Entry entry2 : ((LinkedHashMap) it.LJIIJ).entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                Object value = entry2.getValue();
                iArr[i2] = intValue;
                arrayList2.add(value);
                i2++;
            }
            bundle6.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle6.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
            bundle7 = bundle6;
        }
        Bundle bundle8 = bundle7;
        Bundle bundle9 = bundle7;
        if (!it.LJIIJJI.isEmpty()) {
            if (bundle7 == null) {
                bundle8 = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : ((LinkedHashMap) it.LJIIJJI).entrySet()) {
                Object key = entry3.getKey();
                ORP orp = (ORP) entry3.getValue();
                arrayList3.add(key);
                Parcelable[] parcelableArr2 = new Parcelable[orp.size()];
                Iterator<E> it3 = orp.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        parcelableArr2[i3] = next;
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                bundle8.putParcelableArray(o.LJIILLIIL(key, "android-support-nav:controller:backStackStates:"), parcelableArr2);
            }
            bundle8.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
            bundle9 = bundle8;
        }
        Bundle bundle10 = bundle9;
        Bundle bundle11 = bundle9;
        if (it.LJFF) {
            if (bundle9 == null) {
                bundle10 = new Bundle();
            }
            bundle10.putBoolean("android-support-nav:controller:deepLinkHandled", it.LJFF);
            bundle11 = bundle10;
        }
        return bundle11;
    }
}
