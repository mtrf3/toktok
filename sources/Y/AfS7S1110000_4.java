package Y;

import X.AEY;
import X.AI8;
import X.AI9;
import X.C245349k2;
import X.C27739Aud;
import X.C2U8;
import X.C58655N0h;
import X.C58704N2e;
import X.C5S1;
import X.C64797Pbt;
import X.DialogC25754A8w;
import X.EF7;
import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.live.notification.repository.NotificationGameStatus;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AfS7S1110000_4 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS7S1110000_4 afS7S1110000_4, Object obj) {
        Error error;
        String str;
        Response response = (Response) ((C64797Pbt) obj).LIZIZ;
        CheckShippingAddressData checkShippingAddressData = (CheckShippingAddressData) response.data;
        if (checkShippingAddressData != null) {
            AddressSelectViewModel addressSelectViewModel = (AddressSelectViewModel) afS7S1110000_4.l1;
            boolean z = afS7S1110000_4.z2;
            String str2 = afS7S1110000_4.s0;
            List<Error> list = checkShippingAddressData.errors;
            if (list != null) {
                Iterator<Error> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        error = it.next();
                        if (o.LJ(error.key, "zipcode")) {
                            break;
                        }
                    } else {
                        error = null;
                        break;
                    }
                }
                Error error2 = error;
                if (error2 != null && (str = error2.error) != null) {
                    addressSelectViewModel.getClass();
                    AddressSelectViewModel.Kv0(str, true);
                    return;
                }
            }
            if (response.isCodeOK()) {
                addressSelectViewModel.getClass();
                EventCenter.LJ().LIZ("ec_zipcode_locate_address", C27739Aud.LJI(new ZipcodeLocateAddress(-1, null, null, null, Boolean.TRUE)));
            }
            if (!response.isCodeOK() || z) {
                return;
            }
            addressSelectViewModel.Lv0(str2);
        }
    }

    public static final void accept$1(AfS7S1110000_4 afS7S1110000_4, Object obj) {
        if (((NotificationGameStatus) obj).statusCode == 0) {
            AI9 accessory = ((AI8) ((NotificationLiveBottomDialog) afS7S1110000_4.l1)._$_findCachedViewById(R.id.igl)).getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            ((AEY) accessory).LJIILIIL(afS7S1110000_4.z2);
            NotificationLiveBottomDialog notificationLiveBottomDialog = (NotificationLiveBottomDialog) afS7S1110000_4.l1;
            boolean z = afS7S1110000_4.z2;
            C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "otherclick", notificationLiveBottomDialog.LJLJLJ);
            LIZLLL.LIZJ("manage_page", "refer");
            LIZLLL.LIZIZ(notificationLiveBottomDialog.LJLJL, "enter_from");
            LIZLLL.LIZIZ(Integer.valueOf(!z ? 1 : 0), "notification_choose_type");
            LIZLLL.LJI();
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.gq6);
            c5s1.LJ();
            C2U8.LIZ(new C245349k2(afS7S1110000_4.s0, afS7S1110000_4.z2));
        } else {
            ((NotificationLiveBottomDialog) afS7S1110000_4.l1).wl();
        }
        DialogC25754A8w dialogC25754A8w = ((NotificationLiveBottomDialog) afS7S1110000_4.l1).LJLLILLLL;
        if (dialogC25754A8w != null) {
            dialogC25754A8w.dismiss();
        }
    }

    public AfS7S1110000_4(Object obj, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.z2 = z;
        this.s0 = str;
    }
}
