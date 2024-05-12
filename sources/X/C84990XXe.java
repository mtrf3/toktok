package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.XXe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84990XXe extends AbstractC51501KJd {
    public final ArrayList<MusicClassDetailFragment> LJLJJLL;
    public final ArrayList<MusicCollectionItem> LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final int LJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJL.size();
    }

    @Override // X.AbstractC51502KJe
    public final Object LJJIII(int i, ViewGroup viewGroup) {
        Object obj = ListProtector.get(this.LJLJJLL, i);
        o.LJIIIIZZ(obj, "fragmentList[position]");
        return obj;
    }

    public C84990XXe(FragmentManager fragmentManager, String str, int i, String str2) {
        super(fragmentManager);
        this.LJLJJLL = new ArrayList<>();
        this.LJLJL = new ArrayList<>();
        this.LJLJLJ = str;
        this.LJLL = i;
        this.LJLJLJ = str;
        this.LJLJLLL = str2;
    }
}
