package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes29.dex */
public final class ZYJ {
    public static final C90469Zez LJII = new C90469Zez("CastContext");
    public static final Object LJIIIIZZ = new Object();
    public static ZYJ LJIIIZ;
    public final Context LIZ;
    public final InterfaceC90110ZYc LIZIZ;
    public final ZYS LIZJ;
    public final ZYZ LIZLLL;
    public final CastOptions LJ;
    public final List<ZYW> LJFF;
    public C90731ZjD LJI;

    public final ZYS LIZ() {
        QH7.LJ("Must be called from the main thread.");
        return this.LIZJ;
    }

    public static ZYJ LIZIZ(Context context) {
        QH7.LJ("Must be called from the main thread.");
        if (LJIIIZ == null) {
            synchronized (LJIIIIZZ) {
                if (LJIIIZ == null) {
                    ZYN LIZJ = LIZJ(C16880lQ.LLLLL(context));
                    CastOptions castOptions = LIZJ.getCastOptions(C16880lQ.LLLLL(context));
                    try {
                        LJIIIZ = new ZYJ(context, castOptions, LIZJ.getAdditionalSessionProviders(C16880lQ.LLLLL(context)), new BinderC90889Zll(ZY5.LIZJ(context), castOptions));
                    } catch (C90113ZYf e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return LJIIIZ;
    }

    public static ZYN LIZJ(Context context) {
        try {
            Bundle bundle = QCX.LIZ(context).LIZ(128, context.getPackageName()).metaData;
            if (bundle == null) {
                LJII.getClass();
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (ZYN) Class.forName(string).asSubclass(ZYN.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public ZYJ(Context context, CastOptions castOptions, List<ZYW> list, BinderC90889Zll binderC90889Zll) {
        C90731ZjD c90731ZjD;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL;
        this.LJ = castOptions;
        this.LJFF = list;
        if (!TextUtils.isEmpty(castOptions.zza)) {
            c90731ZjD = new C90731ZjD(LLLLL, castOptions, binderC90889Zll);
        } else {
            c90731ZjD = null;
        }
        this.LJI = c90731ZjD;
        HashMap hashMap = new HashMap();
        C90731ZjD c90731ZjD2 = this.LJI;
        if (c90731ZjD2 != null) {
            hashMap.put(c90731ZjD2.LIZIZ, c90731ZjD2.LIZJ);
        }
        if (list != null) {
            for (ZYW zyw : list) {
                QH7.LJIIIZ(zyw, "Additional SessionProvider must not be null.");
                String str = zyw.LIZIZ;
                QH7.LJFF("Category for SessionProvider must not be null or empty string.", str);
                QH7.LIZ(C16880lQ.LLLZ("SessionProvider for category %s already added", new Object[]{str}), !hashMap.containsKey(str));
                hashMap.put(str, zyw.LIZJ);
            }
        }
        try {
            Context context2 = this.LIZ;
            InterfaceC90110ZYc LLZZZIL = C90282Zby.LIZ(context2).LLZZZIL(new BinderC68153Qov(C16880lQ.LLLLL(context2)), castOptions, binderC90889Zll, hashMap);
            this.LIZIZ = LLZZZIL;
            try {
                this.LIZLLL = new ZYZ(LLZZZIL.LJIIIIZZ());
                try {
                    InterfaceC90111ZYd LIZJ = LLZZZIL.LIZJ();
                    Context context3 = this.LIZ;
                    ZYS zys = new ZYS(LIZJ, context3);
                    this.LIZJ = zys;
                    new C90905Zm1(context3);
                    new ZYO();
                    C90319ZcZ c90319ZcZ = binderC90889Zll.LJLJI;
                    if (c90319ZcZ != null) {
                        c90319ZcZ.LIZJ = zys;
                    }
                    final C90905Zm1 c90905Zm1 = new C90905Zm1(this.LIZ);
                    final String[] strArr = {"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"};
                    C67887Qkd c67887Qkd = new C67887Qkd();
                    c67887Qkd.LIZ = new InterfaceC67935QlP(c90905Zm1, strArr) { // from class: X.Zkm
                        public final /* synthetic */ String[] LJLIL;

                        {
                            this.LJLIL = strArr;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC67935QlP
                        public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                            String[] strArr2 = this.LJLIL;
                            BinderC90912Zm8 binderC90912Zm8 = new BinderC90912Zm8((C67649Qgn) obj);
                            C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                            Parcel LJLJI = c90232ZbA.LJLJI();
                            C90257ZbZ.LIZJ(LJLJI, binderC90912Zm8);
                            LJLJI.writeStringArray(strArr2);
                            c90232ZbA.LLZZJLIL(LJLJI, 5);
                        }
                    };
                    c67887Qkd.LIZJ = new Feature[]{C90069ZWn.LIZIZ};
                    c67887Qkd.LIZIZ = false;
                    c67887Qkd.LIZLLL = 8425;
                    c90905Zm1.LIZLLL(0, c67887Qkd.LIZ()).LJ(new InterfaceC67677QhF() { // from class: X.ZhL
                        @Override // X.InterfaceC67677QhF
                        public final void onSuccess(Object obj) {
                            final ZYJ zyj = ZYJ.this;
                            Bundle bundle = (Bundle) obj;
                            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
                            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
                            if (!z) {
                                if (z2) {
                                    z2 = true;
                                } else {
                                    return;
                                }
                            }
                            String packageName = zyj.LIZ.getPackageName();
                            String LLLZI = C16880lQ.LLLZI(Locale.ROOT, "%s.%s", new Object[]{zyj.LIZ.getPackageName(), "client_cast_analytics_data"});
                            C67350Qby.LIZIZ(zyj.LIZ);
                            C67360Qc8 LIZ = C67350Qby.LIZ().LIZJ(C67220QZs.LJ).LIZ("CAST_SENDER_SDK", new C67365QcD("proto"), new InterfaceC67369QcH() { // from class: X.ZhP
                                @Override // X.InterfaceC67369QcH
                                public final Object apply(Object obj2) {
                                    AbstractC90950Zmk abstractC90950Zmk = (AbstractC90950Zmk) obj2;
                                    try {
                                        int LJFF = abstractC90950Zmk.LJFF();
                                        byte[] bArr = new byte[LJFF];
                                        C90898Zlu c90898Zlu = new C90898Zlu(bArr, LJFF);
                                        InterfaceC90399Zdr LIZ2 = C90375ZdT.LIZJ.LIZ(C91028Zo0.class);
                                        C90405Zdx c90405Zdx = c90898Zlu.LIZ;
                                        if (c90405Zdx == null) {
                                            c90405Zdx = new C90405Zdx(c90898Zlu);
                                        }
                                        LIZ2.LJI(abstractC90950Zmk, c90405Zdx);
                                        if (c90898Zlu.LJIJJLI() == 0) {
                                            return bArr;
                                        }
                                        throw new IllegalStateException("Did not write as much data as expected.");
                                    } catch (IOException e) {
                                        String name = abstractC90950Zmk.getClass().getName();
                                        StringBuilder sb = new StringBuilder(name.length() + 72);
                                        sb.append("Serializing ");
                                        sb.append(name);
                                        sb.append(" to a byte array threw an IOException (should never happen).");
                                        throw new RuntimeException(sb.toString(), e);
                                    }
                                }
                            });
                            long j = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE");
                            final SharedPreferences LIZIZ = F9J.LIZIZ(C16880lQ.LLLLL(zyj.LIZ), 0, LLLZI);
                            final C90307ZcN c90307ZcN = new C90307ZcN(LIZIZ, LIZ, j);
                            if (z) {
                                final C90905Zm1 c90905Zm12 = new C90905Zm1(zyj.LIZ);
                                final String[] strArr2 = {"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"};
                                C67887Qkd c67887Qkd2 = new C67887Qkd();
                                c67887Qkd2.LIZ = new InterfaceC67935QlP(c90905Zm12, strArr2) { // from class: X.Zko
                                    public final /* synthetic */ String[] LJLIL;

                                    {
                                        this.LJLIL = strArr2;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // X.InterfaceC67935QlP
                                    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj2) {
                                        String[] strArr3 = this.LJLIL;
                                        BinderC90903Zlz binderC90903Zlz = new BinderC90903Zlz((C67649Qgn) obj2);
                                        C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                                        Parcel LJLJI = c90232ZbA.LJLJI();
                                        C90257ZbZ.LIZJ(LJLJI, binderC90903Zlz);
                                        LJLJI.writeStringArray(strArr3);
                                        c90232ZbA.LLZZJLIL(LJLJI, 6);
                                    }
                                };
                                c67887Qkd2.LIZJ = new Feature[]{C90069ZWn.LIZJ};
                                c67887Qkd2.LIZIZ = false;
                                c67887Qkd2.LIZLLL = 8426;
                                c90905Zm12.LIZLLL(0, c67887Qkd2.LIZ()).LJ(new InterfaceC67677QhF() { // from class: X.ZhM
                                    @Override // X.InterfaceC67677QhF
                                    public final void onSuccess(Object obj2) {
                                        ZYJ zyj2 = ZYJ.this;
                                        C90307ZcN c90307ZcN2 = c90307ZcN;
                                        QH7.LJIIIIZZ(zyj2.LIZJ);
                                        zyj2.LIZJ.LIZ(new C90662Zi6(new C90244ZbM(LIZIZ, c90307ZcN2, (Bundle) obj2, zyj2.LIZ.getPackageName())), C90613ZhJ.class);
                                    }
                                });
                            }
                            if (z2) {
                                synchronized (C90272Zbo.class) {
                                    if (C90272Zbo.LJIIJ == null) {
                                        C90272Zbo.LJIIJ = new C90272Zbo(LIZIZ, c90307ZcN, packageName);
                                    }
                                }
                                C90272Zbo.LIZ(EnumC90770Zjq.CAST_CONTEXT);
                            }
                        }
                    });
                    final C90905Zm1 c90905Zm12 = new C90905Zm1(this.LIZ);
                    final String[] strArr2 = {"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"};
                    C67887Qkd c67887Qkd2 = new C67887Qkd();
                    c67887Qkd2.LIZ = new InterfaceC67935QlP(c90905Zm12, strArr2) { // from class: X.Zkn
                        public final /* synthetic */ String[] LJLIL;

                        {
                            this.LJLIL = strArr2;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC67935QlP
                        public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                            String[] strArr3 = this.LJLIL;
                            BinderC90904Zm0 binderC90904Zm0 = new BinderC90904Zm0((C67649Qgn) obj);
                            C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                            Parcel LJLJI = c90232ZbA.LJLJI();
                            C90257ZbZ.LIZJ(LJLJI, binderC90904Zm0);
                            LJLJI.writeStringArray(strArr3);
                            c90232ZbA.LLZZJLIL(LJLJI, 7);
                        }
                    };
                    c67887Qkd2.LIZJ = new Feature[]{C90069ZWn.LIZLLL};
                    c67887Qkd2.LIZIZ = false;
                    c67887Qkd2.LIZLLL = 8427;
                    c90905Zm12.LIZLLL(0, c67887Qkd2.LIZ()).LJ(new InterfaceC67677QhF() { // from class: X.ZhK
                        @Override // X.InterfaceC67677QhF
                        public final void onSuccess(Object obj) {
                            ZYJ.this.getClass();
                            new ZYL((Bundle) obj);
                        }
                    });
                } catch (RemoteException e) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e);
                }
            } catch (RemoteException e2) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e2);
            }
        } catch (RemoteException e3) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e3);
        }
    }
}
