package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.assets.AssetsListResult;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cn5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32367Cn5<T> implements InterfaceC64592gB {
    public final /* synthetic */ C32366Cn4 LJLIL;
    public final /* synthetic */ C68322mC<List<Long>> LJLILLLLZI;
    public final /* synthetic */ InterfaceC32013ChN LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public C32367Cn5(C32366Cn4 c32366Cn4, C68322mC<List<Long>> c68322mC, InterfaceC32013ChN interfaceC32013ChN, boolean z, int i, long j) {
        this.LJLIL = c32366Cn4;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = interfaceC32013ChN;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        FaceRecognitionMeta faceRecognitionMeta;
        List<String> list;
        AssetsListResult assetsListResult;
        List<AssetsModel> list2;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (assetsListResult = (AssetsListResult) baseResponse.data) != null && (list2 = assetsListResult.assets) != null) {
            C32366Cn4 c32366Cn4 = this.LJLIL;
            C68322mC<List<Long>> c68322mC = this.LJLILLLLZI;
            InterfaceC32013ChN interfaceC32013ChN = this.LJLJI;
            boolean z = this.LJLJJI;
            int i = this.LJLJJL;
            long j = this.LJLJJLL;
            synchronized (c32366Cn4) {
                ArrayList arrayList = new ArrayList(list2);
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((AssetsModel) it.next()).id));
                }
                java.util.Set LLJJ = ORZ.LLJJ(arrayList2);
                List<Long> list3 = c68322mC.element;
                ArrayList arrayList3 = new ArrayList();
                for (T t : list3) {
                    if (!LLJJ.contains(Long.valueOf(((Number) t).longValue()))) {
                        arrayList3.add(t);
                    }
                }
                List LLJILJILJ = ORZ.LLJILJILJ(arrayList3);
                for (AssetsModel assetsModel : C32366Cn4.LIZLLL) {
                    Iterator<AssetsModel> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AssetsModel next = it2.next();
                        if (next.id == assetsModel.id) {
                            if (next == null) {
                            }
                        }
                    }
                    list2.add(assetsModel);
                }
                list2.addAll(C32366Cn4.LJ);
                C32366Cn4.LIZLLL = list2;
                List<AssetsModel> list4 = C32366Cn4.LIZLLL;
                if (list4 != null) {
                    for (AssetsModel assetsModel2 : list4) {
                        List<Long> list5 = C31585CaT.LIZ;
                        if (!((ArrayList) list5).contains(Long.valueOf(assetsModel2.id))) {
                            ((ArrayList) list5).add(Long.valueOf(assetsModel2.id));
                        }
                    }
                }
                if (interfaceC32013ChN != null) {
                    interfaceC32013ChN.onSuccess(z ? arrayList : C32366Cn4.LIZLLL);
                }
                C32710Csc.LIZJ(list2.size(), c68322mC.element.size(), 0, i, "", "", System.currentTimeMillis() - j, baseResponse.LIZIZ, C32366Cn4.LIZLLL(LLJILJILJ), Integer.valueOf(((ArrayList) LLJILJILJ).size()));
            }
        }
        if (LiveGiftResourceManagerSettings.INSTANCE.getPreloadStrategy() == 0) {
            C32366Cn4.LJII();
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            for (AssetsModel assetsModel3 : C32366Cn4.LIZLLL) {
                if (assetsModel3.resourceType == AssetsModel.RESOURCE_TYPE_STICKER && (faceRecognitionMeta = assetsModel3.faceRecognitionArchiveMeta) != null && (list = faceRecognitionMeta.requirements) != null && !list.isEmpty()) {
                    FaceRecognitionMeta faceRecognitionMeta2 = assetsModel3.faceRecognitionArchiveMeta;
                    o.LJI(faceRecognitionMeta2);
                    List<String> list6 = faceRecognitionMeta2.requirements;
                    o.LJI(list6);
                    FaceRecognitionMeta faceRecognitionMeta3 = assetsModel3.faceRecognitionArchiveMeta;
                    o.LJI(faceRecognitionMeta3);
                    C79997VaT.LIZ(faceRecognitionMeta3.modelNames, list6);
                }
            }
        }
    }
}
