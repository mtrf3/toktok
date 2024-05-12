package X;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Om5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62881Om5 implements InterfaceC62886OmA {
    public final C29S LIZ;
    public final LinearLayout LIZIZ;
    public final ArrayList<C62882Om6> LIZJ;
    public final int LIZLLL;
    public int LJ;
    public final ChooseItemViewModel LJFF;
    public final C62822Ol8 LJI;

    public final List<DislikeHashTag> LIZLLL() {
        return (List) this.LJI.getValue();
    }

    @Override // X.InterfaceC62886OmA
    public final void LIZ(C62882Om6 v) {
        o.LJIIIZ(v, "v");
        ChooseItemViewModel chooseItemViewModel = this.LJFF;
        int i = chooseItemViewModel.LJLILLLLZI;
        int i2 = 0;
        if (v.LIZLLL == 1) {
            int i3 = i + 1;
            chooseItemViewModel.LJLILLLLZI = i3;
            if (chooseItemViewModel.LJLJJI) {
                i2 = i3;
            }
            chooseItemViewModel.gv0(chooseItemViewModel.LJLIL + i2);
            LIZJ(i3, i);
            return;
        }
        int i4 = i - 1;
        chooseItemViewModel.LJLILLLLZI = i4;
        if (chooseItemViewModel.LJLJJI) {
            i2 = i4;
        }
        chooseItemViewModel.gv0(chooseItemViewModel.LJLIL + i2);
        LIZJ(i4, i);
    }

    public final void LIZIZ(List<DislikeHashTag> list) {
        LinearLayout linearLayout = this.LIZIZ;
        C29S c29s = this.LIZ;
        AttributeSet attributeSet = null;
        C119774mz c119774mz = new C119774mz(c29s, null, 6);
        c119774mz.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c119774mz.setGravity(-1);
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            DislikeHashTag dislikeHashTag = (DislikeHashTag) it.next();
            TuxTextView tuxTextView = new TuxTextView(c29s, attributeSet, 6, 0);
            int LIZ = (int) C74275TDb.LIZ(12.0f);
            int LIZ2 = (int) C74275TDb.LIZ(9.5f);
            int LIZ3 = (int) C74275TDb.LIZ(80.0f);
            tuxTextView.setText(dislikeHashTag.getName());
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setSingleLine(true);
            tuxTextView.setMinWidth(LIZ3);
            tuxTextView.setGravity(17);
            C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(LIZ), Integer.valueOf(LIZ2), Integer.valueOf(LIZ), Integer.valueOf(LIZ2), 16);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int LIZ4 = (int) C74275TDb.LIZ(8.0f);
            marginLayoutParams.setMarginStart(LIZ4);
            marginLayoutParams.bottomMargin = LIZ4;
            tuxTextView.setLayoutParams(marginLayoutParams);
            c119774mz.addView(tuxTextView);
            ArrayList<C62882Om6> arrayList = this.LIZJ;
            C62882Om6 c62882Om6 = new C62882Om6(tuxTextView, dislikeHashTag, this);
            if (this.LJ <= 0 && c62882Om6.LIZLLL == 0) {
                c62882Om6.LIZ(-1);
            }
            arrayList.add(c62882Om6);
            attributeSet = null;
        }
        linearLayout.addView(c119774mz);
    }

    public C62881Om5(C29S activity, LinearLayout linearLayout) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = linearLayout;
        this.LIZJ = new ArrayList<>();
        this.LIZLLL = 100;
        this.LJ = 100;
        this.LJFF = (ChooseItemViewModel) ViewModelProviders.of(activity).get(ChooseItemViewModel.class);
        this.LJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 561));
    }

    public final void LIZJ(int i, int i2) {
        int i3 = this.LJ;
        if (i >= i3) {
            Iterator<C62882Om6> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                C62882Om6 next = it.next();
                if (next.LIZLLL == 0) {
                    next.LIZ(-1);
                }
            }
            return;
        }
        if (i2 >= i3 && i < i3) {
            Iterator<C62882Om6> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                C62882Om6 next2 = it2.next();
                if (next2.LIZLLL == -1) {
                    next2.LIZ(0);
                }
            }
        }
    }
}
