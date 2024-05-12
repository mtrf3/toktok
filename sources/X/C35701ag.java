package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35701ag extends PagerAdapter {
    public final DataChannel LJLILLLLZI;
    public final LiveSmallItemBeautyViewModel LJLJI;
    public final ComposerFilterViewModel LJLJJI;
    public final List<String> LJLJJL;
    public final List<String> LJLJJLL;
    public final HashMap<String, C37281dE> LJLJL;
    public C37281dE LJLJLJ;
    public C1VS LJLJLLL;
    public C33731Ub LJLL;
    public int LJLLI;
    public AbstractC24260xK LJLLILLLL;
    public LifecycleOwner LJLLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object item) {
        o.LJIIIZ(item, "item");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJJL).size() + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (i == ((ArrayList) this.LJLJJL).size()) {
            return C0TY.LJFF;
        }
        return (CharSequence) ListProtector.get(this.LJLJJL, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        AbstractC24260xK abstractC24260xK;
        o.LJIIIZ(container, "container");
        if ((!this.LJLJJL.isEmpty()) || LiveBeautyReverseExperiment.INSTANCE.isInExperiment()) {
            if (i == ((ArrayList) this.LJLJJL).size()) {
                if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                    AbstractC24260xK abstractC24260xK2 = this.LJLJLLL;
                    abstractC24260xK = abstractC24260xK2;
                    if (abstractC24260xK2 == null) {
                        C1VS c1vs = new C1VS(container, this.LJLILLLLZI, this.LJLJJI, this.LJLLJ);
                        this.LJLJLLL = c1vs;
                        abstractC24260xK = c1vs;
                    }
                } else {
                    AbstractC24260xK abstractC24260xK3 = this.LJLL;
                    abstractC24260xK = abstractC24260xK3;
                    if (abstractC24260xK3 == null) {
                        C33731Ub c33731Ub = new C33731Ub(container, this.LJLILLLLZI, this.LJLLJ);
                        this.LJLL = c33731Ub;
                        abstractC24260xK = c33731Ub;
                    }
                }
            } else if (this.LJLJL.containsKey(ListProtector.get(this.LJLJJL, i))) {
                AbstractC24260xK abstractC24260xK4 = this.LJLJL.get(ListProtector.get(this.LJLJJL, i));
                abstractC24260xK = abstractC24260xK4;
                if (abstractC24260xK4 == null) {
                    C37281dE c37281dE = new C37281dE(container, this.LJLILLLLZI, this.LJLJI, (String) ListProtector.get(this.LJLJJL, i));
                    this.LJLJL.put(ListProtector.get(this.LJLJJL, i), c37281dE);
                    abstractC24260xK = c37281dE;
                }
            } else {
                C37281dE c37281dE2 = new C37281dE(container, this.LJLILLLLZI, this.LJLJI, (String) ListProtector.get(this.LJLJJL, i));
                this.LJLJL.put(ListProtector.get(this.LJLJJL, i), c37281dE2);
                abstractC24260xK = c37281dE2;
            }
        } else {
            AbstractC24260xK abstractC24260xK5 = this.LJLJLJ;
            abstractC24260xK = abstractC24260xK5;
            if (abstractC24260xK5 == null) {
                C37281dE c37281dE3 = new C37281dE(container, this.LJLILLLLZI, this.LJLJI, "");
                this.LJLJLJ = c37281dE3;
                abstractC24260xK = c37281dE3;
            }
        }
        container.addView(abstractC24260xK.LIZ);
        return abstractC24260xK;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        if (object instanceof C37281dE) {
            return o.LJ(((AbstractC24260xK) object).LIZ, view);
        }
        if (object instanceof C1VS) {
            return o.LJ(((AbstractC24260xK) object).LIZ, view);
        }
        if (object instanceof C33731Ub) {
            return o.LJ(((AbstractC24260xK) object).LIZ, view);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object item) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(item, "item");
        if (item instanceof AbstractC24260xK) {
            C16880lQ.LJLLL(((AbstractC24260xK) item).LIZ, container);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        AbstractC24260xK abstractC24260xK;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        if (!o.LJ(this.LJLLILLLL, object)) {
            if (object instanceof AbstractC24260xK) {
                abstractC24260xK = (AbstractC24260xK) object;
            } else {
                abstractC24260xK = null;
            }
            this.LJLLILLLL = abstractC24260xK;
        }
    }

    public C35701ag(Context context, DataChannel dataChannel, LiveSmallItemBeautyViewModel beautyViewModel, ComposerFilterViewModel filterViewModel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(beautyViewModel, "beautyViewModel");
        o.LJIIIZ(filterViewModel, "filterViewModel");
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = beautyViewModel;
        this.LJLJJI = filterViewModel;
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new HashMap<>();
    }
}
