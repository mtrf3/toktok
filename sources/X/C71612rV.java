package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel$tryToUpdateAddedStickerSet$2$1$2$1", f = "StickerSetContentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2rV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71612rV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StickerSetContentViewModel LJLIL;
    public final /* synthetic */ List<StickerSetInfo> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71612rV(StickerSetContentViewModel stickerSetContentViewModel, List<StickerSetInfo> list, InterfaceC67352kd<? super C71612rV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = stickerSetContentViewModel;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71612rV(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        StickerSetInfo info;
        boolean z;
        C141335gf.LIZJ(obj);
        Iterator it = ((ArrayList) this.LJLIL.LJLJI).iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            StickerSetInfo stickerSetInfo = (StickerSetInfo) it.next();
            C87393br c87393br = C87393br.LIZ;
            Long setId = stickerSetInfo.getSetId();
            if (setId != null) {
                str = setId.toString();
            }
            Integer stickerType = stickerSetInfo.getStickerType();
            int type = EnumC73222u6.ANIMATED.getType();
            if (stickerType == null || stickerType.intValue() != type) {
                z = false;
            } else {
                z = true;
            }
            C87393br.LJJ(c87393br, "store_sticker_set_page", "set", null, str, z, null, true);
        }
        ((ArrayList) this.LJLIL.LJLJI).clear();
        C71572rR c71572rR = C71572rR.LJII;
        List<StickerSetInfo> setList = this.LJLILLLLZI;
        c71572rR.getClass();
        o.LJIIIZ(setList, "setList");
        c71572rR.LIZ.put(C71572rR.LJJI(), ORZ.LLJILJILJ(setList));
        c71572rR.LJIJJ(C71572rR.LJJI(), ORZ.LLJILJILJ(setList));
        Iterator it2 = c71572rR.LIZLLL.iterator();
        while (it2.hasNext()) {
            ((InterfaceC71602rU) it2.next()).hi(setList);
        }
        C71442rE c71442rE = C71442rE.LJII;
        c71442rE.getClass();
        ArrayList arrayList = new ArrayList(C32I.LJJL(setList, 10));
        Iterator<StickerSetInfo> it3 = setList.iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().getSetId());
        }
        for (Long key : c71442rE.LIZ.keySet()) {
            StickerSet stickerSet = (StickerSet) c71442rE.LIZ.get(key);
            if (stickerSet != null && !arrayList.contains(key) && (info = stickerSet.getInfo()) != null) {
                Integer setStatus = info.getSetStatus();
                int status = EnumC71912rz.ADDED.getStatus();
                if (setStatus != null && setStatus.intValue() == status) {
                    ConcurrentHashMap<KEY, DATA> concurrentHashMap = c71442rE.LIZ;
                    o.LJIIIIZZ(key, "key");
                    StickerSet copy$default = StickerSet.copy$default(stickerSet, StickerSetInfo.copy$default(stickerSet.getInfo(), null, null, null, null, null, null, null, null, Integer.valueOf(EnumC71912rz.IN_STORE.getStatus()), null, null, null, null, 7935, null), null, 2, null);
                    C71442rE.LJII.LJJI(key.longValue(), copy$default);
                    concurrentHashMap.put(key, copy$default);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<StickerSetInfo> it4 = setList.iterator();
        while (it4.hasNext()) {
            Long setId2 = it4.next().getSetId();
            if (setId2 != null) {
                arrayList2.add(setId2);
            }
        }
        C71582rS.LIZJ(arrayList2, true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
