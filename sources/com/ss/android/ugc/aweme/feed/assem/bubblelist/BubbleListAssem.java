package com.ss.android.ugc.aweme.feed.assem.bubblelist;

import X.C209258Jd;
import X.C209268Je;
import X.C209278Jf;
import X.C209298Jh;
import X.C214348b8;
import X.C217628gQ;
import X.C221108m2;
import X.C32151Nz;
import X.C51029K0z;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C79004UzY;
import X.C83C;
import X.C83D;
import X.C86670Xzu;
import X.C8T7;
import X.C8YN;
import X.InterfaceC209288Jg;
import X.O6R;
import X.TBT;
import Y.IDLListenerS191S0100000_3;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BubbleListAssem extends BaseCellContentComponent<BubbleListAssem> implements ComponentPriorityProtocol {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public final C62822Ol8 LL;
    public final C5H3 LLD;
    public InterfaceC209288Jg LLF;
    public View LLFF;
    public View LLFFF;
    public int LLFII;
    public int LLFZ;
    public final IDLListenerS191S0100000_3 LLI;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* renamed from: a4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_social_bubble";
    }

    public BubbleListAssem() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 294));
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C209298Jh.INSTANCE);
        this.LLFII = -1;
        this.LLI = new IDLListenerS191S0100000_3(this, 3);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        InterfaceC209288Jg interfaceC209288Jg = this.LLF;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.LIZIZ();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        InterfaceC209288Jg interfaceC209288Jg = this.LLF;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.onDestroy();
        }
    }

    public final void e4() {
        View view = this.LLFF;
        if (view != null && C217628gQ.LIZIZ.LJIIIZ(a1().LIZ, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            c4(view);
            view.requestLayout();
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.LLI);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    public final int b4(View view) {
        if (C79004UzY.LJJII(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), false) && C217628gQ.LIZIZ.LJIIIZ(a1().LIZ, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            return (int) ((((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideo().getFakeLandscapeInfo().getBottom() * view.getMeasuredHeight()) + view.getTop());
        }
        return view.getBottom();
    }

    public final void c4(View view) {
        int i;
        int i2;
        Object obj;
        View view2;
        if (C86670Xzu.LJJIFFI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            i = 118;
        } else {
            i = 64;
        }
        Object parent = view.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        int height = ((View) parent).getHeight();
        if (this.LLFFF == null) {
            ViewParent parent2 = view.getParent();
            View view3 = null;
            if (parent2 != null) {
                obj = parent2.getParent();
            } else {
                obj = null;
            }
            if ((obj instanceof View) && (view2 = (View) obj) != null) {
                view3 = view2.findViewById(R.id.epl);
            }
            this.LLFFF = view3;
        }
        View view4 = this.LLFFF;
        if (view4 != null) {
            i2 = view4.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        int b4 = ((height - b4(view)) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i)))) - i2;
        InterfaceC209288Jg interfaceC209288Jg = this.LLF;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.LIZ(b4);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.8Ja
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C83C.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.8Jb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, null, C209258Jd.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.8Ji
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJL;
            }
        }, null, C209268Je.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.8Jc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C209278Jf.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.8Jj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LLF;
            }
        }, null, C83D.LJLIL, 6);
    }
}
