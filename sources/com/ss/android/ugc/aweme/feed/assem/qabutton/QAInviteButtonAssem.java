package com.ss.android.ugc.aweme.feed.assem.qabutton;

import X.C16880lQ;
import X.C214348b8;
import X.C221108m2;
import X.C32151Nz;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C7MY;
import X.C8RW;
import X.C8RX;
import X.C8T7;
import X.C8YN;
import X.C90053g9;
import X.HG3;
import X.L2J;
import X.O6R;
import X.RBX;
import X.TBT;
import Y.ACListenerS18S1300000_12;
import Y.ARunnableS37S0100000_1;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class QAInviteButtonAssem extends BaseCellSlotComponent<QAInviteButtonAssem> implements PriorityProtocol {
    public final C62822Ol8 LLFII;
    public VideoItemParams LLFZ;
    public LinearLayout LLI;
    public final C5H3 LLIFFJFJJ;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.afd;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_qa_invite";
    }

    public QAInviteButtonAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 355));
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8RW.INSTANCE);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View m8() {
        return getContainerView();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        List<InteractStickerStruct> interactStickerStructs;
        InteractStickerStruct interactStickerStruct;
        QaStruct qaStruct;
        PriorityAbility priorityAbility;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFZ = item;
        if (!item.getAweme().isAd()) {
            Aweme aweme = item.getAweme();
            if (aweme != null) {
                str = aweme.getAuthorUid();
            } else {
                str = null;
            }
            if (!o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId()) || aweme == null || (interactStickerStructs = aweme.getInteractStickerStructs()) == null) {
                return;
            }
            Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
            while (true) {
                if (it.hasNext()) {
                    interactStickerStruct = it.next();
                    if (interactStickerStruct.getType() == 17) {
                        break;
                    }
                } else {
                    interactStickerStruct = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
            if (interactStickerStruct2 == null || (qaStruct = interactStickerStruct2.getQaStruct()) == null || !o.LJ(String.valueOf(qaStruct.getItemId()), aweme.getAid()) || (priorityAbility = (PriorityAbility) this.LLFII.getValue()) == null) {
                return;
            }
            priorityAbility.Es(this, null, new AqS169S0100000_3(this, 988));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLI = (LinearLayout) view.findViewById(R.id.ih0);
        if (L2J.LIZ()) {
            LinearLayout linearLayout = this.LLI;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = C7MY.LIZIZ(32);
                    marginLayoutParams.topMargin = C7MY.LIZIZ(0);
                    linearLayout.setLayoutParams(marginLayoutParams);
                    Drawable background = linearLayout.getBackground();
                    if (background instanceof GradientDrawable) {
                        ((GradientDrawable) background).setCornerRadius(C32151Nz.LJIIZILJ(5));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ih1);
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        }
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.8RY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJZL;
            }
        }, null, C8RX.LJLIL, 6);
    }

    public final void q4(boolean z) {
        Fragment fragment;
        String str;
        List<InteractStickerStruct> interactStickerStructs;
        InteractStickerStruct interactStickerStruct;
        QaStruct qaStruct;
        VideoItemParams videoItemParams = this.LLFZ;
        if (videoItemParams == null) {
            return;
        }
        boolean equals = TextUtils.equals("from_publish_add_video", videoItemParams.mFrom);
        if (QnaService.LIZ().enablePublicQna() && (fragment = videoItemParams.fragment) != null && fragment.mo49getActivity() != null && !equals) {
            Fragment fragment2 = videoItemParams.fragment;
            Aweme aweme = videoItemParams.getAweme();
            LinearLayout linearLayout = this.LLI;
            String str2 = videoItemParams.mEventType;
            if (fragment2 == null || !fragment2.isVisible() || fragment2.isDetached() || fragment2.getContext() == null || linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            if (C90053g9.LIZIZ) {
                return;
            }
            if (!z) {
                C90053g9.LIZIZ = false;
            }
            if (aweme != null) {
                str = aweme.getAuthorUid();
            } else {
                str = null;
            }
            if (!o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId()) || aweme == null || (interactStickerStructs = aweme.getInteractStickerStructs()) == null) {
                return;
            }
            Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
            while (true) {
                if (it.hasNext()) {
                    interactStickerStruct = it.next();
                    if (interactStickerStruct.getType() == 17) {
                        break;
                    }
                } else {
                    interactStickerStruct = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
            if (interactStickerStruct2 == null || (qaStruct = interactStickerStruct2.getQaStruct()) == null || !o.LJ(String.valueOf(qaStruct.getItemId()), aweme.getAid())) {
                return;
            }
            if (z) {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS37S0100000_1(linearLayout, 159), 4500L);
            } else {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS37S0100000_1(linearLayout, 160), 500L);
            }
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS18S1300000_12(aweme, fragment2, qaStruct, str2, 1));
            return;
        }
        LinearLayout linearLayout2 = this.LLI;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }
}
