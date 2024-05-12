package com.google.gson.internal;

import X.AbstractC59064NGa;
import X.BML;
import X.BPP;
import X.C00F;
import X.C03660Ck;
import X.C113554cx;
import X.C141335gf;
import X.C141415gn;
import X.C15380j0;
import X.C16880lQ;
import X.C1DD;
import X.C1DG;
import X.C242549fW;
import X.C30868C9o;
import X.C36746EbW;
import X.C36922EeM;
import X.C38354F3m;
import X.C3C5;
import X.C46882Iac;
import X.C47055IdP;
import X.C48189Ivh;
import X.C48621vW;
import X.C48658J7u;
import X.C56092Lzs;
import X.C58825N6v;
import X.C58977NCr;
import X.C60903NvH;
import X.C75516TkO;
import X.C76003TsF;
import X.C76800UCe;
import X.C78685UuP;
import X.C78966Uyw;
import X.C84339X8d;
import X.C84340X8e;
import X.CN1;
import X.E2C;
import X.EnumC51775KTr;
import X.EnumC56121M0v;
import X.FKM;
import X.H78;
import X.InterfaceC07790Sh;
import X.InterfaceC37286EkE;
import X.InterfaceC38202Ez0;
import X.InterfaceC38203Ez1;
import X.InterfaceC48038ItG;
import X.InterfaceC65784Pro;
import X.InterfaceC70568Rmm;
import X.InterfaceC75706TnS;
import X.InterfaceC88472Yns;
import X.J4C;
import X.J4I;
import X.K14;
import X.K16;
import X.K17;
import X.K18;
import X.K19;
import X.K1A;
import X.K1B;
import X.K1C;
import X.K1D;
import X.K1Q;
import X.K1S;
import X.NMA;
import X.OFV;
import X.ORZ;
import X.OSZ;
import X.P8H;
import X.QPE;
import X.QXX;
import X.X1D;
import X.X8W;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import androidx.compose.ui.platform.g1;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.game.EnableMobileGameBroadcastFeedbackInfoAndDiagnose;
import com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.listener.IRouteIntentInterceptor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMainLynxDataPreload;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.BitrateAudioStruct;
import com.ss.android.ugc.aweme.feed.model.BitrateMetaStruct;
import com.ss.android.ugc.aweme.feed.model.BitrateUrlStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimPlayTokenAuth;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class b implements n, InterfaceC75706TnS, InterfaceC70568Rmm, IRouteIntentInterceptor, InterfaceC48038ItG {
    public static final b LJLIL = new b();

    public static int LJIJJLI(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 4;
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? 0 : 2;
                }
                return 3;
            }
        }
        return i2;
    }

    @Override // X.InterfaceC70568Rmm
    public void LIZJ(int i, Collection collection) {
    }

    public static final void LJIIIIZZ() {
        if (EnableMobileGameBroadcastFeedbackInfoAndDiagnose.INSTANCE.isEnable()) {
            ((IGameService) CN1.LIZ(IGameService.class)).h90();
        }
        ((IGameService) CN1.LIZ(IGameService.class)).K10();
    }

    @Override // com.google.gson.internal.n
    public Object LJI() {
        return new TreeMap();
    }

    public static void LJ(C46882Iac c46882Iac) {
        Bundle LIZLLL = C1DG.LIZLLL("action", 19, "effect_type", 8);
        LIZLLL.putInt("int_value", 0);
        c46882Iac.LJLJLJ(LIZLLL);
    }

    public static String LJIIIZ(long j) {
        String LIZIZ;
        if (j < 10) {
            LIZIZ = BML.LIZ("%d", 10L);
        } else if (j < 100) {
            LIZIZ = BML.LIZ("%d", Long.valueOf((j / 10) * 10));
        } else if (j < 1000) {
            LIZIZ = BML.LIZ("%d", Long.valueOf((j / 100) * 100));
        } else if (j < 1000000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZIZ = C03660Ck.LIZIZ("%d", new Object[]{Long.valueOf(j / 1000)}, LIZ, "K+", LIZ);
        } else if (j < 1000000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZIZ = C03660Ck.LIZIZ("%d", new Object[]{Long.valueOf(j / 1000000)}, LIZ2, "M+", LIZ2);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZIZ = C03660Ck.LIZIZ("%d", new Object[]{Long.valueOf(j / 1000000000)}, LIZ3, "B+", LIZ3);
        }
        if (j < 1000) {
            if (C15380j0.LJIIZILJ()) {
                return i0.LJFF("+", LIZIZ);
            }
            return i0.LJFF(LIZIZ, "+");
        }
        return LIZIZ;
    }

    public static String LJIIJJI(long j) {
        if (j < 1000000) {
            return String.valueOf(j);
        }
        if (j < 1000000000) {
            StringBuilder LIZ = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000000.0d)}, LIZ, "M", LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1.0E9d)}, LIZ2, "B", LIZ2);
    }

    public static String LJIIL(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder LIZ = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ, "K", LIZ);
        }
        if (j < 1000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            return C03660Ck.LIZIZ("%.0f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ2, "K", LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000000.0d)}, LIZ3, "M", LIZ3);
    }

    public static String LJIILIIL(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder LIZ = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{Float.valueOf(((float) ((j * 10) / 1000)) * 0.1f)}, LIZ, "K", LIZ);
        }
        if (j < 1000000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{Float.valueOf(((float) ((j * 10) / 1000000)) * 0.1f)}, LIZ2, "M", LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C03660Ck.LIZIZ("%.1f", new Object[]{Float.valueOf(((float) ((j * 10) / 1000000000)) * 0.1f)}, LIZ3, "B", LIZ3);
    }

    public static String LJIILJJIL(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder LIZ = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ, "K", LIZ);
        }
        if (j < 1000000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000000.0d)}, LIZ2, "M", LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1.0E9d)}, LIZ3, "B", LIZ3);
    }

    public static String LJIILLIIL(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder LIZ = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ, "K", LIZ);
        }
        if (j < 1000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            return C03660Ck.LIZIZ("%.0f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ2, "K", LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000000.0d)}, LIZ3, "M", LIZ3);
    }

    public static final QXX LJIIZILJ(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        if (kotlin.jvm.internal.o.LJ(str, "receive") || kotlin.jvm.internal.o.LJ(str, NMA.LJIILIIL.LJI.getSecond())) {
            return K1B.LJLIL;
        }
        if (kotlin.jvm.internal.o.LJ(str, "show")) {
            return K1D.LJLIL;
        }
        if (kotlin.jvm.internal.o.LJ(str, "break")) {
            return K17.LJLIL;
        }
        if (kotlin.jvm.internal.o.LJ(str, "play") || kotlin.jvm.internal.o.LJ(str, "replay") || kotlin.jvm.internal.o.LJ(str, "auto_play")) {
            return K1C.LJLIL;
        }
        if (kotlin.jvm.internal.o.LJ(str, "over")) {
            return K18.LJLIL;
        }
        if (kotlin.jvm.internal.o.LJ(str, "click") || kotlin.jvm.internal.o.LJ(str, "realtime_click")) {
            return K1A.LJLIL;
        }
        if (kotlin.jvm.internal.o.LJ(str, "otherclick")) {
            return K1A.LJLIL;
        }
        if (kotlin.jvm.internal.o.LJ(str, "resume")) {
            return K19.LJLIL;
        }
        return K16.LJLIL;
    }

    public static String LJIJ(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder LIZ = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ, "K", LIZ);
        }
        if (j < 1000000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000000.0d)}, LIZ2, "M", LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1.0E9d)}, LIZ3, "B", LIZ3);
    }

    public static final User LJIJI(MusNotice musNotice) {
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        Aweme aweme;
        Comment comment;
        List<User> users;
        kotlin.jvm.internal.o.LJIIIZ(musNotice, "<this>");
        int LJJIIZ = C78966Uyw.LJJIIZ(musNotice);
        if (LJJIIZ != -10000) {
            if (LJJIIZ != 21) {
                if (LJJIIZ != 23) {
                    if (LJJIIZ != 31) {
                        if (LJJIIZ != 33) {
                            if (LJJIIZ != 41) {
                                if (LJJIIZ != 45) {
                                    if (LJJIIZ != 1003) {
                                        return null;
                                    }
                                } else {
                                    AtMe atMe = musNotice.atMe;
                                    if (atMe == null) {
                                        return null;
                                    }
                                    return atMe.getUser();
                                }
                            } else {
                                DiggNotice diggNotice = musNotice.diggNotice;
                                if (diggNotice == null || (users = diggNotice.getUsers()) == null) {
                                    return null;
                                }
                                return (User) ORZ.LJLLLL(users);
                            }
                        }
                    }
                    CommentNotice commentNotice = musNotice.commentNotice;
                    if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
                        return null;
                    }
                    return comment.getUser();
                }
                FollowNotice followNotice = musNotice.followNotice;
                if (followNotice == null) {
                    return null;
                }
                return followNotice.getUser();
            }
            DuetNotice duetNotice = musNotice.duetNotice;
            if (duetNotice == null || (aweme = duetNotice.getAweme()) == null) {
                return null;
            }
            return aweme.getAuthor();
        }
        GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
        if (generalTemplateNotice == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null) {
            return null;
        }
        return (User) ORZ.LJLLLL(list);
    }

    public static final boolean LJJ(GeneralTemplateNotice generalTemplateNotice) {
        TitleTemplate titleTemplate;
        List<User> list;
        if (generalTemplateNotice == null) {
            return false;
        }
        Integer num = generalTemplateNotice.type;
        if (num == null || num.intValue() != 251) {
            Integer num2 = generalTemplateNotice.type;
            if (num2 == null || num2.intValue() != 252) {
                return false;
            }
            NoticeUITemplate noticeUITemplate = generalTemplateNotice.uiTemplate;
            if (noticeUITemplate != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static final void LJJIFFI(Intent intent) {
        if (C00F.LIZ(31744, 0, "mall_main_preload_type", true) == 1) {
            C36746EbW.LIZ(3, "ShopTabV3 Preload preloadMallData");
            Bundle bundle = new Bundle();
            String str = null;
            if (intent != null) {
                str = C16880lQ.LLJJIJIIJIL(intent, "diversion_params");
            }
            if (C78685UuP.LJJJZ(str)) {
                bundle.putString("diversion_params", str);
            }
            ShopMainLynxDataPreload.Companion.getClass();
            C36746EbW.LIZ(3, "ShopTabV3 Preload TRY_PRELOAD");
            ShopMainLynxDataPreload.isPrefetch = false;
            long currentTimeMillis = System.currentTimeMillis();
            C56092Lzs c56092Lzs = C56092Lzs.LIZ;
            C56092Lzs.LJIIZILJ(c56092Lzs, 1, K1Q.TRY_PRELOAD.getStage(), 0L, 12);
            C84339X8d.LIZJ.getClass();
            X8W LIZ = C84340X8e.LIZ();
            if (LIZ != null) {
                C36746EbW.LIZ(3, "ShopTabV3ForQA Preload Start Preload v3");
                Map LJJL = C113554cx.LJJL(new OSZ("mall_request_type", Integer.valueOf(EnumC51775KTr.PRELOAD.getType())), new OSZ("mall_request_scene", "ttmall_homepage"));
                if (!C48189Ivh.LJFF(FKM.LIZ())) {
                    C36746EbW.LIZ(3, "ShopTabV3 Preload PRELOAD_FAIL");
                    C56092Lzs.LJIILLIIL(1, K1Q.PRELOAD_FAIL.getStage(), System.currentTimeMillis() - currentTimeMillis, E2C.LIZJ("error_msg", EnumC56121M0v.NETWORK_UNAVAILABLE.getErrMsg()));
                    C56092Lzs.LJIILL(LJJL, false);
                } else {
                    C56092Lzs.LJIIZILJ(c56092Lzs, 1, K1Q.PRELOAD.getStage(), System.currentTimeMillis() - currentTimeMillis, 8);
                    C56092Lzs.LJIILL(LJJL, true);
                    LIZ.LIZIZ(bundle, ShopMainLynxDataPreload.class, new K1S(currentTimeMillis));
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            C36746EbW.LIZ(3, "ShopTabV3 Preload PRELOAD_FAIL");
            C56092Lzs.LJIILLIIL(1, K1Q.PRELOAD_FAIL.getStage(), System.currentTimeMillis() - currentTimeMillis, E2C.LIZJ("error_msg", EnumC56121M0v.UNINITIALIZED.getErrMsg()));
        }
    }

    public static SimAudioBitrate LJJIJIL(BitrateAudioStruct bitrateAudioStruct) {
        C47055IdP c47055IdP = null;
        C58825N6v c58825N6v = null;
        if (bitrateAudioStruct == null) {
            return null;
        }
        SimAudioBitrate simAudioBitrate = new SimAudioBitrate();
        BitrateMetaStruct audioMeta = bitrateAudioStruct.getAudioMeta();
        if (audioMeta != null) {
            C47055IdP c47055IdP2 = new C47055IdP();
            BitrateUrlStruct urlList = audioMeta.getUrlList();
            if (urlList != null) {
                c58825N6v = new C58825N6v(1);
                c58825N6v.LIZ = urlList.getMainUrl();
                c58825N6v.LIZIZ = urlList.getBackupUrl();
                c58825N6v.LIZJ = urlList.getFallbackUrl();
            }
            c47055IdP2.LIZ = c58825N6v;
            c47055IdP2.LIZIZ = audioMeta.getEncodedType();
            c47055IdP2.LIZJ = audioMeta.getMediaType();
            c47055IdP2.LIZLLL = audioMeta.getLogoType();
            c47055IdP2.LJ = audioMeta.getDefinition();
            c47055IdP2.LJFF = audioMeta.getQuality();
            c47055IdP2.LJI = audioMeta.getQualityDesc();
            c47055IdP2.LJII = audioMeta.getFormat();
            c47055IdP2.LJIIIIZZ = audioMeta.getWidth();
            c47055IdP2.LJIIIZ = audioMeta.getHeight();
            c47055IdP2.LJIIJ = audioMeta.getBitrate();
            c47055IdP2.LJIIJJI = audioMeta.getCodecType();
            c47055IdP2.LJIIL = audioMeta.getSize();
            c47055IdP2.LJIILIIL = audioMeta.getFps();
            c47055IdP2.LJIILJJIL = audioMeta.getFileId();
            c47055IdP2.LJIILL = audioMeta.getFileHash();
            c47055IdP2.LJIILLIIL = audioMeta.getSubInfo();
            c47055IdP = c47055IdP2;
        }
        simAudioBitrate.setAudioMeta(c47055IdP);
        simAudioBitrate.setAudioExtra(bitrateAudioStruct.getAudioExtra());
        simAudioBitrate.setQualityType((int) bitrateAudioStruct.getAudioQuality());
        return simAudioBitrate;
    }

    public static SimBitRate LJJIJL(BitRate bitRate) {
        String uri;
        SimUrlModel simUrlModel = null;
        if (bitRate == null) {
            return null;
        }
        SimBitRate simBitRate = new SimBitRate();
        simBitRate.origin = bitRate;
        simBitRate.setBytevc1(bitRate.isBytevc1());
        UrlModel playAddr = bitRate.getPlayAddr();
        if (playAddr != null) {
            simUrlModel = new SimUrlModel();
            simUrlModel.origin = playAddr;
            simUrlModel.setFileHash(playAddr.getFileHash());
            simUrlModel.setHeight(playAddr.getHeight());
            simUrlModel.setWidth(playAddr.getWidth());
            simUrlModel.setSize(playAddr.getSize());
            if (playAddr instanceof VideoUrlModel) {
                uri = ((VideoUrlModel) playAddr).getOriginUri();
            } else {
                uri = playAddr.getUri();
            }
            simUrlModel.setUri(uri);
            simUrlModel.setUrlKey(playAddr.getUrlKey());
            simUrlModel.setUrlList(playAddr.getUrlList());
        }
        simBitRate.setPlayAddr(simUrlModel);
        simBitRate.setBitRate(bitRate.getBitRate());
        simBitRate.setGearName(bitRate.getGearName());
        simBitRate.setQualityType(bitRate.getQualityType());
        simBitRate.setHdrBit(bitRate.getHdrBit());
        simBitRate.setHdrType(bitRate.getHdrType());
        simBitRate.setFormat(bitRate.getFormat());
        return simBitRate;
    }

    public static SimVideo LJJIJLIJ(Video video) {
        SimPlayTokenAuth simPlayTokenAuth = null;
        if (video == null) {
            return null;
        }
        SimVideo simVideo = new SimVideo();
        simVideo.origin = video;
        simVideo.cdnUrlExpired = video.cdnUrlExpired;
        ArrayList arrayList = new ArrayList();
        if (video.getRawBitRate() != null) {
            Iterator it = new ArrayList(video.getRawBitRate()).iterator();
            while (it.hasNext()) {
                arrayList.add(LJJIJL((BitRate) it.next()));
            }
        }
        simVideo.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BitrateAudioStruct> list = video.bitRateAudio;
        if (list != null) {
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                arrayList2.add(LJJIJIL((BitrateAudioStruct) it2.next()));
            }
        }
        simVideo.setAudioBitRate(arrayList2);
        PlayTokenAuth drmTokenAuth = video.getDrmTokenAuth();
        if (drmTokenAuth != null) {
            simPlayTokenAuth = new SimPlayTokenAuth();
            simPlayTokenAuth.origin = drmTokenAuth;
            simPlayTokenAuth.setAuth(drmTokenAuth.getAuth());
            simPlayTokenAuth.setVersion(drmTokenAuth.getVersionN());
            simPlayTokenAuth.setHostIndex(drmTokenAuth.getHostIndex());
            simPlayTokenAuth.setHosts(drmTokenAuth.getHosts());
            simPlayTokenAuth.setVid(drmTokenAuth.getVid());
            simPlayTokenAuth.setToken(drmTokenAuth.getToken());
        }
        simVideo.setDrmTokenAuth(simPlayTokenAuth);
        simVideo.setDuration(video.getDuration());
        simVideo.setHeight(video.getHeight());
        simVideo.setNeedSetCookie(video.isNeedSetCookie());
        SimVideoUrlModel LJJIL = LJJIL(video.getPlayAddr());
        simVideo.setPlayAddr(LJJIL);
        if (LJJIL != null && LJJIL.getSourceId() != null) {
            simVideo.setSourceId(LJJIL.getSourceId());
        }
        SimVideoUrlModel LJJIL2 = LJJIL(video.getPlayAddrBytevc1());
        if (LJJIL2 != null && LJJIL2.getSourceId() != null) {
            simVideo.setSourceId(LJJIL2.getSourceId());
        }
        simVideo.setPlayAddrBytevc1(LJJIL2);
        SimVideoUrlModel LJJIL3 = LJJIL(video.getH264PlayAddr());
        if (LJJIL3 != null && LJJIL3.getSourceId() != null) {
            simVideo.setSourceId(LJJIL3.getSourceId());
        }
        simVideo.setRatio(video.getRatio());
        simVideo.setEnableIntertrustDrm(video.enableIntertrustDrm());
        simVideo.setMeta(video.getMeta());
        simVideo.setFormat(video.getFormat());
        simVideo.setVideoLength(video.getVideoLength());
        simVideo.setVideoModelStr(video.getVideoModelStr());
        simVideo.setWidth(video.getWidth());
        return simVideo;
    }

    public static SimVideoUrlModel LJJIL(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return null;
        }
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        simVideoUrlModel.origin = videoUrlModel;
        ArrayList arrayList = new ArrayList();
        if (videoUrlModel.getRawBitRate() != null) {
            Iterator it = new ArrayList(videoUrlModel.getRawBitRate()).iterator();
            while (it.hasNext()) {
                arrayList.add(LJJIJL((BitRate) it.next()));
            }
        }
        simVideoUrlModel.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BitrateAudioStruct> audioBitrate = videoUrlModel.getAudioBitrate();
        if (audioBitrate != null) {
            Iterator it2 = new ArrayList(audioBitrate).iterator();
            while (it2.hasNext()) {
                arrayList2.add(LJJIJIL((BitrateAudioStruct) it2.next()));
            }
        }
        simVideoUrlModel.setAudioBitRate(arrayList2);
        simVideoUrlModel.setMeta(videoUrlModel.getMeta());
        simVideoUrlModel.setFormat(videoUrlModel.getFormat());
        simVideoUrlModel.setAspectRatio(videoUrlModel.getAspectRatio());
        simVideoUrlModel.setCdnUrlExpired(videoUrlModel.getCdnUrlExpired());
        simVideoUrlModel.setDashVideoId(videoUrlModel.getDashVideoId());
        simVideoUrlModel.setDashVideoModelStr(videoUrlModel.getDashVideoModelStr());
        simVideoUrlModel.setDashVideoId(videoUrlModel.getDashVideoId());
        simVideoUrlModel.setFileCheckSum(videoUrlModel.getFileCheckSum());
        simVideoUrlModel.setBytevc1(videoUrlModel.isBytevc1());
        simVideoUrlModel.setHitBitrate(videoUrlModel.getHitBitrate());
        simVideoUrlModel.setHitDashVideoBitrate(LJJIJL(videoUrlModel.getHitDashVideoBitrate()));
        simVideoUrlModel.setHitDashAudioBitrate(LJJIJIL(videoUrlModel.getHitDashAudioBitrate()));
        simVideoUrlModel.setRatio(videoUrlModel.getRatio());
        simVideoUrlModel.setVr(videoUrlModel.isVr());
        simVideoUrlModel.setSourceId(videoUrlModel.getSourceId());
        simVideoUrlModel.setDuration(videoUrlModel.getDuration());
        simVideoUrlModel.setFileHash(videoUrlModel.getFileHash());
        simVideoUrlModel.setHeight(videoUrlModel.getHeight());
        simVideoUrlModel.setWidth(videoUrlModel.getWidth());
        simVideoUrlModel.setSize(videoUrlModel.getSize());
        simVideoUrlModel.setUri(videoUrlModel.getOriginUri());
        simVideoUrlModel.setUrlKey(videoUrlModel.getUrlKey());
        simVideoUrlModel.setUrlList(videoUrlModel.getUrlList());
        return simVideoUrlModel;
    }

    @Override // X.InterfaceC75706TnS
    public void LJFF(OFV ofv) {
        C30868C9o.LIZJ(R.string.kme);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(it, "it");
        C36922EeM.LIZLLL(3, "clear-cache", "start clear resource cache with disk manager");
        List<InterfaceC37286EkE> LJIIJ = P8H.LJIIJ();
        if (LJIIJ != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) LJIIJ).iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                InterfaceC37286EkE interfaceC37286EkE = (InterfaceC37286EkE) next;
                if (interfaceC37286EkE != null) {
                    str = interfaceC37286EkE.LJ();
                } else {
                    str = null;
                }
                if (kotlin.jvm.internal.o.LJ("RESOURCE", str)) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC37286EkE) it3.next()).LIZJ();
            }
        }
        C36922EeM.LIZLLL(3, "clear-cache", "finish clear resource cache with disk manager");
        return "";
    }

    @Override // com.bytedance.router.listener.IRouteIntentInterceptor
    public boolean onIntercept(RouteIntent routeIntent) {
        Boolean LJI;
        kotlin.jvm.internal.o.LJIIIZ(routeIntent, "routeIntent");
        boolean z = false;
        try {
            IRaspService LJIIIIZZ = RaspServiceImpl.LJIIIIZZ();
            if (LJIIIIZZ != null && (LJI = LJIIIIZZ.LJI(routeIntent.getUrl(), "router")) != null) {
                z = LJI.booleanValue();
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return z;
    }

    public static final int LIZIZ(UploadVideoConfig config, String str) {
        int i;
        NetworkInfo LJJLI;
        kotlin.jvm.internal.o.LJIIIZ(config, "config");
        if (!config.enableClientNetworkJudgement) {
            i = -1;
        } else {
            Application application = C60903NvH.LJ;
            if (application != null && (LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(application, "connectivity"))) != null && LJJLI.isConnected()) {
                i = 1;
            } else {
                i = 0;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTUploader ");
        LIZ.append(str);
        LIZ.append(" checkNetState: ");
        LIZ.append(i);
        H78.LIZ(X1D.LIZIZ(LIZ));
        return i;
    }

    public static final Collection LJII(Iterable iterable, Iterable source) {
        kotlin.jvm.internal.o.LJIIIZ(iterable, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(source, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if ((source instanceof Collection) && ((Collection) source).size() < 2) {
                return (Collection) iterable;
            }
            Collection collection = (Collection) iterable;
            if (K14.LIZ && collection.size() > 2 && (collection instanceof ArrayList)) {
                return ORZ.LLIZLLLIL(iterable);
            }
            return collection;
        }
        if (K14.LIZ) {
            return ORZ.LLIZLLLIL(iterable);
        }
        return ORZ.LLJI(iterable);
    }

    public static final BrickInfo LJIIJ(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BrickInfo brickInfo = (BrickInfo) it.next();
            if (brickInfo.brickName == i) {
                return brickInfo;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static Object LJIILL(String str, Map map) {
        Object obj = map.get(str);
        if (obj == null) {
            J4I j4i = J4C.LIZ;
            if (j4i != null) {
                return j4i.getFeature(str);
            }
            return null;
        }
        return obj;
    }

    public static void LJJIJ(C46882Iac c46882Iac, Bundle bundle) {
        Bundle LIZLLL = C1DG.LIZLLL("action", 21, "effect_type", 8);
        LIZLLL.putInt("pano_mode", 1);
        LIZLLL.putInt("use_effect", 1);
        LIZLLL.putInt("direct_mode", 3);
        LIZLLL.putInt("handle_device_orientation_enabled", 1);
        LIZLLL.putFloat("perspective_view", 100.0f);
        LIZLLL.putAll(bundle);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VRUtil: setEffect: ");
        LIZ.append(c46882Iac);
        SimRadar.keyScan("TTPlayer", "EngineDataSourceHelper", X1D.LIZIZ(LIZ));
        c46882Iac.LJLJLJ(LIZLLL);
    }

    public static final void LJJIJIIJI(String str, Map map) {
        Object obj;
        kotlin.jvm.internal.o.LJIIIZ(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str2 != null && !ujb.o.LJJJJJL(str2)) {
                Object value = entry.getValue();
                if (value == null || (obj = JSONObject.wrap(value)) == null) {
                    obj = "";
                }
                jSONObject.put(str2, obj);
            }
        }
        C48658J7u.LIZIZ(str, jSONObject);
    }

    public static final void LJJIJIIJIL(String str, OSZ... oszArr) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        for (OSZ osz : oszArr) {
            String str2 = (String) osz.getFirst();
            if (str2 != null && !ujb.o.LJJJJJL(str2)) {
                Object second = osz.getSecond();
                if (second == null || (obj = JSONObject.wrap(second)) == null) {
                    obj = "";
                }
                jSONObject.put(str2, obj);
            }
        }
        C48658J7u.LIZIZ(str, jSONObject);
    }

    @Override // X.InterfaceC75706TnS
    public void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        BPP.LJ(C15380j0.LIZLLL(), th);
        if (th != null) {
            C75516TkO.LIZ.LIZIZ(802, "cancel multi_cohost link invitation failed", th, null);
        }
    }

    public static final void LIZ(InterfaceC38202Ez0 interfaceC38202Ez0, Object params, InterfaceC38203Ez1 callback) {
        kotlin.jvm.internal.o.LJIIJ(params, "params");
        kotlin.jvm.internal.o.LJIIJ(callback, "callback");
        interfaceC38202Ez0.gc();
        interfaceC38202Ez0.g5();
    }

    public static final void LJIL(Object obj, InterfaceC65784Pro nullBlock, InterfaceC88472Yns interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(nullBlock, "nullBlock");
        if (obj == null) {
            nullBlock.invoke();
        } else {
            interfaceC88472Yns.invoke(obj);
        }
    }

    public static void LJJI(Context context, String str, Bundle bundle) {
        try {
            if (!C38354F3m.LJ(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("_event_v3", 1);
                    for (String str2 : bundle.keySet()) {
                        jSONObject.put(str2, C16880lQ.LLJJIII(bundle, str2));
                    }
                } catch (Throwable unused) {
                }
                QPE.LIZ(context, "event_v3", str, null, 0L, 0L, jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    public static final InterfaceC07790Sh LJJII(InterfaceC07790Sh interfaceC07790Sh, boolean z, InterfaceC88472Yns properties) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC07790Sh, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(properties, "properties");
        return interfaceC07790Sh.LLLIIIL(new C48621vW(z, properties, g1.LIZ));
    }

    public static final void LJJIII(C58977NCr c58977NCr, String str, JSONObject eventParams) {
        kotlin.jvm.internal.o.LJIIIZ(c58977NCr, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(eventParams, "eventParams");
        eventParams.putOpt("componentType", c58977NCr.LJLIL.getType());
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", str);
        jSONObject.putOpt("extra", eventParams);
        AbstractC59064NGa abstractC59064NGa = c58977NCr.LJLLLLLL;
        if (abstractC59064NGa != null) {
            abstractC59064NGa.LJIIIIZZ("anole_event", jSONObject);
        }
        C242549fW.LIZ(String.valueOf(jSONObject));
    }

    public static final void LJJIIJZLJL(com.google.gson.m mVar, String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        com.google.gson.g gVar = new com.google.gson.g();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gVar.LJJIIJ((String) it.next());
        }
        mVar.LJJII(str, gVar);
    }

    public static final void LJJIIZ(com.google.gson.m mVar, String str, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        com.google.gson.g gVar = new com.google.gson.g();
        for (int i : iArr) {
            gVar.LJJIII(Integer.valueOf(i));
        }
        mVar.LJJII(str, gVar);
    }

    public static final void LJJIIZI(String property, String str, com.google.gson.m mVar) {
        kotlin.jvm.internal.o.LJIIIZ(property, "property");
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        mVar.LJJIIZ(property, str);
    }

    public static Bundle LJIJJ(int i, int i2, int i3, int i4) {
        Bundle LIZ = C141415gn.LIZ("view_size", i2);
        int i5 = 1;
        if (i3 != 0 && i3 == 1) {
            i5 = i4 != 1 ? i4 != 2 ? 2 : 4 : 3;
        }
        LIZ.putInt("video_style", i5);
        LIZ.putInt("vr_model", LJIJJLI(i));
        if (LJIJJLI(i) == 3) {
            LIZ.putFloat("z_offset", -0.4f);
            LIZ.putInt("yaw", 90);
            LIZ.putInt("pitch", 0);
        }
        LIZ.putFloat("expand_coef", 1.01f);
        if (LJIJJLI(i) == 2) {
            LIZ.putFloat("max_scale", 4.0f);
            LIZ.putFloat("min_scale", 0.4f);
        } else {
            LIZ.putFloat("max_scale", 4.0f);
            LIZ.putFloat("min_scale", 0.2f);
        }
        return LIZ;
    }
}
