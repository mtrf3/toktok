package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class U30 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJ(long j) {
        int i = (int) (j / 60);
        int i2 = (int) (j - (i * 60));
        if (i < 10) {
            if (i2 < 10) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('0');
                LIZ2.append(i);
                LIZ2.append(":0");
                LIZ2.append(i2);
                return X1D.LIZIZ(LIZ2);
            }
        } else if (i2 < 10) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(i);
            LIZ3.append(":0");
            LIZ3.append(i2);
            return X1D.LIZIZ(LIZ3);
        }
        if (i < 10) {
            if (i2 >= 10) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append('0');
                LIZ4.append(i);
                LIZ4.append(':');
                LIZ4.append(i2);
                return X1D.LIZIZ(LIZ4);
            }
        } else if (i2 >= 10) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(i);
            LIZ5.append(':');
            LIZ5.append(i2);
            return X1D.LIZIZ(LIZ5);
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(i);
        LIZ6.append(':');
        LIZ6.append(i2);
        return X1D.LIZIZ(LIZ6);
    }

    public static boolean LIZIZ(ShowListUser showListUser, ShowListUser showListUser2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        String str2 = null;
        if (showListUser != null) {
            num = Integer.valueOf(showListUser.order);
        } else {
            num = null;
        }
        if (showListUser2 != null) {
            num2 = Integer.valueOf(showListUser2.order);
        } else {
            num2 = null;
        }
        if (o.LJ(num, num2)) {
            if (showListUser != null) {
                num3 = Integer.valueOf(showListUser.status);
            } else {
                num3 = null;
            }
            if (showListUser2 != null) {
                num4 = Integer.valueOf(showListUser2.status);
            } else {
                num4 = null;
            }
            if (o.LJ(num3, num4)) {
                if (showListUser != null) {
                    l = Long.valueOf(showListUser.userId);
                } else {
                    l = null;
                }
                if (showListUser2 != null) {
                    l2 = Long.valueOf(showListUser2.userId);
                } else {
                    l2 = null;
                }
                if (o.LJ(l, l2)) {
                    if (showListUser != null) {
                        l3 = Long.valueOf(showListUser.showStartTime);
                    } else {
                        l3 = null;
                    }
                    if (showListUser2 != null) {
                        l4 = Long.valueOf(showListUser2.showStartTime);
                    } else {
                        l4 = null;
                    }
                    if (o.LJ(l3, l4)) {
                        if (showListUser != null) {
                            str = showListUser.linkmicIdStr;
                        } else {
                            str = null;
                        }
                        if (showListUser2 != null) {
                            str2 = showListUser2.linkmicIdStr;
                        }
                        if (!o.LJ(str, str2)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(List list, List list2) {
        Integer num;
        Integer num2 = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (list2 != null) {
            num2 = Integer.valueOf(list2.size());
        }
        if (!o.LJ(num, num2)) {
            return false;
        }
        if (list == null) {
            if (list2 != null) {
                return false;
            }
            return true;
        }
        if (list2 == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!LIZIZ((ShowListUser) ListProtector.get(list, i), (ShowListUser) ListProtector.get(list2, i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZLLL(ShowConfig showConfig, ShowConfig showConfig2) {
        Boolean bool;
        Boolean bool2;
        Long l;
        Long l2 = null;
        if (showConfig != null) {
            bool = Boolean.valueOf(showConfig.allowOpenMicFreely);
        } else {
            bool = null;
        }
        if (showConfig2 != null) {
            bool2 = Boolean.valueOf(showConfig2.allowOpenMicFreely);
        } else {
            bool2 = null;
        }
        boolean LJ = o.LJ(bool, bool2);
        if (showConfig != null) {
            l = Long.valueOf(showConfig.durationPerGuest);
        } else {
            l = null;
        }
        if (showConfig2 != null) {
            l2 = Long.valueOf(showConfig2.durationPerGuest);
        }
        if (!o.LJ(l, l2)) {
            return false;
        }
        return LJ;
    }

    public static C75271TgR LIZ(List list, List list2, boolean z) {
        ShowListUser showListUser;
        Object obj;
        ArrayList arrayList = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ShowListUser) obj).status == 2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            showListUser = (ShowListUser) obj;
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((ShowListUser) obj2).status == 1) {
                    arrayList.add(obj2);
                }
            }
        } else {
            showListUser = null;
        }
        return new C75271TgR(showListUser, arrayList, list2, z);
    }
}
