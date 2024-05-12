package X;

import Y.ACListenerS38S0200000_3;
import Y.AgS49S0201000_3;
import Y.IDCListenerS279S0100000_3;
import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.8G4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G4 extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener, InterfaceC176266vu, Observer<C8G6> {
    public ForumStruct LJLIL;
    public String LJLILLLLZI;
    public Activity LJLJI;
    public Fragment LJLJJI;
    public C8G5 LJLJJL;
    public C8G8 LJLJJLL;
    public C8G9 LJLJL;
    public TuxActionSheet LJLJLJ;
    public final SY4 LJLJLLL;
    public final ConstraintLayout LJLL;
    public final C72434Sbm LJLLI;
    public final TuxTextView LJLLILLLL;
    public final TuxTextView LJLLJ;
    public final TuxTextView LJLLL;
    public final C76S LJLLLL;

    @Override // X.InterfaceC176266vu
    public final void onShowItem() {
        ForumStruct forumStruct = this.LJLIL;
        if (forumStruct != null) {
            String valueOf = String.valueOf(forumStruct.getId());
            String LIZIZ = C178456zR.LIZIZ(1);
            C188727au LIZ = C178456zR.LIZ("question", "collection_question");
            LIZ.LJIIIZ("question_id", valueOf);
            FMX.LJIIL(LIZIZ, LIZ.LIZ);
        }
    }

    public C8G4(View view) {
        super(view);
        view.findViewById(R.id.jqz).getClass();
        View findViewById = view.findViewById(R.id.jqz);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…stion_button_reply_video)");
        this.LJLJLLL = (SY4) findViewById;
        View findViewById2 = view.findViewById(R.id.jqu);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…tting_item_click_wrapper)");
        this.LJLL = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.jqt);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.setting_item_avatar)");
        this.LJLLI = (C72434Sbm) findViewById3;
        View findViewById4 = view.findViewById(R.id.jr1);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…_item_question_user_name)");
        this.LJLLILLLL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.jr0);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…ng_item_question_message)");
        this.LJLLJ = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.jr2);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…tem_question_video_count)");
        this.LJLLL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.lk9);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.….translation_status_view)");
        this.LJLLLL = (C76S) findViewById7;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C8G6 c8g6) {
        Activity activity;
        C8G6 c8g62 = c8g6;
        if (c8g62 == null || c8g62.LIZ == null || (activity = this.LJLJI) == null || activity.isFinishing()) {
            return;
        }
        if (c8g62.LIZIZ) {
            ForumStruct forumStruct = c8g62.LIZ;
            this.LJLLLL.setLoading(false);
            ForumStruct forumStruct2 = this.LJLIL;
            if (forumStruct2 != null) {
                forumStruct2.setTranslated(forumStruct.isTranslated());
            }
            this.LJLLJ.setText(forumStruct.getContent());
            return;
        }
        this.LJLLLL.setLoading(false);
        Activity activity2 = this.LJLJI;
        if (activity2 == null) {
            return;
        }
        C1A7.LJIJJ(activity2, c8g62.LIZJ);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLJI, "//qna/detail/");
        ForumStruct forumStruct = this.LJLIL;
        Long l = null;
        if (forumStruct != null) {
            l = forumStruct.getId();
        }
        buildRoute.withParam("id", String.valueOf(l));
        buildRoute.withParam("enter_from", "collection_question");
        buildRoute.withParam("enter_method", "click_favorite");
        ForumStruct forumStruct2 = this.LJLIL;
        if (forumStruct2 != null && forumStruct2.getVideo() != null) {
            str = "video";
        } else {
            str = "textual";
        }
        buildRoute.withParam("question_type", str);
        buildRoute.open();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ForumStruct forumStruct;
        boolean z;
        User user;
        String content;
        String spannableStringBuilder;
        FragmentManager fragmentManager;
        TuxActionSheet tuxActionSheet;
        String content2;
        String str;
        String str2;
        C252659vp c252659vp;
        String str3;
        String str4;
        String str5;
        String str6;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        Resources resources5;
        String str7;
        User creator;
        if (view == null || this.LJLJI == null || this.LJLJJLL == null || (forumStruct = this.LJLIL) == null) {
            return false;
        }
        User user2 = null;
        if (forumStruct.getCreator() != null) {
            ForumStruct forumStruct2 = this.LJLIL;
            if (forumStruct2 != null && (creator = forumStruct2.getCreator()) != null) {
                str7 = creator.getUid();
            } else {
                str7 = null;
            }
            z = TextUtils.equals(str7, ((RBX) HG3.LJIILL()).getCurUserId());
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        Activity activity = this.LJLJI;
        if (activity != null) {
            String string = activity.getString(R.string.qz);
            o.LJIIIIZZ(string, "it.getString(R.string.QA_comment_answer)");
            arrayList.add(string);
            String string2 = activity.getString(R.string.ga5);
            o.LJIIIIZZ(string2, "it.getString(R.string.fav_comment_remove)");
            arrayList.add(string2);
            if (!z) {
                ForumStruct forumStruct3 = this.LJLIL;
                if (forumStruct3 != null && o.LJ(forumStruct3.isTranslated(), Boolean.TRUE)) {
                    String string3 = activity.getString(R.string.dlq);
                    o.LJIIIIZZ(string3, "it.getString(R.string.comment_see_original)");
                    arrayList.add(string3);
                } else {
                    String string4 = activity.getString(R.string.dm8);
                    o.LJIIIIZZ(string4, "it.getString(R.string.comment_translate)");
                    arrayList.add(string4);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String content3 = (String) it.next();
            C8G8 c8g8 = this.LJLJJLL;
            if (c8g8 != null && this.LJLIL != null) {
                Activity activity2 = this.LJLJI;
                if (activity2 != null && (resources5 = activity2.getResources()) != null) {
                    str2 = resources5.getString(R.string.dm8);
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(content3, str2)) {
                    c252659vp = new C252659vp();
                    o.LJIIIZ(content3, "content");
                    c252659vp.LIZ = content3;
                    c252659vp.LIZJ(R.raw.icon_globe);
                    c252659vp.LJ = new ACListenerS38S0200000_3(this, c8g8, 109);
                } else {
                    Activity activity3 = this.LJLJI;
                    if (activity3 != null && (resources4 = activity3.getResources()) != null) {
                        str3 = resources4.getString(R.string.dlq);
                    } else {
                        str3 = null;
                    }
                    if (TextUtils.equals(content3, str3)) {
                        c252659vp = new C252659vp();
                        o.LJIIIZ(content3, "content");
                        c252659vp.LIZ = content3;
                        c252659vp.LIZJ(R.raw.icon_globe);
                        c252659vp.LJ = new ACListenerS38S0200000_3(this, c8g8, 110);
                    } else {
                        Activity activity4 = this.LJLJI;
                        if (activity4 != null && (resources3 = activity4.getResources()) != null) {
                            str4 = resources3.getString(R.string.qz);
                        } else {
                            str4 = null;
                        }
                        if (TextUtils.equals(content3, str4)) {
                            c252659vp = new C252659vp();
                            o.LJIIIZ(content3, "content");
                            c252659vp.LIZ = content3;
                            c252659vp.LIZJ(R.raw.icon_video);
                            c252659vp.LJ = new ACListenerS38S0200000_3(this, c8g8, 111);
                        } else {
                            Activity activity5 = this.LJLJI;
                            if (activity5 != null && (resources2 = activity5.getResources()) != null) {
                                str5 = resources2.getString(R.string.ga2);
                            } else {
                                str5 = null;
                            }
                            if (!TextUtils.equals(content3, str5)) {
                                Activity activity6 = this.LJLJI;
                                if (activity6 != null && (resources = activity6.getResources()) != null) {
                                    str6 = resources.getString(R.string.ga3);
                                } else {
                                    str6 = null;
                                }
                                if (!TextUtils.equals(content3, str6)) {
                                    Fragment fragment = this.LJLJJI;
                                    o.LJI(fragment);
                                    if (TextUtils.equals(content3, fragment.getString(R.string.ga5))) {
                                        c252659vp = new C252659vp();
                                        o.LJIIIZ(content3, "content");
                                        c252659vp.LIZ = content3;
                                        c252659vp.LIZJ(R.raw.icon_bookmark_fill);
                                        c252659vp.LJ = new ACListenerS38S0200000_3(this, c8g8, 113);
                                    }
                                }
                            }
                            c252659vp = new C252659vp();
                            o.LJIIIZ(content3, "content");
                            c252659vp.LIZ = content3;
                            c252659vp.LIZJ(R.raw.icon_bookmark);
                            c252659vp.LJ = new ACListenerS38S0200000_3(this, c8g8, 112);
                        }
                    }
                }
                arrayList2.add(c252659vp);
            }
        }
        ForumStruct forumStruct4 = this.LJLIL;
        if (forumStruct4 != null) {
            user = forumStruct4.getCreator();
        } else {
            user = null;
        }
        if (user != null) {
            ForumStruct forumStruct5 = this.LJLIL;
            if (forumStruct5 != null && (content2 = forumStruct5.getContent()) != null && content2.length() > 0) {
                C116724i4 c116724i4 = new C116724i4();
                ForumStruct forumStruct6 = this.LJLIL;
                if (forumStruct6 != null) {
                    user2 = forumStruct6.getCreator();
                }
                c116724i4.LIZLLL(C1799274i.LJ(user2, "qa_detail"));
                if (C90193gN.LIZ()) {
                    str = " :";
                } else {
                    str = ": ";
                }
                c116724i4.LIZLLL(str);
                c116724i4.LIZIZ(new OJD("(?m)^[ \t]*\r?\n").replace(content2, ""));
                spannableStringBuilder = c116724i4.LIZ.toString();
                o.LJIIIIZZ(spannableStringBuilder, "BidiConcat()\n           …              .toString()");
            }
            spannableStringBuilder = "";
        } else {
            ForumStruct forumStruct7 = this.LJLIL;
            if (forumStruct7 != null && (content = forumStruct7.getContent()) != null && content.length() > 0) {
                C116724i4 c116724i42 = new C116724i4();
                c116724i42.LIZIZ(new OJD("(?m)^[ \t]*\r?\n").replace(content, ""));
                spannableStringBuilder = c116724i42.LIZ.toString();
                o.LJIIIIZZ(spannableStringBuilder, "BidiConcat()\n           …              .toString()");
            }
            spannableStringBuilder = "";
        }
        C245319jz c245319jz = new C245319jz();
        TuxActionSheet tuxActionSheet2 = c245319jz.LIZ;
        tuxActionSheet2.LJLLILLLL = spannableStringBuilder;
        tuxActionSheet2.LJLLL = 2;
        c245319jz.LJ(arrayList2);
        IDCListenerS279S0100000_3 iDCListenerS279S0100000_3 = new IDCListenerS279S0100000_3(this, 6);
        TuxActionSheet tuxActionSheet3 = c245319jz.LIZ;
        tuxActionSheet3.LJLIL = iDCListenerS279S0100000_3;
        tuxActionSheet3.LJLLLL = "";
        this.LJLJLJ = c245319jz.LIZJ();
        if (!(!arrayList2.isEmpty())) {
            return false;
        }
        Fragment fragment2 = this.LJLJJI;
        if (fragment2 != null && (fragmentManager = fragment2.getFragmentManager()) != null && (tuxActionSheet = this.LJLJLJ) != null) {
            tuxActionSheet.show(fragmentManager, "QuestionCollectViewHolder");
        }
        return true;
    }

    public final void L(ForumStruct forumStruct, int i) {
        if (this.LJLJI != null) {
            if (C2NU.LIZ.LIZIZ()) {
                Long id = forumStruct.getId();
                if (id != null) {
                    C10K<BaseResponse> collectQuestion = UserFavoritesApi.LIZ.collectQuestion(id.longValue(), i);
                    if (collectQuestion != null) {
                        collectQuestion.LJ(new AgS49S0201000_3(this, forumStruct, i, 1), C10K.LJIIIIZZ, null);
                        return;
                    }
                    return;
                }
                return;
            }
            Activity activity = this.LJLJI;
            if (activity != null) {
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LJIIIZ(activity.getString(R.string.img));
                c26045AKb.LJIIJ();
            }
        }
    }
}
