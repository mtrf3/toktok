package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.8nR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC221978nR implements Observer<C207668Da> {
    public C222928oy LJLIL;
    public C80766Vms LJLILLLLZI;
    public StoryFeedViewModel LJLJI;
    public AbstractC222628oU LJLJJI;
    public Context LJLJJL;
    public C210118Ml LJLJJLL;
    public C222588oQ LJLJL;
    public View LJLJLJ;

    public abstract void LIZ(int i);

    public abstract void LIZIZ(int i);

    public abstract void LIZJ(int i, Aweme aweme);

    public abstract void LJII();

    public final C222928oy LIZLLL() {
        C222928oy c222928oy = this.LJLIL;
        if (c222928oy != null) {
            return c222928oy;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public final AbstractC222628oU LJ() {
        AbstractC222628oU abstractC222628oU = this.LJLJJI;
        if (abstractC222628oU != null) {
            return abstractC222628oU;
        }
        o.LJIJI("baseStoryPlayerView");
        throw null;
    }

    public final Context LJFF() {
        Context context = this.LJLJJL;
        if (context != null) {
            return context;
        }
        o.LJIJI("context");
        throw null;
    }

    public final C80766Vms LJI() {
        C80766Vms c80766Vms = this.LJLILLLLZI;
        if (c80766Vms != null) {
            return c80766Vms;
        }
        o.LJIJI("storyViewPager");
        throw null;
    }
}
