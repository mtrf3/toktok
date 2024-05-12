package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.keywords.KeyWordsViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.SKp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71923SKp implements TextView.OnEditorActionListener {
    public final /* synthetic */ T5T LJLIL;
    public final /* synthetic */ C71920SKm LJLILLLLZI;

    public C71923SKp(T5T t5t, C71920SKm c71920SKm) {
        this.LJLIL = t5t;
        this.LJLILLLLZI = c71920SKm;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 6) {
            String valueOf = String.valueOf(this.LJLIL.getText());
            if (valueOf.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.LJLILLLLZI.LIZ.LJLILLLLZI.LJLJJI.size() >= 300) {
                    this.LJLIL.clearFocus();
                    C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
                    c26045AKb.LJIIIZ(this.LJLIL.getContext().getString(R.string.hma, 300));
                    c26045AKb.LJIIJ();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("failed_reason", "over");
                    FMX.LJIIL("keyword_filter_add_failed_ck", c188727au.LIZ);
                    return false;
                }
                KeyWordsViewModel keyWordsViewModel = this.LJLILLLLZI.LIZ.LJLILLLLZI;
                keyWordsViewModel.LJLJJLL = true;
                List<String> LLJILJILJ = ORZ.LLJILJILJ(keyWordsViewModel.LJLJJI);
                ListProtector.add(LLJILJILJ, 0, valueOf);
                keyWordsViewModel.LJLJJI = LLJILJILJ;
                InterfaceC71924SKq interfaceC71924SKq = keyWordsViewModel.LJLJJL;
                if (interfaceC71924SKq != null) {
                    interfaceC71924SKq.LIZJ(valueOf);
                }
                String str = this.LJLILLLLZI.LIZ.LJLIL;
                C188727au LIZLLL = KNV.LIZLLL(str, "enterMethod");
                LIZLLL.LJIIIZ("enter_method", str);
                LIZLLL.LJIIIZ("keyword", valueOf);
                FMX.LJIIL("keyword_filter_add_ck", LIZLLL.LIZ);
                this.LJLIL.clearFocus();
                this.LJLIL.setText("");
            } else {
                this.LJLIL.clearFocus();
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("failed_reason", "null");
                FMX.LJIIL("keyword_filter_add_failed_ck", c188727au2.LIZ);
                C26045AKb c26045AKb2 = new C26045AKb(this.LJLIL);
                c26045AKb2.LJIIIIZZ(R.string.djx);
                c26045AKb2.LJIIJ();
            }
        }
        return false;
    }
}
