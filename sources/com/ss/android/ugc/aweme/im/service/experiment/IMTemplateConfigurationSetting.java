package com.ss.android.ugc.aweme.im.service.experiment;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IMTemplateConfigurationSetting {
    public static final IMTemplateConfigurationSetting LIZ = new IMTemplateConfigurationSetting();
    public static final TemplateConfigurationModel LIZIZ;

    /* loaded from: classes9.dex */
    public static final class TemplateConfigurationModel {

        @InterfaceC65349Pkn("playlist_template_enabled")
        public final boolean isPlaylistTemplateEnabled;

        @InterfaceC65349Pkn("message_refresh_enabled")
        public final boolean isRefreshEnabled;

        @InterfaceC65349Pkn("refresh_interval_ms")
        public final long refreshInterval;

        @InterfaceC65349Pkn("refresh_page_size")
        public final int refreshPageSize;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateConfigurationModel() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemplateConfigurationModel)) {
                return false;
            }
            TemplateConfigurationModel templateConfigurationModel = (TemplateConfigurationModel) obj;
            return this.isPlaylistTemplateEnabled == templateConfigurationModel.isPlaylistTemplateEnabled && this.isRefreshEnabled == templateConfigurationModel.isRefreshEnabled && this.refreshPageSize == templateConfigurationModel.refreshPageSize && this.refreshInterval == templateConfigurationModel.refreshInterval;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            boolean z = this.isPlaylistTemplateEnabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return C16880lQ.LLJIJIL(this.refreshInterval) + (((((r0 * 31) + (this.isRefreshEnabled ? 1 : 0)) * 31) + this.refreshPageSize) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TemplateConfigurationModel(isPlaylistTemplateEnabled=");
            LIZ.append(this.isPlaylistTemplateEnabled);
            LIZ.append(", isRefreshEnabled=");
            LIZ.append(this.isRefreshEnabled);
            LIZ.append(", refreshPageSize=");
            LIZ.append(this.refreshPageSize);
            LIZ.append(", refreshInterval=");
            return C47135Ieh.LIZIZ(LIZ, this.refreshInterval, ')', LIZ);
        }

        public TemplateConfigurationModel(boolean z, boolean z2, int i, long j) {
            this.isPlaylistTemplateEnabled = z;
            this.isRefreshEnabled = z2;
            this.refreshPageSize = i;
            this.refreshInterval = j;
        }

        public /* synthetic */ TemplateConfigurationModel(boolean z, boolean z2, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) == 0 ? z2 : false, (i2 & 4) != 0 ? 25 : i, (i2 & 8) != 0 ? 1000L : j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        TemplateConfigurationModel templateConfigurationModel = new TemplateConfigurationModel(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 15, null);
        TemplateConfigurationModel templateConfigurationModel2 = (TemplateConfigurationModel) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_message_template_config", TemplateConfigurationModel.class, templateConfigurationModel);
        if (templateConfigurationModel2 != null) {
            templateConfigurationModel = templateConfigurationModel2;
        }
        LIZIZ = templateConfigurationModel;
    }
}
