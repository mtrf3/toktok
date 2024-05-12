package com.ss.android.ugc.gamora.recorder.navi.featureflags;

import X.C221108m2;
import X.C36483ETn;
import X.C62822Ol8;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TiktokAvatarLokiConfig {
    public static final TiktokAvatarLokiConfigData LIZ = new TiktokAvatarLokiConfigData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C36483ETn.LJLIL);

    /* loaded from: classes7.dex */
    public static final class TiktokAvatarLokiConfigData {

        @InterfaceC65349Pkn("editor_head_effect_name")
        public final String editorHeadEffectName;

        @InterfaceC65349Pkn("head_category_key")
        public final String headCategoryKey;

        @InterfaceC65349Pkn("loki_panel_name")
        public final String lokiPanelName;

        @InterfaceC65349Pkn("record_head_effect_name")
        public final String recordHeadEffectName;

        @InterfaceC65349Pkn("scan_category_key")
        public final String scanCategoryKey;

        @InterfaceC65349Pkn("scan_effect_name")
        public final String scanEffectName;

        /* JADX WARN: Multi-variable type inference failed */
        public TiktokAvatarLokiConfigData() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TiktokAvatarLokiConfigData)) {
                return false;
            }
            TiktokAvatarLokiConfigData tiktokAvatarLokiConfigData = (TiktokAvatarLokiConfigData) obj;
            return o.LJ(this.lokiPanelName, tiktokAvatarLokiConfigData.lokiPanelName) && o.LJ(this.editorHeadEffectName, tiktokAvatarLokiConfigData.editorHeadEffectName) && o.LJ(this.recordHeadEffectName, tiktokAvatarLokiConfigData.recordHeadEffectName) && o.LJ(this.headCategoryKey, tiktokAvatarLokiConfigData.headCategoryKey) && o.LJ(this.scanEffectName, tiktokAvatarLokiConfigData.scanEffectName) && o.LJ(this.scanCategoryKey, tiktokAvatarLokiConfigData.scanCategoryKey);
        }

        public final int hashCode() {
            return this.scanCategoryKey.hashCode() + C79062V1e.LJ(this.scanEffectName, C79062V1e.LJ(this.headCategoryKey, C79062V1e.LJ(this.recordHeadEffectName, C79062V1e.LJ(this.editorHeadEffectName, this.lokiPanelName.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TiktokAvatarLokiConfigData(lokiPanelName=");
            LIZ.append(this.lokiPanelName);
            LIZ.append(", editorHeadEffectName=");
            LIZ.append(this.editorHeadEffectName);
            LIZ.append(", recordHeadEffectName=");
            LIZ.append(this.recordHeadEffectName);
            LIZ.append(", headCategoryKey=");
            LIZ.append(this.headCategoryKey);
            LIZ.append(", scanEffectName=");
            LIZ.append(this.scanEffectName);
            LIZ.append(", scanCategoryKey=");
            return q.LIZIZ(LIZ, this.scanCategoryKey, ')', LIZ);
        }

        public TiktokAvatarLokiConfigData(String lokiPanelName, String editorHeadEffectName, String recordHeadEffectName, String headCategoryKey, String scanEffectName, String scanCategoryKey) {
            o.LJIIIZ(lokiPanelName, "lokiPanelName");
            o.LJIIIZ(editorHeadEffectName, "editorHeadEffectName");
            o.LJIIIZ(recordHeadEffectName, "recordHeadEffectName");
            o.LJIIIZ(headCategoryKey, "headCategoryKey");
            o.LJIIIZ(scanEffectName, "scanEffectName");
            o.LJIIIZ(scanCategoryKey, "scanCategoryKey");
            this.lokiPanelName = lokiPanelName;
            this.editorHeadEffectName = editorHeadEffectName;
            this.recordHeadEffectName = recordHeadEffectName;
            this.headCategoryKey = headCategoryKey;
            this.scanEffectName = scanEffectName;
            this.scanCategoryKey = scanCategoryKey;
        }

        public /* synthetic */ TiktokAvatarLokiConfigData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "navi" : str, (i & 2) != 0 ? "head_dev_plugin" : str2, (i & 4) != 0 ? "navi_head_prefab" : str3, (i & 8) != 0 ? "head" : str4, (i & 16) != 0 ? "scan_tiktok" : str5, (i & 32) != 0 ? "scan" : str6);
        }
    }

    public static final TiktokAvatarLokiConfigData LIZ() {
        return (TiktokAvatarLokiConfigData) LIZIZ.getValue();
    }
}
