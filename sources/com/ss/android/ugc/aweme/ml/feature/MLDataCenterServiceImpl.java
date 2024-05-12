package com.ss.android.ugc.aweme.ml.feature;

import X.C06510Nj;
import X.C25620zW;
import X.C46433IKf;
import X.C46434IKg;
import X.C47322Ihi;
import X.C48562J4c;
import X.C48585J4z;
import X.C48612J6a;
import X.C48613J6b;
import X.C48614J6c;
import X.C48615J6d;
import X.C48616J6e;
import X.C48617J6f;
import X.C48618J6g;
import X.C48619J6h;
import X.C48621J6j;
import X.C48622J6k;
import X.C48625J6n;
import X.C48626J6o;
import X.C48627J6p;
import X.C48628J6q;
import X.C48629J6r;
import X.C7D6;
import X.FMX;
import X.FVP;
import X.J3S;
import X.J3U;
import X.J4A;
import X.J4G;
import X.J54;
import X.J56;
import X.J6Y;
import X.X1D;
import X.YE1;
import Y.ARunnableS44S0100000_8;
import Y.ARunnableS9S1100000_8;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.infra.FeatureAdPlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeatureFeedTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeaturePhoneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeatureSequenceTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeatureSessionTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeatureUserTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class MLDataCenterServiceImpl extends MLDataCenterService implements J4G {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void checkAndInit() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        C48562J4c c48562J4c = MLDataCenterService.Companion;
        c48562J4c.getClass();
        boolean z = MLDataCenterService.debug;
        if (z) {
            System.currentTimeMillis();
        }
        HashSet<String> hashSet = C48612J6a.LIZJ;
        hashSet.addAll(C48612J6a.LIZ);
        hashSet.addAll(J6Y.LIZJ);
        C46433IKf c46433IKf = MLCommonService.Companion;
        c46433IKf.getClass();
        IMLCommonService iMLCommonService = C46434IKg.LIZ;
        iMLCommonService.addCommonEventListener("play_prepare", this);
        c46433IKf.getClass();
        iMLCommonService.addCommonEventListener("play_call_playtime", this);
        LIZ(C48622J6k.LIZ);
        c48562J4c.getClass();
        if (z) {
            System.currentTimeMillis();
        }
    }

    public final void LIZ(boolean z) {
        if (z && !C48622J6k.LIZIZ) {
            C48622J6k.LIZIZ = true;
            C46433IKf c46433IKf = MLCommonService.Companion;
            c46433IKf.getClass();
            IMLCommonService iMLCommonService = C46434IKg.LIZ;
            iMLCommonService.addCommonEventListener("play_first_frame", this);
            c46433IKf.getClass();
            iMLCommonService.addCommonEventListener("on_view_pager_selected", this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
        FeaturePhoneTypeConfig fTypePhone;
        if (inputFeaturesConfig == null) {
            return;
        }
        FeaturePlayTypeConfig fTypePlay = inputFeaturesConfig.getFTypePlay();
        if (fTypePlay != null && fTypePlay.getEnable()) {
            J3S.LIZ.LIZ = true;
            C48612J6a.LIZIZ = true;
        }
        FeatureFeedTypeConfig fTypeFeed = inputFeaturesConfig.getFTypeFeed();
        if (fTypeFeed != null && fTypeFeed.getEnable()) {
            J56.LIZ.LIZ = true;
        }
        FeatureUserTypeConfig fTypeUser = inputFeaturesConfig.getFTypeUser();
        if (fTypeUser != null && fTypeUser.getEnable()) {
            C48629J6r.LIZ.LIZ = true;
            C48612J6a.LIZIZ = true;
        }
        FeatureTypeConfig fTypeGAction = inputFeaturesConfig.getFTypeGAction();
        if (fTypeGAction != null && fTypeGAction.getEnable()) {
            J54.LIZ.LIZ = true;
            C48612J6a.LIZIZ = true;
        }
        FeatureSequenceTypeConfig fTypeSequence = inputFeaturesConfig.getFTypeSequence();
        if (fTypeSequence != null && fTypeSequence.getEnable()) {
            J3S.LIZ.LIZ = true;
            C48627J6p.LIZ.LIZ = true;
            C48612J6a.LIZIZ = true;
        }
        FeatureSessionTypeConfig fTypeSession = inputFeaturesConfig.getFTypeSession();
        if (fTypeSession != null && fTypeSession.getEnable()) {
            J3S.LIZ.LIZ = true;
            C48627J6p.LIZ.LIZ = true;
            C48628J6q.LIZ.LIZ = true;
            C48612J6a.LIZIZ = true;
        }
        FeatureAdPlayTypeConfig fTypeAdPlay = inputFeaturesConfig.getFTypeAdPlay();
        if (fTypeAdPlay != null && fTypeAdPlay.getEnable()) {
            J3S.LIZ.LIZ = true;
            C48626J6o.LIZ.LIZ = true;
            C48612J6a.LIZIZ = true;
        }
        FeaturePhoneTypeConfig fTypePhone2 = inputFeaturesConfig.getFTypePhone();
        if (fTypePhone2 != null && fTypePhone2.getEnable() && (fTypePhone = inputFeaturesConfig.getFTypePhone()) != null) {
            LIZ(fTypePhone.containSubType("touch", true));
        }
    }

    @Override // X.J4G
    public final void LIZIZ(String type, J4A j4a) {
        int i;
        int i2;
        String str;
        String str2;
        Aweme aweme;
        User author;
        Aweme aweme2;
        o.LJIIIZ(type, "type");
        MLDataCenterService.Companion.getClass();
        String str3 = null;
        if (MLDataCenterService.debug) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("onEvent type:", type, " aweme:");
            if (j4a != null && (aweme2 = j4a.LIZ) != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            LIZIZ2.append(str);
            LIZIZ2.append('-');
            if (j4a != null && (aweme = j4a.LIZ) != null && (author = aweme.getAuthor()) != null) {
                str2 = author.getNickname();
            } else {
                str2 = null;
            }
            LIZIZ2.append(str2);
            X1D.LIZIZ(LIZIZ2);
        }
        switch (type.hashCode()) {
            case -1704536429:
                if (!type.equals("play_first_frame") || j4a == null) {
                    return;
                }
                C48613J6b c48613J6b = C48625J6n.LIZ;
                String str4 = j4a.LIZIZ;
                c48613J6b.getClass();
                if (!C48622J6k.LIZ || !o.LJ("homepage_hot", str4) || c48613J6b.LIZLLL == null) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    Integer num = c48613J6b.LIZIZ;
                    int i3 = 0;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    jSONObject.put("velocityX", i);
                    Integer num2 = c48613J6b.LIZJ;
                    if (num2 != null) {
                        i2 = num2.intValue();
                    } else {
                        i2 = 0;
                    }
                    jSONObject.put("velocityY", i2);
                    Integer num3 = c48613J6b.LIZLLL;
                    if (num3 != null) {
                        i3 = num3.intValue();
                    }
                    jSONObject.put("velocity", i3);
                    FMX.LJIILJJIL("prf_feed_move", jSONObject);
                    return;
                } catch (JSONException unused) {
                    return;
                }
            case 1105406481:
                if (!type.equals("on_view_pager_selected") || j4a == null) {
                    return;
                }
                C48613J6b c48613J6b2 = C48625J6n.LIZ;
                JSONObject jSONObject2 = j4a.LIZLLL;
                c48613J6b2.getClass();
                if (jSONObject2 == null) {
                    return;
                }
                double optDouble = jSONObject2.optDouble("downX", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                double optDouble2 = jSONObject2.optDouble("downY", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                double optDouble3 = jSONObject2.optDouble("upX", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) - optDouble;
                double optDouble4 = jSONObject2.optDouble("upY", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) - optDouble2;
                double optDouble5 = jSONObject2.optDouble("upTimeMs", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) - jSONObject2.optDouble("downTimeMs", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                if (optDouble5 <= 1.0d) {
                    return;
                }
                double d = 1000;
                c48613J6b2.LIZIZ = Integer.valueOf((int) Math.abs((optDouble3 * d) / optDouble5));
                c48613J6b2.LIZJ = Integer.valueOf((int) Math.abs((optDouble4 * d) / optDouble5));
                c48613J6b2.LIZLLL = Integer.valueOf((int) Math.abs((Math.sqrt((optDouble4 * optDouble4) + (optDouble3 * optDouble3)) * d) / optDouble5));
                return;
            case 1168529143:
                if (!type.equals("play_call_playtime") || j4a == null) {
                    return;
                }
                Aweme aweme3 = j4a.LIZ;
                if (aweme3 != null) {
                    str3 = aweme3.getAid();
                }
                trackPlaytime(str3, j4a.LIZJ, j4a.LIZ, j4a.LIZIZ);
                return;
            case 1274399484:
                if (!type.equals("play_prepare") || j4a == null) {
                    return;
                }
                Aweme aweme4 = j4a.LIZ;
                if (aweme4 != null) {
                    str3 = aweme4.getAid();
                }
                trackPlayPrepare(str3, j4a.LIZ, j4a.LIZIZ);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi) {
        return fillInputFeatures(inputFeaturesConfig, c47322Ihi, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0111 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean fillInputFeatures(com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig r49, X.C47322Ihi r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.MLDataCenterServiceImpl.fillInputFeatures(com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig, X.Ihi, boolean):boolean");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final C48585J4z getFeedTrackRangeInfo(String str, int i, boolean z) {
        ArrayList<C48618J6g> LIZIZ2 = J3S.LIZ.LIZIZ.LIZIZ(i, str, z);
        if (LIZIZ2 != null) {
            C48585J4z c48585J4z = new C48585J4z();
            Iterator<C48618J6g> it = LIZIZ2.iterator();
            while (it.hasNext()) {
                C48618J6g next = it.next();
                if (next != null) {
                    c48585J4z.LIZ = next.LIZIZ.get() + c48585J4z.LIZ;
                    c48585J4z.LIZIZ = next.LIZJ.get() + c48585J4z.LIZIZ;
                    c48585J4z.LIZJ = next.LIZLLL.get() + c48585J4z.LIZJ;
                    c48585J4z.LIZLLL = next.LJ.get() + c48585J4z.LIZLLL;
                    ListProtector.add(c48585J4z.LJ, 0, Long.valueOf(next.LJIIIIZZ.get()));
                }
            }
            return c48585J4z;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService
    public final void trackPlayPrepare(String aid, Aweme aweme, String str) {
        int i;
        int i2;
        AtomicLong atomicLong;
        String str2;
        SessionPlayInfo sessionPlayInfo;
        String str3;
        String str4;
        User author;
        if (aid == null || aid.length() == 0) {
            return;
        }
        MLDataCenterService.Companion.getClass();
        C48618J6g c48618J6g = null;
        if (MLDataCenterService.debug) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("trackPlayPrepare aid:");
            LIZ.append(aid);
            LIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str4 = author.getNickname();
            } else {
                str4 = null;
            }
            LIZ.append(str4);
            LIZ.append(" enterType:");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
        }
        C48621J6j c48621J6j = J3S.LIZ;
        c48621J6j.getClass();
        o.LJIIIZ(aid, "aid");
        if (c48621J6j.LIZ) {
            if (c48621J6j.LIZIZ.LIZ(aid) == null) {
                c48621J6j.LIZIZ.LIZLLL(aid, new C48618J6g(aid));
            }
            c48618J6g = c48621J6j.LIZ(aid);
            if (c48618J6g != null && aweme != null) {
                c48618J6g.LJJIIJ = System.currentTimeMillis();
                c48618J6g.LJIILJJIL = aweme.isAd() ? 1 : 0;
                c48618J6g.LJIILL = aweme.isMixAweme() ? 1 : 0;
                User author2 = aweme.getAuthor();
                if (author2 != null && author2.getFollowStatus() == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                c48618J6g.LJIILLIIL = i;
                Video video = aweme.getVideo();
                if (video != null) {
                    c48618J6g.LJIIZILJ = video.getDuration();
                }
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    c48618J6g.LJIJI = (int) statistics.getDiggCount();
                    c48618J6g.LJIJ = (int) statistics.getCommentCount();
                    c48618J6g.LJIJJ = (int) statistics.getShareCount();
                    c48618J6g.LJIJJLI = (int) statistics.getPlayCount();
                    c48618J6g.LJIL = (int) statistics.getDownloadCount();
                    c48618J6g.LJJ = (int) statistics.getForwardCount();
                }
                String aid2 = aweme.getAid();
                o.LJI(aid2);
                o.LJI(str);
                C7D6 LIZLLL = C48617J6f.LIZLLL(aid2, str);
                if (LIZLLL != null) {
                    Integer num = LIZLLL.LIZIZ;
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = c48618J6g.LJJI;
                    }
                    c48618J6g.LJJI = i2;
                    c48618J6g.LJJIFFI = LIZLLL.LIZ;
                }
                c48618J6g.LJJII = FVP.LIZIZ;
                String format = C48617J6f.LJIILJJIL.format(new Date());
                o.LJIIIIZZ(format, "DATE_FORMAT.format(Date())");
                c48618J6g.LJJIII = format;
            }
        }
        C48619J6h c48619J6h = C48629J6r.LIZ;
        c48619J6h.getClass();
        if (c48619J6h.LIZ && (c48618J6g == null || (atomicLong = c48618J6g.LJIIIIZZ) == null || atomicLong.get() <= 0)) {
            c48619J6h.LIZIZ++;
        }
        C48615J6d c48615J6d = C48626J6o.LIZ;
        c48615J6d.getClass();
        if (c48615J6d.LIZ && c48618J6g != null && c48618J6g.LJIILJJIL != 0 && c48615J6d.LIZIZ.LIZ(aid) == null) {
            c48615J6d.LIZIZ.LIZLLL(aid, c48618J6g);
        }
        C48614J6c c48614J6c = C48627J6p.LIZ;
        c48614J6c.getClass();
        if (c48614J6c.LIZ && TextUtils.equals(str, "homepage_hot") && c48618J6g != null && (str3 = c48618J6g.LJJIFFI) != null) {
            if (c48614J6c.LIZIZ(str3) == null) {
                SequencePlayInfo sequencePlayInfo = new SequencePlayInfo();
                sequencePlayInfo.sequenceId = str3;
                sequencePlayInfo.sessionId = c48618J6g.LJJII;
                sequencePlayInfo.beginTime = c48618J6g.LJJIIJ;
                sequencePlayInfo.date = c48618J6g.LJJIII;
                c48614J6c.LIZIZ.LIZLLL(str3, sequencePlayInfo);
                if (c48614J6c.LIZLLL) {
                    if (c48614J6c.LIZ && !c48614J6c.LJ) {
                        c48614J6c.LJ = true;
                        J3U.LIZIZ(new ARunnableS44S0100000_8(c48614J6c, 104));
                    }
                } else if (c48614J6c.LIZ) {
                    J3U.LIZIZ(new ARunnableS44S0100000_8(c48614J6c, 105));
                }
                c48614J6c.LIZLLL = false;
            }
            if (!TextUtils.equals(c48614J6c.LIZJ.lastSequenceId, str3)) {
                SequenceComposeInfo sequenceComposeInfo = c48614J6c.LIZJ;
                sequenceComposeInfo.sequenceRank++;
                sequenceComposeInfo.lastSequenceId = c48618J6g.LJJIFFI;
            }
            c48614J6c.LIZJ.feedRank = c48618J6g.LJJI;
        }
        C48616J6e c48616J6e = C48628J6q.LIZ;
        c48616J6e.getClass();
        if (!c48616J6e.LIZ || !TextUtils.equals(str, "homepage_hot") || c48618J6g == null || (str2 = c48618J6g.LJJII) == null) {
            return;
        }
        if (!c48616J6e.LIZ || (sessionPlayInfo = c48616J6e.LIZIZ.LIZ(str2)) == null) {
            sessionPlayInfo = new SessionPlayInfo();
            sessionPlayInfo.sessionId = str2;
            sessionPlayInfo.beginTime = c48618J6g.LJJIIJ;
            sessionPlayInfo.date = c48618J6g.LJJIII;
            c48616J6e.LIZIZ.LIZLLL(str2, sessionPlayInfo);
            SessionComposeInfo sessionComposeInfo = c48616J6e.LIZJ;
            sessionComposeInfo.sessionRank++;
            String str5 = c48618J6g.LJJIII;
            sessionComposeInfo.date = str5;
            if (c48616J6e.LIZLLL && c48616J6e.LIZ && !c48616J6e.LJ) {
                c48616J6e.LJ = true;
                J3U.LIZIZ(new ARunnableS9S1100000_8(c48616J6e, str5, 9));
            }
        }
        if (!TextUtils.equals(c48616J6e.LIZJ.lastSequenceId, c48618J6g.LJJIFFI)) {
            sessionPlayInfo.seqCnt++;
            c48616J6e.LIZJ.lastSequenceId = c48618J6g.LJJIFFI;
            if (!c48616J6e.LIZLLL && c48616J6e.LIZ) {
                J3U.LIZIZ(new ARunnableS44S0100000_8(c48616J6e, 106));
            }
        }
        c48616J6e.LIZLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService
    public final void trackPlaytime(String aid, long j, Aweme aweme, String str) {
        C48618J6g LIZ;
        C48618J6g LIZ2;
        String str2;
        SessionPlayInfo LIZ3;
        String str3;
        SequencePlayInfo LIZ4;
        String str4;
        User author;
        int i = 0;
        if (aid == null || aid.length() == 0) {
            return;
        }
        C48621J6j c48621J6j = J3S.LIZ;
        c48621J6j.getClass();
        o.LJIIIZ(aid, "aid");
        if (c48621J6j.LIZ && (LIZ = c48621J6j.LIZ(aid)) != null) {
            int i2 = (int) LIZ.LJIIIIZZ.get();
            LIZ.LJIIIIZZ.addAndGet(j);
            int i3 = (int) LIZ.LJIIIIZZ.get();
            if (1 <= i3 && i3 < 2000) {
                i = 1;
            } else {
                i = 0;
            }
            if (1 <= i2 && i2 < 2000) {
                i--;
            }
        }
        C48629J6r.LIZ.LJ += i;
        C48614J6c c48614J6c = C48627J6p.LIZ;
        if ((c48614J6c.LIZ || C48628J6q.LIZ.LIZ) && (LIZ2 = c48621J6j.LIZ(aid)) != null) {
            if (LIZ2.LJJIFFI != null) {
                c48614J6c.getClass();
                if (c48614J6c.LIZ && TextUtils.equals(str, "homepage_hot") && (str3 = LIZ2.LJJIFFI) != null && (LIZ4 = c48614J6c.LIZIZ.LIZ(str3)) != null) {
                    LIZ4.playTime += j;
                    LIZ4.skipCount += i;
                }
            }
            if (LIZ2.LJJII != null) {
                C48616J6e c48616J6e = C48628J6q.LIZ;
                c48616J6e.getClass();
                if (c48616J6e.LIZ && TextUtils.equals(str, "homepage_hot") && (str2 = LIZ2.LJJII) != null && (LIZ3 = c48616J6e.LIZIZ.LIZ(str2)) != null) {
                    LIZ3.playTime += j;
                }
            }
        }
        MLDataCenterService.Companion.getClass();
        if (MLDataCenterService.debug) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("trackPlaytime aid:");
            LIZ5.append(aid);
            LIZ5.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str4 = author.getNickname();
            } else {
                str4 = null;
            }
            YE1.LIZLLL(LIZ5, str4, " enterType:", str, " duration:");
            C06510Nj.LIZIZ(LIZ5, j, " skipCnt:", i);
            X1D.LIZIZ(LIZ5);
        }
    }
}
