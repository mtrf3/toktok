package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.9kF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245479kF extends AbstractC245359k3 {
    public C73411SrX LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public C245479kF(Context context) {
        super(context, null, 0);
        this.LJLJI = true;
        this.LJLJJI = true;
        FrameLayout.inflate(context, R.layout.br1, this);
        C9AE.LIZ(this, C9AC.ALPHA, 0.0f);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.LJLJI = z;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.LJLJJI = z;
    }

    @Override // X.AbstractC245359k3
    public void setBellIcon(C2068389v icon) {
        o.LJIIIZ(icon, "icon");
        setVisibility(0);
        ((TuxIconView) LIZ(R.id.ai8)).setTuxIcon(icon);
    }

    public final void LIZIZ(final long j, final InterfaceC245499kH interfaceC245499kH) {
        Keva repo = KevaImpl.getRepo("nudge_guide_show", 0);
        o.LJIIIIZZ(repo, "getRepo(NUDGE_GUIDE_SHOW…ants.MODE_SINGLE_PROCESS)");
        if (repo.getBoolean("shown", false)) {
            return;
        }
        this.LJLILLLLZI = 0L;
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLIL = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(1L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new InterfaceC64592gB() { // from class: X.9kG
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C245479kF c245479kF = C245479kF.this;
                if (c245479kF.LJLJJI && c245479kF.LJLJI) {
                    c245479kF.LJLILLLLZI++;
                }
                if (c245479kF.LJLILLLLZI == j) {
                    if (c245479kF.getLocalVisibleRect(new Rect())) {
                        W5G bell_anim = (W5G) C245479kF.this.LIZ(R.id.ai7);
                        o.LJIIIIZZ(bell_anim, "bell_anim");
                        TuxIconView bell_icon = (TuxIconView) C245479kF.this.LIZ(R.id.ai8);
                        o.LJIIIIZZ(bell_icon, "bell_icon");
                        OCT.LIZ(bell_anim, bell_icon, CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_outside_demand_1"), "profile_bell_notify.webp");
                        Keva repo2 = KevaImpl.getRepo("nudge_guide_show", 0);
                        o.LJIIIIZZ(repo2, "getRepo(NUDGE_GUIDE_SHOW…ants.MODE_SINGLE_PROCESS)");
                        repo2.storeBoolean("shown", true);
                        interfaceC245499kH.LIZ();
                    }
                    C73411SrX c73411SrX2 = C245479kF.this.LJLIL;
                    if (c73411SrX2 != null) {
                        c73411SrX2.dispose();
                    }
                }
            }
        });
    }
}
