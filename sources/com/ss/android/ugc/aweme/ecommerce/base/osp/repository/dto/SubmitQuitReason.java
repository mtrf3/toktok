package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SubmitQuitReason extends F9E {

    @InterfaceC65349Pkn("input_reasons")
    public final List<InputReason> inputReasons;

    @InterfaceC65349Pkn("reason_show_type")
    public final int reasonShowType;

    @InterfaceC65349Pkn("select_reasons")
    public final List<SelectReason> selectReasons;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.reasonShowType), this.selectReasons, this.inputReasons};
    }

    public SubmitQuitReason(int i, List<SelectReason> selectReasons, List<InputReason> inputReasons) {
        o.LJIIIZ(selectReasons, "selectReasons");
        o.LJIIIZ(inputReasons, "inputReasons");
        this.reasonShowType = i;
        this.selectReasons = selectReasons;
        this.inputReasons = inputReasons;
    }
}
