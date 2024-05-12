package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Gg4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42124Gg4 {
    public static final int LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
    public static final int LIZIZ = C7MY.LIZIZ(132);
    public static final ConcurrentHashMap<Integer, OSJ<View, TextView, Integer>> LIZJ = new ConcurrentHashMap<>();

    public static String LIZ(Context context) {
        String string;
        if (context == null || (string = context.getString(R.string.qbb)) == null) {
            String LJFF = C86V.LJFF(R.string.qbb);
            o.LJIIIIZZ(LJFF, "getString(R.string.search)");
            return LJFF;
        }
        return string;
    }

    public static void LIZIZ(Context context) {
        List LJJIJ;
        if (SearchServiceImpl.LLLZI().LJJJI()) {
            return;
        }
        int i = LIZIZ;
        int i2 = LIZ;
        int i3 = i + i2;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(62);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)) + ((int) tuxTextView.getPaint().measureText(LIZ(context))) + i2 + 10;
        if (SearchServiceImpl.LLLZI().LJJIIJ()) {
            List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(LJJIIZ));
            o.LJIIIZ(LJJIJIIJI, "<this>");
            LJJIJ = ORZ.LLILII(C32064CiC.LJLIL, LJJIJIIJI);
        } else {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(LJJIIZ));
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJ, 10));
        Iterator it = LJJIJ.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it.next()).intValue() - LIZ));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Number) next).intValue() > 0) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            int intValue = ((Number) it3.next()).intValue();
            LIZJ.put(Integer.valueOf(intValue), LL8.LJ(intValue, context));
        }
    }
}
