package X;

import Y.AfS31S0201000_5;
import Y.IDhS68S0200000_5;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.android.livesdk.subscription.SubscribeApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import emotes.model.SubEmoteDetailResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CIs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31106CIs {
    public static boolean LIZIZ;
    public static String LIZJ;
    public static final C31106CIs LIZ = new C31106CIs();
    public static final HashMap<String, Integer> LIZLLL = new HashMap<>();
    public static final List<EmoteModel> LJ = new ArrayList();
    public static final java.util.Map<String, EmoteModel> LJFF = new LinkedHashMap();
    public static final ArrayList<String> LJI = new ArrayList<>();
    public static final HashMap<Integer, List<String>> LJII = new HashMap<>();
    public static final HashMap<Integer, EnumC31110CIw> LJIIIIZZ = new HashMap<>();
    public static C73318Sq2 LJIIIZ = new C73318Sq2();

    public static List LIZ(int i) {
        if (i == -1) {
            return LJ;
        }
        List<String> list = LJII.get(Integer.valueOf(i));
        if (list == null) {
            return LJ;
        }
        List<EmoteModel> list2 = LJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (list.contains(((EmoteModel) next).emoteId)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : list) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (o.LJ(((EmoteModel) next2).emoteId, str)) {
                        if (next2 != null) {
                            arrayList2.add(next2);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    public static boolean LIZJ(int i) {
        if (LJIIIIZZ.get(Integer.valueOf(i)) == EnumC31110CIw.LOAD_SUCCESS) {
            return true;
        }
        return false;
    }

    public static final void LJ(int i) {
        LJIIIIZZ.put(Integer.valueOf(i), EnumC31110CIw.WAIT_UPDATE);
    }

    public final void LIZIZ(int i, Resources resources) {
        boolean z;
        String str;
        User owner;
        User owner2;
        o.LJIIIZ(resources, "resources");
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, EnumC31110CIw> hashMap = LJIIIIZZ;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), EnumC31110CIw.UNINITIALIZED);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null && (owner2 = room.getOwner()) != null) {
            z = owner2.isAnchorHasSubQualification();
        } else {
            z = false;
        }
        LIZIZ = z;
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null && (owner = room2.getOwner()) != null) {
            str = owner.getSecUid();
        } else {
            str = null;
        }
        if (!LIZIZ || TextUtils.isEmpty(str)) {
            return;
        }
        EnumC31110CIw enumC31110CIw = hashMap.get(Integer.valueOf(i));
        if (enumC31110CIw == null) {
            enumC31110CIw = EnumC31110CIw.UNINITIALIZED;
        }
        o.LJIIIIZZ(enumC31110CIw, "emoteDisplayTypeStateMap…teLoadState.UNINITIALIZED");
        EnumC31110CIw enumC31110CIw2 = EnumC31110CIw.LOADING;
        if (enumC31110CIw == enumC31110CIw2) {
            return;
        }
        if (enumC31110CIw == EnumC31110CIw.LOAD_SUCCESS) {
            dataChannelGlobal.tv0(EmoteBaseInformationListChannel.class, LIZ(i));
            dataChannelGlobal.tv0(EmoteBitmapListChannel.class, LIZ(i));
            return;
        }
        LIZJ = str;
        C31111CIx c31111CIx = C31111CIx.LJLIL;
        AbstractC73672Svk<C28467BFf<SubEmoteDetailResult>> emotesDetail = ((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getEmotesDetail(false, LIZJ, i);
        o.LJIIIIZZ(emotesDetail, "get().getService(Subscri…secUid, emoteDisplayType)");
        C73454SsE LJJJ = C30929CBx.LJIIJJI(emotesDetail, EnumC30931CBz.EMOTE, "emote", c31111CIx).LJJIFFI(new C31113CIz(c31111CIx)).LJJIJL(new C31108CIu(i)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        hashMap.put(Integer.valueOf(i), enumC31110CIw2);
        InterfaceC92693kP LJJJLIIL = LJJJ.LJJJLIIL(new AfS31S0201000_5(i, resources, 5), new C31109CIv(i, System.currentTimeMillis()));
        C73318Sq2 c73318Sq2 = LJIIIZ;
        if (c73318Sq2 == null) {
            return;
        }
        c73318Sq2.LIZ(LJJJLIIL);
    }

    public static void LIZLLL(List list, Resources resources, boolean z, int i) {
        o.LJIIIZ(resources, "resources");
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            EmoteModel emoteModel = (EmoteModel) next;
            java.util.Map<String, EmoteModel> map = LJFF;
            if (map.containsKey(emoteModel.emoteId)) {
                EmoteModel emoteModel2 = (EmoteModel) ((LinkedHashMap) map).get(emoteModel.emoteId);
                if (emoteModel2 != null && emoteModel2.emoteResource != null) {
                }
            }
            arrayList3.add(next);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            EmoteModel emoteModel3 = (EmoteModel) it2.next();
            java.util.Map<String, EmoteModel> map2 = LJFF;
            if (map2.containsKey(emoteModel3.emoteId)) {
                List<EmoteModel> list2 = LJ;
                C65777Prh.LIZ(list2).remove(((LinkedHashMap) map2).get(emoteModel3.emoteId));
                map2.remove(emoteModel3.emoteId);
            }
            ((ArrayList) LJ).add(emoteModel3);
            String str = emoteModel3.emoteId;
            o.LJIIIIZZ(str, "it.emoteId");
            map2.put(str, emoteModel3);
            arrayList2.add(C31665Cbl.LIZJ(emoteModel3.image).LJJIJL(new IDhS68S0200000_5(emoteModel3, resources, 3)));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        InterfaceC92693kP LJJJLL = AbstractC73672Svk.LJJIJLIJ(arrayList2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new InterfaceC64592gB() { // from class: X.9De
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new C31112CIy(System.currentTimeMillis()), new C31107CIt(i, z));
        C73318Sq2 c73318Sq2 = LJIIIZ;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZ(LJJJLL);
        }
    }
}
