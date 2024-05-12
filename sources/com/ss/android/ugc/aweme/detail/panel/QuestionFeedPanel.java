package com.ss.android.ugc.aweme.detail.panel;

import X.C161286Uq;
import X.C16880lQ;
import X.C90193gN;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class QuestionFeedPanel extends ShootFeedPanel {
    public final String LLJLIL;
    public final String LLJLILLLLZIIL;
    public final String LLJLL;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.ppw;
    }

    public QuestionFeedPanel(Bundle bundle) {
        this.LLJLIL = (String) bundle.getSerializable("question_content");
        this.LLJLILLLLZIIL = (String) bundle.getSerializable("enter_from");
        bundle.getSerializable("enter_method");
        this.LLJLL = bundle.getString("qa_origin_detail_key", "'");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
        String str;
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme == null || currentAweme.getInteractStickerStructs() == null) {
            return;
        }
        for (InteractStickerStruct interactStickerStruct : currentAweme.getInteractStickerStructs()) {
            if (interactStickerStruct.getQaStruct() != null) {
                try {
                    CommentService LJJL = CommentServiceImpl.LJJL();
                    Context context = getContext();
                    QaStruct qaStruct = interactStickerStruct.getQaStruct();
                    String str2 = this.LLJLILLLLZIIL;
                    if ("".equals(this.LLJLL)) {
                        str = this.LLJLILLLLZIIL;
                    } else {
                        str = this.LLJLL;
                    }
                    String aid = currentAweme.getAid();
                    QaStruct.Companion.getClass();
                    LJJL.LJIJI(context, qaStruct, str2, "click_banner", "answer", str, aid, C161286Uq.LIZ(currentAweme));
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        int i;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.als, relativeLayout, false);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.c94);
        String str = this.LLJLIL;
        if (str != null && !str.isEmpty()) {
            textView.setText(this.LLJLIL);
            if (C90193gN.LIZ()) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
        }
        return LLLLIILL;
    }
}
