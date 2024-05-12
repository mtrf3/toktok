package com.ss.android.ugc.aweme.livewallpaper;

import X.C16880lQ;
import X.C31137CJx;
import X.C35532Dx2;
import X.C38413F5t;
import X.C39579Fg7;
import X.C59895Nf1;
import X.C62016OVo;
import X.C66163Pxv;
import X.C84763XOl;
import X.CN5;
import X.EF7;
import X.HandlerC28763BQp;
import X.InterfaceC28728BPg;
import X.OWG;
import X.OWH;
import X.OWI;
import X.X1D;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.service.wallpaper.WallpaperService;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AmeLiveWallpaper extends WallpaperService implements OWG {
    public LiveWallPaperBean LJLIL;
    public ContentResolver LJLJI;
    public InterfaceC28728BPg LJLJJI;
    public final ArrayList<OWH> LJLILLLLZI = new ArrayList<>();
    public final HandlerC28763BQp LJLJJL = new HandlerC28763BQp(this);
    public final SimpleDateFormat LJLJJLL = new SimpleDateFormat("yyyy-MM-dd");

    public final void LIZ() {
        ContentResolver contentResolver;
        InterfaceC28728BPg interfaceC28728BPg;
        if (this.LJLJJI == null) {
            this.LJLJJI = (InterfaceC28728BPg) CN5.LIZ(EF7.LIZIZ(), InterfaceC28728BPg.class);
        }
        ContentResolver contentResolver2 = this.LJLJI;
        if (contentResolver2 != null) {
            this.LJLIL = C31137CJx.LIZIZ(contentResolver2.getType(WallPaperDataProvider.LJLJJI));
        }
        if (this.LJLIL == null) {
            this.LJLIL = LiveWallPaperBean.buildEmptyBean();
        }
        try {
            if (TextUtils.isEmpty(this.LJLIL.getVideoPath()) && (interfaceC28728BPg = this.LJLJJI) != null) {
                this.LJLIL.setVideoPath(interfaceC28728BPg.LIZJ());
            }
            if (!C39579Fg7.LIZIZ(this.LJLIL.getVideoPath()) && (contentResolver = this.LJLJI) != null) {
                this.LJLIL.setVideoPath(contentResolver.getType(WallPaperDataProvider.LJLJJL));
            }
            if (this.LJLIL.getWidth() <= 0) {
                this.LJLIL.setWidth(this.LJLJJI.LJIIJ());
            }
            if (this.LJLIL.getHeight() <= 0) {
                this.LJLIL.setHeight(this.LJLJJI.LJI());
            }
            if (TextUtils.isEmpty(this.LJLIL.getSource())) {
                this.LJLIL.setSource(this.LJLJJI.getSource());
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ() {
        if (!this.LJLJJLL.format(new Date(System.currentTimeMillis())).equals(this.LJLJJLL.format(Long.valueOf(C62016OVo.LIZ().getLong("keva_key_already_upload_date", 0L))))) {
            C62016OVo.LIZ().erase("keva_key_already_upload_date");
            String[] stringArray = C62016OVo.LIZ().getStringArray("keva_key_wallpaper_active_date", null);
            if (stringArray != null && stringArray.length > 0) {
                if (!this.LJLJJLL.format(new Date(CastLongProtector.parseLong(stringArray[stringArray.length - 1]))).equals(this.LJLJJLL.format(new Date(System.currentTimeMillis())))) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(stringArray));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(System.currentTimeMillis());
                    LIZ.append("");
                    arrayList.add(X1D.LIZIZ(LIZ));
                    C62016OVo.LIZ().storeStringArray("keva_key_wallpaper_active_date", (String[]) arrayList.toArray(new String[0]));
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(System.currentTimeMillis());
                LIZ2.append("");
                C62016OVo.LIZ().storeStringArray("keva_key_wallpaper_active_date", new String[]{X1D.LIZIZ(LIZ2)});
            }
        }
        this.LJLJJL.sendEmptyMessageDelayed(1, TimeUnit.HOURS.toMillis(C62016OVo.LIZ().getInt("keva_key_active_check_interval_hour", 2)));
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.LJLJI = getContentResolver();
        this.LJLJJI = (InterfaceC28728BPg) CN5.LIZ(EF7.LIZIZ(), InterfaceC28728BPg.class);
        this.LJLJJL.removeMessages(1);
        LIZIZ();
    }

    @Override // android.service.wallpaper.WallpaperService
    public final WallpaperService.Engine onCreateEngine() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AmeLiveWallpaper onCreateEngine: service = ");
        LIZ.append(this);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        OWH owh = new OWH(this);
        this.LJLILLLLZI.add(owh);
        return owh;
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public final void onDestroy() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroy: service = ");
        LIZ.append(this);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        this.LJLJJL.removeMessages(1);
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        LiveWallPaperBean liveWallPaperBean;
        C66163Pxv.LIZ(this, intent, i, i2);
        if (intent != null) {
            if ("action_update_volume".equals(C16880lQ.LLJJIJIIJIL(intent, "action"))) {
                float f = (C62016OVo.LIZ().getInt("keva_key_wallpaper_sound_slider_progress", 0) * 1.0f) / 100.0f;
                Iterator<OWH> it = this.LJLILLLLZI.iterator();
                while (it.hasNext()) {
                    OWI owi = it.next().LIZ;
                    if (owi.LIZJ != null && (liveWallPaperBean = owi.LJ) != null && !liveWallPaperBean.isShouldMute()) {
                        owi.LJ.setVolume(f);
                        owi.LIZJ.LLJJIJIL(f, f);
                    }
                }
                return super.onStartCommand(intent, i, i2);
            }
            this.LJLIL = C31137CJx.LIZIZ(C16880lQ.LLJJIJIIJIL(intent, "wallpaper_json"));
        }
        LiveWallPaperBean liveWallPaperBean2 = this.LJLIL;
        if (liveWallPaperBean2 == null || !C39579Fg7.LIZIZ(liveWallPaperBean2.getVideoPath()) || this.LJLIL.getWidth() <= 0 || this.LJLIL.getHeight() <= 0) {
            LIZ();
        }
        Iterator<OWH> it2 = this.LJLILLLLZI.iterator();
        while (it2.hasNext()) {
            OWH next = it2.next();
            LiveWallPaperBean liveWallPaperBean3 = next.LIZIZ.LJLIL;
            if (liveWallPaperBean3 != null && !TextUtils.isEmpty(liveWallPaperBean3.getSource())) {
                OWI owi2 = next.LIZ;
                LiveWallPaperBean liveWallPaperBean4 = next.LIZIZ.LJLIL;
                owi2.LJ = liveWallPaperBean4;
                String videoPath = liveWallPaperBean4.getVideoPath();
                next.LIZIZ.LJLIL.getWidth();
                next.LIZIZ.LJLIL.getHeight();
                if (!C39579Fg7.LIZIZ(videoPath)) {
                    owi2.LIZIZ("onRefresh video is not exists", false);
                } else {
                    SurfaceHolder surfaceHolder = owi2.LIZLLL;
                    if (surfaceHolder != null) {
                        owi2.LIZ(surfaceHolder);
                        try {
                            owi2.LIZJ.LL(videoPath);
                            owi2.LIZLLL();
                        } catch (Exception e) {
                            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "media play exception ");
                            LIZIZ.append(e.getMessage());
                            owi2.LIZIZ(X1D.LIZIZ(LIZIZ), false);
                        }
                    }
                }
            }
        }
        this.LJLJJL.removeMessages(1);
        LIZIZ();
        return super.onStartCommand(intent, i, i2);
    }
}
