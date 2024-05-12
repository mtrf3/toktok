package X;

import Y.ACListenerS23S0100000_3;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8G5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G5 extends C8HS<ForumStruct> {
    public final Activity LJLIL;
    public final Fragment LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        ForumStruct forumStruct;
        Long id;
        List<ForumStruct> data = getData();
        if (data != null && (forumStruct = (ForumStruct) ORZ.LJLLLLLL(i, data)) != null && (id = forumStruct.getId()) != null) {
            return id.longValue();
        }
        return super.getItemId(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8G5(ActivityC45651qj activityC45651qj, Fragment mFragment) {
        super(true);
        o.LJIIIZ(mFragment, "mFragment");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = mFragment;
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        ForumStruct forumStruct;
        UrlModel urlModel;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String content;
        Integer videosCount;
        Resources resources;
        User user;
        UrlModel urlModel2;
        User creator;
        User creator2;
        Long l;
        o.LJIIIZ(holder, "holder");
        List<ForumStruct> data = getData();
        String str = null;
        if (data != null) {
            forumStruct = (ForumStruct) ListProtector.get(data, i);
        } else {
            forumStruct = null;
        }
        C8G4 c8g4 = (C8G4) holder;
        Activity activity = this.LJLIL;
        Fragment fragment = this.LJLILLLLZI;
        if (forumStruct == null || activity == null || fragment == null) {
            return;
        }
        c8g4.LJLJI = activity;
        c8g4.LJLJJI = fragment;
        c8g4.LJLIL = forumStruct;
        c8g4.LJLILLLLZI = forumStruct.getContent();
        c8g4.LJLJJL = this;
        c8g4.LJLJJLL = new C8G8(c8g4);
        C8G9 LIZ = C8GC.LIZ();
        c8g4.LJLJL = LIZ;
        if (LIZ != null) {
            ForumStruct forumStruct2 = c8g4.LJLIL;
            if (forumStruct2 != null) {
                l = forumStruct2.getId();
            } else {
                l = null;
            }
            LIZ.LIZ(String.valueOf(l)).observeForever(c8g4, false);
        }
        c8g4.LJLLLL.setVisibility(8);
        ForumStruct forumStruct3 = c8g4.LJLIL;
        if (forumStruct3 != null && (creator2 = forumStruct3.getCreator()) != null) {
            urlModel = creator2.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (urlModel != null) {
            ForumStruct forumStruct4 = c8g4.LJLIL;
            if (forumStruct4 != null && (creator = forumStruct4.getCreator()) != null) {
                urlModel2 = creator.getAvatarThumb();
            } else {
                urlModel2 = null;
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel2));
            LJII.LJJIJIIJIL = true;
            LJII.LIZIZ("collection_question");
            LJII.LJJIIJ = c8g4.LJLLI;
            C16880lQ.LLJJJ(LJII);
        } else {
            Activity activity2 = c8g4.LJLJI;
            if (activity2 != null) {
                c8g4.LJLLI.setBackground(C04270Et.LIZIZ(activity2, R.drawable.amf));
            }
            c8g4.LJLLI.setPlaceholderImage(R.drawable.amf);
        }
        ForumStruct forumStruct5 = c8g4.LJLIL;
        if (forumStruct5 != null && forumStruct5.getCreator() != null) {
            TuxTextView tuxTextView = c8g4.LJLLILLLL;
            ForumStruct forumStruct6 = c8g4.LJLIL;
            if (forumStruct6 != null) {
                user = forumStruct6.getCreator();
            } else {
                user = null;
            }
            tuxTextView.setText(C1799274i.LJ(user, "qa_detail"));
        } else {
            c8g4.LJLLILLLL.setVisibility(8);
            TuxTextView tuxTextView2 = c8g4.LJLLJ;
            int LIZJ = (int) KL2.LIZJ(activity, 8.0f);
            if (tuxTextView2 != null) {
                ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.topMargin = LIZJ;
                }
                tuxTextView2.requestLayout();
            }
        }
        ForumStruct forumStruct7 = c8g4.LJLIL;
        if (forumStruct7 != null && (videosCount = forumStruct7.getVideosCount()) != null) {
            int intValue = videosCount.intValue();
            String LJJIIJ = C77123UOp.LJJIIJ(intValue);
            Activity activity3 = c8g4.LJLJI;
            if (activity3 != null && (resources = activity3.getResources()) != null) {
                str = resources.getQuantityString(R.plurals.r4, intValue, LJJIIJ);
            }
            c8g4.LJLLL.setText(str);
        }
        ForumStruct forumStruct8 = c8g4.LJLIL;
        if (forumStruct8 != null && (content = forumStruct8.getContent()) != null) {
            TuxTextView tuxTextView3 = c8g4.LJLLJ;
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZIZ(new OJD("(?m)^[ \t]*\r?\n").replace(content, ""));
            tuxTextView3.setText(c116724i4.LIZ);
        }
        C16880lQ.LJIL(c8g4.LJLL, c8g4);
        c8g4.LJLL.setOnLongClickListener(c8g4);
        C16880lQ.LJJIZ(c8g4.LJLJLLL, new ACListenerS23S0100000_3(c8g4, 300));
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.av4, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new C8G4(view);
    }
}
