package com.ss.android.ugc.aweme.ecommerce.base.address;

import X.C1FJ;
import X.C1FL;
import X.C26751Aeh;
import X.C26756Aem;
import X.C26867AgZ;
import X.C27007Aip;
import X.C27008Aiq;
import X.C27009Air;
import X.C27010Ais;
import X.C279017q;
import X.C61845OOz;
import X.C78555UsJ;
import X.C79234V7u;
import X.C84654XKg;
import X.InterfaceC65349Pkn;
import X.InterfaceC67352kd;
import X.InterfaceC71003Rtn;
import X.WM7;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressPageStarter {
    public static C84654XKg LIZ;
    public static C84654XKg LIZIZ;

    /* loaded from: classes5.dex */
    public static final class AddressEditDetailEnterParams implements Parcelable {

        @InterfaceC65349Pkn("address")
        public final Address address;

        @InterfaceC65349Pkn("districts")
        public final List<Region> districts;

        @InterfaceC65349Pkn("from")
        public final String fromPage;

        @InterfaceC65349Pkn("template_data")
        public final InputItemData templateData;

        @InterfaceC65349Pkn("track_params")
        public final String trackParams;
        public static final C27010Ais Companion = new C27010Ais();
        public static final Parcelable.Creator<AddressEditDetailEnterParams> CREATOR = new C27009Air();

        /* JADX WARN: Multi-variable type inference failed */
        public AddressEditDetailEnterParams() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            List<Region> list = this.districts;
            if (list == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
                while (LIZIZ.hasNext()) {
                    ((Region) LIZIZ.next()).writeToParcel(out, i);
                }
            }
            Address address = this.address;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i);
            }
            InputItemData inputItemData = this.templateData;
            if (inputItemData == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                inputItemData.writeToParcel(out, i);
            }
            out.writeString(this.fromPage);
            out.writeString(this.trackParams);
        }

        public AddressEditDetailEnterParams(List<Region> list, Address address, InputItemData inputItemData, String str, String str2) {
            this.districts = list;
            this.address = address;
            this.templateData = inputItemData;
            this.fromPage = str;
            this.trackParams = str2;
        }

        public /* synthetic */ AddressEditDetailEnterParams(List list, Address address, InputItemData inputItemData, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : address, (i & 4) != 0 ? null : inputItemData, (i & 8) != 0 ? null : str, (i & 16) == 0 ? str2 : null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class AddressEditEnterParams implements Parcelable {

        @InterfaceC65349Pkn("address")
        public final Address address;

        @InterfaceC65349Pkn("best_voucher_type_ids")
        public final List<String> bestVoucherTypeIds;

        @InterfaceC65349Pkn("button_type")
        public final int buttonType;

        @InterfaceC65349Pkn("current_progress")
        public final Integer currentProgress;

        @InterfaceC65349Pkn("default_address")
        public final Address defaultAddress;

        @InterfaceC65349Pkn("districts")
        public final List<Region> districts;

        @InterfaceC65349Pkn("enable_change_items")
        public final String enableChangeItems;

        @InterfaceC65349Pkn("extra_info")
        public final String extraInfo;

        @InterfaceC65349Pkn("free_shipping")
        public final Boolean freeShipping;

        @InterfaceC65349Pkn("from")
        public final String fromPage;

        @InterfaceC65349Pkn("keep_alive")
        public final boolean keepAlive;

        @InterfaceC65349Pkn("pdp_from")
        public final String pdpFrom;

        @InterfaceC65349Pkn("promotion_request")
        public final List<AddressPromotionSku> promotionRequest;

        @InterfaceC65349Pkn("override_quit_message")
        public final String quitMessage;

        @InterfaceC65349Pkn("template_data")
        public final InputItemData templateData;

        @InterfaceC65349Pkn("total_progress")
        public final Integer totalProgress;

        @InterfaceC65349Pkn("trackParams")
        public final String trackParams;
        public static final C27007Aip Companion = new C27007Aip();
        public static final Parcelable.Creator<AddressEditEnterParams> CREATOR = new C27008Aiq();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            List<Region> list = this.districts;
            if (list == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
                while (LIZIZ.hasNext()) {
                    ((Region) LIZIZ.next()).writeToParcel(out, i);
                }
            }
            Address address = this.address;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i);
            }
            out.writeString(this.fromPage);
            out.writeString(this.trackParams);
            Integer num = this.currentProgress;
            if (num == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num);
            }
            Integer num2 = this.totalProgress;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num2);
            }
            InputItemData inputItemData = this.templateData;
            if (inputItemData == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                inputItemData.writeToParcel(out, i);
            }
            out.writeInt(this.keepAlive ? 1 : 0);
            out.writeInt(this.buttonType);
            out.writeString(this.quitMessage);
            out.writeString(this.pdpFrom);
            List<AddressPromotionSku> list2 = this.promotionRequest;
            if (list2 == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
                while (LIZIZ2.hasNext()) {
                    ((AddressPromotionSku) LIZIZ2.next()).writeToParcel(out, i);
                }
            }
            out.writeStringList(this.bestVoucherTypeIds);
            out.writeString(this.enableChangeItems);
            out.writeString(this.extraInfo);
            Boolean bool = this.freeShipping;
            if (bool == null) {
                out.writeInt(0);
            } else {
                C1FL.LJ(out, 1, bool);
            }
            Address address2 = this.defaultAddress;
            if (address2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address2.writeToParcel(out, i);
            }
        }

        public AddressEditEnterParams(List<Region> list, Address address, String fromPage, String str, Integer num, Integer num2, InputItemData inputItemData, boolean z, int i, String str2, String str3, List<AddressPromotionSku> list2, List<String> list3, String str4, String str5, Boolean bool, Address address2) {
            o.LJIIIZ(fromPage, "fromPage");
            this.districts = list;
            this.address = address;
            this.fromPage = fromPage;
            this.trackParams = str;
            this.currentProgress = num;
            this.totalProgress = num2;
            this.templateData = inputItemData;
            this.keepAlive = z;
            this.buttonType = i;
            this.quitMessage = str2;
            this.pdpFrom = str3;
            this.promotionRequest = list2;
            this.bestVoucherTypeIds = list3;
            this.enableChangeItems = str4;
            this.extraInfo = str5;
            this.freeShipping = bool;
            this.defaultAddress = address2;
        }

        public /* synthetic */ AddressEditEnterParams(List list, Address address, String str, String str2, Integer num, Integer num2, InputItemData inputItemData, boolean z, int i, String str3, String str4, List list2, List list3, String str5, String str6, Boolean bool, Address address2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : address, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : inputItemData, z, i, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : list2, (i2 & 4096) != 0 ? null : list3, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : str5, (i2 & 16384) != 0 ? null : str6, (32768 & i2) != 0 ? null : bool, (i2 & 65536) == 0 ? address2 : null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class AddressListEnterParams implements Parcelable {

        @InterfaceC65349Pkn("extra_info")
        public final String extraInfo;

        @InterfaceC65349Pkn("from_claim_incentive")
        public final boolean fromClaimIncentive;

        @InterfaceC65349Pkn("incentive_record_id")
        public final String incentiveRecordId;

        @InterfaceC65349Pkn("is_select_mode")
        public final boolean isSelectMode;

        @InterfaceC65349Pkn("mark_unavailable_address")
        public final Integer markUnavailableAddress;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public final Integer scene;

        @InterfaceC65349Pkn("scene_params_str")
        public final String sceneParamsStr;

        @InterfaceC65349Pkn("select_scene")
        public final Integer selectScene;

        @InterfaceC65349Pkn("trackParams")
        public final String trackParams;
        public static final C26751Aeh Companion = new C26751Aeh();
        public static final Parcelable.Creator<AddressListEnterParams> CREATOR = new C26756Aem();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AddressListEnterParams() {
            /*
                r13 = this;
                r1 = 0
                r2 = 0
                r11 = 1023(0x3ff, float:1.434E-42)
                r0 = r13
                r3 = r1
                r4 = r2
                r5 = r2
                r6 = r2
                r7 = r2
                r8 = r2
                r9 = r2
                r10 = r2
                r12 = r2
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter.AddressListEnterParams.<init>():void");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(this.isSelectMode ? 1 : 0);
            out.writeString(this.trackParams);
            out.writeInt(this.fromClaimIncentive ? 1 : 0);
            out.writeString(this.incentiveRecordId);
            out.writeString(this.productId);
            Integer num = this.markUnavailableAddress;
            if (num == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num);
            }
            Integer num2 = this.scene;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num2);
            }
            out.writeString(this.sceneParamsStr);
            Integer num3 = this.selectScene;
            if (num3 == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num3);
            }
            out.writeString(this.extraInfo);
        }

        public AddressListEnterParams(boolean z, String str, boolean z2, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, String str5) {
            this.isSelectMode = z;
            this.trackParams = str;
            this.fromClaimIncentive = z2;
            this.incentiveRecordId = str2;
            this.productId = str3;
            this.markUnavailableAddress = num;
            this.scene = num2;
            this.sceneParamsStr = str4;
            this.selectScene = num3;
            this.extraInfo = str5;
        }

        public /* synthetic */ AddressListEnterParams(boolean z, String str, boolean z2, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num3, (i & 512) == 0 ? str5 : null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class AddressEvent {
        public static final /* synthetic */ int LIZ = 0;

        @InterfaceC65349Pkn("address")
        public final ReachableAddress address;

        @InterfaceC65349Pkn("address_id")
        public final String addressId;

        @InterfaceC65349Pkn("type")
        public final int type;

        public AddressEvent(String addressId, int i, ReachableAddress reachableAddress) {
            o.LJIIIZ(addressId, "addressId");
            this.addressId = addressId;
            this.type = i;
            this.address = reachableAddress;
        }

        public /* synthetic */ AddressEvent(String str, int i, ReachableAddress reachableAddress, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? null : reachableAddress);
        }
    }

    public static void LIZJ(Context context, String str, String str2, String str3, String str4, Boolean bool, Integer num) {
        if (context != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str2 != null) {
                linkedHashMap.put("trackParams", str2);
            }
            linkedHashMap.put("is_select_mode", Boolean.TRUE);
            if (str4 != null) {
                linkedHashMap.put("product_id", str4);
                linkedHashMap.put("mark_unavailable_address", 1);
            }
            if (bool != null) {
                linkedHashMap.put("free_shipping", Boolean.valueOf(bool.booleanValue()));
            }
            if (num != null) {
                C61845OOz.LIZLLL(num, linkedHashMap, "select_scene");
            }
            if (str3 == null || str3.length() == 0) {
                str3 = "aweme://ec/address/list";
            }
            SmartRoute LIZIZ2 = C26867AgZ.LIZIZ(context, str3, linkedHashMap, false);
            if (str != null) {
                C79234V7u.LJJIL(LIZIZ2, str);
            }
            LIZIZ2.open();
        }
    }

    public static /* synthetic */ void LIZLLL(Context context, String str, String str2, String str3, String str4, Boolean bool, int i) {
        Boolean bool2 = bool;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        if ((i & 8) != 0) {
            str6 = null;
        }
        if ((i & 16) != 0) {
            str7 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        LIZJ(context, str, str6, str7, str5, bool2, null);
    }

    public static Object LIZIZ(Context context, InterfaceC71003Rtn interfaceC71003Rtn, String str, boolean z, String str2, String str3, InterfaceC67352kd interfaceC67352kd, int i) {
        String str4 = str2;
        boolean z2 = z;
        String str5 = str3;
        if ((i & 32) != 0) {
            z2 = false;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str5 = null;
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        LIZ = c84654XKg;
        LIZ(context, interfaceC71003Rtn, null, null, str, z2, str4, null, null, null, false, 0, null, str5, null, null, null, null, 196608);
        return c84654XKg.LIZ();
    }

    public static void LIZ(Context context, InterfaceC71003Rtn interfaceC71003Rtn, Address address, List list, String str, boolean z, String str2, Integer num, Integer num2, InputItemData inputItemData, boolean z2, int i, String str3, String str4, List list2, List list3, Boolean bool, Address address2, int i2) {
        Address address3 = address;
        List list4 = list;
        String str5 = str2;
        boolean z3 = z;
        Integer num3 = num2;
        Integer num4 = num;
        String str6 = str3;
        InputItemData inputItemData2 = inputItemData;
        Address address4 = address2;
        Boolean bool2 = bool;
        List list5 = list3;
        String str7 = str4;
        List list6 = list2;
        if ((i2 & 4) != 0) {
            address3 = null;
        }
        if ((i2 & 8) != 0) {
            list4 = null;
        }
        if ((i2 & 32) != 0) {
            z3 = false;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            num4 = null;
        }
        if ((i2 & 256) != 0) {
            num3 = null;
        }
        if ((i2 & 512) != 0) {
            inputItemData2 = null;
        }
        if ((i2 & 1024) != 0) {
            z2 = false;
        }
        if ((i2 & 2048) != 0) {
            i = 0;
        }
        if ((i2 & 4096) != 0) {
            str6 = null;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str7 = null;
        }
        if ((i2 & 16384) != 0) {
            list6 = null;
        }
        if ((32768 & i2) != 0) {
            list5 = null;
        }
        if ((65536 & i2) != 0) {
            bool2 = null;
        }
        if ((i2 & 131072) != 0) {
            address4 = null;
        }
        if (context != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (address3 != null) {
                linkedHashMap.put("address", address3);
            }
            if (list4 != null) {
                linkedHashMap.put("districts", list4);
            }
            if (str5 != null) {
                linkedHashMap.put("trackParams", str5);
            }
            linkedHashMap.put("from", str);
            if (num4 != null) {
                num4.intValue();
                linkedHashMap.put("current_progress", num4);
            }
            if (num3 != null) {
                num3.intValue();
                linkedHashMap.put("total_progress", num3);
            }
            if (inputItemData2 != null) {
                linkedHashMap.put("template_data", inputItemData2);
            }
            if (str7 != null) {
                linkedHashMap.put("pdp_from", str7);
            }
            if (list6 != null) {
                linkedHashMap.put("promotion_request", list6);
            }
            if (list5 != null) {
                linkedHashMap.put("best_voucher_type_ids", list5);
            }
            if (bool2 != null) {
                bool2.booleanValue();
                linkedHashMap.put("free_shipping", bool2);
            }
            linkedHashMap.put("keep_alive", Boolean.valueOf(z2));
            linkedHashMap.put("button_type", Integer.valueOf(i));
            if (address4 != null) {
                linkedHashMap.put("default_address", address4);
            }
            if (str6 == null || str6.length() == 0) {
                str6 = "aweme://ec/address/edit";
            }
            SmartRoute LIZIZ2 = C26867AgZ.LIZIZ(context, str6, linkedHashMap, z3);
            if (interfaceC71003Rtn != null) {
                C79234V7u.LJJIJIIJIL(LIZIZ2, interfaceC71003Rtn, null);
            }
            LIZIZ2.open();
        }
    }
}
