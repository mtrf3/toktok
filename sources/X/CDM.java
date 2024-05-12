package X;

import Y.AfS36S0101000_5;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CDM extends CDI {
    public final ViewGroup LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final /* synthetic */ CDG LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDM(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dgt, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLJJI = cdg;
        this.LJLIL = parent;
        this.LJLILLLLZI = (C47121t6) this.itemView.findViewById(R.id.mo6);
        this.LJLJI = (LinearLayout) this.itemView.findViewById(R.id.aih);
    }

    public static void M(C28290B8k c28290B8k, BenefitView benefitView) {
        if (c28290B8k == null || benefitView == null) {
            return;
        }
        String str = CDR.LIZ(benefitView.benefitType).LJLILLLLZI;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#00");
        String substring = str.substring(3);
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        LIZ.append(substring);
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{C29716BlQ.LIZIZ(str), C29716BlQ.LIZIZ(X1D.LIZIZ(LIZ))});
        gradientDrawable.setCornerRadius(C15380j0.LIZ(8.0f));
        c28290B8k.getBgView().setBackground(gradientDrawable);
        c28290B8k.getTitle().setText(benefitView.benefitDescription);
        C15650jR.LIZ().LJIIIZ(benefitView.benefitImage).LJIIJJI(c28290B8k.getIcon());
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        o.LJIIIZ(holder, "holder");
        List<CDP> list = this.LJLJJI.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((CDP) next).LIZIZ != null) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        AbstractC73672Svk.LJIIJ(new CDN(size, this, arrayList)).LJII(new C62705OjF()).LJJJLIIL(new AfS36S0101000_5(size, this, 59), CDL.LJLIL);
    }
}
