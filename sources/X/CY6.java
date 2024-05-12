package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class CY6 implements View.OnLayoutChangeListener {
    public final /* synthetic */ OnlineAudienceRankWidget LJLIL;
    public final /* synthetic */ C68322mC<List<CV6>> LJLILLLLZI;

    public CY6(OnlineAudienceRankWidget onlineAudienceRankWidget, C68322mC<List<CV6>> c68322mC) {
        this.LJLIL = onlineAudienceRankWidget;
        this.LJLILLLLZI = c68322mC;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List, T] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        LinearLayout linearLayout;
        View view2 = this.LJLIL.getView();
        if (view2 != null) {
            i9 = view2.getWidth();
        } else {
            i9 = 0;
        }
        int measuredWidth = i9 - this.LJLIL.LLFZ().getMeasuredWidth();
        int LIZ = C15380j0.LIZ(28.0f);
        OnlineAudienceRankWidget onlineAudienceRankWidget = this.LJLIL;
        if (measuredWidth > 0) {
            i10 = measuredWidth / LIZ;
        } else {
            i10 = 0;
        }
        onlineAudienceRankWidget.LLF = i10;
        if (i10 != 0) {
            if (i10 == 1) {
                if (((ArrayList) onlineAudienceRankWidget.LLIIJI).size() >= 1) {
                    this.LJLILLLLZI.element = ((ArrayList) this.LJLIL.LLIIJI).subList(0, 1);
                    LinearLayout linearLayout2 = this.LJLIL.LLIIIILZ;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                } else {
                    LinearLayout linearLayout3 = this.LJLIL.LLIIIILZ;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    CY0.LIZJ(0, this.LJLIL.dataChannel, false);
                }
            }
        } else {
            LinearLayout linearLayout4 = onlineAudienceRankWidget.LLIIIILZ;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            CY0.LIZJ(0, this.LJLIL.dataChannel, false);
        }
        if (this.LJLILLLLZI.element.size() > 0 && (linearLayout = this.LJLIL.LLIIIILZ) != null && linearLayout.getVisibility() == 0) {
            CY0.LIZJ(this.LJLILLLLZI.element.size(), this.LJLIL.dataChannel, true);
        }
        LinearLayout linearLayout5 = this.LJLIL.LLIIIILZ;
        if (linearLayout5 != null) {
            linearLayout5.removeOnLayoutChangeListener(this);
        }
        CY2 cy2 = this.LJLIL.LLIIIJ;
        if (cy2 != null) {
            cy2.LIZJ(this.LJLILLLLZI.element);
        }
    }
}
