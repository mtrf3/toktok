package X;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

/* loaded from: classes10.dex */
public class LLG implements TabHost.TabContentFactory {
    public final Context LIZ;

    public LLG(Context context) {
        this.LIZ = context;
    }

    @Override // android.widget.TabHost.TabContentFactory
    public final View createTabContent(String str) {
        View view = new View(this.LIZ);
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
