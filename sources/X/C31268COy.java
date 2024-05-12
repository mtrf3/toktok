package X;

import Y.ACallableS108S0100000_5;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.COy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31268COy {
    public static final C31268COy LJI = new C31268COy();
    public final List<LiveWallPaperBean> LIZ;
    public final Gson LIZIZ = new Gson();
    public final InterfaceC28728BPg LIZJ;
    public final LiveWallPaperBean LIZLLL;
    public final java.util.Map<String, CP2> LJ;
    public ContentResolver LJFF;

    public final void LIZIZ() {
        Iterator<LiveWallPaperBean> it = this.LIZ.iterator();
        boolean z = false;
        while (it.hasNext()) {
            LiveWallPaperBean next = it.next();
            if (!next.isValid()) {
                C10K.LIZJ(new ACallableS108S0100000_5(next, 2));
                it.remove();
                z = true;
            }
        }
        if (z) {
            LJ();
        }
    }

    public final List<LiveWallPaperBean> LIZJ() {
        String str;
        List list;
        if (!C79004UzY.LJJIFFI(this.LIZ)) {
            LIZIZ();
            return this.LIZ;
        }
        InterfaceC28728BPg interfaceC28728BPg = this.LIZJ;
        if (interfaceC28728BPg != null) {
            str = interfaceC28728BPg.LJIIIIZZ();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return new LinkedList();
        }
        try {
            list = (List) this.LIZIZ.LJII(str, new C31269COz().getType());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            list = null;
        }
        if (C79004UzY.LJJIFFI(list)) {
            return new LinkedList();
        }
        this.LIZ.addAll(list);
        LIZIZ();
        return this.LIZ;
    }

    public final void LJ() {
        InterfaceC28728BPg interfaceC28728BPg = this.LIZJ;
        if (interfaceC28728BPg != null) {
            interfaceC28728BPg.LJFF(GsonProtectorUtils.toJson(this.LIZIZ, this.LIZ));
        }
    }

    public C31268COy() {
        this.LIZ = new LinkedList();
        try {
            this.LIZJ = (InterfaceC28728BPg) CN5.LIZ(EF7.LIZIZ(), InterfaceC28728BPg.class);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LiveWallPaperManager getSP failed ");
            LIZ.append(th.getMessage());
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
        }
        if (this.LIZJ != null) {
            OW7 newBuilder = LiveWallPaperBean.newBuilder();
            newBuilder.LIZJ = this.LIZJ.LIZJ();
            newBuilder.LIZLLL = this.LIZJ.LJIIJ();
            newBuilder.LJ = this.LIZJ.LJI();
            newBuilder.LJFF = this.LIZJ.getSource();
            newBuilder.LJI = this.LIZJ.getVolume();
            newBuilder.LJIIJ = this.LIZJ.LJII();
            this.LIZLLL = new LiveWallPaperBean(newBuilder);
        } else {
            OW7 newBuilder2 = LiveWallPaperBean.newBuilder();
            newBuilder2.getClass();
            this.LIZLLL = new LiveWallPaperBean(newBuilder2);
        }
        this.LIZ = LIZJ();
        this.LJ = new HashMap();
    }

    public static void LIZLLL(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        ComponentName componentName;
        Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
        if (C62011OVj.LJI()) {
            componentName = new ComponentName(InterfaceC28729BPh.LIZ, "com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper");
        } else {
            componentName = new ComponentName(liveWallPaperPreviewActivity.getPackageName(), AmeLiveWallpaper.class.getName());
        }
        intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", componentName);
        intent.putExtra("pns.sandbox.dataflow_id", 1207966977);
        try {
            C16880lQ.LJFF(liveWallPaperPreviewActivity, 100, intent);
        } catch (Exception e) {
            if (e instanceof ActivityNotFoundException) {
                C62016OVo.LIZ().storeBoolean("keva_key_device_support_wallpaper", false);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("brand", Build.BRAND);
                c188727au.LJIIIZ("model", Build.MODEL);
                FMX.LJIIL("not_support_wallpaper_device", c188727au.LIZ);
            }
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.tu7);
            c5s1.LJ();
            C62011OVj.LJIIIIZZ(1, "start livewallpaper activity fail");
        }
        C31137CJx.LIZJ();
    }

    public final boolean LIZ(String str) {
        if (!C79004UzY.LJJIFFI(this.LIZ) && !TextUtils.isEmpty(str)) {
            Iterator<LiveWallPaperBean> it = this.LIZ.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getId())) {
                    return true;
                }
            }
        }
        return false;
    }
}
