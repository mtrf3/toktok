package X;

import Y.IDfS292S0100000;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.live.effect.music.entity.AccompanimentsResponse;
import com.bytedance.android.live.effect.music.entity.Album;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectMusicFadeCurveModeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectMusicFadeSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IDqS0S0200100;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14270hD implements Handler.Callback {
    public static int LJLJI;
    public static int LJLJJI;
    public static IAudioFilterManager LJLJJL;
    public static long LJLJLLL;
    public static long LJLLILLLL;
    public static long LJZ;
    public static volatile C1VT LJZI;
    public static boolean LJZL;
    public static boolean LL;
    public static boolean LLD;
    public static final C14270hD LJLIL = new C14270hD();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C21N.LJLIL);
    public static final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C21M.LJLIL);
    public static final C5H3 LJLJL = C78996UzQ.LJJIJIIJI(C21K.LJLIL);
    public static String LJLJLJ = "normal_video_live";
    public static long LJLL = 1;
    public static boolean LJLLI = true;
    public static final List<Album> LJLLJ = new ArrayList();
    public static final ConcurrentHashMap<Long, Long> LJLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, List<Accompaniment>> LJLLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, List<Accompaniment>> LJLLLLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, List<C1VT>> LJLZ = new ConcurrentHashMap<>();
    public static final C62822Ol8 LLF = C221108m2.LIZIZ(C21L.LJLIL);

    static {
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.1TV
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<C76800UCe> interfaceC73573Su9) {
                boolean z;
                java.util.Map linkedHashMap;
                List<DownloadInfo> successedDownloadInfosWithMimeType = C79258V8s.LIZJ().getSuccessedDownloadInfosWithMimeType("live_music_accompaniment");
                o.LJIIIIZZ(successedDownloadInfosWithMimeType, "downloader.getSuccessedD…fosWithMimeType(mimeType)");
                ArrayList arrayList = new ArrayList();
                Iterator<DownloadInfo> it = successedDownloadInfosWithMimeType.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    DownloadInfo next = it.next();
                    if (true ^ C79258V8s.LIZJ().isDownloadSuccessAndFileNotExist(next)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    DownloadInfo downloadInfo = (DownloadInfo) it2.next();
                    try {
                        String extra = downloadInfo.getExtra();
                        o.LJIIIIZZ(extra, "it.extra");
                        int LJJLIIIJL = s.LJJLIIIJL(extra, "&", 0, false, 6);
                        if (LJJLIIIJL != -1) {
                            String extra2 = downloadInfo.getExtra();
                            o.LJIIIIZZ(extra2, "it.extra");
                            String substring = extra2.substring(0, LJJLIIIJL);
                            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            long parseLong = CastLongProtector.parseLong(substring);
                            Gson gson = C09650Zl.LIZJ;
                            String extra3 = downloadInfo.getExtra();
                            o.LJIIIIZZ(extra3, "it.extra");
                            String substring2 = extra3.substring(LJJLIIIJL + 1);
                            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                            Accompaniment accompaniment = (Accompaniment) gson.LJI(substring2, Accompaniment.class);
                            ConcurrentHashMap<Long, List<C1VT>> concurrentHashMap = C14270hD.LJLZ;
                            Long valueOf = Long.valueOf(parseLong);
                            o.LJIIIIZZ(accompaniment, "accompaniment");
                            C1JI.LIZLLL(concurrentHashMap, valueOf, new C1VT(downloadInfo, accompaniment));
                        }
                    } catch (Exception unused) {
                    }
                }
                ConcurrentHashMap LJI = C14270hD.LJI();
                LJI.clear();
                String LIZJ = InterfaceC30442Bx8.R.LIZJ();
                String it3 = LIZJ;
                o.LJIIIIZZ(it3, "it");
                if (it3.length() <= 0) {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    LIZJ = null;
                }
                String str = LIZJ;
                if (str == null || (linkedHashMap = (java.util.Map) GsonProtectorUtils.fromJson(C09650Zl.LIZJ, str, new TypeToken<java.util.Map<Long, Long>>() { // from class: X.1TU
                }.getType())) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                LJI.putAll(linkedHashMap);
            }
        }).LJJL(T16.LIZ()).LIZ(new C29355Bfb());
    }

    public static IAudioFilterManager LIZJ() {
        IAudioFilterManager audioFilterMgr;
        IAudioFilterManager iAudioFilterManager = LJLJJL;
        if (iAudioFilterManager == null) {
            InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
            if (interfaceC21020s6 != null && (audioFilterMgr = interfaceC21020s6.getAudioFilterMgr()) != null) {
                audioFilterMgr.setBGMProgressListener(new AudioEffectProcessor.CallbackV2() { // from class: X.1mJ
                    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                    public final void start() {
                        String str;
                        Long l;
                        String str2;
                        String str3;
                        String str4;
                        Accompaniment accompaniment;
                        Accompaniment accompaniment2;
                        Accompaniment accompaniment3;
                        Accompaniment accompaniment4;
                        DownloadInfo downloadInfo;
                        C14270hD.LJ().removeMessages(1);
                        C14270hD.LLD = true;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("BGM-start: ");
                        C1VT c1vt = C14270hD.LJZI;
                        String str5 = null;
                        if (c1vt != null && (downloadInfo = c1vt.getDownloadInfo()) != null) {
                            str = downloadInfo.getExtra();
                        } else {
                            str = null;
                        }
                        C1EW.LIZLLL(LIZ, str, LIZ, "AccompanimentManager");
                        C14270hD.LL = true;
                        String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
                        o.LJIIIIZZ(broadcastScene, "getService(IBroadcastSer…lass.java).broadcastScene");
                        C14370hN.LIZ = broadcastScene;
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_play");
                        LIZ2.LJIIZILJ();
                        C1VT c1vt2 = C14270hD.LJZI;
                        if (c1vt2 != null && (accompaniment4 = c1vt2.getAccompaniment()) != null) {
                            l = Long.valueOf(accompaniment4.id);
                        } else {
                            l = null;
                        }
                        LIZ2.LJIJJ(String.valueOf(l), "music_id");
                        C1VT c1vt3 = C14270hD.LJZI;
                        if (c1vt3 != null && (accompaniment3 = c1vt3.getAccompaniment()) != null) {
                            str2 = accompaniment3.title;
                        } else {
                            str2 = null;
                        }
                        LIZ2.LJIJJ(str2, "music_name");
                        C1VT c1vt4 = C14270hD.LJZI;
                        if (c1vt4 != null && (accompaniment2 = c1vt4.getAccompaniment()) != null) {
                            str3 = accompaniment2.author;
                        } else {
                            str3 = null;
                        }
                        LIZ2.LJIJJ(str3, "artist_name");
                        C1VT c1vt5 = C14270hD.LJZI;
                        if (c1vt5 != null && (accompaniment = c1vt5.getAccompaniment()) != null) {
                            str5 = accompaniment.url;
                        }
                        LIZ2.LJIJJ(str5, "music_url");
                        List<Album> list = C14270hD.LJLLJ;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((ArrayList) list).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (((Album) next).id == C14270hD.LJZ) {
                                arrayList.add(next);
                            }
                        }
                        Album album = (Album) ORZ.LJLLLLLL(0, arrayList);
                        if (album == null || (str4 = album.name) == null) {
                            str4 = "unknown";
                        }
                        LIZ2.LJIJJ(str4, "from_request_type");
                        LIZ2.LJIJJ(String.valueOf(C14270hD.LJZ), "collection_id");
                        LIZ2.LJIJJ("decorate", "enter_from");
                        LIZ2.LJIJJ(C14370hN.LIZ, "select_scene");
                        LIZ2.LJJIIJZLJL();
                        C15610jN.LIZIZ(new Runnable() { // from class: X.0h2
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean LIZ3;
                                try {
                                    Iterator it2 = C14270hD.LJFF().iterator();
                                    while (it2.hasNext()) {
                                        ((InterfaceC14400hQ) it2.next()).o8();
                                    }
                                } finally {
                                    if (LIZ3) {
                                    }
                                }
                            }
                        });
                        C31014CFe.LJIJI(true);
                    }

                    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                    public final void stop() {
                        String str;
                        DownloadInfo downloadInfo;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("BGM-stop: ");
                        C1VT c1vt = C14270hD.LJZI;
                        if (c1vt != null && (downloadInfo = c1vt.getDownloadInfo()) != null) {
                            str = downloadInfo.getExtra();
                        } else {
                            str = null;
                        }
                        LIZ.append(str);
                        C0NB.LJ("AccompanimentManager", X1D.LIZIZ(LIZ));
                        C14270hD.LJIIJJI("1");
                        C14270hD.LL = false;
                        C15610jN.LIZIZ(new Runnable() { // from class: X.0h3
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean LIZ2;
                                try {
                                    Iterator it = C14270hD.LJFF().iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC14400hQ) it.next()).Ij();
                                    }
                                } finally {
                                    if (LIZ2) {
                                    }
                                }
                            }
                        });
                        C14270hD.LJIIIZ(false);
                        C31014CFe.LJIJI(false);
                    }

                    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                    public final void onProgress(long j) {
                        C14270hD.LJLJI = (int) (j / 1000);
                    }

                    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.CallbackV2
                    public final void onError(int i, Exception exc) {
                        String str;
                        C14270hD.LJ().removeMessages(1);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("BGM-onError: ");
                        LIZ.append(i);
                        LIZ.append(", ");
                        if (exc != null) {
                            str = exc.getMessage();
                        } else {
                            str = null;
                        }
                        C1EW.LIZLLL(LIZ, str, LIZ, "AccompanimentManager");
                    }
                });
                audioFilterMgr.setLoopEnable(false);
                Float LIZJ = InterfaceC30442Bx8.O.LIZJ();
                o.LJIIIIZZ(LIZJ, "EFFECT_ACCOMPANIMENT_VOLUME.value");
                audioFilterMgr.setBGMVolume(LIZJ.floatValue());
                audioFilterMgr.setMixerEnable(true);
                audioFilterMgr.setEnableAudioFading(LiveEffectMusicFadeSwitchSetting.INSTANCE.getValue());
                LiveEffectMusicFadeCurveModeSetting liveEffectMusicFadeCurveModeSetting = LiveEffectMusicFadeCurveModeSetting.INSTANCE;
                int value = liveEffectMusicFadeCurveModeSetting.getValue();
                int value2 = liveEffectMusicFadeCurveModeSetting.getValue();
                LiveEffectMusicFadeDurationSetting liveEffectMusicFadeDurationSetting = LiveEffectMusicFadeDurationSetting.INSTANCE;
                audioFilterMgr.setAudioFadingParams(value, value2, liveEffectMusicFadeDurationSetting.getValue(), liveEffectMusicFadeDurationSetting.getValue());
                LJLJJL = audioFilterMgr;
                return audioFilterMgr;
            }
            return null;
        }
        return iAudioFilterManager;
    }

    public static int LIZLLL() {
        return (int) (InterfaceC30442Bx8.O.LIZJ().floatValue() * 200.0f);
    }

    public static Handler LJ() {
        return (Handler) LJLJL.getValue();
    }

    public static java.util.Set LJFF() {
        return (java.util.Set) LLF.getValue();
    }

    public static ConcurrentHashMap LJI() {
        long currentTimeMillis = System.currentTimeMillis();
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.Q;
        Long LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "EFFECT_ACCOMPANIMENT_OFFSET_VALIDITY_PERIOD.value");
        if (currentTimeMillis > LIZJ.longValue()) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, 7);
            c48459J0d.LIZ(Long.valueOf(calendar.getTimeInMillis()));
            LJLLL.clear();
        }
        return LJLLL;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.21J] */
    public static void LIZ(final long j) {
        int i;
        int i2;
        List<Accompaniment> list;
        List<C1VT> list2 = LJLZ.get(Long.valueOf(j));
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        List<Accompaniment> list3 = LJLLLLLL.get(Long.valueOf(j));
        if (list3 != null) {
            i2 = list3.size();
        } else {
            i2 = 0;
        }
        int i3 = 3 - (i + i2);
        if (i3 > 0 && (list = LJLLLL.get(Long.valueOf(j))) != null) {
            int size = list.size();
            if (size <= i3) {
                i3 = size;
            }
            while (true) {
                int i4 = i3 - 1;
                if (i3 > 0) {
                    final Accompaniment accompaniment = (Accompaniment) ListProtector.remove(list, 0);
                    final ?? r6 = new QXX() { // from class: X.21J
                        @Override // X.QXX
                        public final void LLLJIL(C1VT c1vt) {
                            if (C14270hD.LJZI == null) {
                                C14270hD.LJIIIIZZ(j, false);
                            }
                        }
                    };
                    EnumC31874Cf8 enumC31874Cf8 = EnumC31874Cf8.MUSIC_ACC;
                    o.LJIIIZ(accompaniment, "accompaniment");
                    String valueOf = String.valueOf(accompaniment.id);
                    String valueOf2 = String.valueOf(j);
                    String str = accompaniment.url;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(j);
                    LIZ.append('&');
                    LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZJ, accompaniment));
                    final C31824CeK c31824CeK = new C31824CeK(valueOf, enumC31874Cf8, valueOf2, "live_music_accompaniment", str, X1D.LIZIZ(LIZ), false, 0, false, 832);
                    c31824CeK.LJFF = true;
                    c31824CeK.LJ = "music";
                    c31824CeK.LJI = 10;
                    AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.1Tb
                        @Override // X.InterfaceC86003Zc
                        public final void subscribe(InterfaceC73573Su9<C76800UCe> interfaceC73573Su9) {
                            C79258V8s.LIZ.LIZIZ(C31824CeK.this, new IDqS0S0200100(j, accompaniment, r6, 3));
                        }
                    }).LJJL(T16.LIZ()).LIZ(new C29355Bfb());
                    i3 = i4;
                } else {
                    return;
                }
            }
        }
    }

    public static void LIZIZ(IDqS416S0100000 iDqS416S0100000) {
        ArrayList arrayList = (ArrayList) LJLLJ;
        if ((!arrayList.isEmpty()) || LiveBGMSetting.INSTANCE.inLiveBGMUpgrade()) {
            if (iDqS416S0100000 != null) {
                iDqS416S0100000.invoke(arrayList);
            }
        } else {
            LLD = false;
            ((AccompanimentApi) LJLILLLLZI.getValue()).getAlbums().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(iDqS416S0100000, 27), new IDfS292S0100000(iDqS416S0100000, 28));
        }
    }

    public static void LJII(boolean z) {
        if (!LL) {
            return;
        }
        if (z) {
            BYI.LIZLLL(BWZ.BGM);
            LJZL = true;
        }
        IAudioFilterManager LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.pause();
        }
        LL = false;
        C15610jN.LIZIZ(new Runnable() { // from class: X.0h5
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    Iterator it = C14270hD.LJFF().iterator();
                    while (it.hasNext()) {
                        ((InterfaceC14400hQ) it.next()).LJJJLL();
                    }
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        if (z) {
            LJLL = 2L;
        }
        if (z) {
            C32101Nu.LJIILL(Long.valueOf(LJLJLLL), LJLJLJ, Long.valueOf(System.currentTimeMillis() / 1000), 4L, null);
        } else if (LJLLI) {
            C32101Nu.LJIILL(Long.valueOf(LJLJLLL), LJLJLJ, Long.valueOf(System.currentTimeMillis() / 1000), 2L, null);
        } else {
            C32101Nu.LJIILL(Long.valueOf(LJLJLLL), LJLJLJ, Long.valueOf(System.currentTimeMillis() / 1000), 1L, null);
        }
    }

    public static void LJIIIZ(boolean z) {
        if (z) {
            LJLL = 1L;
        } else {
            C32101Nu.LJIILL(Long.valueOf(LJLJLLL), LJLJLJ, Long.valueOf(System.currentTimeMillis() / 1000), 1L, null);
        }
        LJIIIIZZ(LJZ, z);
    }

    public static void LJIIJ(long j) {
        String str;
        if (LJZI == null) {
            return;
        }
        List<Album> list = LJLLJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Album) next).id == j) {
                arrayList.add(next);
            }
        }
        Album album = (Album) ORZ.LJLLLLLL(0, arrayList);
        if (album == null || (str = album.name) == null) {
            str = "unknown";
        }
        int i = LJLJJI;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_list_play_duration");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(C14370hN.LIZIZ, "room_id");
        C78895Uxn.LIZIZ(LIZ, str, "tab", i, "duration");
        LIZ.LJIJJ(String.valueOf(LJZ), "collection_id");
        LIZ.LJJIIJZLJL();
        LJLJJI = 0;
    }

    public static void LJIIJJI(String str) {
        Object obj;
        String str2;
        Accompaniment accompaniment;
        LJLJJI += LJLJI;
        int i = LJLJI;
        Iterator it = ((ArrayList) LJLLJ).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Album) obj).id == LJZ) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Album album = (Album) obj;
        if (album == null || (str2 = album.name) == null) {
            str2 = "unknown";
        }
        C1VT c1vt = LJZI;
        if (c1vt != null && (accompaniment = c1vt.getAccompaniment()) != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_play_duration");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(C14370hN.LIZIZ, "room_id");
            LIZ.LJIJJ(str, "is_finish");
            LIZ.LJIJJ(String.valueOf(accompaniment.id), "music_id");
            LIZ.LJIJJ(accompaniment.title, "music_name");
            LIZ.LJIJJ(accompaniment.author, "artist_name");
            LIZ.LJIJJ(accompaniment.url, "music_url");
            C78895Uxn.LIZIZ(LIZ, str2, "from_request_type", i, "duration");
            LIZ.LJIJJ("decorate", "enter_from");
            LIZ.LJIJJ(C14370hN.LIZ, "select_scene");
            LIZ.LJIJJ(String.valueOf(LJZ), "collection_id");
            LIZ.LJJIIJZLJL();
        }
        LJLJI = 0;
    }

    public static void LJIIL(final long j) {
        int i;
        List<Accompaniment> list = LJLLLL.get(Long.valueOf(j));
        int i2 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List<Accompaniment> list2 = LJLLLLLL.get(Long.valueOf(j));
        if (list2 != null) {
            i2 = list2.size();
        }
        if (i + i2 > 2) {
            return;
        }
        AccompanimentApi accompanimentApi = (AccompanimentApi) LJLILLLLZI.getValue();
        Long l = (Long) LJI().get(Long.valueOf(j));
        if (l == null) {
            l = 0L;
        }
        accompanimentApi.getAccompanimentsWithAlbumId(j, l.longValue(), 5L).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1TW
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Long l2 = 0L;
                if (((AccompanimentsResponse) baseResponse.data).hasMore) {
                    ConcurrentHashMap LJI = C14270hD.LJI();
                    Long valueOf = Long.valueOf(j);
                    Long l3 = (Long) C14270hD.LJI().get(Long.valueOf(j));
                    if (l3 != null) {
                        l2 = l3;
                    }
                    LJI.put(valueOf, Long.valueOf(l2.longValue() + ((AccompanimentsResponse) baseResponse.data).accompaniments.size()));
                } else {
                    C14270hD.LJI().put(Long.valueOf(j), l2);
                }
                List<Accompaniment> list3 = ((AccompanimentsResponse) baseResponse.data).accompaniments;
                ArrayList arrayList = new ArrayList();
                for (Accompaniment accompaniment : list3) {
                    if (accompaniment.url.length() > 0) {
                        arrayList.add(accompaniment);
                    }
                }
                long j2 = j;
                if (C14270hD.LJZ == j2 && arrayList.isEmpty()) {
                    C14270hD.LJIIL(j2);
                    return;
                }
                C1JI.LIZIZ(C14270hD.LJLLLL, Long.valueOf(j2), arrayList);
                List<C1VT> list4 = C14270hD.LJLZ.get(Long.valueOf(j));
                if (list4 != null && !list4.isEmpty()) {
                    return;
                }
                C14270hD.LIZ(j);
            }
        }, new InterfaceC64592gB() { // from class: X.1TX
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("request more list error: ");
                LIZ.append(((Throwable) obj).getMessage());
                C0NB.LJ("AccompanimentManager", X1D.LIZIZ(LIZ));
            }
        });
    }

    public static void LJIILIIL(boolean z) {
        if (LJZI == null) {
            return;
        }
        if (!z) {
            if (LJZL) {
                return;
            }
        } else {
            if (LJZ != 0) {
                BYI.LIZJ(BWZ.BGM);
            } else {
                BYI.LIZLLL(BWZ.BGM);
            }
            LJZL = false;
        }
        IAudioFilterManager LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.setEnable(true);
            LIZJ.resume();
        }
        LL = true;
        C15610jN.LIZIZ(new Runnable() { // from class: X.0h6
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    Iterator it = C14270hD.LJFF().iterator();
                    while (it.hasNext()) {
                        ((InterfaceC14400hQ) it.next()).d();
                    }
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        LJLJLLL = System.currentTimeMillis() / 1000;
        String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        o.LJIIIIZZ(broadcastScene, "getService(IBroadcastSer…lass.java).broadcastScene");
        LJLJLJ = broadcastScene;
        LJLL = 2L;
        C32101Nu.LJIILL(Long.valueOf(LJLJLLL), LJLJLJ, null, null, Long.valueOf(LJLL));
        LJLL = 1L;
    }

    public static void LJIILJJIL(int i) {
        float f = i / 200.0f;
        InterfaceC30442Bx8.O.LIZ(Float.valueOf(f));
        IAudioFilterManager LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.setBGMVolume(f);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        final long j;
        boolean z;
        C1VT c1vt;
        IAudioFilterManager LIZJ;
        Long l;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 0) {
            if (i == 1 && !LL) {
                C0NB.LJ("AccompanimentManager", "Time out, play next!");
                LJIIIZ(false);
            }
        } else {
            if (LJZL) {
                return true;
            }
            Object obj = msg.obj;
            if ((obj instanceof Long) && (l = (Long) obj) != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            C1VT c1vt2 = LJZI;
            if (c1vt2 != null) {
                LJII(false);
                C15780je.LIZ(c1vt2.getDownloadInfo(), true);
                List<C1VT> list = LJLZ.get(Long.valueOf(j));
                if (list != null) {
                    IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(c1vt2, 218);
                    Iterator<C1VT> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) iDqS416S0100000.invoke(it.next())).booleanValue()) {
                            it.remove();
                        }
                    }
                }
            }
            LJZI = null;
            boolean z2 = false;
            while (true) {
                ConcurrentHashMap<Long, List<C1VT>> concurrentHashMap = LJLZ;
                List<C1VT> list2 = concurrentHashMap.get(Long.valueOf(LJZ));
                if (list2 == null || list2.isEmpty() || z2) {
                    break;
                }
                List<C1VT> list3 = concurrentHashMap.get(Long.valueOf(LJZ));
                if (list3 != null && (c1vt = (C1VT) ORS.LJJLJLI(list3)) != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(c1vt.getDownloadInfo().getSavePath());
                    LIZ.append(c1vt.getDownloadInfo().getName());
                    if (new File(X1D.LIZIZ(LIZ)).exists() && (LIZJ = LIZJ()) != null) {
                        LIZJ.setEnable(true);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(c1vt.getDownloadInfo().getSavePath());
                        LIZ2.append(c1vt.getDownloadInfo().getName());
                        LIZJ.setBGMMusic(X1D.LIZIZ(LIZ2));
                        LIZJ.resume();
                        LJZI = c1vt;
                        LJ().sendEmptyMessageDelayed(1, 12000L);
                        z2 = true;
                    }
                }
            }
            long j2 = 1000;
            LJLJLLL = System.currentTimeMillis() / j2;
            String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
            o.LJIIIIZZ(broadcastScene, "getService(IBroadcastSer…lass.java).broadcastScene");
            LJLJLJ = broadcastScene;
            if (msg.arg1 == 1) {
                z = true;
            } else {
                z = false;
            }
            LJLLI = z;
            long j3 = LJLLILLLL;
            long j4 = LJZ;
            if (j3 != j4) {
                LJLL = 1L;
            }
            LJLLILLLL = j4;
            C32101Nu.LJIILL(Long.valueOf(System.currentTimeMillis() / j2), LJLJLJ, null, null, Long.valueOf(LJLL));
            LJLL = 1L;
            if (LJZI == null) {
                C15610jN.LIZIZ(new Runnable() { // from class: X.0h4
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ3;
                        try {
                            java.util.Set LJFF = C14270hD.LJFF();
                            long j5 = j;
                            Iterator it2 = LJFF.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC14400hQ) it2.next()).t6(j5);
                            }
                        } finally {
                            if (LIZ3) {
                            }
                        }
                    }
                });
            }
            LIZ(j);
            LJIIL(j);
        }
        return true;
    }

    public static void LJIIIIZZ(long j, boolean z) {
        LJ().removeMessages(0);
        LJ().removeMessages(1);
        if (z) {
            LJIIJJI(CardStruct.IStatusCode.DEFAULT);
            if (LJZ != 0) {
                BYI.LIZJ(BWZ.BGM);
            } else {
                BYI.LIZLLL(BWZ.BGM);
            }
            LJZL = false;
        }
        long j2 = LJZ;
        if (j2 != j) {
            LJIIJ(j2);
        }
        boolean z2 = LJZL;
        if (j != 0 && !z2) {
            BYI.LIZJ(BWZ.BGM);
        } else {
            BYI.LIZLLL(BWZ.BGM);
        }
        LJZ = j;
        Handler LJ = LJ();
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = Long.valueOf(j);
        obtain.arg1 = C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0;
        LJ.sendMessage(obtain);
    }
}
