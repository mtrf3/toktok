package com.kakao.sdk.common.util;

import X.C221108m2;
import X.C38346F3e;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.ORZ;
import X.TBT;
import X.X1D;
import com.kakao.sdk.common.KakaoSdk;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SdkLog {
    public static final Companion Companion = new Companion();
    public static final C5H3<SdkLog> instance$delegate = C221108m2.LIZIZ(SdkLog$Companion$instance$2.INSTANCE);
    public final C5H3 dateFormat$delegate;
    public final boolean enabled;
    public final C5H3 logs$delegate;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;

        static {
            TBT tbt = new TBT(C65352Pkq.LIZ(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/common/util/SdkLog;");
            C65352Pkq.LIZ.getClass();
            $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final SdkLog getInstance() {
            return SdkLog.instance$delegate.getValue();
        }

        public final String log() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("\n                ==== sdk version: 2.11.2\n                ==== app version: ");
            LIZ.append(KakaoSdk.INSTANCE.getApplicationContextInfo().getAppVer());
            LIZ.append("\n            ");
            return o.LJIILLIIL(ORZ.LLD(getInstance().getLogs(), "\n", "\n", null, null, 60), C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ)));
        }

        public Companion() {
        }

        public final void d(Object obj) {
            getInstance().log(obj, SdkLogLevel.D);
        }

        public final void e(Object obj) {
            getInstance().log(obj, SdkLogLevel.E);
        }

        public final void i(Object obj) {
            getInstance().log(obj, SdkLogLevel.I);
        }

        public final void v(Object obj) {
            getInstance().log(obj, SdkLogLevel.V);
        }

        public final void w(Object obj) {
            getInstance().log(obj, SdkLogLevel.W);
        }
    }

    public SdkLog() {
        this(false, 1, null);
    }

    public static final SdkLog getInstance() {
        return Companion.getInstance();
    }

    public static final String log() {
        return Companion.log();
    }

    private final SimpleDateFormat getDateFormat() {
        return (SimpleDateFormat) this.dateFormat$delegate.getValue();
    }

    public final LinkedList<String> getLogs() {
        return (LinkedList) this.logs$delegate.getValue();
    }

    public SdkLog(boolean z) {
        this.enabled = z;
        this.logs$delegate = C221108m2.LIZIZ(SdkLog$logs$2.INSTANCE);
        this.dateFormat$delegate = C221108m2.LIZIZ(SdkLog$dateFormat$2.INSTANCE);
    }

    public final void log(Object obj, SdkLogLevel sdkLogLevel) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sdkLogLevel.getSymbol());
        LIZ.append(' ');
        LIZ.append(obj);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (this.enabled && sdkLogLevel.compareTo(SdkLogLevel.I) >= 0) {
            LinkedList<String> logs = getLogs();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((Object) getDateFormat().format(new Date()));
            LIZ2.append(' ');
            LIZ2.append(LIZIZ);
            logs.add(X1D.LIZIZ(LIZ2));
            if (getLogs().size() > 100) {
                getLogs().poll();
            }
        }
    }

    public /* synthetic */ SdkLog(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KakaoSdk.INSTANCE.getLoggingEnabled() : z);
    }
}
