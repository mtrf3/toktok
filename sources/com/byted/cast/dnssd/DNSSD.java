package com.byted.cast.dnssd;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.byted.cast.common.discovery.IDnssdLogger;
import com.byted.cast.dnssd.BrowseListener;
import com.byted.cast.dnssd.DNSSD;
import com.byted.cast.dnssd.DomainListener;
import com.byted.cast.dnssd.InternalDNSSDService;
import com.byted.cast.dnssd.QueryListener;
import com.byted.cast.dnssd.RegisterListener;
import com.byted.cast.dnssd.ResolveListener;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes29.dex */
public abstract class DNSSD implements InternalDNSSDService.DnssdServiceListener {
    public static final int DEFAULT = 4;
    public static final String TAG = C16880lQ.LJLLJ(DNSSD.class);
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public final Context context;
    public final Handler handler;
    public final int serviceTimeout;

    @Override // com.byted.cast.dnssd.InternalDNSSDService.DnssdServiceListener
    public void onServiceStarting() {
    }

    @Override // com.byted.cast.dnssd.InternalDNSSDService.DnssdServiceListener
    public void onServiceStopped() {
    }

    public static int getIfIndexForName(String str) {
        return InternalDNSSD.getIfIndexForName(str);
    }

    public static /* synthetic */ void lambda$queryRecord$1(DNSSDService[] dNSSDServiceArr) {
        dNSSDServiceArr[0].stop();
    }

    public static /* synthetic */ void lambda$resolve$0(DNSSDService[] dNSSDServiceArr) {
        dNSSDServiceArr[0].stop();
    }

