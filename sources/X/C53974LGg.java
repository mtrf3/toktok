package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LGg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53974LGg extends AbstractC51547KKx {
    public final Context LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<SocialTopTabNode> p5;
        ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(this.LJLJJLL);
        if (LIZLLL != null && (p5 = LIZLLL.p5()) != null) {
            return p5.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        List<SocialTopTabNode> p5;
        SocialTopTabNode socialTopTabNode;
        String LIZ;
        ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(this.LJLJJLL);
        if (LIZLLL != null && (p5 = LIZLLL.p5()) != null && (socialTopTabNode = (SocialTopTabNode) ORZ.LJLLLLLL(i, p5)) != null && (LIZ = socialTopTabNode.LIZ()) != null) {
            return LIZ;
        }
        return "";
    }

    @Override // X.AbstractC51547KKx
    public final Fragment LJJIII(int i) {
        List<ISocialTabProtocol> L2;
        ISocialTabProtocol iSocialTabProtocol;
        ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(this.LJLJJLL);
        if (LIZLLL != null && (L2 = LIZLLL.L2()) != null && (iSocialTabProtocol = (ISocialTabProtocol) ORZ.LJLLLLLL(i, L2)) != null) {
            return Fragment.instantiate(this.LJLJJLL, iSocialTabProtocol.LJJJJZI().getName(), iSocialTabProtocol.d(this.LJLJJLL));
        }
        return null;
    }

    @Override // X.AbstractC51547KKx
    public final long LJJIIJ(int i) {
        List<SocialTopTabNode> p5;
        AbstractC53895LDf abstractC53895LDf;
        String tag;
        ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(this.LJLJJLL);
        if (LIZLLL != null && (p5 = LIZLLL.p5()) != null && (abstractC53895LDf = (AbstractC53895LDf) ORZ.LJLLLLLL(i, p5)) != null && (tag = abstractC53895LDf.tag()) != null) {
            return tag.hashCode();
        }
        return 0L;
    }

    public C53974LGg(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.LJLJJLL = context;
    }

    @Override // X.AbstractC51547KKx, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object item) {
        Object LIZ;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(item, "item");
        super.LJIIIZ(i, container, item);
        if (item instanceof Fragment) {
            try {
                C1B3 c1b3 = this.LJLJI;
                if (c1b3 != null) {
                    c1b3.LJJI((Fragment) item);
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("destroyItem remove fragment exception: ");
                LIZ2.append(m10exceptionOrNullimpl);
                C36922EeM.LIZLLL(2, "FriendsTabAdapter", X1D.LIZIZ(LIZ2));
            }
        }
    }
}
