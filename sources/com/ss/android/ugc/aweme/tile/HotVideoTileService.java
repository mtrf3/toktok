package com.ss.android.ugc.aweme.tile;

import X.C10K;
import X.C16880lQ;
import X.C169696lJ;
import X.C188727au;
import X.C35532Dx2;
import X.C38413F5t;
import X.C56662Kg;
import X.C66163Pxv;
import X.C84763XOl;
import X.C86313Xu9;
import X.C86315XuB;
import X.EF7;
import X.FMX;
import X.PEH;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class HotVideoTileService extends TileService {
    public volatile boolean LJLIL;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public final void LIZ() {
        Tile qsTile = getQsTile();
        if (qsTile == null) {
            return;
        }
        qsTile.setState(1);
        qsTile.setLabel(getString(R.string.ed2));
        qsTile.updateTile();
    }

    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        Class<? extends Activity> LJIIZILJ;
        super.onClick();
        IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
        if (LIZ == null || (LJIIZILJ = LIZ.LJIIZILJ()) == null) {
            return;
        }
        if (!C84763XOl.LJIIJJI) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(this, LJIIZILJ);
            intent.putExtra("from_tile_service", true);
            intent.addFlags(268435456);
            startActivityAndCollapse(intent);
            return;
        }
        int i = EF7.LJIIIZ;
        if (i <= 0) {
            i = 1233;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setClass(this, LJIIZILJ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("snssdk");
        LIZ2.append(i);
        LIZ2.append("://feed?tab=1");
        intent2.setData(UriProtector.parse(X1D.LIZIZ(LIZ2)));
        try {
            intent2.addFlags(268435456);
            intent2.putExtra("from_tile_service", true);
            startActivityAndCollapse(intent2);
            this.LJLIL = false;
            C84763XOl.LIZLLL().LJJJJZI(new C86315XuB(this));
            C10K.LJII(2500L).LJI(new C86313Xu9(this), C10K.LJIIIIZZ, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            PEH.LIZJ(e);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("features", "watch_video");
        FMX.LJIIL("click_notificationbar", c188727au.LIZ);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis() - C56662Kg.LIZ().LJIILIIL;
        if (uptimeMillis <= 1000) {
            C188727au LJ = C169696lJ.LJ(uptimeMillis, "time");
            LJ.LJIIIZ("features", "watch_video");
            FMX.LJIIL("active_in_notificationbar", LJ.LIZ);
        }
        LIZ();
    }

    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        super.onStartListening();
        LIZ();
    }

    @Override // android.service.quicksettings.TileService
    public final void onTileAdded() {
        super.onTileAdded();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("features", "watch_video");
        FMX.LJIIL("add_to_notificationbar", c188727au.LIZ);
    }

    @Override // android.service.quicksettings.TileService
    public final void onTileRemoved() {
        super.onTileRemoved();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("features", "watch_video");
        FMX.LJIIL("delete_from_notificationbar", c188727au.LIZ);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
