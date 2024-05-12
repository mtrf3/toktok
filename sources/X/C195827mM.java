package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.7mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195827mM {
    public static final java.util.Map<String, Integer> LIZ = new ConcurrentHashMap();

    static {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            C10K.LIZJ(new Callable() { // from class: X.7mO
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C195827mM.LIZIZ();
                    C195827mM.LIZ();
                    return C76800UCe.LIZ;
                }
            });
        }
        ((RBX) HG3.LJIILL()).addUserChangeListener(new InterfaceC252619vl() { // from class: X.7mN
            @Override // X.InterfaceC252619vl
            public final void t0(int i, User user, User user2) {
                String str;
                String str2 = null;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                if (user2 != null) {
                    str2 = user2.getUid();
                }
                if (!o.LJ(str, str2)) {
                    ((ConcurrentHashMap) C195827mM.LIZ).clear();
                    C10K.LIZJ(new Callable() { // from class: X.7mP
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C195827mM.LIZIZ();
                            C195827mM.LIZ();
                            return C76800UCe.LIZ;
                        }
                    });
                }
            }
        });
    }

    public static void LIZ() {
        long j;
        Long l;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, Object> entry : C63782es.LIZ("now_white_list_timestamp").entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof Long) && (l = (Long) value) != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (currentTimeMillis - j >= 86400000) {
                String substring = entry.getKey().substring(s.LJJLIIIJLLLLLLLZ(entry.getKey(), '-', 0, 6) + 1);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                arrayList.add(substring);
            }
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId != null) {
            String LJFF = i0.LJFF("now_white_list-", curUserId);
            String LJFF2 = i0.LJFF("now_white_list_timestamp-", curUserId);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Keva LIZIZ = C63782es.LIZIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJFF);
                LIZ2.append('-');
                LIZ2.append(str);
                LIZIZ.erase(X1D.LIZIZ(LIZ2));
                Keva LIZIZ2 = C63782es.LIZIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LJFF2);
                LIZ3.append('-');
                LIZ3.append(str);
                LIZIZ2.erase(X1D.LIZIZ(LIZ3));
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("clearOutdatedKeva: ");
        LIZ4.append(arrayList);
        C7XD.LIZ("NowPostWhiteList", X1D.LIZIZ(LIZ4));
    }

    public static void LIZIZ() {
        Integer num;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : C63782es.LIZ("now_white_list").entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof Integer) && (num = (Integer) value) != null) {
                int intValue = num.intValue();
                String substring = entry.getKey().substring(s.LJJLIIIJLLLLLLLZ(entry.getKey(), '-', 0, 6) + 1);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                ((ConcurrentHashMap) LIZ).put(substring, Integer.valueOf(intValue));
                arrayList.add(substring);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("loadFromKeva: ");
        LIZ2.append(arrayList);
        C7XD.LIZ("NowPostWhiteList", X1D.LIZIZ(LIZ2));
        if (arrayList.isEmpty()) {
            return;
        }
        C185117Oh.LIZ.LIZ(arrayList);
    }
}
