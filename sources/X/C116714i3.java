package X;

import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116714i3 extends SpannableStringBuilder {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final List<Integer> LJLIL = new ArrayList();

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ int length() {
        return super.length();
    }

    public final void LIZ(int i) {
        ((ArrayList) this.LJLIL).add(Integer.valueOf(i));
    }

    public final int LIZIZ(int i) {
        int size = ((ArrayList) this.LJLIL).size();
        for (int i2 = 0; i2 < size && ((Number) ListProtector.get(this.LJLIL, i2)).intValue() <= i; i2++) {
            i++;
        }
        return i;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return super.charAt(i);
    }
}
