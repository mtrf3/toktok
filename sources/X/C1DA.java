package X;

import Y.IDRunnableS0S0201000;
import Y.IDRunnableS6S0101000;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1DA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DA implements InterfaceC13820gU, C0XX {
    public static final /* synthetic */ int LJLL = 0;
    public final C1OU LJLIL;
    public final InterfaceC23750wV LJLILLLLZI;
    public final Object LJLJI = new Object();
    public String LJLJJI;
    public final java.util.Map<String, C0VT> LJLJJL;
    public final java.util.Map<String, C19380pS> LJLJJLL;
    public final java.util.Set<C19380pS> LJLJL;
    public final C33091Rp LJLJLJ;
    public InterfaceC03600Ce LJLJLLL;

    @Override // X.InterfaceC13820gU
    public final void LJFF(List<String> list) {
    }

    static {
        C0VW.LIZIZ("SystemFgDispatcher");
    }

    public C1DA(Context context) {
        C1OU LJ = C1OU.LJ(context);
        this.LJLIL = LJ;
        InterfaceC23750wV interfaceC23750wV = LJ.LIZLLL;
        this.LJLILLLLZI = interfaceC23750wV;
        this.LJLJJI = null;
        this.LJLJJL = new LinkedHashMap();
        this.LJLJL = new HashSet();
        this.LJLJJLL = new HashMap();
        this.LJLJLJ = new C33091Rp(context, interfaceC23750wV, this);
        LJ.LJFF.LIZ(this);
    }

    public final void LIZJ(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), LLJJIJIIJIL, Integer.valueOf(intExtra2)});
        LIZ.getClass();
        if (notification != null && this.LJLJLLL != null) {
            this.LJLJJL.put(LLJJIJIIJIL, new C0VT(intExtra, intExtra2, notification));
            if (TextUtils.isEmpty(this.LJLJJI)) {
                this.LJLJJI = LLJJIJIIJIL;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.LJLJLLL;
                systemForegroundService.LJLIL.post(new RunnableC17850mz(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.LJLJLLL;
            systemForegroundService2.LJLIL.post(new IDRunnableS0S0201000(intExtra, notification, systemForegroundService2, 12));
            if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            Iterator it = ((LinkedHashMap) this.LJLJJL).entrySet().iterator();
            while (it.hasNext()) {
                i |= ((C0VT) ((Map.Entry) it.next()).getValue()).LIZIZ;
            }
            C0VT c0vt = (C0VT) ((LinkedHashMap) this.LJLJJL).get(this.LJLJJI);
            if (c0vt == null) {
                return;
            }
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.LJLJLLL;
            systemForegroundService3.LJLIL.post(new RunnableC17850mz(systemForegroundService3, c0vt.LIZ, c0vt.LIZJ, i));
        }
    }

    @Override // X.InterfaceC13820gU
    public final void LIZLLL(List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Constraints unmet for WorkSpec %s", new Object[]{str});
                LIZ.getClass();
                C1OU c1ou = this.LJLIL;
                ((C35591aV) c1ou.LIZLLL).LIZ(new RunnableC20540rK(c1ou, str, true));
            }
        }
    }

    @Override // X.C0XX
    public final void LJ(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.LJLJI) {
            C19380pS c19380pS = (C19380pS) ((HashMap) this.LJLJJLL).remove(str);
            if (c19380pS != null && ((HashSet) this.LJLJL).remove(c19380pS)) {
                this.LJLJLJ.LIZJ(this.LJLJL);
            }
        }
        C0VT remove = this.LJLJJL.remove(str);
        if (str.equals(this.LJLJJI) && this.LJLJJL.size() > 0) {
            Iterator it = ((LinkedHashMap) this.LJLJJL).entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.LJLJJI = (String) entry.getKey();
            if (this.LJLJLLL != null) {
                C0VT c0vt = (C0VT) entry.getValue();
                InterfaceC03600Ce interfaceC03600Ce = this.LJLJLLL;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC03600Ce;
                systemForegroundService.LJLIL.post(new RunnableC17850mz(systemForegroundService, c0vt.LIZ, c0vt.LIZJ, c0vt.LIZIZ));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.LJLJLLL;
                systemForegroundService2.LJLIL.post(new IDRunnableS6S0101000(c0vt.LIZ, systemForegroundService2, 29));
            }
        }
        InterfaceC03600Ce interfaceC03600Ce2 = this.LJLJLLL;
        if (remove != null && interfaceC03600Ce2 != null) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove.LIZ), str, Integer.valueOf(remove.LIZIZ)});
            LIZ.getClass();
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC03600Ce2;
            systemForegroundService3.LJLIL.post(new IDRunnableS6S0101000(remove.LIZ, systemForegroundService3, 29));
        }
    }

    public static Intent LIZ(Context context, String str, C0VT c0vt) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c0vt.LIZ);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0vt.LIZIZ);
        intent.putExtra("KEY_NOTIFICATION", c0vt.LIZJ);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent LIZIZ(Context context, String str, C0VT c0vt) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c0vt.LIZ);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0vt.LIZIZ);
        intent.putExtra("KEY_NOTIFICATION", c0vt.LIZJ);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }
}
