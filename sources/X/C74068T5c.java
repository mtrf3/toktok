package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import com.ss.android.ugc.aweme.model.library.LibraryDetailParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.T5c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74068T5c extends FrameLayout {
    public final T5J LJLIL;
    public LibraryMaterialInfo LJLILLLLZI;
    public C72427Sbf LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;

    public final int getLayoutResId() {
        return R.layout.cqy;
    }

    public final int getAvatarContainerHeight() {
        C72427Sbf c72427Sbf = this.LJLJI;
        if (c72427Sbf != null) {
            return c72427Sbf.getHeight();
        }
        o.LJIJI("mImage");
        throw null;
    }

    public final LibraryDetailParam getDetailParam() {
        T5J t5j = this.LJLIL;
        if (t5j != null) {
            return t5j.LJFF;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74068T5c(ActivityC45651qj activityC45651qj, T5J t5j) {
        super(activityC45651qj, null);
        new LinkedHashMap();
        this.LJLIL = t5j;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(activityC45651qj), getLayoutResId(), this, true);
        View findViewById = findViewById(R.id.fqj);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.library_material_image)");
        this.LJLJI = (C72427Sbf) findViewById;
        View findViewById2 = findViewById(R.id.fqk);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.library_material_name)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.fql);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.library_material_source)");
        this.LJLJJL = (TuxTextView) findViewById3;
        View findViewById4 = findViewById(R.id.fqi);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.library_material_count)");
        this.LJLJJLL = (TuxTextView) findViewById4;
    }
}
