package X;

import Y.ARunnableS45S0100000_9;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.b0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LuN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55751LuN {
    public static C55751LuN LIZJ;
    public final BaseListFragmentPanel LIZ;
    public final Aweme LIZIZ;

    public final void LIZ() {
        Aweme aweme;
        Aweme aweme2;
        String str;
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            C1DH.LJJIJIIJI(new ARunnableS45S0100000_9(this, 180));
            return;
        }
        if (SharedVideoDeepLinkHelper.LJLL) {
            Aweme aweme3 = this.LIZIZ;
            C2MA curFeedViewHolder = this.LIZ.getCurFeedViewHolder();
            if (curFeedViewHolder != null) {
                aweme = curFeedViewHolder.getAweme();
            } else {
                aweme = null;
            }
            User sharer = aweme3.getSharer();
            String str2 = "";
            if (aweme != null && o.LJ(aweme3.getAid(), aweme.getAid())) {
                if (sharer != null) {
                    BaseListFragmentPanel baseListFragmentPanel = this.LIZ;
                    String aid = aweme3.getAid();
                    if (aid != null) {
                        str2 = aid;
                    }
                    new UVX(baseListFragmentPanel, str2, sharer).LIZIZ();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("current play aweme（");
                LIZ.append(aweme.getAid());
                LIZ.append(") is target, sharer: ");
                LIZ.append(sharer);
                b0.LJFF(LIZ, ", might refresh the view!", LIZ, "@LinkRelation_Video");
                return;
            }
            List LLJI = ORZ.LLJI(this.LIZ.getAdapter().Q8());
            int size = LLJI.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (ListProtector.get(LLJI, i2) != null && (aweme2 = (Aweme) ListProtector.get(LLJI, i2)) != null && aweme2.getAid() != null) {
                    Aweme aweme4 = (Aweme) ListProtector.get(LLJI, i2);
                    if (aweme4 != null) {
                        str = aweme4.getAid();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, aweme3.getAid())) {
                        if (i2 != -1) {
                            this.LIZ.getAdapter().LJ(i2);
                        }
                    }
                }
                i2++;
            }
            String requestId = aweme3.getRequestId();
            if (requestId != null) {
                str2 = requestId;
            }
            int curIndex = this.LIZ.getCurIndex() + 1;
            FW5.LJIIJJI(0, str2, C47261Igj.LJJIJIL(aweme3));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("curIndex: ");
            LIZ2.append(this.LIZ.getCurIndex());
            LIZ2.append(", insert aweme(");
            LIZ2.append(aweme3.getAid());
            LIZ2.append(") to ");
            LIZ2.append(curIndex);
            C221018lt.LJFF("@LinkRelation_Video", X1D.LIZIZ(LIZ2));
            try {
                this.LIZ.insertItemList(new C2KB<>(curIndex, "shared_video_v2", Collections.singletonList(aweme3)));
                Iterator<Aweme> it = this.LIZ.getAdapter().Q8().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!o.LJ(it.next().getAid(), aweme3.getAid())) {
                        i++;
                    } else if (i != -1) {
                        this.LIZ.setCurrentItem(i, true);
                        return;
                    }
                }
                C221018lt.LIZIZ("@LinkRelation_Video", "Error case found that no desired aweme found in panel.");
                return;
            } catch (Exception e) {
                C221018lt.LIZJ("@LinkRelation_Video", "insert aweme error", e);
                return;
            }
        }
        LIZJ = this;
        C221018lt.LJFF("@LinkRelation_Video", "first frame not ready, cache aweme!");
    }

    public C55751LuN(Aweme aweme, BaseListFragmentPanel panel) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = panel;
        this.LIZIZ = aweme;
    }
}
