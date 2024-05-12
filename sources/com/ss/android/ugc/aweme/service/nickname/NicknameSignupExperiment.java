package com.ss.android.ugc.aweme.service.nickname;

import X.C58096Mr6;
import X.C79061V1d;
import X.EAJ;
import X.EnumC35839E4t;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.ug.dynamicresource.INicknameExperiment;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NicknameSignupExperiment implements INicknameExperiment {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.INicknameExperiment
    public final boolean isEnabled() {
        Object obj;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        IPluginService.SimplePluginData simplePluginData;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.SP_SIGNUP_NICKNAME_ANDROID.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null || o.LJ(pluginData.showConfig.shouldShow, Boolean.FALSE) || (pluginDataWrapper = pluginData.configData) == null || (simplePluginData = pluginDataWrapper.simplePluginData) == null) {
            return true;
        }
        int i = simplePluginData.abGroup;
        EAJ.Companion.getClass();
        EAJ[] values = EAJ.values();
        int length = values.length;
        for (int i2 = 0; i2 < length; i2++) {
            EAJ eaj = values[i2];
            if (eaj.getValue() == i) {
                return eaj == EAJ.TREATMENT;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static INicknameExperiment LIZ() {
        Object LIZ = C58096Mr6.LIZ(INicknameExperiment.class, false);
        if (LIZ != null) {
            return (INicknameExperiment) LIZ;
        }
        if (C58096Mr6.s5 == null) {
            synchronized (INicknameExperiment.class) {
                if (C58096Mr6.s5 == null) {
                    C58096Mr6.s5 = new NicknameSignupExperiment();
                }
            }
        }
        return C58096Mr6.s5;
    }
}
