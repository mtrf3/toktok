package X;

import Y.IDAListenerS74S0100000_5;
import Y.IDTListenerS89S0200000_5;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveAnimationDegradeSettings;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class B8Y extends ConstraintLayout {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C47061t0 LJLIL;
    public final C15540jG LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;

    static {
        new B8X();
    }

    public final void LJJLJLI() {
        if (LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            return;
        }
        animate().alpha(0.0f).setDuration(200L).setListener(new IDAListenerS74S0100000_5(this, 20)).start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8Y(Context context, C80797VnN c80797VnN) {
        super(context, null, 0);
        new LinkedHashMap();
        C15540jG c15540jG = new C15540jG();
        this.LJLILLLLZI = c15540jG;
        ViewGroup.inflate(getContext(), R.layout.dbu, this);
        C47061t0 c47061t0 = (C47061t0) findViewById(R.id.k4m);
        this.LJLIL = c47061t0;
        if (!LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            c15540jG.LIZIZ = "tiktok_live_watch_resource_normal_1";
            c15540jG.LIZJ = "live_slidep_up_animate.webp";
            c15540jG.LJIILL = true;
            if (c47061t0 != null) {
                c15540jG.LIZ = c47061t0;
            }
            c15540jG.LJFF = true;
            if (BFS.LIZIZ().LJLLILLLL == 4) {
                c15540jG.LJI = Integer.MAX_VALUE;
            } else {
                c15540jG.LJI = 4;
            }
            c15540jG.LJIIL = true;
            c15540jG.LJ = new B8Z(this);
        }
        c15540jG.LIZIZ();
        setBackgroundColor(ColorProtector.parseColor("#80000000"));
        setOnTouchListener(new IDTListenerS89S0200000_5(c80797VnN, this, 1));
    }
}
