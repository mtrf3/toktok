package X;

import android.view.View;
import android.widget.AdapterView;
import com.zhihu.matisse.ui.MatisseActivity;

/* renamed from: X.VkB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80599VkB implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C80598VkA LJLIL;

    public C80599VkB(C80598VkA c80598VkA) {
        this.LJLIL = c80598VkA;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.LJLIL.LIZ(i, adapterView.getContext());
        MatisseActivity matisseActivity = this.LJLIL.LIZLLL;
        if (matisseActivity != null) {
            matisseActivity.onItemSelected(adapterView, view, i, j);
        }
    }
}
