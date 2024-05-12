package com.ss.android.ugc.aweme.shortvideo.pugc;

import X.ARV;
import X.AnonymousClass636;
import X.C135315St;
import X.C221108m2;
import X.C41340GKi;
import X.C60191Njn;
import X.C62822Ol8;
import X.C6D8;
import X.GKY;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PUgcTemplateEditPreviewScene extends BaseScreenAdaptScene {
    public static AqS157S0100000_7 LLIIJI;
    public MutableLiveData<InfoStickerModel> LJLLI;
    public VideoPublishEditModel LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public C135315St LJLLLL;
    public GKY LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public C41340GKi LLIIIZ;
    public List<PUgcSlotData> LJLLLLLL = new ArrayList();
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 264));
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 268));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS157S0100000_7(this, 265));
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 263));
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 275));
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 276));
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 271));
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 272));
    public final C62822Ol8 LLI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 273));
    public final C62822Ol8 LLIFFJFJJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 269));
    public final C62822Ol8 LLII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 266));
    public final C62822Ol8 LLIIII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 277));
    public final C62822Ol8 LLIIIILZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 274));
    public final C62822Ol8 LLIIIJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 267));
    public final C62822Ol8 LLIIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 270));

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZIZ(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZJ(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LJIJI() {
    }

    public final View LLLI() {
        return (View) this.LJZL.getValue();
    }

    public final TuxIconView LLLII() {
        return (TuxIconView) this.LLII.getValue();
    }

    public final RecyclerView LLLIIII() {
        return (RecyclerView) this.LLIIIILZ.getValue();
    }

    public final ARV LLLIIIIL() {
        return (ARV) this.LLFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C135315St c135315St = this.LJLLLL;
        if (c135315St != null) {
            c135315St.LIZIZ();
            this.LJZ = false;
            LLIIJI = null;
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onPause() {
        super.onPause();
        this.LJZI = true;
        C135315St c135315St = this.LJLLLL;
        if (c135315St != null) {
            c135315St.LIZJ();
            LLLII().setVisibility(0);
        } else {
            o.LJIJI("presenter");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public final void onResume() {
        super.onResume();
        if (this.LJZI && this.LJZ) {
            C135315St c135315St = this.LJLLLL;
            if (c135315St != null) {
                c135315St.LIZLLL();
                LLLII().setVisibility(4);
                this.LJZ = true;
                return;
            }
            o.LJIJI("presenter");
            throw null;
        }
        if (LLLIIIIL().isChecked()) {
            C135315St c135315St2 = this.LJLLLL;
            if (c135315St2 != null) {
                c135315St2.LIZLLL();
                LLLII().setVisibility(4);
                this.LJZ = true;
                return;
            }
            o.LJIJI("presenter");
            throw null;
        }
        if (!this.LJZI) {
            C135315St c135315St3 = this.LJLLLL;
            if (c135315St3 != null) {
                c135315St3.LJIIIZ.LLJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        LLLII().setVisibility(0);
        this.LJZ = false;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public final void onStart() {
        Window window;
        super.onStart();
        C60191Njn.LIZJ(this.mActivity, true);
        Activity activity = this.mActivity;
        if (activity != null && (window = activity.getWindow()) != null) {
            Context context = this.mView.getContext();
            o.LJIIIIZZ(context, "view.context");
            window.setNavigationBarColor(AnonymousClass636.LJIIIIZZ(R.attr.c9, context));
        }
    }

    public final void LLLIIIL(boolean z) {
        int i;
        float f;
        float f2;
        float f3;
        View view = (View) this.LLIFFJFJJ.getValue();
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        ((View) this.LLIIIJ.getValue()).setEnabled(z);
        View LLLI = LLLI();
        float f4 = 0.4f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        LLLI.setAlpha(f);
        LLLI().setEnabled(z);
        View view2 = (View) this.LL.getValue();
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.4f;
        }
        view2.setAlpha(f2);
        ((View) this.LL.getValue()).setEnabled(z);
        View view3 = (View) this.LLD.getValue();
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.4f;
        }
        view3.setAlpha(f3);
        ((View) this.LLD.getValue()).setEnabled(z);
        RecyclerView LLLIIII = LLLIIII();
        if (z) {
            f4 = 1.0f;
        }
        LLLIIII.setAlpha(f4);
        LLLIIII().setEnabled(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0491  */
    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 1203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.pugc.PUgcTemplateEditPreviewScene.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.c9d, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
