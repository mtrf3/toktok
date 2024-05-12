package com.ss.android.ugc.aweme.search.voice.core.config;

import X.C221108m2;
import X.C4EV;
import X.C62822Ol8;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TiktokMusicSearchEngineSettingsSettings {
    public static final TiktokMusicSearchEngineSettingsModel LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C4EV.LJLIL);

    /* loaded from: classes2.dex */
    public static final class TiktokMusicSearchEngineSettingsModel {

        @InterfaceC65349Pkn("music_search_address")
        public final String address;

        @InterfaceC65349Pkn("music_search_cluster")
        public final String cluster;

        @InterfaceC65349Pkn("music_search_max_process_timeout_int")
        public final int maxProcessTimeout;

        @InterfaceC65349Pkn("music_search_max_speech_duration_int")
        public final int maxSpeechDuration;

        @InterfaceC65349Pkn("music_search_uri")
        public final String uri;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public TiktokMusicSearchEngineSettingsModel() {
            /*
                r8 = this;
                r1 = 0
                r4 = 0
                r6 = 31
                r0 = r8
                r2 = r1
                r3 = r1
                r5 = r4
                r7 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.voice.core.config.TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TiktokMusicSearchEngineSettingsModel)) {
                return false;
            }
            TiktokMusicSearchEngineSettingsModel tiktokMusicSearchEngineSettingsModel = (TiktokMusicSearchEngineSettingsModel) obj;
            return o.LJ(this.address, tiktokMusicSearchEngineSettingsModel.address) && o.LJ(this.uri, tiktokMusicSearchEngineSettingsModel.uri) && o.LJ(this.cluster, tiktokMusicSearchEngineSettingsModel.cluster) && this.maxSpeechDuration == tiktokMusicSearchEngineSettingsModel.maxSpeechDuration && this.maxProcessTimeout == tiktokMusicSearchEngineSettingsModel.maxProcessTimeout;
        }

        public final int hashCode() {
            return ((C79062V1e.LJ(this.cluster, C79062V1e.LJ(this.uri, this.address.hashCode() * 31, 31), 31) + this.maxSpeechDuration) * 31) + this.maxProcessTimeout;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TiktokMusicSearchEngineSettingsModel(address=");
            LIZ.append(this.address);
            LIZ.append(", uri=");
            LIZ.append(this.uri);
            LIZ.append(", cluster=");
            LIZ.append(this.cluster);
            LIZ.append(", maxSpeechDuration=");
            LIZ.append(this.maxSpeechDuration);
            LIZ.append(", maxProcessTimeout=");
            return b0.LIZJ(LIZ, this.maxProcessTimeout, ')', LIZ);
        }

        public TiktokMusicSearchEngineSettingsModel(String str, String str2, String str3, int i, int i2) {
            HH1.LIZ(str, "address", str2, "uri", str3, "cluster");
            this.address = str;
            this.uri = str2;
            this.cluster = str3;
            this.maxSpeechDuration = i;
            this.maxProcessTimeout = i2;
        }

        public /* synthetic */ TiktokMusicSearchEngineSettingsModel(String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "wss://speech.tiktokv.com" : str, (i3 & 2) != 0 ? "/api/v1/sauc" : str2, (i3 & 4) != 0 ? "vs_tt_input" : str3, (i3 & 8) != 0 ? 15000 : i, (i3 & 16) != 0 ? 3000 : i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        LIZ = new TiktokMusicSearchEngineSettingsModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 31, 0 == true ? 1 : 0);
    }
}
