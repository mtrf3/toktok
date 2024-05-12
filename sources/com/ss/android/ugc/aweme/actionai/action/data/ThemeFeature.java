package com.ss.android.ugc.aweme.actionai.action.data;

import X.C61878OQg;
import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ThemeFeature extends F9E {
    public final List<Float> feature;
    public final List<Float> score;

    public ThemeFeature() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeFeature copy$default(ThemeFeature themeFeature, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = themeFeature.score;
        }
        if ((i & 2) != 0) {
            list2 = themeFeature.feature;
        }
        return themeFeature.copy(list, list2);
    }

    public final ThemeFeature copy(List<Float> score, List<Float> feature) {
        o.LJIIIZ(score, "score");
        o.LJIIIZ(feature, "feature");
        return new ThemeFeature(score, feature);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.score, this.feature};
    }

    public final List<Float> getFeature() {
        return this.feature;
    }

    public final List<Float> getScore() {
        return this.score;
    }

    public ThemeFeature(List<Float> score, List<Float> feature) {
        o.LJIIIZ(score, "score");
        o.LJIIIZ(feature, "feature");
        this.score = score;
        this.feature = feature;
    }

    public ThemeFeature(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
