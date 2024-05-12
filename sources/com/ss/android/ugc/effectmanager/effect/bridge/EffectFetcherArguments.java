package com.ss.android.ugc.effectmanager.effect.bridge;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* loaded from: classes16.dex */
public class EffectFetcherArguments {
    public List<String> mDownloadUrl;
    public Effect mEffect;
    public String mEffectDir;

    public List<String> getDownloadUrl() {
        return this.mDownloadUrl;
    }

    public Effect getEffect() {
        return this.mEffect;
    }

    public String getEffectDir() {
        return this.mEffectDir;
    }

    public EffectFetcherArguments(Effect effect, List<String> list, String str) {
        this.mEffect = effect;
        this.mDownloadUrl = list;
        this.mEffectDir = str;
    }
}
