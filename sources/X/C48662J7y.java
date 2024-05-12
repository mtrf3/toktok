package X;

import Y.ARunnableS12S0400000_8;
import Y.ARunnableS7S0210000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.J7y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48662J7y extends IDP {
    public boolean LLLZL;

    public C48662J7y(int i, IDR idr, String str) {
        super(i, idr, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x059a A[Catch: JSONException -> 0x060f, TryCatch #0 {JSONException -> 0x060f, blocks: (B:221:0x000a, B:3:0x000d, B:6:0x001c, B:8:0x002e, B:9:0x003b, B:11:0x004e, B:12:0x0058, B:14:0x005e, B:17:0x006d, B:18:0x0087, B:20:0x008e, B:22:0x0094, B:27:0x00a3, B:29:0x00ad, B:31:0x00bb, B:34:0x00c4, B:38:0x00cc, B:40:0x00d2, B:42:0x00e8, B:43:0x00f4, B:45:0x00fa, B:47:0x0121, B:49:0x0127, B:51:0x012d, B:54:0x0133, B:57:0x0144, B:59:0x0149, B:62:0x0157, B:63:0x015d, B:65:0x01a6, B:68:0x01af, B:70:0x0201, B:72:0x0209, B:73:0x020d, B:75:0x0211, B:77:0x0219, B:78:0x0221, B:80:0x0243, B:82:0x024b, B:83:0x024f, B:85:0x025a, B:86:0x0260, B:88:0x0266, B:89:0x026c, B:92:0x0287, B:95:0x028f, B:96:0x0291, B:98:0x0297, B:99:0x02b1, B:101:0x0307, B:102:0x030e, B:104:0x034f, B:105:0x0356, B:107:0x037e, B:109:0x0384, B:110:0x038a, B:112:0x0399, B:114:0x03b9, B:116:0x03c6, B:119:0x0434, B:120:0x0442, B:122:0x0451, B:123:0x0463, B:125:0x046c, B:126:0x046f, B:128:0x0475, B:129:0x0484, B:132:0x04b2, B:134:0x04b8, B:136:0x04c2, B:138:0x04d0, B:139:0x04d4, B:141:0x04de, B:143:0x04ec, B:145:0x04fe, B:147:0x0517, B:148:0x052c, B:150:0x0536, B:152:0x055f, B:155:0x058f, B:157:0x059a, B:160:0x05a5, B:163:0x05ad, B:164:0x05b0, B:166:0x05c2, B:167:0x05c6, B:170:0x05ce, B:172:0x05d4, B:174:0x05da, B:176:0x05f4, B:178:0x05fb, B:181:0x0565, B:183:0x056f, B:184:0x054b, B:185:0x0542, B:186:0x0546, B:187:0x0550, B:190:0x03d0, B:192:0x03fe, B:193:0x03af, B:195:0x03b5, B:196:0x0408, B:198:0x0410, B:199:0x0419, B:201:0x0423, B:206:0x060b), top: B:220:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05c2 A[Catch: JSONException -> 0x060f, TryCatch #0 {JSONException -> 0x060f, blocks: (B:221:0x000a, B:3:0x000d, B:6:0x001c, B:8:0x002e, B:9:0x003b, B:11:0x004e, B:12:0x0058, B:14:0x005e, B:17:0x006d, B:18:0x0087, B:20:0x008e, B:22:0x0094, B:27:0x00a3, B:29:0x00ad, B:31:0x00bb, B:34:0x00c4, B:38:0x00cc, B:40:0x00d2, B:42:0x00e8, B:43:0x00f4, B:45:0x00fa, B:47:0x0121, B:49:0x0127, B:51:0x012d, B:54:0x0133, B:57:0x0144, B:59:0x0149, B:62:0x0157, B:63:0x015d, B:65:0x01a6, B:68:0x01af, B:70:0x0201, B:72:0x0209, B:73:0x020d, B:75:0x0211, B:77:0x0219, B:78:0x0221, B:80:0x0243, B:82:0x024b, B:83:0x024f, B:85:0x025a, B:86:0x0260, B:88:0x0266, B:89:0x026c, B:92:0x0287, B:95:0x028f, B:96:0x0291, B:98:0x0297, B:99:0x02b1, B:101:0x0307, B:102:0x030e, B:104:0x034f, B:105:0x0356, B:107:0x037e, B:109:0x0384, B:110:0x038a, B:112:0x0399, B:114:0x03b9, B:116:0x03c6, B:119:0x0434, B:120:0x0442, B:122:0x0451, B:123:0x0463, B:125:0x046c, B:126:0x046f, B:128:0x0475, B:129:0x0484, B:132:0x04b2, B:134:0x04b8, B:136:0x04c2, B:138:0x04d0, B:139:0x04d4, B:141:0x04de, B:143:0x04ec, B:145:0x04fe, B:147:0x0517, B:148:0x052c, B:150:0x0536, B:152:0x055f, B:155:0x058f, B:157:0x059a, B:160:0x05a5, B:163:0x05ad, B:164:0x05b0, B:166:0x05c2, B:167:0x05c6, B:170:0x05ce, B:172:0x05d4, B:174:0x05da, B:176:0x05f4, B:178:0x05fb, B:181:0x0565, B:183:0x056f, B:184:0x054b, B:185:0x0542, B:186:0x0546, B:187:0x0550, B:190:0x03d0, B:192:0x03fe, B:193:0x03af, B:195:0x03b5, B:196:0x0408, B:198:0x0410, B:199:0x0419, B:201:0x0423, B:206:0x060b), top: B:220:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05ce A[Catch: JSONException -> 0x060f, TRY_ENTER, TryCatch #0 {JSONException -> 0x060f, blocks: (B:221:0x000a, B:3:0x000d, B:6:0x001c, B:8:0x002e, B:9:0x003b, B:11:0x004e, B:12:0x0058, B:14:0x005e, B:17:0x006d, B:18:0x0087, B:20:0x008e, B:22:0x0094, B:27:0x00a3, B:29:0x00ad, B:31:0x00bb, B:34:0x00c4, B:38:0x00cc, B:40:0x00d2, B:42:0x00e8, B:43:0x00f4, B:45:0x00fa, B:47:0x0121, B:49:0x0127, B:51:0x012d, B:54:0x0133, B:57:0x0144, B:59:0x0149, B:62:0x0157, B:63:0x015d, B:65:0x01a6, B:68:0x01af, B:70:0x0201, B:72:0x0209, B:73:0x020d, B:75:0x0211, B:77:0x0219, B:78:0x0221, B:80:0x0243, B:82:0x024b, B:83:0x024f, B:85:0x025a, B:86:0x0260, B:88:0x0266, B:89:0x026c, B:92:0x0287, B:95:0x028f, B:96:0x0291, B:98:0x0297, B:99:0x02b1, B:101:0x0307, B:102:0x030e, B:104:0x034f, B:105:0x0356, B:107:0x037e, B:109:0x0384, B:110:0x038a, B:112:0x0399, B:114:0x03b9, B:116:0x03c6, B:119:0x0434, B:120:0x0442, B:122:0x0451, B:123:0x0463, B:125:0x046c, B:126:0x046f, B:128:0x0475, B:129:0x0484, B:132:0x04b2, B:134:0x04b8, B:136:0x04c2, B:138:0x04d0, B:139:0x04d4, B:141:0x04de, B:143:0x04ec, B:145:0x04fe, B:147:0x0517, B:148:0x052c, B:150:0x0536, B:152:0x055f, B:155:0x058f, B:157:0x059a, B:160:0x05a5, B:163:0x05ad, B:164:0x05b0, B:166:0x05c2, B:167:0x05c6, B:170:0x05ce, B:172:0x05d4, B:174:0x05da, B:176:0x05f4, B:178:0x05fb, B:181:0x0565, B:183:0x056f, B:184:0x054b, B:185:0x0542, B:186:0x0546, B:187:0x0550, B:190:0x03d0, B:192:0x03fe, B:193:0x03af, B:195:0x03b5, B:196:0x0408, B:198:0x0410, B:199:0x0419, B:201:0x0423, B:206:0x060b), top: B:220:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05f4 A[Catch: JSONException -> 0x060f, TryCatch #0 {JSONException -> 0x060f, blocks: (B:221:0x000a, B:3:0x000d, B:6:0x001c, B:8:0x002e, B:9:0x003b, B:11:0x004e, B:12:0x0058, B:14:0x005e, B:17:0x006d, B:18:0x0087, B:20:0x008e, B:22:0x0094, B:27:0x00a3, B:29:0x00ad, B:31:0x00bb, B:34:0x00c4, B:38:0x00cc, B:40:0x00d2, B:42:0x00e8, B:43:0x00f4, B:45:0x00fa, B:47:0x0121, B:49:0x0127, B:51:0x012d, B:54:0x0133, B:57:0x0144, B:59:0x0149, B:62:0x0157, B:63:0x015d, B:65:0x01a6, B:68:0x01af, B:70:0x0201, B:72:0x0209, B:73:0x020d, B:75:0x0211, B:77:0x0219, B:78:0x0221, B:80:0x0243, B:82:0x024b, B:83:0x024f, B:85:0x025a, B:86:0x0260, B:88:0x0266, B:89:0x026c, B:92:0x0287, B:95:0x028f, B:96:0x0291, B:98:0x0297, B:99:0x02b1, B:101:0x0307, B:102:0x030e, B:104:0x034f, B:105:0x0356, B:107:0x037e, B:109:0x0384, B:110:0x038a, B:112:0x0399, B:114:0x03b9, B:116:0x03c6, B:119:0x0434, B:120:0x0442, B:122:0x0451, B:123:0x0463, B:125:0x046c, B:126:0x046f, B:128:0x0475, B:129:0x0484, B:132:0x04b2, B:134:0x04b8, B:136:0x04c2, B:138:0x04d0, B:139:0x04d4, B:141:0x04de, B:143:0x04ec, B:145:0x04fe, B:147:0x0517, B:148:0x052c, B:150:0x0536, B:152:0x055f, B:155:0x058f, B:157:0x059a, B:160:0x05a5, B:163:0x05ad, B:164:0x05b0, B:166:0x05c2, B:167:0x05c6, B:170:0x05ce, B:172:0x05d4, B:174:0x05da, B:176:0x05f4, B:178:0x05fb, B:181:0x0565, B:183:0x056f, B:184:0x054b, B:185:0x0542, B:186:0x0546, B:187:0x0550, B:190:0x03d0, B:192:0x03fe, B:193:0x03af, B:195:0x03b5, B:196:0x0408, B:198:0x0410, B:199:0x0419, B:201:0x0423, B:206:0x060b), top: B:220:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121 A[Catch: JSONException -> 0x060f, TryCatch #0 {JSONException -> 0x060f, blocks: (B:221:0x000a, B:3:0x000d, B:6:0x001c, B:8:0x002e, B:9:0x003b, B:11:0x004e, B:12:0x0058, B:14:0x005e, B:17:0x006d, B:18:0x0087, B:20:0x008e, B:22:0x0094, B:27:0x00a3, B:29:0x00ad, B:31:0x00bb, B:34:0x00c4, B:38:0x00cc, B:40:0x00d2, B:42:0x00e8, B:43:0x00f4, B:45:0x00fa, B:47:0x0121, B:49:0x0127, B:51:0x012d, B:54:0x0133, B:57:0x0144, B:59:0x0149, B:62:0x0157, B:63:0x015d, B:65:0x01a6, B:68:0x01af, B:70:0x0201, B:72:0x0209, B:73:0x020d, B:75:0x0211, B:77:0x0219, B:78:0x0221, B:80:0x0243, B:82:0x024b, B:83:0x024f, B:85:0x025a, B:86:0x0260, B:88:0x0266, B:89:0x026c, B:92:0x0287, B:95:0x028f, B:96:0x0291, B:98:0x0297, B:99:0x02b1, B:101:0x0307, B:102:0x030e, B:104:0x034f, B:105:0x0356, B:107:0x037e, B:109:0x0384, B:110:0x038a, B:112:0x0399, B:114:0x03b9, B:116:0x03c6, B:119:0x0434, B:120:0x0442, B:122:0x0451, B:123:0x0463, B:125:0x046c, B:126:0x046f, B:128:0x0475, B:129:0x0484, B:132:0x04b2, B:134:0x04b8, B:136:0x04c2, B:138:0x04d0, B:139:0x04d4, B:141:0x04de, B:143:0x04ec, B:145:0x04fe, B:147:0x0517, B:148:0x052c, B:150:0x0536, B:152:0x055f, B:155:0x058f, B:157:0x059a, B:160:0x05a5, B:163:0x05ad, B:164:0x05b0, B:166:0x05c2, B:167:0x05c6, B:170:0x05ce, B:172:0x05d4, B:174:0x05da, B:176:0x05f4, B:178:0x05fb, B:181:0x0565, B:183:0x056f, B:184:0x054b, B:185:0x0542, B:186:0x0546, B:187:0x0550, B:190:0x03d0, B:192:0x03fe, B:193:0x03af, B:195:0x03b5, B:196:0x0408, B:198:0x0410, B:199:0x0419, B:201:0x0423, B:206:0x060b), top: B:220:0x000a }] */
    @Override // X.IDP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(java.lang.String r23, X.IDR r24, com.ss.android.ugc.aweme.feed.model.Aweme r25) {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48662J7y.LJIL(java.lang.String, X.IDR, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.IDP
    public final void LJJ(IPG ipg, C2MA c2ma, boolean z) {
        String str;
        String str2;
        Video video;
        Audio audio;
        if (!LJII()) {
            return;
        }
        String str3 = ipg.LIZ;
        if (IDP.LJJLIIIJL(c2ma) && C38354F3m.LIZJ(c2ma.getCurrentAweme().getAid(), str3)) {
            InterfaceC222708oc LLLJ = c2ma.LLLJ();
            if (LLLJ.UU() == 2) {
                LLLJ.onPlayFailed(ipg);
            } else if (C72083SQt.LJLILLLLZI(c2ma)) {
                C78253UnR LJJIIZI = C73340SqO.LJJIIZI();
                Aweme currentAweme = c2ma.getCurrentAweme();
                LJJIIZI.getClass();
                if (currentAweme != null && C59251NNf.LIZIZ(3, currentAweme)) {
                    C59127NIl LIZ = C59128NIm.LIZ();
                    LIZ.LJ(currentAweme);
                    LIZ.LIZ = "draw_ad";
                    LIZ.LIZIZ = "show_fail";
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("error_message", "vast_mediafile_bad_response");
                    c188727au.LIZLLL(ipg.LJ, "error_code");
                    Object obj = ipg.LJI;
                    if (obj == null || (str = obj.toString()) == null) {
                        str = "";
                    }
                    c188727au.LJIIIZ("error_detail", str);
                    LIZ.LIZ(c188727au.LIZ);
                    LIZ.LJIIIZ(null);
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_fail", currentAweme.getAwemeRawAd());
                    LIZLLL.LIZIZ("vast_mediafile_bad_response", "error_message");
                    LIZLLL.LIZIZ(Integer.valueOf(ipg.LJ), "error_code");
                    Object obj2 = ipg.LJI;
                    if (obj2 == null || (str2 = obj2.toString()) == null) {
                        str2 = "";
                    }
                    LIZLLL.LIZIZ(str2, "error_detail");
                    LIZLLL.LJII();
                }
                if (C63081OpJ.LJLLLL(c2ma.getCurrentAweme()) && LJJIII().LIZ() != null) {
                    video = LJJIII().LIZ();
                    audio = null;
                } else {
                    video = c2ma.getCurrentAweme().getVideo();
                    audio = c2ma.getCurrentAweme().getAudio();
                }
                if (ipg.LIZLLL && video.getVideoModelStr() != null) {
                    if (C63081OpJ.LJLLLL(c2ma.getCurrentAweme())) {
                        video.setRationAndSourceId(LJJIII().LIZIZ());
                    } else {
                        video.setRationAndSourceId(IDP.LJJJJLI(c2ma));
                    }
                    LLD(IDP.LJJJJLI(c2ma), false);
                    LJJJJIZL().setSurface(LLLJ.getSurface());
                    if (C34069DYr.LIZ) {
                        InterfaceC46330IGg LJJJJIZL = LJJJJIZL();
                        C46744IWe c46744IWe = new C46744IWe();
                        c46744IWe.LIZ.LIZJ = C51029K0z.LJJJJ(video);
                        c46744IWe.LIZ.LIZLLL = Audio.convertToSimAudio(video, audio);
                        c46744IWe.LIZIZ(IDP.LJJLIIIJILLIZJL(c2ma.getCurrentAweme()));
                        int infoId = Audio.InfoIdType.ORIGINAL.getInfoId();
                        C46745IWf c46745IWf = c46744IWe.LIZ;
                        c46745IWf.LJ = infoId;
                        c46745IWf.LJIIIZ = true;
                        c46745IWf.LJIIJ = 0;
                        c46745IWf.LJIJ = true;
                        c46745IWf.LJIJI = false;
                        c46745IWf.LJJJJL = false;
                        LJJJJIZL.LJJJI(c46744IWe.LIZ());
                    } else {
                        LJJJJIZL().LJIIJJI(video, audio, IDP.LJJLIIIJILLIZJL(c2ma.getCurrentAweme()), true, 0, true, false, LJJJJZ(c2ma));
                    }
                    if (z) {
                        LJLI(ipg, c2ma);
                        return;
                    }
                    return;
                }
                int i = ipg.LIZJ;
                if (1 == i) {
                    if (C63081OpJ.LJLLLL(c2ma.getCurrentAweme())) {
                        video.setRationAndSourceId(LJJIII().LIZIZ());
                    } else {
                        video.setRationAndSourceId(IDP.LJJJJLI(c2ma));
                    }
                    C38816FLg.LJ(new ARunnableS7S0210000_8(this, video, false, 1));
                    LLD(IDP.LJJJJLI(c2ma), false);
                    LJJJJIZL().setSurface(LLLJ.getSurface());
                    if (c2ma.getCurrentAweme() != null && c2ma.getCurrentAweme().getVideo() != null) {
                        c2ma.getCurrentAweme().getVideo().setBitRate(null);
                        VideoUrlModel playAddrH264 = c2ma.getCurrentAweme().getVideo().getPlayAddrH264();
                        if (playAddrH264 != null) {
                            playAddrH264.setBitRate(null);
                        }
                        if (C34507DgV.LIZ) {
                            C46259IDn LJJJJZ = LJJJJZ(c2ma);
                            C46744IWe c46744IWe2 = new C46744IWe();
                            SimVideoUrlModel LJJJJI = C51029K0z.LJJJJI(playAddrH264);
                            C46745IWf c46745IWf2 = c46744IWe2.LIZ;
                            c46745IWf2.LJI = LJJJJI;
                            c46745IWf2.LJIJJ = IWI.Normal;
                            c46745IWf2.LJIIIZ = true;
                            c46745IWf2.LJIL = true;
                            boolean isNeedSetCookie = video.isNeedSetCookie();
                            C46745IWf c46745IWf3 = c46744IWe2.LIZ;
                            c46745IWf3.LJIJJLI = isNeedSetCookie;
                            if (LJJJJZ != null) {
                                int i2 = LJJJJZ.LIZ;
                                String str4 = LJJJJZ.LIZIZ;
                                boolean z2 = LJJJJZ.LIZJ;
                                JSONObject jSONObject = LJJJJZ.LIZLLL;
                                c46745IWf3.LJJJ = true;
                                c46745IWf3.LJJJI = i2;
                                c46745IWf3.LJJJIL = str4;
                                c46745IWf3.LJJIZ = z2;
                                c46745IWf3.LJJJJ = jSONObject;
                            }
                            LJJJJIZL().LJJJI(c46744IWe2.LIZ());
                        } else {
                            LJJJJIZL().LJJIJIIJIL(playAddrH264, video.isNeedSetCookie(), LJJJJZ(c2ma));
                        }
                    }
                    if (z) {
                        LJLI(ipg, c2ma);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (C63081OpJ.LJLLLL(c2ma.getCurrentAweme())) {
                        video.setRationAndSourceId(LJJIII().LIZIZ());
                    } else {
                        video.setRationAndSourceId(IDP.LJJJJLI(c2ma));
                    }
                    LLD(IDP.LJJJJLI(c2ma), false);
                    LJJJJIZL().setSurface(LLLJ.getSurface());
                    if (c2ma.getCurrentAweme() != null && c2ma.getCurrentAweme().getVideo() != null) {
                        c2ma.getCurrentAweme().getVideo().setBitRate(null);
                        VideoUrlModel playAddrBytevc1 = c2ma.getCurrentAweme().getVideo().getPlayAddrBytevc1();
                        if (playAddrBytevc1 != null || (playAddrBytevc1 = c2ma.getCurrentAweme().getVideo().getPlayAddrH264()) != null) {
                            playAddrBytevc1.setBitRate(null);
                        }
                        if (C34507DgV.LIZ) {
                            C46259IDn LJJJJZ2 = LJJJJZ(c2ma);
                            C46744IWe c46744IWe3 = new C46744IWe();
                            SimVideoUrlModel LJJJJI2 = C51029K0z.LJJJJI(playAddrBytevc1);
                            C46745IWf c46745IWf4 = c46744IWe3.LIZ;
                            c46745IWf4.LJI = LJJJJI2;
                            c46745IWf4.LJIIIZ = true;
                            c46745IWf4.LJIL = true;
                            c46744IWe3.LIZ.LJIJJLI = video.isNeedSetCookie();
                            LJJJJZ2.getClass();
                            int i3 = LJJJJZ2.LIZ;
                            String str5 = LJJJJZ2.LIZIZ;
                            boolean z3 = LJJJJZ2.LIZJ;
                            JSONObject jSONObject2 = LJJJJZ2.LIZLLL;
                            C46745IWf c46745IWf5 = c46744IWe3.LIZ;
                            c46745IWf5.LJJJ = true;
                            c46745IWf5.LJJJI = i3;
                            c46745IWf5.LJJJIL = str5;
                            c46745IWf5.LJJIZ = z3;
                            c46745IWf5.LJJJJ = jSONObject2;
                            LJJJJIZL().LJJJI(c46744IWe3.LIZ());
                        } else {
                            LJJJJIZL().LJJIJIIJIL(playAddrBytevc1, video.isNeedSetCookie(), LJJJJZ(c2ma));
                        }
                    }
                    if (z) {
                        LJLI(ipg, c2ma);
                        return;
                    }
                    return;
                }
                String LJFF = C86V.LJFF(R.string.jst);
                C5S1 c5s1 = new C5S1(this.LJLIL);
                c5s1.LIZLLL(LJFF);
                c5s1.LJ();
                LLLJ.onPlayFailed(ipg);
                IDR LJJJ = LJJJ();
                if (LJJJ != null) {
                    LJJJ.stopLineProgressBarAnimation();
                }
                if (z) {
                    LJLI(ipg, c2ma);
                }
                if (video == null || video.getPlayAddr() == null) {
                    return;
                }
                if (this.LLJI != 0) {
                    this.LLJI = 0L;
                }
                C38816FLg.LJ(new ARunnableS12S0400000_8(this, ipg, video, c2ma, 0));
                if (LJJJ != null) {
                    LJJJ.setVideoAppLogDuration(0L);
                }
                this.LLJI = 0L;
            }
        }
        LJZ(new C46276IEe(1, 0));
    }

    @Override // X.IDP
    public final void LJJI(final String str, final IDR idr, final Aweme aweme) {
        final String str2;
        Intent intent;
        final Context LJJIIZ = LJJIIZ();
        final int i = this.LJLJJI;
        if (!this.LLIZLLLIL) {
            if ((LJJIIZ instanceof Activity) && (intent = C45804HyK.LJIJJ(LJJIIZ).getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
                str2 = C16880lQ.LLJJIJIIJIL(intent, "rule_id");
            } else {
                str2 = null;
            }
            C10K.LIZIZ(new Callable() { // from class: X.J8F
                public final /* synthetic */ JSONObject LJLJL = null;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    boolean z2;
                    String str7;
                    String str8;
                    String searchTabName;
                    String valueOf;
                    int batchNum;
                    int batchNumAll;
                    int playNum;
                    boolean z3;
                    String str9;
                    String str10;
                    int i2;
                    boolean z4;
                    boolean z5;
                    InterfaceC55235Lm3 vScope;
                    IPipAbility iPipAbility;
                    String str11;
                    String str12;
                    double d;
                    double d2;
                    C48662J7y c48662J7y = C48662J7y.this;
                    String str13 = str;
                    Aweme aweme2 = aweme;
                    IDR idr2 = idr;
                    int i3 = i;
                    Context context = LJJIIZ;
                    JSONObject jSONObject = this.LJLJL;
                    String str14 = str2;
                    if (!c48662J7y.LLLZL) {
                        Thread thread = C16880lQ.LLLLIIIILLL();
                        o.LJIIIZ(thread, "thread");
                        thread.setPriority(3);
                        c48662J7y.LLLZL = true;
                    }
                    C57362MfG c57362MfG = new C57362MfG();
                    c57362MfG.LJJIIZI(str13);
                    c57362MfG.LJJJJZ = C44729Hgz.LJIIZILJ(aweme2.getAuthor());
                    c57362MfG.LJJLI = EnumC57366MfK.ITEM;
                    c57362MfG.LJJJJI();
                    c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
                    c57362MfG.LJJIIZ(aweme2);
                    c57362MfG.LJJJJIZL(aweme2.getAuthor());
                    c57362MfG.LJJIJ("");
                    C220488l2.LIZIZ.LJII(aweme2, c57362MfG);
                    java.util.Map<String, String> map = null;
                    C222578oP.LIZIZ(c57362MfG, aweme2, null, null, null);
                    c57362MfG.LJJIZ();
                    if (C2M9.LIZ()) {
                        return null;
                    }
                    if (aweme2.getMusic() != null) {
                        str3 = String.valueOf(aweme2.getMusic().getId());
                        if (aweme2.getMusic().getMatchedSongInfo() == null) {
                            str4 = "";
                        } else {
                            str4 = aweme2.getMusic().getMatchedSongInfo().getId();
                        }
                        if (aweme2.getMusic().getMatchedPGCSoundInfo() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        map = aweme2.getMusic().getLogExtraMap();
                    } else {
                        z = false;
                        str3 = "";
                        str4 = "";
                    }
                    if (aweme2.getDsp() == null) {
                        str5 = "";
                        str6 = "";
                    } else {
                        str5 = aweme2.getDsp().getFullClipId();
                        str6 = String.valueOf(aweme2.getDsp().getMvId());
                    }
                    if (aweme2.getBottomBarModel() != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    PlayListInfo playListInfo = aweme2.playlist_info;
                    if (playListInfo == null) {
                        str7 = "";
                    } else {
                        str7 = playListInfo.getMixId();
                        if (idr2 instanceof InterfaceC57982Pi) {
                            ((InterfaceC57982Pi) idr2).LIZLLL();
                        }
                    }
                    if (c48662J7y.LLJLL == 0) {
                        C188727au c188727au = new C188727au();
                        c188727au.LIZLLL(IG3.LIZLLL() ? 1 : 0, "earphone_status");
                        c188727au.LIZJ("launch_volume_value", IG3.LIZJ);
                        c188727au.LIZJ("launch_volume_pct", IG3.LIZJ);
                        c188727au.LIZLLL(IG3.LIZIZ ? 1 : 0, "is_auto_adjusted");
                        if (IG3.LIZIZ) {
                            d = IG3.LIZJ();
                        } else {
                            d = IG3.LIZJ;
                        }
                        c188727au.LIZJ("auto_adjusted_volume_value", d);
                        if (IG3.LIZIZ) {
                            d2 = IG3.LIZJ();
                        } else {
                            d2 = IG3.LIZJ;
                        }
                        c188727au.LIZJ("auto_adjusted_volume_pct", d2);
                        FMX.LJIIL("first_video_play_volume", c188727au.LIZ);
                    }
                    M89 param = idr2.getParam();
                    if (!TextUtils.equals(c48662J7y.LJLJI, "homepage_friends")) {
                        str8 = "";
                    } else {
                        str8 = C54029LIj.LIZIZ.LJIIIZ(c48662J7y.LJLIL, aweme2);
                    }
                    String commentEnterMethod = param.getCommentEnterMethod();
                    if (commentEnterMethod == null) {
                        commentEnterMethod = str13;
                    }
                    String LJI = C38986FRu.LIZ().LJI();
                    C50913JyX c50913JyX = new C50913JyX();
                    c50913JyX.LJJLIIIJLLLLLLLZ = param.getPreviousPage();
                    c50913JyX.LJJLIIJ = param.getPreviousPagePosition();
                    c50913JyX.LJJLIL = z2;
                    c50913JyX.LJZI = c48662J7y.LJLJJL;
                    c50913JyX.LIZLLL = str13;
                    c50913JyX.LJJZ = c48662J7y.LJLJJLL;
                    c50913JyX.LJJIIZ(i3, aweme2);
                    C78996UzQ.LJJIIZ(aweme2);
                    c50913JyX.LL = c48662J7y.LLJLL;
                    c50913JyX.LJJLIIIJILLIZJL = C47285Ih7.LIZIZ().name();
                    c50913JyX.LLF = str3;
                    c50913JyX.LLI = str6;
                    c50913JyX.LLJZIJLIL = map;
                    c50913JyX.LLFF = str5;
                    c50913JyX.LLFFF = str4;
                    c50913JyX.LLFII = false;
                    c50913JyX.LLII = z;
                    c50913JyX.LJZ = aweme2.isHighlighted();
                    c50913JyX.LLIILZL = str7;
                    c50913JyX.LLILII = param.getPlaylistSearchId();
                    c50913JyX.LLIL = param.isFromVideo();
                    c50913JyX.LLIIZ = param.getCategoryName();
                    c50913JyX.LLFZ = param.getLibraryMaterialId();
                    c50913JyX.LLILLJJLI = commentEnterMethod;
                    c50913JyX.LLILLL = param.getLastGroupId();
                    c50913JyX.LLILZ = param.getPlaylistPreviousPage();
                    c50913JyX.LLILZIL = param.getEnterPlaylistGroupId();
                    c50913JyX.LLILL = !C86670Xzu.LJIL(aweme2) ? 1 : 0;
                    c50913JyX.LLILIL = !C86670Xzu.LJJII(aweme2) ? 1 : 0;
                    c50913JyX.LLJIJIL = aweme2.getCaptionReturnCount();
                    c50913JyX.LLLIIIIL = param.isFromPlaylist();
                    c50913JyX.LLJI = aweme2.getCaptionLength();
                    c50913JyX.LLJILJIL = C46295IEx.LIZIZ(aweme2);
                    c50913JyX.LLJILLL = param.getUseScenario();
                    c50913JyX.LLJILJILJ = param.getTnsBanType();
                    c50913JyX.LJLIL = str8;
                    c50913JyX.LJLILLLLZI = LJI;
                    String str15 = c48662J7y.LJLJJL;
                    if (TextUtils.equals(str15, "from_duet_mode")) {
                        c50913JyX.LLJJI = "duet";
                    } else if (TextUtils.equals(str15, "from_duet_mode_detail")) {
                        c50913JyX.LLJJI = "original";
                    }
                    if (aweme2.getSearchTabName() == null) {
                        searchTabName = "";
                    } else {
                        searchTabName = aweme2.getSearchTabName();
                    }
                    c50913JyX.LJJIJL = searchTabName;
                    if (aweme2.getSearchTabRank() == null) {
                        valueOf = "";
                    } else {
                        valueOf = String.valueOf(aweme2.getSearchTabRank());
                    }
                    c50913JyX.LJJIJLIJ = valueOf;
                    c50913JyX.LLJJIJI = param.getVoiceId();
                    c50913JyX.LLJJIJIIJIL = param.getVoiceConversionId();
                    QaStruct.Companion.getClass();
                    c50913JyX.LLJJJ = C161286Uq.LIZ(aweme2);
                    int i4 = -1;
                    if (!IFA.LIZ()) {
                        batchNum = -1;
                    } else {
                        batchNum = JCF.LIZJ.getModel().getBatchNum();
                    }
                    c50913JyX.LLJJJJJIL = Integer.valueOf(batchNum);
                    if (!IFA.LIZ()) {
                        batchNumAll = -1;
                    } else {
                        batchNumAll = JCF.LIZJ.getModel().getBatchNumAll();
                    }
                    c50913JyX.LLJJJIL = Integer.valueOf(batchNumAll);
                    if (!IFA.LIZ()) {
                        playNum = -1;
                    } else {
                        playNum = JCF.LIZJ.getModel().getPlayNum();
                    }
                    c50913JyX.LLJJJJLIIL = Integer.valueOf(playNum);
                    if (IFA.LIZ()) {
                        i4 = JCF.LIZJ.getModel().getPlayNumAll();
                    }
                    c50913JyX.LLJJJJ = Integer.valueOf(i4);
                    c50913JyX.LLJJL = Integer.valueOf(param.isFromAutoMessage());
                    c50913JyX.LJJJJJL = param.getVideoCollectionId();
                    c50913JyX.LJJJJL = param.getVideoCollectionName();
                    c50913JyX.LLLF = param.getMessageId();
                    c50913JyX.LLLFF = param.getConversationId();
                    Integer valueOf2 = Integer.valueOf(aweme2.getVideo().getHeight());
                    Integer valueOf3 = Integer.valueOf(aweme2.getVideo().getWidth());
                    Integer valueOf4 = Integer.valueOf(C57092Lx.LIZ.LIZJ);
                    Integer valueOf5 = Integer.valueOf(C224238r5.LJFF);
                    c50913JyX.LLLFZ = valueOf2;
                    c50913JyX.LLLI = valueOf3;
                    c50913JyX.LLLII = valueOf4;
                    c50913JyX.LLLIIII = valueOf5;
                    c50913JyX.LLLFFI = param.getProcessId();
                    AnonymousClass636.LIZJ(c50913JyX, aweme2.getAid());
                    if (C224888s8.LJ(str13)) {
                        c50913JyX.LJJJJIZL = C224888s8.LIZJ();
                    }
                    if (aweme2.getPodcastInfo() != null) {
                        if (aweme2.getPodcastInfo().isPodcastPreview() != null && aweme2.getPodcastInfo().isPodcastPreview().booleanValue()) {
                            c50913JyX.LIZJ(1, "is_podcast_preview");
                        } else {
                            c50913JyX.LIZJ(0, "is_podcast_preview");
                        }
                        if (aweme2.getPodcastInfo().getPlayAddr() != null && aweme2.getPodcastInfo().getPlayAddr().getUrlList() != null && !aweme2.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() && !TextUtils.isEmpty((CharSequence) ListProtector.get(aweme2.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                            c50913JyX.LIZLLL("podcast_rss_feed_url", (String) ListProtector.get(aweme2.getPodcastInfo().getPlayAddr().getUrlList(), 0));
                        } else {
                            c50913JyX.LIZLLL("podcast_rss_feed_url", "");
                        }
                        if (aweme2.getPodcastInfo().getEpisodeItemId() != null) {
                            c50913JyX.LIZLLL("podcast_rss_entry_id", aweme2.getPodcastInfo().getEpisodeItemId());
                        } else {
                            c50913JyX.LIZLLL("podcast_rss_entry_id", "");
                        }
                    } else {
                        c50913JyX.LIZJ(0, "is_podcast_preview");
                        c50913JyX.LIZLLL("podcast_rss_feed_url", "");
                        c50913JyX.LIZLLL("podcast_rss_entry_id", "");
                    }
                    List<String> ttsVoiceIDs = aweme2.getTtsVoiceIDs();
                    String str16 = CardStruct.IStatusCode.DEFAULT;
                    if (ttsVoiceIDs != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("[");
                        LIZ.append(IN5.LIZLLL(aweme2.getTtsVoiceIDs()));
                        LIZ.append("]");
                        c50913JyX.LIZLLL("tts_voice_ids", X1D.LIZIZ(LIZ));
                        if (!aweme2.getTtsVoiceIDs().isEmpty()) {
                            c50913JyX.LIZLLL("is_text_reading", "1");
                        } else {
                            c50913JyX.LIZLLL("is_text_reading", CardStruct.IStatusCode.DEFAULT);
                        }
                    }
                    if (aweme2.getVcVoiceIDs() != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("[");
                        LIZ2.append(IN5.LIZLLL(aweme2.getVcVoiceIDs()));
                        LIZ2.append("]");
                        c50913JyX.LIZLLL("voice_filter_ids", X1D.LIZIZ(LIZ2));
                    }
                    if ("places_discover".equals(str13) || "poi_detail".equals(str13)) {
                        param.isFullScreen();
                        c50913JyX.LLJLILLLLZIIL = param.getTabCode();
                        c50913JyX.LLJLL = param.getIsDisplayDistance();
                        c50913JyX.LJJLIIIJLLLLLLLZ = param.getPreviousPage();
                        c50913JyX.LLJLLIL = param.getPoiFullScreen();
                        c50913JyX.LLJLLL = param.getPoiCollectInfo();
                        c50913JyX.LLJZ = param.getPageCollectInfo();
                        LQA lqa = LQA.LIZIZ;
                        if (lqa != null) {
                            c50913JyX.LIZ(lqa.LJIILLIIL(str13));
                        }
                    }
                    C57258Mda.LIZJ(c50913JyX, param.getInboxLogExtra());
                    if (C86670Xzu.LJJIIJ(aweme2)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean LJJI = CaptionKevaServiceImpl.LJJJJI().LJJI();
                    int i5 = 2;
                    if (!z3) {
                        c50913JyX.LLJJIII = 0;
                    } else if (LJJI) {
                        c50913JyX.LLJJIII = 1;
                    } else {
                        c50913JyX.LLJJIII = 2;
                    }
                    if (param.getNewsId() != null) {
                        c50913JyX.LLILZLL = param.getNewsId();
                    }
                    if (param.isFromEffectDiscover() && aweme2.getStickerEntranceInfo() != null) {
                        c50913JyX.LLIIIILZ = aweme2.getStickerEntranceInfo().id;
                        if (idr2.getViewPager() != null) {
                            c50913JyX.LLIIIJ = idr2.getViewPager().getCurrentItem();
                        }
                    }
                    c50913JyX.LIZ(C2KM.LIZIZ(param.getPreviousPage(), param.getFromGroupId()));
                    if (IN5.LIZ(c48662J7y.LJLJI, idr2.getTabName())) {
                        if (aweme2.isTop()) {
                            str12 = "1";
                        } else {
                            str12 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c50913JyX.LJIJ = str12;
                    }
                    if (TextUtils.isEmpty(aweme2.partN)) {
                        if (aweme2.getVideo() != null && aweme2.getVideo().isLongVideo()) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    }
                    c50913JyX.LJIJJLI = i5;
                    if (C54838Lfe.LJIIZILJ(aweme2)) {
                        C222578oP.LIZIZ(c50913JyX, aweme2, null, null, null);
                        C222578oP.LJ(C55723Ltv.LIZIZ.LJIL().LJII(aweme2.getAuthorUid()), c50913JyX, C78596Usy.LJJIIZ(param), param.getEnterPlayMethod());
                        C78596Usy.LJI(aweme2, c50913JyX);
                    } else if (param.getExtra().containsKey("enter_position")) {
                        c50913JyX.LIZLLL("enter_position", param.getExtra().get("enter_position"));
                    }
                    if (C19N.LJ("creator_m10n_analytics_last_video_toast_is_enabled", false) && str13.equals("creation_inspiration")) {
                        try {
                            str11 = JSONObjectProtectorUtils.getString(new JSONObject(param.getTracker()), "inspiration_tab");
                        } catch (Exception unused) {
                            str11 = null;
                        }
                        c50913JyX.LIZLLL("creation_inspiration_category", str11);
                    }
                    c50913JyX.LJIILL = idr2.getTabName();
                    c50913JyX.LJLIIIL = String.valueOf(idr2.getCurIndex());
                    c50913JyX.LJJLIIIJLLLLLLLZ = idr2.getPreviousPage();
                    c50913JyX.LJJLIIJ = param.getPreviousPagePosition();
                    c50913JyX.LJJLIL = z2;
                    c50913JyX.LJIILLIIL = C227768wm.LJIIL(c48662J7y.LJLJJI, aweme2);
                    c50913JyX.LLIILII = idr2.getParam().getTagLine();
                    M89 param2 = idr2.getParam();
                    if (param2 != null) {
                        c50913JyX.LJII = param2.getCreationId();
                    }
                    c50913JyX.LJJZZI = idr2.getContentSource();
                    if (!TextUtils.isEmpty(idr2.getLikeEnterMethod())) {
                        c50913JyX.LJJZ = idr2.getLikeEnterMethod();
                    }
                    c50913JyX.LJLJI = idr2.getPlayListType();
                    c50913JyX.LJLJJI = idr2.getPlayListIdKey();
                    c50913JyX.LJLJJL = idr2.getPlayListIdValue();
                    c50913JyX.LJLIIL = param.getChallengeId();
                    c50913JyX.LJLI = param.getProcessId();
                    c50913JyX.LJJIII = param.getListItemId();
                    c50913JyX.LJJII = param.getListResultType();
                    c50913JyX.LJJIIJ = param.getSearchThirdItemId();
                    c50913JyX.LJJLJLI = param.getSearchKeyword();
                    c50913JyX.LJJIIJZLJL = param.getmImprId();
                    String searchResultId = param.getSearchResultId();
                    if ((TextUtils.equals(str13, "general_search") || JIW.LIZLLL(c48662J7y.LJZI, c48662J7y.LJLJI, C2S6.LIZ(c48662J7y.LJJIIZ()).getPlaylistPreviousPage())) && TextUtils.isEmpty(searchResultId)) {
                        searchResultId = C227768wm.LIZIZ(aweme2);
                    }
                    c50913JyX.LIZJ(C79004UzY.LJJJIL(idr2.getContext(), aweme2), "is_landscape_screen");
                    if (TextUtils.equals(str13, "general_search") || TextUtils.equals(str13, "search_result")) {
                        Z9N z9n = Z9N.LIZIZ;
                        if (z9n.LLLLJI()) {
                            boolean LLJILLL = z9n.LLJILLL(context, aweme2);
                            if (LLJILLL) {
                                str9 = "1";
                            } else {
                                str9 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c50913JyX.LIZLLL("search_is_caption_translated", str9);
                            if (LLJILLL) {
                                str10 = "1";
                            } else {
                                str10 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c50913JyX.LIZLLL("search_is_title_translated", str10);
                        }
                    }
                    c50913JyX.LJJIFFI = searchResultId;
                    c50913JyX.LLIIII = param.getSearchType();
                    String searchId = param.getSearchId();
                    if (JIW.LIZLLL(c48662J7y.LJZI, c48662J7y.LJLJI, C2S6.LIZ(c48662J7y.LJJIIZ()).getPlaylistPreviousPage()) && TextUtils.isEmpty(searchId)) {
                        searchId = C227768wm.LJIILL(9, aweme2);
                    }
                    c50913JyX.LJJIL = searchId;
                    c50913JyX.LJLZ = param.getParentTagId();
                    c50913JyX.LIZ(K02.LIZIZ("video_play", aweme2, str13));
                    if (str13 != "from_music") {
                        c50913JyX.LLJJLIIIJLLLLLLLZ = Integer.valueOf(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(context, aweme2));
                    }
                    IFeedPanelPlatformAbility feedPanelPlatformAbility = idr2.getFeedPanelPlatformAbility();
                    if (feedPanelPlatformAbility != null && (vScope = feedPanelPlatformAbility.getVScope()) != null && (iPipAbility = (IPipAbility) C55096Ljo.LIZ(vScope, IPipAbility.class, null)) != null) {
                        iPipAbility.ea0(aweme2, c50913JyX);
                    }
                    if (aweme2.getVideo() != null) {
                        if (C227768wm.LJJ(aweme2)) {
                            c50913JyX.LIZLLL("landscape_portrait", "fake_landscape");
                        } else if (C227768wm.LJJIII(aweme2)) {
                            c50913JyX.LIZLLL("landscape_portrait", "landscape");
                        } else {
                            c50913JyX.LIZLLL("landscape_portrait", "portrait");
                        }
                    }
                    if (jSONObject != null) {
                        ((HashMap) c50913JyX.LJIIL).putAll(C190837eJ.LIZIZ(jSONObject));
                    }
                    if (C51556KLg.LIZ != null) {
                        C51556KLg.LIZ();
                        c50913JyX.LIZ(C51556KLg.LIZ().LJIIJJI(aweme2, param.getPagePoiId()));
                    }
                    V0N.LJIIIZ(c50913JyX, aweme2);
                    if (aweme2.getTextExtra() != null) {
                        Iterator<TextExtraStruct> it = aweme2.getTextExtra().iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            if (it.next().getType() == 5) {
                                i2++;
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    c50913JyX.LIZJ(i2, "credit_item_count");
                    if (c48662J7y.LJZL) {
                        c48662J7y.LJZL = false;
                        c50913JyX.LIZLLL("enter_method", "click_quote_icon");
                    }
                    C78841Uwv.LIZJ(c50913JyX, C227768wm.LIZIZ(aweme2));
                    JIW.LIZ(c48662J7y.LJLJI, param, aweme2, c50913JyX);
                    if (TextUtils.equals(c48662J7y.LJLJI, "general_search") || (TextUtils.equals(param.getPlaylistPreviousPage(), "general_search") && TextUtils.equals(c48662J7y.LJLJI, "playlist"))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    JIW.LIZIZ(c48662J7y.LJJIIZ(), aweme2, c50913JyX, z4);
                    c50913JyX.LIZJ(aweme2.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
                    if (c48662J7y.LJLJI.equalsIgnoreCase("editing_effect_page")) {
                        c50913JyX.LJJJJLI = param.getStickerId();
                    } else if (c48662J7y.LJLJI.equalsIgnoreCase("editing_prop_page")) {
                        c50913JyX.LJJJJLL = param.getStickerId();
                    }
                    try {
                        if (C224868s6.LIZJ(aweme2) || C224868s6.LIZLLL(aweme2)) {
                            if (context != null && C224868s6.LIZIZ(context)) {
                                str16 = "1";
                            }
                            c50913JyX.LIZLLL("is_install_lv", str16);
                            if (aweme2.getCcTemplateInfo() != null) {
                                c50913JyX.LIZLLL("template_id", aweme2.getCcTemplateInfo().getTemplate_id());
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    c50913JyX.LJIILIIL();
                    AbstractC39351FcR LIZ3 = C38986FRu.LIZ();
                    if (LIZ3.LJ) {
                        AbstractC39351FcR.LJIIJ.storeBoolean("first_video", false);
                        LIZ3.LJ = false;
                    }
                    C2U8.LIZ(new J8H(aweme2.getAid(), c48662J7y.LJLJI, C79004UzY.LJJIJIIJI(context)));
                    if (!TextUtils.isEmpty(str14)) {
                        C50913JyX c50913JyX2 = new C50913JyX(0);
                        c50913JyX2.LIZLLL = str13;
                        c50913JyX2.LJZI = c48662J7y.LJLJJL;
                        c50913JyX2.LL = c48662J7y.LLJLL;
                        c50913JyX2.LJLJJLL = str14;
                        c50913JyX2.LLIILZL = str7;
                        C78996UzQ.LJJIIZ(aweme2);
                        if (!TextUtils.isEmpty(idr2.getLikeEnterMethod())) {
                            c50913JyX.LJJZ = idr2.getLikeEnterMethod();
                        }
                        c50913JyX2.LJIILIIL();
                    }
                    String previousPage = idr2.getPreviousPage();
                    String previousPagePosition = param.getPreviousPagePosition();
                    if (str13.equals("playlist")) {
                        previousPage = param.getPlaylistPreviousPage();
                    }
                    if (TextUtils.equals(previousPage, "search_result") || TextUtils.equals(previousPage, "general_search") || TextUtils.equals(previousPage, "search_for_you_list")) {
                        long indexByAweme = idr2.getIndexByAweme(aweme2) + param.getPlaylistOffset();
                        ISearchResultStatistics LIZLLL = SearchResultStatisticsImpl.LIZLLL();
                        if (TextUtils.equals(previousPage, "search_result") || TextUtils.equals(previousPage, "search_for_you_list")) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        LIZLLL.LIZIZ(new C49598JdK("search_video_play", aweme2, str13, -1L, z5, previousPage, previousPagePosition, indexByAweme));
                    }
                    return null;
                }
            }, FMX.LIZIZ(), null);
        }
    }
}
