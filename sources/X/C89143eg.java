package X;

import Y.IDComparatorS29S0000000_1;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.account.login.model.PhoneCountryCodeResponse;
import com.ss.android.ugc.aweme.account.login.model.PhoneCountryData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3eg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89143eg {
    public static void LIZ(Context context) {
        PhoneCountryCodeResponse phoneCountryCodeResponse;
        o.LJIIIZ(context, "context");
        try {
            SettingsManager.LIZLLL().getClass();
            if (((HashMap) SettingsManager.LJII("choose_phone_country_list", HashMap.class)) != null) {
                try {
                    if (C75222xK.LIZ.isEmpty()) {
                        SettingsManager.LIZLLL().getClass();
                        HashMap hashMap = (HashMap) SettingsManager.LJII("choose_phone_country_list", HashMap.class);
                        if (hashMap != null) {
                            for (String key : hashMap.keySet()) {
                                List list = (List) hashMap.get(key);
                                if (list != null) {
                                    Gson gson = C75222xK.LIZIZ;
                                    List<PhoneCountryData> code = (List) gson.LJII(gson.LJIILL(list), new TypeToken<List<? extends PhoneCountryData>>() { // from class: X.2wd
                                    }.getType());
                                    HashMap<String, List<PhoneCountryData>> hashMap2 = C75222xK.LIZ;
                                    o.LJIIIIZZ(key, "key");
                                    o.LJIIIIZZ(code, "code");
                                    hashMap2.put(key, code);
                                }
                            }
                        }
                    }
                    phoneCountryCodeResponse = new PhoneCountryCodeResponse(C75222xK.LIZ);
                } catch (Throwable unused) {
                    phoneCountryCodeResponse = new PhoneCountryCodeResponse(C75222xK.LIZ);
                }
                HashMap<String, List<PhoneCountryData>> map = phoneCountryCodeResponse.getMap();
                ArrayList arrayList = new ArrayList();
                if (map != null && !map.isEmpty()) {
                    for (String key2 : map.keySet()) {
                        List<PhoneCountryData> list2 = map.get(key2);
                        if (list2 != null && !list2.isEmpty()) {
                            for (PhoneCountryData phoneCountryData : list2) {
                                if (phoneCountryData.getDisplayname() != null && phoneCountryData.getKey() != null && (!TextUtils.isEmpty(phoneCountryData.getDisplayname()) || !TextUtils.isEmpty(phoneCountryData.getKey()))) {
                                    o.LJIIIIZZ(key2, "key");
                                    LinkedHashMap linkedHashMap = (LinkedHashMap) C89153eh.LIZ;
                                    if (linkedHashMap.get(phoneCountryData.getKey()) != null) {
                                        Integer num = (Integer) linkedHashMap.get(phoneCountryData.getKey());
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append('+');
                                        LIZ.append(phoneCountryData.getCode());
                                        String LIZIZ = X1D.LIZIZ(LIZ);
                                        String displayname = phoneCountryData.getDisplayname();
                                        if (displayname == null) {
                                            displayname = "";
                                        }
                                        if (num != null) {
                                            int intValue = num.intValue();
                                            String en = phoneCountryData.getEn();
                                            o.LJIIIZ(en, "en");
                                            arrayList.add(new C86804Y4y(intValue, String.valueOf(Character.toUpperCase(C40689Fy1.LLFII(en))), key2, LIZIZ, displayname));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 1) {
                        C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS29S0000000_1(11));
                    }
                }
                AbstractC65590Pog<C86804Y4y> copyOf = AbstractC65590Pog.copyOf((Collection) arrayList);
                o.LJIIIIZZ(copyOf, "copyOf(PhoneCountryCodeU…tting.get().map,context))");
                C86804Y4y.LJLJL = copyOf;
            }
        } catch (Throwable unused2) {
        }
    }
}
