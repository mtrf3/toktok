package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell.ToolEntryCellNew;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lxz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55975Lxz extends LinearLayout {
    public View LJLIL;
    public View LJLILLLLZI;

    public final void LIZ() {
        setVisibility(8);
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLIL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55975Lxz(Context context) {
        super(context, null);
        new LinkedHashMap();
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setVisibility(4);
    }

    public final void setNewStyleContent(List<ToolEntryVO> toolList) {
        o.LJIIIZ(toolList, "toolList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(toolList, 10));
        Iterator<ToolEntryVO> it = toolList.iterator();
        while (it.hasNext()) {
            arrayList.add(new C55954Lxe(it.next()));
        }
        setVisibility(0);
        View view = this.LJLILLLLZI;
        if (view == null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ao6, this, false);
            this.LJLILLLLZI = LLLLIILL;
            addView(LLLLIILL);
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                SYL syl = (SYL) view2.findViewById(R.id.ftw);
                syl.LLLF.LJZL(ToolEntryCellNew.class);
                syl.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.LLJJIII(0);
                syl.setLayoutManager(linearLayoutManager);
            }
        } else {
            view.setVisibility(0);
        }
        View view3 = this.LJLIL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }
}
