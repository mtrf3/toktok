package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195377ld extends AbstractC65781Prl implements InterfaceC88471Ynr<NowOtherCollectionListAssem, Boolean, C76800UCe> {
    public static final C195377ld LJLIL = new C195377ld();

    public C195377ld() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowOtherCollectionListAssem nowOtherCollectionListAssem, Boolean bool) {
        int LJJIIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        float LJIIZILJ;
        NowOtherCollectionListAssem selectSubscribe = nowOtherCollectionListAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue && !((C195627m2) C51029K0z.LJIILLIIL(selectSubscribe)).LJLJLJ) {
            LJJIIZ = C7MY.LIZIZ(25);
        } else if (!((C195627m2) C51029K0z.LJIILLIIL(selectSubscribe)).LJLJLJ) {
            LJJIIZ = C7MY.LIZIZ(9);
        } else {
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
        }
        SYL syl = selectSubscribe.LJZL;
        if (syl != null) {
            ViewGroup.LayoutParams layoutParams = syl.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (booleanValue) {
                    LJIIZILJ = C32151Nz.LJIIZILJ(-8);
                } else {
                    LJIIZILJ = C32151Nz.LJIIZILJ(0);
                }
                marginLayoutParams2.topMargin = O6R.LJJIIZ(LJIIZILJ);
                SYL syl2 = selectSubscribe.LJZL;
                if (syl2 != null) {
                    syl2.setLayoutParams(marginLayoutParams2);
                } else {
                    o.LJIJI("list");
                    throw null;
                }
            }
            C195807mK c195807mK = selectSubscribe.LL;
            if (c195807mK != null) {
                ViewGroup.LayoutParams layoutParams2 = c195807mK.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.bottomMargin = LJJIIZ;
                    C195807mK c195807mK2 = selectSubscribe.LL;
                    if (c195807mK2 != null) {
                        c195807mK2.setLayoutParams(marginLayoutParams);
                    } else {
                        o.LJIJI("dotIndicator");
                        throw null;
                    }
                }
                return C76800UCe.LIZ;
            }
            o.LJIJI("dotIndicator");
            throw null;
        }
        o.LJIJI("list");
        throw null;
    }
}
