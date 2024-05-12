package com.byted.cast.common.discovery;

import X.V0N;
import X.X1D;
import android.content.Context;
import android.os.Build;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Logger;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.discovery.nsdhelper.NsdHelper;

/* loaded from: classes29.dex */
public class NsdFactory {

    /* renamed from: com.byted.cast.common.discovery.NsdFactory$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$common$discovery$NsdFactory$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$byted$cast$common$discovery$NsdFactory$Type = iArr;
            try {
                iArr[Type.TypeNsdManager.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$common$discovery$NsdFactory$Type[Type.TypeDnssd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$byted$cast$common$discovery$NsdFactory$Type[Type.TypeJmDNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes29.dex */
    public enum Type {
        TypeNsdManager,
        TypeDnssd,
        TypeJmDNS;

        public static Type valueOf(String str) {
            return (Type) V0N.LJJJ(Type.class, str);
        }
    }

    public static INsdHelper createNsdHelper(Type type, Context context, NsdListener nsdListener, String str, ILibraryLoader iLibraryLoader) {
        return createNsdHelper(type, context, null, nsdListener, str, iLibraryLoader);
    }

    public static INsdHelper createNsdHelper(Type type, Context context, ContextManager.CastContext castContext, NsdListener nsdListener, String str, ILibraryLoader iLibraryLoader) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createNsdHelper, type:");
        LIZ.append(type);
        LIZ.append(", linkName:");
        LIZ.append(str);
        Logger.i("NsdFactory", X1D.LIZIZ(LIZ));
        if (Build.VERSION.SDK_INT >= 31 && type != Type.TypeJmDNS) {
            type = Type.TypeNsdManager;
            Logger.i("NsdFactory", "createNsdHelper, API LEVEL >= 31, change to NsdManager");
        }
        int i = AnonymousClass1.$SwitchMap$com$byted$cast$common$discovery$NsdFactory$Type[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                try {
                    return (INsdHelper) Class.forName("com.byted.cast.jmdns.JmDNSHelper").getConstructor(Context.class, NsdListener.class, String.class).newInstance(context, nsdListener, str);
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("jmdns library load failed:");
                    LIZ2.append(e.getMessage());
                    Logger.w("NsdFactory", X1D.LIZIZ(LIZ2));
                    return NsdHelper.createInstance(context, castContext, nsdListener, str);
                }
            }
            try {
                return (INsdHelper) Class.forName("com.byted.cast.dnssd.helper.DnssdHelper").getMethod("createInstance", Context.class, ContextManager.CastContext.class, NsdListener.class, String.class, ILibraryLoader.class, IDnssdLogger.class).invoke(null, context, castContext, nsdListener, str, iLibraryLoader, new MDnsLogger());
            } catch (Exception e2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("dnssd library load failed:");
                LIZ3.append(e2.getMessage());
                Logger.w("NsdFactory", X1D.LIZIZ(LIZ3));
                return NsdHelper.createInstance(context, castContext, nsdListener, str);
            }
        }
        return NsdHelper.createInstance(context, castContext, nsdListener, str);
    }
}
