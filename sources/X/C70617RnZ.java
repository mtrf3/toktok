package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RnZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70617RnZ extends ConstraintLayout {
    public PdpViewModel LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public C70756Rpo LJLJJI;
    public final java.util.Set<String> LJLJJL;
    public InterfaceC71003Rtn LJLJJLL;
    public C70625Rnh LJLJL;
    public InterfaceC70636Rns LJLJLJ;
    public IQ9 LJLJLLL;
    public final java.util.Map<Integer, View> LJLL;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getNumVideos() {
        C70625Rnh c70625Rnh = this.LJLJL;
        if (c70625Rnh != null) {
            List<MediaItem> list = c70625Rnh.LIZJ;
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<MediaItem> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (it.next().type == 2 && (i = i + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            return i;
        }
        o.LJIJI("item");
        throw null;
    }

    public final int getVideoIndex() {
        C70625Rnh c70625Rnh = this.LJLJL;
        if (c70625Rnh != null) {
            Iterator<MediaItem> it = c70625Rnh.LIZJ.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().type == 2) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        o.LJIJI("item");
        throw null;
    }

    public final C70756Rpo getHeaderPagerAdapter() {
        return this.LJLJJI;
    }

    public final void LJJLJLI(Image image) {
        String uri = image.getUri();
        if (uri != null && !ujb.o.LJJJJJL(uri) && !this.LJLJJL.contains(uri)) {
            this.LJLJJL.add(uri);
            InterfaceC71003Rtn interfaceC71003Rtn = this.LJLJJLL;
            if (interfaceC71003Rtn != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70877Rrl(), new AqS35S1000000_12(uri, 11));
            }
        }
    }

    public final void setHeaderPagerAdapter(C70756Rpo c70756Rpo) {
        this.LJLJJI = c70756Rpo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C70617RnZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70617RnZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLL = C62850Ola.LJFF(context, "context");
        this.LJLJI = true;
        this.LJLJJL = new LinkedHashSet();
        View.inflate(context, R.layout.a34, this);
    }
}
