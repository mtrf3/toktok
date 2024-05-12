package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class ON3 implements InterfaceC50599JtT {
    public final /* synthetic */ ON2 LJLIL;
    public final /* synthetic */ ArrayList<Option> LJLILLLLZI;
    public final /* synthetic */ ON6 LJLJI;

    @Override // X.InterfaceC50599JtT
    public final void LIZ(int i, View view) {
        ON2 on2 = this.LJLIL;
        if (on2.LJLJJI == i) {
            return;
        }
        ON0 on0 = on2.LJLJJL;
        if (on0 != null) {
            on0.C2();
        }
        this.LJLIL.LJLJI = (Option) ListProtector.get(this.LJLILLLLZI, i);
        this.LJLIL.LJLJJI = i;
        ON6 on6 = this.LJLJI;
        on6.LJLJI = i;
        on6.notifyDataSetChanged();
    }

    public ON3(ON2 on2, ArrayList<Option> arrayList, ON6 on6) {
        this.LJLIL = on2;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = on6;
    }
}
