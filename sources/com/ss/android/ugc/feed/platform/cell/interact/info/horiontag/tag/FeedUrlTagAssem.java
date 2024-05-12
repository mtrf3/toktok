package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C16880lQ;
import X.C17N;
import X.C2055284u;
import X.C211168Qm;
import X.C27740Aue;
import X.C42398GkU;
import X.C47261Igj;
import X.C51540KKq;
import X.C62846OlW;
import X.C74275TDb;
import X.C78765Uvh;
import X.C86V;
import X.O6R;
import X.QZZ;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedUrlTagAssem extends BaseCellSlotComponent<FeedUrlTagAssem> {
    public TagLayout LLFII;
    public TuxTextView LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aeq;
    }

    public FeedUrlTagAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String LIZ;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme == null) {
            return;
        }
        List<AwemeLabelModel> list = aweme.videoLabels;
        if (list != null && (!list.isEmpty())) {
            TagLayout tagLayout = this.LLFII;
            if (tagLayout != null) {
                tagLayout.removeAllViews();
                int i = 0;
                for (AwemeLabelModel awemeLabelModel : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        AwemeLabelModel awemeLabelModel2 = awemeLabelModel;
                        if (awemeLabelModel2 != null) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C74275TDb.LIZ(22.0f));
                            if (i == 0) {
                                layoutParams.leftMargin = (int) C74275TDb.LIZ(0.0f);
                            } else {
                                layoutParams.leftMargin = (int) C74275TDb.LIZ(7.0f);
                            }
                            C62846OlW c62846OlW = new C62846OlW(getContainerView().getContext());
                            c62846OlW.setVisibility(0);
                            c62846OlW.setAlpha(1.0f);
                            TagLayout tagLayout2 = this.LLFII;
                            if (tagLayout2 != null) {
                                tagLayout2.addView(c62846OlW, i, layoutParams);
                                UrlModel urlModels = awemeLabelModel2.getUrlModels();
                                Integer valueOf = Integer.valueOf(awemeLabelModel2.getLabelType());
                                c62846OlW.setTag(valueOf);
                                c62846OlW.setScaleType(ImageView.ScaleType.FIT_XY);
                                if (valueOf == null || valueOf.intValue() != 3) {
                                    if (urlModels != null) {
                                        getContainerView().getContext();
                                        C78765Uvh.LJII(c62846OlW, urlModels, new C51540KKq(c62846OlW));
                                    }
                                } else {
                                    c62846OlW.setVisibility(8);
                                    TagLayout tagLayout3 = this.LLFII;
                                    if (tagLayout3 != null) {
                                        C16880lQ.LLFF(tagLayout3, c62846OlW);
                                    } else {
                                        o.LJIJI("tagLayout");
                                        throw null;
                                    }
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
            } else {
                o.LJIJI("tagLayout");
                throw null;
            }
        }
        RelationDynamicLabel relationLabel = aweme.getRelationLabel();
        if (relationLabel == null || !relationLabel.isValid()) {
            return;
        }
        int i3 = 16;
        if (this.LLFZ == null) {
            Context context = getContext();
            if (context != null) {
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                C2055284u.LJ(tuxTextView, 61, false, 4);
                tuxTextView.setTextColor(C86V.LIZIZ(R.color.kv));
                tuxTextView.setGravity(16);
                tuxTextView.setBackgroundDrawable(C27740Aue.LIZJ(C17N.LJIILL(4.0d), C86V.LIZIZ(R.color.ar)));
                tuxTextView.setPadding(C17N.LJIILL(5.0d), 0, C17N.LJIILL(5.0d), 0);
                tuxTextView.setSingleLine();
                this.LLFZ = tuxTextView;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        String nickname = relationLabel.getNickname();
        String labelInfo = relationLabel.getLabelInfo();
        TagLayout tagLayout4 = this.LLFII;
        if (tagLayout4 != null) {
            if (tagLayout4.getChildCount() > 0) {
                i3 = 15;
            }
            if (nickname == null || nickname.length() == 0) {
                LIZ = C211168Qm.LIZ(i3, labelInfo, "");
            } else {
                String LIZ2 = C211168Qm.LIZ(O6R.LJJIIJZLJL(Math.ceil(i3 - C211168Qm.LIZJ(labelInfo))), QZZ.LIZIZ('@', nickname), C211168Qm.LIZ);
                if (LIZ2 != null && LIZ2.length() != 0) {
                    LIZ2 = C42398GkU.LIZIZ(LIZ2, ' ');
                }
                LIZ = i0.LJFF(LIZ2, labelInfo);
            }
            TuxTextView tuxTextView2 = this.LLFZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(LIZ);
            }
            TagLayout tagLayout5 = this.LLFII;
            if (tagLayout5 != null) {
                tagLayout5.addView(this.LLFZ, new LinearLayout.LayoutParams(-2, -1));
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
        this.LLFII = (TagLayout) findViewById;
    }
}
