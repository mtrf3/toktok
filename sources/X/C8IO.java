package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8IO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IO extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFeedMultiTagAssem, C43I<? extends String>, C76800UCe> {
    public static final C8IO LJLIL = new C8IO();

    public C8IO() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFeedMultiTagAssem videoFeedMultiTagAssem, C43I<? extends String> c43i) {
        VideoItemParams gv0;
        Aweme aweme;
        String str;
        VideoItemParams gv02;
        JSONObject jSONObject;
        Context context;
        Activity LJIJJ;
        C7G8 c7g8;
        VideoFeedMultiTagAssem tag = videoFeedMultiTagAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(tag, "$this$tag");
        if (c43i2 != null && c43i2.LIZ != 0 && (gv0 = tag.q4().gv0()) != null && (aweme = gv0.getAweme()) != null && (str = tag.q4().LJLJI) != null && (gv02 = tag.q4().gv0()) != null && (jSONObject = gv02.mRequestId) != null && (context = tag.getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (c7g8 = tag.LLFZ) != null) {
            int LJFF = c7g8.LJLIL.LJFF(aweme, LJIJJ, str, jSONObject, false, c7g8);
            boolean z = false;
            if (LJFF == 0) {
                if (C209078Il.LIZ()) {
                    tag.getContainerView().setVisibility(8);
                }
                C7G8 c7g82 = tag.LLFZ;
                if (c7g82 != null) {
                    c7g82.LJIILLIIL();
                }
            } else {
                C7G8 c7g83 = tag.LLFZ;
                if (c7g83 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    c7g83.LJIILL();
                    c7g83.LJIILLIIL();
                    if (c7g83.LJLIL.LIZJ()) {
                        c7g83.setVisibility(0);
                        c7g83.LJLIL.LIZIZ(c7g83);
                    }
                    if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                        EIT.LIZ("system_launch").LIZIZ(System.currentTimeMillis() - currentTimeMillis, "FeedMultiTagLayout:reveal");
                    }
                }
                if (C209078Il.LIZ()) {
                    tag.getContainerView().setVisibility(0);
                }
            }
            String LIZ = C210888Pk.LIZ(C210888Pk.LIZLLL(tag.a1()), ((VideoItemParams) C51029K0z.LJIILLIIL(tag)).mEventType, ((VideoItemParams) C51029K0z.LJIILLIIL(tag)).getAweme().getAnchors());
            if (!TextUtils.isEmpty(LIZ) && !((VideoItemParams) C51029K0z.LJIILLIIL(tag)).getAweme().isAd()) {
                if (tag.getContainerView().getVisibility() == 0 && LJFF != 0) {
                    z = true;
                }
                InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) tag.LLFII.getValue();
                if (interactAreaCommonAbility != null) {
                    interactAreaCommonAbility.zn(LIZ, null, z);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
