package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.T6s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74110T6s extends C1BD {
    public final Context LJLJLJ;
    public final List<BaseQnaTabFragment> LJLJLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJLLL).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        String string = this.LJLJLJ.getString(LJJIIJ(i).xl(), CardStruct.IStatusCode.DEFAULT);
        o.LJIIIIZZ(string, "context.getString(getFra…sition).tabTitleRes, \"0\")");
        return string;
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        return LJJIIJ(i);
    }

    public final BaseQnaTabFragment LJJIIJ(int i) {
        return (BaseQnaTabFragment) ListProtector.get(this.LJLJLLL, i);
    }

    public C74110T6s(Context context, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJLJ = context;
        this.LJLJLLL = new ArrayList();
    }

    @Override // X.C1BD, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        super.LJIIIZ(i, container, object);
        ListProtector.remove(this.LJLJLLL, i);
        notifyDataSetChanged();
    }
}
