package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.shortvideo.model.ImShareContactListStruct;
import defpackage.a1;
import java.util.ArrayList;

/* renamed from: X.2QW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QW extends LinearLayout {
    public final ImShareContactListStruct getSelectedContactList() {
        return new ImShareContactListStruct(new ArrayList());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2QW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
