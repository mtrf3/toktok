package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;

/* renamed from: X.Aip, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27007Aip {
    public static AddressPageStarter.AddressEditEnterParams LIZ(Intent intent) {
        Address address;
        Integer num;
        Integer num2;
        boolean z;
        int i;
        List list;
        InputItemData inputItemData;
        List list2;
        List list3;
        Bundle LLJJIJI;
        Address address2;
        Object LLJJIII;
        Object obj;
        String str;
        Object LLJJIII2;
        Object obj2;
        String str2;
        Object LLJJIII3;
        Object obj3;
        String str3;
        Object LLJJIII4;
        Object obj4;
        String str4;
        Object LLJJIII5;
        Object obj5;
        String str5;
        Integer LJJIL;
        Object LLJJIII6;
        Object obj6;
        String str6;
        if (intent != null) {
            Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI2 != null && (LLJJIII6 = C16880lQ.LLJJIII(LLJJIJI2, "address")) != null) {
                if (!(LLJJIII6 instanceof Address)) {
                    obj6 = null;
                } else {
                    obj6 = LLJJIII6;
                }
                address = (Address) obj6;
                if (address == null) {
                    if (LLJJIII6 instanceof String) {
                        str6 = (String) LLJJIII6;
                    } else {
                        str6 = null;
                    }
                    try {
                        Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str6, C65330PkU.LIZJ(C65352Pkq.LIZLLL(Address.class)));
                        if (!(fromJson instanceof Address)) {
                            fromJson = null;
                        }
                        address = (Address) fromJson;
                    } catch (s unused) {
                        address = null;
                    }
                }
            } else {
                address = null;
            }
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "current_progress");
            if (LLJJIJIIJIL != null) {
                num = C38350F3i.LJJIL(LLJJIJIIJIL);
            } else {
                num = null;
            }
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "total_progress");
            if (LLJJIJIIJIL2 != null) {
                num2 = C38350F3i.LJJIL(LLJJIJIIJIL2);
            } else {
                num2 = null;
            }
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "keep_alive");
            if (LLJJIJIIJIL3 != null && Boolean.parseBoolean(LLJJIJIIJIL3)) {
                z = true;
            } else {
                z = false;
            }
            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "button_type");
            if (LLJJIJIIJIL4 != null && (LJJIL = C38350F3i.LJJIL(LLJJIJIIJIL4)) != null) {
                i = LJJIL.intValue();
            } else {
                i = 0;
            }
            Bundle LLJJIJI3 = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI3 != null && (LLJJIII5 = C16880lQ.LLJJIII(LLJJIJI3, "districts")) != null) {
                if (!(LLJJIII5 instanceof List)) {
                    obj5 = null;
                } else {
                    obj5 = LLJJIII5;
                }
                list = (List) obj5;
                if (list == null) {
                    if (LLJJIII5 instanceof String) {
                        str5 = (String) LLJJIII5;
                    } else {
                        str5 = null;
                    }
                    try {
                        Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str5, C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(Region.class)))));
                        if (!(fromJson2 instanceof List)) {
                            fromJson2 = null;
                        }
                        list = (List) fromJson2;
                    } catch (s unused2) {
                        list = null;
                    }
                }
            } else {
                list = null;
            }
            Bundle LLJJIJI4 = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI4 != null && (LLJJIII4 = C16880lQ.LLJJIII(LLJJIJI4, "template_data")) != null) {
                if (!(LLJJIII4 instanceof InputItemData)) {
                    obj4 = null;
                } else {
                    obj4 = LLJJIII4;
                }
                inputItemData = (InputItemData) obj4;
                if (inputItemData == null) {
                    if (LLJJIII4 instanceof String) {
                        str4 = (String) LLJJIII4;
                    } else {
                        str4 = null;
                    }
                    try {
                        Object fromJson3 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str4, C65330PkU.LIZJ(C65352Pkq.LIZLLL(InputItemData.class)));
                        if (!(fromJson3 instanceof InputItemData)) {
                            fromJson3 = null;
                        }
                        inputItemData = (InputItemData) fromJson3;
                    } catch (s unused3) {
                        inputItemData = null;
                    }
                }
            } else {
                inputItemData = null;
            }
            String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(intent, "from");
            if (LLJJIJIIJIL5 == null) {
                LLJJIJIIJIL5 = "";
            }
            String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(intent, "trackParams");
            String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(intent, "override_quit_message");
            String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(intent, "pdp_from");
            Bundle LLJJIJI5 = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI5 != null && (LLJJIII3 = C16880lQ.LLJJIII(LLJJIJI5, "promotion_request")) != null) {
                if (!(LLJJIII3 instanceof List)) {
                    obj3 = null;
                } else {
                    obj3 = LLJJIII3;
                }
                list2 = (List) obj3;
                if (list2 == null) {
                    if (LLJJIII3 instanceof String) {
                        str3 = (String) LLJJIII3;
                    } else {
                        str3 = null;
                    }
                    try {
                        Object fromJson4 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str3, C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(AddressPromotionSku.class)))));
                        if (!(fromJson4 instanceof List)) {
                            fromJson4 = null;
                        }
                        list2 = (List) fromJson4;
                    } catch (s unused4) {
                        list2 = null;
                    }
                }
            } else {
                list2 = null;
            }
            Bundle LLJJIJI6 = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI6 != null && (LLJJIII2 = C16880lQ.LLJJIII(LLJJIJI6, "best_voucher_type_ids")) != null) {
                if (!(LLJJIII2 instanceof List)) {
                    obj2 = null;
                } else {
                    obj2 = LLJJIII2;
                }
                list3 = (List) obj2;
                if (list3 == null) {
                    if (LLJJIII2 instanceof String) {
                        str2 = (String) LLJJIII2;
                    } else {
                        str2 = null;
                    }
                    try {
                        Object fromJson5 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str2, C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)))));
                        if (!(fromJson5 instanceof List)) {
                            fromJson5 = null;
                        }
                        list3 = (List) fromJson5;
                    } catch (s unused5) {
                    }
                }
                String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(intent, "enable_change_items");
                String LLJJIJIIJIL10 = C16880lQ.LLJJIJIIJIL(intent, "extra_info");
                boolean booleanExtra = intent.getBooleanExtra("free_shipping", false);
                LLJJIJI = C16880lQ.LLJJIJI(intent);
                if (LLJJIJI == null && (LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "default_address")) != null) {
                    if (!(LLJJIII instanceof Address)) {
                        obj = null;
                    } else {
                        obj = LLJJIII;
                    }
                    address2 = (Address) obj;
                    if (address2 == null) {
                        if (LLJJIII instanceof String) {
                            str = (String) LLJJIII;
                        } else {
                            str = null;
                        }
                        try {
                            Object fromJson6 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LIZLLL(Address.class)));
                            if (!(fromJson6 instanceof Address)) {
                                fromJson6 = null;
                            }
                            address2 = (Address) fromJson6;
                        } catch (s unused6) {
                            address2 = null;
                        }
                    }
                } else {
                    address2 = null;
                }
                return new AddressPageStarter.AddressEditEnterParams(list, address, LLJJIJIIJIL5, LLJJIJIIJIL6, num, num2, inputItemData, z, i, LLJJIJIIJIL7, LLJJIJIIJIL8, list2, list3, LLJJIJIIJIL9, LLJJIJIIJIL10, Boolean.valueOf(booleanExtra), address2);
            }
            list3 = null;
            String LLJJIJIIJIL92 = C16880lQ.LLJJIJIIJIL(intent, "enable_change_items");
            String LLJJIJIIJIL102 = C16880lQ.LLJJIJIIJIL(intent, "extra_info");
            boolean booleanExtra2 = intent.getBooleanExtra("free_shipping", false);
            LLJJIJI = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI == null) {
            }
            address2 = null;
            return new AddressPageStarter.AddressEditEnterParams(list, address, LLJJIJIIJIL5, LLJJIJIIJIL6, num, num2, inputItemData, z, i, LLJJIJIIJIL7, LLJJIJIIJIL8, list2, list3, LLJJIJIIJIL92, LLJJIJIIJIL102, Boolean.valueOf(booleanExtra2), address2);
        }
        return null;
    }
}
