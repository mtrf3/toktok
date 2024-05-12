package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C61995OUt;
import X.C76800UCe;
import X.InterfaceC88473Ynt;
import X.QXX;
import android.os.Build;
import com.ss.android.ugc.aweme.detail.ui.story.StoryDetailPageFragment;

/* loaded from: classes10.dex */
public class IDqS434S0100000_9 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS434S0100000_9(QXX qxx, int i) {
        super(3);
        this.$t = i;
        this.l0 = qxx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS434S0100000_9(StoryDetailPageFragment storyDetailPageFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = storyDetailPageFragment;
    }

    public static final Object invoke$0(IDqS434S0100000_9 iDqS434S0100000_9, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ((StoryDetailPageFragment) iDqS434S0100000_9.l0).LJLL = intValue;
        int min = Math.min(Math.abs(intValue), Math.abs(((StoryDetailPageFragment) iDqS434S0100000_9.l0).LJLLI));
        int max = Math.max(Math.abs(((StoryDetailPageFragment) iDqS434S0100000_9.l0).LJLL), Math.abs(((StoryDetailPageFragment) iDqS434S0100000_9.l0).LJLLI));
        StoryDetailPageFragment storyDetailPageFragment = (StoryDetailPageFragment) iDqS434S0100000_9.l0;
        int i = storyDetailPageFragment.LJLJLLL;
        if (min <= i && i <= max && !booleanValue) {
            if (Build.VERSION.SDK_INT >= 29) {
                C61995OUt c61995OUt = (C61995OUt) storyDetailPageFragment.LJLLILLLL.getValue();
                if (c61995OUt != null) {
                    c61995OUt.LIZ();
                }
            } else {
                C61995OUt c61995OUt2 = (C61995OUt) storyDetailPageFragment.LJLLILLLL.getValue();
                if (c61995OUt2 != null) {
                    c61995OUt2.LIZIZ(85, 61);
                }
            }
        }
        ((StoryDetailPageFragment) iDqS434S0100000_9.l0).LJLLI = intValue;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS434S0100000_9 iDqS434S0100000_9, Object obj, Object obj2, Object obj3) {
        String str = (String) obj3;
        QXX qxx = (QXX) iDqS434S0100000_9.l0;
        if (qxx != null) {
            qxx.LLLLIIIILLL(str);
        }
        return C76800UCe.LIZ;
    }
}
