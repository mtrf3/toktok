package X;

import android.R;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;

/* loaded from: classes15.dex */
public final class VZN implements LHW {
    public final /* synthetic */ BaseLynxViewPager LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA c78856UxA) {
    }

    public VZN(BaseLynxViewPager baseLynxViewPager) {
        this.LJLIL = baseLynxViewPager;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
        View view;
        TextView textView;
        if (c78856UxA != null && (view = c78856UxA.LJFF) != null && (textView = (TextView) view.findViewById(R.id.text1)) != null) {
            this.LJLIL.LJIL().setUnSelectedTextStyle(textView);
        }
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA c78856UxA) {
        View view;
        TextView textView;
        int i;
        String str;
        C78856UxA tabAt;
        if (c78856UxA != null && (view = c78856UxA.LJFF) != null && (textView = (TextView) view.findViewById(R.id.text1)) != null) {
            this.LJLIL.LJIL().setSelectedTextStyle(textView);
            BaseLynxViewPager baseLynxViewPager = this.LJLIL;
            if (baseLynxViewPager.LJLIL) {
                String charSequence = textView.getText().toString();
                BaseLynxViewPager baseLynxViewPager2 = this.LJLIL;
                C80261Vej mTabLayout = baseLynxViewPager2.LJIL().getMTabLayout();
                baseLynxViewPager2.getClass();
                if (mTabLayout != null) {
                    int tabCount = mTabLayout.getTabCount();
                    i = 0;
                    while (i < tabCount) {
                        if (mTabLayout != null && (tabAt = mTabLayout.getTabAt(i)) != null && tabAt == c78856UxA) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = 0;
                BaseLynxViewPager baseLynxViewPager3 = this.LJLIL;
                if (baseLynxViewPager3.LJLJJL) {
                    str = "";
                } else if (baseLynxViewPager3.LJLJJI == c78856UxA) {
                    str = "click";
                } else {
                    str = "slide";
                }
                baseLynxViewPager.LJJIFFI(i, charSequence, str);
                this.LJLIL.LJLJJL = false;
            }
        }
        this.LJLIL.LJLJJI = null;
    }
}
