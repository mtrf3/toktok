package com.lingo.caption;

import X.ACL;
import X.ACZ;
import X.AD1;
import X.C25836ACa;
import X.C61144NzA;
import X.C61145NzB;
import X.C61146NzC;
import X.C61150NzG;
import X.C61520OCm;
import X.C79081V1x;
import X.EnumC61143Nz9;
import X.InterfaceC61155NzL;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lingo.caption.api.LingoCaptionApi;
import com.ss.android.elearning.lingo.gecko.GeckoAPI;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LingoCaptionImpl implements LingoCaptionApi {
    @Override // com.lingo.caption.api.LingoCaptionApi
    public final void LIZ(String materialId) {
        o.LJIIIZ(materialId, "materialId");
        C61520OCm LIZIZ = GeckoAPI.LIZ.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        Object accessKey = ListProtector.get(LIZIZ.LIZ.LJ, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CheckRequestBodyModel.TargetChannel("tiktok_lingo_dictionary_panel"));
        o.LJIIIIZZ(accessKey, "accessKey");
        hashMap.put(accessKey, arrayList);
        C61144NzA c61144NzA = new C61144NzA(materialId);
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setLazyUpdate(false);
        optionCheckUpdateParams.setListener(c61144NzA);
        LIZIZ.LIZ(null, hashMap, optionCheckUpdateParams);
    }

    @Override // com.lingo.caption.api.LingoCaptionApi
    public final void LIZIZ(String str) {
        InterfaceC61155NzL LIZ = C61146NzC.LIZIZ.LIZ.LIZ(str);
        if (LIZ != null) {
            LIZ.Yi();
        }
    }

    @Override // com.lingo.caption.api.LingoCaptionApi
    public final View LIZJ(Context context, final Lifecycle lifecycle, C61150NzG c61150NzG, ACL acl, ACZ acz, C25836ACa initData, AD1 debugInfo) {
        o.LJIIIZ(initData, "initData");
        o.LJIIIZ(debugInfo, "debugInfo");
        final String materialId = c61150NzG.LJLIL;
        o.LJIIIZ(materialId, "materialId");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C79081V1x.LJJIII(EnumC61143Nz9.STEP_START, materialId, false, 0L, null, null, null, null, 508);
        lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.lingo.caption.TrackerKt$logDevLingoCaptionStartAndExit$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                Lifecycle.this.removeObserver(this);
                C79081V1x.LJJIII(EnumC61143Nz9.STEP_EXIT, materialId, false, SystemClock.elapsedRealtime() - elapsedRealtime, null, null, null, null, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
            }
        });
        C61145NzB c61145NzB = new C61145NzB(context, lifecycle, c61150NzG.LJLIL);
        C61146NzC.LIZIZ.LJFF(c61145NzB, c61150NzG, acl, acz, initData, debugInfo);
        return c61145NzB.LIZIZ();
    }
}
