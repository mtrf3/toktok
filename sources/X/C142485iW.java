package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5iW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142485iW {
    public final List<TextStickerTextWrap> LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectTextChangeInfo(textWrapList=");
        LIZ.append(this.LIZ);
        LIZ.append(", effectTextId=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C142485iW)) {
            return false;
        }
        C142485iW c142485iW = (C142485iW) obj;
        if (o.LJ(c142485iW.LIZIZ, this.LIZIZ)) {
            List<TextStickerTextWrap> list = c142485iW.LIZ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<TextStickerTextWrap> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().safeStrPair());
            }
            List<TextStickerTextWrap> list2 = this.LIZ;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<TextStickerTextWrap> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().safeStrPair());
            }
            if (o.LJ(arrayList, arrayList2)) {
                return true;
            }
        }
        return false;
    }

    public C142485iW(List<TextStickerTextWrap> textWrapList, String str) {
        o.LJIIIZ(textWrapList, "textWrapList");
        this.LIZ = textWrapList;
        this.LIZIZ = str;
    }
}
