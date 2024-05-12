package X;

import Y.IDAListenerS74S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveAnimationDegradeSettings;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class BFU extends ConstraintLayout {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public C29701Eo LJLIL;

    public final void LJJLJLI() {
        if (LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            return;
        }
        this.LJLIL.cancelAnimation();
        animate().alpha(0.0f).setDuration(200L).setListener(new IDAListenerS74S0100000_5(this, 19)).start();
    }

    public static void LJJZ(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        BFU bfu = new BFU(viewGroup.getContext(), (Object) null);
        viewGroup.addView(bfu, -1, -1);
        if (!LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            bfu.LJLIL.addAnimatorListener(new IDAListenerS74S0100000_5(bfu, 18));
            bfu.LJLIL.playAnimation();
        }
        bfu.setAlpha(0.0f);
        bfu.animate().alpha(1.0f).setDuration(300L).start();
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", C28594BKc.LIZJ().LIZLLL());
        hashMap.put("strength", B8U.LIZIZ());
        hashMap.put("type", B8U.LIZ);
        BZI LIZ = C28787BRn.LIZ("draw_guide_show");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    public final void LJJLL(String str) {
        ViewGroup.inflate(getContext(), R.layout.dbt, this);
        C29701Eo c29701Eo = (C29701Eo) findViewById(R.id.k4l);
        this.LJLIL = c29701Eo;
        c29701Eo.setVisibility(0);
        if (!LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
            if (iHostResource.xi()) {
                this.LJLIL.setAnimation(iHostResource.d1());
            } else if (TextUtils.isEmpty(str)) {
                C15490jB.LJIIIIZZ(this.LJLIL, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "mt_slide_up_lottie.zip");
            } else {
                C15490jB.LJIIIIZZ(this.LJLIL, "tiktok_live_watch_resource_normal_1", str);
            }
        }
        setBackgroundColor(ColorProtector.parseColor("#80000000"));
        setOnTouchListener(new IDTListenerS115S0100000_5(this, 15));
    }

    public void setAnimView(int i) {
        C29701Eo c29701Eo = this.LJLIL;
        if (c29701Eo == null || i <= 0) {
            return;
        }
        c29701Eo.setRepeatCount(i);
    }

    public BFU(Context context, int i) {
        super(context, null, 0);
        LJJLL("mt_land_slide_up_lottie.zip");
    }

    public BFU(Context context, Object obj) {
        super(context, null, 0);
        LJJLL(null);
    }
}
