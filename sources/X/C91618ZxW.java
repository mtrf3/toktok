package X;

import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IStatusViewAbility;
import com.ss.android.ugc.aweme.dsp.playpage.viewpager.DspViewPagerAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.ZxW, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final /* synthetic */ class C91618ZxW extends TBS implements InterfaceC65784Pro<Boolean> {
    public C91618ZxW(Object obj) {
        super(0, obj, DspViewPagerAssem.class, "isForbiddenScroll", "isForbiddenScroll()Z", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        AbstractC91394Ztu abstractC91394Ztu;
        DspViewPagerAssem dspViewPagerAssem = (DspViewPagerAssem) this.receiver;
        C91503Zvf c91503Zvf = dspViewPagerAssem.LJLILLLLZI;
        if (c91503Zvf != null) {
            PagerAdapter adapter = c91503Zvf.getAdapter();
            if ((adapter instanceof AbstractC91394Ztu) && (abstractC91394Ztu = (AbstractC91394Ztu) adapter) != null) {
                IStatusViewAbility iStatusViewAbility = (IStatusViewAbility) dspViewPagerAssem.LJLJI.getValue();
                if (abstractC91394Ztu.LJJIII().LIZ()) {
                    YBM.LIZ.getClass();
                    if (!YBM.LIZJ() && (iStatusViewAbility == null || !iStatusViewAbility.isVisible())) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        o.LJIJI("mdViewPager");
        throw null;
    }
}
