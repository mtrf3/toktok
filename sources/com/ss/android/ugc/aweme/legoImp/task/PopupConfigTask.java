package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C38995FSd;
import X.C44384HbQ;
import X.C53228Kum;
import X.C55639LsZ;
import X.C55640Lsa;
import X.C55645Lsf;
import X.C55646Lsg;
import X.C55652Lsm;
import X.C55742LuE;
import X.C55743LuF;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.ttmock.TTMock;
import com.bytedance.ttmock.data.PopupMock;
import com.bytedance.ttmock.data.PopupMockConfig;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class PopupConfigTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PopupConfigTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        PopupMockConfig popupMockConfig;
        C55652Lsm c55652Lsm = new C55652Lsm("PopupConfigTask");
        JSONObject jSONObject = new JSONObject();
        PopupMock popupMock = (PopupMock) TTMock.INSTANCE.getMockDelegate(PopupMock.class);
        if (popupMock != null && (popupMockConfig = (PopupMockConfig) popupMock.get()) != null) {
            jSONObject.put("force_stop", popupMockConfig.getForceStop());
            jSONObject.put("allow_list", new JSONArray((Collection) popupMockConfig.getAllowList()));
        }
        FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
        boolean z = true;
        if (!((Boolean) C53228Kum.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        jSONObject.put("popup_memory_leak_experiment", z);
        Context LIZIZ = EF7.LIZIZ();
        C55742LuE c55742LuE = new C55742LuE();
        c55742LuE.LIZ = C55645Lsf.LJLIL;
        c55742LuE.LIZJ = C55646Lsg.LJLIL;
        c55742LuE.LJFF = new C55640Lsa(c55652Lsm, LJJIJLIJ);
        c55742LuE.LJ = jSONObject;
        ExecutorService LIZJ = C38995FSd.LIZJ();
        o.LJIIIIZZ(LIZJ, "getDefaultExecutor()");
        c55742LuE.LJI = LIZJ;
        C55743LuF c55743LuF = new C55743LuF(c55742LuE);
        C44384HbQ.LLFZ("=== popup manager init ====");
        PopupManager.LIZIZ = System.currentTimeMillis();
        new WeakReference(C16880lQ.LLLLL(LIZIZ));
        PopupManager.LJII = c55743LuF;
        PopupManager popupManager = PopupManager.LIZ;
        C55639LsZ c55639LsZ = new C55639LsZ();
        synchronized (popupManager) {
            PopupManager.LJIIIIZZ.add(c55639LsZ);
        }
    }
}
