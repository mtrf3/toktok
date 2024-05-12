package X;

import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OMt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61787OMt implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C61789OMv LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ List<Option> LJLJI;

    public C61787OMt(C61789OMv c61789OMv, boolean z, List<Option> list) {
        this.LJLIL = c61789OMv;
        this.LJLILLLLZI = z;
        this.LJLJI = list;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ON0 optionClickListener = this.LJLIL.getOptionClickListener();
        if (optionClickListener != null) {
            optionClickListener.C2();
        }
        if (this.LJLILLLLZI) {
            Option option = (Option) ListProtector.get(this.LJLJI, this.LJLIL.getCheckedItemPosition());
            C61780OMm.LIZ = new Option[]{option};
            C61780OMm.LIZIZ = String.valueOf(option.getId());
            return;
        }
        SparseBooleanArray checkedItemPositions = this.LJLIL.getCheckedItemPositions();
        o.LJIIIIZZ(checkedItemPositions, "radioSurvey.checkedItemPositions");
        C61780OMm.LIZIZ = "";
        ArrayList arrayList = new ArrayList();
        int size = checkedItemPositions.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                Option option2 = (Option) ListProtector.get(this.LJLJI, checkedItemPositions.keyAt(i2));
                arrayList.add(option2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C61780OMm.LIZIZ);
                LIZ.append(option2.getId());
                C61780OMm.LIZIZ = X1D.LIZIZ(LIZ);
            }
        }
        C61780OMm.LIZ = (Option[]) arrayList.toArray(new Option[0]);
    }
}
