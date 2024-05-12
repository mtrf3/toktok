package X;

import Y.IDObjectS331S0100000_10;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import com.ss.android.ugc.aweme.share.dislike.NewDislikeReason;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Om2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62878Om2 implements InterfaceC42521GmT {
    public final C29S LIZ;
    public final LinearLayout LIZIZ;
    public NewDislikeReason[] LIZJ;
    public final ChooseItemViewModel LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Integer> LIZJ() {
        String id;
        ArrayList arrayList = new ArrayList();
        NewDislikeReason[] newDislikeReasonArr = this.LIZJ;
        C199797sl c199797sl = new C199797sl(new IDObjectS331S0100000_10(this.LIZIZ, 4).iterator());
        while (c199797sl.hasNext()) {
            C2058786d c2058786d = (C2058786d) c199797sl.next();
            View view = (View) c2058786d.LIZIZ;
            if ((view instanceof C42520GmS) && ((C42520GmS) view).LJLJJI.isChecked() && newDislikeReasonArr != null && (id = newDislikeReasonArr[c2058786d.LIZ].getId()) != null) {
                arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt(id)));
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC42521GmT
    public final void LIZ(C42520GmS v) {
        o.LJIIIZ(v, "v");
        int i = this.LIZLLL.LJLIL;
        int i2 = 0;
        if (v.LJLJJI.isChecked()) {
            ChooseItemViewModel chooseItemViewModel = this.LIZLLL;
            int i3 = i + 1;
            chooseItemViewModel.LJLIL = i3;
            if (chooseItemViewModel.LJLJJI) {
                i2 = chooseItemViewModel.LJLILLLLZI;
            }
            chooseItemViewModel.gv0(i3 + i2);
            return;
        }
        ChooseItemViewModel chooseItemViewModel2 = this.LIZLLL;
        int i4 = i - 1;
        chooseItemViewModel2.LJLIL = i4;
        if (chooseItemViewModel2.LJLJJI) {
            i2 = chooseItemViewModel2.LJLILLLLZI;
        }
        chooseItemViewModel2.gv0(i4 + i2);
    }

    public final void LIZIZ(List<NewDislikeReason> list) {
        o.LJIIIZ(list, "list");
        this.LIZJ = (NewDislikeReason[]) list.toArray(new NewDislikeReason[0]);
        for (NewDislikeReason newDislikeReason : list) {
            LinearLayout linearLayout = this.LIZIZ;
            C42520GmS c42520GmS = new C42520GmS(this.LIZ, this);
            c42520GmS.setDescText(String.valueOf(newDislikeReason.getText()));
            linearLayout.addView(c42520GmS);
        }
    }

    public C62878Om2(C29S activity, LinearLayout linearLayout) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = linearLayout;
        this.LIZLLL = (ChooseItemViewModel) ViewModelProviders.of(activity).get(ChooseItemViewModel.class);
    }
}
