package com.ss.ttlivestreamer.core.utils;

import X.C162476Zf;
import X.C221108m2;
import X.C5H3;
import X.JBR;
import X.V0N;
import X.X1D;
import com.bytedance.bpea.basics.Cert;
import java.util.EnumMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TokenCertConfigUtils {
    public static final Companion Companion = new Companion();
    public static final C5H3 instance$delegate = C221108m2.LIZIZ(TokenCertConfigUtils$Companion$instance$2.INSTANCE);
    public SceneType audioSceneType;
    public final Map<CertType, TokenCertExtra> map;

    /* loaded from: classes12.dex */
    public enum CertType {
        AUDIO_START,
        AUDIO_STOP;

        public static CertType valueOf(String str) {
            return (CertType) V0N.LJJJ(CertType.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum SceneType {
        NONE,
        SWITCH,
        ERROR;

        public static SceneType valueOf(String str) {
            return (SceneType) V0N.LJJJ(SceneType.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SceneType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[SceneType.ERROR.ordinal()] = 1;
            iArr[SceneType.SWITCH.ordinal()] = 2;
            iArr[SceneType.NONE.ordinal()] = 3;
            int[] iArr2 = new int[CertType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[CertType.AUDIO_START.ordinal()] = 1;
            iArr2[CertType.AUDIO_STOP.ordinal()] = 2;
        }
    }

    public static final TokenCertConfigUtils getInstance() {
        return Companion.getInstance();
    }

    /* loaded from: classes12.dex */
    public static final class TokenCertExtra {
        public final Cert cert;
        public final String tag;

        public static /* synthetic */ TokenCertExtra copy$default(TokenCertExtra tokenCertExtra, Cert cert, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                cert = tokenCertExtra.cert;
            }
            if ((i & 2) != 0) {
                str = tokenCertExtra.tag;
            }
            return tokenCertExtra.copy(cert, str);
        }

        public final TokenCertExtra copy(Cert cert, String tag) {
            o.LJIIJ(tag, "tag");
            return new TokenCertExtra(cert, tag);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenCertExtra)) {
                return false;
            }
            TokenCertExtra tokenCertExtra = (TokenCertExtra) obj;
            return o.LJ(this.cert, tokenCertExtra.cert) && o.LJ(this.tag, tokenCertExtra.tag);
        }

        public int hashCode() {
            Cert cert = this.cert;
            int hashCode = (cert != null ? cert.hashCode() : 0) * 31;
            String str = this.tag;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TokenCertExtra(cert=");
            LIZ.append(this.cert);
            LIZ.append(", tag=");
            return JBR.LJFF(LIZ, this.tag, ")", LIZ);
        }

        public final Cert getCert() {
            return this.cert;
        }

        public final String getTag() {
            return this.tag;
        }

        public TokenCertExtra(Cert cert, String tag) {
            o.LJIIJ(tag, "tag");
            this.cert = cert;
            this.tag = tag;
        }
    }

    public final void release() {
        this.map.clear();
    }

    public TokenCertConfigUtils() {
        this.map = new EnumMap(CertType.class);
        this.audioSceneType = SceneType.NONE;
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final TokenCertConfigUtils getInstance() {
            return (TokenCertConfigUtils) TokenCertConfigUtils.instance$delegate.getValue();
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TokenCertConfigUtils(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final TokenCertExtra getCert(CertType type) {
        TokenCertExtra tokenCertExtra;
        o.LJIIJ(type, "type");
        int i = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.audioSceneType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            tokenCertExtra = this.map.get(type);
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        tokenCertExtra = new TokenCertExtra(DataflowID0x58060103.ttlsSwitchAudioCaptureStopRelease(), "");
                    }
                } else {
                    tokenCertExtra = new TokenCertExtra(DataflowID0x58060105.ttlsStopAudioCaptureWithError(), "");
                }
                this.audioSceneType = SceneType.NONE;
                return tokenCertExtra;
            }
            throw new C162476Zf();
        }
        return this.map.get(type);
    }

    public final void saveAudioScene(SceneType scene) {
        o.LJIIJ(scene, "scene");
        this.audioSceneType = scene;
    }

    public final void saveCert(CertType type, Object obj, String tag) {
        Cert cert;
        o.LJIIJ(type, "type");
        o.LJIIJ(tag, "tag");
        if (obj instanceof Cert) {
            cert = (Cert) obj;
        } else {
            cert = null;
        }
        this.map.put(type, new TokenCertExtra(cert, tag));
    }
}
