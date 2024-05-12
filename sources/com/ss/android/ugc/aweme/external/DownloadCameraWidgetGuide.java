package com.ss.android.ugc.aweme.external;

import X.C0RN;
import X.C39579Fg7;
import X.C84261X5d;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FUR;
import X.FUS;
import android.content.Context;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DownloadCameraWidgetGuide implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "DownloadCameraWidgetGuide";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
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
        return EFK.IDLE;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (!e1.LIZ(31744, "studio_creation_enable_camera_widget_guide", true, false) || C39579Fg7.LIZIZ(FUR.LIZ())) {
            return;
        }
        DownloadTask with = C84261X5d.with(context);
        with.url("https://p16.tiktokcdn.com/obj/musically-maliva-obj/camera_widget_guide.png");
        with.name("now_widget_guide.png");
        with.savePath(FUR.LIZ);
        with.force(true);
        with.subThreadListener(new FUS());
        with.download();
    }
}
