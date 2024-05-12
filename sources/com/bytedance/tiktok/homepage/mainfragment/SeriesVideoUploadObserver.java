package com.bytedance.tiktok.homepage.mainfragment;

import X.ActivityC45651qj;
import X.C09G;
import X.C118684lE;
import X.C221108m2;
import X.C62822Ol8;
import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public final class SeriesVideoUploadObserver implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final Activity LJLIL;
    public final IAVPublishService LJLILLLLZI = AVExternalServiceImpl.LIZ().publishService();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C118684lE.LJLIL);

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public SeriesVideoUploadObserver(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        owner.getLifecycle().addObserver(this);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        EventBus.LIZJ().LJIJ(this);
        owner.getLifecycle().removeObserver(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:6:0x0013, B:8:0x001e, B:10:0x0022, B:13:0x0037, B:15:0x003d, B:17:0x0043, B:19:0x004c, B:21:0x005a, B:22:0x005c, B:24:0x0065, B:26:0x0069, B:29:0x0073, B:31:0x0077, B:32:0x0079, B:34:0x0082, B:36:0x0086, B:38:0x008d), top: B:5:0x0013 }] */
    @X.QD3(sticky = true)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPublishStatusUpdate(X.C43694HCw r12) {
        /*
            r11 = this;
            java.lang.String r3 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel"
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            int r1 = r12.LJLIL
            r0 = 10
            if (r1 != r0) goto L99
            java.lang.Object r2 = r12.LJLJI
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
            if (r0 == 0) goto L99
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme"
            kotlin.jvm.internal.o.LJII(r2, r0)     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2     // Catch: java.lang.Exception -> L99
            boolean r0 = r2.isPaidContent     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L99
            android.app.Activity r1 = r11.LJLIL     // Catch: java.lang.Exception -> L99
            if (r1 == 0) goto L99
            X.Ol8 r0 = r11.LJLJI     // Catch: java.lang.Exception -> L99
            java.lang.Object r5 = r0.getValue()     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = "<get-seriesUploadService>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.service.ISeriesVideoUploadService r5 = (com.ss.android.ugc.aweme.service.ISeriesVideoUploadService) r5     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.feed.model.Video r0 = r2.getVideo()     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = ""
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCover()     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L4b
            java.util.List r0 = r0.getUrlList()     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L4b
            java.lang.Object r6 = X.ORZ.LJLLLL(r0)     // Catch: java.lang.Exception -> L99
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L99
            if (r6 != 0) goto L4c
        L4b:
            r6 = r4
        L4c:
            android.content.Context r10 = X.C16880lQ.LLLLJ(r1)     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = "it.applicationContext"
            kotlin.jvm.internal.o.LJIIIIZZ(r10, r0)     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r12.LJLLILLLL     // Catch: java.lang.Exception -> L99
            r1 = 0
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r0 = r0.editModel     // Catch: java.lang.Exception -> L99
        L5c:
            kotlin.jvm.internal.o.LJII(r0, r3)     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel r0 = r0.paidContentModel     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L72
            java.lang.String r7 = r0.getCollectionId()     // Catch: java.lang.Exception -> L99
            if (r7 != 0) goto L73
            goto L72
        L70:
            r0 = r1
            goto L5c
        L72:
            r7 = r4
        L73:
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r12.LJLLILLLL     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r1 = r0.editModel     // Catch: java.lang.Exception -> L99
        L79:
            kotlin.jvm.internal.o.LJII(r1, r3)     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r1     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r1.creativeModel     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L8c
            com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel r0 = r0.paidContentModel     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L8c
            java.lang.String r8 = r0.getEntryPoint()     // Catch: java.lang.Exception -> L99
            if (r8 != 0) goto L8d
        L8c:
            r8 = r4
        L8d:
            java.lang.String r9 = r2.getAid()     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = "createAweme.aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)     // Catch: java.lang.Exception -> L99
            r5.LIZ(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L99
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainfragment.SeriesVideoUploadObserver.onPublishStatusUpdate(X.HCw):void");
    }
}
