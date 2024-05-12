package com.ss.android.ugc.aweme.ui.feed;

import X.AnonymousClass820;
import X.AnonymousClass821;
import X.C2047881y;
import X.C2047981z;
import X.C207358Bv;
import X.C213688a4;
import X.C214348b8;
import X.C241249dQ;
import X.C3C8;
import X.C47261Igj;
import X.C55096Ljo;
import X.C5H3;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BasePhotoSlidesAssem<RECEIVER extends C3C8> extends BaseCellSlotComponent<RECEIVER> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIILZ;
    public final C5H3 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public LongPressLayout LLII;
    public final BasePhotoSlidesAssem$descExpandModeProtocol$1 LLIIII;

    static {
        TBT tbt = new TBT(BasePhotoSlidesAssem.class, "favoriteVM", "getFavoriteVM()Lcom/ss/android/ugc/aweme/feed/favorite/VideoFavoriteVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIILZ = new InterfaceC74236TBo[]{tbt};
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.ss.android.ugc.aweme.ui.feed.BasePhotoSlidesAssem$descExpandModeProtocol$1] */
    public BasePhotoSlidesAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C2047981z.INSTANCE);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoFavoriteVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1135), null, C2047881y.INSTANCE, null, null);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), AnonymousClass820.INSTANCE);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), AnonymousClass821.INSTANCE);
        this.LLIIII = new DescExpandModeProtocol(this) { // from class: com.ss.android.ugc.aweme.ui.feed.BasePhotoSlidesAssem$descExpandModeProtocol$1
            public final /* synthetic */ BasePhotoSlidesAssem<RECEIVER> LJLIL;

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                BaseCellSlotComponent baseCellSlotComponent = this.LJLIL;
                if (baseCellSlotComponent.LLFFF == 0) {
                    baseCellSlotComponent.Y3().setVisibility(0);
                }
            }

            {
                this.LJLIL = this;
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public void onParentSet() {
        super.onParentSet();
        if (((Number) C207358Bv.LIZ.getValue()).intValue() == 1) {
            return;
        }
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLIIII));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Object parent = getContainerView().getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        this.LLII = (LongPressLayout) ((View) parent).findViewById(R.id.long_press_layout);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.81x
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, null, new AqS185S0100000_3(this, 99), 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.822
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LLFFF;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 100), 4);
    }
}
