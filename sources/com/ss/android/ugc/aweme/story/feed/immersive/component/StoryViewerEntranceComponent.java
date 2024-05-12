package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C16880lQ;
import X.C189297bp;
import X.C189517cB;
import X.C189567cG;
import X.C189577cH;
import X.C189587cI;
import X.C199897sv;
import X.C214348b8;
import X.C221138m5;
import X.C2K0;
import X.C55096Ljo;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77123UOp;
import X.C7E8;
import X.C7E9;
import X.C7EA;
import X.C7EB;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC74236TBo;
import X.KR8;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.ability.StoryViewerEntranceBridgeAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class StoryViewerEntranceComponent extends BaseCellSlotComponent implements StoryViewerEntranceBridgeAbility, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public TuxTextView LLFII;
    public TuxIconView LLFZ;
    public C199897sv LLI;
    public C189517cB LLIFFJFJJ;
    public final C5H3 LLII;
    public final InterfaceC115514g7 LLIIII;
    public final C221138m5 LLIIIILZ;

    static {
        TBT tbt = new TBT(StoryViewerEntranceComponent.class, "viewerEntranceVM", "getViewerEntranceVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/vm/StoryViewerEntranceViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cp5;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        int hashCode = hashCode();
        C62822Ol8 c62822Ol8 = C189297bp.LIZJ;
        ((Set) c62822Ol8.getValue()).remove(Integer.valueOf(hashCode));
        if (((Set) c62822Ol8.getValue()).isEmpty()) {
            C189297bp.LIZIZ = null;
        }
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 2039799461) {
            return null;
        }
        return this;
    }

    public StoryViewerEntranceComponent() {
        new LinkedHashMap();
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C189587cI.INSTANCE);
        C65776Prg LIZ = C65352Pkq.LIZ(StoryViewerEntranceViewModel.class);
        this.LLIIII = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 973), null, C189577cH.INSTANCE, null, null);
        this.LLIIIILZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 974));
    }

    public final StoryViewerEntranceViewModel q4() {
        return (StoryViewerEntranceViewModel) this.LLIIII.LIZ(this, LLIIIJ[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        C199897sv c199897sv = this.LLI;
        if (c199897sv == null) {
            return;
        }
        c199897sv.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLFII = (TuxTextView) view.findViewById(R.id.mqe);
        this.LLFZ = (TuxIconView) view.findViewById(R.id.e_o);
        this.LLI = (C199897sv) view.findViewById(R.id.na1);
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 21, 42, 42), view);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.7EE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJZI;
            }
        }, null, C189567cG.LJLIL, 6);
        ((Set) C189297bp.LIZJ.getValue()).add(Integer.valueOf(hashCode()));
        if (C189297bp.LIZIZ == null) {
            C189297bp.LIZIZ = new C189297bp();
        }
        C8YN.LJII(this, q4(), new TBT() { // from class: X.7cD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C189527cC) obj).LJLIL);
            }
        }, null, C7EA.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.7cE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C189527cC) obj).LJLILLLLZI);
            }
        }, null, C7EB.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.7cJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189527cC) obj).LJLJI;
            }
        }, null, C7E8.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.7cF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189527cC) obj).LJLJJI;
            }
        }, null, C7E9.LJLIL, 6);
    }

    public final void r4(long j) {
        String quantityString;
        TuxTextView tuxTextView = this.LLFII;
        int i = 0;
        if (tuxTextView != null) {
            if (j < 0) {
                quantityString = tuxTextView.getContext().getString(R.string.rq9);
            } else {
                quantityString = tuxTextView.getContext().getResources().getQuantityString(R.plurals.ux, (int) j, C77123UOp.LJJIIJ(j));
            }
            tuxTextView.setText(quantityString);
        }
        TuxIconView tuxIconView = this.LLFZ;
        if (tuxIconView == null) {
            return;
        }
        if (j <= 0) {
            i = 8;
        }
        tuxIconView.setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    @Override // com.ss.android.ugc.aweme.story.ability.StoryViewerEntranceBridgeAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dd0(android.content.Context r14, java.lang.String r15) {
        /*
            r13 = this;
            X.8O4 r0 = r13.a1()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.LJ
            r6 = 0
            if (r0 == 0) goto La5
            X.M89 r2 = r0.param
        Lb:
            X.8m5 r0 = r13.LLIIIILZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility r0 = (com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility) r0
            if (r0 == 0) goto L1a
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.ct0()
        L1a:
            X.7cB r3 = r13.LLIFFJFJJ
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r13)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
            X.8O4 r0 = r13.a1()
            X.8oQ r0 = r0.LIZLLL
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.LJ
            if (r0 == 0) goto L3c
            X.M89 r0 = r0.param
            if (r0 == 0) goto L3c
            java.lang.String r4 = r0.getFrom()
            if (r4 != 0) goto L92
        L3c:
            r5 = 1
        L3d:
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.7bx r7 = new X.7bx
            java.lang.String r11 = ""
            if (r2 == 0) goto L4e
            java.lang.String r8 = r2.getEventType()
            if (r8 != 0) goto L51
        L4e:
            r8 = r11
            if (r2 == 0) goto L90
        L51:
            java.lang.String r10 = X.C78596Usy.LJJIIZ(r2)
            java.lang.String r0 = r2.getFrom()
            if (r0 != 0) goto L8e
        L5b:
            if (r2 == 0) goto L8c
        L5d:
            int r12 = r2.getPageType()
        L61:
            r9 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity> r0 = com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity.class
            r4.<init>(r14, r0)
            java.lang.String r2 = r1.getAid()
            java.lang.String r0 = "id"
            r4.putExtra(r0, r2)
            java.lang.String r0 = "Story_insert_user_wrapper"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "is_single_mode"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "event_log_params"
            r4.putExtra(r0, r7)
            com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity.LJLLI = r1
            com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity.LJLLILLLL = r6
            X.C16880lQ.LIZJ(r14, r4)
            return
        L8c:
            r12 = 0
            goto L61
        L8e:
            r11 = r0
            goto L5d
        L90:
            r10 = r11
            goto L5b
        L92:
            java.lang.String r0 = "STORY_ENTRANCE_DEFAULT"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "STORY_ENTRANCE_ARCHIVE"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto La3
            goto L3c
        La3:
            r5 = 0
            goto L3d
        La5:
            r2 = r6
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent.dd0(android.content.Context, java.lang.String):void");
    }
}
