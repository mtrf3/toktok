package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.WnS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83350WnS extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, String, C76800UCe> {
    public final /* synthetic */ C83343WnL LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83350WnS(C83343WnL c83343WnL, int i) {
        super(2);
        this.LJLIL = c83343WnL;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, String str) {
        int i;
        int intValue = num.intValue();
        String value = str;
        o.LJIIIZ(value, "value");
        VideoPublishEditModel model = this.LJLIL.LJLIL;
        if (EnumC83354WnW.values()[this.LJLILLLLZI & 31] == EnumC83354WnW.FOLLOW_UP_QUESTIONS) {
            i = 1;
        } else {
            i = 0;
        }
        String rank = String.valueOf(intValue);
        o.LJIIIZ(model, "model");
        o.LJIIIZ(rank, "rank");
        C188727au c188727au = new C188727au();
        C83348WnQ.LIZLLL(model, c188727au);
        c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
        c188727au.LJIIIZ("enter_method", "click_icon");
        c188727au.LJIIIZ("process_id", "null");
        c188727au.LJIIIZ("query_message_id", "null");
        c188727au.LIZLLL(i, "creation_interaction_source");
        c188727au.LJIIIZ("rank", rank);
        c188727au.LJI("interaction_name", value);
        FMX.LJIIL("quick_interaction_click", c188727au.LIZ);
        this.LJLIL.LJLJI.invoke(new C83357WnZ(value, "quick_reaction", 2));
        return C76800UCe.LIZ;
    }
}
