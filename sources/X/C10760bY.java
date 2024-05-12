package X;

import Y.IDHandlerS13S0100000;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10760bY {
    public static final Object LJFF = new Object();
    public static C10760bY LJI;
    public final Context LIZ;
    public final HashMap<BroadcastReceiver, ArrayList<C10750bX>> LIZIZ = new HashMap<>();
    public final HashMap<String, ArrayList<C10750bX>> LIZJ = new HashMap<>();
    public final ArrayList<C10740bW> LIZLLL = new ArrayList<>();
    public final IDHandlerS13S0100000 LJ;

    public C10760bY(Context context) {
        this.LIZ = context;
        this.LJ = new IDHandlerS13S0100000(this, context.getMainLooper(), 1);
    }

    public static C10760bY LIZ(Context context) {
        C10760bY c10760bY;
        synchronized (LJFF) {
            if (LJI == null) {
                LJI = new C10760bY(C16880lQ.LLLLL(context));
            }
            c10760bY = LJI;
        }
        return c10760bY;
    }

    public final void LIZJ(Intent intent) {
        String str;
        String str2;
        android.net.Uri uri;
        synchronized (this.LIZIZ) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.LIZ.getContentResolver());
            android.net.Uri data = intent.getData();
            String scheme = intent.getScheme();
            java.util.Set<String> categories = intent.getCategories();
            intent.getFlags();
            ArrayList<C10750bX> arrayList = this.LIZJ.get(intent.getAction());
            if (arrayList != null) {
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < arrayList.size()) {
                    C10750bX c10750bX = arrayList.get(i);
                    if (!c10750bX.LIZJ) {
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        uri = data;
                        if (c10750bX.LIZ.match(str, str2, scheme, uri, categories, "LocalBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c10750bX);
                            c10750bX.LIZJ = true;
                        }
                    } else {
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        uri = data;
                    }
                    i++;
                    action = str;
                    resolveTypeIfNeeded = str2;
                    data = uri;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C10750bX) arrayList2.get(i2)).LIZJ = false;
                    }
                    this.LIZLLL.add(new C10740bW(intent, arrayList2));
                    if (!this.LJ.hasMessages(1)) {
                        this.LJ.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public final void LIZLLL(BroadcastReceiver broadcastReceiver) {
        synchronized (this.LIZIZ) {
            ArrayList<C10750bX> remove = this.LIZIZ.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C10750bX c10750bX = remove.get(size);
                c10750bX.LIZLLL = true;
                for (int i = 0; i < c10750bX.LIZ.countActions(); i++) {
                    String action = c10750bX.LIZ.getAction(i);
                    ArrayList<C10750bX> arrayList = this.LIZJ.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C10750bX c10750bX2 = arrayList.get(size2);
                            if (c10750bX2.LIZIZ == broadcastReceiver) {
                                c10750bX2.LIZLLL = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.LIZJ.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void LIZIZ(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.LIZIZ) {
            C10750bX c10750bX = new C10750bX(broadcastReceiver, intentFilter);
            ArrayList<C10750bX> arrayList = this.LIZIZ.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.LIZIZ.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c10750bX);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C10750bX> arrayList2 = this.LIZJ.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.LIZJ.put(action, arrayList2);
                }
                arrayList2.add(c10750bX);
            }
        }
    }
}
