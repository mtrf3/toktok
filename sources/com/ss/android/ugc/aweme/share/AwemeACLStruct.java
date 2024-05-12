package com.ss.android.ugc.aweme.share;

import X.C221108m2;
import X.C235779Nd;
import X.C36821Ecj;
import X.C62822Ol8;
import X.IOZ;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AwemeACLStruct {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(IOZ.LJLIL);

    /* loaded from: classes9.dex */
    public static final class ACLCommonStruct implements Serializable {
        public int code;
        public int showType = 2;
        public String toastMsg = "";
        public String extra = "";

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("code = ");
            LIZ.append(this.code);
            LIZ.append(", showType = ");
            LIZ.append(this.showType);
            LIZ.append(", toastMsg = ");
            LIZ.append(this.toastMsg);
            LIZ.append(" extra = ");
            LIZ.append(this.extra);
            return X1D.LIZIZ(LIZ);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getExtra() {
            return this.extra;
        }

        public final int getShowType() {
            return this.showType;
        }

        public final String getToastMsg() {
            return this.toastMsg;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setExtra(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.extra = str;
        }

        public final void setShowType(int i) {
            this.showType = i;
        }

        public final void setToastMsg(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.toastMsg = str;
        }
    }

    /* loaded from: classes11.dex */
    public static final class ServerExtra implements Serializable {
        public Integer aa;
        public Boolean aac;
        public Integer aad;
        public Boolean aas;
        public Boolean ad;
        public Boolean ap;
        public Boolean arw;
        public Boolean asa;
        public Integer asd;
        public Boolean asr;
        public Integer avp;
        public Integer sd;
        public Boolean ss;

        public ServerExtra() {
            Boolean bool = Boolean.FALSE;
            this.aas = bool;
            this.aad = 0;
            this.avp = 0;
            this.arw = bool;
            this.aa = 0;
            this.aac = Boolean.TRUE;
            this.asr = bool;
            this.sd = 0;
            this.ap = bool;
            this.asa = bool;
            this.asd = 0;
            this.ss = bool;
            this.ad = bool;
        }

        public final Integer getAa() {
            return this.aa;
        }

        public final Boolean getAac() {
            return this.aac;
        }

        public final Integer getAad() {
            return this.aad;
        }

        public final Boolean getAas() {
            return this.aas;
        }

        public final Boolean getAd() {
            return this.ad;
        }

        public final Boolean getAp() {
            return this.ap;
        }

        public final Boolean getArw() {
            return this.arw;
        }

        public final Boolean getAsa() {
            return this.asa;
        }

        public final Integer getAsd() {
            return this.asd;
        }

        public final Boolean getAsr() {
            return this.asr;
        }

        public final Integer getAvp() {
            return this.avp;
        }

        public final Integer getSd() {
            return this.sd;
        }

        public final Boolean getSs() {
            return this.ss;
        }

        public final ServerExtra buildServerExtraJson(Aweme aweme) {
            Boolean bool;
            Integer num;
            Integer num2;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Integer num3;
            Boolean bool5;
            Integer num4;
            o.LJIIIZ(aweme, "aweme");
            ServerExtra serverExtra = new ServerExtra();
            User author = aweme.getAuthor();
            Boolean bool6 = null;
            if (author != null) {
                bool = Boolean.valueOf(author.isSecret());
            } else {
                bool = null;
            }
            serverExtra.aas = bool;
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                num = Integer.valueOf(author2.getDownloadSetting());
            } else {
                num = null;
            }
            serverExtra.aad = num;
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                num2 = Integer.valueOf(videoControl.preventDownloadType);
            } else {
                num2 = null;
            }
            serverExtra.avp = num2;
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            if (awemeRiskModel != null) {
                bool2 = Boolean.valueOf(awemeRiskModel.isWarn());
            } else {
                bool2 = null;
            }
            serverExtra.arw = bool2;
            serverExtra.aa = Integer.valueOf(aweme.getAwemeType());
            AwemeControl awemeControl = aweme.getAwemeControl();
            if (awemeControl != null) {
                bool3 = Boolean.valueOf(awemeControl.canShare());
            } else {
                bool3 = null;
            }
            serverExtra.aac = bool3;
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                bool4 = Boolean.valueOf(status.isReviewed());
            } else {
                bool4 = null;
            }
            serverExtra.asr = bool4;
            C36821Ecj<Integer> LIZLLL = C235779Nd.LIZ.LIZLLL();
            if (LIZLLL != null) {
                num3 = LIZLLL.LIZ();
            } else {
                num3 = null;
            }
            serverExtra.sd = num3;
            serverExtra.ap = Boolean.valueOf(aweme.isPreventDownload());
            AwemeStatus status2 = aweme.getStatus();
            if (status2 != null) {
                bool5 = Boolean.valueOf(status2.isAllowShare());
            } else {
                bool5 = null;
            }
            serverExtra.asa = bool5;
            AwemeStatus status3 = aweme.getStatus();
            if (status3 != null) {
                num4 = Integer.valueOf(status3.getDownloadStatus());
            } else {
                num4 = null;
            }
            serverExtra.asd = num4;
            VideoControl videoControl2 = aweme.getVideoControl();
            if (videoControl2 != null) {
                bool6 = videoControl2.allowDownload;
            }
            serverExtra.ad = bool6;
            return serverExtra;
        }

        public final void setAa(Integer num) {
            this.aa = num;
        }

        public final void setAac(Boolean bool) {
            this.aac = bool;
        }

        public final void setAad(Integer num) {
            this.aad = num;
        }

        public final void setAas(Boolean bool) {
            this.aas = bool;
        }

        public final void setAd(Boolean bool) {
            this.ad = bool;
        }

        public final void setAp(Boolean bool) {
            this.ap = bool;
        }

        public final void setArw(Boolean bool) {
            this.arw = bool;
        }

        public final void setAsa(Boolean bool) {
            this.asa = bool;
        }

        public final void setAsd(Integer num) {
            this.asd = num;
        }

        public final void setAsr(Boolean bool) {
            this.asr = bool;
        }

        public final void setAvp(Integer num) {
            this.avp = num;
        }

        public final void setSd(Integer num) {
            this.sd = num;
        }

        public final void setSs(Boolean bool) {
            this.ss = bool;
        }
    }

    public static final ACLCommonStruct LIZ() {
        return (ACLCommonStruct) LIZ.getValue();
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ACLCommonStruct = [");
        LIZ2.append(LIZ());
        LIZ2.append(']');
        return X1D.LIZIZ(LIZ2);
    }
}
