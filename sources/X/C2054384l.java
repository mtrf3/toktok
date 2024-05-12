package X;

import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.84l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054384l {
    public final Iterable<AnonymousClass852<C85M>> LIZ;
    public Iterable<? extends AnonymousClass852<C85M>> LIZIZ;

    public final CharSequence LIZIZ() {
        List<AnonymousClass852> list;
        List<AnonymousClass852<C85M>> LJJIJ;
        Iterable<? extends AnonymousClass852<C85M>> iterable = this.LIZIZ;
        if (C65777Prh.LJI(iterable) && (list = (List) iterable) != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass852 anonymousClass852 : list) {
                if (anonymousClass852 instanceof C85E) {
                    LJJIJ = ((C85E) anonymousClass852).LIZLLL();
                } else {
                    LJJIJ = C47261Igj.LJJIJ(anonymousClass852);
                }
                ORS.LJJLIIIJILLIZJL(LJJIJ, arrayList);
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass852 anonymousClass8522 = (AnonymousClass852) it.next();
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) anonymousClass8522.LIZ());
                int length2 = spannableStringBuilder.length();
                anonymousClass8522.LIZJ = length;
                anonymousClass8522.LIZLLL = length2;
                Iterator<Object> it2 = anonymousClass8522.LJII.iterator();
                while (it2.hasNext()) {
                    spannableStringBuilder.setSpan(it2.next(), length, length2, 17);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(anonymousClass8522.LIZ);
                LIZ.append(" ~ ");
                C15890jp.LIZIZ(LIZ, anonymousClass8522.LIZIZ, ", startIndex: ", length, ", endIndex: ");
                LIZ.append(length2);
                LIZ.append(", ");
                LIZ.append(anonymousClass8522.LIZJ());
                sb.append(X1D.LIZIZ(LIZ));
                sb.append('\n');
            }
            C85R.LIZJ("TextComponentExt parseWithSpans: \n" + ((Object) sb));
            C85R.LIZJ("TextComponentExt parseWithSpans result -> \n" + ((Object) spannableStringBuilder));
            return spannableStringBuilder;
        }
        return "";
    }

    public final List<TextExtraStruct> LIZLLL() {
        int i;
        TextExtraStruct textExtraStruct;
        TextExtraStruct textExtraStruct2;
        TextExtraStruct textExtraStruct3;
        Iterable<? extends AnonymousClass852<C85M>> iterable = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LongTextComponentsBuilder getValidMetadata count: ");
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            Iterator<? extends AnonymousClass852<C85M>> it = iterable.iterator();
            i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
                if (i < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        LIZ.append(i);
        C85R.LIZ(X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass852<C85M> anonymousClass852 : iterable) {
            if (!anonymousClass852.LJ) {
                arrayList.add(anonymousClass852);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AnonymousClass852 anonymousClass8522 = (AnonymousClass852) it2.next();
            C85M c85m = anonymousClass8522.LJI;
            if (c85m != null && (textExtraStruct3 = c85m.LIZ) != null) {
                textExtraStruct3.setStart(anonymousClass8522.LIZJ);
            }
            C85M c85m2 = anonymousClass8522.LJI;
            if (c85m2 != null && (textExtraStruct2 = c85m2.LIZ) != null) {
                textExtraStruct2.setEnd(anonymousClass8522.LIZLLL);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("realStart:");
            LIZ2.append(anonymousClass8522.LIZJ);
            LIZ2.append('~');
            LIZ2.append(anonymousClass8522.LIZLLL);
            LIZ2.append(", ");
            LIZ2.append(anonymousClass8522.LJ);
            LIZ2.append(", ");
            LIZ2.append(C16880lQ.LJLLJ(anonymousClass8522.getClass()));
            LIZ2.append(", ");
            LIZ2.append(C75792yF.LIZJ(anonymousClass8522.LJI));
            C85R.LIZ(X1D.LIZIZ(LIZ2));
            C85M c85m3 = anonymousClass8522.LJI;
            if (c85m3 != null && (textExtraStruct = c85m3.LIZ) != null) {
                arrayList2.add(textExtraStruct);
            }
        }
        return ORZ.LLJI(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2054384l(Iterable<? extends AnonymousClass852<C85M>> iterable) {
        this.LIZ = iterable;
        this.LIZIZ = iterable;
    }

    public final void LIZ(C2056385f c2056385f) {
        List LLJILJIL = ORZ.LLJILJIL(this.LIZIZ);
        ListProtector.add(LLJILJIL, 0, c2056385f);
        this.LIZIZ = LLJILJIL;
    }

    public final void LIZJ(InterfaceC88472Yns transform) {
        o.LJIIIZ(transform, "transform");
        Iterable<? extends AnonymousClass852<C85M>> iterable = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends AnonymousClass852<C85M>> it = iterable.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL((Iterable) transform.invoke(it.next()), arrayList);
        }
        this.LIZIZ = arrayList;
    }

    public final void LJ(InterfaceC88472Yns interfaceC88472Yns) {
        Iterable<? extends AnonymousClass852<C85M>> iterable = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(iterable, 10));
        Iterator<? extends AnonymousClass852<C85M>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC88472Yns.invoke(it.next()));
        }
        this.LIZIZ = arrayList;
    }
}
