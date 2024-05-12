package com.ss.android.ugc.aweme.profile.survey;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class SurveyAnswer extends F9E {

    @InterfaceC65349Pkn("action_type")
    public int actionType;

    @InterfaceC65349Pkn("dialog_id")
    public int dialogId;

    @InterfaceC65349Pkn("original_id")
    public int originalId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.actionType), Integer.valueOf(this.dialogId), Integer.valueOf(this.originalId)};
    }

    public SurveyAnswer(int i, int i2, int i3) {
        this.actionType = i;
        this.dialogId = i2;
        this.originalId = i3;
    }
}
