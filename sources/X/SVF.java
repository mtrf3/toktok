package X;

import Y.AfS21S1000000_8;
import Y.AfS22S1100000_8;
import Y.IDhS94S0100000_1;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspActionStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS42S1300000_12;
import kotlin.jvm.internal.AqS50S1000000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SVF {
    public static final Gson LIZ = new e().LIZ();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJFF = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJII = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJIIIIZZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJIIIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJIIJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJIIJJI = new ConcurrentHashMap<>();

    public static String LJFF() {
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null && (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) != null) {
            return currentUser.getUid();
        }
        return null;
    }

    static {
        new ConcurrentHashMap();
    }

    public static C73411SrX LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        return (C73411SrX) AbstractC73672Svk.LJJIJIL(1).LJJIII(new IDhS94S0100000_1(interfaceC65784Pro, 7), false).LJJL(T16.LIZ()).LJJIJL(V0N.LJLILLLLZI).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9E7
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9E8
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public static AbstractC73672Svk LIZIZ(InterfaceC88472Yns interfaceC88472Yns) {
        DspActionStruct dspActionStruct = new DspActionStruct();
        interfaceC88472Yns.invoke(dspActionStruct);
        String json = GsonProtectorUtils.toJson(LIZ, C47261Igj.LJJIJ(dspActionStruct));
        o.LJIIIIZZ(json, "gson.toJson(list)");
        return C35930E8g.LIZ(json);
    }

    public static void LJI(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZJ;
        Boolean bool = concurrentHashMap.get(musicId);
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            return;
        }
        concurrentHashMap.put(musicId, bool2);
        DspActionStruct dspActionStruct = new DspActionStruct();
        dspActionStruct.setItemId(musicId);
        dspActionStruct.setItemType(Integer.valueOf(SVJ.DSP_ITEM_MUSIC.getNumber()));
        dspActionStruct.setActionType(Integer.valueOf(SVH.FULL_CLIP_ANCHOR_CLICK.getNumber()));
        dspActionStruct.setScene(Integer.valueOf(SVI.FEED_ANCHOR.getNumber()));
        String json = GsonProtectorUtils.toJson(LIZ, C47261Igj.LJJIJ(dspActionStruct));
        o.LJIIIIZZ(json, "gson.toJson(list)");
        C35930E8g.LIZ(json).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new InterfaceC48038ItG() { // from class: X.2aR
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                BaseResponse it = (BaseResponse) obj;
                o.LJIIIZ(it, "it");
                if (it.status_code == 0) {
                    return C76800UCe.LIZ;
                }
                throw new RuntimeException("server error");
            }
        }).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9EB
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new AfS21S1000000_8(musicId, 0));
    }

    public static void LJII(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZIZ;
        Boolean bool = concurrentHashMap.get(musicId);
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            return;
        }
        concurrentHashMap.put(musicId, bool2);
        DspActionStruct dspActionStruct = new DspActionStruct();
        dspActionStruct.setItemId(musicId);
        dspActionStruct.setItemType(Integer.valueOf(SVJ.DSP_ITEM_MUSIC.getNumber()));
        dspActionStruct.setActionType(Integer.valueOf(SVH.FULL_CLIP_ANCHOR_SHOW.getNumber()));
        dspActionStruct.setScene(Integer.valueOf(SVI.FEED_ANCHOR.getNumber()));
        String json = GsonProtectorUtils.toJson(LIZ, C47261Igj.LJJIJ(dspActionStruct));
        o.LJIIIIZZ(json, "gson.toJson(list)");
        C35930E8g.LIZ(json).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(C77318UWc.LJLJJL).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9ED
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new AfS21S1000000_8(musicId, 2));
    }

    public static AbstractC73672Svk LIZJ(String str, SVH svh) {
        DspActionStruct dspActionStruct = new DspActionStruct();
        dspActionStruct.setItemId(str);
        dspActionStruct.setItemType(Integer.valueOf(SVJ.DSP_ITEM_MUSIC.getNumber()));
        dspActionStruct.setActionType(Integer.valueOf(svh.getNumber()));
        dspActionStruct.setScene(Integer.valueOf(SVI.TTM_BRAND_ICON.getNumber()));
        String json = GsonProtectorUtils.toJson(LIZ, C47261Igj.LJJIJ(dspActionStruct));
        o.LJIIIIZZ(json, "gson.toJson(list)");
        return C35930E8g.LIZ(json);
    }

    public static AbstractC73672Svk LIZLLL(String str, SVH svh) {
        DspActionStruct dspActionStruct = new DspActionStruct();
        dspActionStruct.setItemId(str);
        dspActionStruct.setItemType(Integer.valueOf(SVJ.DSP_ITEM_MUSIC.getNumber()));
        dspActionStruct.setActionType(Integer.valueOf(svh.getNumber()));
        dspActionStruct.setScene(Integer.valueOf(SVI.TTM_BRAND_POPUP.getNumber()));
        String json = GsonProtectorUtils.toJson(LIZ, C47261Igj.LJJIJ(dspActionStruct));
        o.LJIIIIZZ(json, "gson.toJson(list)");
        return C35930E8g.LIZ(json);
    }

    public static void LJIIIIZZ(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJIIIZ;
        StringBuilder LJFF2 = C72972SkS.LJFF(str2, '-');
        LJFF2.append(LJFF());
        LJ(concurrentHashMap, X1D.LIZIZ(LJFF2), new AqS50S1000000_12(str, 0));
    }

    public static void LJIIIZ(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJIIIIZZ;
        StringBuilder LJFF2 = C72972SkS.LJFF(str2, '-');
        LJFF2.append(LJFF());
        LJ(concurrentHashMap, X1D.LIZIZ(LJFF2), new AqS50S1000000_12(str, 1));
    }

    public static void LJIIJ(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJIIIZ;
        StringBuilder LJFF2 = C72972SkS.LJFF(str2, '-');
        LJFF2.append(LJFF());
        LJ(concurrentHashMap, X1D.LIZIZ(LJFF2), new AqS50S1000000_12(str, 2));
    }

    public static void LJIIJJI(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJIIIIZZ;
        StringBuilder LJFF2 = C72972SkS.LJFF(str2, '-');
        LJFF2.append(LJFF());
        LJ(concurrentHashMap, X1D.LIZIZ(LJFF2), new AqS50S1000000_12(str, 3));
    }

    public static void LJIILIIL(int i, String musicId) {
        o.LJIIIZ(musicId, "musicId");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZLLL;
        Boolean bool = concurrentHashMap.get(musicId);
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            return;
        }
        concurrentHashMap.put(musicId, bool2);
        DspActionStruct dspActionStruct = new DspActionStruct();
        dspActionStruct.setItemId(musicId);
        dspActionStruct.setItemType(Integer.valueOf(SVJ.DSP_FULL_CLIP.getNumber()));
        dspActionStruct.setActionType(Integer.valueOf(SVH.FULL_CLIP_TRACK_SHOW.getNumber()));
        dspActionStruct.setScene(Integer.valueOf(i));
        String json = GsonProtectorUtils.toJson(LIZ, C47261Igj.LJJIJ(dspActionStruct));
        o.LJIIIIZZ(json, "gson.toJson(list)");
        C35930E8g.LIZ(json).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(C1FO.LJLILLLLZI).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9EC
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new AfS21S1000000_8(musicId, 1));
    }

    public static InterfaceC92693kP LJ(ConcurrentHashMap concurrentHashMap, String str, InterfaceC65784Pro interfaceC65784Pro) {
        Object obj = concurrentHashMap.get(str);
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool)) {
            return EnumC73418Sre.DISPOSED;
        }
        concurrentHashMap.put(str, bool);
        return ((AbstractC73672Svk) interfaceC65784Pro.invoke()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(C48655J7r.LJLIL).LJJJLIIL(C46717IVd.LJLIL, new AfS22S1100000_8(str, concurrentHashMap, 0));
    }

    public static InterfaceC92693kP LJIIL(SVA targetApp, Context context, TTMStoreLink tTMStoreLink, String str, SVG eventType) {
        boolean z;
        o.LJIIIZ(targetApp, "targetApp");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(eventType, "eventType");
        SV7 sv7 = SV7.LIZ;
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        if (eventType.getActionType() == SVH.DSP_ACTION_CLICK) {
            z = true;
        } else {
            z = false;
        }
        sv7.getClass();
        if (!SV7.LJ(targetApp, LLLLL, z)) {
            return EnumC73418Sre.DISPOSED;
        }
        return LIZ(new AqS42S1300000_12(tTMStoreLink, str, eventType, targetApp, 1));
    }
}
