package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SmartCDNStrategyConfig {

    @InterfaceC65349Pkn("score_min_threshold")
    public int score_min_threshold;

    @InterfaceC65349Pkn("name")
    public String name = "basic";

    @InterfaceC65349Pkn("n_records")
    public int n_records = 2;

    @InterfaceC65349Pkn("n_samples")
    public int n_samples = 1;

    @InterfaceC65349Pkn("mu")
    public int mu = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @InterfaceC65349Pkn("sigma")
    public int sigma = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;

    @InterfaceC65349Pkn("exploration_ratio")
    public float exploration_ratio = 0.1f;

    @InterfaceC65349Pkn("score_norm_ratio")
    public float score_norm_ratio = 0.001f;

    @InterfaceC65349Pkn("score_max_threshold")
    public int score_max_threshold = 10000;

    public final float getExploration_ratio() {
        return this.exploration_ratio;
    }

    public final int getMu() {
        return this.mu;
    }

    public final int getN_records() {
        return this.n_records;
    }

    public final int getN_samples() {
        return this.n_samples;
    }

    public final String getName() {
        return this.name;
    }

    public final int getScore_max_threshold() {
        return this.score_max_threshold;
    }

    public final int getScore_min_threshold() {
        return this.score_min_threshold;
    }

    public final float getScore_norm_ratio() {
        return this.score_norm_ratio;
    }

    public final int getSigma() {
        return this.sigma;
    }

    public final void setExploration_ratio(float f) {
        this.exploration_ratio = f;
    }

    public final void setMu(int i) {
        this.mu = i;
    }

    public final void setN_records(int i) {
        this.n_records = i;
    }

    public final void setN_samples(int i) {
        this.n_samples = i;
    }

    public final void setName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.name = str;
    }

    public final void setScore_max_threshold(int i) {
        this.score_max_threshold = i;
    }

    public final void setScore_min_threshold(int i) {
        this.score_min_threshold = i;
    }

    public final void setScore_norm_ratio(float f) {
        this.score_norm_ratio = f;
    }

    public final void setSigma(int i) {
        this.sigma = i;
    }
}
