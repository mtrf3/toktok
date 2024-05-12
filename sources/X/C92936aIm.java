package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aIm, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92936aIm extends AbstractC65781Prl implements InterfaceC88472Yns<Bundle, C92145a61> {
    public final /* synthetic */ Context LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92936aIm(Context context) {
        super(1);
        this.LJLIL = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C92145a61 invoke(Bundle bundle) {
        Bundle it = bundle;
        o.LJIIIZ(it, "it");
        C92145a61 c92145a61 = new C92145a61(this.LJLIL);
        c92145a61.LJIJJ.LIZ(new C92267a7z());
        c92145a61.LJIJJ.LIZ(new C92270a82());
        it.setClassLoader(c92145a61.LIZ.getClassLoader());
        c92145a61.LIZLLL = it.getBundle("android-support-nav:controller:navigatorState");
        c92145a61.LJ = it.getParcelableArray("android-support-nav:controller:backStack");
        ((LinkedHashMap) c92145a61.LJIIJJI).clear();
        int[] intArray = it.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = it.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = intArray[i];
                i++;
                c92145a61.LJIIJ.put(Integer.valueOf(i3), ListProtector.get(stringArrayList, i2));
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = it.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            Iterator<String> it2 = stringArrayList2.iterator();
            while (it2.hasNext()) {
                String id = it2.next();
                Parcelable[] parcelableArray = it.getParcelableArray(o.LJIILLIIL(id, "android-support-nav:controller:backStackStates:"));
                if (parcelableArray != null) {
                    java.util.Map<String, ORV<NavBackStackEntryState>> map = c92145a61.LJIIJJI;
                    o.LJIIIIZZ(id, "id");
                    ORV orv = new ORV(parcelableArray.length);
                    C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(parcelableArray);
                    while (LJJIIJZLJL.hasNext()) {
                        Parcelable parcelable = (Parcelable) LJJIIJZLJL.next();
                        if (parcelable != null) {
                            orv.addLast(parcelable);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                    }
                    map.put(id, orv);
                }
            }
        }
        c92145a61.LJFF = it.getBoolean("android-support-nav:controller:deepLinkHandled");
        return c92145a61;
    }
}
