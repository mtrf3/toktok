package X;

import com.bytedance.android.live.uikit.reddot.RedDotStatusChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.bytedance.android.live.uikit.reddot.RedDotManager$decision$1$1$6$1", f = "RedDotManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BxD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30447BxD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DataChannel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30447BxD(DataChannel dataChannel, InterfaceC67352kd<? super C30447BxD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = dataChannel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C30447BxD(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C30446BxC c30446BxC = C30446BxC.LIZ;
        if (C30446BxC.LIZIZ(c30446BxC) != null && (!r0.isEmpty())) {
            HashSet hashSet = new HashSet();
            ConcurrentHashMap LIZIZ = C30446BxC.LIZIZ(c30446BxC);
            if (LIZIZ != null) {
                DataChannel dataChannel = this.LJLIL;
                for (Map.Entry entry : LIZIZ.entrySet()) {
                    if (C30446BxC.LJ || ((EnumC30410Bwc) entry.getValue()).isDynamic()) {
                        Object value = entry.getValue();
                        if (!hashSet.contains(value)) {
                            dataChannel.qv0(RedDotStatusChangeEvent.class, new C30450BxG((EnumC30410Bwc) entry.getValue(), true));
                            hashSet.add(value);
                        }
                    }
                }
            }
            if (C30446BxC.LJ) {
                EnumC30410Bwc[] values = EnumC30410Bwc.values();
                ArrayList arrayList = new ArrayList();
                for (EnumC30410Bwc enumC30410Bwc : values) {
                    if (ORY.LJJIJIIJIL(C30446BxC.LJFF, enumC30410Bwc.getLivePage())) {
                        arrayList.add(enumC30410Bwc);
                    }
                }
                DataChannel dataChannel2 = this.LJLIL;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    EnumC30410Bwc enumC30410Bwc2 = (EnumC30410Bwc) it.next();
                    String[] ids = enumC30410Bwc2.getIds();
                    int length = ids.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            String str = ids[i];
                            HashSet LIZ = C30446BxC.LIZ(C30446BxC.LIZ);
                            if (LIZ != null && LIZ.contains(str)) {
                                if (!hashSet.contains(enumC30410Bwc2)) {
                                    dataChannel2.qv0(RedDotStatusChangeEvent.class, new C30450BxG(enumC30410Bwc2, true));
                                    hashSet.add(enumC30410Bwc2);
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
