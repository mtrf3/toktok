package androidx.media;

import X.C09O;
import X.C09R;
import X.C09V;
import X.C1BG;
import X.C1HQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C40121ho;
import X.C45661qk;
import X.C84763XOl;
import Y.IDRunnableS0S1300000;
import Y.IDRunnableS29S0200000;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final /* synthetic */ int LJLJJLL = 0;
    public C1BG LJLIL;
    public final C09O LJLILLLLZI = new C09O(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList<C09O> LJLJI = new ArrayList<>();
    public final C1HQ<IBinder, C09O> LJLJJI = new C1HQ<>();
    public final C09V LJLJJL = new Handler(this) { // from class: X.09V
        public final C09T LIZ;

        {
            this.LIZ = new C09T(this);
        }

        public final void LIZ(Runnable runnable) {
            if (C16880lQ.LLLLIIIILLL() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String[] packagesForUid;
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    final Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.LIZ(bundle);
                    final C09T c09t = this.LIZ;
                    final String string = data.getString("data_package_name");
                    final int i = data.getInt("data_calling_pid");
                    final int i2 = data.getInt("data_calling_uid");
                    final C1BI c1bi = new C1BI(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = c09t.LIZ;
                    if (string == null) {
                        mediaBrowserServiceCompat.getClass();
                    } else {
                        PackageManager packageManager = mediaBrowserServiceCompat.getPackageManager();
                        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101310, "android/content/pm/PackageManager", "getPackagesForUid", packageManager, new Object[]{Integer.valueOf(i2)}, "java.lang.String[]", new C65300Pk0(false, "(I)[Ljava/lang/String;", "4523360066856101282"));
                        if (LIZJ.LIZ) {
                            packagesForUid = (String[]) LIZJ.LIZIZ;
                        } else {
                            packagesForUid = packageManager.getPackagesForUid(i2);
                        }
                        for (String str : packagesForUid) {
                            if (str.equals(string)) {
                                c09t.LIZ.LJLJJL.LIZ(new Runnable(i, i2, bundle, c09t, c1bi, string) { // from class: X.09W
                                    public final /* synthetic */ C09U LJLIL;
                                    public final /* synthetic */ String LJLILLLLZI;
                                    public final /* synthetic */ int LJLJI;
                                    public final /* synthetic */ int LJLJJI;
                                    public final /* synthetic */ C09T LJLJJL;

                                    public final void LIZ() {
                                        this.LJLJJL.LIZ.LJLJJI.remove(((C1BI) this.LJLIL).LIZ());
                                        new C09O(this.LJLJJL.LIZ, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLIL);
                                        this.LJLJJL.LIZ.getClass();
                                        this.LJLJJL.LIZ.LIZ(this.LJLILLLLZI);
                                        this.LJLJJL.LIZ.getClass();
                                        try {
                                            C1BI c1bi2 = (C1BI) this.LJLIL;
                                            c1bi2.getClass();
                                            Message obtain = Message.obtain();
                                            obtain.what = 2;
                                            obtain.arg1 = 2;
                                            obtain.setData(null);
                                            c1bi2.LIZ.send(obtain);
                                        } catch (RemoteException unused) {
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean LIZ;
                                        try {
                                            LIZ();
                                        } finally {
                                            if (LIZ) {
                                            }
                                        }
                                    }

                                    {
                                        this.LJLJJL = c09t;
                                        this.LJLIL = c1bi;
                                        this.LJLILLLLZI = string;
                                    }
                                });
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException(C012403c.LIZLLL("Package/uid mismatch: uid=", i2, " package=", string));
                case 2:
                    C09T c09t2 = this.LIZ;
                    c09t2.LIZ.LJLJJL.LIZ(new IDRunnableS29S0200000(new C1BI(message.replyTo), c09t2, 6));
                    return;
                case 3:
                    final Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.LIZ(bundle2);
                    final C09T c09t3 = this.LIZ;
                    final String string2 = data.getString("data_media_item_id");
                    final IBinder LIZ = C021406o.LIZ(data, "data_callback_token");
                    final C1BI c1bi2 = new C1BI(message.replyTo);
                    c09t3.LIZ.LJLJJL.LIZ(new Runnable() { // from class: X.09X
                        public final void LIZ() {
                            final C09O orDefault = C09T.this.LIZ.LJLJJI.getOrDefault(((C1BI) c1bi2).LIZ(), null);
                            if (orDefault == null) {
                                return;
                            }
                            final MediaBrowserServiceCompat mediaBrowserServiceCompat2 = C09T.this.LIZ;
                            final String str2 = string2;
                            IBinder iBinder = LIZ;
                            final Bundle bundle3 = bundle2;
                            mediaBrowserServiceCompat2.getClass();
                            List<C15070iV<IBinder, Bundle>> list = orDefault.LJLJJL.get(str2);
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            for (C15070iV<IBinder, Bundle> c15070iV : list) {
                                if (iBinder == c15070iV.LIZ) {
                                    Bundle bundle4 = c15070iV.LIZIZ;
                                    if (bundle3 == bundle4) {
                                        return;
                                    }
                                    if (bundle3 == null) {
                                        if (bundle4.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle4 == null) {
                                        if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == bundle4.getInt("android.media.browse.extra.PAGE", -1) && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                                        return;
                                    }
                                }
                            }
                            list.add(new C15070iV<>(iBinder, bundle3));
                            orDefault.LJLJJL.put(str2, list);
                            C09R<List<MediaBrowserCompat.MediaItem>> c09r = new C09R<List<MediaBrowserCompat.MediaItem>>(str2) { // from class: X.1BJ
                                public final /* synthetic */ Bundle LJII = null;

                                @Override // X.C09R
                                public final void LIZIZ() {
                                    if (MediaBrowserServiceCompat.this.LJLJJI.getOrDefault(((C1BI) orDefault.LJLJJI).LIZ(), null) != orDefault) {
                                        return;
                                    }
                                    if ((this.LIZLLL & 1) != 0) {
                                        MediaBrowserServiceCompat.this.getClass();
                                    }
                                    try {
                                        ((C1BI) orDefault.LJLJJI).LIZIZ(str2, null, bundle3, this.LJII);
                                    } catch (RemoteException unused) {
                                    }
                                }
                            };
                            if (bundle3 == null) {
                                mediaBrowserServiceCompat2.LIZIZ(str2, c09r);
                            } else {
                                c09r.LIZLLL = 1;
                                mediaBrowserServiceCompat2.LIZIZ(str2, c09r);
                            }
                            if (c09r.LIZ()) {
                                return;
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("onLoadChildren must call detach() or sendResult() before returning for package=");
                            throw new IllegalStateException(C025908h.LIZIZ(LIZ2, orDefault.LJLIL, " id=", str2, LIZ2));
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ2;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }
                    });
                    return;
                case 4:
                    C09T c09t4 = this.LIZ;
                    c09t4.LIZ.LJLJJL.LIZ(new IDRunnableS0S1300000(c09t4, new C1BI(message.replyTo), data.getString("data_media_item_id"), C021406o.LIZ(data, "data_callback_token"), 0));
                    return;
                case 5:
                    C09T c09t5 = this.LIZ;
                    String string3 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C1BI c1bi3 = new C1BI(message.replyTo);
                    c09t5.getClass();
                    if (TextUtils.isEmpty(string3) || resultReceiver == null) {
                        return;
                    }
                    c09t5.LIZ.LJLJJL.LIZ(new IDRunnableS0S1300000(c09t5, c1bi3, string3, resultReceiver, 1));
                    return;
                case 6:
                    final Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.LIZ(bundle3);
                    final C09T c09t6 = this.LIZ;
                    final C1BI c1bi4 = new C1BI(message.replyTo);
                    final String string4 = data.getString("data_package_name");
                    final int i3 = data.getInt("data_calling_pid");
                    final int i4 = data.getInt("data_calling_uid");
                    c09t6.LIZ.LJLJJL.LIZ(new Runnable(i4, i3, bundle3, c09t6, c1bi4, string4) { // from class: X.09Y
                        public final /* synthetic */ C09U LJLIL;
                        public final /* synthetic */ int LJLILLLLZI;
                        public final /* synthetic */ String LJLJI;
                        public final /* synthetic */ int LJLJJI;
                        public final /* synthetic */ C09T LJLJJL;

                        /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
                        
                            if (r5 == null) goto L14;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
                        
                            r5 = new X.C09O(r11.LJLJJL.LIZ, r11.LJLJI, r11.LJLJJI, r11.LJLILLLLZI, r11.LJLIL);
                         */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ() {
                            /*
                                r11 = this;
                                X.09U r0 = r11.LJLIL
                                X.1BI r0 = (X.C1BI) r0
                                android.os.IBinder r1 = r0.LIZ()
                                X.09T r0 = r11.LJLJJL
                                androidx.media.MediaBrowserServiceCompat r0 = r0.LIZ
                                X.1HQ<android.os.IBinder, X.09O> r0 = r0.LJLJJI
                                r0.remove(r1)
                                X.09T r0 = r11.LJLJJL
                                androidx.media.MediaBrowserServiceCompat r0 = r0.LIZ
                                java.util.ArrayList<X.09O> r0 = r0.LJLJI
                                java.util.Iterator r4 = r0.iterator()
                            L1b:
                                boolean r0 = r4.hasNext()
                                r5 = 0
                                if (r0 == 0) goto L50
                                java.lang.Object r3 = r4.next()
                                X.09O r3 = (X.C09O) r3
                                int r2 = r3.LJLJI
                                int r0 = r11.LJLILLLLZI
                                if (r2 != r0) goto L1b
                                java.lang.String r0 = r11.LJLJI
                                boolean r0 = android.text.TextUtils.isEmpty(r0)
                                if (r0 != 0) goto L3a
                                int r0 = r11.LJLJJI
                                if (r0 > 0) goto L4b
                            L3a:
                                X.09O r5 = new X.09O
                                X.09T r0 = r11.LJLJJL
                                androidx.media.MediaBrowserServiceCompat r6 = r0.LIZ
                                java.lang.String r7 = r3.LJLIL
                                int r8 = r3.LJLILLLLZI
                                int r9 = r3.LJLJI
                                X.09U r10 = r11.LJLIL
                                r5.<init>(r6, r7, r8, r9, r10)
                            L4b:
                                r4.remove()
                                if (r5 != 0) goto L61
                            L50:
                                X.09O r5 = new X.09O
                                X.09T r0 = r11.LJLJJL
                                androidx.media.MediaBrowserServiceCompat r6 = r0.LIZ
                                java.lang.String r7 = r11.LJLJI
                                int r8 = r11.LJLJJI
                                int r9 = r11.LJLILLLLZI
                                X.09U r10 = r11.LJLIL
                                r5.<init>(r6, r7, r8, r9, r10)
                            L61:
                                X.09T r0 = r11.LJLJJL
                                androidx.media.MediaBrowserServiceCompat r0 = r0.LIZ
                                X.1HQ<android.os.IBinder, X.09O> r0 = r0.LJLJJI
                                r0.put(r1, r5)
                                r0 = 0
                                r1.linkToDeath(r5, r0)     // Catch: android.os.RemoteException -> L6e
                            L6e:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C09Y.LIZ():void");
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ2;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }

                        {
                            this.LJLJJL = c09t6;
                            this.LJLIL = c1bi4;
                            this.LJLJI = string4;
                        }
                    });
                    return;
                case 7:
                    C09T c09t7 = this.LIZ;
                    c09t7.LIZ.LJLJJL.LIZ(new IDRunnableS29S0200000(new C1BI(message.replyTo), c09t7, 7));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.LIZ(bundle4);
                    C09T c09t8 = this.LIZ;
                    String string5 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C1BI c1bi5 = new C1BI(message.replyTo);
                    c09t8.getClass();
                    if (TextUtils.isEmpty(string5) || resultReceiver2 == null) {
                        return;
                    }
                    c09t8.LIZ.LJLJJL.LIZ(new IDRunnableS0S1300000(c09t8, c1bi5, string5, bundle4, resultReceiver2, 2));
                    return;
                case 9:
                    final Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.LIZ(bundle5);
                    final C09T c09t9 = this.LIZ;
                    final String string6 = data.getString("data_custom_action");
                    final ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    final C1BI c1bi6 = new C1BI(message.replyTo);
                    c09t9.getClass();
                    if (TextUtils.isEmpty(string6) || resultReceiver3 == null) {
                        return;
                    }
                    c09t9.LIZ.LJLJJL.LIZ(new Runnable() { // from class: X.09Z
                        /* JADX WARN: Type inference failed for: r1v2, types: [X.1BM, X.09R] */
                        public final void LIZ() {
                            if (C09T.this.LIZ.LJLJJI.getOrDefault(((C1BI) c1bi6).LIZ(), null) == null) {
                                return;
                            }
                            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = C09T.this.LIZ;
                            final String str2 = string6;
                            Bundle bundle6 = bundle5;
                            final ResultReceiver resultReceiver4 = resultReceiver3;
                            mediaBrowserServiceCompat2.getClass();
                            ?? r1 = new C09R<Bundle>(str2) { // from class: X.1BM
                                @Override // X.C09R
                                public final void LIZIZ() {
                                    resultReceiver4.LIZIZ(0, null);
                                }

                                public final void LIZLLL() {
                                    resultReceiver4.LIZIZ(-1, null);
                                }
                            };
                            if (!r1.LIZIZ && !r1.LIZJ) {
                                r1.LIZJ = true;
                                r1.LIZLLL();
                                if (r1.LIZ()) {
                                    return;
                                }
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
                                LIZ2.append(str2);
                                LIZ2.append(" extras=");
                                LIZ2.append(bundle6);
                                throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                            }
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("sendError() called when either sendResult() or sendError() had already been called for: ");
                            LIZ3.append((Object) str2);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ3));
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ2;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }
                    });
                    return;
                default:
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    };

    public abstract void LIZ(String str);

    public abstract void LIZIZ(String str, C09R<List<MediaBrowserCompat.MediaItem>> c09r);

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.LJLIL = new C45661qk(this) { // from class: X.29d
                {
                    super(this);
                }
            };
        } else if (i >= 26) {
            this.LJLIL = new C45661qk(this);
        } else if (i >= 23) {
            this.LJLIL = new C40121ho(this);
        } else {
            this.LJLIL = new C1BG(this);
        }
        this.LJLIL.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.LJLIL.LIZIZ.onBind(intent);
    }
}
