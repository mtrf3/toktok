package com.ss.android.ugc.aweme.experiment;

import X.C07250Qf;
import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.MWK;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CommentPreloadExperiment {
    public static final Meta LIZ = new Meta(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 124, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(MWK.LJLIL);

    /* loaded from: classes10.dex */
    public static final class Meta implements Serializable {

        @InterfaceC65349Pkn("bind_with_panel_animation")
        public final boolean bindWithPanelAnimation;

        @InterfaceC65349Pkn("enable_scene")
        public final String[] enableScene;

        @InterfaceC65349Pkn("enabled")
        public final boolean isEnable;

        @InterfaceC65349Pkn("only_unread_notice")
        public final boolean onlyUnreadNotice;

        @InterfaceC65349Pkn("strategy")
        public final int strategy;

        @InterfaceC65349Pkn("time_to_live")
        public final int ttl;

        @InterfaceC65349Pkn("use_local_cache")
        public final boolean useLocalCache;

        /* JADX WARN: Multi-variable type inference failed */
        public Meta() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 127, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Meta copy$default(Meta meta, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, String[] strArr, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = meta.isEnable;
            }
            if ((i3 & 2) != 0) {
                i = meta.strategy;
            }
            if ((i3 & 4) != 0) {
                i2 = meta.ttl;
            }
            if ((i3 & 8) != 0) {
                z2 = meta.onlyUnreadNotice;
            }
            if ((i3 & 16) != 0) {
                z3 = meta.bindWithPanelAnimation;
            }
            if ((i3 & 32) != 0) {
                z4 = meta.useLocalCache;
            }
            if ((i3 & 64) != 0) {
                strArr = meta.enableScene;
            }
            return meta.copy(z, i, i2, z2, z3, z4, strArr);
        }

        public final Meta copy(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, String[] enableScene) {
            o.LJIIIZ(enableScene, "enableScene");
            return new Meta(z, i, i2, z2, z3, z4, enableScene);
        }

        public int hashCode() {
            return C07250Qf.LIZ(this.useLocalCache, C07250Qf.LIZ(this.bindWithPanelAnimation, C07250Qf.LIZ(this.onlyUnreadNotice, ((((C16880lQ.LLJILJIL(this.isEnable) * 31) + this.strategy) * 31) + this.ttl) * 31, 31), 31), 31) + Arrays.hashCode(this.enableScene);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Meta(isEnable=");
            LIZ.append(this.isEnable);
            LIZ.append(", strategy=");
            LIZ.append(this.strategy);
            LIZ.append(", ttl=");
            LIZ.append(this.ttl);
            LIZ.append(", onlyUnreadNotice=");
            LIZ.append(this.onlyUnreadNotice);
            LIZ.append(", bindWithPanelAnimation=");
            LIZ.append(this.bindWithPanelAnimation);
            LIZ.append(", useLocalCache=");
            LIZ.append(this.useLocalCache);
            LIZ.append(", enableScene=");
            return q.LIZIZ(LIZ, Arrays.toString(this.enableScene), ')', LIZ);
        }

        public final boolean getBindWithPanelAnimation() {
            return this.bindWithPanelAnimation;
        }

        public final String[] getEnableScene() {
            return this.enableScene;
        }

        public final boolean getOnlyUnreadNotice() {
            return this.onlyUnreadNotice;
        }

        public final int getStrategy() {
            return this.strategy;
        }

        public final int getTtl() {
            return this.ttl;
        }

        public final boolean getUseLocalCache() {
            return this.useLocalCache;
        }

        public final boolean isEnable() {
            return this.isEnable;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!o.LJ(Meta.class, cls)) {
                return false;
            }
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment.Meta");
            Meta meta = (Meta) obj;
            if (this.isEnable == meta.isEnable && this.strategy == meta.strategy && this.ttl == meta.ttl && this.onlyUnreadNotice == meta.onlyUnreadNotice && this.bindWithPanelAnimation == meta.bindWithPanelAnimation && this.useLocalCache == meta.useLocalCache && Arrays.equals(this.enableScene, meta.enableScene)) {
                return true;
            }
            return false;
        }

        public Meta(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, String[] enableScene) {
            o.LJIIIZ(enableScene, "enableScene");
            this.isEnable = z;
            this.strategy = i;
            this.ttl = i2;
            this.onlyUnreadNotice = z2;
            this.bindWithPanelAnimation = z3;
            this.useLocalCache = z4;
            this.enableScene = enableScene;
        }

        public /* synthetic */ Meta(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, String[] strArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 300000 : i2, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) == 0 ? z4 : false, (i3 & 64) != 0 ? new String[]{"notification_page", "inner_push"} : strArr);
        }
    }

    public static Meta LIZ() {
        return (Meta) LIZIZ.getValue();
    }

    public static int LIZIZ() {
        return LIZ().getStrategy();
    }
}
