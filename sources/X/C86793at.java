package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3at, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86793at {
    public static final java.util.Map<Integer, C86803au> LIZ = new LinkedHashMap();

    public static void LIZ(int i, Long l) {
        List<C72412sn> list;
        C86803au c86803au = (C86803au) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (c86803au == null || (list = c86803au.LJLJJI) == null) {
            return;
        }
        Iterator<C72412sn> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (o.LJ(it.next().LJLIL.getSetId(), l)) {
                if (i2 == -1) {
                    return;
                }
                C72412sn c72412sn = (C72412sn) ListProtector.remove(list, i2);
                Iterator<C72412sn> it2 = list.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Integer setStatus = it2.next().LJLIL.getSetStatus();
                    int status = EnumC71912rz.ADDED.getStatus();
                    if (setStatus == null || setStatus.intValue() != status) {
                        i3++;
                    } else {
                        if (i3 == -1) {
                            return;
                        }
                        ListProtector.add(list, i3, C72412sn.L(StickerSetInfo.copy$default(c72412sn.LJLIL, null, null, null, null, null, null, null, null, Integer.valueOf(EnumC71912rz.ADDED.getStatus()), null, null, null, null, 7935, null)));
                        return;
                    }
                }
                return;
            }
            i2++;
        }
    }

    public static void LIZIZ(int i, long j, List list, boolean z) {
        java.util.Map<Integer, C86803au> map = LIZ;
        C86803au c86803au = (C86803au) ((LinkedHashMap) map).get(Integer.valueOf(i));
        if (c86803au == null) {
            c86803au = new C86803au(0);
        }
        c86803au.LJLJJI.addAll(list);
        Integer valueOf = Integer.valueOf(i);
        long j2 = c86803au.LJLIL;
        if (j2 == -1) {
            j2 = NetworkUtils.getServerTimeMills();
        }
        List<C72412sn> data = c86803au.LJLJJI;
        o.LJIIIZ(data, "data");
        map.put(valueOf, new C86803au(j2, z, j, data));
    }
}
