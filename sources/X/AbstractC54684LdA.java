package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LdA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54684LdA extends RecyclerView.ViewHolder {
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(C54685LdB.LJLIL);
    public int LJLIL;
    public InboxFollowGuideViewModel LJLILLLLZI;

    public FollowingInterestUser N() {
        return null;
    }

    public void P(TextView liveTag) {
        o.LJIIIZ(liveTag, "liveTag");
    }

    public void Q() {
    }

    public void T() {
    }

    public AbstractC54684LdA(View view) {
        super(view);
        this.LJLIL = -1;
    }

    public static void M(TuxTextView tuxTextView) {
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(82);
        }
    }

    public final void U(TextView liveTag) {
        String str;
        o.LJIIIZ(liveTag, "liveTag");
        try {
            Context context = liveTag.getContext();
            o.LJIIIIZZ(context, "liveTag.context");
            try {
                LiveOuterService.LJJJLL().LJJIJIL().LJJIJIIJI().getClass();
                str = C30039Bqd.LIZ(context);
                o.LJIIIIZZ(str, "{\n            ServiceMan…String(context)\n        }");
            } catch (Exception unused) {
                str = "LIVE";
            }
            liveTag.setText(str);
            L(liveTag, str, 12.0f);
        } catch (Exception unused2) {
            liveTag.setText("LIVE");
            L(liveTag, "LIVE", 12.0f);
        }
        P(liveTag);
    }

    public final void L(TextView textView, String str, float f) {
        textView.setTextSize(1, f);
        if (textView.getPaint().measureText(str) > KL2.LIZJ(textView.getContext(), 46.0f)) {
            float f2 = f - 1;
            if (f2 >= 10.0f) {
                L(textView, str, f2);
            }
        }
    }

    public final void V(Context context, FollowingInterestUser followingInterestUser, List<FollowingInterestUser> list, int... iArr) {
        InboxFollowGuideViewModel inboxFollowGuideViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        InboxFollowGuideViewModel inboxFollowGuideViewModel2 = this.LJLILLLLZI;
        Boolean bool = null;
        if (inboxFollowGuideViewModel2 != null && (mutableLiveData2 = inboxFollowGuideViewModel2.LJLIL) != null) {
            bool = mutableLiveData2.getValue();
        }
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2) && (inboxFollowGuideViewModel = this.LJLILLLLZI) != null && (mutableLiveData = inboxFollowGuideViewModel.LJLILLLLZI) != null) {
            mutableLiveData.setValue(bool2);
        }
        LYU.LJIILJJIL(context, followingInterestUser, list, this.LJLIL, this.itemView, 0);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("is_live", "1");
        FMX.LJIIL("click_play_following_window", c188727au.LIZ);
    }
}
