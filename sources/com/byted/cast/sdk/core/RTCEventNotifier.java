package com.byted.cast.sdk.core;

import X.RunnableC90184ZaO;
import X.RunnableC90191ZaV;
import android.os.Handler;
import android.os.HandlerThread;
import com.byted.cast.sdk.IRTCEngineEventListener;
import com.byted.cast.sdk.RTCEngine;
import com.byted.cast.sdk.core.RTCEventNotifier;

/* loaded from: classes29.dex */
public class RTCEventNotifier implements IRTCEngineEventListener {
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public IRTCEngineEventListener mRTCEngineEventListener;

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$1 */
    /* loaded from: classes29.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ RTCEngine.ConnectState val$state;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$1__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onConnectStateChanged(r2);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_byted_cast_sdk_core_RTCEventNotifier$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass1(RTCEngine.ConnectState connectState) {
            r2 = connectState;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$10 */
    /* loaded from: classes29.dex */
    public class AnonymousClass10 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$10__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onResumed();
        }

        public AnonymousClass10() {
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
            boolean LIZ;
            try {
                anonymousClass10.com_byted_cast_sdk_core_RTCEventNotifier$10__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$11 */
    /* loaded from: classes29.dex */
    public class AnonymousClass11 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$11__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onPaused();
        }

        public AnonymousClass11() {
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
            boolean LIZ;
            try {
                anonymousClass11.com_byted_cast_sdk_core_RTCEventNotifier$11__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$12 */
    /* loaded from: classes29.dex */
    public class AnonymousClass12 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$12__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onStopped();
        }

        public AnonymousClass12() {
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
            boolean LIZ;
            try {
                anonymousClass12.com_byted_cast_sdk_core_RTCEventNotifier$12__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$13 */
    /* loaded from: classes29.dex */
    public class AnonymousClass13 implements Runnable {
        public final /* synthetic */ String val$name;
        public final /* synthetic */ String val$userId;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$13__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onConnect(r2, r3);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
            boolean LIZ;
            try {
                anonymousClass13.com_byted_cast_sdk_core_RTCEventNotifier$13__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass13(String str, String str2) {
            r2 = str;
            r3 = str2;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$14 */
    /* loaded from: classes29.dex */
    public class AnonymousClass14 implements Runnable {
        public final /* synthetic */ String val$message;
        public final /* synthetic */ RTCEngine.ExitReason val$reason;
        public final /* synthetic */ String val$userId;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$14__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onDisconnect(r2, r3, r4);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
            boolean LIZ;
            try {
                anonymousClass14.com_byted_cast_sdk_core_RTCEventNotifier$14__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass14(String str, RTCEngine.ExitReason exitReason, String str2) {
            r2 = str;
            r3 = exitReason;
            r4 = str2;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$15 */
    /* loaded from: classes29.dex */
    public class AnonymousClass15 implements Runnable {
        public final /* synthetic */ String val$userId;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$15__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onCancelRequest(r2);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
            boolean LIZ;
            try {
                anonymousClass15.com_byted_cast_sdk_core_RTCEventNotifier$15__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass15(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$16 */
    /* loaded from: classes29.dex */
    public class AnonymousClass16 implements Runnable {
        public final /* synthetic */ String val$meta;
        public final /* synthetic */ String val$userId;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$16__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onRecvMetaData(r2, r3);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
            boolean LIZ;
            try {
                anonymousClass16.com_byted_cast_sdk_core_RTCEventNotifier$16__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass16(String str, String str2) {
            r2 = str;
            r3 = str2;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$17 */
    /* loaded from: classes29.dex */
    public class AnonymousClass17 implements Runnable {
        public final /* synthetic */ float val$ratio;
        public final /* synthetic */ String val$userId;
        public final /* synthetic */ float val$volume;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$17__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onAudioSetVolume(r2, r3, r4);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
            boolean LIZ;
            try {
                anonymousClass17.com_byted_cast_sdk_core_RTCEventNotifier$17__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass17(String str, float f, float f2) {
            r2 = str;
            r3 = f;
            r4 = f2;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$18 */
    /* loaded from: classes29.dex */
    public class AnonymousClass18 implements Runnable {
        public final /* synthetic */ int val$height;
        public final /* synthetic */ int val$roration;
        public final /* synthetic */ String val$userId;
        public final /* synthetic */ int val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$18__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.OnVideoSizeChanged(r2, r3, r4, r5);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
            boolean LIZ;
            try {
                anonymousClass18.com_byted_cast_sdk_core_RTCEventNotifier$18__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass18(String str, int i, int i2, int i3) {
            r2 = str;
            r3 = i;
            r4 = i2;
            r5 = i3;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$2 */
    /* loaded from: classes29.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ String[][] val$logger;
        public final /* synthetic */ String val$userId;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$2__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onLogMonitor(r2, r3);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            boolean LIZ;
            try {
                anonymousClass2.com_byted_cast_sdk_core_RTCEventNotifier$2__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass2(String str, String[][] strArr) {
            r2 = str;
            r3 = strArr;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$3 */
    /* loaded from: classes29.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ int val$code;
        public final /* synthetic */ String val$description;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$3__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onError(r2, r3);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
            boolean LIZ;
            try {
                anonymousClass3.com_byted_cast_sdk_core_RTCEventNotifier$3__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass3(int i, String str) {
            r2 = i;
            r3 = str;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$4 */
    /* loaded from: classes29.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ int val$fps;
        public final /* synthetic */ int val$height;
        public final /* synthetic */ int val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$4__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onConnectSuccess(r2, r3, r4);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
            boolean LIZ;
            try {
                anonymousClass4.com_byted_cast_sdk_core_RTCEventNotifier$4__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass4(int i, int i2, int i3) {
            r2 = i;
            r3 = i2;
            r4 = i3;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$5 */
    /* loaded from: classes29.dex */
    public class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$5__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onCastSuccess();
        }

        public AnonymousClass5() {
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
            boolean LIZ;
            try {
                anonymousClass5.com_byted_cast_sdk_core_RTCEventNotifier$5__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$6 */
    /* loaded from: classes29.dex */
    public class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$6__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onCancelSuccess();
        }

        public AnonymousClass6() {
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
            boolean LIZ;
            try {
                anonymousClass6.com_byted_cast_sdk_core_RTCEventNotifier$6__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$7 */
    /* loaded from: classes29.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ int val$fps;
        public final /* synthetic */ int val$kbps;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$7__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onCastControl(r2, r3);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
            boolean LIZ;
            try {
                anonymousClass7.com_byted_cast_sdk_core_RTCEventNotifier$7__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass7(int i, int i2) {
            r2 = i;
            r3 = i2;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$8 */
    /* loaded from: classes29.dex */
    public class AnonymousClass8 implements Runnable {
        public final /* synthetic */ String val$message;
        public final /* synthetic */ RTCEngine.ExitReason val$reason;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$8__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onDisconnect(r2, r3);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
            boolean LIZ;
            try {
                anonymousClass8.com_byted_cast_sdk_core_RTCEventNotifier$8__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass8(RTCEngine.ExitReason exitReason, String str) {
            r2 = exitReason;
            r3 = str;
        }
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEventNotifier$9 */
    /* loaded from: classes29.dex */
    public class AnonymousClass9 implements Runnable {
        public final /* synthetic */ String val$meta;

        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_core_RTCEventNotifier$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_core_RTCEventNotifier$9__run$___twin___() {
            RTCEventNotifier.this.mRTCEngineEventListener.onRecvMetaData(r2);
        }

        public static void com_byted_cast_sdk_core_RTCEventNotifier$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
            boolean LIZ;
            try {
                anonymousClass9.com_byted_cast_sdk_core_RTCEventNotifier$9__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass9(String str) {
            r2 = str;
        }
    }

    public /* synthetic */ void lambda$onKilled$4() {
        this.mRTCEngineEventListener.onKilled();
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onCancelSuccess() {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.6
            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$6__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onCancelSuccess();
            }

            public AnonymousClass6() {
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_byted_cast_sdk_core_RTCEventNotifier$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onCastSuccess() {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.5
            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$5__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onCastSuccess();
            }

            public AnonymousClass5() {
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_byted_cast_sdk_core_RTCEventNotifier$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onKilled() {
        this.mHandler.post(new RunnableC90184ZaO(0, this));
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onPaused() {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.11
            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$11__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onPaused();
            }

            public AnonymousClass11() {
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_byted_cast_sdk_core_RTCEventNotifier$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onResumed() {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.10
            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$10__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onResumed();
            }

            public AnonymousClass10() {
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_byted_cast_sdk_core_RTCEventNotifier$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onStopped() {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.12
            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$12__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onStopped();
            }

            public AnonymousClass12() {
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                boolean LIZ;
                try {
                    anonymousClass12.com_byted_cast_sdk_core_RTCEventNotifier$12__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void remove() {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandlerThread.quit();
    }

    public RTCEventNotifier(IRTCEngineEventListener iRTCEngineEventListener) {
        HandlerThread handlerThread = new HandlerThread("RTCEventNotifier");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
        this.mRTCEngineEventListener = iRTCEngineEventListener;
    }

    public /* synthetic */ void lambda$onFirstVideoFrame$8(String str) {
        this.mRTCEngineEventListener.onFirstVideoFrame(str);
    }

    public /* synthetic */ void lambda$onIntoBackground$5(String str) {
        this.mRTCEngineEventListener.onIntoBackground(str);
    }

    public /* synthetic */ void lambda$onIntoForeground$6(String str) {
        this.mRTCEngineEventListener.onIntoForeground(str);
    }

    public /* synthetic */ void lambda$onStat$0(String str) {
        this.mRTCEngineEventListener.onStat(str);
    }

    public /* synthetic */ void lambda$onStuckStat$1(String str) {
        this.mRTCEngineEventListener.onStuckStat(str);
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onCancelRequest(String str) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.15
            public final /* synthetic */ String val$userId;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$15__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onCancelRequest(r2);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
                boolean LIZ;
                try {
                    anonymousClass15.com_byted_cast_sdk_core_RTCEventNotifier$15__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass15(String str2) {
                r2 = str2;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onConnectStateChanged(RTCEngine.ConnectState connectState) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.1
            public final /* synthetic */ RTCEngine.ConnectState val$state;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$1__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onConnectStateChanged(r2);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_byted_cast_sdk_core_RTCEventNotifier$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass1(RTCEngine.ConnectState connectState2) {
                r2 = connectState2;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onFirstVideoFrame(final String str) {
        this.mHandler.post(new Runnable() { // from class: X.ZaQ
            @Override // java.lang.Runnable
            public final void run() {
                RTCEventNotifier.this.lambda$onFirstVideoFrame$8(str);
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onIntoBackground(final String str) {
        this.mHandler.post(new Runnable() { // from class: X.ZaN
            @Override // java.lang.Runnable
            public final void run() {
                RTCEventNotifier.this.lambda$onIntoBackground$5(str);
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onIntoForeground(final String str) {
        this.mHandler.post(new Runnable() { // from class: X.ZaP
            @Override // java.lang.Runnable
            public final void run() {
                RTCEventNotifier.this.lambda$onIntoForeground$6(str);
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onRecvMetaData(String str) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.9
            public final /* synthetic */ String val$meta;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$9__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onRecvMetaData(r2);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_byted_cast_sdk_core_RTCEventNotifier$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass9(String str2) {
                r2 = str2;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onStat(String str) {
        this.mHandler.post(new RunnableC90191ZaV(0, this, str));
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onStuckStat(final String str) {
        this.mHandler.post(new Runnable() { // from class: X.ZaU
            @Override // java.lang.Runnable
            public final void run() {
                RTCEventNotifier.this.lambda$onStuckStat$1(str);
            }
        });
    }

    public /* synthetic */ void lambda$onMonitorEvent$3(String str, String str2) {
        this.mRTCEngineEventListener.onMonitorEvent(str, str2);
    }

    public /* synthetic */ void lambda$onSinkLatencyStat$7(String str, String str2) {
        this.mRTCEngineEventListener.onSinkLatencyStat(str, str2);
    }

    public /* synthetic */ void lambda$onSinkStuckStat$2(String str, String str2) {
        this.mRTCEngineEventListener.onSinkStuckStat(str, str2);
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onCastControl(int i, int i2) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.7
            public final /* synthetic */ int val$fps;
            public final /* synthetic */ int val$kbps;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$7__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onCastControl(r2, r3);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                boolean LIZ;
                try {
                    anonymousClass7.com_byted_cast_sdk_core_RTCEventNotifier$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass7(int i3, int i22) {
                r2 = i3;
                r3 = i22;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public boolean onCastRequest(String str, String str2) {
        return this.mRTCEngineEventListener.onCastRequest(str, str2);
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onConnect(String str, String str2) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.13
            public final /* synthetic */ String val$name;
            public final /* synthetic */ String val$userId;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$13__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onConnect(r2, r3);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                boolean LIZ;
                try {
                    anonymousClass13.com_byted_cast_sdk_core_RTCEventNotifier$13__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass13(String str3, String str22) {
                r2 = str3;
                r3 = str22;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onDisconnect(RTCEngine.ExitReason exitReason, String str) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.8
            public final /* synthetic */ String val$message;
            public final /* synthetic */ RTCEngine.ExitReason val$reason;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$8__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onDisconnect(r2, r3);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_byted_cast_sdk_core_RTCEventNotifier$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass8(RTCEngine.ExitReason exitReason2, String str2) {
                r2 = exitReason2;
                r3 = str2;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onError(int i, String str) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.3
            public final /* synthetic */ int val$code;
            public final /* synthetic */ String val$description;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$3__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onError(r2, r3);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_byted_cast_sdk_core_RTCEventNotifier$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass3(int i2, String str2) {
                r2 = i2;
                r3 = str2;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onLogMonitor(String str, String[][] strArr) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.2
            public final /* synthetic */ String[][] val$logger;
            public final /* synthetic */ String val$userId;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$2__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onLogMonitor(r2, r3);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_byted_cast_sdk_core_RTCEventNotifier$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass2(String str2, String[][] strArr2) {
                r2 = str2;
                r3 = strArr2;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onMonitorEvent(final String str, final String str2) {
        this.mHandler.post(new Runnable() { // from class: X.ZaS
            @Override // java.lang.Runnable
            public final void run() {
                RTCEventNotifier.this.lambda$onMonitorEvent$3(str, str2);
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onRecvMetaData(String str, String str2) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.16
            public final /* synthetic */ String val$meta;
            public final /* synthetic */ String val$userId;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$16__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onRecvMetaData(r2, r3);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
                boolean LIZ;
                try {
                    anonymousClass16.com_byted_cast_sdk_core_RTCEventNotifier$16__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass16(String str3, String str22) {
                r2 = str3;
                r3 = str22;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onSinkLatencyStat(final String str, final String str2) {
        this.mHandler.post(new Runnable() { // from class: X.ZaT
            @Override // java.lang.Runnable
            public final void run() {
                RTCEventNotifier.this.lambda$onSinkLatencyStat$7(str, str2);
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onSinkStuckStat(final String str, final String str2) {
        this.mHandler.post(new Runnable() { // from class: X.ZaR
            @Override // java.lang.Runnable
            public final void run() {
                RTCEventNotifier.this.lambda$onSinkStuckStat$2(str, str2);
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onAudioSetVolume(String str, float f, float f2) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.17
            public final /* synthetic */ float val$ratio;
            public final /* synthetic */ String val$userId;
            public final /* synthetic */ float val$volume;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$17__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onAudioSetVolume(r2, r3, r4);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
                boolean LIZ;
                try {
                    anonymousClass17.com_byted_cast_sdk_core_RTCEventNotifier$17__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass17(String str2, float f3, float f22) {
                r2 = str2;
                r3 = f3;
                r4 = f22;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onConnectSuccess(int i, int i2, int i3) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.4
            public final /* synthetic */ int val$fps;
            public final /* synthetic */ int val$height;
            public final /* synthetic */ int val$width;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$4__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onConnectSuccess(r2, r3, r4);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_byted_cast_sdk_core_RTCEventNotifier$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass4(int i4, int i22, int i32) {
                r2 = i4;
                r3 = i22;
                r4 = i32;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void onDisconnect(String str, RTCEngine.ExitReason exitReason, String str2) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.14
            public final /* synthetic */ String val$message;
            public final /* synthetic */ RTCEngine.ExitReason val$reason;
            public final /* synthetic */ String val$userId;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$14__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.onDisconnect(r2, r3, r4);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                boolean LIZ;
                try {
                    anonymousClass14.com_byted_cast_sdk_core_RTCEventNotifier$14__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass14(String str3, RTCEngine.ExitReason exitReason2, String str22) {
                r2 = str3;
                r3 = exitReason2;
                r4 = str22;
            }
        });
    }

    @Override // com.byted.cast.sdk.IRTCEngineEventListener
    public void OnVideoSizeChanged(String str, int i, int i2, int i3) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.sdk.core.RTCEventNotifier.18
            public final /* synthetic */ int val$height;
            public final /* synthetic */ int val$roration;
            public final /* synthetic */ String val$userId;
            public final /* synthetic */ int val$width;

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sdk_core_RTCEventNotifier$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_sdk_core_RTCEventNotifier$18__run$___twin___() {
                RTCEventNotifier.this.mRTCEngineEventListener.OnVideoSizeChanged(r2, r3, r4, r5);
            }

            public static void com_byted_cast_sdk_core_RTCEventNotifier$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
                boolean LIZ;
                try {
                    anonymousClass18.com_byted_cast_sdk_core_RTCEventNotifier$18__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass18(String str2, int i4, int i22, int i32) {
                r2 = str2;
                r3 = i4;
                r4 = i22;
                r5 = i32;
            }
        });
    }
}
