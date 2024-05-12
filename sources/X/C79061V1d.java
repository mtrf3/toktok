package X;

import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.plugin.PluginService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.V1d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C79061V1d implements InterfaceC48038ItG {
    public static Iterator LJFF(boolean z) {
        return PluginService.createIPluginServicebyMonsterPlugin(z).getCurrentPluginListPluginData().iterator();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((BaseListResponse) obj).data;
    }

    public static String LJ(String str, int i, int i2) {
        return str.substring(i2, str.length() - i);
    }

    public static InterfaceC789838c LJI(String str, String str2, String str3) {
        o.LJIIIIZZ(str, str2);
        return C46104I7o.LJJII().create(str3);
    }

    public static int LIZ(InterfaceC273215k interfaceC273215k, AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C44851pR((InterfaceC274115t) ListProtector.get(list, i2), EnumC274215u.Max, EnumC274315v.Height));
        }
        return interfaceC273215k.LIZJ(new C536628s(abstractC538029g, abstractC538029g.LJLJL.LJLZ), arrayList, C78555UsJ.LJ(i, 0, 13)).getHeight();
    }

    public static int LIZIZ(InterfaceC273215k interfaceC273215k, AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C44851pR((InterfaceC274115t) ListProtector.get(list, i2), EnumC274215u.Max, EnumC274315v.Width));
        }
        return interfaceC273215k.LIZJ(new C536628s(abstractC538029g, abstractC538029g.LJLJL.LJLZ), arrayList, C78555UsJ.LJ(0, i, 7)).getWidth();
    }

    public static int LIZJ(InterfaceC273215k interfaceC273215k, AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C44851pR((InterfaceC274115t) ListProtector.get(list, i2), EnumC274215u.Min, EnumC274315v.Height));
        }
        return interfaceC273215k.LIZJ(new C536628s(abstractC538029g, abstractC538029g.LJLJL.LJLZ), arrayList, C78555UsJ.LJ(i, 0, 13)).getHeight();
    }

    public static int LIZLLL(InterfaceC273215k interfaceC273215k, AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C44851pR((InterfaceC274115t) ListProtector.get(list, i2), EnumC274215u.Min, EnumC274315v.Width));
        }
        return interfaceC273215k.LIZJ(new C536628s(abstractC538029g, abstractC538029g.LJLJL.LJLZ), arrayList, C78555UsJ.LJ(0, i, 7)).getWidth();
    }
}
