package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JYr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49357JYr implements InterfaceC87283bg {
    public InterfaceC65784Pro<String> LJLIL;
    public int LJLILLLLZI;
    public List<Integer> LJLJI;
    public List<Integer> LJLJJI;
    public InterfaceC88472Yns<? super JYG, C76800UCe> LJLJJL;
    public InterfaceC65784Pro<? extends List<? extends View>> LJLJJLL;
    public boolean LJLJL;

    public C49357JYr() {
        this(null);
    }

    public C49357JYr(Object obj) {
        C49361JYv feedbackType = C49361JYv.LJLIL;
        C61878OQg feedbackItemViewIdsWithoutTouch = C61878OQg.INSTANCE;
        C2W4 dynamicViews = C2W4.LJLIL;
        o.LJIIIZ(feedbackType, "feedbackType");
        o.LJIIIZ(feedbackItemViewIdsWithoutTouch, "feedbackItemViewIds");
        o.LJIIIZ(feedbackItemViewIdsWithoutTouch, "feedbackItemViewIdsWithoutTouch");
        o.LJIIIZ(dynamicViews, "dynamicViews");
        this.LJLIL = feedbackType;
        this.LJLILLLLZI = 0;
        this.LJLJI = feedbackItemViewIdsWithoutTouch;
        this.LJLJJI = feedbackItemViewIdsWithoutTouch;
        this.LJLJJL = null;
        this.LJLJJLL = dynamicViews;
        this.LJLJL = true;
    }
}
