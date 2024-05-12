package X;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import com.bytedance.helios.binder.impl.BinderMonitor;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.PyT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66197PyT implements InterfaceC66203PyZ {
    public static final boolean LIZ;
    public static final C66197PyT LIZIZ = new C66197PyT();

    @Override // X.InterfaceC66203PyZ
    public final void LJI(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final String name() {
        return "InnerListener";
    }

    static {
        boolean z;
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        if (!heliosEnvImpl.LJFF() && C66074PwU.LIZ.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
    }

    public static boolean LJIIJ(Intent intent) {
        if ((intent.getPackage() != null && (!o.LJ(intent.getPackage(), BinderMonitor.LJFF.get().LIZJ))) || intent.getComponent() == null) {
            return true;
        }
        o.LJI(intent.getComponent());
        if (!o.LJ(r0.getPackageName(), BinderMonitor.LJFF.get().LIZJ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC66203PyZ
    public final boolean LIZ(Intent intent, Throwable th) {
        String str;
        if (LJIIJ(intent)) {
            if (!ORZ.LJLJJI(intent.getAction(), C66074PwU.LIZ.LJ)) {
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                String name = LLLLIIIILLL.getName();
                o.LJIIIIZZ(name, "Thread.currentThread().name");
                LJIIJJI("startActivity", "activity", intent, name, th);
                return false;
            }
        }
        ComponentName component = intent.getComponent();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("processStartActivity: ");
        String str2 = null;
        if (component != null) {
            str = component.getPackageName();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append('/');
        if (component != null) {
            str2 = component.getClassName();
        }
        LIZ2.append(str2);
        LIZ2.append('/');
        LIZ2.append(intent.getAction());
        X1D.LIZIZ(LIZ2);
        return false;
    }

    @Override // X.InterfaceC66203PyZ
    public final void LIZLLL(Intent intent, Throwable th) {
        String str;
        if (LJIIJ(intent)) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
            String name = LLLLIIIILLL.getName();
            o.LJIIIIZZ(name, "Thread.currentThread().name");
            LJIIJJI("pendingIntent", "pendingIntent", intent, name, th);
            return;
        }
        ComponentName component = intent.getComponent();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("processSendIntentSender: ");
        String str2 = null;
        if (component != null) {
            str = component.getPackageName();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append('/');
        if (component != null) {
            str2 = component.getClassName();
        }
        LIZ2.append(str2);
        LIZ2.append('/');
        LIZ2.append(intent.getAction());
        X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJ(Intent intent, Throwable th) {
        String str;
        if (LJIIJ(intent)) {
            if (!ORZ.LJLJJI(intent.getAction(), C66074PwU.LIZ.LJ)) {
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                String name = LLLLIIIILLL.getName();
                o.LJIIIIZZ(name, "Thread.currentThread().name");
                LJIIJJI("bindService", "service", intent, name, th);
                return;
            }
        }
        ComponentName component = intent.getComponent();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("processBindService: ");
        String str2 = null;
        if (component != null) {
            str = component.getPackageName();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append('/');
        if (component != null) {
            str2 = component.getClassName();
        }
        LIZ2.append(str2);
        LIZ2.append('/');
        LIZ2.append(intent.getAction());
        X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJFF(Intent intent, Throwable th) {
        String str;
        if (LJIIJ(intent)) {
            if (!ORZ.LJLJJI(intent.getAction(), C66074PwU.LIZ.LJ)) {
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                String name = LLLLIIIILLL.getName();
                o.LJIIIIZZ(name, "Thread.currentThread().name");
                LJIIJJI("broadcastIntent", "broadcast", intent, name, th);
                return;
            }
        }
        ComponentName component = intent.getComponent();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("processBroadcastIntent: ");
        String str2 = null;
        if (component != null) {
            str = component.getPackageName();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append('/');
        if (component != null) {
            str2 = component.getClassName();
        }
        LIZ2.append(str2);
        LIZ2.append('/');
        LIZ2.append(intent.getAction());
        X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJIIIIZZ(android.net.Uri uri, Throwable th) {
        String authority = uri.getAuthority();
        if (authority != null) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
            String threadName = LLLLIIIILLL.getName();
            int hashCode = authority.hashCode();
            if (hashCode != -845193793) {
                if (hashCode != -456066902) {
                    if (hashCode == 103772132 && authority.equals("media")) {
                        return;
                    }
                } else if (authority.equals("com.android.calendar")) {
                    return;
                }
            } else if (authority.equals("com.android.contacts")) {
                return;
            }
            if (C66074PwU.LIZ.LIZ) {
                o.LJIIIIZZ(threadName, "threadName");
                C66198PyU.LJIIIIZZ("delete", authority, threadName, new Throwable("ContentProvider.delete"));
            }
        }
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJIIIZ(Intent intent, Throwable th) {
        String str;
        if (LJIIJ(intent)) {
            if (!ORZ.LJLJJI(intent.getAction(), C66074PwU.LIZ.LJ)) {
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                String name = LLLLIIIILLL.getName();
                o.LJIIIIZZ(name, "Thread.currentThread().name");
                LJIIJJI("startService", "service", intent, name, th);
                return;
            }
        }
        ComponentName component = intent.getComponent();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("processStartService: ");
        String str2 = null;
        if (component != null) {
            str = component.getPackageName();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append('/');
        if (component != null) {
            str2 = component.getClassName();
        }
        LIZ2.append(str2);
        LIZ2.append('/');
        LIZ2.append(intent.getAction());
        X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC66203PyZ
    public final void LIZIZ(android.net.Uri uri, ContentValues[] contentValuesArr, Throwable th) {
        String LIZJ;
        java.util.Set<Map.Entry<String, Object>> set;
        String authority = uri.getAuthority();
        if (authority != null) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
            String threadName = LLLLIIIILLL.getName();
            int hashCode = authority.hashCode();
            if (hashCode != -845193793) {
                if (hashCode != -456066902) {
                    if (hashCode == 103772132 && authority.equals("media")) {
                        return;
                    }
                } else if (authority.equals("com.android.calendar")) {
                    return;
                }
            } else if (authority.equals("com.android.contacts")) {
                return;
            }
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
            boolean z = !heliosEnvImpl.LJFF();
            if (contentValuesArr.length == 0) {
                LIZJ = "[]";
            } else {
                StringBuilder sb = new StringBuilder("[");
                for (ContentValues contentValues : contentValuesArr) {
                    try {
                        set = contentValues.valueSet();
                        if (set == null) {
                            set = C61904ORg.LIZ;
                        }
                    } catch (Exception unused) {
                        set = C61904ORg.LIZ;
                    }
                    sb.append("{");
                    for (Map.Entry<String, Object> entry : set) {
                        sb.append(entry.getKey());
                        sb.append("=");
                        if (z) {
                            sb.append("*");
                        } else {
                            sb.append(entry.getValue());
                        }
                        sb.append(", ");
                    }
                    sb.append("}");
                }
                LIZJ = C0EH.LIZJ(sb, "]", "sb.toString()");
            }
            o.LJIIIIZZ(threadName, "threadName");
            C66198PyU.LJIIIZ("bulkInsert", authority, LIZJ, threadName, new Throwable("ContentProvider.bulkInsert"));
        }
    }

    @Override // X.InterfaceC66203PyZ
    public final void LIZJ(android.net.Uri uri, ContentValues contentValues, Throwable th) {
        String authority = uri.getAuthority();
        if (authority != null) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
            String threadName = LLLLIIIILLL.getName();
            int hashCode = authority.hashCode();
            if (hashCode != -845193793) {
                if (hashCode != -456066902) {
                    if (hashCode == 103772132 && authority.equals("media")) {
                        return;
                    }
                } else if (authority.equals("com.android.calendar")) {
                    return;
                }
            } else if (authority.equals("com.android.contacts")) {
                return;
            }
            String LIZ2 = C61904ORg.LIZ(contentValues, LIZ);
            o.LJIIIIZZ(threadName, "threadName");
            C66198PyU.LJIIIZ("insert", authority, LIZ2, threadName, new Throwable("ContentProvider.insert"));
        }
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJII(android.net.Uri uri, ContentValues contentValues, Throwable th) {
        String authority = uri.getAuthority();
        if (authority != null) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
            String threadName = LLLLIIIILLL.getName();
            int hashCode = authority.hashCode();
            if (hashCode != -845193793) {
                if (hashCode != -456066902) {
                    if (hashCode == 103772132 && authority.equals("media")) {
                        return;
                    }
                } else if (authority.equals("com.android.calendar")) {
                    return;
                }
            } else if (authority.equals("com.android.contacts")) {
                return;
            }
            o.LJIIIIZZ(HeliosEnvImpl.get(), "HeliosEnvImpl.get()");
            String LIZ2 = C61904ORg.LIZ(contentValues, !r1.LJFF());
            o.LJIIIIZZ(threadName, "threadName");
            C66198PyU.LJIIIZ("update", authority, LIZ2, threadName, new Throwable("ContentProvider.update"));
        }
    }

    public static void LJIIJJI(String str, String str2, Intent intent, String str3, Throwable th) {
        boolean z = LIZ;
        String str4 = null;
        boolean z2 = true;
        try {
            Field extrasField = Intent.class.getDeclaredField("mExtras");
            o.LJIIIIZZ(extrasField, "extrasField");
            extrasField.setAccessible(true);
            Object obj = extrasField.get(intent);
            if (obj != null) {
                ArrayMap arrayMap = new ArrayMap();
                java.util.Map LIZ2 = C39220FaK.LIZ(z, (Bundle) obj);
                if (LIZ2 != null) {
                    arrayMap.put("extras", LIZ2);
                }
                String str5 = intent.getPackage();
                if (str5 != null) {
                    arrayMap.put("package", str5);
                }
                String action = intent.getAction();
                if (action != null) {
                    arrayMap.put("action", action);
                }
                android.net.Uri data = intent.getData();
                if (data != null) {
                    arrayMap.put("data", data);
                }
                String type = intent.getType();
                if (type != null) {
                    arrayMap.put("type", type);
                }
                ComponentName component = intent.getComponent();
                if (component != null) {
                    arrayMap.put("component", component);
                }
                if (arrayMap.isEmpty()) {
                    return;
                }
                C66201PyX c66201PyX = new C66201PyX(null);
                c66201PyX.LJLJI = str;
                c66201PyX.LJLILLLLZI = "Sharing";
                c66201PyX.LJLJLJ = C37115EhT.LIZ(str, "com.bytedance.helios.binder", th);
                PQ0 pq0 = PQ0.LJFF;
                o.LJIIIIZZ(pq0, "LifecycleMonitor.get()");
                c66201PyX.LJLJJI = PQ0.LIZLLL();
                String copyOnWriteArrayList = pq0.LIZ.toString();
                o.LJIIIIZZ(copyOnWriteArrayList, "LifecycleMonitor.get().activityStackString");
                c66201PyX.LJLJJL = copyOnWriteArrayList;
                HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
                String LJIIJ = heliosEnvImpl.LJIIJ();
                if (LJIIJ != null && !ujb.o.LJJJJJL(LJIIJ)) {
                    z2 = false;
                }
                String str6 = "null";
                if (z2) {
                    LJIIJ = "null";
                }
                o.LJIIIZ(LJIIJ, "<set-?>");
                c66201PyX.LJLJLLL = LJIIJ;
                c66201PyX.LJLJJLL = str3;
                String str7 = intent.getPackage();
                if (str7 != null) {
                    str4 = str7;
                } else {
                    ComponentName component2 = intent.getComponent();
                    if (component2 != null) {
                        str4 = component2.getPackageName();
                    }
                }
                StringBuilder LIZ3 = X1D.LIZ();
                String action2 = intent.getAction();
                if (action2 != null) {
                    str6 = action2;
                }
                LIZ3.append(str6);
                LIZ3.append('@');
                LIZ3.append(str4);
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                o.LJIIIZ(LIZIZ2, "<set-?>");
                c66201PyX.LJLL = LIZIZ2;
                String arrayMap2 = arrayMap.toString();
                o.LJIIIZ(arrayMap2, "<set-?>");
                c66201PyX.LJLLI = arrayMap2;
                c66201PyX.LJLLJ = str2;
                c66201PyX.LJLLILLLL.add("Sharing");
                c66201PyX.LJLLILLLL.add("LinkStart");
                c66201PyX.LJLLL = C66074PwU.LIZ.LIZ;
                C66059PwF.LIZIZ(c66201PyX);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        } catch (Exception unused) {
        }
    }
}
