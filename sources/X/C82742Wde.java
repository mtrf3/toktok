package X;

import Y.ACListenerS34S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wde, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82742Wde extends C82741Wdd {
    public final ShortVideoContext LJZI;
    public final boolean LJZL;
    public C62846OlW LL;
    public boolean LLD;

    @Override // X.C82741Wdd
    public final boolean LLJILJILJ() {
        return this.LJZL;
    }

    @Override // X.C82741Wdd, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (V16.LJIIIZ(this.LJZI) && !HVI.LIZ() && !this.LLD) {
            getUiActions().LJ.invoke();
            this.LLD = true;
        }
    }

    @Override // X.C82741Wdd
    public final void LLJJI(boolean z, boolean z2) {
        C131905Fq c131905Fq;
        if (z || (c131905Fq = this.LJLLL) == null) {
            return;
        }
        c131905Fq.setNeedLinearBackground(false);
    }

    @Override // X.C82741Wdd, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxIconView tuxIconView;
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.bvo, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = viewGroup2.findViewById(R.id.b2z);
        TuxTextView tuxTextView = null;
        if (findViewById instanceof TuxIconView) {
            tuxIconView = (TuxIconView) findViewById;
        } else {
            tuxIconView = null;
        }
        this.LJLL = tuxIconView;
        View findViewById2 = viewGroup2.findViewById(R.id.b30);
        if (findViewById2 instanceof TuxTextView) {
            tuxTextView = (TuxTextView) findViewById2;
        }
        this.LJLLI = tuxTextView;
        this.LJLLILLLL = viewGroup2.findViewById(R.id.hls);
        this.LJLLJ = (ViewGroup) viewGroup2.findViewById(R.id.b2y);
        this.LJLLL = (C131905Fq) viewGroup2.findViewById(R.id.irl);
        this.LJLLLL = (C46026I4o) viewGroup2.findViewById(R.id.b06);
        this.LJLLLLLL = (ViewGroup) viewGroup2.findViewById(R.id.hlp);
        this.LJLZ = (ViewGroup) viewGroup2.findViewById(R.id.j5i);
        this.LJZ = (TuxTextView) viewGroup2.findViewById(R.id.hma);
        viewGroup2.findViewById(R.id.gtk);
        this.LL = (C62846OlW) viewGroup2.findViewById(R.id.grj);
        viewGroup2.findViewById(R.id.jt0);
        viewGroup2.findViewById(R.id.gu7);
        viewGroup2.findViewById(R.id.gs8);
        viewGroup2.findViewById(R.id.b3m);
        View view = this.LJLLILLLL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 29), view);
        }
        ViewGroup viewGroup3 = this.LJLLJ;
        if (viewGroup3 != null) {
            C16880lQ.LJIIL(viewGroup3, new ACListenerS34S0100000_14(this, 30));
        }
        C46026I4o c46026I4o = this.LJLLLL;
        if (c46026I4o != null) {
            c46026I4o.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(this, 31)));
        }
        if (L1D.LIZIZ() || L1D.LIZ()) {
            C46026I4o c46026I4o2 = this.LJLLLL;
            if (c46026I4o2 != null) {
                C60942Nvu.LIZJ(49, c46026I4o2);
                ViewGroup.LayoutParams layoutParams = c46026I4o2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C7MY.LIZIZ(22);
                marginLayoutParams.height = -2;
            }
            C82740Wdc.LIZJ(this.LJLLLL);
        }
        C62846OlW c62846OlW = this.LL;
        if (c62846OlW != null) {
            c62846OlW.setCornerRadius(C32151Nz.LJIIZILJ(Float.valueOf(4.5f)));
        }
        C78923UyF.LJIILLIIL(this).LLJILJILJ(this, new C82744Wdg(this));
        return viewGroup2;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82742Wde(C08610Vl<C82750Wdm> uiSceneStates, C82746Wdi uiSceneAction, C0IB<Boolean> relayoutEvent, ShortVideoContext shortVideoContext) {
        super(uiSceneStates, uiSceneAction, relayoutEvent, shortVideoContext);
        long j;
        String str;
        o.LJIIIZ(uiSceneStates, "uiSceneStates");
        o.LJIIIZ(uiSceneAction, "uiSceneAction");
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJZI = shortVideoContext;
        this.LJZL = true;
        StringBuilder LIZ = X1D.LIZ();
        MusicObject musicObject = shortVideoContext.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            j = musicObject.userCount;
        } else {
            j = 0;
        }
        LIZ.append(C77123UOp.LJJIIJ(j));
        LIZ.append("video");
        X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        MusicObject musicObject2 = shortVideoContext.creativeModel.musicBuzModel.music;
        if (musicObject2 != null) {
            str = musicObject2.musicName;
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(" - ");
        MusicObject musicObject3 = shortVideoContext.creativeModel.musicBuzModel.music;
        LIZ2.append(musicObject3 != null ? musicObject3.authorName : null);
        X1D.LIZIZ(LIZ2);
        C82750Wdm c82750Wdm = uiSceneStates.LJ;
    }
}
