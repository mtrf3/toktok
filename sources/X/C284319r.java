package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.19r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C284319r implements AnonymousClass050 {
    public final ClipboardManager LIZ;

    @Override // X.AnonymousClass050
    public final C08440Uu getText() {
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        boolean z;
        boolean z2;
        ClipboardManager clipboardManager = this.LIZ;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101803, "android/content/ClipboardManager", "getPrimaryClip", clipboardManager, new Object[0], "android.content.ClipData", new C65300Pk0(false, "()Landroid/content/ClipData;", "-1239525889562034942"));
        if (LIZJ.LIZ) {
            primaryClip = (ClipData) LIZJ.LIZIZ;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) {
            return null;
        }
        if (!(text instanceof Spanned)) {
            return new C08440Uu(text.toString(), null, 6);
        }
        Spanned spanned = (Spanned) text;
        Annotation[] annotations = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        o.LJIIIIZZ(annotations, "annotations");
        int length = annotations.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                Annotation annotation = annotations[i];
                if (o.LJ(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    o.LJIIIIZZ(value, "span.value");
                    C24740y6 c24740y6 = new C24740y6(value);
                    C016204o c016204o = new C016204o();
                    while (true) {
                        int i2 = 1;
                        if (((Parcel) c24740y6.LIZ).dataAvail() <= 1) {
                            break;
                        }
                        byte readByte = ((Parcel) c24740y6.LIZ).readByte();
                        if (readByte == 1) {
                            if (c24740y6.LIZIZ() < 8) {
                                break;
                            }
                            c016204o.LIZ = ((Parcel) c24740y6.LIZ).readLong();
                        } else if (readByte == 2) {
                            if (c24740y6.LIZIZ() < 5) {
                                break;
                            }
                            c016204o.LIZIZ = c24740y6.LIZLLL();
                        } else if (readByte == 3) {
                            if (c24740y6.LIZIZ() < 4) {
                                break;
                            }
                            c016204o.LIZJ = new C13640gC(((Parcel) c24740y6.LIZ).readInt());
                        } else if (readByte == 4) {
                            if (c24740y6.LIZIZ() < 1) {
                                break;
                            }
                            byte readByte2 = ((Parcel) c24740y6.LIZ).readByte();
                            if (readByte2 == 0 || readByte2 != 1) {
                                i2 = 0;
                            }
                            c016204o.LIZLLL = new C13570g5(i2);
                        } else if (readByte == 5) {
                            if (c24740y6.LIZIZ() < 1) {
                                break;
                            }
                            byte readByte3 = ((Parcel) c24740y6.LIZ).readByte();
                            if (readByte3 != 0) {
                                if (readByte3 != 1) {
                                    if (readByte3 == 3) {
                                        i2 = 3;
                                    } else if (readByte3 == 2) {
                                        i2 = 2;
                                    }
                                }
                                c016204o.LJ = new C13590g7(i2);
                            }
                            i2 = 0;
                            c016204o.LJ = new C13590g7(i2);
                        } else if (readByte == 6) {
                            c016204o.LJI = ((Parcel) c24740y6.LIZ).readString();
                        } else if (readByte == 7) {
                            if (c24740y6.LIZIZ() < 5) {
                                break;
                            }
                            c016204o.LJII = c24740y6.LIZLLL();
                        } else if (readByte == 8) {
                            if (c24740y6.LIZIZ() < 4) {
                                break;
                            }
                            c016204o.LJIIIIZZ = new C21870tT(c24740y6.LIZJ());
                        } else if (readByte == 9) {
                            if (c24740y6.LIZIZ() < 8) {
                                break;
                            }
                            c016204o.LJIIIZ = new C22140tu(c24740y6.LIZJ(), c24740y6.LIZJ());
                        } else if (readByte == 10) {
                            if (c24740y6.LIZIZ() < 8) {
                                break;
                            }
                            c016204o.LJIIJJI = ((Parcel) c24740y6.LIZ).readLong();
                        } else if (readByte == 11) {
                            if (c24740y6.LIZIZ() < 4) {
                                break;
                            }
                            int readInt = ((Parcel) c24740y6.LIZ).readInt();
                            C22080to c22080to = C22080to.LIZLLL;
                            if ((readInt & 2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C22080to c22080to2 = C22080to.LIZJ;
                            if ((readInt & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z) {
                                if (z2) {
                                    List decorations = C47261Igj.LJJIJIIJI(c22080to, c22080to2);
                                    o.LJIIIZ(decorations, "decorations");
                                    Integer num = 0;
                                    int size = decorations.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        num = Integer.valueOf(((C22080to) ListProtector.get(decorations, i3)).LIZ | num.intValue());
                                    }
                                    c22080to = new C22080to(num.intValue());
                                }
                            } else if (z2) {
                                c22080to = c22080to2;
                            } else {
                                c22080to = C22080to.LIZIZ;
                            }
                            c016204o.LJIIL = c22080to;
                        } else if (readByte == 12) {
                            if (c24740y6.LIZIZ() < 20) {
                                break;
                            }
                            c016204o.LJIILIIL = new C11770dB(((Parcel) c24740y6.LIZ).readLong(), C78923UyF.LIZ(c24740y6.LIZJ(), c24740y6.LIZJ()), c24740y6.LIZJ());
                        } else {
                            continue;
                        }
                    }
                    arrayList.add(new C08410Ur(spanStart, spanEnd, new C0VD(c016204o.LIZ, c016204o.LIZIZ, c016204o.LIZJ, c016204o.LIZLLL, c016204o.LJ, c016204o.LJFF, c016204o.LJI, c016204o.LJII, c016204o.LJIIIIZZ, c016204o.LJIIIZ, c016204o.LJIIJ, c016204o.LJIIJJI, c016204o.LJIIL, c016204o.LJIILIIL)));
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new C08440Uu(text.toString(), arrayList, 4);
    }

    public C284319r(Context context) {
        Object LLILL = C16880lQ.LLILL(context, "clipboard");
        o.LJII(LLILL, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.LIZ = (ClipboardManager) LLILL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0167, code lost:
    
        if (r14 == 3) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.05O] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    @Override // X.AnonymousClass050
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C08440Uu r20) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284319r.LIZ(X.0Uu):void");
    }
}
