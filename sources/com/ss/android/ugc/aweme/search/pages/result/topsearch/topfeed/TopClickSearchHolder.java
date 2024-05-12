package com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C16880lQ;
import X.C26338AVi;
import X.C27740Aue;
import X.C32151Nz;
import X.C49604JdQ;
import X.C51102K3u;
import X.C51763KTf;
import X.C72972SkS;
import X.C78897Uxp;
import X.JP4;
import X.JQA;
import X.JV9;
import X.JVA;
import X.O6R;
import X.SYL;
import Y.ACListenerS8S0500000_8;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TopClickSearchHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public SYL LJLIL;

    /* loaded from: classes9.dex */
    public static final class WordCell extends PowerCell<JV9> {
        public TuxTextView LJLIL;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(JV9 jv9) {
            ActivityC45651qj activityC45651qj;
            JV9 t = jv9;
            o.LJIIIZ(t, "t");
            super.onBindItemView(t);
            JP4 jp4 = t.LJLILLLLZI;
            ClickSearchWord clickSearchWord = t.LJLIL;
            JQA jqa = t.LJLJI;
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView != null) {
                String str = clickSearchWord.word;
                if (str == null) {
                    str = "";
                }
                if (str.length() > 36) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C51102K3u.LIZIZ(0, 33, str));
                    sb.append("...");
                    str = sb;
                }
                tuxTextView.setText(str);
                C49604JdQ.LJ(t.LJLIL, jp4.LIZJ, jp4.LIZIZ, jqa);
                Activity LIZIZ = C27740Aue.LIZIZ(this.itemView);
                if ((LIZIZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LIZIZ) != null) {
                    TuxTextView tuxTextView2 = this.LJLIL;
                    if (tuxTextView2 != null) {
                        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS8S0500000_8(activityC45651qj, clickSearchWord, jp4, jqa, t, 0));
                        if (e1.LIZ(31744, "search_related_recom_add_report", true, false)) {
                            TuxTextView tuxTextView3 = this.LJLIL;
                            if (tuxTextView3 != null) {
                                tuxTextView3.setOnLongClickListener(new JVA(activityC45651qj, t));
                                return;
                            } else {
                                o.LJIJI("textView");
                                throw null;
                            }
                        }
                        return;
                    }
                    o.LJIJI("textView");
                    throw null;
                }
                throw new NullPointerException("Activity not found");
            }
            o.LJIJI("textView");
            throw null;
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup parent) {
            o.LJIIIZ(parent, "parent");
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            int i = 0;
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.cv);
            if (LIZJ != null) {
                i = LIZJ.intValue();
            }
            tuxTextView.setBackground(C51763KTf.LIZIZ(C32151Nz.LJIIZILJ(8), i));
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), AnonymousClass391.LIZJ(9), AnonymousClass391.LIZJ(8), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(9))), 16);
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColorRes(R.attr.go);
            C78897Uxp.LJJJJJL(tuxTextView, 0.0f);
            this.LJLIL = tuxTextView;
            return tuxTextView;
        }
    }

    public TopClickSearchHolder(View view) {
        super(view);
    }
}
