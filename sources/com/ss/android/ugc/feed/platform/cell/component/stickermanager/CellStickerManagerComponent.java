package com.ss.android.ugc.feed.platform.cell.component.stickermanager;

import X.AnonymousClass918;
import X.AnonymousClass919;
import X.C214348b8;
import X.C221108m2;
import X.C222588oQ;
import X.C222918ox;
import X.C223278pX;
import X.C245639kV;
import X.C2K0;
import X.C51029K0z;
import X.C55096Ljo;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8YN;
import X.C91A;
import X.C92U;
import X.IWF;
import X.InterfaceC223648q8;
import X.InterfaceC55102Lju;
import X.TBT;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CellStickerManagerComponent extends BaseCellContentComponent implements C92U, InterfaceC223648q8, CellStickerComponentAbility, InterfaceC55102Lju {
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C5H3 LLFF;
    public FrameLayout LLFFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.91R
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJJLL;
            }
        }, null, AnonymousClass918.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.91Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJL;
            }
        }, null, C91A.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.91S
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLLLLL;
            }
        }, null, AnonymousClass919.LJLIL, 6);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -972069985) {
            return null;
        }
        return this;
    }

    public CellStickerManagerComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 900));
        this.LLD = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1242));
        this.LLF = C221108m2.LIZIZ(C222918ox.LJLIL);
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C223278pX.INSTANCE);
    }

    public final C245639kV c4() {
        return (C245639kV) this.LL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        c4().LJIIJJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
        c4().LIZLLL();
    }

    @Override // X.InterfaceC223648q8
    public final long LJZL() {
        return IWF.LJJLIIIIJ().getCurrentPosition();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        c4().LJIIIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid());
    }

    public final void b4() {
        BaseFeedPageParams baseFeedPageParams;
        if (!o.LJ("cell_story", a1().LIZ()) && (baseFeedPageParams = a1().LJ) != null && !baseFeedPageParams.isPlayListCleanMode()) {
            c4().LJIIJJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
            c4().LJFF = IWF.LJJLIIIIJ();
            c4().getClass();
            c4().LIZJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void bs() {
        AbsInteractStickerWidget absInteractStickerWidget = c4().LJIILIIL;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.LJIILLIIL();
        }
    }

    @Override // X.C92U
    public final AbsInteractStickerWidget h0() {
        Fragment fragment;
        InteractStickerWidget LIZ = StickerServiceImpl.LIZIZ().LIZ();
        LIZ.getClass();
        LIZ.LJLLI = this;
        C222588oQ c222588oQ = a1().LIZLLL;
        if (c222588oQ != null) {
            fragment = c222588oQ.LIZJ;
        } else {
            fragment = null;
        }
        WidgetManager Gl = WidgetManager.Gl(getContainerView(), fragment);
        o.LJIIIIZZ(Gl, "of(cellContext.params?.fragment, containerView)");
        Gl.Al(R.id.eq0, LIZ);
        LIZ.LJJ(C55096Ljo.LJIIZILJ(this));
        return LIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void onDestroyView() {
        AbsInteractStickerWidget absInteractStickerWidget = c4().LJIILIIL;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.onDestroyView();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (r12 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r2 != null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    @Override // X.C8XO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(com.ss.android.ugc.aweme.feed.model.VideoItemParams r20) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent.F0(java.lang.Object):void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFFF = (FrameLayout) view.findViewById(R.id.player_view);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void r7(boolean z) {
        InteractStickerViewModel interactStickerViewModel;
        C245639kV c4 = c4();
        if (c4.LJIILIIL != null && (interactStickerViewModel = c4.LJIIIIZZ) != null) {
            interactStickerViewModel.iv0(Boolean.valueOf(z), "interact_text_translate_status");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void u6(HashMap<String, String> hashMap) {
        InteractStickerViewModel interactStickerViewModel;
        C245639kV c4 = c4();
        if (c4.LJIILIIL != null && (interactStickerViewModel = c4.LJIIIIZZ) != null) {
            interactStickerViewModel.iv0(hashMap, "interact_text_translate_data");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        String str;
        C245639kV c4 = c4();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c4.LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void ac0(int i, int i2) {
        c4().LJI(i, i2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void yj(float f, float f2, int i) {
        c4().LJII(f, f2, i);
    }
}
