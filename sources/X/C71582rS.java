package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2rS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71582rS {
    public static final C71582rS LIZ = new C71582rS();
    public static final java.util.Map<String, List<Long>> LIZIZ = new ConcurrentHashMap();
    public static final java.util.Map<String, List<OSZ<Long, Long>>> LIZJ = new ConcurrentHashMap();

    public static void LIZIZ() {
        C71882rw LJIIL;
        ((ConcurrentHashMap) LIZIZ).clear();
        LJIIL = r0.LJIIL(C71512rL.LJII.LJ());
        List list = (List) LJIIL.LIZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SetSticker setSticker = ((FavStickerStruct) it.next()).getSetSticker();
                if (setSticker != null) {
                    arrayList.add(setSticker);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                SetSticker setSticker2 = (SetSticker) it2.next();
                String name = setSticker2.getName();
                if (name != null) {
                    String upperCase = name.toUpperCase(Locale.ROOT);
                    o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    Long stickerId = setSticker2.getStickerId();
                    if (stickerId != null) {
                        long longValue = stickerId.longValue();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
                        List list2 = (List) concurrentHashMap.get(upperCase);
                        if (list2 == null) {
                            list2 = new ArrayList();
                        }
                        if (!list2.contains(Long.valueOf(longValue))) {
                            list2.add(Long.valueOf(longValue));
                        }
                        concurrentHashMap.put(upperCase, list2);
                    }
                }
            }
        }
    }

    public static List LIZ(String name) {
        List<SetSticker> stickers;
        SetSticker setSticker;
        C71882rw LJIIL;
        Object obj;
        SetSticker setSticker2;
        Long stickerId;
        o.LJIIIZ(name, "name");
        if (name.length() == 0) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        if (!concurrentHashMap.isEmpty()) {
            String upperCase = name.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            List list = (List) concurrentHashMap.get(upperCase);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    LJIIL = r0.LJIIL(C71512rL.LJII.LJ());
                    List list2 = (List) LJIIL.LIZ;
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                SetSticker setSticker3 = ((FavStickerStruct) obj).getSetSticker();
                                if (setSticker3 != null && (stickerId = setSticker3.getStickerId()) != null && stickerId.longValue() == longValue) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        FavStickerStruct favStickerStruct = (FavStickerStruct) obj;
                        if (favStickerStruct != null && (setSticker2 = favStickerStruct.getSetSticker()) != null) {
                            arrayList.add(setSticker2);
                        }
                    }
                }
            }
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LIZJ;
        if (!concurrentHashMap2.isEmpty()) {
            String upperCase2 = name.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            List<OSZ> list3 = (List) concurrentHashMap2.get(upperCase2);
            if (list3 != null) {
                for (OSZ osz : list3) {
                    StickerSet stickerSet = C71442rE.LJII.LJIIL(Long.valueOf(((Number) osz.getFirst()).longValue())).LIZ;
                    if (stickerSet != null && (stickers = stickerSet.getStickers()) != null) {
                        Iterator<SetSticker> it3 = stickers.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                setSticker = it3.next();
                                Long stickerId2 = setSticker.getStickerId();
                                long longValue2 = ((Number) osz.getSecond()).longValue();
                                if (stickerId2 != null && stickerId2.longValue() == longValue2) {
                                    break;
                                }
                            } else {
                                setSticker = null;
                                break;
                            }
                        }
                        SetSticker setSticker4 = setSticker;
                        if (setSticker4 != null) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                Object next = it4.next();
                                if (o.LJ(((SetSticker) next).getStickerId(), setSticker4.getStickerId())) {
                                    if (next == null) {
                                    }
                                }
                            }
                            arrayList.add(setSticker4);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void LIZJ(List list, boolean z) {
        StickerSetInfo info;
        List<SetSticker> stickers;
        if (z) {
            ((ConcurrentHashMap) LIZJ).clear();
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            StickerSet stickerSet = C71442rE.LJII.LJIIL(Long.valueOf(longValue)).LIZ;
            if (stickerSet != null && (info = stickerSet.getInfo()) != null) {
                Integer setStatus = info.getSetStatus();
                int status = EnumC71912rz.ADDED.getStatus();
                if (setStatus != null && setStatus.intValue() == status && (stickers = stickerSet.getStickers()) != null) {
                    for (SetSticker setSticker : stickers) {
                        String name = setSticker.getName();
                        if (name != null) {
                            String upperCase = name.toUpperCase(Locale.ROOT);
                            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            Long stickerId = setSticker.getStickerId();
                            if (stickerId != null) {
                                OSZ osz = new OSZ(Long.valueOf(longValue), Long.valueOf(stickerId.longValue()));
                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ;
                                List list2 = (List) concurrentHashMap.get(upperCase);
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                }
                                if (!list2.contains(osz)) {
                                    list2.add(osz);
                                }
                                concurrentHashMap.put(upperCase, list2);
                            }
                        }
                    }
                }
            }
        }
    }
}
