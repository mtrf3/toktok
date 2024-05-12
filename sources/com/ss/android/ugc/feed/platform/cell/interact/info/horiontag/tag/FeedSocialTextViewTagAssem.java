package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C17N;
import X.C2055284u;
import X.C211108Qg;
import X.C211158Ql;
import X.C211178Qn;
import X.C214348b8;
import X.C221108m2;
import X.C253039wR;
import X.C27740Aue;
import X.C47261Igj;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C74275TDb;
import X.C8YN;
import X.TBT;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedSocialTextViewTagAssem extends BaseCellSlotComponent<FeedSocialTextViewTagAssem> {
    public static final int LLIFFJFJJ = C17N.LJIILL(5.0d);
    public final C5H3 LLFII;
    public final C62822Ol8 LLFZ;
    public TagLayout LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aeq;
    }

    public FeedSocialTextViewTagAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C211108Qg.INSTANCE);
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1305));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        List<AwemeTextLabelModel> list;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme == null || (list = aweme.textVideoLabels) == null || !(!list.isEmpty())) {
            return;
        }
        TagLayout tagLayout = this.LLI;
        if (tagLayout != null) {
            tagLayout.removeAllViews();
            List<AwemeTextLabelModel> list2 = aweme.textVideoLabels;
            if (list2 != null) {
                int i = 0;
                for (AwemeTextLabelModel awemeTextLabelModel : list2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        AwemeTextLabelModel awemeTextLabelModel2 = awemeTextLabelModel;
                        if (awemeTextLabelModel2 != null) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C74275TDb.LIZ(22.0f));
                            if (i == 0) {
                                layoutParams.leftMargin = (int) C74275TDb.LIZ(0.0f);
                            } else {
                                layoutParams.leftMargin = (int) C74275TDb.LIZ(7.0f);
                            }
                            TagLayout tagLayout2 = this.LLI;
                            if (tagLayout2 != null) {
                                View childAt = tagLayout2.getChildAt(i);
                                if (childAt == null) {
                                    Context context = getContainerView().getContext();
                                    o.LJIIIIZZ(context, "containerView.context");
                                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                                    TagLayout tagLayout3 = this.LLI;
                                    if (tagLayout3 != null) {
                                        tagLayout3.addView(tuxTextView, -1, layoutParams);
                                        q4(tuxTextView, awemeTextLabelModel2);
                                    } else {
                                        o.LJIJI("tagLayout");
                                        throw null;
                                    }
                                } else if (childAt instanceof TuxTextView) {
                                    q4((TuxTextView) childAt, awemeTextLabelModel2);
                                }
                            } else {
                                o.LJIJI("tagLayout");
                                throw null;
                            }
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            TagLayout tagLayout4 = this.LLI;
            if (tagLayout4 != null) {
                C253039wR.LIZIZ(tagLayout4);
                return;
            } else {
                o.LJIJI("tagLayout");
                throw null;
            }
        }
        o.LJIJI("tagLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.d8r);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.f…cial_video_tag_container)");
        this.LLI = (TagLayout) findViewById;
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8Qo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C211158Ql.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8Qp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C211178Qn.LJLIL, 6);
    }

    public static void q4(TuxTextView tuxTextView, AwemeTextLabelModel awemeTextLabelModel) {
        C253039wR.LIZJ(tuxTextView, awemeTextLabelModel);
        tuxTextView.setId(R.id.d8r);
        tuxTextView.setTag(Integer.valueOf(awemeTextLabelModel.getLabelType()));
        tuxTextView.setText(awemeTextLabelModel.getLabelName());
        C2055284u.LJ(tuxTextView, 61, false, 4);
        tuxTextView.setTextColor(ColorProtector.parseColor(awemeTextLabelModel.getTextColor()));
        tuxTextView.setGravity(16);
        tuxTextView.setBackgroundDrawable(C27740Aue.LIZJ(C17N.LJIILL(4.0d), ColorProtector.parseColor(awemeTextLabelModel.getBgColor())));
        int i = LLIFFJFJJ;
        tuxTextView.setPadding(i, 0, i, 0);
        tuxTextView.setSingleLine();
        tuxTextView.setMaxEms(20);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setVisibility(0);
        tuxTextView.setAlpha(1.0f);
    }
}
