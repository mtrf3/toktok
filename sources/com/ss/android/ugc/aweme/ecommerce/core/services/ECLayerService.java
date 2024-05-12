package com.ss.android.ugc.aweme.ecommerce.core.services;

import X.C162476Zf;
import X.C223338pd;
import X.C28289B8j;
import X.C37942Euo;
import X.C38236EzY;
import X.C40342FsQ;
import X.C40343FsR;
import X.C58642Rw;
import X.C61005Nwv;
import X.O6G;
import X.O6J;
import X.O6M;
import X.O6N;
import X.O6O;
import X.O6Q;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.SettingDataList;
import com.ss.android.ugc.aweme.ecommerce.core.ab.SettingModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IECLayerService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ECLayerService implements IECLayerService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECLayerService
    public final void LIZ(O6N ecLayerShowType, Object obj, String str) {
        SparkContext sparkContext;
        C37942Euo c37942Euo;
        C37942Euo c37942Euo2;
        o.LJIIIZ(ecLayerShowType, "ecLayerShowType");
        int i = O6M.LIZ[ecLayerShowType.ordinal()];
        String str2 = "";
        if (i != 1) {
            if (i == 2) {
                SettingsManager LIZLLL = SettingsManager.LIZLLL();
                SettingDataList settingDataList = C58642Rw.LIZ;
                SettingDataList settingDataList2 = (SettingDataList) LIZLLL.LJIIIIZZ("ecom_layer_settings_config", SettingDataList.class, settingDataList);
                if (settingDataList2 != null) {
                    settingDataList = settingDataList2;
                }
                List<SettingModel> list = settingDataList.list;
                if (list != null) {
                    boolean z = false;
                    for (SettingModel settingModel : list) {
                        if (o.LJ(settingModel.scene, null) && o.LJ(settingModel.show, Boolean.TRUE)) {
                            str = settingModel.schema;
                            if (str == null) {
                                str = "";
                            }
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new C162476Zf();
            }
        }
        if (obj instanceof ViewGroup) {
            ViewGroup root = (ViewGroup) obj;
            O6G o6g = new O6G();
            if (str != null) {
                str2 = str;
            }
            o.LJIIIZ(root, "root");
            o6g.LIZ = null;
            o6g.LIZIZ = null;
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            Context context = root.getContext();
            o.LJIIIIZZ(context, "root.context");
            SparkContext sparkContext2 = new SparkContext();
            sparkContext2.LJJIJLIJ(str2);
            sparkContext2.LJJ(new C61005Nwv(root.getHeight(), new AqS157S0200000_10(root, o6g, 55), new AqS141S0200000_10(root, o6g, 85)));
            c40342FsQ.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext2));
            LIZ.setBackgroundColor(0);
            o6g.LIZ = LIZ;
            SparkContext sparkContext3 = LIZ.getSparkContext();
            if (sparkContext3 != null && (c37942Euo2 = (C37942Euo) sparkContext3.LIZIZ(C37942Euo.class)) != null) {
                C38236EzY c38236EzY = new C38236EzY();
                c38236EzY.LIZ = "ec_layer_dismiss";
                c38236EzY.LIZLLL = new O6J(root, o6g);
                c37942Euo2.LJIILJJIL(c38236EzY);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = o6g.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null && (c37942Euo = (C37942Euo) sparkContext.LIZIZ(C37942Euo.class)) != null) {
                C38236EzY c38236EzY2 = new C38236EzY();
                c38236EzY2.LIZ = "ec_layer_ready";
                c38236EzY2.LIZLLL = new O6O();
                c37942Euo.LJIILJJIL(c38236EzY2);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = o6g.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.setTag("eclayer_tag");
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = o6g.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                EventCenter.LJ().LIZJ("ec_layer_on_back", new O6Q(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3, root));
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = o6g.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.LIZIZ();
            }
            View LIZ2 = C28289B8j.LIZ(root, R.layout.yw, root, false);
            ((C223338pd) LIZ2.findViewById(R.id.ci0)).LIZIZ();
            root.addView(LIZ2);
            o6g.LIZIZ = LIZ2;
        }
    }
}
