package com.ss.android.ugc.aweme.compliance.api.expriements;

import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VideoVisibilityPermissionBatchManagementExp {
    public static final VideoVisibilityPermissionBatchManagementExp LIZ = new VideoVisibilityPermissionBatchManagementExp();
    public static final VideoVisibilityPermissionBatchManagementConfig LIZIZ = new VideoVisibilityPermissionBatchManagementConfig(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);

    /* loaded from: classes7.dex */
    public static final class VideoVisibilityPermissionBatchManagementConfig {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("entrypoint")
        public final int entrypoint;

        @InterfaceC65349Pkn("schema")
        public final String schema;

        /* JADX WARN: Multi-variable type inference failed */
        public VideoVisibilityPermissionBatchManagementConfig() {
            this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoVisibilityPermissionBatchManagementConfig)) {
                return false;
            }
            VideoVisibilityPermissionBatchManagementConfig videoVisibilityPermissionBatchManagementConfig = (VideoVisibilityPermissionBatchManagementConfig) obj;
            return this.enable == videoVisibilityPermissionBatchManagementConfig.enable && o.LJ(this.schema, videoVisibilityPermissionBatchManagementConfig.schema) && this.entrypoint == videoVisibilityPermissionBatchManagementConfig.entrypoint;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.schema;
            return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.entrypoint;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoVisibilityPermissionBatchManagementConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", schema=");
            LIZ.append(this.schema);
            LIZ.append(", entrypoint=");
            return b0.LIZJ(LIZ, this.entrypoint, ')', LIZ);
        }

        public VideoVisibilityPermissionBatchManagementConfig(boolean z, String str, int i) {
            this.enable = z;
            this.schema = str;
            this.entrypoint = i;
        }

        public /* synthetic */ VideoVisibilityPermissionBatchManagementConfig(boolean z, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "aweme://webview/?url=https%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fpns_product_poseidon%2Fvideo_permission_batch_management.html%3Fuse_spark%3D1%26hide_nav_bar%3D1%26show_loading%3D1%26should_full_screen%3D1" : str, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public static VideoVisibilityPermissionBatchManagementConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        VideoVisibilityPermissionBatchManagementConfig videoVisibilityPermissionBatchManagementConfig = LIZIZ;
        LJIIIZ.getClass();
        return (VideoVisibilityPermissionBatchManagementConfig) FFL.LJIJ(true, "video_visibility_permission_batch_management", 31744, VideoVisibilityPermissionBatchManagementConfig.class, videoVisibilityPermissionBatchManagementConfig);
    }
}
