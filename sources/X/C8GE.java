package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8GE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GE extends FrameLayout implements Observer<C8G6> {
    public final MIM LJLIL;
    public ForumStruct LJLILLLLZI;
    public C71799SFv LJLJI;
    public LinearLayout LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public C76S LJLJLLL;
    public TuxTextView LJLL;
    public C74079T5n LJLLI;
    public T6P LJLLILLLL;
    public View LJLLJ;
    public FrameLayout LJLLL;
    public TuxIconView LJLLLL;
    public View LJLLLLLL;
    public ConstraintLayout LJLZ;
    public ConstraintLayout LJZ;
    public boolean LJZI;
    public String LJZL;
    public C8G9 LL;
    public final T5I LLD;
    public final java.util.Map<Integer, View> LLF;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LLF;
        Integer valueOf = Integer.valueOf(R.id.e3y);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.e3y);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final int getButtonResId() {
        return R.layout.c_f;
    }

    public final int getLayoutResId() {
        return R.layout.c_h;
    }

    public final int getMultiAvatarViewResId() {
        return R.layout.c_g;
    }

    public final void LIZIZ() {
        int i;
        ForumStruct forumStruct = this.LJLILLLLZI;
        if (forumStruct != null) {
            String content = forumStruct.getContent();
            if (content != null) {
                TuxTextView tuxTextView = this.LJLJL;
                if (tuxTextView != null) {
                    tuxTextView.setText(new OJD("(?m)^[ \t]*\r?\n").replace(content, ""));
                    TuxTextView tuxTextView2 = this.LJLJL;
                    if (tuxTextView2 != null) {
                        if (C90193gN.LIZ()) {
                            i = 4;
                        } else {
                            i = 3;
                        }
                        tuxTextView2.setTextDirection(i);
                        return;
                    }
                    o.LJIJI("mContent");
                    throw null;
                }
                o.LJIJI("mContent");
                throw null;
            }
            return;
        }
        o.LJIJI("mQuestion");
        throw null;
    }

    public final int getAvatarContainerHeight() {
        C71799SFv c71799SFv = this.LJLJI;
        if (c71799SFv != null) {
            return c71799SFv.getHeight();
        }
        o.LJIJI("mAvatar");
        throw null;
    }

    public final QuestionDetailParam getDetailParam() {
        return this.LLD.LJFF;
    }

    public final T5I getMHeaderParam() {
        return this.LLD;
    }

    public final MIM getMQuestionDetailTime() {
        return this.LJLIL;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C8G6 c8g6) {
        C8G6 c8g62 = c8g6;
        if (c8g62 == null || c8g62.LIZ == null) {
            return;
        }
        if (c8g62.LIZIZ) {
            ForumStruct forumStruct = c8g62.LIZ;
            if (o.LJ(forumStruct.isTranslated(), Boolean.TRUE)) {
                String id = getDetailParam().getId();
                C188727au LIZ = CK3.LIZ("enter_from", "qa_detail");
                if (id != null) {
                    LIZ.LJI("question_id", id);
                }
                FMX.LJIIL("click_see_translation", LIZ.LIZ);
                String id2 = getDetailParam().getId();
                C188727au LIZ2 = CK3.LIZ("enter_from", "qa_detail");
                if (id2 != null) {
                    LIZ2.LJI("question_id", id2);
                }
                FMX.LJIIL("see_original_show", LIZ2.LIZ);
            } else {
                String id3 = getDetailParam().getId();
                C188727au LIZ3 = CK3.LIZ("enter_from", "qa_detail");
                if (id3 != null) {
                    LIZ3.LJI("question_id", id3);
                }
                FMX.LJIIL("click_see_original", LIZ3.LIZ);
                C8GF.LIZ(getDetailParam().getId());
            }
            C76S c76s = this.LJLJLLL;
            if (c76s != null) {
                c76s.setLoading(false);
                TuxTextView tuxTextView = this.LJLJLJ;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                    ForumStruct forumStruct2 = this.LJLILLLLZI;
                    if (forumStruct2 != null) {
                        forumStruct2.setTranslated(forumStruct.isTranslated());
                        ForumStruct forumStruct3 = this.LJLILLLLZI;
                        if (forumStruct3 != null) {
                            forumStruct3.setContent(forumStruct.getContent());
                            LIZIZ();
                            return;
                        } else {
                            o.LJIJI("mQuestion");
                            throw null;
                        }
                    }
                    o.LJIJI("mQuestion");
                    throw null;
                }
                o.LJIJI("mTranslationButton");
                throw null;
            }
            o.LJIJI("mTranslateStatusView");
            throw null;
        }
        C76S c76s2 = this.LJLJLLL;
        if (c76s2 != null) {
            c76s2.setLoading(false);
            Context context = getContext();
            if (context == null) {
                return;
            }
            C1A7.LJIJJ(context, c8g62.LIZJ);
            return;
        }
        o.LJIJI("mTranslateStatusView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8GE(ActivityC45651qj activityC45651qj, T5I t5i, MIM mQuestionDetailTime) {
        super(activityC45651qj, null);
        o.LJIIIZ(mQuestionDetailTime, "mQuestionDetailTime");
        this.LLF = new LinkedHashMap();
        this.LJLIL = mQuestionDetailTime;
        this.LLD = t5i;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(activityC45651qj), getLayoutResId(), this, true);
        View findViewById = findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.avatar)");
        this.LJLJI = (C71799SFv) findViewById;
        View findViewById2 = findViewById(R.id.ac9);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.avatar_icon_wrapper)");
        this.LJLLL = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.ac8);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.avatar_icon)");
        this.LJLLLL = (TuxIconView) findViewById3;
        View findViewById4 = findViewById(R.id.title);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.title)");
        this.LJLJJI = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.lai);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.title_text)");
        this.LJLJJL = (TuxTextView) findViewById5;
        View findViewById6 = findViewById(R.id.laj);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.title_text_intro)");
        this.LJLJJLL = (TuxTextView) findViewById6;
        View findViewById7 = findViewById(R.id.l_0);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.title_arrow)");
        this.LJLLLLLL = findViewById7;
        View findViewById8 = findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.content)");
        this.LJLJL = (TuxTextView) findViewById8;
        View findViewById9 = findViewById(R.id.nd6);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.views)");
        this.LJLL = (TuxTextView) findViewById9;
        View findViewById10 = findViewById(R.id.lk4);
        o.LJIIIIZZ(findViewById10, "findViewById(R.id.translation_button)");
        this.LJLJLJ = (TuxTextView) findViewById10;
        View findViewById11 = findViewById(R.id.lk9);
        o.LJIIIIZZ(findViewById11, "findViewById(R.id.translation_status_view)");
        this.LJLJLLL = (C76S) findViewById11;
        View findViewById12 = findViewById(R.id.e3x);
        o.LJIIIIZZ(findViewById12, "findViewById(R.id.header_click_range)");
        this.LJLZ = (ConstraintLayout) findViewById12;
        View findViewById13 = findViewById(R.id.e3_);
        o.LJIIIIZZ(findViewById13, "findViewById(R.id.head_layout)");
        this.LJZ = (ConstraintLayout) findViewById13;
        View findViewById14 = findViewById(R.id.b21);
        o.LJIIIIZZ(findViewById14, "findViewById(R.id.button_container)");
        ViewStub viewStub = (ViewStub) findViewById14;
        viewStub.setLayoutResource(getButtonResId());
        View inflate = viewStub.inflate();
        View findViewById15 = inflate.findViewById(R.id.bgz);
        o.LJIIIIZZ(findViewById15, "container.findViewById(R.id.collect_container)");
        if (C99W.LIZ) {
            findViewById15.setBackground(getContext().getDrawable(R.drawable.bzy));
        }
        View findViewById16 = inflate.findViewById(R.id.f0q);
        o.LJIIIIZZ(findViewById16, "container.findViewById(R.id.iv_collect)");
        this.LJLLI = new C74079T5n(findViewById15, (T5P) findViewById16, (TextView) inflate.findViewById(R.id.m2m), getDetailParam());
        this.LJLLJ = inflate;
        View findViewById17 = findViewById(R.id.gp5);
        o.LJIIIIZZ(findViewById17, "findViewById(R.id.multi_avatar_view_container)");
        ViewStub viewStub2 = (ViewStub) findViewById17;
        viewStub2.setLayoutResource(getMultiAvatarViewResId());
        View inflate2 = viewStub2.inflate();
        View findViewById18 = inflate2.findViewById(R.id.ijt);
        o.LJIIIIZZ(findViewById18, "container.findViewById(R…ti_avatar_view_container)");
        View findViewById19 = inflate2.findViewById(R.id.ijr);
        o.LJIIIIZZ(findViewById19, "container.findViewById(R…detail_multi_avatar_view)");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        this.LJLLILLLL = new T6P(LJIJJ, findViewById18, (C90183gM) findViewById19, getDetailParam(), mQuestionDetailTime);
    }
}
