package com.ss.android.ugc.effectmanager.knadapt;

import X.C15180ig;
import X.InterfaceC13850gX;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt$commit$1 implements InterfaceC13850gX {
    public final /* synthetic */ InterfaceC88472Yns $callbackInMainThread;
    public final /* synthetic */ Object $data;
    public final /* synthetic */ InterfaceC88472Yns $runnable;
    public int level;
    public long modifyTime;
    public final String id = "";
    public String tag = "EffectManagerAdapter";

    @Override // X.InterfaceC13850gX
    public void cancel() {
    }

    @Override // X.InterfaceC13850gX
    public void pause() {
    }

    @Override // X.InterfaceC13850gX
    public void run() {
        final Object invoke = this.$runnable.invoke(this.$data);
        C15180ig.LIZ(new Runnable() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$commit$1$run$1
            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_effectmanager_knadapt_ListenerAdaptExtKt$commit$1$run$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_ss_android_ugc_effectmanager_knadapt_ListenerAdaptExtKt$commit$1$run$1__run$___twin___() {
                ListenerAdaptExtKt$commit$1.this.$callbackInMainThread.invoke(invoke);
            }

            public static void com_ss_android_ugc_effectmanager_knadapt_ListenerAdaptExtKt$commit$1$run$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ListenerAdaptExtKt$commit$1$run$1 listenerAdaptExtKt$commit$1$run$1) {
                boolean LIZ;
                try {
                    listenerAdaptExtKt$commit$1$run$1.com_ss_android_ugc_effectmanager_knadapt_ListenerAdaptExtKt$commit$1$run$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC13850gX
    public String getId() {
        return this.id;
    }

    @Override // X.InterfaceC13850gX
    public int getLevel() {
        return this.level;
    }

    @Override // X.InterfaceC13850gX
    public long getModifyTime() {
        return this.modifyTime;
    }

    public String getTag() {
        return this.tag;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    @Override // X.InterfaceC13850gX
    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setTag(String str) {
        o.LJIIJ(str, "<set-?>");
        this.tag = str;
    }

    public ListenerAdaptExtKt$commit$1(InterfaceC88472Yns interfaceC88472Yns, Object obj, InterfaceC88472Yns interfaceC88472Yns2) {
        this.$runnable = interfaceC88472Yns;
        this.$data = obj;
        this.$callbackInMainThread = interfaceC88472Yns2;
    }
}
