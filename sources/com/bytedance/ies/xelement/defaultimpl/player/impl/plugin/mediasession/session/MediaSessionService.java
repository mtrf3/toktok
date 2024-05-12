package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session;

import X.BinderC40677Fxp;
import X.C09R;
import X.C10760bY;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class MediaSessionService extends MediaBrowserServiceCompat {
    @Override // androidx.media.MediaBrowserServiceCompat
    public final void LIZ(String clientPackageName) {
        o.LJIIJ(clientPackageName, "clientPackageName");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public final IBinder onBind(Intent intent) {
        return new BinderC40677Fxp(this);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void LIZIZ(String parentId, C09R<List<MediaBrowserCompat.MediaItem>> c09r) {
        o.LJIIJ(parentId, "parentId");
        c09r.LIZJ();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        Intent intent2 = new Intent("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST");
        intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
        C10760bY.LIZ(this).LIZJ(intent2);
        return super.onStartCommand(intent, i, i2);
    }
}
