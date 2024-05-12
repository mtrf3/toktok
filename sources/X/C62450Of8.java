package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: X.Of8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62450Of8 implements Comparator<InterfaceC62486Ofi> {
    public final ArrayList<String> LJLIL;

    public C62450Of8(boolean z) {
        ArrayList<String> arrayList;
        if (z) {
            arrayList = C62433Oer.LJIILLIIL;
        } else {
            arrayList = C62433Oer.LJIIZILJ;
        }
        this.LJLIL = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC62486Ofi interfaceC62486Ofi, InterfaceC62486Ofi interfaceC62486Ofi2) {
        int i;
        InterfaceC62486Ofi interfaceC62486Ofi3 = interfaceC62486Ofi;
        InterfaceC62486Ofi interfaceC62486Ofi4 = interfaceC62486Ofi2;
        if (interfaceC62486Ofi3 == null) {
            return -1;
        }
        if (interfaceC62486Ofi4 == null) {
            return 1;
        }
        ArrayList<String> arrayList = this.LJLIL;
        int i2 = 0;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        String key = interfaceC62486Ofi3.key();
        ArrayList<String> arrayList2 = this.LJLIL;
        int size = arrayList2.size();
        int i3 = 0;
        while (true) {
            i = 1000;
            if (i3 < size) {
                if (TextUtils.equals((CharSequence) ListProtector.get(arrayList2, i3), key)) {
                    break;
                }
                i3++;
            } else {
                i3 = 1000;
                break;
            }
        }
        String key2 = interfaceC62486Ofi4.key();
        ArrayList<String> arrayList3 = this.LJLIL;
        int size2 = arrayList3.size();
        while (true) {
            if (i2 >= size2) {
                break;
            }
            if (TextUtils.equals((CharSequence) ListProtector.get(arrayList3, i2), key2)) {
                i = i2;
                break;
            }
            i2++;
        }
        return i3 - i;
    }
}
