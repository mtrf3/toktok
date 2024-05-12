package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.RuM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71038RuM extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ CpfVH LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71038RuM(long j, C68322mC<String> c68322mC, CpfVH cpfVH) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = cpfVH;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        boolean z;
        Object obj;
        Object obj2;
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("input_box_name", "CPF");
        logView.plusAssign("stay_time", Long.valueOf(this.LJLIL));
        logView.plusAssign("input_method", this.LJLILLLLZI.element);
        Editable text = ((C19K) this.LJLJI._$_findCachedViewById(R.id.cz9)).getText();
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "1";
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("has_normal_input", obj);
        logView.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (this.LJLJI.LJLLJ) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("has_sug_input", obj2);
        if (this.LJLJI.LJLLI != EnumC71040RuO.SUCCESS) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("is_valid", str);
        return C76800UCe.LIZ;
    }
}
