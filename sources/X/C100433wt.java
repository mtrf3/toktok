package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity;

/* renamed from: X.3wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100433wt {
    public static void LIZ(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) RelationSelectActivity.class);
        if (bundle != null) {
            intent.putExtra("key_member_list_type", 1);
            intent.putExtras(bundle);
        } else {
            intent.putExtra("key_member_list_type", 0);
        }
        C16880lQ.LIZJ(context, intent);
    }
}
