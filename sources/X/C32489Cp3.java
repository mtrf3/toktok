package X;

import com.bytedance.android.livesdk.BoxGiftPageEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cp3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32489Cp3 extends AbstractC32474Coo {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C32490Cp4 LIZIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    @Override // X.AbstractC32474Coo
    public final void LIZJ(List list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<Gift> list2 = ((GiftPage) it.next()).gifts;
            o.LJIIIIZZ(list2, "it.gifts");
            ORS.LJJLIIIJILLIZJL(list2, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Gift) next).isBoxGift) {
                arrayList2.add(next);
            }
        }
        GiftManager.filterUnSupportGifts(list, this.LIZ);
        DataChannel dataChannel = this.LIZIZ.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(BoxGiftPageEvent.class, new C32488Cp2(null, arrayList2, null, list, EnumC32491Cp5.RETRY));
        }
    }

    public C32489Cp3(boolean z, C32490Cp4 c32490Cp4) {
        this.LIZ = z;
        this.LIZIZ = c32490Cp4;
    }
}
