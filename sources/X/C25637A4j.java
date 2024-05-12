package X;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentRefundFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A4j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25637A4j implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ PaidContentRefundFragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C71897SJp LJLJI;

    public C25637A4j(PaidContentRefundFragment paidContentRefundFragment, String str, C71897SJp c71897SJp) {
        this.LJLIL = paidContentRefundFragment;
        this.LJLILLLLZI = str;
        this.LJLJI = c71897SJp;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            List<CheckBox> list = this.LJLIL.LJLJI;
            C71897SJp c71897SJp = this.LJLJI;
            for (CheckBox checkBox : list) {
                if (!o.LJ(c71897SJp, checkBox)) {
                    checkBox.setChecked(false);
                }
            }
            this.LJLIL.wl("select_collection_refund_reason", this.LJLILLLLZI);
        }
        this.LJLIL.Dl();
    }
}
