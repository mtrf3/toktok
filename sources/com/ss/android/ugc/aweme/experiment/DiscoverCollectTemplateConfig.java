package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DiscoverCollectTemplateConfig {
    public static final DiscoverCollectTemplateConfig LIZ = new DiscoverCollectTemplateConfig();

    /* loaded from: classes4.dex */
    public static final class Config {

        @InterfaceC65349Pkn("hashtag_cdn_url")
        public final String hashtagCdnUrl;

        @InterfaceC65349Pkn("music_cdn_url")
        public final String musicCdnUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return o.LJ(this.musicCdnUrl, config.musicCdnUrl) && o.LJ(this.hashtagCdnUrl, config.hashtagCdnUrl);
        }

        public final int hashCode() {
            String str = this.musicCdnUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.hashtagCdnUrl;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(musicCdnUrl=");
            LIZ.append(this.musicCdnUrl);
            LIZ.append(", hashtagCdnUrl=");
            return q.LIZIZ(LIZ, this.hashtagCdnUrl, ')', LIZ);
        }

        public Config(String str, String str2) {
            this.musicCdnUrl = str;
            this.hashtagCdnUrl = str2;
        }

        public /* synthetic */ Config(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
