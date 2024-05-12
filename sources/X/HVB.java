package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HVB {
    public final HVC LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 22));
    public boolean LIZJ;
    public HVL LIZLLL;
    public final ShortVideoContext LJ;

    public final Bundle LIZJ() {
        return (Bundle) this.LIZIZ.getValue();
    }

    public final HVB LIZIZ() {
        LIZJ().putBoolean("Key_enable_multi_select", true);
        return this;
    }

    public HVB(HVC hvc) {
        this.LIZ = hvc;
        Bundle bundle = new Bundle();
        bundle.putString("shoot_way", hvc.LIZ);
        bundle.putString("enter_from", hvc.LIZIZ);
        bundle.putString("enter_method", hvc.LIZJ);
        this.LJ = HB3.LIZIZ(bundle);
    }

    public final HVB LIZ(EnumC44013HPd tab) {
        o.LJIIIZ(tab, "tab");
        LIZJ().putInt("key_default_landing_tab", tab.getType());
        return this;
    }

    public final void LIZLLL(Activity activity) {
        String str;
        if (activity == null) {
            return;
        }
        HVL hvl = this.LIZLLL;
        if (hvl != null) {
            String str2 = this.LIZ.LIZ;
            String LJI = this.LJ.LJI();
            o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
            hvl.injectMobParam(str2, LJI);
        }
        Bundle LIZJ = LIZJ();
        LIZJ.putInt("key_photo_select_min_count", 1);
        C43117Gw5.LIZ.getClass();
        int i = C43117Gw5.LIZIZ;
        LIZJ.putInt("key_photo_select_max_count", i);
        LIZJ.putInt("key_video_select_min_count", 1);
        LIZJ.putInt("key_video_select_max_count", i);
        LIZJ.putInt("key_support_flag", 6);
        LIZJ.putInt("key_choose_scene", 0);
        LIZJ.putBoolean("Key_enable_multi_video", true);
        LIZJ.putParcelable("key_short_video_context", this.LJ);
        LIZJ.putBoolean("key_upload_direct_enter", true);
        HJ9.LIZLLL(activity, LIZJ(), 1);
        ShortVideoContext shortVideoContext = this.LJ;
        if (shortVideoContext != null) {
            str = shortVideoContext.LJI();
        } else {
            str = null;
        }
        if (this.LIZJ) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("shoot_way", this.LIZ.LIZ);
            c188727au.LJIIIZ("shoot_entrance", this.LIZ.LIZ);
            c188727au.LJIIIZ("enter_method", this.LIZ.LIZJ);
            c188727au.LJIIIZ("enter_from", this.LIZ.LIZIZ);
            c188727au.LJIIIZ("creation_id", str);
            FMX.LJIIL("shoot", c188727au.LIZ);
        }
    }

    public final HVB LJ(EnterStoryParam param) {
        HVL hvk;
        o.LJIIIZ(param, "param");
        EnterStoryParam copy$default = EnterStoryParam.copy$default(param, null, null, "upload_page", false, false, false, false, param.getEnterFrom(), param.getEnterMethod(), this.LJ.LJI(), false, null, 3195, null);
        if (C142355iJ.LIZ()) {
            hvk = new HVJ(copy$default);
        } else {
            hvk = new HVK(copy$default);
        }
        this.LIZLLL = hvk;
        LIZJ().putSerializable("key_album_interact_view_holder_list", C47261Igj.LJII(this.LIZLLL));
        return this;
    }
}
