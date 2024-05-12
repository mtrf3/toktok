package com.ss.android.ugc.aweme.feed.assem.addiction;

import X.C16880lQ;
import X.C2055284u;
import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8PG;
import X.C8PJ;
import X.C8PK;
import X.C8PL;
import X.C8QI;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AntiAddictionToastAssem extends BaseCellSlotComponent<AntiAddictionToastAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final C5H3 LLI;
    public ViewGroup LLIFFJFJJ;

    static {
        TBT tbt = new TBT(AntiAddictionToastAssem.class, "antiAddictionVM", "getAntiAddictionVM()Lcom/ss/android/ugc/aweme/feed/assem/addiction/VideoAntiAddictionVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8PH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8PE) obj).LJLIL;
            }
        }, null, C8PG.LJLIL, 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aa2;
    }

    public AntiAddictionToastAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 278));
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoAntiAddictionVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 279), null, C8PK.INSTANCE, null, null);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C8PL.INSTANCE);
    }

    public final VideoAntiAddictionVM q4() {
        return (VideoAntiAddictionVM) this.LLFZ.LIZ(this, LLII[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void LLLZIIL() {
        q4().LJLJLLL.LIZIZ(VideoAntiAddictionVM.LJLLILLLL[0], null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LLIFFJFJJ = viewGroup;
        if (viewGroup != null) {
            tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.lz4);
        } else {
            tuxTextView = null;
        }
        ViewGroup viewGroup2 = this.LLIFFJFJJ;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.LLIFFJFJJ;
        if (viewGroup3 != null) {
            C16880lQ.LJIIL(viewGroup3, new View.OnClickListener() { // from class: X.8PO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        ViewGroup viewGroup4 = this.LLIFFJFJJ;
        if (viewGroup4 != null) {
            viewGroup4.setTag(C8QI.LJI, "no_click");
        }
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.8PM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJJLL;
            }
        }, null, C8PJ.LJLIL, 6);
        C2055284u.LIZJ(tuxTextView, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: p4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoAntiAddictionVM q4 = q4();
        q4.LJLJLLL.LIZIZ(VideoAntiAddictionVM.LJLLILLLL[0], getContext());
    }
}
