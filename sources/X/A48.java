package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.fragments.ReplyFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A48 {
    public static ReplyFragment LIZ(CollectionDetailModel collectionDetailModel, A4Y reviewObject, long j, String str, String str2) {
        o.LJIIIZ(reviewObject, "reviewObject");
        ReplyFragment replyFragment = new ReplyFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("review_object", reviewObject);
        bundle.putLong("collection_id", j);
        bundle.putString("reply_ref_id", str);
        bundle.putString("enter_from", str2);
        ReplyFragment.LJLJL = collectionDetailModel;
        replyFragment.setArguments(bundle);
        return replyFragment;
    }
}
