package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LBM extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public final SY4 getBtnDismiss() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-btnDismiss>(...)");
        return (SY4) value;
    }

    public final ImageView getIvClose() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-ivClose>(...)");
        return (ImageView) value;
    }

    public final C29701Eo getLottie() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-lottie>(...)");
        return (C29701Eo) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBM(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        Object LIZ;
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 787));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 785));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 786));
        View.inflate(activityC45651qj, R.layout.adj, this);
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ = SettingsManager.LJI("fixed_caption_consumption_sheet_link", "");
            o.LJIIIIZZ(LIZ, "getInstance()\n          …ottieSetting::class.java)");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String str = (String) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        getLottie().setAnimationFromUrl((str == null || str.length() == 0) ? "https://p16-sg-default.akamaized.net/obj/tiktok-obj/longpress_subtitle_guide_lottie_2.json" : str);
        getLottie().setRepeatMode(1);
        getLottie().setRepeatCount(-1);
        getLottie().playAnimation();
    }
}
