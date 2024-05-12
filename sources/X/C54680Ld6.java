package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.roaming.RegionSearchHeaderAssem;
import kotlin.jvm.internal.AqS32S1000000_9;

/* renamed from: X.Ld6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54680Ld6 implements TextView.OnEditorActionListener {
    public final /* synthetic */ RegionSearchHeaderAssem LJLIL;

    public C54680Ld6(RegionSearchHeaderAssem regionSearchHeaderAssem) {
        this.LJLIL = regionSearchHeaderAssem;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            RegionSearchHeaderAssem regionSearchHeaderAssem = this.LJLIL;
            ((AssemViewModel) this.LJLIL.LJLJJI.getValue()).setState(new AqS32S1000000_9((String) regionSearchHeaderAssem.withState((AssemViewModel) regionSearchHeaderAssem.LJLJJI.getValue(), C54679Ld5.LJLIL), 15));
            return true;
        }
        return false;
    }
}
