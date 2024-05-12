package com.ss.android.ugc.feed.platform.cell.component.stickermanager;

import X.C221108m2;
import X.C224238r5;
import X.C245639kV;
import X.C62822Ol8;
import X.C90R;
import X.IWF;
import X.InterfaceC2302191t;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CellStickerManagerTemp implements CellStickerComponentAbility {
    public final VideoViewCell LJLIL;
    public final C224238r5 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C245639kV LJLJJI;
    public Context LJLJJL;
    public Fragment LJLJJLL;
    public InterfaceC2302191t LJLJL;
    public Aweme LJLJLJ;
    public BaseFeedPageParams LJLJLLL;
    public ViewGroup LJLL;

    public final CellStickerComponentAbility LIZIZ() {
        return (CellStickerComponentAbility) this.LJLJI.getValue();
    }

    public final boolean LIZJ() {
        BaseFeedPageParams baseFeedPageParams = this.LJLJLLL;
        if (baseFeedPageParams == null || baseFeedPageParams.isPlayListCleanMode() || this.LJLJJI == null) {
            return false;
        }
        return true;
    }

    public final void LIZ() {
        if (!C90R.LIZ() && !o.LJ("cell_story", this.LJLIL.gR()) && LIZJ()) {
            C245639kV c245639kV = this.LJLJJI;
            if (c245639kV != null) {
                c245639kV.LJIIJJI(this.LJLJLJ);
            }
            C245639kV c245639kV2 = this.LJLJJI;
            if (c245639kV2 != null) {
                c245639kV2.LJFF = IWF.LJJLIIIIJ();
            }
            C245639kV c245639kV3 = this.LJLJJI;
            if (c245639kV3 != null) {
                c245639kV3.LIZJ();
            }
        }
    }

    public final void LIZLLL() {
        if (!C90R.LIZ() && LIZJ()) {
            C245639kV c245639kV = this.LJLJJI;
            if (c245639kV != null) {
                c245639kV.LJIIJJI(this.LJLJLJ);
            }
            C245639kV c245639kV2 = this.LJLJJI;
            if (c245639kV2 != null) {
                c245639kV2.LJIIJ(this.LJLJJL, this.LJLJJLL);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void bs() {
        AbsInteractStickerWidget absInteractStickerWidget;
        if (C90R.LIZ()) {
            CellStickerComponentAbility LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.bs();
                return;
            }
            return;
        }
        C245639kV c245639kV = this.LJLJJI;
        if (c245639kV == null || (absInteractStickerWidget = c245639kV.LJIILIIL) == null) {
            return;
        }
        absInteractStickerWidget.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void r7(boolean z) {
        InteractStickerViewModel interactStickerViewModel;
        if (C90R.LIZ()) {
            CellStickerComponentAbility LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.r7(z);
                return;
            }
            return;
        }
        C245639kV c245639kV = this.LJLJJI;
        if (c245639kV == null || c245639kV.LJIILIIL == null || (interactStickerViewModel = c245639kV.LJIIIIZZ) == null) {
            return;
        }
        interactStickerViewModel.iv0(Boolean.valueOf(z), "interact_text_translate_status");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void u6(HashMap<String, String> hashMap) {
        InteractStickerViewModel interactStickerViewModel;
        if (C90R.LIZ()) {
            CellStickerComponentAbility LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.u6(hashMap);
                return;
            }
            return;
        }
        C245639kV c245639kV = this.LJLJJI;
        if (c245639kV == null || c245639kV.LJIILIIL == null || (interactStickerViewModel = c245639kV.LJIIIIZZ) == null) {
            return;
        }
        interactStickerViewModel.iv0(hashMap, "interact_text_translate_data");
    }

    public CellStickerManagerTemp(VideoViewCell videoViewCell, C224238r5 allScreenHelper) {
        o.LJIIIZ(allScreenHelper, "allScreenHelper");
        this.LJLIL = videoViewCell;
        this.LJLILLLLZI = allScreenHelper;
        this.LJLJJI = new C245639kV(videoViewCell);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1243));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void ac0(int i, int i2) {
        if (C90R.LIZ()) {
            CellStickerComponentAbility LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.ac0(i, i2);
                return;
            }
            return;
        }
        C245639kV c245639kV = this.LJLJJI;
        if (c245639kV == null) {
            return;
        }
        c245639kV.LJI(i, i2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void yj(float f, float f2, int i) {
        if (C90R.LIZ()) {
            CellStickerComponentAbility LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.yj(f, f2, i);
                return;
            }
            return;
        }
        C245639kV c245639kV = this.LJLJJI;
        if (c245639kV == null) {
            return;
        }
        c245639kV.LJII(f, f2, i);
    }
}
