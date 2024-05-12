package com.ss.android.ugc.gamora.editor.sticker.read;

import X.C138515c7;
import X.C16880lQ;
import X.C47135Ieh;
import X.C60903NvH;
import X.C78580Usi;
import X.C78685UuP;
import X.C79062V1e;
import X.C82891Wg3;
import X.HQ7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import defpackage.i0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SpeakerCenter {
    public static final Keva LIZ;

    /* loaded from: classes3.dex */
    public static final class KevaSpeakerBean implements Serializable {

        @InterfaceC65349Pkn("is_creator")
        public final boolean isCreatorVoice;

        @InterfaceC65349Pkn("tts_anchor_release_date")
        public final long ttsAnchorReleaseDate;

        @InterfaceC65349Pkn("tts_release_date")
        public final long ttsReleaseDate;

        @InterfaceC65349Pkn("voice_anchor_name")
        public final String voiceAnchorName;

        @InterfaceC65349Pkn("creator_user_id")
        public final String voiceCreatorUserId;

        @InterfaceC65349Pkn("creator_user_name")
        public final String voiceCreatorUserName;

        @InterfaceC65349Pkn("voice_effect_icon_url")
        public final String voiceEffectIconUrl;

        @InterfaceC65349Pkn("voice_effect_id")
        public final String voiceEffectId;

        @InterfaceC65349Pkn("voice_effect_resource_id")
        public final String voiceEffectResourceId;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public KevaSpeakerBean() {
            /*
                r14 = this;
                r1 = 0
                r7 = 0
                r8 = 0
                r12 = 511(0x1ff, float:7.16E-43)
                r0 = r14
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r10 = r8
                r13 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter.KevaSpeakerBean.<init>():void");
        }

        public static /* synthetic */ KevaSpeakerBean copy$default(KevaSpeakerBean kevaSpeakerBean, String str, String str2, String str3, String str4, String str5, String str6, boolean z, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kevaSpeakerBean.voiceEffectId;
            }
            if ((i & 2) != 0) {
                str2 = kevaSpeakerBean.voiceEffectIconUrl;
            }
            if ((i & 4) != 0) {
                str3 = kevaSpeakerBean.voiceAnchorName;
            }
            if ((i & 8) != 0) {
                str4 = kevaSpeakerBean.voiceEffectResourceId;
            }
            if ((i & 16) != 0) {
                str5 = kevaSpeakerBean.voiceCreatorUserId;
            }
            if ((i & 32) != 0) {
                str6 = kevaSpeakerBean.voiceCreatorUserName;
            }
            if ((i & 64) != 0) {
                z = kevaSpeakerBean.isCreatorVoice;
            }
            if ((i & 128) != 0) {
                j = kevaSpeakerBean.ttsAnchorReleaseDate;
            }
            if ((i & 256) != 0) {
                j2 = kevaSpeakerBean.ttsReleaseDate;
            }
            return kevaSpeakerBean.copy(str, str2, str3, str4, str5, str6, z, j, j2);
        }

        public final KevaSpeakerBean copy(String str, String str2, String str3, String str4, String voiceCreatorUserId, String voiceCreatorUserName, boolean z, long j, long j2) {
            o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
            o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
            return new KevaSpeakerBean(str, str2, str3, str4, voiceCreatorUserId, voiceCreatorUserName, z, j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KevaSpeakerBean)) {
                return false;
            }
            KevaSpeakerBean kevaSpeakerBean = (KevaSpeakerBean) obj;
            return o.LJ(this.voiceEffectId, kevaSpeakerBean.voiceEffectId) && o.LJ(this.voiceEffectIconUrl, kevaSpeakerBean.voiceEffectIconUrl) && o.LJ(this.voiceAnchorName, kevaSpeakerBean.voiceAnchorName) && o.LJ(this.voiceEffectResourceId, kevaSpeakerBean.voiceEffectResourceId) && o.LJ(this.voiceCreatorUserId, kevaSpeakerBean.voiceCreatorUserId) && o.LJ(this.voiceCreatorUserName, kevaSpeakerBean.voiceCreatorUserName) && this.isCreatorVoice == kevaSpeakerBean.isCreatorVoice && this.ttsAnchorReleaseDate == kevaSpeakerBean.ttsAnchorReleaseDate && this.ttsReleaseDate == kevaSpeakerBean.ttsReleaseDate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.voiceEffectId;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.voiceEffectIconUrl;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.voiceAnchorName;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.voiceEffectResourceId;
            if (str4 != null) {
                i = str4.hashCode();
            }
            int LJ = C79062V1e.LJ(this.voiceCreatorUserName, C79062V1e.LJ(this.voiceCreatorUserId, (i4 + i) * 31, 31), 31);
            boolean z = this.isCreatorVoice;
            int i5 = z;
            if (z != 0) {
                i5 = 1;
            }
            return C16880lQ.LLJIJIL(this.ttsReleaseDate) + JBR.LIZJ(this.ttsAnchorReleaseDate, (LJ + i5) * 31, 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("KevaSpeakerBean(voiceEffectId=");
            LIZ.append(this.voiceEffectId);
            LIZ.append(", voiceEffectIconUrl=");
            LIZ.append(this.voiceEffectIconUrl);
            LIZ.append(", voiceAnchorName=");
            LIZ.append(this.voiceAnchorName);
            LIZ.append(", voiceEffectResourceId=");
            LIZ.append(this.voiceEffectResourceId);
            LIZ.append(", voiceCreatorUserId=");
            LIZ.append(this.voiceCreatorUserId);
            LIZ.append(", voiceCreatorUserName=");
            LIZ.append(this.voiceCreatorUserName);
            LIZ.append(", isCreatorVoice=");
            LIZ.append(this.isCreatorVoice);
            LIZ.append(", ttsAnchorReleaseDate=");
            LIZ.append(this.ttsAnchorReleaseDate);
            LIZ.append(", ttsReleaseDate=");
            return C47135Ieh.LIZIZ(LIZ, this.ttsReleaseDate, ')', LIZ);
        }

        public final long getTtsAnchorReleaseDate() {
            return this.ttsAnchorReleaseDate;
        }

        public final long getTtsReleaseDate() {
            return this.ttsReleaseDate;
        }

        public final String getVoiceAnchorName() {
            return this.voiceAnchorName;
        }

        public final String getVoiceCreatorUserId() {
            return this.voiceCreatorUserId;
        }

        public final String getVoiceCreatorUserName() {
            return this.voiceCreatorUserName;
        }

        public final String getVoiceEffectIconUrl() {
            return this.voiceEffectIconUrl;
        }

        public final String getVoiceEffectId() {
            return this.voiceEffectId;
        }

        public final String getVoiceEffectResourceId() {
            return this.voiceEffectResourceId;
        }

        public final boolean isCreatorVoice() {
            return this.isCreatorVoice;
        }

        public KevaSpeakerBean(String str, String str2, String str3, String str4, String voiceCreatorUserId, String voiceCreatorUserName, boolean z, long j, long j2) {
            o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
            o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
            this.voiceEffectId = str;
            this.voiceEffectIconUrl = str2;
            this.voiceAnchorName = str3;
            this.voiceEffectResourceId = str4;
            this.voiceCreatorUserId = voiceCreatorUserId;
            this.voiceCreatorUserName = voiceCreatorUserName;
            this.isCreatorVoice = z;
            this.ttsAnchorReleaseDate = j;
            this.ttsReleaseDate = j2;
        }

        public /* synthetic */ KevaSpeakerBean(String str, String str2, String str3, String str4, String str5, String str6, boolean z, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? false : z, (i & 128) != 0 ? 0L : j, (i & 256) == 0 ? j2 : 0L);
        }
    }

    static {
        Keva repo = Keva.getRepo("text_to_speech_v2");
        o.LJIIIIZZ(repo, "getRepo(\"text_to_speech_v2\")");
        LIZ = repo;
    }

    public static String LIZ() {
        String string = LIZ.getString("setCheckVoice", "");
        o.LJIIIIZZ(string, "keva.getString(\"setCheckVoice\", \"\")");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static KevaSpeakerBean LIZIZ() {
        String string = LIZ.getString("check_voice_effect_bean", "");
        if (C78685UuP.LJJJZ(string)) {
            Object fromJson = GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), string, (Class<Object>) KevaSpeakerBean.class);
            o.LJIIIIZZ(fromJson, "gson.fromJson(str, KevaSpeakerBean::class.java)");
            return (KevaSpeakerBean) fromJson;
        }
        long j = 0;
        return new KevaSpeakerBean(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, j, j, 511, 0 == true ? 1 : 0);
    }

    public static String LIZJ() {
        String str;
        StringBuilder LIZ2 = X1D.LIZ();
        HQ7 accountService = C60903NvH.LJIIJJI().getAccountService();
        if (accountService.isLogin()) {
            str = accountService.getCurrentUserID();
        } else {
            str = "";
        }
        LIZ2.append(str);
        LIZ2.append('_');
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
        LIZ2.append(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        LIZ2.append('_');
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZLLL() {
        if (LJFF()) {
            if (LIZ().length() <= 0) {
                return "";
            }
            return LIZ();
        }
        String string = LIZ.getString("setLastVoice", "");
        o.LJIIIIZZ(string, "keva.getString(\"setLastVoice\", \"\")");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LJ() {
        KevaSpeakerBean kevaSpeakerBean;
        if (LJFF()) {
            if (!C78685UuP.LJJJZ(LIZIZ().getVoiceEffectId())) {
                return "";
            }
            String voiceEffectId = LIZIZ().getVoiceEffectId();
            o.LJI(voiceEffectId);
            return voiceEffectId;
        }
        String string = LIZ.getString("last_voice_effect_bean", "");
        if (C78685UuP.LJJJZ(string)) {
            Object fromJson = GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), string, (Class<Object>) KevaSpeakerBean.class);
            o.LJIIIIZZ(fromJson, "gson.fromJson(str, KevaSpeakerBean::class.java)");
            kevaSpeakerBean = (KevaSpeakerBean) fromJson;
        } else {
            long j = 0;
            kevaSpeakerBean = new KevaSpeakerBean(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, j, j, 511, 0 == true ? 1 : 0);
        }
        String voiceEffectId2 = kevaSpeakerBean.getVoiceEffectId();
        if (voiceEffectId2 == null) {
            return "";
        }
        return voiceEffectId2;
    }

    public static boolean LJFF() {
        if (!C138515c7.LIZ()) {
            return false;
        }
        return LIZ.getBoolean("checkbox", false);
    }

    public static boolean LJI(String speakerId) {
        o.LJIIIZ(speakerId, "speakerId");
        Keva keva = LIZ;
        int LIZJ = i0.LIZJ(speakerId, "_NUM", keva, 0);
        long LIZIZ = C78580Usi.LIZIZ(speakerId, "_TIME", keva, -1L);
        if (LIZJ >= 3 || System.currentTimeMillis() - LIZIZ < 86400000) {
            return false;
        }
        return true;
    }

    public static void LJII(String value) {
        o.LJIIIZ(value, "value");
        LIZ.storeString("setCheckVoice", value);
    }

    public static void LJIIIIZZ(KevaSpeakerBean kevaSpeakerBean) {
        LIZ.storeString("check_voice_effect_bean", GsonProtectorUtils.toJson(C82891Wg3.LIZJ(), kevaSpeakerBean));
    }

    public static void LJIIIZ(String value) {
        o.LJIIIZ(value, "value");
        LIZ.storeString("setCheckText", value);
    }

    public static void LJIIJ(KevaSpeakerBean kevaSpeakerBean) {
        LIZ.storeString("last_voice_effect_bean", GsonProtectorUtils.toJson(C82891Wg3.LIZJ(), kevaSpeakerBean));
    }

    public static void LJIIJJI(String speakerId) {
        o.LJIIIZ(speakerId, "speakerId");
        Keva keva = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(speakerId);
        LIZ2.append("_NUM");
        int i = keva.getInt(X1D.LIZIZ(LIZ2), 0) + 1;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(speakerId);
        LIZ3.append("_NUM");
        keva.storeInt(X1D.LIZIZ(LIZ3), i);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(speakerId);
        LIZ4.append("_TIME");
        keva.storeLong(X1D.LIZIZ(LIZ4), System.currentTimeMillis());
    }
}
