package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0G1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0G1 {
    public final DataChannel LIZ;
    public boolean LIZIZ;
    public C32001Nk LIZJ;
    public final View LIZLLL;
    public final RunnableC31065CHd LJ;
    public final TextView LJFF;
    public final View LJI;
    public final View LJII;
    public final C40771ir LJIIIIZZ;
    public boolean LJIIIZ;
    public final SpannedGridLayoutManager LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public final C76104Tts LJIILIIL;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public final void LJI() {
        View findViewById = this.LJI.findViewById(R.id.kgw);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        findViewById.startAnimation(rotateAnimation);
    }

    public final void LJII() {
        this.LJI.findViewById(R.id.kgw).clearAnimation();
    }

    public final void LJ(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_sticker_panel_icon_click");
        LIZ.LJIILLIIL(this.LIZ);
        if (str == null) {
            C32001Nk c32001Nk = this.LIZJ;
            if (c32001Nk != null) {
                str = c32001Nk.LJLILLLLZI;
            } else {
                str = null;
            }
        }
        LIZ.LJIJJ(str, "tab");
        LIZ.LJJIIJZLJL();
    }

    public C0G1(ViewGroup parent, DataChannel dataChannel, StickerEffectViewModel viewModel, RecyclerView.RecycledViewPool viewPool) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(viewPool, "viewPool");
        this.LIZ = dataChannel;
        View LIZIZ = C1FL.LIZIZ(parent, R.layout.d31, parent, false, "from(parent.context)\n   …alog_page, parent, false)");
        this.LIZLLL = LIZIZ;
        View findViewById = LIZIZ.findViewById(R.id.btg);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.content_container)");
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) findViewById;
        this.LJ = runnableC31065CHd;
        View findViewById2 = LIZIZ.findViewById(R.id.l45);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.text_empty_view)");
        this.LJFF = (TextView) findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.g94);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.loading_view)");
        this.LJI = findViewById3;
        View findViewById4 = LIZIZ.findViewById(R.id.cyv);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.error_view)");
        this.LJII = findViewById4;
        C40771ir c40771ir = new C40771ir(dataChannel, this.LIZJ, viewModel);
        c40771ir.setHasStableIds(true);
        this.LJIIIIZZ = c40771ir;
        SpannedGridLayoutManager spannedGridLayoutManager = new SpannedGridLayoutManager(C0LY.VERTICAL);
        spannedGridLayoutManager.LLFII = new C0LZ(new IDqS416S0100000(this, 20));
        spannedGridLayoutManager.LJZ();
        spannedGridLayoutManager.LLFFF = true;
        this.LJIIJ = spannedGridLayoutManager;
        this.LJIIL = "";
        C29306Beo.LJJLJLI(findViewById3);
        C29306Beo.LJI(findViewById4);
        LJI();
        runnableC31065CHd.setAdapter(c40771ir);
        runnableC31065CHd.setLayoutManager(spannedGridLayoutManager);
        runnableC31065CHd.setItemAnimator(null);
        runnableC31065CHd.setHasFixedSize(true);
        RecyclerView.RecycledViewPool LJLJL = runnableC31065CHd.LJLJL(EnumC31066CHe.EFFECT_STICKER, true);
        if (LJLJL != null) {
            LJLJL.setMaxRecycledViews(C6NP.NORMAL.getValue(), 20);
        }
        runnableC31065CHd.LJLJJLL();
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_effect_slide");
        runnableC31065CHd.LJIIJJI(new CHM(c5h3 != null ? (CHK) c5h3.getValue() : null));
        this.LJIILIIL = new C76104Tts(1, runnableC31065CHd, new IDqS443S0100000(this, 2));
        LJI();
    }

    public void LJFF(C32001Nk c32001Nk, boolean z, String panel, IDqS416S0100000 iDqS416S0100000) {
        o.LJIIIZ(panel, "panel");
        this.LIZJ = c32001Nk;
        this.LJIIJJI = z;
        this.LJIIL = panel;
        this.LJIIIIZZ.LJLJLLL = iDqS416S0100000;
    }
}
