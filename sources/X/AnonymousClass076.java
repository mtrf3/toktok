package X;

import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.076, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass076 implements Handler.Callback, ServiceConnection {
    public final Context LJLIL;
    public final java.util.Map<ComponentName, AnonymousClass075> LJLJI = new HashMap();
    public java.util.Set<String> LJLJJI = new HashSet();
    public final Handler LJLILLLLZI = new Handler(C06M.LIZ("NotificationManagerCompat").getLooper(), this);

    public AnonymousClass076(Context context) {
        this.LJLIL = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r1 = r4.LIZLLL.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1.LIZ(r4.LIZJ);
        r4.LIZLLL.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r4.LIZLLL.isEmpty() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        LIZIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (r4.LIZIZ != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r4.LIZJ == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        LIZIZ(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.AnonymousClass075 r4) {
        /*
            r3 = this;
            java.util.ArrayDeque<X.077> r0 = r4.LIZLLL
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r4.LIZIZ
            if (r0 == 0) goto L15
        Ld:
            X.0f9 r0 = r4.LIZJ
            if (r0 != 0) goto L3c
        L11:
            r3.LIZIZ(r4)
            return
        L15:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r1.<init>(r0)
            android.content.ComponentName r0 = r4.LIZ
            android.content.Intent r2 = r1.setComponent(r0)
            android.content.Context r1 = r3.LJLIL
            r0 = 33
            boolean r0 = X.C16880lQ.LLLJL(r1, r2, r3, r0)
            r4.LIZIZ = r0
            if (r0 == 0) goto L36
            r0 = 0
            r4.LJ = r0
        L31:
            boolean r0 = r4.LIZIZ
            if (r0 == 0) goto L11
            goto Ld
        L36:
            android.content.Context r0 = r3.LJLIL
            r0.unbindService(r3)
            goto L31
        L3c:
            java.util.ArrayDeque<X.077> r0 = r4.LIZLLL
            java.lang.Object r1 = r0.peek()
            X.077 r1 = (X.AnonymousClass077) r1
            if (r1 != 0) goto L52
        L46:
            java.util.ArrayDeque<X.077> r0 = r4.LIZLLL
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L51
            r3.LIZIZ(r4)
        L51:
            return
        L52:
            X.0f9 r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L46
            r1.LIZ(r0)     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque<X.077> r0 = r4.LIZLLL     // Catch: java.lang.Throwable -> L46
            r0.remove()     // Catch: java.lang.Throwable -> L46
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass076.LIZ(X.075):void");
    }

    public final void LIZIZ(AnonymousClass075 anonymousClass075) {
        if (this.LJLILLLLZI.hasMessages(3, anonymousClass075.LIZ)) {
            return;
        }
        int i = anonymousClass075.LJ + 1;
        anonymousClass075.LJ = i;
        if (i > 6) {
            anonymousClass075.LIZLLL.clear();
            return;
        }
        this.LJLILLLLZI.sendMessageDelayed(this.LJLILLLLZI.obtainMessage(3, anonymousClass075.LIZ), (1 << (i - 1)) * 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String LIZ;
        java.util.Set<String> set;
        int i = message.what;
        InterfaceC12990f9 interfaceC12990f9 = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    AnonymousClass075 anonymousClass075 = (AnonymousClass075) ((HashMap) this.LJLJI).get(message.obj);
                    if (anonymousClass075 != null) {
                        LIZ(anonymousClass075);
                    }
                    return true;
                }
                AnonymousClass075 anonymousClass0752 = (AnonymousClass075) ((HashMap) this.LJLJI).get(message.obj);
                if (anonymousClass0752 != null) {
                    if (anonymousClass0752.LIZIZ) {
                        this.LJLIL.unbindService(this);
                        anonymousClass0752.LIZIZ = false;
                    }
                    anonymousClass0752.LIZJ = null;
                }
                return true;
            }
            AnonymousClass074 anonymousClass074 = (AnonymousClass074) message.obj;
            ComponentName componentName = anonymousClass074.LIZ;
            final IBinder iBinder = anonymousClass074.LIZIZ;
            AnonymousClass075 anonymousClass0753 = (AnonymousClass075) ((HashMap) this.LJLJI).get(componentName);
            if (anonymousClass0753 != null) {
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC12990f9)) {
                        interfaceC12990f9 = (InterfaceC12990f9) queryLocalInterface;
                    } else {
                        interfaceC12990f9 = new InterfaceC12990f9(iBinder) { // from class: X.1RA
                            public final IBinder LJLIL;

                            @Override // android.os.IInterface
                            public final IBinder asBinder() {
                                return this.LJLIL;
                            }

                            {
                                this.LJLIL = iBinder;
                            }

                            @Override // X.InterfaceC12990f9
                            public final void x0(int i2, Notification notification, String str, String str2) {
                                Parcel obtain = Parcel.obtain();
                                try {
                                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                                    obtain.writeString(str);
                                    obtain.writeInt(i2);
                                    obtain.writeString(str2);
                                    if (notification == null) {
                                        obtain.writeInt(0);
                                    } else {
                                        obtain.writeInt(1);
                                        notification.writeToParcel(obtain, 0);
                                    }
                                    this.LJLIL.transact(1, obtain, null, 1);
                                } finally {
                                    obtain.recycle();
                                }
                            }
                        };
                    }
                }
                anonymousClass0753.LIZJ = interfaceC12990f9;
                anonymousClass0753.LJ = 0;
                LIZ(anonymousClass0753);
            }
            return true;
        }
        Object obj = message.obj;
        ContentResolver contentResolver = this.LJLIL.getContentResolver();
        if (TextUtils.equals("enabled_notification_listeners", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                LIZ = "";
            } else {
                if (TextUtils.isEmpty(E77.LIZ)) {
                    E77.LIZ = AnonymousClass078.LIZ(contentResolver);
                }
                LIZ = E77.LIZ;
            }
        } else {
            LIZ = AnonymousClass078.LIZ(contentResolver);
        }
        synchronized (AnonymousClass078.LIZJ) {
            if (LIZ != null) {
                if (!LIZ.equals(AnonymousClass078.LIZLLL)) {
                    String[] split = LIZ.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    AnonymousClass078.LJ = hashSet;
                    AnonymousClass078.LIZLLL = LIZ;
                }
            }
            set = AnonymousClass078.LJ;
        }
        if (!set.equals(this.LJLJJI)) {
            this.LJLJJI = set;
            List<ResolveInfo> queryIntentServices = this.LJLIL.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (((HashSet) set).contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission == null) {
                        hashSet2.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!((HashMap) this.LJLJI).containsKey(componentName3)) {
                    ((HashMap) this.LJLJI).put(componentName3, new AnonymousClass075(componentName3));
                }
            }
            Iterator it2 = ((HashMap) this.LJLJI).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet2.contains(entry.getKey())) {
                    AnonymousClass075 anonymousClass0754 = (AnonymousClass075) entry.getValue();
                    if (anonymousClass0754.LIZIZ) {
                        this.LJLIL.unbindService(this);
                        anonymousClass0754.LIZIZ = false;
                    }
                    anonymousClass0754.LIZJ = null;
                    it2.remove();
                }
            }
        }
        for (AnonymousClass075 anonymousClass0755 : ((HashMap) this.LJLJI).values()) {
            anonymousClass0755.LIZLLL.add(obj);
            LIZ(anonymousClass0755);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLILLLLZI.obtainMessage(2, componentName).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.LJLILLLLZI.obtainMessage(1, new AnonymousClass074(componentName, iBinder)).sendToTarget();
    }
}
