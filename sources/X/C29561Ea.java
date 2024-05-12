package X;

import Y.IDCListenerS135S0100000;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.banner.EffectMemoryPositionOptSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEntranceEffectOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ea, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29561Ea extends C0G1 {
    public final StickerEffectViewModel LJIILJJIL;
    public final C0WF LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public XKQ LJIIZILJ;
    public long LJIJ;

    @Override // X.C0G1
    public final void LIZLLL() {
    }

    @Override // X.C0G1
    public final void LIZ() {
        C32001Nk c32001Nk = this.LIZJ;
        if (c32001Nk != null) {
            LJIIIIZZ(c32001Nk, this.LJIIJJI);
        }
        if (!LJIIJ(this.LJIIIIZZ.LJLJJL) && !EffectMemoryPositionOptSetting.INSTANCE.inExperiment()) {
            this.LJIIJ.LJZL(LJIIIZ());
        }
    }

    @Override // X.C0G1
    public final void LIZIZ() {
        XKQ xkq = this.LJIIZILJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.C0G1
    public final void LIZJ() {
        LJIIIIZZ(this.LIZJ, this.LJIIJJI);
    }

    public final int LJIIIZ() {
        Object obj;
        List<LiveEffect> LIZ;
        C0WF c0wf = this.LJIILL;
        if (c0wf != null && (LIZ = c0wf.LIZ(this.LJIIL)) != null) {
            obj = ORZ.LJLLLL(LIZ);
        } else {
            obj = null;
        }
        int LJZ = ORZ.LJZ(obj, this.LJIIIIZZ.LJLIL);
        if (LJZ == -1) {
            return 0;
        }
        return LJZ;
    }

    public final void LJIIJJI() {
        if (((ArrayList) this.LJIIIIZZ.LJLIL).isEmpty()) {
            C29306Beo.LJJLJLI(this.LJII);
            C29306Beo.LJI(this.LJFF);
            C29306Beo.LJI(this.LJI);
            LJII();
            C29306Beo.LJI(this.LJ);
        }
    }

    public final boolean LJIIJ(LiveEffect liveEffect) {
        int i;
        int i2 = -1;
        if (this.LJIIJJI) {
            i = ORZ.LJZ(liveEffect, this.LJIIIIZZ.LJLIL);
        } else {
            i = -1;
        }
        if (C29306Beo.LJIILJJIL() && this.LJIIJJI && ((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            if (liveEffect == null) {
                i2 = 0;
            } else {
                C40641ie.LJLIL.getClass();
                List LIZJ = C40641ie.LIZJ();
                if (LIZJ != null) {
                    i2 = LIZJ.indexOf(liveEffect);
                }
            }
            if (EffectMemoryPositionOptSetting.INSTANCE.inExperiment()) {
                if (i2 > 0) {
                    this.LJIIJ.LJZL(i2);
                    return true;
                }
            } else {
                if (i2 < 0) {
                    i2 = Math.max(ORZ.LJZ(liveEffect, this.LJIIIIZZ.LJLIL), 0);
                }
                this.LJIIJ.LJZL(i2);
                return true;
            }
        } else {
            if (i == -1 || ((C29306Beo.LJIILJJIL() && LiveEntranceEffectOptimizeSetting.INSTANCE.enable()) || EffectMemoryPositionOptSetting.INSTANCE.inExperiment())) {
                return false;
            }
            this.LJIIJ.LJZL(i);
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ(C32001Nk c32001Nk, boolean z) {
        if (c32001Nk == null || System.currentTimeMillis() - this.LJIJ < 1000) {
            return;
        }
        this.LJIJ = System.currentTimeMillis();
        if (c32001Nk.LJLILLLLZI.length() == 0) {
            LJIIJJI();
            return;
        }
        if (o.LJ(this.LJIIL, C0TY.LIZJ) && z) {
            List<LiveEffect> value = ((MultiGuestStickerViewModel) this.LJIILLIIL.getValue()).LJLJI.getValue();
            if (value != null) {
                LJIIL(value, c32001Nk, true, false);
                return;
            }
            return;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this.LJIILJJIL), null, null, new C539029q(this, c32001Nk, null), 3);
    }

    @Override // X.C0G1
    public final void LJFF(C32001Nk c32001Nk, boolean z, String panel, IDqS416S0100000 iDqS416S0100000) {
        o.LJIIIZ(panel, "panel");
        super.LJFF(c32001Nk, z, panel, iDqS416S0100000);
    }

    public final void LJIIL(List<? extends LiveEffect> list, C32001Nk c32001Nk, boolean z, boolean z2) {
        LiveEffect liveEffect;
        LiveEffect liveEffect2;
        List<LiveEffect> LIZ;
        String str;
        if (list.isEmpty()) {
            C29306Beo.LJJLJLI(this.LJFF);
            C29306Beo.LJI(this.LJI);
            LJII();
            C29306Beo.LJI(this.LJII);
            C29306Beo.LJI(this.LJ);
            return;
        }
        C29306Beo.LJJLJLI(this.LJ);
        C29306Beo.LJI(this.LJFF);
        C29306Beo.LJI(this.LJI);
        C29306Beo.LJI(this.LJII);
        Iterator<? extends LiveEffect> it = list.iterator();
        while (true) {
            liveEffect = null;
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            LiveEffect next = it.next();
            if (c32001Nk != null) {
                str = c32001Nk.LJLIL;
            } else {
                str = null;
            }
            next.effectPanelName = str;
            if (c32001Nk != null) {
                str2 = c32001Nk.LJLILLLLZI;
            }
            next.effectPanelKey = str2;
        }
        C40771ir c40771ir = this.LJIIIIZZ;
        C0WF c0wf = this.LJIILL;
        if (c0wf != null && (LIZ = c0wf.LIZ(this.LJIIL)) != null) {
            liveEffect2 = (LiveEffect) ORZ.LJLLLL(LIZ);
        } else {
            liveEffect2 = null;
        }
        c40771ir.LLJJJJJIL(list, z, liveEffect2, this.LJIIL);
        C40641ie.LJLIL.getClass();
        C0WZ c0wz = C40641ie.LJLJJLL;
        if (c0wz != null) {
            liveEffect = c0wz.LIZ;
        }
        if (LJIIJ(liveEffect)) {
            return;
        }
        if (z && z2 && EffectMemoryPositionOptSetting.INSTANCE.v2()) {
            this.LJIIJ.LJZL(1);
        } else {
            if (EffectMemoryPositionOptSetting.INSTANCE.inExperiment()) {
                return;
            }
            this.LJIIJ.LJZL(LJIIIZ());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29561Ea(ViewGroup parent, RecyclerView.RecycledViewPool viewPool, C0WF c0wf, StickerEffectViewModel viewModel, DataChannel dataChannel) {
        super(parent, dataChannel, viewModel, viewPool);
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(viewPool, "viewPool");
        this.LJIILJJIL = viewModel;
        this.LJIILL = c0wf;
        this.LJIILLIIL = C221108m2.LIZIZ(C46541sA.LJLIL);
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 10), this.LJII);
        this.LJIIZILJ = XKX.LIZLLL(ViewModelKt.getViewModelScope(viewModel), null, null, new C539129r(this, null), 3);
        C29306Beo.LJJLJLI(this.LJI);
        LJI();
        C29306Beo.LJI(this.LJII);
        C29306Beo.LJI(this.LJ);
        C29306Beo.LJI(this.LJFF);
    }
}
