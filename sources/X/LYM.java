package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.story.inbox.SkylightStoryUser;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LYM {
    public static C53882LCs LIZ;
    public static InboxFollowGuideViewModel LIZIZ;

    public static C53882LCs LIZJ() {
        if (LIZ == null) {
            C53882LCs c53882LCs = new C53882LCs(EnumC53722L6o.SKYLIGHT);
            LIZ = c53882LCs;
            c53882LCs.LIZLLL();
        }
        return LIZ;
    }

    public static int LIZIZ(LY3 dataSource) {
        String str;
        Aweme aweme;
        o.LJIIIZ(dataSource, "dataSource");
        List<Aweme> list = dataSource.LIZIZ;
        if (list != null && (aweme = (Aweme) ListProtector.get(list, 0)) != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        return (int) (dataSource.LJFF - (C54838Lfe.LJIIJJI(str) ? 1L : 0L));
    }

    public static void LJ(TextView textView) {
        String str;
        try {
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "liveTag.context");
            try {
                LiveOuterService.LJJJLL().LJJIJIL().LJJIJIIJI().getClass();
                str = C30039Bqd.LIZ(context);
                o.LJIIIIZZ(str, "{\n            ServiceMan…              )\n        }");
            } catch (Exception unused) {
                str = "LIVE";
            }
            textView.setText(str);
            LIZ(textView, str, 12.0f);
        } catch (Exception unused2) {
            textView.setText("LIVE");
            LIZ(textView, "LIVE", 12.0f);
        }
    }

    public static int LIZLLL(List list, List list2) {
        Object obj;
        int i = 0;
        if (list != null && list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                SkylightStoryUser skylightStoryUser = (SkylightStoryUser) it.next();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (o.LJ(((Aweme) obj).getAuthor().getUid(), String.valueOf(skylightStoryUser.getUserId()))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Aweme aweme = (Aweme) obj;
                if (aweme != null && !C54838Lfe.LJIIJJI(aweme.getAuthor().getUid()) && !C54838Lfe.LJIJI(aweme) && !skylightStoryUser.getAllViewed()) {
                    i++;
                }
            }
        }
        return i;
    }

    public static void LIZ(TextView textView, String str, float f) {
        textView.setTextSize(1, f);
        if (textView.getPaint().measureText(str) > KL2.LIZJ(textView.getContext(), 46.0f)) {
            float f2 = f - 1;
            if (f2 >= 10.0f) {
                LIZ(textView, str, f2);
            }
        }
    }

    public static void LJFF(Context context, FollowingInterestUser followingInterestUser, List list, int i, View view, int... iArr) {
        InboxFollowGuideViewModel inboxFollowGuideViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        InboxFollowGuideViewModel inboxFollowGuideViewModel2 = LIZIZ;
        Boolean bool = null;
        if (inboxFollowGuideViewModel2 != null && (mutableLiveData2 = inboxFollowGuideViewModel2.LJLIL) != null) {
            bool = mutableLiveData2.getValue();
        }
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2) && (inboxFollowGuideViewModel = LIZIZ) != null && (mutableLiveData = inboxFollowGuideViewModel.LJLILLLLZI) != null) {
            mutableLiveData.setValue(bool2);
        }
        LYU.LJIILJJIL(context, followingInterestUser, list, i, view, 0);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("is_live", "1");
        FMX.LJIIL("click_play_following_window", c188727au.LIZ);
    }
}
