package X;

import Y.ACListenerS23S0100000_3;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.discover.experiment.DiscoveryFpsOptExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208558Gl extends AbstractC208468Gc {
    public static final C62822Ol8 LJLLL = C221108m2.LIZIZ(C208588Go.INSTANCE);
    public static final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C208578Gn.LJLIL);
    public MH9 LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final View LJLLI;
    public final View LJLLILLLL;
    public final InterfaceC208608Gq LJLLJ;

    @Override // X.MFR
    public final void LLZLLLL() {
        Video video;
        Aweme aweme = this.LJLIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            if (C248339or.LIZ()) {
                if (Y(video, "CoverViewHolder", Bitmap.Config.ARGB_8888)) {
                    this.LJLJI = true;
                    return;
                } else {
                    T(video.getCover(), "CoverViewHolder", Bitmap.Config.ARGB_8888, null);
                    return;
                }
            }
            if (U(video, "CoverViewHolder")) {
                this.LJLJI = true;
            } else {
                T(video.getCover(), "CoverViewHolder", null, null);
            }
        }
    }

    @Override // X.AbstractC208468Gc
    public final int[] P() {
        return J7H.LIZ(200);
    }

    public final void X() {
        OSZ LJJJIL = LFH.LIZIZ.LIZLLL().LJIIL().LJJJIL();
        float floatValue = ((Number) LJJJIL.getFirst()).floatValue();
        float floatValue2 = ((Number) LJJJIL.getSecond()).floatValue();
        this.LJLL = C63081OpJ.LJIJJLI(this.itemView.getContext(), floatValue);
        this.LJLJLLL = C63081OpJ.LJIJJLI(this.itemView.getContext(), floatValue2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208558Gl(InterfaceC208608Gq coverlistener, View view, MH9 mh9) {
        super(view);
        o.LJIIIZ(coverlistener, "coverlistener");
        this.LJLJLJ = mh9;
        this.LJLLJ = coverlistener;
        X();
        View findViewById = view.findViewById(R.id.j83);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.root_view)");
        this.LJLLI = findViewById;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.a1k);
        this.LJLILLLLZI = smartImageView;
        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS23S0100000_3(this, 260));
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "stop_main_anim_when_invisible", true, false)) {
            this.LJLILLLLZI.setAnimationListener(this.LJLJL);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            SmartImageView smartImageView2 = this.LJLILLLLZI;
            smartImageView2.setForeground(smartImageView2.getContext().getDrawable(R.drawable.ani));
        } else {
            C7FA.LIZIZ(this.LJLILLLLZI);
        }
        View findViewById2 = view.findViewById(R.id.n54);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.video_cover_mask)");
        this.LJLLILLLL = findViewById2;
        findViewById2.setVisibility(8);
    }

    public final boolean Y(Video video, String str, Bitmap.Config config) {
        boolean z;
        if (((DiscoveryFpsOptExperiment.Config) DiscoveryFpsOptExperiment.LIZIZ.getValue()).enable1) {
            if (((Boolean) LJLLL.getValue()).booleanValue()) {
                return false;
            }
            this.itemView.getContext();
            try {
                if (C2NU.LIZ.LIZIZ() && !C48207Ivz.LIZ(this.itemView.getContext())) {
                    return false;
                }
            } catch (Exception unused) {
            }
            if (C84S.LIZ("use_dynamic_cover") || !C84S.LIZ.containsKey(C84S.LIZJ("use_dynamic_cover"))) {
                z = ((Boolean) LJLLLL.getValue()).booleanValue();
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                if (!C84S.LIZ("use_dynamic_cover")) {
                    String LIZJ = C84S.LIZJ("use_dynamic_cover");
                    HashMap<String, Boolean> hashMap = C84S.LIZ;
                    if (hashMap.containsKey(LIZJ)) {
                        z = hashMap.get(LIZJ).booleanValue();
                    } else {
                        z = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_app").getBoolean("use_dynamic_cover", z);
                        hashMap.put(LIZJ, Boolean.valueOf(z));
                    }
                }
            }
            if (!z) {
                return false;
            }
            SmartImageView mCoverView = this.LJLILLLLZI;
            o.LJIIIIZZ(mCoverView, "mCoverView");
            if (!C208458Gb.LIZLLL(mCoverView, video, "CoverViewHolder", true, this.LJLJJLL, null, true, config, true, 512)) {
                return false;
            }
            return true;
        }
        return V(video, "CoverViewHolder", config, false);
    }
}
