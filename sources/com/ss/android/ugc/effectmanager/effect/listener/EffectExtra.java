package com.ss.android.ugc.effectmanager.effect.listener;

import X.C84448XCi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectExtra {
    public static final Companion Companion = new Companion();
    public int dependentModelCount;
    public int downloadModelCount;
    public int parallelDefaultCount;
    public int parallelTotalCount;

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EffectExtra create(C84448XCi result) {
            o.LJIIJ(result, "result");
            EffectExtra effectExtra = new EffectExtra();
            effectExtra.dependentModelCount = result.LIZIZ;
            effectExtra.downloadModelCount = result.LIZ;
            effectExtra.parallelTotalCount = result.LIZJ;
            effectExtra.parallelDefaultCount = result.LIZLLL;
            return effectExtra;
        }
    }

    public final int getDependentModelCount() {
        return this.dependentModelCount;
    }

    public final int getDownloadModelCount() {
        return this.downloadModelCount;
    }

    public final int getParallelDefaultCount() {
        return this.parallelDefaultCount;
    }

    public final int getParallelTotalCount() {
        return this.parallelTotalCount;
    }
}
