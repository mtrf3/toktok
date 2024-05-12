package com.ss.android.ugc.aweme.search.voice.core.config;

import X.C113614d3;
import X.C221108m2;
import X.C61878OQg;
import X.C62822Ol8;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VoiceSearchMultiLanguageSettings {
    public static final TiktokVoiceSearchMultiLanguageSettingsModel LIZ = new TiktokVoiceSearchMultiLanguageSettingsModel(C61878OQg.INSTANCE, "wss://speech.tiktokv.com", "/api/v2/asr", "/api/v1/sauc", "vs_tt_input", "en-US");
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C113614d3.LJLIL);

    /* loaded from: classes2.dex */
    public static final class Cluster {

        @InterfaceC65349Pkn("display_full")
        public final String displayFull;

        @InterfaceC65349Pkn("display_short")
        public final String displayShort;

        @InterfaceC65349Pkn("region")
        public final List<String> region;

        @InterfaceC65349Pkn("sauc_language")
        public final String saucLanguage;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cluster)) {
                return false;
            }
            Cluster cluster = (Cluster) obj;
            return o.LJ(this.region, cluster.region) && o.LJ(this.displayFull, cluster.displayFull) && o.LJ(this.displayShort, cluster.displayShort) && o.LJ(this.saucLanguage, cluster.saucLanguage);
        }

        public final int hashCode() {
            int hashCode;
            List<String> list = this.region;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            return this.saucLanguage.hashCode() + C79062V1e.LJ(this.displayShort, C79062V1e.LJ(this.displayFull, hashCode * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cluster(region=");
            LIZ.append(this.region);
            LIZ.append(", displayFull=");
            LIZ.append(this.displayFull);
            LIZ.append(", displayShort=");
            LIZ.append(this.displayShort);
            LIZ.append(", saucLanguage=");
            return q.LIZIZ(LIZ, this.saucLanguage, ')', LIZ);
        }

        public Cluster(List<String> list, String str, String str2, String str3) {
            HH1.LIZ(str, "displayFull", str2, "displayShort", str3, "saucLanguage");
            this.region = list;
            this.displayFull = str;
            this.displayShort = str2;
            this.saucLanguage = str3;
        }

        public /* synthetic */ Cluster(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TiktokVoiceSearchMultiLanguageSettingsModel {

        @InterfaceC65349Pkn("address")
        public final String address;

        @InterfaceC65349Pkn("languages")
        public final List<Language> languages;

        @InterfaceC65349Pkn("sauc_cluster")
        public final String saucCluster;

        @InterfaceC65349Pkn("sauc_language_default")
        public final String saucLanguageDefault;

        @InterfaceC65349Pkn("sauc_uri")
        public final String saucUri;

        @InterfaceC65349Pkn("uri")
        public final String uri;

        /* JADX WARN: Multi-variable type inference failed */
        public TiktokVoiceSearchMultiLanguageSettingsModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TiktokVoiceSearchMultiLanguageSettingsModel)) {
                return false;
            }
            TiktokVoiceSearchMultiLanguageSettingsModel tiktokVoiceSearchMultiLanguageSettingsModel = (TiktokVoiceSearchMultiLanguageSettingsModel) obj;
            return o.LJ(this.languages, tiktokVoiceSearchMultiLanguageSettingsModel.languages) && o.LJ(this.address, tiktokVoiceSearchMultiLanguageSettingsModel.address) && o.LJ(this.uri, tiktokVoiceSearchMultiLanguageSettingsModel.uri) && o.LJ(this.saucUri, tiktokVoiceSearchMultiLanguageSettingsModel.saucUri) && o.LJ(this.saucCluster, tiktokVoiceSearchMultiLanguageSettingsModel.saucCluster) && o.LJ(this.saucLanguageDefault, tiktokVoiceSearchMultiLanguageSettingsModel.saucLanguageDefault);
        }

        public final int hashCode() {
            int hashCode;
            List<Language> list = this.languages;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            return this.saucLanguageDefault.hashCode() + C79062V1e.LJ(this.saucCluster, C79062V1e.LJ(this.saucUri, C79062V1e.LJ(this.uri, C79062V1e.LJ(this.address, hashCode * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TiktokVoiceSearchMultiLanguageSettingsModel(languages=");
            LIZ.append(this.languages);
            LIZ.append(", address=");
            LIZ.append(this.address);
            LIZ.append(", uri=");
            LIZ.append(this.uri);
            LIZ.append(", saucUri=");
            LIZ.append(this.saucUri);
            LIZ.append(", saucCluster=");
            LIZ.append(this.saucCluster);
            LIZ.append(", saucLanguageDefault=");
            return q.LIZIZ(LIZ, this.saucLanguageDefault, ')', LIZ);
        }

        public TiktokVoiceSearchMultiLanguageSettingsModel(List<Language> list, String address, String uri, String saucUri, String saucCluster, String saucLanguageDefault) {
            o.LJIIIZ(address, "address");
            o.LJIIIZ(uri, "uri");
            o.LJIIIZ(saucUri, "saucUri");
            o.LJIIIZ(saucCluster, "saucCluster");
            o.LJIIIZ(saucLanguageDefault, "saucLanguageDefault");
            this.languages = list;
            this.address = address;
            this.uri = uri;
            this.saucUri = saucUri;
            this.saucCluster = saucCluster;
            this.saucLanguageDefault = saucLanguageDefault;
        }

        public /* synthetic */ TiktokVoiceSearchMultiLanguageSettingsModel(List list, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "wss://speech.tiktokv.com" : str, (i & 4) != 0 ? "/api/v2/asr" : str2, (i & 8) != 0 ? "/api/v1/sauc" : str3, (i & 16) != 0 ? "vs_tt_input" : str4, (i & 32) != 0 ? "en-US" : str5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Language {

        @InterfaceC65349Pkn("clusters")
        public final List<Cluster> clusters;

        /* renamed from: default, reason: not valid java name */
        @InterfaceC65349Pkn("default")
        public final String f31default;

        @InterfaceC65349Pkn("lang")
        public final String lang;

        @InterfaceC65349Pkn("sauc_language_default")
        public final String saucLanguageDefault;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Language)) {
                return false;
            }
            Language language = (Language) obj;
            return o.LJ(this.lang, language.lang) && o.LJ(this.clusters, language.clusters) && o.LJ(this.f31default, language.f31default) && o.LJ(this.saucLanguageDefault, language.saucLanguageDefault);
        }

        public final int hashCode() {
            String str = this.lang;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Cluster> list = this.clusters;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.f31default;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.saucLanguageDefault;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Language(lang=");
            LIZ.append(this.lang);
            LIZ.append(", clusters=");
            LIZ.append(this.clusters);
            LIZ.append(", default=");
            LIZ.append(this.f31default);
            LIZ.append(", saucLanguageDefault=");
            return q.LIZIZ(LIZ, this.saucLanguageDefault, ')', LIZ);
        }

        public Language(String str, List<Cluster> list, String str2, String str3) {
            this.lang = str;
            this.clusters = list;
            this.f31default = str2;
            this.saucLanguageDefault = str3;
        }
    }
}
