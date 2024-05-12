package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.79Q, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C79Q {
    public final C79V LJLIL;
    public String LJLILLLLZI;
    public Aweme LJLJI;
    public boolean LJLJJI;
    public final C79P LJLJJL;

    public abstract boolean LIZJ();

    public abstract void LIZLLL(InterfaceC67352kd<? super A2G<C1809378f>> interfaceC67352kd, C1809378f c1809378f);

    public abstract void LJ(InterfaceC67352kd<? super A2G<C1809378f>> interfaceC67352kd);

    public abstract void LJFF();

    public abstract boolean LJI();

    public void LIZIZ() {
        ReactionBubbleDescriptionCell reactionBubbleDescriptionCell;
        C7G0 c7g0;
        this.LJLILLLLZI = "";
        C79V c79v = this.LJLIL;
        RecyclerView.ViewHolder LJJIZ = c79v.LJJIZ(1);
        if ((LJJIZ instanceof ReactionBubbleDescriptionCell) && (reactionBubbleDescriptionCell = (ReactionBubbleDescriptionCell) LJJIZ) != null && (c7g0 = reactionBubbleDescriptionCell.LJLJLLL) != null) {
            c7g0.LJLIL.LJLIL.LIZLLL();
        }
        c79v.LLLILZLLLI = -1;
        c79v.LLLILZJ = c79v.getFirstDataPositionInState();
        c79v.LLLIZZ = false;
        c79v.LLLI = false;
        c79v.setVisibility(4);
        c79v.LJZ();
        c79v.LJLI(0);
        c79v.getState().LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.79P, X.SYg] */
    public C79Q(C79V commentBubbleList) {
        o.LJIIIZ(commentBubbleList, "commentBubbleList");
        this.LJLIL = commentBubbleList;
        this.LJLILLLLZI = "";
        final C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 10;
        c57939MoZ.LIZIZ = false;
        ?? r0 = new AbstractC72278SYg<C1809378f>(c57939MoZ) { // from class: X.79P
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC67352kd<? super A2G<C1809378f>> continuation) {
                o.LJIIIZ(continuation, "continuation");
                C79Q.this.LJ(continuation);
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC67352kd continuation, Object obj) {
                C1809378f params = (C1809378f) obj;
                o.LJIIIZ(continuation, "continuation");
                o.LJIIIZ(params, "params");
                C79Q.this.LIZLLL(continuation, params);
            }
        };
        this.LJLJJL = r0;
        commentBubbleList.LJLJLLL(r0);
        LJFF();
    }

    public void LIZ(Aweme aweme) {
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        this.LJLILLLLZI = aid;
        if (this.LJLIL.getState().LJIIIIZZ() > 0) {
            this.LJLIL.setVisibility(0);
        }
        getOperator().refresh();
        this.LJLJI = aweme;
    }
}
