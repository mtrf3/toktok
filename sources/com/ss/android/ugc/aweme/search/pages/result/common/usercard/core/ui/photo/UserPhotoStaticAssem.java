package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo;

import X.C214348b8;
import X.C220858ld;
import X.C242689fk;
import X.C26338AVi;
import X.C46314IFq;
import X.C5H3;
import X.C65352Pkq;
import X.C71898SJq;
import X.C77123UOp;
import X.C78897Uxp;
import X.C7MY;
import X.C8XO;
import X.JJL;
import X.JJT;
import X.JON;
import X.SY9;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class UserPhotoStaticAssem extends ReusedUIContentAssem<UserPhotoStaticAssem> implements C8XO<JJL> {
    public final C5H3 LJZL;
    public TextView LL;
    public C71898SJq LLD;
    public ConstraintLayout LLF;
    public JON LLFF;
    public View LLFFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public UserPhotoStaticAssem() {
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(UserPhotoViewModel.class), JJT.INSTANCE);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(JJL jjl) {
        long j;
        JJL item = jjl;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.LJLIL;
        TextView textView = this.LL;
        if (textView != null) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getDiggCount();
            } else {
                j = 0;
            }
            textView.setText(C77123UOp.LJJIIJ(j));
            SY9 LIZIZ = C242689fk.LIZIZ(textView.getContext(), aweme);
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "context");
            if (C26338AVi.LIZJ(context)) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZIZ, (Drawable) null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(LIZIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            TextView textView2 = this.LL;
            if (textView2 != null) {
                C71898SJq c71898SJq = this.LLD;
                if (c71898SJq != null) {
                    int i = 8;
                    c71898SJq.setVisibility(8);
                    TextView textView3 = this.LL;
                    if (textView3 != null) {
                        if (textView3.getVisibility() == 0) {
                            TextView textView4 = this.LL;
                            if (textView4 != null) {
                                CharSequence text = textView4.getText();
                                if (text != null && text.length() != 0) {
                                    textView2.setPadding(textView2.getPaddingLeft(), 0, textView2.getPaddingRight(), textView2.getPaddingBottom());
                                    textView2.post(new ARunnableS44S0100000_8(this, 83));
                                }
                            } else {
                                o.LJIJI("likeCountText");
                                throw null;
                            }
                        }
                        ConstraintLayout constraintLayout = this.LLF;
                        if (constraintLayout != null) {
                            C78897Uxp.LJJJJL(constraintLayout, 0.0f);
                            JON jon = this.LLFF;
                            if (jon != null) {
                                C78897Uxp.LJJJJLI(jon, null);
                            }
                            Aweme aweme2 = item.LJLIL;
                            View view = this.LLFFF;
                            if (view == null) {
                                return;
                            }
                            if (C220858ld.LJIIIZ(aweme2)) {
                                i = 0;
                            }
                            view.setVisibility(i);
                            return;
                        }
                        o.LJIJI("photoViewContainer");
                        throw null;
                    }
                    o.LJIJI("likeCountText");
                    throw null;
                }
                o.LJIJI("photoTuxMask");
                throw null;
            }
            o.LJIJI("likeCountText");
            throw null;
        }
        o.LJIJI("likeCountText");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JJL jjl) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LL = (TextView) C7MY.LIZLLL(view, "view", R.id.n03, "view.findViewById(R.id.user_photo_like_count)");
        View findViewById = view.findViewById(R.id.n02);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.user_photo_holder_tux_mask)");
        this.LLD = (C71898SJq) findViewById;
        View findViewById2 = view.findViewById(R.id.n01);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.u…r_photo_container_layout)");
        this.LLF = (ConstraintLayout) findViewById2;
        this.LLFFF = view.findViewById(R.id.ho6);
        if (C46314IFq.LIZIZ()) {
            this.LLFF = (JON) view.findViewById(R.id.k7p);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JJL jjl) {
    }
}
