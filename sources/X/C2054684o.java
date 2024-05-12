package X;

import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.84o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054684o {
    public List<AnonymousClass850> LIZ;
    public InterfaceC88472Yns<Object, C76800UCe> LIZIZ;

    public final CharSequence LIZIZ() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (AnonymousClass850 anonymousClass850 : this.LIZ) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) anonymousClass850.LIZ);
            int length2 = spannableStringBuilder.length();
            for (Object obj : anonymousClass850.LIZIZ) {
                if (obj instanceof C2055484w) {
                    ((C2055484w) obj).LJLJJI = this.LIZIZ;
                }
                spannableStringBuilder.setSpan(obj, length, length2, 17);
            }
        }
        return spannableStringBuilder;
    }

    public final CharSequence LIZJ() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (AnonymousClass850 anonymousClass850 : this.LIZ) {
            int length = spannableStringBuilder.length();
            if (anonymousClass850.LIZJ != AnonymousClass853.WRAP) {
                spannableStringBuilder.append((CharSequence) anonymousClass850.LIZ);
                int length2 = spannableStringBuilder.length();
                for (Object obj : anonymousClass850.LIZIZ) {
                    if (obj instanceof C2055484w) {
                        ((C2055484w) obj).LJLJJI = this.LIZIZ;
                    }
                    spannableStringBuilder.setSpan(obj, length, length2, 17);
                }
            } else {
                spannableStringBuilder.append((CharSequence) " ");
            }
        }
        return spannableStringBuilder;
    }

    public final String LIZLLL() {
        StringBuilder sb = new StringBuilder();
        Iterator<AnonymousClass850> it = this.LIZ.iterator();
        while (it.hasNext()) {
            sb.append(it.next().LIZ);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public C2054684o(List<AnonymousClass850> blocks) {
        o.LJIIIZ(blocks, "blocks");
        this.LIZ = blocks;
    }

    public final void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        List<AnonymousClass850> LLJILJILJ = ORZ.LLJILJILJ(this.LIZ);
        ListProtector.add(LLJILJILJ, 0, interfaceC65784Pro.invoke());
        this.LIZ = LLJILJILJ;
    }

    public final void LJ(InterfaceC88472Yns transform) {
        o.LJIIIZ(transform, "transform");
        List<AnonymousClass850> list = this.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<AnonymousClass850> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        this.LIZ = arrayList;
    }
}
