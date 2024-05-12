package com.ss.android.ugc.aweme.commercialize.live.settings;

import X.C221108m2;
import X.C35790E2w;
import X.C62822Ol8;
import X.C78685UuP;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BASchemaConfig {
    public static final BASchemaConfig LIZ = new BASchemaConfig();
    public static final BASchemaConfigData LIZIZ = new BASchemaConfigData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C35790E2w.LJLIL);

    /* loaded from: classes7.dex */
    public static final class LiveLinkData {

        @InterfaceC65349Pkn("fallback_url")
        public final String fallback_url;

        @InterfaceC65349Pkn("schema")
        public final String schema;

        /* JADX WARN: Multi-variable type inference failed */
        public LiveLinkData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveLinkData)) {
                return false;
            }
            LiveLinkData liveLinkData = (LiveLinkData) obj;
            return o.LJ(this.fallback_url, liveLinkData.fallback_url) && o.LJ(this.schema, liveLinkData.schema);
        }

        public final int hashCode() {
            return this.schema.hashCode() + (this.fallback_url.hashCode() * 31);
        }

        public final String LIZ() {
            Uri.Builder buildUpon = UriProtector.parse(this.schema).buildUpon();
            if (C78685UuP.LJJJZ(this.fallback_url)) {
                buildUpon.appendQueryParameter("fallback_url", this.fallback_url);
            }
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "uriBuilder.build().toString()");
            return uri;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LiveLinkData(fallback_url=");
            LIZ.append(this.fallback_url);
            LIZ.append(", schema=");
            return q.LIZIZ(LIZ, this.schema, ')', LIZ);
        }

        public LiveLinkData(String fallback_url, String schema) {
            o.LJIIIZ(fallback_url, "fallback_url");
            o.LJIIIZ(schema, "schema");
            this.fallback_url = fallback_url;
            this.schema = schema;
        }

        public /* synthetic */ LiveLinkData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    /* loaded from: classes7.dex */
    public static final class BASchemaConfigData {

        @InterfaceC65349Pkn("live-link-list")
        public final LiveLinkData liveLinkList;

        @InterfaceC65349Pkn("live-link-pin")
        public final LiveLinkData liveLinkPin;

        @InterfaceC65349Pkn("live-link-preview")
        public final LiveLinkData liveLinkPreview;

        /* JADX WARN: Multi-variable type inference failed */
        public BASchemaConfigData() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BASchemaConfigData)) {
                return false;
            }
            BASchemaConfigData bASchemaConfigData = (BASchemaConfigData) obj;
            return o.LJ(this.liveLinkList, bASchemaConfigData.liveLinkList) && o.LJ(this.liveLinkPin, bASchemaConfigData.liveLinkPin) && o.LJ(this.liveLinkPreview, bASchemaConfigData.liveLinkPreview);
        }

        public final int hashCode() {
            return this.liveLinkPreview.hashCode() + ((this.liveLinkPin.hashCode() + (this.liveLinkList.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BASchemaConfigData(liveLinkList=");
            LIZ.append(this.liveLinkList);
            LIZ.append(", liveLinkPin=");
            LIZ.append(this.liveLinkPin);
            LIZ.append(", liveLinkPreview=");
            LIZ.append(this.liveLinkPreview);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public BASchemaConfigData(LiveLinkData liveLinkList, LiveLinkData liveLinkPin, LiveLinkData liveLinkPreview) {
            o.LJIIIZ(liveLinkList, "liveLinkList");
            o.LJIIIZ(liveLinkPin, "liveLinkPin");
            o.LJIIIZ(liveLinkPreview, "liveLinkPreview");
            this.liveLinkList = liveLinkList;
            this.liveLinkPin = liveLinkPin;
            this.liveLinkPreview = liveLinkPreview;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ BASchemaConfigData(com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig.LiveLinkData r4, com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig.LiveLinkData r5, com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig.LiveLinkData r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r3 = this;
                r0 = r7 & 1
                r2 = 0
                r1 = 1
                if (r0 == 0) goto Ld
                com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData r4 = new com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData
                java.lang.String r0 = "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-list/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-list"
                r4.<init>(r2, r0, r1, r2)
            Ld:
                r0 = r7 & 2
                if (r0 == 0) goto L18
                com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData r5 = new com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData
                java.lang.String r0 = "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-pin/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-pin"
                r5.<init>(r2, r0, r1, r2)
            L18:
                r0 = r7 & 4
                if (r0 == 0) goto L23
                com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData r6 = new com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData
                java.lang.String r0 = "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-preview/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-preview"
                r6.<init>(r2, r0, r1, r2)
            L23:
                r3.<init>(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig.BASchemaConfigData.<init>(com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData, com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData, com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig$LiveLinkData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
