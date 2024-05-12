package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.qnasearch.vm.QnaSearchViewModel;

/* loaded from: classes13.dex */
public final class T85 implements TextView.OnEditorActionListener {
    public final /* synthetic */ T8G LJLIL;

    public T85(QnaSearchViewModel qnaSearchViewModel) {
        this.LJLIL = qnaSearchViewModel;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            T8G t8g = this.LJLIL;
            if (t8g != null) {
                t8g.wW();
            }
            KeyboardUtils.LIZIZ(textView);
            return true;
        }
        return false;
    }
}
