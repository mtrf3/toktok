package Y;

import X.BP1;
import X.C119404mO;
import X.C15620jO;
import X.C15650jR;
import X.C28721BOz;
import X.C29716BlQ;
import X.C30760C5k;
import X.C31665Cbl;
import X.C31819CeF;
import X.C31823CeJ;
import X.C32I;
import X.C73433Srt;
import X.CDP;
import X.CDR;
import X.CDX;
import X.CN1;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.ORZ;
import X.X1D;
import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public class IDuS317S0100000_5 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    public static final void subscribe$4(IDuS317S0100000_5 iDuS317S0100000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        ((StickerMessageManager) iDuS317S0100000_5.l0).lambda$new$0((C73433Srt) interfaceC73573Su9);
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<File> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            case 5:
                subscribe$5(this, interfaceC73573Su9);
                return;
            case 6:
                subscribe$6(this, interfaceC73573Su9);
                return;
            case 7:
                subscribe$7(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDuS317S0100000_5(List list, List<GiftPage> list2) {
        this.$t = list2;
        switch (list2) {
            case 1:
            case 2:
            case 5:
                this.l0 = list;
                return;
            case 3:
            case 4:
            default:
                this.l0 = list;
                return;
        }
    }

    public static final void subscribe$0(IDuS317S0100000_5 iDuS317S0100000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        File LIZIZ = C31819CeF.LIZIZ((C31823CeJ) iDuS317S0100000_5.l0);
        C28721BOz.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("config = ");
        LIZ.append((C31823CeJ) iDuS317S0100000_5.l0);
        LIZ.append(" file = ");
        LIZ.append(LIZIZ);
        BP1.LIZ("BitmapFileUtil", X1D.LIZIZ(LIZ));
        if (LIZIZ != null && LIZIZ.exists()) {
            interfaceC73573Su9.onNext(LIZIZ);
        } else {
            interfaceC73573Su9.onError(new Throwable("the file isn't existing"));
        }
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$1(IDuS317S0100000_5 iDuS317S0100000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        List list;
        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && (list = (List) iDuS317S0100000_5.l0) != null && (!list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<Gift> list2 = ((GiftPage) it.next()).gifts;
                if (list2 != null && (!list2.isEmpty())) {
                    Iterator<Gift> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C30760C5k.LJFF(it2.next().image);
                    }
                }
            }
        }
    }

    public static final void subscribe$2(IDuS317S0100000_5 iDuS317S0100000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        List list;
        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && (list = (List) iDuS317S0100000_5.l0) != null && (!list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<Gift> list2 = ((GiftPage) it.next()).gifts;
                if (list2 != null && (!list2.isEmpty())) {
                    Iterator<Gift> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C15620jO.LJFF(it2.next().image);
                    }
                }
            }
        }
    }

    public static final void subscribe$3(IDuS317S0100000_5 iDuS317S0100000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        List list = (List) iDuS317S0100000_5.l0;
        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<Gift> list2 = ((GiftPage) it.next()).gifts;
                if (list2 != null && list2.size() > 0) {
                    Iterator<Gift> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ImageModel imageModel = it2.next().image;
                        if (imageModel != null) {
                            C30760C5k.LJFF(imageModel);
                        }
                    }
                }
            }
        }
    }

    public static final void subscribe$5(IDuS317S0100000_5 iDuS317S0100000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        List list;
        ImageModel imageModel;
        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && (list = (List) iDuS317S0100000_5.l0) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GiftPage) it.next()).gifts);
            }
            for (Gift gift : C32I.LJJLI(arrayList)) {
                if (gift != null) {
                    imageModel = gift.image;
                } else {
                    imageModel = null;
                }
                C30760C5k.LJFF(imageModel);
            }
        }
    }

    public static final void subscribe$6(IDuS317S0100000_5 iDuS317S0100000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        int i;
        boolean z;
        BenefitView benefitView;
        ImageModel imageModel;
        BenefitView benefitView2;
        ArrayList arrayList = new ArrayList();
        Context context = ((SubscriptionPrivilegeDetailFragment) iDuS317S0100000_5.l0).getContext();
        if (context != null) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) iDuS317S0100000_5.l0;
            List<CDP> list = subscriptionPrivilegeDetailFragment.LJLLJ;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((CDP) next).LIZIZ != null) {
                    arrayList2.add(next);
                }
            }
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                CDX cdx = new CDX(i2, size - 1, subscriptionPrivilegeDetailFragment, context);
                C119404mO dotView = cdx.getDotView();
                CDP cdp = (CDP) ORZ.LJLLLLLL(i2, arrayList2);
                if (cdp != null && (benefitView2 = cdp.LIZIZ) != null) {
                    i = benefitView2.benefitType;
                } else {
                    i = 0;
                }
                dotView.setDotColor(C29716BlQ.LIZIZ(CDR.LIZ(i).LJLJI));
                cdx.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                cdx.setOnChosen(z);
                CDP cdp2 = (CDP) ORZ.LJLLLLLL(i2, arrayList2);
                if (cdp2 != null && (benefitView = cdp2.LIZIZ) != null && (imageModel = benefitView.navIcon) != null) {
                    C15650jR.LIZ().LJIIIZ(imageModel).LJIIJJI(cdx.getIndicatorIcon());
                    C31665Cbl.LIZJ(imageModel);
                }
                arrayList.add(cdx);
            }
        }
        interfaceC73573Su9.onNext(arrayList);
    }

    public static final void subscribe$7(IDuS317S0100000_5 iDuS317S0100000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        ((IHostSubscription) CN1.LIZ(IHostSubscription.class)).Me0(((SubscriptionSettingFragmentNew) iDuS317S0100000_5.l0).getContext(), new AqS171S0100000_5((C73433Srt) interfaceC73573Su9, 775));
    }

    public IDuS317S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
