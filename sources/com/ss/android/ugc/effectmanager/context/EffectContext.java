package com.ss.android.ugc.effectmanager.context;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;

/* loaded from: classes16.dex */
public class EffectContext {
    public EffectConfiguration mEffectConfiguration;

    public String getBestHostUrl() {
        List<Host> hosts = this.mEffectConfiguration.getHosts();
        if (CollectionUtil.isListEmpty(hosts)) {
            return "";
        }
        return ((Host) ListProtector.get(hosts, 0)).getItemName();
    }

    public Context getContext() {
        return this.mEffectConfiguration.getContext();
    }

    public EffectConfiguration getEffectConfiguration() {
        return this.mEffectConfiguration;
    }

    public EffectContext(EffectConfiguration effectConfiguration) {
        this.mEffectConfiguration = effectConfiguration;
    }
}
