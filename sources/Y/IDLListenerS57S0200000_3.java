package Y;

import X.C023107f;
import X.C187747Yk;
import X.C201177uz;
import X.C201577vd;
import X.C208218Fd;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageDescriptionAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;

/* loaded from: classes4.dex */
public class IDLListenerS57S0200000_3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS57S0200000_3 iDLListenerS57S0200000_3) {
        Layout layout = ((C208218Fd) iDLListenerS57S0200000_3.l0).getLayout();
        if (layout != null) {
            C208218Fd c208218Fd = (C208218Fd) iDLListenerS57S0200000_3.l0;
            TextView.BufferType bufferType = (TextView.BufferType) iDLListenerS57S0200000_3.l1;
            c208218Fd.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS57S0200000_3);
            c208218Fd.LJJJJJ(layout, bufferType);
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS57S0200000_3 iDLListenerS57S0200000_3) {
        if (((View) iDLListenerS57S0200000_3.l0).getHeight() == 0) {
            return;
        }
        StoryViewerListFragment storyViewerListFragment = (StoryViewerListFragment) iDLListenerS57S0200000_3.l1;
        if (storyViewerListFragment.LJLJI) {
            return;
        }
        storyViewerListFragment.LJLJI = true;
        View view = (View) iDLListenerS57S0200000_3.l0;
        storyViewerListFragment.vl(view, view.getHeight(), 0, null);
    }

    public static final void onGlobalLayout$2(IDLListenerS57S0200000_3 iDLListenerS57S0200000_3) {
        Rect rect = new Rect();
        ((C201577vd) iDLListenerS57S0200000_3.l0).getLocalVisibleRect(rect);
        if (rect.top >= 0 && rect.bottom <= ((C201577vd) iDLListenerS57S0200000_3.l0).getHeight()) {
            int i = rect.bottom;
            Layout layout = ((C201577vd) iDLListenerS57S0200000_3.l0).getLayout();
            if (layout != null) {
                C201177uz c201177uz = (C201177uz) iDLListenerS57S0200000_3.l1;
                int lineEnd = layout.getLineEnd(layout.getLineForVertical(i));
                PostModeContainerViewModel postModeContainerViewModel = c201177uz.LIZ.LJII;
                if (postModeContainerViewModel == null) {
                    return;
                }
                int i2 = postModeContainerViewModel.LLILLL;
                if (lineEnd < i2) {
                    lineEnd = i2;
                }
                postModeContainerViewModel.LLILLL = lineEnd;
            }
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS57S0200000_3 iDLListenerS57S0200000_3) {
        C187747Yk c187747Yk = (C187747Yk) iDLListenerS57S0200000_3.l0;
        c187747Yk.LLIIJI = c187747Yk.LJLILLLLZI.getWidth();
        C187747Yk c187747Yk2 = (C187747Yk) iDLListenerS57S0200000_3.l0;
        if (c187747Yk2.LLIIJI != 0 && !c187747Yk2.LLIIIZ) {
            c187747Yk2.LJ((Aweme) iDLListenerS57S0200000_3.l1);
            ((C187747Yk) iDLListenerS57S0200000_3.l0).LLIIIZ = true;
        }
    }

    public static final void onGlobalLayout$4(IDLListenerS57S0200000_3 iDLListenerS57S0200000_3) {
        int paddingLeft = ((TextView) iDLListenerS57S0200000_3.l0).getPaddingLeft();
        int paddingRight = ((TextView) iDLListenerS57S0200000_3.l0).getPaddingRight();
        if (TextUtils.ellipsize((CharSequence) iDLListenerS57S0200000_3.l1, ((TextView) iDLListenerS57S0200000_3.l0).getPaint(), ((TextView) iDLListenerS57S0200000_3.l0).getMaxLines() * ((((TextView) iDLListenerS57S0200000_3.l0).getWidth() - paddingLeft) - paddingRight), TextUtils.TruncateAt.END).length() < ((CharSequence) iDLListenerS57S0200000_3.l1).length()) {
            ((TextView) iDLListenerS57S0200000_3.l0).getLayoutParams().height = ((TextView) iDLListenerS57S0200000_3.l0).getHeight();
            ((TextView) iDLListenerS57S0200000_3.l0).setMaxLines(999);
            C023107f.LIZIZ((TextView) iDLListenerS57S0200000_3.l0, 1, 999, 1, 0);
        }
        ((TextView) iDLListenerS57S0200000_3.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS57S0200000_3);
    }

    public static final void onGlobalLayout$5(IDLListenerS57S0200000_3 iDLListenerS57S0200000_3) {
        int i;
        Rect rect = new Rect();
        ((C201577vd) iDLListenerS57S0200000_3.l0).getLocalVisibleRect(rect);
        if (rect.top >= 0 && rect.bottom <= ((C201577vd) iDLListenerS57S0200000_3.l0).getHeight()) {
            int i2 = rect.bottom;
            Layout layout = ((C201577vd) iDLListenerS57S0200000_3.l0).getLayout();
            if (layout != null) {
                FullPageDescriptionAssem fullPageDescriptionAssem = (FullPageDescriptionAssem) iDLListenerS57S0200000_3.l1;
                int lineEnd = layout.getLineEnd(layout.getLineForVertical(i2));
                PostModeContainerViewModel v3 = fullPageDescriptionAssem.v3();
                if (v3 == null) {
                    return;
                }
                PostModeContainerViewModel v32 = fullPageDescriptionAssem.v3();
                if (v32 != null) {
                    i = v32.LLILLL;
                } else {
                    i = 0;
                }
                if (lineEnd < i) {
                    lineEnd = i;
                }
                v3.LLILLL = lineEnd;
            }
        }
    }

    public static final void onGlobalLayout$6(IDLListenerS57S0200000_3 iDLListenerS57S0200000_3) {
        int paddingLeft = ((TextView) iDLListenerS57S0200000_3.l0).getPaddingLeft();
        int paddingRight = ((TextView) iDLListenerS57S0200000_3.l0).getPaddingRight();
        if (TextUtils.ellipsize((CharSequence) iDLListenerS57S0200000_3.l1, ((TextView) iDLListenerS57S0200000_3.l0).getPaint(), ((TextView) iDLListenerS57S0200000_3.l0).getMaxLines() * ((((TextView) iDLListenerS57S0200000_3.l0).getWidth() - paddingLeft) - paddingRight), TextUtils.TruncateAt.END).length() < ((CharSequence) iDLListenerS57S0200000_3.l1).length()) {
            ((TextView) iDLListenerS57S0200000_3.l0).getLayoutParams().height = ((TextView) iDLListenerS57S0200000_3.l0).getHeight();
            ((TextView) iDLListenerS57S0200000_3.l0).setMaxLines(999);
            C023107f.LIZIZ((TextView) iDLListenerS57S0200000_3.l0, 1, 999, 1, 0);
        }
        ((TextView) iDLListenerS57S0200000_3.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS57S0200000_3);
    }

    public IDLListenerS57S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
