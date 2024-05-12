package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LyI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55994LyI extends C0A6 {
    public final /* synthetic */ List<ToolEntryVO> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<List<ToolEntryVO>, Integer, Integer, C76800UCe> LJLJI;

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                Iterator<ToolEntryVO> it = this.LJLIL.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getCardType() == EnumC56134M1i.CARD_TYPE_MESSAGE_ENTRY.getValue()) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int LLIL = linearLayoutManager.LLIL();
                int LLILLIZIL = linearLayoutManager.LLILLIZIL();
                if (LLIL <= i2 && i2 <= LLILLIZIL) {
                    InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(Boolean.TRUE);
                    }
                } else {
                    InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = this.LJLILLLLZI;
                    if (interfaceC88472Yns2 != null) {
                        interfaceC88472Yns2.invoke(Boolean.FALSE);
                    }
                }
                int LLILLJJLI = linearLayoutManager.LLILLJJLI();
                InterfaceC88473Ynt<List<ToolEntryVO>, Integer, Integer, C76800UCe> interfaceC88473Ynt = this.LJLJI;
                if (interfaceC88473Ynt != null) {
                    interfaceC88473Ynt.invoke(this.LJLIL, 0, Integer.valueOf(LLILLJJLI));
                }
            }
        }
    }

    public C55994LyI(List list, AqS175S0100000_9 aqS175S0100000_9, C55998LyM c55998LyM) {
        this.LJLIL = list;
        this.LJLILLLLZI = aqS175S0100000_9;
        this.LJLJI = c55998LyM;
    }
}
