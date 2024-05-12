package com.ss.android.ugc.aweme.detail.panel;

import X.C130985Cc;
import X.C16880lQ;
import X.C207668Da;
import X.C221108m2;
import X.C224578rd;
import X.C2MA;
import X.C54029LIj;
import X.C55096Ljo;
import X.C57092Lx;
import X.C61447O9r;
import X.C62822Ol8;
import X.C86793Y4n;
import X.C8T5;
import X.H7B;
import X.InterfaceC55062LjG;
import X.LIN;
import X.M89;
import X.ORZ;
import X.OSZ;
import X.X1D;
import Y.IDiS267S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.detail.panel.PublishVideoPreviewPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractFullScreenAreaAttachAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PublishVideoPreviewPanel extends DetailFragmentPanel implements Observer<C207668Da> {
    public View LLJJJIL;
    public C130985Cc LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public final C62822Ol8 LLJJL;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LJLLLLLL(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        ViewGroup viewGroup;
        PublishPreviewInfo previewData;
        PublishPreviewInfo previewData2;
        CommentService.LIZ.getClass();
        CommentService LJJL = CommentServiceImpl.LJJL();
        View view = this.LLI;
        if (view == null) {
            view = getFragment().getView();
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        String enterFrom = getEnterFrom(true);
        String splitTag = getSplitTag();
        o.LJIIIIZZ(splitTag, "splitTag");
        this.LLII = LJJL.LIZLLL(view, childFragmentManager, enterFrom, this, this, splitTag);
        if (this.LLJJJJLIIL == null) {
            View view2 = this.LLI;
            if (view2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) view2;
            } else {
                viewGroup = null;
            }
            this.LLJJJJLIIL = viewGroup;
            this.LLJJJIL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ae6, this.LLJJJJLIIL, false);
            int i = C61447O9r.LJIILJJIL;
            C57092Lx.LIZ.getClass();
            int LIZ = C61447O9r.LIZ();
            if (i == 0) {
                i = LIZ;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
            layoutParams.gravity = 80;
            View view3 = this.LLJJJIL;
            if (view3 != null) {
                View findViewById = view3.findViewById(R.id.j8d);
                o.LJIIIIZZ(findViewById, "it.findViewById(R.id.round_progress_bar)");
                this.LLJJJJ = (C130985Cc) findViewById;
                View findViewById2 = view3.findViewById(R.id.ib2);
                o.LJIIIIZZ(findViewById2, "it.findViewById(R.id.progress_text)");
                TuxTextView tuxTextView = (TuxTextView) findViewById2;
                this.LLJJJJJIL = tuxTextView;
                tuxTextView.setTextColorRes(R.attr.dj);
            }
            ViewGroup viewGroup2 = this.LLJJJJLIIL;
            if (viewGroup2 != null) {
                viewGroup2.addView(this.LLJJJIL, layoutParams);
            }
        }
        LJLZ(false);
        Aweme LJJLJ = LJJLJ();
        if (LJJLJ != null && (previewData2 = LJJLJ.getPreviewData()) != null && !previewData2.getInPublishing()) {
            View view4 = this.LLJJJIL;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            LJLZ(true);
            return;
        }
        Aweme LJJLJ2 = LJJLJ();
        if (LJJLJ2 == null || (previewData = LJJLJ2.getPreviewData()) == null || !previewData.getInPublishing()) {
            return;
        }
        View view5 = this.LLJJJIL;
        if (view5 != null) {
            view5.setVisibility(0);
        }
        LJLZ(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.8re] */
    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public final void initPanel() {
        super.initPanel();
        DataCenter dataCenter = (DataCenter) this.LLJJL.getValue();
        dataCenter.iv0("PUBLISH_VIDEO_START", this, false);
        dataCenter.iv0("PUBLISH_VIDEO_PROGRESS", this, false);
        dataCenter.iv0("PUBLISH_VIDEO_SUCCESS", this, false);
        dataCenter.iv0("PUBLISH_VIDEO_FAIL", this, false);
        dataCenter.iv0("PUBLISH_VIDEO_COMPILE_DONE", this, false);
        this.mViewPager.LJI(new IDiS267S0100000_3(this, 2));
        C54029LIj.LIZIZ.LJJJI(new LIN() { // from class: X.8re
            @Override // X.LIN
            public final void LIZ(Aweme aweme) {
                String str;
                o.LJIIIZ(aweme, "aweme");
                String aid = aweme.getAid();
                Aweme currentAweme = PublishVideoPreviewPanel.this.getCurrentAweme();
                if (currentAweme != null) {
                    str = currentAweme.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(aid, str)) {
                    PublishVideoPreviewPanel.this.tryResumePlay();
                }
            }
        });
    }

    public PublishVideoPreviewPanel(M89 m89) {
        super(m89);
        this.LLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 179));
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LLD(Aweme aweme) {
        int i = 0;
        if (aweme != null) {
            PublishPreviewInfo previewData = aweme.getPreviewData();
            if (previewData != null && previewData.getInPublishing()) {
                LJLZ(false);
                PublishPreviewInfo previewData2 = aweme.getPreviewData();
                if (previewData2 != null) {
                    i = previewData2.getProgress();
                }
                LLIILII(i);
                return;
            }
            PublishPreviewInfo previewData3 = aweme.getPreviewData();
            if (previewData3 != null && !previewData3.getInPublishing()) {
                LJLZ(true);
                return;
            }
        }
        LJLZ(false);
    }

    public final void LLIIJLIL(String str) {
        String str2;
        C2MA curViewHolder;
        RootCellComponent LJJIII;
        InteractFullScreenAreaAttachAbility interactFullScreenAreaAttachAbility;
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme != null) {
            str2 = currentAweme.getScheduleId();
        } else {
            str2 = null;
        }
        if (o.LJ(str2, str) && (curViewHolder = getCurViewHolder()) != null && (LJJIII = C86793Y4n.LJJIII(curViewHolder)) != null && (interactFullScreenAreaAttachAbility = (InteractFullScreenAreaAttachAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(LJJIII), InteractFullScreenAreaAttachAbility.class, null)) != null) {
            interactFullScreenAreaAttachAbility.show();
        }
    }

    public final void LLIILII(int i) {
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append('%');
            tuxTextView.setText(X1D.LIZIZ(LIZ));
            C130985Cc c130985Cc = this.LLJJJJ;
            if (c130985Cc != null) {
                c130985Cc.setProgress(i / 100.0f);
                return;
            } else {
                o.LJIJI("roundProgressBar");
                throw null;
            }
        }
        o.LJIJI("progressText");
        throw null;
    }

    public final void LLIILZL(String str) {
        Aweme aweme;
        String str2;
        RootCellComponent LJJIII;
        RootCellComponent LJJIII2;
        Iterator<Aweme> it = getAdapter().Q8().iterator();
        while (true) {
            if (it.hasNext()) {
                aweme = it.next();
                if (o.LJ(aweme.getScheduleId(), str)) {
                    break;
                }
            } else {
                aweme = null;
                break;
            }
        }
        Aweme aweme2 = aweme;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        C2MA viewHolderByAwemeId = getViewHolderByAwemeId(str2);
        if (viewHolderByAwemeId != null && (LJJIII2 = C86793Y4n.LJJIII(viewHolderByAwemeId)) != null) {
            LJJIII2.D3(C8T5.LEFT_AREA, false, null);
        }
        C2MA viewHolderByAwemeId2 = getViewHolderByAwemeId(str2);
        if (viewHolderByAwemeId2 != null && (LJJIII = C86793Y4n.LJJIII(viewHolderByAwemeId2)) != null) {
            LJJIII.AU(0.5f, R.string.tfy, false);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        Aweme aweme;
        PublishPreviewInfo previewData;
        Aweme aweme2;
        String str2;
        RootCellComponent LJJIII;
        RootCellComponent LJJIII2;
        String str3;
        C207668Da c207668Da2 = c207668Da;
        Object obj = null;
        if (c207668Da2 == null || (str = c207668Da2.LIZ) == null) {
            return;
        }
        switch (str.hashCode()) {
            case -259883566:
                if (!str.equals("PUBLISH_VIDEO_FAIL")) {
                    return;
                }
                H7B.LIZ("PublishVideoPreviewPanel -> PUBLISH_VIDEO_FAIL");
                Object obj2 = c207668Da2.LIZIZ;
                if (obj2 == null) {
                    obj2 = null;
                }
                String str4 = (String) ((OSZ) obj2).getFirst();
                Aweme currentAweme = getCurrentAweme();
                if (currentAweme != null) {
                    obj = currentAweme.getScheduleId();
                }
                if (!o.LJ(str4, obj)) {
                    return;
                }
                View view = this.LLJJJIL;
                if (view != null) {
                    view.setVisibility(8);
                }
                LLIIJLIL(str4);
                LJLZ(false);
                return;
            case 546108430:
                if (!str.equals("PUBLISH_VIDEO_START")) {
                    return;
                }
                Object obj3 = c207668Da2.LIZIZ;
                if (obj3 == null) {
                    obj3 = null;
                }
                Object first = ((OSZ) obj3).getFirst();
                Aweme currentAweme2 = getCurrentAweme();
                if (currentAweme2 != null) {
                    str3 = currentAweme2.getScheduleId();
                } else {
                    str3 = null;
                }
                if (!o.LJ(str3, first)) {
                    return;
                }
                View view2 = this.LLJJJIL;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                TuxTextView tuxTextView = this.LLJJJJJIL;
                if (tuxTextView != null) {
                    tuxTextView.setText("0%");
                    return;
                } else {
                    o.LJIJI("progressText");
                    throw null;
                }
            case 854208687:
                if (!str.equals("PUBLISH_VIDEO_SUCCESS")) {
                    return;
                }
                H7B.LIZ("PublishVideoPreviewPanel -> PUBLISH_VIDEO_SUCCESS -> showRetry");
                Object obj4 = c207668Da2.LIZIZ;
                if (obj4 == null) {
                    obj4 = null;
                }
                OSZ osz = (OSZ) obj4;
                String str5 = (String) osz.getFirst();
                Iterator<Aweme> it = getAdapter().Q8().iterator();
                while (true) {
                    if (it.hasNext()) {
                        aweme2 = it.next();
                        if (o.LJ(aweme2.getScheduleId(), str5)) {
                        }
                    } else {
                        aweme2 = null;
                    }
                }
                Aweme aweme3 = aweme2;
                if (aweme3 != null) {
                    str2 = aweme3.getAid();
                } else {
                    str2 = null;
                }
                C2MA viewHolderByAwemeId = getViewHolderByAwemeId(str2);
                if (viewHolderByAwemeId != null && (LJJIII2 = C86793Y4n.LJJIII(viewHolderByAwemeId)) != null) {
                    LJJIII2.D3(C8T5.LEFT_AREA, true, null);
                }
                C2MA viewHolderByAwemeId2 = getViewHolderByAwemeId(str2);
                if (viewHolderByAwemeId2 != null && (LJJIII = C86793Y4n.LJJIII(viewHolderByAwemeId2)) != null) {
                    LJJIII.AU(1.0f, -1, true);
                }
                Aweme currentAweme3 = getCurrentAweme();
                if (currentAweme3 != null) {
                    obj = currentAweme3.getScheduleId();
                }
                if (o.LJ(str5, obj)) {
                    View view3 = this.LLJJJIL;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    LJLZ(true);
                }
                LLIIL(((C224578rd) osz.getSecond()).LJLJI, str5);
                return;
            case 1462074594:
                if (!str.equals("PUBLISH_VIDEO_COMPILE_DONE")) {
                    return;
                }
                H7B.LIZ("PublishVideoPreviewPanel -> mCoverMaskView -> PUBLISH_VIDEO_COMPILE_DONE");
                Object obj5 = c207668Da2.LIZIZ;
                if (obj5 != null) {
                    obj = obj5;
                }
                OSZ osz2 = (OSZ) obj;
                LLIIL(((C224578rd) osz2.getSecond()).LJLJI, (String) osz2.getFirst());
                return;
            case 1757275873:
                if (!str.equals("PUBLISH_VIDEO_PROGRESS")) {
                    return;
                }
                Object obj6 = c207668Da2.LIZIZ;
                if (obj6 == null) {
                    obj6 = null;
                }
                OSZ osz3 = (OSZ) obj6;
                String str6 = (String) osz3.getFirst();
                int intValue = ((Number) osz3.getSecond()).intValue();
                LLIILZL(str6);
                Iterator<Aweme> it2 = getAdapter().Q8().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aweme = it2.next();
                        if (o.LJ(aweme.getScheduleId(), str6)) {
                        }
                    } else {
                        aweme = null;
                    }
                }
                Aweme aweme4 = aweme;
                if (aweme4 != null && (previewData = aweme4.getPreviewData()) != null) {
                    previewData.setProgress(intValue);
                }
                Aweme currentAweme4 = getCurrentAweme();
                if (currentAweme4 != null) {
                    obj = currentAweme4.getScheduleId();
                }
                if (!o.LJ(str6, obj)) {
                    return;
                }
                LJLZ(false);
                View view4 = this.LLJJJIL;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                LLIILII(intValue);
                return;
            default:
                return;
        }
    }

    public final void LLIIL(Aweme aweme, String str) {
        List<Aweme> Q8;
        InterfaceC55062LjG adapter = getAdapter();
        if (adapter != null && (Q8 = adapter.Q8()) != null) {
            List<Aweme> LLJILJILJ = ORZ.LLJILJILJ(Q8);
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(((Aweme) it.next()).getScheduleId(), str)) {
                    if (i >= 0) {
                        ListProtector.set(LLJILJILJ, i, aweme);
                    }
                } else {
                    i++;
                }
            }
            LJLLJ(LLJILJILJ, false);
        }
    }
}
