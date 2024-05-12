package Y;

import X.C2YT;
import X.C56473MEj;
import X.C57404Mfw;
import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.story.model.StoryArchDetail;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import java.util.List;

/* loaded from: classes10.dex */
public class AfS27S0110000_9 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS27S0110000_9 afS27S0110000_9, Object obj) {
        int i = C57404Mfw.LIZIZ;
        if (i > 0 && afS27S0110000_9.z1) {
            C57404Mfw.LIZIZ = i - 1;
            C57404Mfw.LIZ((UserNightScreenTimeSettings) afS27S0110000_9.l0, true);
        }
    }

    public static final void accept$1(AfS27S0110000_9 afS27S0110000_9, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS27S0110000_9.l0;
        boolean z = afS27S0110000_9.z1;
        boolean z2 = false;
        awemeListFragmentImpl.LLIIIILZ = false;
        List<Aweme> list = ((NowArchiveResponse) obj).data;
        boolean LLFII = awemeListFragmentImpl.LJZ.LLFII();
        awemeListFragmentImpl.LJZ.LLFZ();
        C56473MEj c56473MEj = awemeListFragmentImpl.LJZ;
        c56473MEj.LLFF = list;
        if (list != null && list.size() > 0 && c56473MEj.LL()) {
            z2 = true;
        }
        c56473MEj.LLFZ = z2;
        if (awemeListFragmentImpl.LJZ.LL()) {
            if (z) {
                int i = awemeListFragmentImpl.LLILLIZIL;
                if (i != 1 && i != 3) {
                    boolean LLFII2 = awemeListFragmentImpl.LJZ.LLFII();
                    int basicItemCount = awemeListFragmentImpl.LJZ.getBasicItemCount();
                    if (LLFII) {
                        if (LLFII2) {
                            awemeListFragmentImpl.LJZ.notifyItemChanged(basicItemCount);
                            return;
                        } else {
                            awemeListFragmentImpl.LJZ.notifyItemRemoved(basicItemCount);
                            return;
                        }
                    }
                    if (!LLFII2) {
                        return;
                    }
                    awemeListFragmentImpl.LJZ.notifyItemInserted(basicItemCount);
                    return;
                }
                return;
            }
            C2YT c2yt = awemeListFragmentImpl.LLIIIJ;
            if (c2yt == null) {
                return;
            }
            awemeListFragmentImpl.J5(c2yt.LIZ, c2yt.LIZIZ);
            awemeListFragmentImpl.LLIIIJ = null;
        }
    }

    public static final void accept$2(AfS27S0110000_9 afS27S0110000_9, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS27S0110000_9.l0;
        boolean z = afS27S0110000_9.z1;
        awemeListFragmentImpl.LLIIII = false;
        StoryArchDetail detail = ((StoryArchDetailResponse) obj).getDetail();
        boolean LLFZ = awemeListFragmentImpl.LJZ.LLFZ();
        awemeListFragmentImpl.LJZ.LLIFFJFJJ(detail);
        if (awemeListFragmentImpl.LJZ.LLD()) {
            if (z) {
                int i = awemeListFragmentImpl.LLILLIZIL;
                if (i != 1 && i != 3) {
                    boolean LLFZ2 = awemeListFragmentImpl.LJZ.LLFZ();
                    if (LLFZ) {
                        if (LLFZ2) {
                            awemeListFragmentImpl.LJZ.notifyItemChanged(0);
                            return;
                        } else {
                            awemeListFragmentImpl.LJZ.notifyItemRemoved(0);
                            return;
                        }
                    }
                    if (!LLFZ2) {
                        return;
                    }
                    awemeListFragmentImpl.LJZ.notifyItemInserted(0);
                    return;
                }
                return;
            }
            C2YT c2yt = awemeListFragmentImpl.LLIIIJ;
            if (c2yt == null) {
                return;
            }
            awemeListFragmentImpl.J5(c2yt.LIZ, c2yt.LIZIZ);
            awemeListFragmentImpl.LLIIIJ = null;
        }
    }

    public AfS27S0110000_9(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
