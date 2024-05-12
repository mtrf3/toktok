package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.effect.filter.LiveFilterFragment;
import com.bytedance.android.live.effect.filter.composerfilter.LiveComposerFilterFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1o0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43961o0 extends C1BD {
    public final List<String> LJLJLJ;
    public final List<String> LJLJLLL;
    public Fragment LJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJLJ).size() + 1;
    }

    public C43961o0(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (i == ((ArrayList) this.LJLJLJ).size()) {
            return C0TY.LJFF;
        }
        return (CharSequence) ListProtector.get(this.LJLJLJ, i);
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        if ((!((ArrayList) this.LJLJLJ).isEmpty()) || LiveBeautyReverseExperiment.INSTANCE.isInExperiment()) {
            if (i == ((ArrayList) this.LJLJLJ).size()) {
                if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                    return new LiveComposerFilterFragment();
                }
                return new LiveFilterFragment();
            }
            String str = (String) ListProtector.get(this.LJLJLJ, i);
            String str2 = (String) ListProtector.get(this.LJLJLLL, i);
            String SMALL_ITEM_BEAUTY_PANEL = C0TY.LIZLLL;
            o.LJIIIIZZ(SMALL_ITEM_BEAUTY_PANEL, "SMALL_ITEM_BEAUTY_PANEL");
            return C0LK.LIZ(str, str2, null, SMALL_ITEM_BEAUTY_PANEL);
        }
        String SMALL_ITEM_BEAUTY_PANEL2 = C0TY.LIZLLL;
        o.LJIIIIZZ(SMALL_ITEM_BEAUTY_PANEL2, "SMALL_ITEM_BEAUTY_PANEL");
        return C0LK.LIZ("", "", null, SMALL_ITEM_BEAUTY_PANEL2);
    }

    @Override // X.C1BD, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        Fragment fragment;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        if (!o.LJ(this.LJLL, object)) {
            if (object instanceof Fragment) {
                fragment = (Fragment) object;
            } else {
                fragment = null;
            }
            this.LJLL = fragment;
        }
        super.LJIL(i, container, object);
    }
}
