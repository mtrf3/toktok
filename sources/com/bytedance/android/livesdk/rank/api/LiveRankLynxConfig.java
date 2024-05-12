package com.bytedance.android.livesdk.rank.api;

import X.C221108m2;
import X.C5H3;
import X.CFT;
import X.EnumC221088m0;
import X.EnumC31059CGx;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey("live_rank_lynx_config")
/* loaded from: classes6.dex */
public final class LiveRankLynxConfig {

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT;
    public static final LiveRankLynxConfig INSTANCE = new LiveRankLynxConfig();
    public static final C5H3 configValue$delegate;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Long.valueOf(EnumC31059CGx.RANK_DIALOG.getScene()), "");
        hashMap2.put(Long.valueOf(EnumC31059CGx.RANK_PAGE.getScene()), "");
        hashMap2.put(Long.valueOf(EnumC31059CGx.BOTTOM_BAR.getScene()), "");
        hashMap.put(-1, hashMap2);
        DEFAULT = new Config(hashMap);
        configValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CFT.LJLIL);
    }

    private final Config getConfigValue() {
        return (Config) configValue$delegate.getValue();
    }

    public final Config getValue() {
        return getConfigValue();
    }

    /* loaded from: classes6.dex */
    public static final class Config {

        @InterfaceC65349Pkn("rank_schema_config_list")
        public HashMap<Integer, HashMap<Long, String>> rankSchemaConfigList;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Config(HashMap<Integer, HashMap<Long, String>> rankSchemaConfigList) {
            o.LJIIIZ(rankSchemaConfigList, "rankSchemaConfigList");
            this.rankSchemaConfigList = rankSchemaConfigList;
        }

        public /* synthetic */ Config(HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new HashMap() : hashMap);
        }
    }
}
