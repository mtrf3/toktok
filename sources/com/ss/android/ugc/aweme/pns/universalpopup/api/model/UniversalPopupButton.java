package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UniversalPopupButton extends F9E implements Serializable {

    @InterfaceC65349Pkn("action")
    public final UniversalPopupAction action;

    @InterfaceC65349Pkn("is_highlighted")
    public final boolean isHighlighted;

    @InterfaceC65349Pkn("position")
    public final int position;

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UniversalPopupButton() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupButton.<init>():void");
    }

    public static /* synthetic */ UniversalPopupButton copy$default(UniversalPopupButton universalPopupButton, String str, UniversalPopupAction universalPopupAction, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = universalPopupButton.text;
        }
        if ((i2 & 2) != 0) {
            universalPopupAction = universalPopupButton.action;
        }
        if ((i2 & 4) != 0) {
            z = universalPopupButton.isHighlighted;
        }
        if ((i2 & 8) != 0) {
            i = universalPopupButton.position;
        }
        return universalPopupButton.copy(str, universalPopupAction, z, i);
    }

    public final UniversalPopupButton copy(String text, UniversalPopupAction action, boolean z, int i) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(action, "action");
        return new UniversalPopupButton(text, action, z, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.text, this.action, Boolean.valueOf(this.isHighlighted), Integer.valueOf(this.position)};
    }

    public final UniversalPopupAction getAction() {
        return this.action;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public UniversalPopupButton(String text, UniversalPopupAction action, boolean z, int i) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(action, "action");
        this.text = text;
        this.action = action;
        this.isHighlighted = z;
        this.position = i;
    }

    public /* synthetic */ UniversalPopupButton(String str, UniversalPopupAction universalPopupAction, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? new UniversalPopupAction(null, null, null, null, 0, null, null, false, null, null, 1023, null) : universalPopupAction, (i2 & 4) != 0 ? false : z, (i2 & 8) == 0 ? i : 0);
    }
}
