package com.ss.android.ugc.aweme.question;

import X.C16880lQ;
import X.C50258Jny;
import X.C50259Jnz;
import X.C51611KNj;
import X.HG3;
import X.KUR;
import X.KUY;
import X.MGX;
import X.MIM;
import X.RBX;
import Y.ACListenerS29S0100000_9;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class QuestionDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final /* synthetic */ int LLIZ = 0;
    public ForumStruct LLILLL;
    public String LLILZ;
    public final Map<Integer, View> LLILZLL = new LinkedHashMap();
    public MIM LLILZIL = new MIM(0);

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void Ll() {
        C50259Jnz c50259Jnz;
        if (QnaService.LIZ().enablePublicQna()) {
            TuxTextView xl = xl(R.string.hvg);
            C16880lQ.LJJJJI(xl, new ACListenerS29S0100000_9(this, 87));
            ForumStruct forumStruct = this.LLILLL;
            o.LJI(forumStruct);
            if (forumStruct.getCreator() != null) {
                ForumStruct forumStruct2 = this.LLILLL;
                o.LJI(forumStruct2);
                User creator = forumStruct2.getCreator();
                o.LJI(creator);
                if (creator.getUid() != null && ((RBX) HG3.LJIILL()).getCurUserId() != null) {
                    ForumStruct forumStruct3 = this.LLILLL;
                    o.LJI(forumStruct3);
                    User creator2 = forumStruct3.getCreator();
                    o.LJI(creator2);
                    if (o.LJ(creator2.getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
                        C50258Jny c50258Jny = new C50258Jny(mo49getActivity());
                        c50258Jny.LIZJ(R.string.pp9);
                        c50258Jny.LIZ(R.string.pp8);
                        c50259Jnz = c50258Jny.LIZ;
                        o.LJIIIIZZ(c50259Jnz, "{\n                DmtDef…   .build()\n            }");
                        C51611KNj c51611KNj = (C51611KNj) C16880lQ.LLLZIIL(R.layout.bky, C16880lQ.LLZIL(getContext()), null);
                        c51611KNj.setStatus(c50259Jnz);
                        KUR kur = this.LJZI;
                        KUY LIZ = KUY.LIZ(getContext());
                        LIZ.LIZIZ(c51611KNj);
                        LIZ.LIZJ(xl);
                        kur.setBuilder(LIZ);
                        return;
                    }
                }
            }
            C50258Jny c50258Jny2 = new C50258Jny(mo49getActivity());
            c50258Jny2.LIZJ(R.string.pp7);
            c50258Jny2.LIZ(R.string.pp6);
            c50259Jnz = c50258Jny2.LIZ;
            o.LJIIIIZZ(c50259Jnz, "{\n                DmtDef…   .build()\n            }");
            C51611KNj c51611KNj2 = (C51611KNj) C16880lQ.LLLZIIL(R.layout.bky, C16880lQ.LLZIL(getContext()), null);
            c51611KNj2.setStatus(c50259Jnz);
            KUR kur2 = this.LJZI;
            KUY LIZ2 = KUY.LIZ(getContext());
            LIZ2.LIZIZ(c51611KNj2);
            LIZ2.LIZJ(xl);
            kur2.setBuilder(LIZ2);
            return;
        }
        super.Ll();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MIM mim = this.LLILZIL;
        if (mim != null) {
            o.LJI(mim);
            mim.LIZJ += this.LLIIIZ;
        }
        this.LLIIIZ = 0L;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void initArguments(Bundle arguments) {
        o.LJIIIZ(arguments, "arguments");
        super.initArguments(arguments);
        this.LLILLL = (ForumStruct) arguments.getSerializable("detail_question_detail");
        this.LLILZ = (String) arguments.getSerializable("from_group_id");
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX param, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(param, "param");
        SmartRoute route = super.wl(param, aweme);
        ForumStruct forumStruct = this.LLILLL;
        if (forumStruct != null) {
            o.LJI(forumStruct);
            route.withParam("question_content", forumStruct.getContent());
            route.withParam("show_answer_question_button", 1);
            route.withParam("video_from", "qa_detail");
            route.withParam("enter_from", "qa_detail");
            route.withParam("from_group_id", this.LLILZ);
        }
        o.LJIIIIZZ(route, "route");
        return route;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void LLLILZ(View view, Aweme aweme, String label) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(label, "label");
        super.LLLILZ(view, aweme, label);
        MIM mim = this.LLILZIL;
        o.LJI(mim);
        mim.LJI = true;
    }
}
