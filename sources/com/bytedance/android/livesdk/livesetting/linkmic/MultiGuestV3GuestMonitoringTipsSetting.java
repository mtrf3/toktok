package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C0K2;
import X.C47261Igj;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@SettingsKey("live_sdk_multiguest_network_state")
/* loaded from: classes6.dex */
public final class MultiGuestV3GuestMonitoringTipsSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static m cache;
    public static final int defaultInt = 0;
    public static final MultiGuestV3GuestMonitoringTipsSetting INSTANCE = new MultiGuestV3GuestMonitoringTipsSetting();
    public static String last = "";
    public static List<Integer> lastHiddenLevelList = C47261Igj.LJJIJIIJI(0, 1, 2);
    public static List<Integer> lastBadLevelList = C47261Igj.LJJIJIIJI(3, 4);
    public static List<Integer> lastVeryBadLevelList = C47261Igj.LJJIJIIJI(5, 6);

    public final List<Integer> getBadLevelList() {
        List<Integer> intList = getIntList("two_bar_level", lastBadLevelList);
        lastBadLevelList = intList;
        return intList;
    }

    public final List<Integer> getHiddenLevelList() {
        List<Integer> intList = getIntList("hidden_level", lastHiddenLevelList);
        lastHiddenLevelList = intList;
        return intList;
    }

    public final boolean getShowNetworkTip() {
        return getBoolean("show_network_tip");
    }

    public final String getStringValue() {
        return SettingsManager.INSTANCE.getStringValue(MultiGuestV3GuestMonitoringTipsSetting.class);
    }

    public final boolean getSyncNetworkState() {
        return getBoolean("sync_network_state");
    }

    public final List<Integer> getVeryBadLevelList() {
        List<Integer> intList = getIntList("one_bar_level", lastVeryBadLevelList);
        lastVeryBadLevelList = intList;
        return intList;
    }

    private final void checkNeedUpdateCache() {
        m mVar;
        String stringValue = getStringValue();
        if (stringValue.length() == 0) {
            return;
        }
        if (cache == null || !o.LJ(stringValue, last)) {
            last = stringValue;
            j parse = GsonProtectorUtils.parse(new com.google.gson.o(), stringValue);
            if (parse != null) {
                mVar = parse.LJIIZILJ();
            } else {
                mVar = null;
            }
            cache = mVar;
        }
    }

    private final boolean getBoolean(String str) {
        j LJJIJ;
        boolean z = false;
        try {
            checkNeedUpdateCache();
            m mVar = cache;
            if (mVar == null || (LJJIJ = mVar.LJJIJ(str)) == null) {
                return false;
            }
            z = LJJIJ.LJFF();
            return z;
        } catch (Throwable th) {
            C0K2.LIZ("getBoolean error", th);
            return z;
        }
    }

    private final int getInt(String str) {
        j LJJIJ;
        try {
            checkNeedUpdateCache();
            m mVar = cache;
            if (mVar != null && (LJJIJ = mVar.LJJIJ(str)) != null) {
                return LJJIJ.LJIILJJIL();
            }
            return defaultInt;
        } catch (Throwable th) {
            C0K2.LIZ("getIntValue error", th);
            return defaultInt;
        }
    }

    private final List<Integer> getIntList(String str, List<Integer> list) {
        String stringValue;
        boolean z;
        ArrayList arrayList = new ArrayList();
        try {
            stringValue = getStringValue();
            if (stringValue.length() == 0) {
                z = true;
            } else {
                z = false;
            }
        } catch (Throwable th) {
            C0K2.LIZ("getIntValue error", th);
        }
        if (z) {
            return list;
        }
        if (o.LJ(stringValue, last)) {
            return list;
        }
        last = stringValue;
        new com.google.gson.o();
        m LJIIZILJ = com.google.gson.o.LIZ(stringValue).LJIIZILJ();
        cache = LJIIZILJ;
        j LJJIJ = LJIIZILJ.LJJIJ(str);
        if (LJJIJ != null) {
            Iterator<j> it = LJJIJ.LJIILLIIL().iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().LJIILJJIL()));
            }
        }
        return arrayList;
    }
}
