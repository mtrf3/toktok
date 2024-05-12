package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.view.editor.ProfileNaviEditorCategoryFragment;
import com.ss.android.ugc.aweme.view.editor.ProfileNaviEditorTemplateFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Seb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72609Seb extends C1BD {
    public final Context LJLJLJ;
    public final boolean LJLJLLL;
    public final List<? extends InterfaceC72603SeV> LJLL;
    public final int LJLLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLL.size() + this.LJLLI;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (i == 0 && this.LJLLI == 1) {
            String string = this.LJLJLJ.getString(R.string.c03);
            o.LJIIIIZZ(string, "{\n            context.ge…e_error_label2)\n        }");
            return string;
        }
        return ((InterfaceC72603SeV) ListProtector.get(this.LJLL, i - this.LJLLI)).getName();
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        if (i == 0 && this.LJLLI == 1) {
            return new ProfileNaviEditorTemplateFragment(this.LJLJLLL);
        }
        InterfaceC72603SeV tab = (InterfaceC72603SeV) ListProtector.get(this.LJLL, i - this.LJLLI);
        o.LJIIIZ(tab, "tab");
        ProfileNaviEditorCategoryFragment profileNaviEditorCategoryFragment = new ProfileNaviEditorCategoryFragment();
        profileNaviEditorCategoryFragment.LJLJJI = tab;
        return profileNaviEditorCategoryFragment;
    }

    @Override // X.C1BD, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        super.LJIIIZ(i, container, object);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72609Seb(Context context, boolean z, FragmentManager fragmentManager, List<? extends InterfaceC72603SeV> data) {
        super(fragmentManager, 0);
        o.LJIIIZ(data, "data");
        this.LJLJLJ = context;
        this.LJLJLLL = z;
        this.LJLL = data;
        this.LJLLI = (C53202KuM.LIZ() || z) ? 1 : 0;
    }
}
