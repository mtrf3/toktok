package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import kotlin.jvm.internal.o;

/* renamed from: X.74G, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C74G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(TextView tv, RelationDynamicLabel relationDynamicLabel) {
        String labelInfo;
        o.LJIIIZ(tv, "tv");
        if (relationDynamicLabel != null && (labelInfo = relationDynamicLabel.getLabelInfo()) != null && labelInfo.length() > 0) {
            tv.setText(labelInfo);
            tv.setVisibility(0);
        } else {
            tv.setVisibility(8);
        }
    }
}
