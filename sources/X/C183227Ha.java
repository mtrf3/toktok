package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183227Ha extends AbstractC65781Prl implements InterfaceC65784Pro<C183197Gx> {
    public static final C183227Ha LJLIL = new C183227Ha();

    public C183227Ha() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7Gx] */
    @Override // X.InterfaceC65784Pro
    public final C183197Gx invoke() {
        return new InterfaceC175126u4() { // from class: X.7Gx
            @Override // X.InterfaceC175126u4
            public final void LIZ(String str) {
            }

            @Override // X.InterfaceC175126u4
            public final boolean LIZIZ(UpvoteStruct upvoteStruct) {
                return false;
            }

            @Override // X.InterfaceC175126u4
            public final void LIZLLL(String str, UpvoteStruct upvoteStruct) {
            }

            @Override // X.InterfaceC175126u4
            public final void LJFF(String str, String str2, boolean z, List list, List list2) {
            }

            @Override // X.InterfaceC175126u4
            public final boolean LJIIIZ(Throwable th) {
                return false;
            }

            @Override // X.InterfaceC175126u4
            public final void LJ(String str, EnumC177746yI removeReason) {
                o.LJIIIZ(removeReason, "removeReason");
            }

            @Override // X.InterfaceC175126u4
            public final void LJI(String aid, UpvoteList upvoteList) {
                o.LJIIIZ(aid, "aid");
            }

            @Override // X.InterfaceC175126u4
            public final void LJII(String str, EnumC177746yI removeReason) {
                o.LJIIIZ(removeReason, "removeReason");
            }

            @Override // X.InterfaceC175126u4
            public final void LJIIIIZZ(String str, UpvoteList upvoteList, boolean z, int i) {
                o.LJIIIZ(upvoteList, "upvoteList");
            }

            @Override // X.InterfaceC175126u4
            public final void LIZJ(String str, long j, String insertId, String str2, C7H0 c7h0) {
                o.LJIIIZ(insertId, "insertId");
            }
        };
    }
}
