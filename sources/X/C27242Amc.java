package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0100100_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Amc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27242Amc<T> implements InterfaceC64592gB {
    public final /* synthetic */ AddressEditViewModel LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Address LJLJI;
    public final /* synthetic */ long LJLJJI;

    public C27242Amc(AddressEditViewModel addressEditViewModel, boolean z, Address address, long j) {
        this.LJLIL = addressEditViewModel;
        this.LJLILLLLZI = z;
        this.LJLJI = address;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        AddressVoucherInfo addressVoucherInfo;
        AddressVoucherInfo addressVoucherInfo2;
        AddressEditViewModel addressEditViewModel = this.LJLIL;
        addressEditViewModel.LLJJ = false;
        Response response = (Response) ((C64797Pbt) obj).LIZIZ;
        SaveData saveData = (SaveData) response.data;
        addressEditViewModel.setStateImmediate(C27275An9.LJLIL);
        String str = null;
        if (response.isCodeOK()) {
            if (saveData != null) {
                List<Error> list = saveData.errors;
                if (list == null || list.isEmpty()) {
                    String str2 = saveData.id;
                    if (str2 == null) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    AqS170S0100000_4 aqS170S0100000_4 = this.LJLIL.LLI;
                    if (aqS170S0100000_4 != null) {
                        aqS170S0100000_4.invoke(str2);
                    }
                    int i = !this.LJLILLLLZI ? 1 : 0;
                    IEventCenter LIZ = C26059AKp.LIZ();
                    String str3 = saveData.id;
                    if (str3 == null) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZ.LIZ("ec_address_change", C27739Aud.LJI(new AddressPageStarter.AddressEvent(str3, i, null, 4, null)));
                    C27090AkA.LJLILLLLZI = str2;
                    if (o.LJ(this.LJLIL.LJLLILLLL, CardStruct.IStatusCode.DEFAULT) && C27287AnL.LIZ().contains("ec_address_draft")) {
                        C27287AnL.LIZ().erase("ec_address_draft");
                    }
                    AddressEditViewModel addressEditViewModel2 = this.LJLIL;
                    addressEditViewModel2.getClass();
                    addressEditViewModel2.LJLLILLLL = str2;
                    this.LJLIL.LJLZ = new OSZ<>(str2, this.LJLJI);
                    this.LJLIL.setState(C27271An5.LJLIL);
                    AddressEditViewModel addressEditViewModel3 = this.LJLIL;
                    AddressPromotionInfo addressPromotionInfo = addressEditViewModel3.LLIL;
                    if (addressPromotionInfo != null && (addressVoucherInfo = addressPromotionInfo.addressVoucher) != null) {
                        str = addressVoucherInfo.daInfo;
                    }
                    addressEditViewModel3.Kv0(str, saveData.dataInfo);
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJI;
                    AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
                    if (addressEditFragment == null) {
                        return;
                    }
                    C78946Uyc.LJJII(addressEditFragment, new C70932Rse(), new AqS29S0100100_4(elapsedRealtime, this.LJLIL, 7));
                    return;
                }
                this.LJLIL.setState(new AqS170S0100000_4(saveData, 1332));
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.LJLJJI;
                AddressEditViewModel addressEditViewModel4 = this.LJLIL;
                AddressPromotionInfo addressPromotionInfo2 = addressEditViewModel4.LLIL;
                if (addressPromotionInfo2 != null && (addressVoucherInfo2 = addressPromotionInfo2.addressVoucher) != null) {
                    str = addressVoucherInfo2.daInfo;
                }
                addressEditViewModel4.Kv0(str, saveData.dataInfo);
                AddressEditFragment addressEditFragment2 = AddressEditFragment.LLD;
                if (addressEditFragment2 == null) {
                    return;
                }
                C78946Uyc.LJJII(addressEditFragment2, new C70932Rse(), new C27244Ame(saveData, this.LJLIL, elapsedRealtime2));
                return;
            }
        } else if (saveData != null && saveData.exceptionUX != null) {
            AddressEditViewModel addressEditViewModel5 = this.LJLIL;
            addressEditViewModel5.LLIIL = saveData.exceptionUX;
            addressEditViewModel5.setState(new AqS170S0100000_4(addressEditViewModel5, 1331));
            return;
        }
        this.LJLIL.setState(C27270An4.LJLIL);
    }
}
