package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.api.Modification;
import com.bytedance.android.live.effect.api.ModificationUploadRequest;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.1Nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32101Nu implements C0WW {
    public static final C32101Nu LIZ = new C32101Nu();
    public static final ConcurrentHashMap<Long, List<Modification>> LIZIZ = new ConcurrentHashMap<>();
    public static long LIZJ;
    public static String LIZLLL;
    public static Modification LJ;

    public static long LIZJ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    public static void LIZ(long j) {
        List<Modification> list = LIZIZ.get(Long.valueOf(j));
        if (list != null) {
            list.clear();
        }
    }

    public static long LIZIZ(C08870Wl c08870Wl) {
        Boolean bool;
        if (c08870Wl != null) {
            if (c08870Wl.LJIJJ == 0) {
                if (C29306Beo.LJJIFFI(Boolean.valueOf(c08870Wl.LJIILJJIL))) {
                    return 2L;
                }
                return 1L;
            }
            if (c08870Wl.LJIJJ == 0) {
                return 0L;
            }
            bool = Boolean.valueOf(c08870Wl.LJIILJJIL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return 4L;
        }
        return 3L;
    }

    public static void LJIIL(long j) {
        List<Modification> list = LIZIZ.get(Long.valueOf(j));
        if (list != null && (!list.isEmpty())) {
            LJIIJ(LIZJ(), list);
        }
    }

    public static void LIZLLL(C08890Wn c08890Wn, boolean z) {
        Long l;
        if (c08890Wn == null) {
            return;
        }
        long j = c08890Wn.LIZ;
        String str = c08890Wn.LIZJ;
        if (str == null) {
            str = "";
        }
        String str2 = c08890Wn.LIZIZ;
        long j2 = 1000;
        long j3 = c08890Wn.LJI / j2;
        String str3 = null;
        if (z) {
            l = Long.valueOf(C30725C4b.LIZ() / j2);
        } else {
            l = null;
        }
        long j4 = c08890Wn.LJFF;
        if (j4 == 1) {
            str3 = LIZLLL;
        }
        LJI(8L, new Modification(j, str, str2, 8L, Long.valueOf(j3), l, 0L, null, null, null, null, str3, c08890Wn.LIZLLL, null, null, j4, 26496, null));
    }

    public static void LJ(C08810Wf c08810Wf, boolean z) {
        Long l;
        long j;
        long j2;
        if (c08810Wf == null) {
            return;
        }
        LiveEffect liveEffect = c08810Wf.LJI;
        long j3 = liveEffect.effectId;
        String name = liveEffect.getName();
        if (name == null) {
            name = "";
        }
        String str = c08810Wf.LIZIZ;
        long j4 = 1000;
        Long valueOf = Long.valueOf(c08810Wf.LJII / j4);
        if (z) {
            l = Long.valueOf(C30725C4b.LIZ() / j4);
        } else {
            l = null;
        }
        String str2 = liveEffect.effectPanelKey;
        if (c08810Wf.LIZLLL == c08810Wf.LJ) {
            j = 1L;
        } else {
            j = 2L;
        }
        if (c08810Wf.LJIIIIZZ) {
            j2 = 2L;
        } else {
            j2 = 1L;
        }
        LJI(3L, new Modification(j3, name, str, 3L, valueOf, l, 0L, str2, j, j2, Float.valueOf(c08810Wf.LIZJ), null, c08810Wf.LJIIIZ, null, null, 0L, 57344, null));
    }

    public static final void LJFF(String str, boolean z) {
        Modification modification;
        LIZLLL = str;
        if (z) {
            Modification modification2 = LJ;
            if (modification2 != null) {
                modification2.url = str;
                modification2.startTime = Long.valueOf(System.currentTimeMillis() / 1000);
                LJIIJ(LIZJ(), C47261Igj.LJJIJIL(Modification.LIZ(modification2)));
            }
            LJ = null;
            return;
        }
        List<Modification> list = LIZIZ.get(1L);
        if (list == null || list.size() < 1 || (modification = (Modification) ListProtector.get(list, 0)) == null) {
            return;
        }
        modification.url = LIZLLL;
        ArrayList arrayList = new ArrayList();
        Modification LIZ2 = Modification.LIZ(modification);
        LIZ2.subType = 1L;
        arrayList.add(LIZ2);
        LJIIJ(LIZJ(), arrayList);
    }

    public static void LJI(long j, Modification modification) {
        ConcurrentHashMap<Long, List<Modification>> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
            concurrentHashMap.put(Long.valueOf(j), new ArrayList());
        }
        List<Modification> list = concurrentHashMap.get(Long.valueOf(j));
        if (list != null) {
            list.add(modification);
        }
    }

    public static void LJII(C08870Wl c08870Wl, boolean z) {
        Long l;
        if (c08870Wl == null) {
            return;
        }
        long j = c08870Wl.LIZ;
        String str = c08870Wl.LIZJ;
        if (str == null) {
            str = "";
        }
        String str2 = c08870Wl.LIZIZ;
        long j2 = 1000;
        Long valueOf = Long.valueOf(c08870Wl.LJIILL / j2);
        if (z) {
            l = Long.valueOf(C30725C4b.LIZ() / j2);
        } else {
            l = null;
        }
        LJI(1L, new Modification(j, str, str2, 1L, valueOf, l, 1L, c08870Wl.LJ, null, Long.valueOf(LIZIZ(c08870Wl)), null, null, c08870Wl.LJFF, null, null, 0L, 57344, null));
    }

    public static void LJIIIIZZ(C08870Wl c08870Wl, boolean z) {
        Modification modification;
        if (c08870Wl == null) {
            return;
        }
        long LIZIZ2 = LIZIZ(c08870Wl);
        String str = c08870Wl.LJIIIZ;
        Long l = null;
        String str2 = "";
        if (str != null) {
            long parseLong = CastLongProtector.parseLong(str);
            String str3 = c08870Wl.LJIIJ;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c08870Wl.LJIIJJI;
            if (str4 != null) {
                str2 = str4;
            }
            long j = 1000;
            Long valueOf = Long.valueOf(c08870Wl.LJIILL / j);
            if (z) {
                l = Long.valueOf(C30725C4b.LIZ() / j);
            }
            modification = new Modification(parseLong, str3, str2, 1L, valueOf, l, 0L, c08870Wl.LJ, null, Long.valueOf(LIZIZ2), null, LIZLLL, c08870Wl.LJFF, Long.valueOf(c08870Wl.LIZ), null, c08870Wl.LJIJI);
        } else {
            long j2 = c08870Wl.LIZ;
            String str5 = c08870Wl.LIZJ;
            if (str5 != null) {
                str2 = str5;
            }
            String str6 = c08870Wl.LIZIZ;
            long j3 = 1000;
            Long valueOf2 = Long.valueOf(c08870Wl.LJIILL / j3);
            if (z) {
                l = Long.valueOf(C30725C4b.LIZ() / j3);
            }
            modification = new Modification(j2, str2, str6, 1L, valueOf2, l, 0L, c08870Wl.LJ, null, Long.valueOf(LIZIZ2), null, LIZLLL, c08870Wl.LJFF, null, null, c08870Wl.LJIJI);
        }
        LJI(1L, modification);
    }

    public static void LJIIJ(long j, List list) {
        C1EW.LIZ(((EffectRelatedApi) C1A.LIZJ(EffectRelatedApi.class)).uploadEffectRelatedUseLog(new ModificationUploadRequest(j, C61328O5c.LJ(list)))).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1Ns
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.1Nt
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LJIIJ(6, "UploadEffectRelatedLog", ((Throwable) obj).getStackTrace());
            }
        });
    }

    public static void LJIILIIL(C08870Wl c08870Wl, boolean z) {
        Long l;
        if (c08870Wl == null || C29306Beo.LJJI()) {
            return;
        }
        long j = c08870Wl.LIZ;
        String str = c08870Wl.LIZJ;
        if (str == null) {
            str = "";
        }
        String str2 = c08870Wl.LIZIZ;
        long j2 = 1000;
        long j3 = c08870Wl.LJIILL / j2;
        if (z) {
            l = Long.valueOf(C30725C4b.LIZ() / j2);
        } else {
            l = null;
        }
        Modification modification = new Modification(j, str, str2, 1L, Long.valueOf(j3), l, 0L, null, null, null, null, null, null, Long.valueOf(j), null, 1L, 24512, null);
        if (LIZJ() != 0) {
            LIZJ = LIZJ();
        }
        LJIIJ(LIZJ, C47261Igj.LJJIJIL(modification));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILJJIL(LiveEffect liveEffect, boolean z) {
        Integer num;
        boolean z2;
        String str;
        long j;
        if (liveEffect == null) {
            return;
        }
        long j2 = liveEffect.effectId;
        String resourceId = liveEffect.getResourceId();
        String name = liveEffect.getName();
        boolean z3 = liveEffect.isVideoUsedSticker;
        String str2 = liveEffect.effectPanelKey;
        String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        C30496By0 c30496By0 = liveEffect.logParams;
        boolean z4 = c30496By0.LIZ;
        boolean z5 = c30496By0.LIZIZ;
        String str3 = liveEffect.parentEffectId;
        String str4 = liveEffect.parentResName;
        String str5 = liveEffect.parentResId;
        String str6 = (String) DataChannelGlobal.LJLJJI.mv0(C2BX.class);
        String valueOf = String.valueOf(C18420nu.LIZJ + 1);
        boolean z6 = liveEffect.isFromOtherUser;
        Integer num2 = liveEffect.parentImpressionPos;
        Long l = null;
        if (num2 != null) {
            num = C77339UWx.LIZIZ(num2, 1);
        } else {
            num = null;
        }
        String valueOf2 = String.valueOf(num);
        Effect effect = liveEffect.getEffect();
        if (effect != null) {
            if (C0TZ.LIZ(effect.getExtra(), "is_avatar", false) || C0TZ.LIZ(effect.getSdkExtra(), "is_avatar", false)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        long LIZ2 = C30725C4b.LIZ();
        Effect effect2 = liveEffect.getEffect();
        if (effect2 != null) {
            str = effect2.getDesignerId();
        } else {
            str = null;
        }
        if (liveEffect.isGreenScreen) {
            j = 1;
        } else {
            j = 0;
        }
        C08870Wl c08870Wl = new C08870Wl(j2, resourceId, name, z3, str2, broadcastScene, z4, z5, "normal_icon", str3, str4, str5, str6, valueOf, false, LIZ2, z6, valueOf2, z2, j, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, liveEffect.logParams.LIZLLL, 4210688);
        long j3 = c08870Wl.LIZ;
        String str7 = c08870Wl.LIZJ;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = c08870Wl.LIZIZ;
        long j4 = 1000;
        long j5 = c08870Wl.LJIILL / j4;
        if (z) {
            l = Long.valueOf(C30725C4b.LIZ() / j4);
        }
        Modification modification = new Modification(j3, str7, str8, 1L, Long.valueOf(j5), l, 1L, null, null, null, null, null, null, Long.valueOf(j3), null, c08870Wl.LJIJI, 24448, null);
        if (LIZJ() != 0) {
            LIZJ = LIZJ();
        }
        if (liveEffect.isGreenScreen) {
            LJ = modification;
        }
        LJIIJ(LIZJ, C47261Igj.LJJIJIL(modification));
    }

    public static void LJIIIZ(LiveEffect liveEffect, Long l, String scene) {
        long LIZ2;
        Long l2;
        o.LJIIIZ(scene, "scene");
        long j = liveEffect.effectId;
        String str = liveEffect.nameForEnglish;
        if (str == null) {
            str = "";
        }
        String resourceId = liveEffect.getResourceId();
        if (l != null) {
            LIZ2 = l.longValue();
        } else {
            LIZ2 = C30725C4b.LIZ() / 1000;
        }
        Long valueOf = Long.valueOf(LIZ2);
        if (l != null) {
            l2 = Long.valueOf(C30725C4b.LIZ() / 1000);
        } else {
            l2 = null;
        }
        LJI(4L, new Modification(j, str, resourceId, 4L, valueOf, l2, 0L, null, null, 1L, null, null, scene, null, null, 0L, 57344, null));
    }

    public static void LJIILLIIL(LiveEffect liveEffect, Long l, String scene) {
        o.LJIIIZ(scene, "scene");
        LJIIIZ(liveEffect, l, scene);
        LJIIL(4L);
    }

    public static void LJIIJJI(Long l, Long l2, Long l3, Long l4) {
        Modification modification;
        if (l != null) {
            l.longValue();
        }
        MusicSong musicSong = C14260hC.LJ;
        if (musicSong != null) {
            modification = new Modification(musicSong.id, musicSong.title, "", 5L, l, l2, 0L, "", l3, l4, null, musicSong.previewUrl, ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), null, null, 0L, 57344, null);
        } else {
            modification = null;
        }
        if (LIZJ() != 0) {
            LIZJ = LIZJ();
        }
        if (modification != null) {
            LJIIJ(LIZJ, C47261Igj.LJJIJIL(modification));
        }
    }

    public static void LJIILL(Long l, String scene, Long l2, Long l3, Long l4) {
        Modification modification;
        Accompaniment accompaniment;
        o.LJIIIZ(scene, "scene");
        if (l != null) {
            l.longValue();
        }
        C1VT c1vt = C14270hD.LJZI;
        if (c1vt != null && (accompaniment = c1vt.getAccompaniment()) != null) {
            modification = new Modification(accompaniment.id, accompaniment.title, "", 5L, l, l2, 0L, String.valueOf(C14270hD.LJZ), l3, l4, null, accompaniment.url, scene, null, null, 0L, 57344, null);
        } else {
            modification = null;
        }
        if (LIZJ() != 0) {
            LIZJ = LIZJ();
        }
        if (modification != null) {
            LJIIJ(LIZJ, C47261Igj.LJJIJIL(modification));
        }
    }
}
