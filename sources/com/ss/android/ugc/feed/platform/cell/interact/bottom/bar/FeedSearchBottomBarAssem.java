package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C0H1;
import X.C16880lQ;
import X.C2055284u;
import X.C223438pn;
import X.C223458pp;
import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C72242sW;
import X.M89;
import X.XI7;
import X.Z9N;
import Y.ACListenerS29S0300000_3;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedSearchBottomBarAssem extends BaseCellSlotComponent<FeedSearchBottomBarAssem> {
    public ConstraintLayout LLFII;
    public String LLFZ;
    public final FeedSearchBottomBarAssem$descExpandModeProtocol$1 LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aac;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem$descExpandModeProtocol$1] */
    public FeedSearchBottomBarAssem() {
        new LinkedHashMap();
        this.LLFZ = "";
        this.LLI = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                FeedSearchBottomBarAssem.this.Y3().setVisibility(0);
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLI));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        M89 m89;
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String str2;
        String str3;
        WordStruct wordStruct;
        final VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        final XI7 LIZIZ = C223438pn.LIZIZ(item);
        boolean LIZ = C223438pn.LIZ(LIZIZ);
        ConstraintLayout constraintLayout = this.LLFII;
        if (constraintLayout != null) {
            if (LIZ) {
                constraintLayout.setVisibility(0);
                TextView textView = (TextView) constraintLayout.findViewById(R.id.jga);
                TuxIconView tuxIconView = null;
                if (textView != null && (commentSuggestWordList = item.getAweme().getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
                    for (SuggestWordStruct suggestWordStruct : suggestWords) {
                        if (suggestWordStruct != null) {
                            str2 = suggestWordStruct.getScene();
                        } else {
                            str2 = null;
                        }
                        if (o.LJ(str2, "feed_bar")) {
                            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) suggestWordStruct.getHintText());
                            List<WordStruct> words = suggestWordStruct.getWords();
                            if (words != null && (wordStruct = (WordStruct) ListProtector.get(words, 0)) != null) {
                                str3 = wordStruct.getWord();
                            } else {
                                str3 = null;
                            }
                            textView.setText(append.append((CharSequence) String.valueOf(str3)));
                        }
                    }
                }
                ConstraintLayout constraintLayout2 = this.LLFII;
                if (constraintLayout2 != null) {
                    tuxIconView = (TuxIconView) constraintLayout2.findViewById(R.id.bpf);
                }
                if (((Number) C223458pp.LIZ.getValue()).intValue() == 1 && tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_magnifying_glass_fill);
                }
                BaseFeedPageParams baseFeedPageParams = item.baseFeedPageParams;
                if (baseFeedPageParams == null || (m89 = baseFeedPageParams.param) == null || (str = m89.getTabName()) == null) {
                    str = "";
                }
                this.LLFZ = str;
                final C72242sW c72242sW = new C72242sW();
                ConstraintLayout constraintLayout3 = this.LLFII;
                if (constraintLayout3 != null) {
                    constraintLayout3.setOnTouchListener(new View.OnTouchListener() { // from class: X.8po
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Context context;
                            boolean z = true;
                            if (motionEvent != null) {
                                if (motionEvent.getAction() == 0) {
                                    C72242sW.this.element = System.currentTimeMillis();
                                    Z9N z9n = Z9N.LIZIZ;
                                    ConstraintLayout constraintLayout4 = this.LLFII;
                                    if (constraintLayout4 != null) {
                                        context = constraintLayout4.getContext();
                                    } else {
                                        context = null;
                                    }
                                    FeedSearchBottomBarAssem feedSearchBottomBarAssem = this;
                                    VideoItemParams videoItemParams2 = item;
                                    XI7 xi7 = LIZIZ;
                                    feedSearchBottomBarAssem.getClass();
                                    z9n.LLLLLLIL(context, FeedSearchBottomBarAssem.q4(videoItemParams2, xi7));
                                } else if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
                                    if (motionEvent.getAction() != 3) {
                                        z = false;
                                    }
                                    Z9N z9n2 = Z9N.LIZIZ;
                                    z9n2.LIZ.LLLIIII(C72242sW.this.element, "related_search_anchor_v2", z);
                                }
                            }
                            return false;
                        }
                    });
                }
                ConstraintLayout constraintLayout4 = this.LLFII;
                if (constraintLayout4 != null) {
                    C16880lQ.LJIL(constraintLayout4, new ACListenerS29S0300000_3(this, item, LIZIZ, 14));
                    return;
                }
                return;
            }
            constraintLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ConstraintLayout) view.findViewById(R.id.d75);
        C2055284u.LIZJ((TuxTextView) view.findViewById(R.id.jga), null);
    }

    public static Bundle q4(VideoItemParams videoItemParams, XI7 xi7) {
        String str;
        LogPbBean logPbBean;
        String imprId;
        M89 m89;
        Bundle LIZ = C0H1.LIZ("in_single_stack", "true");
        LIZ.putString("keyword", (String) xi7.LIZ);
        LIZ.putBoolean("set_hint_by_sug_word", true);
        LIZ.putString("is_feed_liked", String.valueOf(videoItemParams.getAweme().isLike()));
        LIZ.putString("is_feed_collected", String.valueOf(videoItemParams.getAweme().isCollected()));
        LIZ.putString("is_feed_comment_clicked", String.valueOf(videoItemParams.getAweme().isCommentClicked()));
        LIZ.putString("is_feed_forward_clicked", String.valueOf(videoItemParams.getAweme().isForwardClicked()));
        LIZ.putString("search_position", videoItemParams.mEventType);
        LIZ.putString("back_flag", "1");
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null && (m89 = baseFeedPageParams.param) != null) {
            str = m89.getTabName();
        } else {
            str = null;
        }
        LIZ.putString("tab_name", str);
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (logPbBean = aweme.getLogPbBean()) != null && (imprId = logPbBean.getImprId()) != null) {
            LIZ.putString("preClickImprId", imprId);
        }
        Z9N z9n = Z9N.LIZIZ;
        String str2 = videoItemParams.mEventType;
        o.LJIIIIZZ(str2, "item.eventType");
        if (!z9n.LIZ.LLIIZ(str2)) {
            LIZ.putString("is_from_video", "1");
        }
        LIZ.putString("group_id", videoItemParams.getAweme().getAid());
        LIZ.putString("enter_from", videoItemParams.mEventType);
        LIZ.putString("enter_method", "related_search_anchor_v2");
        return LIZ;
    }
}
