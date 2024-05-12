package com.ss.android.ugc.aweme.share.downloadv2.event.provider.download;

import X.C193647iq;
import X.C193657ir;
import X.C222578oP;
import X.C227768wm;
import X.C44938HkM;
import X.C55247LmF;
import X.C62840OlQ;
import X.C62842OlS;
import X.C84763XOl;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import android.text.TextUtils;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DownloadEventParamsGroupProvider implements BaseDownloadParamsGroupProvider<C193647iq> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62840OlQ c62840OlQ;
        InterfaceC55251LmJ LIZLLL;
        C62842OlS c62842OlS;
        String str;
        GScope gScope = GScope.LJLIL;
        InterfaceC55251LmJ LIZLLL2 = C55247LmF.LIZLLL(gScope, C62840OlQ.class, "Download");
        if (LIZLLL2 == null || (c62840OlQ = (C62840OlQ) LIZLLL2.getSource()) == null || (LIZLLL = C55247LmF.LIZLLL(gScope, C62842OlS.class, "Download")) == null || (c62842OlS = (C62842OlS) LIZLLL.getSource()) == null) {
            return null;
        }
        Aweme aweme = c62840OlQ.LJLILLLLZI;
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        String LIZ = C193657ir.LIZ(aweme);
        String LIZIZ = C193657ir.LIZIZ(c62840OlQ.LJLJJI);
        String valueOf = String.valueOf(C44938HkM.LJIIIZ);
        String LJFF = C227768wm.LJFF(aweme);
        String str2 = c62842OlS.LJLIL;
        int i = c62840OlQ.LJLJJLL;
        boolean isSubOnlyVideo = aweme.isSubOnlyVideo();
        if (c62842OlS.LJLJJL) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        String LJII = C222578oP.LJII(C84763XOl.LJIIIIZZ(), null, null);
        String valueOf2 = String.valueOf(aweme.aigcInfo.getAIGCLabelType());
        String valueOf3 = String.valueOf(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(C84763XOl.LJIIIIZZ(), aweme));
        String mixId = aweme.getMixId();
        o.LJIIIIZZ(mixId, "aweme.mixId");
        return new InterfaceC54035LIp(authorUid, LIZ, LIZIZ, valueOf, LJFF, str2, i, isSubOnlyVideo ? 1 : 0, str, LJII, valueOf2, valueOf3, mixId, c62842OlS.LJLJJI, c62842OlS.LJLILLLLZI, aweme, c62840OlQ.LJLJI, c62842OlS.LJLJI) { // from class: X.7iq
            public final String LJLIL;
            public final String LJLILLLLZI;
            public final String LJLJI;
            public final String LJLJJI;
            public final String LJLJJL;
            public final String LJLJJLL;
            public final String LJLJL;
            public final int LJLJLJ;
            public final int LJLJLLL;
            public final String LJLL;
            public final String LJLLI;
            public final String LJLLILLLL;
            public final String LJLLJ;
            public final String LJLLL;
            public final String LJLLLL;
            public final String LJLLLLLL;
            public final Aweme LJLZ;
            public final String LJZ;
            public final HashMap<String, String> LJZI;

            @Override // X.InterfaceC54035LIp
            public final boolean LLD() {
                return false;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLILZ() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("author_id", this.LJLIL);
                linkedHashMap.put("download_type", this.LJLILLLLZI);
                linkedHashMap.put("panel_source", this.LJLJI);
                linkedHashMap.put("retry_time", this.LJLJJI);
                linkedHashMap.put("impr_type", this.LJLJJL);
                linkedHashMap.put("is_reposted", this.LJLJJLL);
                linkedHashMap.put("from_group_id", this.LJLJL);
                linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LJLJLJ));
                linkedHashMap.put("is_sub_only_video", Integer.valueOf(this.LJLJLLL));
                linkedHashMap.put("is_save_with_watermark", this.LJLL);
                linkedHashMap.put("enter_position", this.LJLLI);
                linkedHashMap.put("aigc_theme_status", this.LJLLILLLL);
                linkedHashMap.put("music_name", this.LJLLJ);
                linkedHashMap.put("compilation_id", this.LJLLL);
                linkedHashMap.put("action_on", this.LJLLLL);
                return linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C193647iq)) {
                    return false;
                }
                C193647iq c193647iq = (C193647iq) obj;
                return o.LJ(this.LJLIL, c193647iq.LJLIL) && o.LJ(this.LJLILLLLZI, c193647iq.LJLILLLLZI) && o.LJ(this.LJLJI, c193647iq.LJLJI) && o.LJ(this.LJLJJI, c193647iq.LJLJJI) && o.LJ(this.LJLJJL, c193647iq.LJLJJL) && o.LJ(this.LJLJJLL, c193647iq.LJLJJLL) && o.LJ(this.LJLJL, c193647iq.LJLJL) && this.LJLJLJ == c193647iq.LJLJLJ && this.LJLJLLL == c193647iq.LJLJLLL && o.LJ(this.LJLL, c193647iq.LJLL) && o.LJ(this.LJLLI, c193647iq.LJLLI) && o.LJ(this.LJLLILLLL, c193647iq.LJLLILLLL) && o.LJ(this.LJLLJ, c193647iq.LJLLJ) && o.LJ(this.LJLLL, c193647iq.LJLLL) && o.LJ(this.LJLLLL, c193647iq.LJLLLL) && o.LJ(this.LJLLLLLL, c193647iq.LJLLLLLL) && o.LJ(this.LJLZ, c193647iq.LJLZ) && o.LJ(this.LJZ, c193647iq.LJZ) && o.LJ(this.LJZI, c193647iq.LJZI);
            }

            public final String toString() {
                return "DownloadEventExtraParamsGroup(authorID=" + this.LJLIL + ", downloadType=" + this.LJLILLLLZI + ", panelSource=" + this.LJLJI + ", retryTime=" + this.LJLJJI + ", imprType=" + this.LJLJJL + ", isReposeted=" + this.LJLJJLL + ", fromGroupID=" + this.LJLJL + ", isLandscapeScreen=" + this.LJLJLJ + ", isSubOnlyVideo=" + this.LJLJLLL + ", isSaveWithWatermark=" + this.LJLL + ", enterPosition=" + this.LJLLI + ", aigcThemeStatus=" + this.LJLLILLLL + ", musicName=" + this.LJLLJ + ", compilationID=" + this.LJLLL + ", actionOn=" + this.LJLLLL + ", newsID=" + this.LJLLLLLL + ", aweme=" + this.LJLZ + ", enterFrom=" + this.LJZ + ", inboxLogExtraMap=" + this.LJZI + ')';
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLJZ() {
                HashMap hashMap = new HashMap();
                hashMap.putAll(LLLILZ());
                String str3 = this.LJLLLLLL;
                if (str3 != null && str3.length() != 0) {
                    hashMap.put("news_id", this.LJLLLLLL);
                }
                FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
                String str4 = this.LJZ;
                if (str4 == null) {
                    str4 = "";
                }
                if (LJIIZILJ.LJIIJ(str4)) {
                    hashMap.put("play_mode", FypAutoScrollServiceImpl.LJIIZILJ().LJIIIZ());
                }
                if (this.LJLZ.getRepostFromGroupId() != null || this.LJLZ.getRepostFromUserId() != null) {
                    hashMap.put("author_id", this.LJLZ.getRepostFromUserId());
                    hashMap.put("repost_from_group_id", this.LJLZ.getAid());
                    hashMap.put("repost_from_user_id", this.LJLZ.getAuthorUid());
                    hashMap.put("is_reposted", "1");
                }
                if (C227768wm.LJJIIJ(this.LJZ)) {
                    if (TextUtils.equals(this.LJZ, "homepage_fresh") || TextUtils.equals(this.LJZ, "homepage_channel")) {
                        C2UL.LIZ();
                    }
                    hashMap.put("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LJLZ)));
                }
                String str5 = this.LJLLLL;
                if (str5 == null || str5.length() == 0) {
                    hashMap.remove("action_on");
                }
                return hashMap;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLLIL() {
                C188727au c188727au = new C188727au();
                C57258Mda.LIZIZ(c188727au, "download", this.LJZI);
                java.util.Map<String, String> map = c188727au.LIZ;
                o.LJIIIIZZ(map, "EventMapBuilder().apply …aMap)\n        }.builder()");
                return map;
            }

            public final int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int LJ = C79062V1e.LJ(this.LJLLL, C79062V1e.LJ(this.LJLLJ, C79062V1e.LJ(this.LJLLILLLL, C79062V1e.LJ(this.LJLLI, C79062V1e.LJ(this.LJLL, (((C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31), 31), 31), 31) + this.LJLJLJ) * 31) + this.LJLJLLL) * 31, 31), 31), 31), 31), 31);
                String str3 = this.LJLLLL;
                int i2 = 0;
                if (str3 == null) {
                    hashCode = 0;
                } else {
                    hashCode = str3.hashCode();
                }
                int i3 = (LJ + hashCode) * 31;
                String str4 = this.LJLLLLLL;
                if (str4 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str4.hashCode();
                }
                int hashCode4 = (this.LJLZ.hashCode() + ((i3 + hashCode2) * 31)) * 31;
                String str5 = this.LJZ;
                if (str5 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str5.hashCode();
                }
                int i4 = (hashCode4 + hashCode3) * 31;
                HashMap<String, String> hashMap = this.LJZI;
                if (hashMap != null) {
                    i2 = hashMap.hashCode();
                }
                return i4 + i2;
            }

            {
                C43588H8u.LIZLLL(valueOf, "retryTime", str2, "fromGroupID", valueOf2, "aigcThemeStatus", valueOf3, "musicName");
                this.LJLIL = authorUid;
                this.LJLILLLLZI = LIZ;
                this.LJLJI = LIZIZ;
                this.LJLJJI = valueOf;
                this.LJLJJL = LJFF;
                this.LJLJJLL = CardStruct.IStatusCode.DEFAULT;
                this.LJLJL = str2;
                this.LJLJLJ = i;
                this.LJLJLLL = r16;
                this.LJLL = str;
                this.LJLLI = LJII;
                this.LJLLILLLL = valueOf2;
                this.LJLLJ = valueOf3;
                this.LJLLL = mixId;
                this.LJLLLL = r22;
                this.LJLLLLLL = r23;
                this.LJLZ = aweme;
                this.LJZ = r25;
                this.LJZI = r26;
            }
        };
    }
}
