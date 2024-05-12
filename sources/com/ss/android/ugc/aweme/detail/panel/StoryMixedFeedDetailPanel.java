package com.ss.android.ugc.aweme.detail.panel;

import X.AbstractC51036K1g;
import X.AbstractC55082Lja;
import X.C16880lQ;
import X.C221108m2;
import X.C222938oz;
import X.C222978p3;
import X.C2MA;
import X.C50420Jqa;
import X.C54838Lfe;
import X.C55480Lq0;
import X.C55723Ltv;
import X.C62822Ol8;
import X.C73411SrX;
import X.C77123UOp;
import X.C78596Usy;
import X.C78996UzQ;
import X.C7F6;
import X.C7MY;
import X.C80985VqP;
import X.C8TC;
import X.InterfaceC224518rX;
import X.InterfaceC2302191t;
import X.InterfaceC55062LjG;
import X.InterfaceC72642tA;
import X.InterfaceC92963kq;
import X.InterfaceC98813uH;
import X.KQ1;
import X.M89;
import X.OSZ;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS6S0201000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryMixedFeedDetailPanel extends StoryDetailFragmentPanel {
    public final M89 LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxTextView LLJLIL;
    public InterfaceC224518rX LLJLILLLLZIIL;
    public C80985VqP LLJLL;
    public Bundle LLJLLIL;
    public C73411SrX LLJLLL;
    public final C62822Ol8 LLJZ;
    public long LLJZIJLIL;

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final boolean isStoryListPanel() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void LJII() {
        if (LLIILZL(this.LLJJJJJIL.getFrom())) {
            return;
        }
        super.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b7  */
    @Override // com.ss.android.ugc.aweme.detail.panel.StoryDetailFragmentPanel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIJLIL() {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel.LLIIJLIL():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.8rW] */
    public final InterfaceC224518rX LLIIL() {
        String str;
        String str2;
        String str3;
        User author;
        View view = null;
        if (!C8TC.LIZIZ.LIZ(getCurrentPlayAweme())) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", this.param.getEventType());
        M89 param = this.param;
        o.LJIIIIZZ(param, "param");
        bundle.putString("enter_position", C78596Usy.LJJIIZ(param));
        Aweme currentPlayAweme = getCurrentPlayAweme();
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        bundle.putString("group_id", str);
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            str2 = currentPlayAweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        bundle.putString("author_id", str2);
        Aweme currentPlayAweme3 = getCurrentPlayAweme();
        if (currentPlayAweme3 != null && (author = currentPlayAweme3.getAuthor()) != null) {
            str3 = Integer.valueOf(author.getFollowStatus()).toString();
        } else {
            str3 = null;
        }
        bundle.putString("follow_status", str3);
        this.LLJLLIL = bundle;
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        Fragment fragment = getFragment();
        if (fragment != null) {
            view = fragment.getView();
        }
        return imChatService.LJII(view, getChildFragmentManager(), bundle, getCurrentPlayAweme(), new InterfaceC92963kq() { // from class: X.8rW
            @Override // X.InterfaceC92963kq
            public final void LIZ(CharSequence emoji) {
                EmojiAnimPlayground emojiAnimPlayground;
                o.LJIIIZ(emoji, "emoji");
                StoryMixedFeedDetailPanel storyMixedFeedDetailPanel = StoryMixedFeedDetailPanel.this;
                C80985VqP c80985VqP = storyMixedFeedDetailPanel.LLJLL;
                if (c80985VqP == null) {
                    ViewStub viewStub = (ViewStub) storyMixedFeedDetailPanel.LLFII.findViewById(R.id.a5c);
                    View view2 = null;
                    if (viewStub != null) {
                        view2 = viewStub.inflate();
                    }
                    if (!(view2 instanceof EmojiAnimPlayground) || (emojiAnimPlayground = (EmojiAnimPlayground) view2) == null) {
                        return;
                    }
                    storyMixedFeedDetailPanel.LLJLL = new C80985VqP(emojiAnimPlayground);
                    emojiAnimPlayground.post(new ARunnableS22S0200000_3(storyMixedFeedDetailPanel, emoji, 9));
                    return;
                }
                c80985VqP.LIZJ(emoji.toString());
            }
        });
    }

    public final boolean LLIILII() {
        return ((Boolean) this.LLJZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void Ne() {
        if (LLIILZL(this.LLJJJJJIL.getFrom())) {
            return;
        }
        super.Ne();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final Aweme getCurrentPlayAweme() {
        if (LLIILZL(this.LLJJJJJIL.getFrom())) {
            C2MA curViewHolder = getCurViewHolder();
            if (curViewHolder != null) {
                return curViewHolder.getCurrentAweme();
            }
            return null;
        }
        return super.getCurrentPlayAweme();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final boolean hasMore() {
        if (LLIILZL(this.LLJJJJJIL.getFrom())) {
            return false;
        }
        return this.LJLLI;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean LLFZ() {
        return C222978p3.LIZ().postponeBottomAreaEnabled;
    }

    public final void LLIL() {
        String str;
        AwemeStatistics statistics;
        Aweme currentPlayAweme = getCurrentPlayAweme();
        if (currentPlayAweme != null && (statistics = currentPlayAweme.getStatistics()) != null) {
            str = C77123UOp.LJJIIJ(statistics.getPlayCount());
        } else {
            str = null;
        }
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView == null) {
            return;
        }
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        tuxTextView.setText(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void adaptation() {
        super.adaptation();
        if (LLIILII()) {
            C78996UzQ.LJJ(this.mBottomSpace);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public final void initPanel() {
        String str;
        IDetailPageAbility LIZ;
        super.initPanel();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initPanel current aweme id = ");
        Aweme currentPlayAweme = getCurrentPlayAweme();
        Integer num = null;
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(" and aweme type is ");
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            num = Integer.valueOf(currentPlayAweme2.getAwemeType());
        }
        LIZ2.append(num);
        X1D.LIZIZ(LIZ2);
        if (LLIILZL(this.LLJJJJJIL.getFrom()) && (LIZ = KQ1.LIZ(getFragment())) != null) {
            LIZ.P90();
        }
        if (LLIILII()) {
            C78996UzQ.LJJ(this.mBottomSpace);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC81205Vtx
    public final void o() {
        super.o();
        DetailFragmentPanel.LJLLI(this.LLJJJJLIIL, getFragment().getView(), 0);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC61452O9w
    public final void onAdapterFinish() {
        super.onAdapterFinish();
        if (LLIILII()) {
            C78996UzQ.LJJ(this.mBottomSpace);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC61452O9w
    public final void onAdapterStart() {
        super.onAdapterStart();
        if (LLIILII()) {
            C78996UzQ.LJJJJL(this.mBottomSpace);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageSelected() {
        String str;
        super.onPageSelected();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageSelected current aweme id =  ");
        Aweme currentPlayAweme = getCurrentPlayAweme();
        Integer num = null;
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" and aweme type is ");
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            num = Integer.valueOf(currentPlayAweme2.getAwemeType());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        LLIIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onResume() {
        super.onResume();
        C55480Lq0.LIZIZ.LIZLLL(249372176, 3);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onStoryPageSelected() {
        String str;
        super.onStoryPageSelected();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStoryPageSelected current aweme id =  ");
        Aweme currentPlayAweme = getCurrentPlayAweme();
        Integer num = null;
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" and aweme type is ");
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            num = Integer.valueOf(currentPlayAweme2.getAwemeType());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        LLIIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        String str;
        Integer num;
        String str2;
        Integer num2;
        super.q1();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showBottomView current aweme id =  ");
        Aweme currentPlayAweme = getCurrentPlayAweme();
        View view = null;
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" and aweme type is ");
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            num = Integer.valueOf(currentPlayAweme2.getAwemeType());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null) {
            return;
        }
        Boolean mMixDetailCleanMode = this.mMixDetailCleanMode;
        o.LJIIIIZZ(mMixDetailCleanMode, "mMixDetailCleanMode");
        if (mMixDetailCleanMode.booleanValue()) {
            return;
        }
        if (this.LLJLILLLLZIIL == null) {
            this.LLJLILLLLZIIL = LLIIL();
        }
        if (this.LLJJJJLIIL == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("createCreatorBottomView current aweme id =  ");
            Aweme currentPlayAweme3 = getCurrentPlayAweme();
            if (currentPlayAweme3 != null) {
                str2 = currentPlayAweme3.getAid();
            } else {
                str2 = null;
            }
            LIZ2.append(str2);
            LIZ2.append(" and aweme type is ");
            Aweme currentPlayAweme4 = getCurrentPlayAweme();
            if (currentPlayAweme4 != null) {
                num2 = Integer.valueOf(currentPlayAweme4.getAwemeType());
            } else {
                num2 = null;
            }
            LIZ2.append(num2);
            X1D.LIZIZ(LIZ2);
            ViewGroup viewGroup = (ViewGroup) getFragment().getView();
            if (viewGroup instanceof FrameLayout) {
                C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
                view = C7F6.LIZ(c55723Ltv.LJIIIIZZ(), "detail_feed_story_normal_creator_bottom", getContext(), R.layout.alw, null, viewGroup, false, 32);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(57));
                layoutParams.gravity = 80;
                this.LLJJL = view.findViewById(R.id.g56);
                this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.lth);
                LLIL();
                if (C54838Lfe.LJIILL(getCurrentPlayAweme())) {
                    View view2 = this.LLJJL;
                    if (view2 != null && view2.getVisibility() != 4) {
                        view2.setVisibility(4);
                    }
                } else {
                    View view3 = this.LLJJL;
                    if (view3 != null && view3.getVisibility() != 0) {
                        view3.setVisibility(0);
                    }
                }
                this.LLJL = view.findViewById(R.id.lb9);
                this.LLJLIL = (TuxTextView) view.findViewById(R.id.kl8);
                if (c55723Ltv.LJIILJJIL().LIZIZ()) {
                    View view4 = this.LLJL;
                    if (view4 != null) {
                        view4.setVisibility(0);
                    }
                    View view5 = this.LLJL;
                    if (view5 != null) {
                        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 15), view5);
                    }
                } else {
                    View view6 = this.LLJL;
                    if (view6 != null) {
                        view6.setVisibility(8);
                    }
                }
                view.setVisibility(8);
                viewGroup.addView(view, layoutParams);
            }
            this.LLJJJJLIIL = view;
            if (!C222978p3.LIZ().postponeBottomAreaEnabled) {
                return;
            }
            LLIIJLIL();
            return;
        }
        LLIIJLIL();
    }

    public StoryMixedFeedDetailPanel(M89 m89) {
        super(m89);
        this.LLJJJJJIL = m89;
        this.LLJZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 180));
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final List<Aweme> LJJZ(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        List<Aweme> LJJZ = super.LJJZ(abstractC51036K1g);
        if (LJJZ == null) {
            return null;
        }
        if ((!LJJZ.isEmpty()) && LLIILZL(this.LLJJJJJIL.getFrom())) {
            return LJJZ.subList(0, 1);
        }
        return LJJZ;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LLD(Aweme aweme) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setUpInsightBottomView current aweme id =  ");
        Integer num = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" and aweme type is ");
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        super.LLD(aweme);
    }

    public final boolean LLIILZL(String str) {
        if (LLIILII() && C55723Ltv.LIZIZ.LJIJ().LJIILJJIL(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC224378rJ
    public final void ZF(OSZ<Integer, ? extends Aweme> osz) {
        String str;
        super.ZF(osz);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDetailSuccess current aweme id =  ");
        Aweme currentPlayAweme = getCurrentPlayAweme();
        Integer num = null;
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" and aweme type is ");
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            num = Integer.valueOf(currentPlayAweme2.getAwemeType());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        if (LLIILZL(this.LLJJJJJIL.getFrom())) {
            return;
        }
        super.cb0(exc);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC224378rJ
    public final void fC(Exception exc) {
        String str;
        super.fC(exc);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDetailFailed current aweme id =  ");
        Aweme currentPlayAweme = getCurrentPlayAweme();
        Integer num = null;
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" and aweme type is ");
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            num = Integer.valueOf(currentPlayAweme2.getAwemeType());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onRenderFirstFrame(String str) {
        super.onRenderFirstFrame(str);
        C55480Lq0.LIZIZ.LIZ(249372176, true);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onViewHolderSelected(C2MA viewHolder) {
        InterfaceC224518rX interfaceC224518rX;
        o.LJIIIZ(viewHolder, "viewHolder");
        super.onViewHolderSelected(viewHolder);
        Aweme currentPlayAweme = getCurrentPlayAweme();
        if (currentPlayAweme != null && (interfaceC224518rX = this.LLJLILLLLZIIL) != null) {
            interfaceC224518rX.LLZL(currentPlayAweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC81205Vtx
    public final void za(int i) {
        super.za(i);
        DetailFragmentPanel.LJLLI(this.LLJJJJLIIL, getFragment().getView(), i);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        String str;
        int i;
        if (LLIILZL(this.LLJJJJJIL.getFrom())) {
            return;
        }
        super.J5(list, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRefreshResult current aweme id = ");
        Aweme currentPlayAweme = getCurrentPlayAweme();
        Integer num = null;
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" and aweme type is ");
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            num = Integer.valueOf(currentPlayAweme2.getAwemeType());
        }
        LIZ.append(num);
        LIZ.append(" and list size is ");
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        LLIIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        String str;
        int i;
        super.j0(list, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadMoreResult current aweme id = ");
        Aweme currentPlayAweme = getCurrentPlayAweme();
        Integer num = null;
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" and aweme type is ");
        Aweme currentPlayAweme2 = getCurrentPlayAweme();
        if (currentPlayAweme2 != null) {
            num = Integer.valueOf(currentPlayAweme2.getAwemeType());
        }
        LIZ.append(num);
        LIZ.append(" and list size is ");
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        LLIIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC81205Vtx
    public final void jk(float f, int i) {
        super.jk(f, i);
        View view = this.LLJJJJLIIL;
        if (view != null && view.getVisibility() == 0) {
            DetailFragmentPanel.LJLLI(this.LLJJJJLIIL, getFragment().getView(), (int) (f * i));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.StoryDetailFragmentPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        C222938oz c222938oz;
        Integer num;
        super.onViewCreated(view, bundle);
        C55480Lq0.LIZIZ.LIZLLL(249372176, 2);
        if (C222978p3.LIZ().preCreateCellEnabled) {
            InterfaceC55062LjG adapter = getAdapter();
            if ((adapter instanceof C222938oz) && (c222938oz = (C222938oz) adapter) != null) {
                String str = this.param.getExtra().get("story_extra_cell_preload_type");
                if (o.LJ(str, "1")) {
                    num = 13;
                } else if (!o.LJ(str, "2")) {
                    return;
                } else {
                    num = 14;
                }
                if (num != null) {
                    getViewPager().post(new ARunnableS6S0201000_3(num.intValue(), c222938oz, this, 1));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final AbstractC55082Lja createFeedPagerAdapter(Context context, LayoutInflater layoutInflater, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t interfaceC2302191t) {
        if (C222978p3.LIZ().preCreateCellEnabled && context != null && layoutInflater != null && interfaceC72642tA != null && fragment != null && onTouchListener != null && baseFeedPageParams != null && interfaceC2302191t != null) {
            return new C222938oz(context, layoutInflater, interfaceC72642tA, fragment, onTouchListener, baseFeedPageParams, interfaceC2302191t);
        }
        return super.createFeedPagerAdapter(context, layoutInflater, interfaceC72642tA, fragment, onTouchListener, baseFeedPageParams, interfaceC2302191t);
    }
}
