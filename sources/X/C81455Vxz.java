package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81455Vxz extends LinearLayout implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final EnumC81461Vy5 LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public TuxTextView LJLJJL;
    public RecyclerView LJLJJLL;
    public TuxTextView LJLJL;
    public T4X LJLJLJ;
    public View LJLJLLL;
    public C40871j1<Object> LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final C82632Wbs LJLLL;
    public final List<Object> LJLLLL;
    public final List<Object> LJLLLLLL;
    public final List<Object> LJLZ;
    public final List<Object> LJZ;

    static {
        TBT tbt = new TBT(C81455Vxz.class, "commentAndQuestionStickerPanelApi", "getCommentAndQuestionStickerPanelApi()Lcom/ss/android/ugc/aweme/panel/CommentAndQuestionStickerPanelApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt};
    }

    public final boolean LIZ() {
        List<Object> list = this.LJLLLL;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        EnumC81461Vy5 enumC81461Vy5 = this.LJLIL;
        if (enumC81461Vy5 == EnumC81461Vy5.RecommendComment || enumC81461Vy5 == EnumC81461Vy5.FavoriteComment || ((enumC81461Vy5 == EnumC81461Vy5.RecommendQuestion && ((ArrayList) HJN.LIZIZ).isEmpty()) || (this.LJLIL == EnumC81461Vy5.FavoriteQuestion && ((ArrayList) HJN.LIZJ).isEmpty()))) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int i;
        int i2;
        CommentVideoModel commentVideoModel;
        QaStruct qaStruct;
        RecyclerView recyclerView = this.LJLJJLL;
        if (recyclerView == null) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            int[] LLIL = staggeredGridLayoutManager.LLIL(null);
            int[] LLILII = staggeredGridLayoutManager.LLILII(null);
            Integer LJJLI = ORY.LJJLI(LLIL);
            if (LJJLI != null) {
                i = LJJLI.intValue();
            } else {
                i = LLIL[0];
            }
            Integer LJJJZ = ORY.LJJJZ(LLILII);
            if (LJJJZ != null) {
                i2 = LJJJZ.intValue();
            } else {
                i2 = 0;
            }
            if (i > i2) {
                return;
            }
            while (true) {
                try {
                    View LJJIJIL = staggeredGridLayoutManager.LJJIJIL(i);
                    if (LJJIJIL != null && LJJIJIL.getGlobalVisibleRect(new Rect())) {
                        if (!((ArrayList) this.LJZ).contains(ListProtector.get(this.LJLLLL, i))) {
                            int i3 = C81460Vy4.LIZ[this.LJLIL.ordinal()];
                            if (i3 != 3 && i3 != 6) {
                                InterfaceC81454Vxy commentAndQuestionStickerPanelApi = getCommentAndQuestionStickerPanelApi();
                                Object obj = ListProtector.get(this.LJLLLL, i);
                                if (obj instanceof QaStruct) {
                                    qaStruct = (QaStruct) obj;
                                } else {
                                    qaStruct = null;
                                }
                                commentAndQuestionStickerPanelApi.lo(qaStruct, this.LJLIL);
                            } else {
                                InterfaceC81454Vxy commentAndQuestionStickerPanelApi2 = getCommentAndQuestionStickerPanelApi();
                                Object obj2 = ListProtector.get(this.LJLLLL, i);
                                if (obj2 instanceof CommentVideoModel) {
                                    commentVideoModel = (CommentVideoModel) obj2;
                                } else {
                                    commentVideoModel = null;
                                }
                                commentAndQuestionStickerPanelApi2.Bv(commentVideoModel);
                            }
                        }
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (i != i2) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final InterfaceC81454Vxy getCommentAndQuestionStickerPanelApi() {
        return (InterfaceC81454Vxy) this.LJLLL.LIZ(this, LJZI[0]);
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public final EnumC81461Vy5 getItemType() {
        return this.LJLIL;
    }

    public final void setIsVisibleToUser(boolean z) {
        RecyclerView recyclerView = this.LJLJJLL;
        if (recyclerView != null) {
            C16360ka.LJIJI(recyclerView, z);
        } else {
            o.LJIJI("recycleView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x01a8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C81455Vxz(android.content.Context r20, X.EnumC81461Vy5 r21, X.C82622Wbi r22) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81455Vxz.<init>(android.content.Context, X.Vy5, X.Wbi):void");
    }
}
