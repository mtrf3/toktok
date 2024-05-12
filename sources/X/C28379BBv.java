package X;

import Y.IDxS306S0100000_5;
import com.bytedance.android.livesdk.adminsetting.fastfiltercomment.FastFilterCommentFragmentSheet;

/* renamed from: X.BBv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28379BBv<T> implements InterfaceC15040iS {
    public final /* synthetic */ FastFilterCommentFragmentSheet LIZ;

    public C28379BBv(FastFilterCommentFragmentSheet fastFilterCommentFragmentSheet) {
        this.LIZ = fastFilterCommentFragmentSheet;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        FastFilterCommentFragmentSheet fastFilterCommentFragmentSheet = this.LIZ;
        C28376BBs c28376BBs = fastFilterCommentFragmentSheet.LLD;
        if (c28376BBs != null) {
            c28376BBs.LJI(new IDxS306S0100000_5(fastFilterCommentFragmentSheet, 0), true);
        }
        FastFilterCommentFragmentSheet fastFilterCommentFragmentSheet2 = this.LIZ;
        fastFilterCommentFragmentSheet2.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_filter_suggestion_popup_click");
        LIZ.LJI();
        LIZ.LJIJJ(fastFilterCommentFragmentSheet2.LLF, "trigger");
        LIZ.LJIJJ(fastFilterCommentFragmentSheet2.LLFF, "action");
        LIZ.LJJIIJZLJL();
    }
}
