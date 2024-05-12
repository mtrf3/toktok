package X;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.SelfDataManager;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Pls, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65416Pls {
    public static void LIZ() {
        boolean z;
        String str;
        g gVar = (g) SettingsManager.LIZLLL().LJIIIIZZ("safe_cushion_config", g.class, null);
        C65415Plr.LIZJ = true;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("enable_safe_air_cushion", false) || Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("air_cushion_crash_guard", false)) {
            z = true;
        } else {
            z = false;
        }
        C65415Plr.LIZ = z;
        C65415Plr.LIZLLL = 2;
        KevaImpl.getRepo("safe_protector_config_repo", 1).storeBoolean("safe_protector_enable_key", C65415Plr.LIZ);
        C65415Plr.LJ = new C65418Plu();
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("air_cushion_crash_guard", false)) {
            Reflect on = Reflect.on((Class<?>) C64254PJq.class);
            Boolean bool = Boolean.TRUE;
            on.set("sExceptionNoLimit", bool);
            if (gVar == null) {
                gVar = new g();
            }
            g gVar2 = new g();
            m mVar = new m();
            mVar.LJJIIZ("stackFeatures", "org.json.JSONException: No value for test");
            EnumC65856Psy enumC65856Psy = EnumC65856Psy.JSON;
            mVar.LJJIIZ("protectorType", enumC65856Psy.getName());
            mVar.LJJIIZ("returnType", "boolean");
            mVar.LJJIII(bool, "returnValue");
            gVar2.LJJII(mVar);
            m mVar2 = new m();
            mVar2.LJJIIZ("stackFeatures", "org.json.JSONException: Index 1 out of range [0..1)");
            mVar2.LJJIIZ("protectorType", enumC65856Psy.getName());
            mVar2.LJJIIZ("returnType", "boolean");
            mVar2.LJJIII(bool, "returnValue");
            gVar2.LJJII(mVar2);
            m mVar3 = new m();
            mVar3.LJJIIZ("stackFeatures", "java.lang.NumberFormatException");
            mVar3.LJJIIZ("protectorType", EnumC65856Psy.CAST_NUMBER.getName());
            mVar3.LJJIIZ("returnType", "long");
            mVar3.LJJIIJ("returnValue", 5);
            gVar2.LJJII(mVar3);
            if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("air_cushion_unprotect", false)) {
                m mVar4 = new m();
                mVar4.LJJIIZ("stackFeatures", "java.lang.UnsupportedOperationException: This isn't a hierarchical URI");
                EnumC65856Psy enumC65856Psy2 = EnumC65856Psy.URI;
                mVar4.LJJIIZ("protectorType", enumC65856Psy2.getName());
                mVar4.LJJIIZ("returnType", "string");
                mVar4.LJJIIZ("returnValue", "Skip");
                gVar2.LJJII(mVar4);
                m mVar5 = new m();
                mVar5.LJJIIZ("stackFeatures", "java.lang.NullPointerException: uriString\nandroid.net.Uri$StringUri.<init>");
                mVar5.LJJIIZ("protectorType", enumC65856Psy2.getName());
                mVar5.LJJIIZ("returnType", "string");
                mVar5.LJJIIZ("returnValue", "non-null");
                gVar2.LJJII(mVar5);
            }
            ((ArrayList) gVar.LJLIL).addAll(gVar2.LJLIL);
        }
        C65415Plr.LIZJ(gVar);
        Npth.addAttachUserData(new AttachUserData() { // from class: X.Plt
            @Override // com.bytedance.crash.AttachUserData
            public final java.util.Map getUserData(CrashType crashType) {
                HashMap hashMap = new HashMap();
                hashMap.put("Protector/SelfData", SelfDataManager.LJ.LIZJ(null).toString());
                return hashMap;
            }
        }, CrashType.ALL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SafeCushionSettings: ");
        if (gVar != null) {
            str = gVar.toString();
        } else {
            str = "null";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }
}
