package X;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195397lf extends AbstractC65781Prl implements InterfaceC88473Ynt<NowOtherCollectionListAssem, Integer, Integer, C76800UCe> {
    public static final C195397lf LJLIL = new C195397lf();

    public C195397lf() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(NowOtherCollectionListAssem nowOtherCollectionListAssem, Integer num, Integer num2) {
        int i;
        NowOtherCollectionListAssem selectSubscribe = nowOtherCollectionListAssem;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue > 1) {
            C195807mK c195807mK = selectSubscribe.LL;
            if (c195807mK != null) {
                C17N.LJJLIIIJJI(c195807mK);
                C195807mK c195807mK2 = selectSubscribe.LL;
                if (c195807mK2 != null) {
                    if (intValue != c195807mK2.LJLJJL) {
                        c195807mK2.LJ();
                        c195807mK2.LJLJJL = intValue;
                        int i2 = c195807mK2.LJLJLJ;
                        if (intValue >= i2) {
                            i = ((i2 - 1) * c195807mK2.LJLJI) + (c195807mK2.LJLILLLLZI * i2);
                        } else {
                            i = (c195807mK2.LJLILLLLZI * intValue) + ((intValue - 1) * c195807mK2.LJLJI);
                        }
                        c195807mK2.getLayoutParams().width = c195807mK2.getPaddingEnd() + c195807mK2.getPaddingStart() + i;
                        c195807mK2.getLayoutParams().height = c195807mK2.getPaddingBottom() + c195807mK2.getPaddingTop() + c195807mK2.LJLILLLLZI;
                        int i3 = 0;
                        do {
                            int i4 = c195807mK2.LJLILLLLZI;
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
                            if (i3 > 0) {
                                if (C90193gN.LIZIZ(c195807mK2.getContext())) {
                                    layoutParams.setMargins(0, 0, c195807mK2.LJLJI, 0);
                                } else {
                                    layoutParams.setMargins(c195807mK2.LJLJI, 0, 0, 0);
                                }
                            }
                            ImageView imageView = new ImageView(c195807mK2.getContext());
                            imageView.setImageResource(R.drawable.bu4);
                            imageView.setLayoutParams(layoutParams);
                            c195807mK2.addView(imageView);
                            c195807mK2.LJLJJLL.add(imageView);
                            i3++;
                        } while (i3 < intValue);
                        if (c195807mK2.LJLIL) {
                            intValue2 = (c195807mK2.LJLJJL - intValue2) - 1;
                        }
                        c195807mK2.LIZLLL(intValue2);
                    }
                } else {
                    o.LJIJI("dotIndicator");
                    throw null;
                }
            } else {
                o.LJIJI("dotIndicator");
                throw null;
            }
        } else {
            C195807mK c195807mK3 = selectSubscribe.LL;
            if (c195807mK3 != null) {
                c195807mK3.LJ();
                C195807mK c195807mK4 = selectSubscribe.LL;
                if (c195807mK4 != null) {
                    C17N.LJJIIJZLJL(c195807mK4);
                } else {
                    o.LJIJI("dotIndicator");
                    throw null;
                }
            } else {
                o.LJIJI("dotIndicator");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
