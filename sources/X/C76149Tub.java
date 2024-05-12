package X;

import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* renamed from: X.Tub, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76149Tub extends F9E {
    public final long LJLIL;
    public final String LJLILLLLZI;
    public final SpannableStringBuilder LJLJI;
    public int LJLJJI = 0;
    public int LJLJJL = 0;
    public final long LJLJJLL;
    public final long LJLJL;
    public final List<ImageModel> LJLJLJ;
    public final long LJLJLLL;
    public final boolean LJLL;
    public final long LJLLI;
    public final List<ImageModel> LJLLILLLL;
    public final long LJLLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL), Long.valueOf(this.LJLJL), this.LJLJLJ, Long.valueOf(this.LJLJLLL), Boolean.valueOf(this.LJLL), Long.valueOf(this.LJLLI), this.LJLLILLLL, Long.valueOf(this.LJLLJ)};
    }

    public C76149Tub(long j, String str, SpannableStringBuilder spannableStringBuilder, long j2, long j3, List list, long j4, boolean z, long j5, List list2, long j6) {
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = spannableStringBuilder;
        this.LJLJJLL = j2;
        this.LJLJL = j3;
        this.LJLJLJ = list;
        this.LJLJLLL = j4;
        this.LJLL = z;
        this.LJLLI = j5;
        this.LJLLILLLL = list2;
        this.LJLLJ = j6;
    }
}
