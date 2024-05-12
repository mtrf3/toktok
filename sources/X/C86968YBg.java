package X;

import android.icu.text.AlphabeticIndex;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.YBg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86968YBg implements InterfaceC80833Ff {
    public final AlphabeticIndex.ImmutableIndex<?> LIZ;
    public final int LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C86968YBg(List<Locale> list) {
        AlphabeticIndex maxLabelCount = new AlphabeticIndex((Locale) ListProtector.get(list, 0)).setMaxLabelCount(100);
        o.LJIIIIZZ(maxLabelCount, "AlphabeticIndex<Any?>(lo…0]).setMaxLabelCount(100)");
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            maxLabelCount.addLabels(it.next());
        }
        AlphabeticIndex.ImmutableIndex<?> buildImmutableIndex = maxLabelCount.buildImmutableIndex();
        o.LJIIIIZZ(buildImmutableIndex, "ai.buildImmutableIndex()");
        this.LIZ = buildImmutableIndex;
        this.LIZIZ = buildImmutableIndex.getBucketCount();
    }

    @Override // X.InterfaceC80833Ff
    public final String LIZ(String str) {
        boolean z;
        int i;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        do {
            if (i3 < str.length()) {
                i = LIZLLL(i3, str);
                if (i >= 10) {
                    if (i == 99) {
                        i3++;
                    }
                    sb.append(String.valueOf(i));
                    i2++;
                    i3++;
                }
            } else {
                i = 0;
            }
            sb.append(CardStruct.IStatusCode.DEFAULT);
            sb.append(String.valueOf(i));
            i2++;
            i3++;
        } while (i2 < 12);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    @Override // X.InterfaceC80833Ff
    public final String LIZIZ(String str) {
        int LIZJ;
        if (C78840Uwu.LJJ(str) || (LIZJ = LIZJ(str)) < 0 || LIZJ >= this.LIZIZ + 1) {
            return "#";
        }
        String label = this.LIZ.getBucket(LIZJ).getLabel();
        o.LJIIIIZZ(label, "mAlphabeticIndex.getBucket(bucketIndex).label");
        return label;
    }

    public int LIZJ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        try {
            int bucketIndex = this.LIZ.getBucketIndex(str);
            if (this.LIZ.getBucket(bucketIndex).getLabelType() != AlphabeticIndex.Bucket.LabelType.NORMAL) {
                return -1;
            }
            return bucketIndex;
        } catch (ArrayIndexOutOfBoundsException e) {
            C34B.LJFF(e);
            return -1;
        }
    }

    public int LIZLLL(int i, String name) {
        o.LJIIIZ(name, "name");
        String substring = name.substring(i, i + 1);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        int LIZJ = LIZJ(substring);
        if (LIZJ == -1) {
            char charAt = name.charAt(i);
            if (Character.isUpperCase(charAt)) {
                return ((this.LIZIZ + 1) + charAt) - 65;
            }
            if (Character.isLowerCase(charAt)) {
                return (((this.LIZIZ + 1) + charAt) - 97) + 26;
            }
            if (Character.isDigit(charAt)) {
                return (((this.LIZIZ + 1) + charAt) - 48) + 52;
            }
            if (C78840Uwu.LJJII(charAt)) {
                return this.LIZIZ + 1 + 62;
            }
            String substring2 = name.substring(i);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            if (C78840Uwu.LJJ(substring2)) {
                return 99;
            }
            return this.LIZIZ + 1 + 63;
        }
        return LIZJ;
    }
}
