package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56982Lm extends C2LB {
    public final void LJIIJJI(C50420Jqa event) {
        Activity activity;
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        Aweme aweme = (Aweme) obj;
        if (!TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getAuthor() == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ECCommerce , author is null and awemeid is ");
                LIZ.append(aweme.getAid());
                PEH.LIZIZ(X1D.LIZIZ(LIZ));
                return;
            }
            if (!aweme.hasPromotion() || (activity = this.LJLIL) == null) {
                return;
            }
            M89 LIZ2 = C2S6.LIZ(activity);
            if (!TextUtils.isEmpty(LIZ2.getEntranceInfo())) {
                LIZ2.getEntranceInfo();
            } else {
                try {
                    new JSONObject(LIZ2.getTracker()).optString("entrance_info");
                } catch (Exception unused) {
                }
            }
        }
    }

    public C56982Lm(String str, int i) {
        super(str, i);
    }

    @Override // X.C2LB
    public final void LJIIIIZZ(Activity context, Fragment fragment) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = context;
        this.LJLILLLLZI = fragment;
    }
}