    public static Map<String, String> parseTXTRecords(TXTRecord tXTRecord) {
        HashMap hashMap = new HashMap(tXTRecord.size());
        for (int i = 0; i < tXTRecord.size(); i++) {
            try {
                if (!TextUtils.isEmpty(tXTRecord.getKey(i))) {
                    hashMap.put(tXTRecord.getKey(i), tXTRecord.getValueAsString(i));
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Parsing error of ");
                LIZ.append(i);
                LIZ.append(" TXT record:");
                LIZ.append(e);
                Logger.w("RxResolveListener", X1D.LIZIZ(LIZ));
            }
        }
        return hashMap;
    }

    public static void setLogger(IDnssdLogger iDnssdLogger) {
        Logger.setLogger(iDnssdLogger);
    }

    public DNSSDRecordRegistrar createRecordRegistrar(RegisterRecordListener registerRecordListener) {
        onServiceStarting();
        return new InternalDNSSDRecordRegistrar(this, InternalDNSSD.createRecordRegistrar(registerRecordListener));
    }

    public static Map<String, String> parseTXTRecords(byte[] bArr) {
        return parseTXTRecords(new TXTRecord(bArr));
    }

    /* renamed from: com.byted.cast.dnssd.DNSSD$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass1 implements InternalBrowseListener {
        public final /* synthetic */ BrowseListener val$listener;
        public final /* synthetic */ InternalDNSSDService[] val$services;

        @Override // com.byted.cast.dnssd.BaseListener
        public void operationFailed(DNSSDService dNSSDService, final int i) {
            Handler handler = DNSSD.this.handler;
            final BrowseListener browseListener = this.val$listener;
            final InternalDNSSDService[] internalDNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.Za3
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass1.lambda$operationFailed$2(BrowseListener.this, internalDNSSDServiceArr, i);
                }
            });
        }

        public AnonymousClass1(BrowseListener browseListener, InternalDNSSDService[] internalDNSSDServiceArr) {
            this.val$listener = browseListener;
            this.val$services = internalDNSSDServiceArr;
        }

        public static /* synthetic */ void lambda$operationFailed$2(BrowseListener browseListener, InternalDNSSDService[] internalDNSSDServiceArr, int i) {
            browseListener.operationFailed(internalDNSSDServiceArr[0], i);
        }

        @Override // com.byted.cast.dnssd.InternalBrowseListener
        public void serviceFound(DNSSDService dNSSDService, final int i, final int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            Charset charset = DNSSD.UTF_8;
            final String str = new String(bArr, charset);
            final String str2 = new String(bArr2, charset);
            final String str3 = new String(bArr3, charset);
            Handler handler = DNSSD.this.handler;
            final BrowseListener browseListener = this.val$listener;
            final InternalDNSSDService[] internalDNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.Za1
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass1.lambda$serviceFound$0(BrowseListener.this, internalDNSSDServiceArr, i, i2, str, str2, str3);
                }
            });
        }

        @Override // com.byted.cast.dnssd.InternalBrowseListener
        public void serviceLost(DNSSDService dNSSDService, final int i, final int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            Charset charset = DNSSD.UTF_8;
            final String str = new String(bArr, charset);
            final String str2 = new String(bArr2, charset);
            final String str3 = new String(bArr3, charset);
            Handler handler = DNSSD.this.handler;
            final BrowseListener browseListener = this.val$listener;
            final InternalDNSSDService[] internalDNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.Za2
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass1.lambda$serviceLost$1(BrowseListener.this, internalDNSSDServiceArr, i, i2, str, str2, str3);
                }
            });
        }

        public static /* synthetic */ void lambda$serviceFound$0(BrowseListener browseListener, InternalDNSSDService[] internalDNSSDServiceArr, int i, int i2, String str, String str2, String str3) {
            browseListener.serviceFound(internalDNSSDServiceArr[0], i, i2, str, str2, str3);
        }

        public static /* synthetic */ void lambda$serviceLost$1(BrowseListener browseListener, InternalDNSSDService[] internalDNSSDServiceArr, int i, int i2, String str, String str2, String str3) {
            browseListener.serviceLost(internalDNSSDServiceArr[0], i, i2, str, str2, str3);
        }
    }

    /* renamed from: com.byted.cast.dnssd.DNSSD$2, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass2 implements InternalResolveListener {
        public final /* synthetic */ ResolveListener val$listener;
        public final /* synthetic */ DNSSDService[] val$services;
        public final /* synthetic */ Runnable val$timeoutRunnable;

        @Override // com.byted.cast.dnssd.BaseListener
        public void operationFailed(DNSSDService dNSSDService, final int i) {
            DNSSD.this.handler.removeCallbacks(this.val$timeoutRunnable);
            Handler handler = DNSSD.this.handler;
            final ResolveListener resolveListener = this.val$listener;
            final DNSSDService[] dNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.Za4
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass2.lambda$operationFailed$1(ResolveListener.this, dNSSDServiceArr, i);
                }
            });
        }

        public static /* synthetic */ void lambda$operationFailed$1(ResolveListener resolveListener, DNSSDService[] dNSSDServiceArr, int i) {
            resolveListener.operationFailed(dNSSDServiceArr[0], i);
            dNSSDServiceArr[0].stop();
        }

        public AnonymousClass2(Runnable runnable, ResolveListener resolveListener, DNSSDService[] dNSSDServiceArr) {
            this.val$timeoutRunnable = runnable;
            this.val$listener = resolveListener;
            this.val$services = dNSSDServiceArr;
        }

        @Override // com.byted.cast.dnssd.InternalResolveListener
        public void serviceResolved(DNSSDService dNSSDService, final int i, final int i2, byte[] bArr, byte[] bArr2, final int i3, TXTRecord tXTRecord) {
            Charset charset = DNSSD.UTF_8;
            final String str = new String(bArr, charset);
            final String str2 = new String(bArr2, charset);
            final Map<String, String> parseTXTRecords = DNSSD.parseTXTRecords(tXTRecord);
            DNSSD.this.handler.removeCallbacks(this.val$timeoutRunnable);
            Handler handler = DNSSD.this.handler;
            final ResolveListener resolveListener = this.val$listener;
            final DNSSDService[] dNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.Za5
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass2.lambda$serviceResolved$0(ResolveListener.this, dNSSDServiceArr, i, i2, str, str2, i3, parseTXTRecords);
                }
            });
        }

        public static /* synthetic */ void lambda$serviceResolved$0(ResolveListener resolveListener, DNSSDService[] dNSSDServiceArr, int i, int i2, String str, String str2, int i3, Map map) {
            resolveListener.serviceResolved(dNSSDServiceArr[0], i, i2, str, str2, i3, map);
            dNSSDServiceArr[0].stop();
        }
    }

    /* renamed from: com.byted.cast.dnssd.DNSSD$3, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass3 implements InternalRegisterListener {
        public final /* synthetic */ RegisterListener val$listener;
        public final /* synthetic */ DNSSDRegistration[] val$services;

        @Override // com.byted.cast.dnssd.BaseListener
        public void operationFailed(DNSSDService dNSSDService, final int i) {
            Handler handler = DNSSD.this.handler;
            final RegisterListener registerListener = this.val$listener;
            final DNSSDRegistration[] dNSSDRegistrationArr = this.val$services;
            handler.post(new Runnable() { // from class: X.Za9
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass3.lambda$operationFailed$1(RegisterListener.this, dNSSDRegistrationArr, i);
                }
            });
        }

        public AnonymousClass3(RegisterListener registerListener, DNSSDRegistration[] dNSSDRegistrationArr) {
            this.val$listener = registerListener;
            this.val$services = dNSSDRegistrationArr;
        }

        public static /* synthetic */ void lambda$operationFailed$1(RegisterListener registerListener, DNSSDRegistration[] dNSSDRegistrationArr, int i) {
            registerListener.operationFailed(dNSSDRegistrationArr[0], i);
        }

        @Override // com.byted.cast.dnssd.InternalRegisterListener
        public void serviceRegistered(DNSSDRegistration dNSSDRegistration, final int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            Charset charset = DNSSD.UTF_8;
            final String str = new String(bArr, charset);
            final String str2 = new String(bArr2, charset);
            final String str3 = new String(bArr3, charset);
            String str4 = DNSSD.TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("serviceRegistered, regType:");
            LIZ.append(str2);
            LIZ.append(", serviceName:");
            LIZ.append(str);
            LIZ.append(", domain:");
            LIZ.append(str3);
            Logger.d(str4, X1D.LIZIZ(LIZ));
            Handler handler = DNSSD.this.handler;
            final RegisterListener registerListener = this.val$listener;
            final DNSSDRegistration[] dNSSDRegistrationArr = this.val$services;
            handler.post(new Runnable() { // from class: X.Za6
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass3.lambda$serviceRegistered$0(RegisterListener.this, dNSSDRegistrationArr, i, str, str2, str3);
                }
            });
        }

        public static /* synthetic */ void lambda$serviceRegistered$0(RegisterListener registerListener, DNSSDRegistration[] dNSSDRegistrationArr, int i, String str, String str2, String str3) {
            registerListener.serviceRegistered(dNSSDRegistrationArr[0], i, str, str2, str3);
        }
    }

    /* renamed from: com.byted.cast.dnssd.DNSSD$4, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass4 implements InternalQueryListener {
        public final /* synthetic */ boolean val$autoStop;
        public final /* synthetic */ QueryListener val$listener;
        public final /* synthetic */ DNSSDService[] val$services;
        public final /* synthetic */ Runnable val$timeoutRunnable;

        @Override // com.byted.cast.dnssd.BaseListener
        public void operationFailed(DNSSDService dNSSDService, final int i) {
            DNSSD.this.handler.removeCallbacks(this.val$timeoutRunnable);
            Handler handler = DNSSD.this.handler;
            final QueryListener queryListener = this.val$listener;
            final DNSSDService[] dNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.ZaA
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass4.lambda$operationFailed$1(QueryListener.this, dNSSDServiceArr, i);
                }
            });
        }

        public static /* synthetic */ void lambda$operationFailed$1(QueryListener queryListener, DNSSDService[] dNSSDServiceArr, int i) {
            queryListener.operationFailed(dNSSDServiceArr[0], i);
            dNSSDServiceArr[0].stop();
        }

        public AnonymousClass4(Runnable runnable, QueryListener queryListener, DNSSDService[] dNSSDServiceArr, boolean z) {
            this.val$timeoutRunnable = runnable;
            this.val$listener = queryListener;
            this.val$services = dNSSDServiceArr;
            this.val$autoStop = z;
        }

        @Override // com.byted.cast.dnssd.InternalQueryListener
        public void queryAnswered(DNSSDService dNSSDService, final int i, final int i2, byte[] bArr, final int i3, final int i4, final byte[] bArr2, final int i5) {
            final String str = new String(bArr, DNSSD.UTF_8);
            DNSSD.this.handler.removeCallbacks(this.val$timeoutRunnable);
            Handler handler = DNSSD.this.handler;
            final QueryListener queryListener = this.val$listener;
            final DNSSDService[] dNSSDServiceArr = this.val$services;
            final boolean z = this.val$autoStop;
            handler.post(new Runnable() { // from class: X.ZaB
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass4.lambda$queryAnswered$0(QueryListener.this, dNSSDServiceArr, i, i2, str, i3, i4, bArr2, i5, z);
                }
            });
        }

        public static /* synthetic */ void lambda$queryAnswered$0(QueryListener queryListener, DNSSDService[] dNSSDServiceArr, int i, int i2, String str, int i3, int i4, byte[] bArr, int i5, boolean z) {
            queryListener.queryAnswered(dNSSDServiceArr[0], i, i2, str, i3, i4, bArr, i5);
            if (z) {
                dNSSDServiceArr[0].stop();
            }
        }
    }

    /* renamed from: com.byted.cast.dnssd.DNSSD$5, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass5 implements InternalDomainListener {
        public final /* synthetic */ DomainListener val$listener;
        public final /* synthetic */ DNSSDService[] val$services;

        @Override // com.byted.cast.dnssd.BaseListener
        public void operationFailed(DNSSDService dNSSDService, final int i) {
            Handler handler = DNSSD.this.handler;
            final DomainListener domainListener = this.val$listener;
            final DNSSDService[] dNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.ZaE
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass5.lambda$operationFailed$2(DomainListener.this, dNSSDServiceArr, i);
                }
            });
        }

        public AnonymousClass5(DomainListener domainListener, DNSSDService[] dNSSDServiceArr) {
            this.val$listener = domainListener;
            this.val$services = dNSSDServiceArr;
        }

        public static /* synthetic */ void lambda$operationFailed$2(DomainListener domainListener, DNSSDService[] dNSSDServiceArr, int i) {
            domainListener.operationFailed(dNSSDServiceArr[0], i);
        }

        @Override // com.byted.cast.dnssd.InternalDomainListener
        public void domainFound(DNSSDService dNSSDService, final int i, final int i2, byte[] bArr) {
            final String str = new String(bArr, DNSSD.UTF_8);
            Handler handler = DNSSD.this.handler;
            final DomainListener domainListener = this.val$listener;
            final DNSSDService[] dNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.ZaC
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass5.lambda$domainFound$0(DomainListener.this, dNSSDServiceArr, i, i2, str);
                }
            });
        }

        @Override // com.byted.cast.dnssd.InternalDomainListener
        public void domainLost(DNSSDService dNSSDService, final int i, final int i2, byte[] bArr) {
            final String str = new String(bArr, DNSSD.UTF_8);
            Handler handler = DNSSD.this.handler;
            final DomainListener domainListener = this.val$listener;
            final DNSSDService[] dNSSDServiceArr = this.val$services;
            handler.post(new Runnable() { // from class: X.ZaD
                @Override // java.lang.Runnable
                public final void run() {
                    DNSSD.AnonymousClass5.lambda$domainLost$1(DomainListener.this, dNSSDServiceArr, i, i2, str);
                }
            });
        }

        public static /* synthetic */ void lambda$domainFound$0(DomainListener domainListener, DNSSDService[] dNSSDServiceArr, int i, int i2, String str) {
            domainListener.domainFound(dNSSDServiceArr[0], i, i2, str);
        }

        public static /* synthetic */ void lambda$domainLost$1(DomainListener domainListener, DNSSDService[] dNSSDServiceArr, int i, int i2, String str) {
            domainListener.domainLost(dNSSDServiceArr[0], i, i2, str);
        }
    }

    public DNSSDService browse(String str, BrowseListener browseListener) {
        return browse(0, 0, str, "", browseListener);
    }

    public DNSSD(Context context, String str, Handler handler) {
        this.context = C16880lQ.LLLLL(context);
        InternalDNSSD.init(str, null);
        this.handler = handler;
        this.serviceTimeout = 60000;
    }

    public String constructFullName(String str, String str2, String str3) {
        onServiceStarting();
        String constructFullName = InternalDNSSD.constructFullName(str, str2, str3);
        onServiceStopped();
        return constructFullName;
    }

    public DNSSDService enumerateDomains(int i, int i2, DomainListener domainListener) {
        synchronized (this) {
            onServiceStarting();
        }
        InternalDNSSDService internalDNSSDService = new InternalDNSSDService(this, InternalDNSSD.enumerateDomains(i, i2, new AnonymousClass5(domainListener, r2)));
        DNSSDService[] dNSSDServiceArr = {internalDNSSDService};
        return internalDNSSDService;
    }

    public DNSSD(Context context, String str, ILibraryLoader iLibraryLoader) {
        this(context, str, C16880lQ.LLJJJJ(), iLibraryLoader);
    }

    public DNSSD(Context context, String str, Looper looper, ILibraryLoader iLibraryLoader) {
        this.context = C16880lQ.LLLLL(context);
        InternalDNSSD.init(str, iLibraryLoader);
        this.handler = new Handler(looper);
        this.serviceTimeout = 60000;
    }

    public DNSSDService register(String str, String str2, int i, RegisterListener registerListener) {
        return register(0, 0, str, str2, null, null, i, null, registerListener);
    }

    public DNSSD(Context context, String str, Looper looper, int i, ILibraryLoader iLibraryLoader) {
        this.context = C16880lQ.LLLLL(context);
        InternalDNSSD.init(str, iLibraryLoader);
        this.handler = new Handler(looper);
        this.serviceTimeout = i;
    }

    public DNSSDService browse(int i, int i2, String str, String str2, BrowseListener browseListener) {
        synchronized (this) {
            onServiceStarting();
        }
        InternalDNSSDService internalDNSSDService = new InternalDNSSDService(this, InternalDNSSD.browse(i, i2, str, str2, new AnonymousClass1(browseListener, r2)));
        InternalDNSSDService[] internalDNSSDServiceArr = {internalDNSSDService};
        return internalDNSSDService;
    }

    public DNSSDService queryRecord(int i, int i2, String str, int i3, int i4, QueryListener queryListener) {
        return queryRecord(i, i2, str, i3, i4, false, queryListener);
    }

    public int reconfirmRecord(int i, int i2, String str, int i3, int i4, byte[] bArr) {
        onServiceStarting();
        int reconfirmRecord = InternalDNSSD.reconfirmRecord(i, i2, str, i3, i4, bArr);
        onServiceStopped();
        return reconfirmRecord;
    }

    public DNSSDService resolve(int i, int i2, String str, String str2, String str3, ResolveListener resolveListener) {
        synchronized (this) {
            onServiceStarting();
        }
        Runnable runnable = new Runnable() { // from class: X.Za0
            @Override // java.lang.Runnable
            public final void run() {
                DNSSD.lambda$resolve$0(r1);
            }
        };
        final DNSSDService[] dNSSDServiceArr = {new InternalDNSSDService(this, InternalDNSSD.resolve(i, i2, str, str2, str3, new AnonymousClass2(runnable, resolveListener, dNSSDServiceArr)))};
        this.handler.postDelayed(runnable, this.serviceTimeout);
        return dNSSDServiceArr[0];
    }

    public DNSSDService queryRecord(int i, int i2, String str, int i3, int i4, boolean z, QueryListener queryListener) {
        synchronized (this) {
            onServiceStarting();
        }
        Runnable runnable = new Runnable() { // from class: X.ZZz
            @Override // java.lang.Runnable
            public final void run() {
                DNSSD.lambda$queryRecord$1(r1);
            }
        };
        final DNSSDService[] dNSSDServiceArr = {new InternalDNSSDService(this, InternalDNSSD.queryRecord(i, i2, str, i3, i4, new AnonymousClass4(runnable, queryListener, dNSSDServiceArr, z)))};
        if (z) {
            this.handler.postDelayed(runnable, this.serviceTimeout);
        }
        return dNSSDServiceArr[0];
    }

    public DNSSDRegistration register(int i, int i2, String str, String str2, String str3, String str4, int i3, TXTRecord tXTRecord, RegisterListener registerListener) {
        String str5 = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register, regType:");
        LIZ.append(str2);
        LIZ.append(", serviceName:");
        LIZ.append(str);
        LIZ.append(", port:");
        LIZ.append(i3);
        Logger.i(str5, X1D.LIZIZ(LIZ));
        onServiceStarting();
        InternalDNSSDRegistration internalDNSSDRegistration = new InternalDNSSDRegistration(this, InternalDNSSD.register(i, i2, str, str2, str3, str4, i3, tXTRecord, new AnonymousClass3(registerListener, r2)));
        DNSSDRegistration[] dNSSDRegistrationArr = {internalDNSSDRegistration};
        return internalDNSSDRegistration;
    }
}
