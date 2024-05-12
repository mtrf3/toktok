package com.ss.android.ugc.aweme.feed.assem.addyours;

import X.AbstractC220518l5;
import X.AbstractC226378uX;
import X.C16880lQ;
import X.C213688a4;
import X.C214348b8;
import X.C221018lt;
import X.C226338uT;
import X.C226348uU;
import X.C226388uY;
import X.C226398uZ;
import X.C226408ua;
import X.C226438ud;
import X.C226448ue;
import X.C5H3;
import X.C65352Pkq;
import X.C78598Ut0;
import X.C78685UuP;
import X.C8YN;
import X.TBT;
import Y.IDAListenerS72S0100000_3;
import Y.IDCListenerS253S0100000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.utils.Au2S14S0100000_3;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursEntranceButtonAssem extends BaseCellSlotComponent<AddYoursEntranceButtonAssem> {
    public View LLFII;
    public TuxIconView LLFZ;
    public TuxTextView LLI;
    public View LLIFFJFJJ;
    public TuxIconView LLII;
    public TuxTextView LLIIII;
    public View LLIIIILZ;
    public final C5H3 LLIIIJ;
    public final C5H3 LLIIIL;
    public AnimatorSet LLIIIZ;
    public boolean LLIIJI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.acb;
    }

    public AddYoursEntranceButtonAssem() {
        new LinkedHashMap();
        this.LLIIIJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C226438ud.INSTANCE);
        this.LLIIIL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(AddYoursEntranceButtonVM.class), C226448ue.INSTANCE);
    }

    public final void q4() {
        if (this.LLIIIZ != null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.LLIIIILZ;
        if (view != null) {
            ObjectAnimator topicFadeOutAnimator = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            View view2 = this.LLIFFJFJJ;
            if (view2 != null) {
                ObjectAnimator sloganFadeInAnimator = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                o.LJIIIIZZ(topicFadeOutAnimator, "topicFadeOutAnimator");
                topicFadeOutAnimator.addListener(new IDAListenerS72S0100000_3(this, 6));
                o.LJIIIIZZ(sloganFadeInAnimator, "sloganFadeInAnimator");
                sloganFadeInAnimator.addListener(new IDAListenerS72S0100000_3(this, 7));
                animatorSet.setDuration(300L);
                animatorSet.setStartDelay(5000L);
                animatorSet.playSequentially(topicFadeOutAnimator, sloganFadeInAnimator);
                this.LLIIIZ = animatorSet;
                return;
            }
            o.LJIJI("sloganContainer");
            throw null;
        }
        o.LJIJI("topicContainer");
        throw null;
    }

    public final void r4() {
        AnimatorSet animatorSet = this.LLIIIZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View view = this.LLIFFJFJJ;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.LLIFFJFJJ;
            if (view2 != null) {
                view2.setAlpha(0.0f);
                View view3 = this.LLIIIILZ;
                if (view3 != null) {
                    view3.setVisibility(0);
                    View view4 = this.LLIIIILZ;
                    if (view4 != null) {
                        view4.setAlpha(1.0f);
                        return;
                    } else {
                        o.LJIJI("topicContainer");
                        throw null;
                    }
                }
                o.LJIJI("topicContainer");
                throw null;
            }
            o.LJIJI("sloganContainer");
            throw null;
        }
        o.LJIJI("sloganContainer");
        throw null;
    }

    public final void u4() {
        AnimatorSet animatorSet = this.LLIIIZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.LLIIIZ != null || getContainerView().getMeasuredWidth() > 0) {
            C221018lt.LIZ("AddYoursEntranceButtonAssem", "safelyStartAnimator, animator start directly");
            q4();
            AnimatorSet animatorSet2 = this.LLIIIZ;
            if (animatorSet2 != null) {
                animatorSet2.start();
                return;
            }
            return;
        }
        getContainerView().addOnLayoutChangeListener(new IDCListenerS253S0100000_3(this, 3));
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        Aweme aweme;
        String str;
        AbstractC220518l5 LJIIIZ;
        AbstractC226378uX c226338uT;
        AddYoursRecommendation addYoursRecommendation;
        AddYoursRecommendation addYoursRecommendation2;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C221018lt.LIZ("AddYoursEntranceButtonAssem", "onBind");
        Aweme aweme2 = item.getAweme();
        if ((aweme2 != null && C226388uY.LJFF(aweme2)) || ((aweme = item.getAweme()) != null && C226388uY.LJI(aweme))) {
            Aweme aweme3 = item.getAweme();
            if (aweme3 != null && (addYoursRecommendation2 = aweme3.getAddYoursRecommendation()) != null) {
                str = addYoursRecommendation2.getTopicText();
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                Aweme aweme4 = item.getAweme();
                if (aweme4 != null) {
                    addYoursRecommendation = aweme4.getAddYoursRecommendation();
                } else {
                    addYoursRecommendation = null;
                }
                c226338uT = new C226348uU(addYoursRecommendation);
            } else {
                Aweme aweme5 = item.getAweme();
                if (aweme5 == null || (LJIIIZ = C78598Ut0.LJIIIZ(aweme5)) == null) {
                    return;
                } else {
                    c226338uT = new C226338uT(LJIIIZ);
                }
            }
            AssemViewModel assemViewModel = (AssemViewModel) this.LLIIIL.getValue();
            assemViewModel.getClass();
            assemViewModel.setState(new AqS169S0100000_3(c226338uT, 827));
            r4();
            Y3().setVisibility(0);
            TuxTextView tuxTextView = this.LLIIII;
            if (tuxTextView != null) {
                tuxTextView.setText(c226338uT.LIZIZ);
                if (this.LLIIJI) {
                    C221018lt.LIZ("AddYoursEntranceButtonAssem", "compensate animation once more when isAlreadySelected");
                    u4();
                    return;
                }
                return;
            }
            o.LJIJI("topicText");
            throw null;
        }
        Y3().setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.xa);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.addyours_entrance)");
        this.LLFII = findViewById;
        View findViewById2 = view.findViewById(R.id.xd);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.addyours_slogan_icon)");
        this.LLFZ = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.xe);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.addyours_slogan_text)");
        this.LLI = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.xc);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.addyours_slogan_container)");
        this.LLIFFJFJJ = findViewById4;
        View findViewById5 = view.findViewById(R.id.xg);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.addyours_topic_icon)");
        this.LLII = (TuxIconView) findViewById5;
        View findViewById6 = view.findViewById(R.id.xh);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.addyours_topic_text)");
        this.LLIIII = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.xf);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.addyours_topic_container)");
        this.LLIIIILZ = findViewById7;
        int LIZ = C226388uY.LIZ(R.raw.icon_camera_share_fill, R.raw.icon_camera_plus_fill);
        TuxIconView tuxIconView = this.LLFZ;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(LIZ);
            TuxIconView tuxIconView2 = this.LLII;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(LIZ);
                int LIZJ = C226388uY.LIZJ(R.string.bcp, R.string.bd4);
                TuxTextView tuxTextView = this.LLI;
                if (tuxTextView != null) {
                    tuxTextView.setText(LIZJ);
                    View view2 = this.LLFII;
                    if (view2 != null) {
                        C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 9), view2);
                        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.8ub
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C82B) obj).LJLJI;
                            }
                        }, C213688a4.LIZLLL(), C226398uZ.LJLIL, 4);
                        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.8uc
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C82B) obj).LJLJJI;
                            }
                        }, C213688a4.LIZLLL(), C226408ua.LJLIL, 4);
                        return;
                    }
                    o.LJIJI("entranceRoot");
                    throw null;
                }
                o.LJIJI("sloganText");
                throw null;
            }
            o.LJIJI("topicIcon");
            throw null;
        }
        o.LJIJI("sloganIcon");
        throw null;
    }
}
