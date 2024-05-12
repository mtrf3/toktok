package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.AeZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26743AeZ extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ SearchInputItemViewHolder LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26743AeZ(long j, C68322mC<String> c68322mC, String str, SearchInputItemViewHolder searchInputItemViewHolder) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = str;
        this.LJLJJI = searchInputItemViewHolder;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        boolean z;
        Object obj;
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("stay_time", Long.valueOf(this.LJLIL));
        logView.plusAssign("input_method", this.LJLILLLLZI.element);
        String str = this.LJLJI;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("has_normal_input", obj);
        logView.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (this.LJLJJI.LJLJL) {
            str2 = "1";
        }
        logView.plusAssign("has_sug_input", str2);
        logView.plusAssign("is_valid", "1");
        return C76800UCe.LIZ;
    }
}
